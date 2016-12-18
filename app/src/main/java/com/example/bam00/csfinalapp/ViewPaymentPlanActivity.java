package com.example.bam00.csfinalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ViewPaymentPlanActivity extends Activity {

    private Map<String, GroupInfo> payments = new LinkedHashMap<>();
    private ArrayList<GroupInfo> amountList = new ArrayList<>();
    private CustomAdapter listAdapter;
    private ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_payment_plan);

        double totalMonthlyPay = 0;
        PaymentsDB db = new PaymentsDB(this);
        List<Payment> allPayments = db.getAllPayments();
        Collections.sort(allPayments, new Comparator<Payment>() {
            @Override
            public int compare(Payment p1, Payment p2) {
                if (p1.getLoanAmount() > p2.getLoanAmount())
                    return 1;
                else if (p1.getLoanAmount() < p2.getLoanAmount())
                    return -1;
                else
                    return 0;
            }
        });
        for (Payment payment : allPayments) {
            String log = "Loan Amount: " + payment.getLoanAmount()
                    + ", Interest Rate: " + payment.getInterestRate()
                    + ", Loan Term: " + payment.getLoanTerm();
            Log.d("Payment: ", log);
        }

        for (Payment payment : allPayments) {
            Double loanAmount = payment.getLoanAmount();
            Double interestRate = (payment.getInterestRate() / 100);
            Double loanTerm = payment.getLoanTerm();
            double monthlyRate = interestRate / 12.0;
            double termInMonths = loanTerm * 12;

            double monthlyPay = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));
            Log.d("Monthly Payment: ", String.format("%.2f", monthlyPay));
            totalMonthlyPay = totalMonthlyPay + (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));
        }

        Log.d("Total Monthly Pay: ", String.format("%.2f", totalMonthlyPay));
        TextView monthly = (TextView) findViewById(R.id.viewPaymentMonthlyPaymentAmountTextView);
        monthly.setText(String.format("%.2f", totalMonthlyPay));

        List<String> paymentArray = new ArrayList<>();
        Collections.sort(allPayments, new Comparator<Payment>() {
            @Override
            public int compare(Payment p1, Payment p2) {
                if (p1.getLoanAmount() > p2.getLoanAmount())
                    return 1;
                else if (p1.getLoanAmount() < p2.getLoanAmount())
                    return -1;
                else
                    return 0;
            }
        });
        for (Payment payment : allPayments) {
            paymentArray.add(String.format("%.2f", payment.getLoanAmount()));
            paymentArray.add(String.format("%.2f", payment.getInterestRate()));
            paymentArray.add(String.format("%.2f", payment.getLoanTerm()));
        }

        //Add data for displaying in expandable list view
        loadData();

        //Get reference of the ExpandableListView
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);

        //Create the adapter by passing ArrayList data
        listAdapter = new CustomAdapter(ViewPaymentPlanActivity.this, amountList);

        //Attach the adapter to the expandable list view
        expandableListView.setAdapter(listAdapter);

        //Show listView as collapsed
        collapseAll();


        //Following comments for onClickListeners
        /*setOnChildClickListener listener for child row click
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //get the group header
                GroupInfo headerInfo = amountList.get(groupPosition);
                //get the child info
                ChildInfo detailInfo =  headerInfo.getProductList().get(childPosition);
                //display it or do something with it
                Toast.makeText(getBaseContext(), " Clicked on :: " + headerInfo.getInterestRate()
                        + "/" + detailInfo.getInterestRate(), Toast.LENGTH_LONG).show();
                return false;
            }
        });

        setOnGroupClickListener listener for group heading click
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                //get the group header
                GroupInfo headerInfo = amountList.get(groupPosition);
                //display it or do something with it
                Toast.makeText(getBaseContext(), " Header is :: " + headerInfo.getInterestRate(),
                        Toast.LENGTH_LONG).show();

                return false;
            }
        });*/


    }

    //Method to expand parent listView
    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++) {
            expandableListView.expandGroup(i);
        }
    }

    //Method to collapse parent listView
    private void collapseAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++) {
            expandableListView.collapseGroup(i);
        }
    }

    //Load the added data
    private void loadData() {
        PaymentsDB db = new PaymentsDB(this);
        List<Payment> allPayments = db.getAllPayments();

        //Sort the parent listView
        Collections.sort(allPayments, new Comparator<Payment>() {
            @Override
            public int compare(Payment p1, Payment p2) {
                if (p1.getLoanAmount() > p2.getLoanAmount())
                    return 1;
                else if (p1.getLoanAmount() < p2.getLoanAmount())
                    return -1;
                else
                    return 0;
            }
        });
        for (Payment payment : allPayments) {
            addPayment(String.format("$%.2f", payment.getLoanAmount()), String.format("%.2f", payment.getInterestRate()),
                    String.format("%.2f yrs", payment.getLoanTerm()));
        }

    }

    private int addPayment(String amount, String interestRate, String term) {
        PaymentsDB db = new PaymentsDB(this);
        List<Payment> allPayments = db.getAllPayments();
        int groupPosition = 0;

        GroupInfo headerInfo;
        headerInfo = new GroupInfo();
        headerInfo.setAmount(amount);
        payments.put(amount, headerInfo);
        amountList.add(headerInfo);

        //Get the children listView
        ArrayList<ChildInfo> paymentList = headerInfo.getProductList();
        //Size of the children listView
        int listSize = paymentList.size();
        //Add to the counter
        listSize++;

        //Create a new child & add it to the group
        for (Payment payment : allPayments) {
            List<String> paymentArray = new ArrayList<>();
            ChildInfo detailInfo = new ChildInfo();

            paymentArray.add(String.format("Loan Amount: " + "%.2f", payment.getLoanAmount()));
            paymentArray.add(String.format("Interest Rate: " + "%.2f", payment.getInterestRate()));
            paymentArray.add(String.format("Loan Term: " + "%.2f", payment.getLoanTerm()));

            detailInfo.setAmount(paymentArray.get(0));
            detailInfo.setInterestRate(paymentArray.get(1));
            detailInfo.setTerm(paymentArray.get(2));

            paymentList.add(detailInfo);
        }

        //Sort the children listView
        headerInfo.setProductList(paymentList);
        Collections.sort(paymentList, new Comparator<ChildInfo>() {
            @Override
            public int compare(ChildInfo c1, ChildInfo c2) {
                return c1.getAmount().compareTo(c2.getAmount());
            }
        });

        //Find the group position inside the list
        groupPosition = amountList.indexOf(headerInfo);
        return groupPosition;
    }


    ////////onClick Methods////////////

    public void addPayment(View view) {
        Intent intent = new Intent(this, AddPaymentActivity.class);
        startActivity(intent);
    }

    public void manage(View view) {
        Intent intent = new Intent(this, ManageDebtActivity.class);
        startActivity(intent);
    }
}
