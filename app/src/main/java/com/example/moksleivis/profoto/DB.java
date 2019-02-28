package com.example.moksleivis.profoto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class DB {

    public String sendPostRequest(String requestURL,
                                  HashMap<String, String> postDataParams){

        URL url;
        String response = "";
        try {
            url = new URL(requestURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(15000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("POST");

            conn.setRequestProperty("Cookies","_test=7a4d917e220fbf9a55cab3046bd1a3b7;expires=2038m.sausio 1 d.,penktadienis 01:55:55;path=/");
            conn.setDoInput(true);
            conn.setDoOutput(true);

            OutputStream os = conn.getOutputStream();
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(os, "UTF-8"));
            writer.write(getPostDataString(postDataParams));

            writer.flush();
            writer.close();
            os.close();
            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                response = br.readLine();
            }   else{
                    response = "Error Registering" +String.valueOf(responseCode);
                }

            } catch (Exception e){
                e.printStackTrace();
            }

            return response;
        }

        private String getPostDataString(HashMap<String, String> params) throws
        UnsupportedEncodingException {
            StringBuilder result = new StringBuilder();
            boolean first= true;
            for (Map.Entry<String, String> entry : params.entrySet()){
                if (first)
                    first = false;
                result.append("&");

                result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(),"UTF-8"));

            }

               return result.toString();



        }
    }





