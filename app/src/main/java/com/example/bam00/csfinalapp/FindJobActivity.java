package com.example.bam00.csfinalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class FindJobActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_job);

        ImageButton indeedButton = (ImageButton) findViewById(R.id.indeedImageButton);
        indeedButton.setOnClickListener(this);

        ImageButton monsterButton = (ImageButton)findViewById(R.id.monsterImageButton);
        monsterButton.setOnClickListener(this);

        ImageButton cbButton = (ImageButton)findViewById(R.id.careerbuilderImageButton);
        cbButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Uri uri;
        Intent intent;
        switch (v.getId()) {
            case R.id.indeedImageButton:
                uri = Uri.parse("http://www.indeed.com/");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.monsterImageButton:
                uri = Uri.parse("http://www.monster.com/");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.careerbuilderImageButton:
                uri = Uri.parse("http://www.careerbuilder.com/");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
        }
    }

    //JobCategory Category Spinner Adapter, OnClickListener
        /*final String[] jobCategories = getResources().getStringArray(R.array.findJobJobCategories);
        Spinner categorySpinner = (Spinner)findViewById(R.id.findJobJobCategorySpinner);
        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, jobCategories);
        categorySpinner.setAdapter(categoryAdapter);
        categorySpinner.setOnItemSelectedListener(new JobCategoriesSpinnerClass());
    }

    //Class for Categories of Jobs
    /*class JobCategoriesSpinnerClass implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1,
                                   int arg2, long arg3) {
            final String[] jobCategories = getResources().getStringArray(R.array.findJobJobCategories);
            int categoryIndex = arg0.getSelectedItemPosition();

            if(categoryIndex == 0) {
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            } else if(categoryIndex == 1) {
                final String[] managementJobs = getResources().getStringArray(R.array.managementJobs);
                Spinner jobSpinner = (Spinner)findViewById(R.id.findJobJobSpinner);
                ArrayAdapter<String> managementJobsAdapter = new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, managementJobs);
                jobSpinner.setAdapter(managementJobsAdapter);
                jobSpinner.setOnItemSelectedListener(new ManagementJobsSpinnerClass());
            } else if(categoryIndex == 2) {
                final String[] b_fJobs = getResources().getStringArray(R.array.b_fJobs);
                Spinner jobSpinner = (Spinner)findViewById(R.id.findJobJobSpinner);
                ArrayAdapter<String> b_fJobsAdapter = new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, b_fJobs);
                jobSpinner.setAdapter(b_fJobsAdapter);
                jobSpinner.setOnItemSelectedListener(new B_FJobsSpinnerClass());
            } else if(categoryIndex == 3) {
                final String[] comp_mathJobs = getResources().getStringArray(R.array.comp_mathJobs);
                Spinner jobSpinner = (Spinner)findViewById(R.id.findJobJobSpinner);
                ArrayAdapter<String> comp_mathJobsAdapter = new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, comp_mathJobs);
                jobSpinner.setAdapter(comp_mathJobsAdapter);
                jobSpinner.setOnItemSelectedListener(new Comp_MathJobsSpinnerClass());
            } else if(categoryIndex == 4) {
                final String[] architect_engJobs = getResources().getStringArray(R.array.architect_engJobs);
                Spinner jobSpinner = (Spinner)findViewById(R.id.findJobJobSpinner);
                ArrayAdapter<String> architect_engJobsAdapter = new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, architect_engJobs);
                jobSpinner.setAdapter(architect_engJobsAdapter);
                jobSpinner.setOnItemSelectedListener(new Architect_EngJobsSpinnerClass());
            }
            if(categoryIndex == 5) {
                final String[] life_physical_socialScienceJobs = getResources().getStringArray(R.array.life_physical_socialScienceJobs);
                Spinner jobSpinner = (Spinner)findViewById(R.id.findJobJobSpinner);
                ArrayAdapter<String> life_physical_socialScienceJobsAdapter = new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, life_physical_socialScienceJobs);
                jobSpinner.setAdapter(life_physical_socialScienceJobsAdapter);
                jobSpinner.setOnItemSelectedListener(new Life_Physical_SocialScienceJobsSpinnerClass());
            }
            if(categoryIndex == 6) {
                final String[] comm_socialServiceJobs = getResources().getStringArray(R.array.comm_socialServiceJobs);
                Spinner jobSpinner = (Spinner)findViewById(R.id.findJobJobSpinner);
                ArrayAdapter<String> comm_socialServiceJobsAdapter = new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, comm_socialServiceJobs);
                jobSpinner.setAdapter(comm_socialServiceJobsAdapter);
                jobSpinner.setOnItemSelectedListener(new Comm_SocialServiceJobsSpinnerClass());
            }
            if(categoryIndex == 7)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 8)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 9)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 10)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 11)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 12)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 13)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 14)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 15)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 16)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 17)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 18)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 19)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 20)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 21)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
            if(categoryIndex == 22)
                Toast.makeText(arg1.getContext(), "You have selected: " + jobCategories[categoryIndex], Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {

        }
    }*/

    //Classes for each JobCategory Category
    /*class ManagementJobsSpinnerClass implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1,
                                   int arg2, long arg3) {
            final String[] managementJobs = getResources().getStringArray(R.array.managementJobs);
            int managementJobsIndex = arg0.getSelectedItemPosition();

            if(managementJobsIndex == 0) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 1) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 2) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 3) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 4) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 5) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 6) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 7) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 8) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 9) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 10) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 11) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 12) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 13) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 14) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 15) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 16) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 17) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 18) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 19) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 20) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 21) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 22) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 23) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 24) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 25) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 26) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 27) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 28) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 29) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 30) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 31) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 32) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(managementJobsIndex == 33) {
                Toast.makeText(arg1.getContext(), "You have selected: " + managementJobs[managementJobsIndex], Toast.LENGTH_SHORT).show();
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {

        }
    }

    class B_FJobsSpinnerClass implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1,
                                   int arg2, long arg3) {
            final String[] b_fJobs = getResources().getStringArray(R.array.b_fJobs);
            int b_fJobsIndex = arg0.getSelectedItemPosition();

            if(b_fJobsIndex == 0) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 1) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 2) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 3) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 4) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 5) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 6) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 7) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 8) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 9) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 10) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 11) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 12) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 13) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 14) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 15) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 16) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 17) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 18) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 19) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 20) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 21) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 22) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 23) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 24) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 25) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 26) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 27) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 28) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 29) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 30) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(b_fJobsIndex == 31) {
                Toast.makeText(arg1.getContext(), "You have selected: " + b_fJobs[b_fJobsIndex], Toast.LENGTH_SHORT).show();
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {

        }
    }

    class Comp_MathJobsSpinnerClass implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1,
                                   int arg2, long arg3) {
            final String[] comp_mathJobs = getResources().getStringArray(R.array.comp_mathJobs);
            int comp_mathJobsIndex = arg0.getSelectedItemPosition();

            if(comp_mathJobsIndex == 0) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 1) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 2) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 3) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 4) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 5) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 6) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 7) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 8) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 9) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 10) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 11) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 12) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 13) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 14) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 15) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 16) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 17) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comp_mathJobsIndex == 18) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comp_mathJobs[comp_mathJobsIndex], Toast.LENGTH_SHORT).show();
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {

        }
    }

    class Architect_EngJobsSpinnerClass implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1,
                                   int arg2, long arg3) {
            final String[] architect_engJobs = getResources().getStringArray(R.array.architect_engJobs);
            int architect_engJobsIndex = arg0.getSelectedItemPosition();

            if(architect_engJobsIndex == 0) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 1) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 2) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 3) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 4) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 5) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 6) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 7) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 8) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 9) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 10) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 11) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 12) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 13) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 14) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 15) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 16) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 17) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 18) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 19) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 20) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 21) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 22) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 23) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 24) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 25) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 26) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 27) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 28) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 29) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 30) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 31) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 32) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(architect_engJobsIndex == 33) {
                Toast.makeText(arg1.getContext(), "You have selected: " + architect_engJobs[architect_engJobsIndex], Toast.LENGTH_SHORT).show();
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {

        }
    }

    class Life_Physical_SocialScienceJobsSpinnerClass implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1,
                                   int arg2, long arg3) {
            final String[] life_physical_socialScienceJobs = getResources().getStringArray(R.array.life_physical_socialScienceJobs);
            int life_physical_socialScienceJobsIndex = arg0.getSelectedItemPosition();

            if(life_physical_socialScienceJobsIndex == 0) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 1) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 2) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 3) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 4) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 5) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 6) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 7) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 8) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 9) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 10) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 11) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 12) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 13) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 14) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 15) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 16) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 17) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 18) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 19) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 20) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 21) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 22) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 23) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 24) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 25) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 26) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 27) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 28) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 29) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 30) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 31) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 32) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 33) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 34) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 35) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 36) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 37) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 38) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 39) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 40) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 41) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(life_physical_socialScienceJobsIndex == 42) {
                Toast.makeText(arg1.getContext(), "You have selected: " + life_physical_socialScienceJobs[life_physical_socialScienceJobsIndex], Toast.LENGTH_SHORT).show();
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {

        }
    }

    class Comm_SocialServiceJobsSpinnerClass implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1,
                                   int arg2, long arg3) {
            final String[] comm_socialServiceJobs = getResources().getStringArray(R.array.comm_socialServiceJobs);
            int comm_socialServiceJobsIndex = arg0.getSelectedItemPosition();

            if(comm_socialServiceJobsIndex == 0) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 1) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 2) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 3) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 4) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 5) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 6) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 7) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 8) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 9) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 10) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 11) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 12) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 13) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 14) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 15) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 16) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            } else if(comm_socialServiceJobsIndex == 17) {
                Toast.makeText(arg1.getContext(), "You have selected: " + comm_socialServiceJobs[comm_socialServiceJobsIndex], Toast.LENGTH_SHORT).show();
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {

        }
    }*/
}