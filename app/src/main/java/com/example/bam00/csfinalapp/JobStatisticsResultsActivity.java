package com.example.bam00.csfinalapp;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class JobStatisticsResultsActivity extends AppCompatActivity {
    private ProgressDialog dialog;
    private ListView lv;

    //URL to get data JSON
//    private static String url = "http://api.bls.gov/publicAPI/v2/timeseries/data/LAUCN040010000000005";
    ArrayList<HashMap<String, String>> dataList;


//    private static String url = "http://api.bls.gov/publicAPI/v2/timeseries/data/{\"seriesid\":[\"LAUCN040010000000005\", \"LAUCN040010000000006\",\n" +
//            "\"OEUN000000056--5747213213\"], \"registrationKey\":\"059fe78d91484694a38a80f899e609c3\"}";
//    private static String url = "http://api.bls.gov/publicAPI/v2/timeseries/data/{\"seriesid\":[\"LAUCN040010000000005\", \"LAUCN040010000000006\",\n" +
//    "\"OEUN000000056--5747213213\"], \"registrationKey\":\"95c847425ae04c80b89560fcad0adafd\"}";


    /////////////Site may have moved////////////////

    private static String url = "https://data.bls.gov/publicAPI/v2/timeseries/data/CES5000000001";
    //private static String url = "http://api.bls.gov/publicAPI/v2/timeseries/data/CES5000000001";
    //private static String url = "http://api.bls.gov/publicAPI/v2/timeseries/data/WMU00000001020000001511322500";




    /*private Context context;
    private static String url = "http://api.bls.gov/publicAPI/v2/timeseries/data/CES5000000001";

    private static final String YEAR = "year";
    private static final String PERIOD = "period";
    private static final String NAME = "name";
    private static final String VALUE = "value";

    ArrayList<HashMap<String, String>> jsonList = new ArrayList<HashMap<String, String>>();
    ListView listView;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_statistics_results);

        dataList = new ArrayList<>();

        lv = (ListView) findViewById(R.id.jsrListView);

        new GetData().execute();


        //new ProgressTask(JobStatisticsResultsActivity.this).execute();
    }

    //AsyncTask class to get JSON by making HTTP call
    private class GetData extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //Show dialog
            dialog = new ProgressDialog(JobStatisticsResultsActivity.this);
            dialog.setMessage("Getting Data...");
            dialog.setCancelable(false);
            dialog.show();
        }

        @Override
        protected Void doInBackground(Void... arg0) {
            HttpsHandler sh = new HttpsHandler();
            //JSONArray dataArr = new JSONArray();

            //Make request to url and get response
            String jsonStr = sh.makeServiceCall(url);

            /*{"status":"REQUEST_SUCCEEDED","responseTime":30,"message":[],"Results":{
                "series":
                [{"seriesID":"CES5000000001","data":[{"year":"2016","period":"M11","periodName":"November","value":"2768","footnotes":[{"code":"P","text":"preliminary"}]},{"year":"2016","period":"M10","periodName":"October","value":"2778","footnotes":[{"code":"P","text":"preliminary"}]},{"year":"2016","period":"M09","periodName":"September","value":"2781","footnotes":[{}]},{"year":"2016","period":"M08","periodName":"August","value":"2776","footnotes":[{}]},{"year":"2016","period":"M07","periodName":"July","value":"2777","footnotes":[{}]},{"year":"2016","period":"M06","periodName":"June","value":"2782","footnotes":[{}]},{"year":"2016","period":"M05","periodName":"May","value":"2741","footnotes":[{}]},{"year":"2016","period":"M04","periodName":"April","value":"2782","footnotes":[{}]},{"year":"2016","period":"M03","periodName":"March","value":"2782","footnotes":[{}]},{"year":"2016","period":"M02","periodName":"February","value":"2774","footnotes":[{}]},{"year":"2016","period":"M01","periodName":"January","value":"2763","footnotes":[{}]},{"year":"2015","period":"M12","periodName":"December","value":"2763","footnotes":[{}]},{"year":"2015","period":"M11","periodName":"November","value":"2753","footnotes":[{}]},{"year":"2015","period":"M10","periodName":"October","value":"2771","footnotes":[{}]},{"year":"2015","period":"M09","periodName":"September","value":"2766","footnotes":[{}]},{"year":"2015","period":"M08","periodName":"August","value":"2753","footnotes":[{}]},{"year":"2015","period":"M07","periodName":"July","value":"2756","footnotes":[{}]},{"year":"2015","period":"M06","periodName":"June","value":"2751","footnotes":[{}]},{"year":"2015","period":"M05","periodName":"May","value":"2747","footnotes":[{}]},{"year":"2015","period":"M04","periodName":"April","value":"2745","footnotes":[{}]},{"year":"2015","period":"M03","periodName":"March","value":"2735","footnotes":[{}]},{"year":"2015","period":"M02","periodName":"February","value":"2738","footnotes":[{}]},{"year":"2015","period":"M01","periodName":"January","value":"2734","footnotes":[{}]},{"year":"2014","period":"M12","periodName":"December","value":"2733","footnotes":[{}]},{"year":"2014","period":"M11","periodName":"November","value":"2732","footnotes":[{}]},{"year":"2014","period":"M10","periodName":"October","value":"2729","footnotes":[{}]},{"year":"2014","period":"M09","periodName":"September","value":"2735","footnotes":[{}]},{"year":"2014","period":"M08","periodName":"August","value":"2737","footnotes":[{}]},{"year":"2014","period":"M07","periodName":"July","value":"2728","footnotes":[{}]},{"year":"2014","period":"M06","periodName":"June","value":"2723","footnotes":[{}]},{"year":"2014","period":"M05","periodName":"May","value":"2717","footnotes":[{}]},{"year":"2014","period":"M04","periodName":"April","value":"2723","footnotes":[{}]},{"year":"2014","period":"M03","periodName":"March","value":"2724","footnotes":[{}]},{"year":"2014","period":"M02","periodName":"February","value":"2716","footnotes":[{}]},{"year":"2014","period":"M01","periodName":"January","value":"2721","footnotes":[{}]}]}]
            }}*/


//            String jsonStr = "{\"status\":\"REQUEST_SUCCEEDED\", \"responseTime\":\"16\", \"message\": [], \"Results\": [{\"series\": [{\"seriesID\": \"LAUCN040010000000005\", \"data\": [{\"year\": \"2013\", \"period\": \"M11\", \"periodName\": \"November\", \"value\": \"16393\", \"footnotes\": [{\"code\": \"P\", \"text\": \"Preliminary.\"}]}, {\"year\": \"2013\", \"period\": \"M10\", \"periodName\": \"October\", \"value\": \"16536\", \"footnotes\": [{\"code\": \"P\", \"text\": \"Preliminary.\"}]}]}]}]}";
            Log.d("JSRActivity", "\nResponse from url: " + jsonStr);

            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);
                    //Log.d("JSONObject", jsonObj.toString());

                    //Get JSON Array node
                    try {
                        JSONObject results = jsonObj.getJSONObject("Results");
                        //Log.d("JSONObject results", results.toString());

                        JSONArray series = results.getJSONArray("series");
                        //Log.d("JSONArray series", series.toString());

                        JSONObject seriesObject = series.getJSONObject(0);
                        JSONArray dataArr = seriesObject.getJSONArray("data");

                        for (int i = 0; i < dataArr.length(); i++) {

                            JSONObject yearObject = dataArr.getJSONObject(0);
                            String year = yearObject.getString("year");
                            if (year.equals("2016")) {

                                JSONObject monthObject = dataArr.getJSONObject(2);
                                String month = monthObject.getString("periodName");

                                JSONObject valueObject = dataArr.getJSONObject(3);
                                String value = valueObject.getString("value");

                                Log.d("\nData Array", "Year: " + year + ", Month: " + month + ", Value: " + value);
                                //Log.d("Data Array", dataArr.toString());

                                HashMap<String, String> dataMap = new HashMap<>();
                                dataMap.put("year", year);
                                dataMap.put("month", month);
                                dataMap.put("value", value);

                                Log.d("Data Map", dataMap.toString());

                                dataList.add(dataMap);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    //Loop through all data
                    /*for (int i = 0; i < dataArr.length(); i++) {
                        JSONObject c = dataArr.getJSONObject(i);

                        String year = c.getString("year");
                        String period = c.getString("period");
                        String name = c.getString("periodName");
                        String value = c.getString("value");

                        //Temp HashMap for single data
                        HashMap<String, String> data = new HashMap<>();

                        //Add each child node to HashMap key => value
                        data.put("year", year);
                        data.put("period", period);
                        data.put("periodName", name);
                        data.put("value", value);

                        //Add data to dataList
                        dataList.add(data);
                    }*/
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else
                Log.d("\nJSON String", "jsonStr is NULL");

            Log.d("\nData List", dataList.toString());
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            //Dismiss the progress dialog
            if (dialog.isShowing())
                dialog.dismiss();

            //Update parsed JSON data into ListView
            ListAdapter adapter = new SimpleAdapter(JobStatisticsResultsActivity.this, dataList,
                    R.layout.list_item, new String[]{"value", "year", "name"},
                    new int[]{R.id.value, R.id.year, R.id.name});

            lv.setAdapter(adapter);
        }
    }
}









