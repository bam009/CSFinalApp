package com.example.bam00.csfinalapp;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

public class WebRequest {
    String response = "";
    public final static int GETRequest = 1;
    public final static int POSTRequest = 2;

    //Constructor with no parameter
    public WebRequest() {
    }

    public String makeWebServiceCall(String url, int requestmethod) {
        //return this.makeWebServiceCall(url, requestmethod);
        return makeWebServiceCall(url, requestmethod, null);
    }

    /*public String makeWebServiceCall(String url, int requestmethod, null) {
        return this.makeWebServiceCall(url, requestmethod);
    }
*/
    public String makeWebServiceCall(String urladdress, int requestmethod, HashMap<String, String> params) {
        URL url;

        try {
            url = new URL(urladdress);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(15001);
            conn.setConnectTimeout(15001);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            if (requestmethod == POSTRequest) {
                conn.setRequestMethod("POST");
                Log.d("Request Method ", "POST");
            } else if (requestmethod == GETRequest) {
                conn.setRequestMethod("GET");
                Log.d("Request Method ", "GET");
                //conn.connect();
            }

            if (params != null) {
                OutputStream ostream = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ostream, "UTF-8"));
                StringBuilder requestresult = new StringBuilder();
                boolean first = true;
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    if (first)
                        first = false;
                    else {
                        requestresult.append("&");
                        requestresult.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                        requestresult.append("=");
                        requestresult.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    }
                    writer.write(requestresult.toString());

                    writer.flush();
                    writer.close();
                    ostream.close();
                }
                int reqresponseCode = conn.getResponseCode();

                if (reqresponseCode == HttpsURLConnection.HTTP_OK) {
                    String line;
                    BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    while ((line = br.readLine()) != null) {
                        response += line;
                    }
                } else
                    response = "";
            }

        } catch (MalformedURLException e) {
            Log.d("WRClass ", "MalformedURLException");
            e.printStackTrace();
        } catch (IOException e) {
            Log.d("WRClass ", "IOException");
            e.printStackTrace();
        }

        Log.d("RESPONSE ", response);
        return response;
    }
}
