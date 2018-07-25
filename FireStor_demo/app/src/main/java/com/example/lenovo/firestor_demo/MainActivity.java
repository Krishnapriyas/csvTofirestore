package com.example.lenovo.firestor_demo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        readDocData();
        
       //  List<DocSample>DocSamples = new ArrayList<>();
     // Map<String, String> user = new HashMap<>();

      /*user.put("first", "Alan");
        homeo_list.put("middle", "Mathison");
        ayurveda_list.put("last", "Turing");
        mbbs_list.put("born", "1912");

        db.collection("users").add(user);

       db.collection("ayurveda_list").add(ayurveda_list);
        db.collection("mbbs_list").add(mbbs_list);
*/


    }
    FirebaseFirestore db = FirebaseFirestore.getInstance();
  //  Map<String, Object> homeoList = new HashMap<>();
    Map<String, Object> mbbsList = new HashMap<>();
   // Map<String, Object> mbbsList = new HashMap<>();
   DocSample sample = new DocSample();
    List<DocSample>DocSamples = new ArrayList<>();
    private void readDocData() {

        // Read the raw csv file

        InputStream is = getResources().openRawResource(R.raw.mbbs_csv);
 /*       InputStream ij = getResources().openRawResource(R.raw.homeo_list);
        Scanner scanner = new Scanner(ij);
        StringBuilder builder = new StringBuilder();
        while(scanner.hasNextLine()){
            builder.append(scanner.nextLine());
        }
        parseJson(builder.toString());
*/
        // Reads text from character-input stream, buffering characters for efficient reading
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );


        // Initialization
        String line = "";

        // Initialization
        try {
            // Step over headers
            reader.readLine();

            // If buffer is not empty
            while ((line = reader.readLine()) != null) {
                Log.d("MyActivity", "Line: " + line);
                // use comma as separator columns of CSV
                String[] tokens = line.split(",");
                // Read the data
                // DocSample sample = new DocSample();

                // Setters
                sample.setSL_NO(Integer.parseInt(tokens[0]));
                sample.setSERIAL_NO(Integer.parseInt(tokens[1]));
                sample.setREG_NO(Integer.parseInt(tokens[2]));

                sample.setNAME(tokens[3]);
                sample.setNAME_OF_FATHER(tokens[4]);
                sample.setDOB(tokens[5]);

                sample.setQUALIFICATION(tokens[6]);

                sample.setREG_DATE(tokens[7]);

                sample.setADDRESS(tokens[8]);

              //  sample.setDISTRICT(tokens[9]);
              //  sample.setSTATE(tokens[10]);
                if (tokens.length >= 10 && tokens[9].length() > 0) {
                    sample.setREMARK(tokens[9]);
                } else {
                    sample.setREMARK("N/A");
                }

                // Adding object to a class
                DocSamples.add(sample);

                mbbsList.put("SL NO",sample.getSL_NO());
                mbbsList.put("SERIAL NO",sample.getSERIAL_NO());
                mbbsList.put("REG NO",sample.getREG_NO());
                mbbsList.put("NAME",sample.getNAME());
                mbbsList.put("NAME OF FATHER",sample.getNAME_OF_FATHER());
                mbbsList.put("DOB",sample.getDOB());
                mbbsList.put("QUALIFICATION",sample.getQUALIFICATION());
                mbbsList.put("REG DATE",sample.getREG_DATE());
                mbbsList.put("ADDRESS",sample.getADDRESS());
             //   homeoList.put("DISTRICT",sample.getDISTRICT());
              //  homeoList.put("STATE",sample.getSTATE());
                    mbbsList.put("REMARK",sample.getREMARK());

                db.collection("mbbsList").add(mbbsList);
                // Log the object
                Log.d("My Activity", "Just created it: " + sample);


            }
        }catch (IOException e) {
            // Logs error with priority level
            Log.wtf("MyActivity", "Error reading data file on line" + line, e);

            // Prints throwable details
            e.printStackTrace();
        }







    }
/*
    private void parseJson(String s) {
        StringBuilder builder = new StringBuilder();
        try {
            JSONObject doc = new JSONObject(s);
            sample.setSL_NO(Integer.parseInt(doc.getString("FIELD1")));
            sample.setSERIAL_NO(Integer.parseInt(doc.getString("FIELD2")));
            sample.setREG_NO(Integer.parseInt(doc.getString("FIELD3")));

            sample.setNAME(doc.getString("FIELD4"));
            sample.setNAME_OF_FATHER(doc.getString("FIELD5"));
            sample.setDOB(doc.getString("FIELD6"));

            sample.setQUALIFICATION(doc.getString("FIELD7"));

            sample.setREG_DATE(doc.getString("FIELD8"));

            sample.setADDRESS(doc.getString("FIELD9"));

            sample.setDISTRICT(doc.getString("FIELD10"));
            sample.setSTATE(doc.getString("FIELD11"));
            if (doc.getString("FIELD12").length() >0 ) {
                sample.setREMARK(doc.getString("FIELD12"));
            } else {
                sample.setREMARK("N/A");
            }

            // Adding object to a class
            DocSamples.add(sample);

            ayurvedaList.put("SL NO",sample.getSL_NO());
            ayurvedaList.put("SERIAL NO",sample.getSERIAL_NO());
            ayurvedaList.put("REG NO",sample.getREG_NO());
            ayurvedaList.put("NAME",sample.getNAME());
            ayurvedaList.put("NAME OF FATHER",sample.getNAME_OF_FATHER());
            ayurvedaList.put("DOB",sample.getDOB());
            ayurvedaList.put("QUALIFICATION",sample.getQUALIFICATION());
            ayurvedaList.put("REG DATE",sample.getREG_DATE());
            ayurvedaList.put("ADDRESS",sample.getADDRESS());
            ayurvedaList.put("DISTRICT",sample.getDISTRICT());
            ayurvedaList.put("STATE",sample.getSTATE());
            ayurvedaList.put("REMARK",sample.getREMARK());

            db.collection("ayurvedaList").add(ayurvedaList);
            Log.d("My Activity", "Just created it: " + sample);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
*/
}
