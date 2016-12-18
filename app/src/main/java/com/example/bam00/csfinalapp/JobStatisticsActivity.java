package com.example.bam00.csfinalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class JobStatisticsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_statistics);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.jobStatisticsJobCategories));
        Spinner catSpin = (Spinner) findViewById(R.id.jobStatisticsJobCategorySpinner);
        catSpin.setAdapter(adapter);
        catSpin.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getSelectedItemPosition()) {
            case 0:
                ArrayAdapter<String> managementAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.managementJobs));
                Spinner mgnJobSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                mgnJobSpin.setAdapter(managementAdapter);
                mgnJobSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 1:
                ArrayAdapter<String> b_fAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.b_fJobs));
                Spinner b_fJobSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                b_fJobSpin.setAdapter(b_fAdapter);
                b_fJobSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 2:
                ArrayAdapter<String> comp_mathAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.comp_mathJobs));
                Spinner comp_mathJobSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                comp_mathJobSpin.setAdapter(comp_mathAdapter);
                comp_mathJobSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {}
                });
                break;
            case 3:
                ArrayAdapter<String> architect_engAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.architect_engJobs));
                Spinner architectEngJobSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                architectEngJobSpin.setAdapter(architect_engAdapter);
                architectEngJobSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 4:
                ArrayAdapter<String> lifePhysSocialScienceAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.life_physical_socialScienceJobs));
                Spinner lifePhysJobSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                lifePhysJobSpin.setAdapter(lifePhysSocialScienceAdapter);
                lifePhysJobSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 5:
                ArrayAdapter<String> commSocialServiceAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.comm_socialServiceJobs));
                Spinner commSocialServiceSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                commSocialServiceSpin.setAdapter(commSocialServiceAdapter);
                commSocialServiceSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 6:
                ArrayAdapter<String> legalAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.legalJobs));
                Spinner legalSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                legalSpin.setAdapter(legalAdapter);
                legalSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 7:
                ArrayAdapter<String> educationTrainingLibAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.education_training_libraryJobs));
                Spinner educationTrainLibSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                educationTrainLibSpin.setAdapter(educationTrainingLibAdapter);
                educationTrainLibSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 8:
                ArrayAdapter<String> artDesignEntAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.arts_design_entertainment_sports_mediaJobs));
                Spinner artDesignEntSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                artDesignEntSpin.setAdapter(artDesignEntAdapter);
                artDesignEntSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 9:
                ArrayAdapter<String> healthcarePractAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.healthcarePracticioners_techJobs));
                Spinner healthcarePractSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                healthcarePractSpin.setAdapter(healthcarePractAdapter);
                healthcarePractSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 10:
                ArrayAdapter<String> healthcareSupportAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.healthcareSupportJobs));
                Spinner healthcareSupportSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                healthcareSupportSpin.setAdapter(healthcareSupportAdapter);
                healthcareSupportSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 11:
                ArrayAdapter<String> protectiveServiceAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.protectiveServiceJobs));
                Spinner protectiveServiceSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                protectiveServiceSpin.setAdapter(protectiveServiceAdapter);
                protectiveServiceSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 12:
                ArrayAdapter<String> foodPrepAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.foodPrep_servingJobs));
                Spinner foodPrepSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                foodPrepSpin.setAdapter(foodPrepAdapter);
                foodPrepSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 13:
                ArrayAdapter<String> buildingGroundsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.building_groundsCleaningJobs));
                Spinner buildingGroundsSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                buildingGroundsSpin.setAdapter(buildingGroundsAdapter);
                buildingGroundsSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 14:
                ArrayAdapter<String> personalCareAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.personalCareJobs));
                Spinner personalCareSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                personalCareSpin.setAdapter(personalCareAdapter);
                personalCareSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 15:
                ArrayAdapter<String> salesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.sales_relatedJobs));
                Spinner salesSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                salesSpin.setAdapter(salesAdapter);
                salesSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 16:
                ArrayAdapter<String> adminSupportAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.office_adminSupportJobs));
                Spinner adminSupportSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                adminSupportSpin.setAdapter(adminSupportAdapter);
                adminSupportSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 17:
                ArrayAdapter<String> farmFishForestAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.farming_fishing_forestryJobs));
                Spinner farmFishForestSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                farmFishForestSpin.setAdapter(farmFishForestAdapter);
                farmFishForestSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 18:
                ArrayAdapter<String> constructExtractAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.construction_extractionJobs));
                Spinner constructExtractSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                constructExtractSpin.setAdapter(constructExtractAdapter);
                constructExtractSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 19:
                ArrayAdapter<String> installMaintainAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.install_maintain_repairJobs));
                Spinner installMaintainSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                installMaintainSpin.setAdapter(installMaintainAdapter);
                installMaintainSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 20:
                ArrayAdapter<String> productionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.productionJobs));
                Spinner productionSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                productionSpin.setAdapter(productionAdapter);
                productionSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 21:
                ArrayAdapter<String> transportAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.transport_materialMovingJobs));
                Spinner transportSpin = (Spinner) findViewById(R.id.jobStatisticsJobSpinner);
                transportSpin.setAdapter(transportAdapter);
                transportSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }



    public void jobStatisticsResults(View view) {
        Intent intent = new Intent(this, JobStatisticsResultsActivity.class);
        startActivity(intent);
    }

    public void home(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }

    //Classes for each JobCategory Category
    class ManagementJobsSpinnerClass implements AdapterView.OnItemSelectedListener {
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

    /*
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
