package com.example.bam00.csfinalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseExpandableListAdapter{
    private Context context;
    private ArrayList<GroupInfo> amountList;

    public CustomAdapter(Context context, ArrayList<GroupInfo> amountList) {
        this.context = context;
        this.amountList = amountList;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<ChildInfo> paymentList = amountList.get(groupPosition).getProductList();
        return paymentList.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View view, ViewGroup parent) {
        ChildInfo detailInfo = (ChildInfo) getChild(groupPosition, childPosition);
        if(view == null) {
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = infalInflater.inflate(R.layout.child_items, null);
        }

        TextView amount = (TextView) view.findViewById(R.id.amount);
        amount.setText(detailInfo.getAmount().trim());
        TextView interestRate = (TextView) view.findViewById(R.id.interestRate);
        interestRate.setText(detailInfo.getInterestRate().trim());
        TextView term = (TextView) view.findViewById(R.id.term);
        term.setText(detailInfo.getTerm().trim());

        return view;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        ArrayList<ChildInfo> paymentList = amountList.get(groupPosition).getProductList();
        return paymentList.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return amountList.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return amountList.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isLastChild, View view, ViewGroup parent) {
        GroupInfo headerInfo = (GroupInfo) getGroup(groupPosition);
        if(view == null) {
            LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inf.inflate(R.layout.group_items, null);
        }

        TextView heading = (TextView) view.findViewById(R.id.heading);
        heading.setText(headerInfo.getAmount().trim());

        return view;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}