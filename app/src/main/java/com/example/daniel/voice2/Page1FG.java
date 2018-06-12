package com.example.daniel.voice2;

import android.Manifest;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class Page1FG extends Fragment {

    private Button mbtn1, mbtn2,mbtn3, mbtn4, mbtn5, mbtn6, mbtn7, mbtn8, mbtn9, mbtn10, mbtn11, mbtn12, mbtn13, mbtn14, mbtn15, mbtn16;
    private Button mbtnDelete;
    private SpeechRecognizer mSpeechRecognizer;
    private android.content.Intent mSpeechRecognizerIntent;
    private ArrayList<String> matches;
    private String TAG="Page1";
    private String getMessage, getMessagefromSP1, getMessagefromSP2, getMessagefromSP3, getMessagefromSP4, getMessagefromSP5, getMessagefromSP6, getMessagefromSP7, getMessagefromSP8, getMessagefromSP9,
                               getMessagefromSP10, getMessagefromSP11, getMessagefromSP12, getMessagefromSP13, getMessagefromSP14, getMessagefromSP15, getMessagefromSP16;
    private long startTime=0;
    private long endTime=0;
    private SharedPreferences saveUserID;
    private static final String data = "DATA";
    private int clickCount = 0;
    private long StartTime;
    private long duration;
    private long test;
    final Handler handler = new Handler();


    public static Fragment newInstance(){
        Page1FG fragment = new Page1FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveUserID=getActivity().getSharedPreferences(data,0);

        mSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(getActivity());
        mSpeechRecognizerIntent = new android.content.Intent(android.speech.RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        mSpeechRecognizerIntent.putExtra(android.speech.RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                android.speech.RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        mSpeechRecognizerIntent.putExtra(android.speech.RecognizerIntent.EXTRA_LANGUAGE,
                java.util.Locale.getDefault());
        mSpeechRecognizer.setRecognitionListener(new android.speech.RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle bundle) {

            }

            @Override
            public void onBeginningOfSpeech() {

            }

            @Override
            public void onRmsChanged(float v) {

            }

            @Override
            public void onBufferReceived(byte[] bytes) {

            }

            @Override
            public void onEndOfSpeech() {
            }


            @Override
            public void onError(int i) {

            }

            @Override
            public void onResults(Bundle bundle) {
                matches = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        getMessage=matches.get(0);
                        if(getMessage!=null && mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText(getMessage);
                            saveUserID.edit().putString("save1", getMessage).commit();
                        }else if(getMessage!=null && mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText(getMessage);
                            saveUserID.edit().putString("save2", getMessage).commit();
                        }else if(getMessage!=null && mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText(getMessage);
                            saveUserID.edit().putString("save3", getMessage).commit();
                        }else if(getMessage!=null && mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText(getMessage);
                            saveUserID.edit().putString("save4", getMessage).commit();
                        }else if(getMessage!=null && mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText(getMessage);
                            saveUserID.edit().putString("save5", getMessage).commit();
                        }else if(getMessage!=null && mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText(getMessage);
                            saveUserID.edit().putString("save6", getMessage).commit();
                        }else if(getMessage!=null && mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText(getMessage);
                            saveUserID.edit().putString("save7", getMessage).commit();
                        }else if(getMessage!=null && mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText(getMessage);
                            saveUserID.edit().putString("save8", getMessage).commit();
                        }else if(getMessage!=null && mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText(getMessage);
                            saveUserID.edit().putString("save9", getMessage).commit();
                        }else if(getMessage!=null && mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText(getMessage);
                            saveUserID.edit().putString("save10", getMessage).commit();
                        }else if(getMessage!=null && mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText(getMessage);
                            saveUserID.edit().putString("save11", getMessage).commit();
                        }else if(getMessage!=null && mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText(getMessage);
                            saveUserID.edit().putString("save12", getMessage).commit();
                        }else if(getMessage!=null && mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText(getMessage);
                            saveUserID.edit().putString("save13", getMessage).commit();
                        }else if(getMessage!=null && mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText(getMessage);
                            saveUserID.edit().putString("save14", getMessage).commit();
                        }else if(getMessage!=null && mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText(getMessage);
                            saveUserID.edit().putString("save15", getMessage).commit();
                        }else if(getMessage!=null && mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText(getMessage);
                            saveUserID.edit().putString("save16", getMessage).commit();
                        }
                    }
                }, 100);

            }

            @Override
            public void onPartialResults(Bundle bundle) {

            }

            @Override
            public void onEvent(int i, Bundle bundle) {

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.page1fg, container, false);
        iniview(view);
        checkPermission();

        mbtn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn1.setText("Listening");
                        //startTime=event.getEventTime();

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }


                        startTime=event.getEventTime();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = event.getEventTime() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 400)
                            {
                                mbtn1.setText("");
                                saveUserID.edit().remove("save1").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn1.setText("");
                    saveUserID.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn2.setText("Listening");

                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=event.getEventTime();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = event.getEventTime() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 400)
                            {
                                mbtn2.setText("");
                                saveUserID.edit().remove("save2").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if( endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn2.setText("");
                    saveUserID.edit().remove("save2").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn3.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        //mSpeechRecognizer.stopListening();
                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn3.setText("");
                                saveUserID.edit().remove("save3").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn3.setText("");
                    saveUserID.edit().remove("save3").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn4.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn4.setText("");
                                saveUserID.edit().remove("save4").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000 ){
                    Log.d(TAG,"TEST");
                    mbtn4.setText("");
                    saveUserID.edit().remove("save4").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn5.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn5.setText("");
                                saveUserID.edit().remove("save5").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn5.setText("");
                    saveUserID.edit().remove("save5").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn6.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn6.setText("");
                                saveUserID.edit().remove("save6").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn6.setText("");
                    saveUserID.edit().remove("save6").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn7.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn7.setText("");
                                saveUserID.edit().remove("save7").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn7.setText("");
                    saveUserID.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn8.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();
                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn8.setText("");
                                saveUserID.edit().remove("save8").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn8.setText("");
                    saveUserID.edit().remove("save8").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn9.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn9.setText("");
                                saveUserID.edit().remove("save9").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn9.setText("");
                    saveUserID.edit().remove("save9").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn10.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn10.setText("");
                                saveUserID.edit().remove("save10").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn10.setText("");
                    saveUserID.edit().remove("save10").commit();
                    return true;
                }*/
                return false;
            }
        });
        mbtn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn11.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn11.setText("");
                                saveUserID.edit().remove("save11").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn11.setText("");
                    saveUserID.edit().remove("save11").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn12.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn12.setText("");
                                saveUserID.edit().remove("save12").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn12.setText("");
                    saveUserID.edit().remove("save12").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn13.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn13.setText("");
                                saveUserID.edit().remove("save13").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn13.setText("");
                    saveUserID.edit().remove("save13").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn14.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn14.setText("");
                                saveUserID.edit().remove("save14").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn14.setText("");
                    saveUserID.edit().remove("save14").commit();
                    return true;
                }*/
                return false;
            }
        });
        mbtn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn15.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }
                        if(mbtn16.getText().toString()=="Listening"){
                            mbtn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();

                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn15.setText("");
                                saveUserID.edit().remove("save15").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn15.setText("");
                    saveUserID.edit().remove("save15").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        mbtn16.setText("Listening");

                        if(mbtn2.getText().toString()=="Listening"){
                            mbtn2.setText("");
                        }
                        if(mbtn3.getText().toString()=="Listening"){
                            mbtn3.setText("");
                        }
                        if(mbtn4.getText().toString()=="Listening"){
                            mbtn4.setText("");
                        }
                        if(mbtn5.getText().toString()=="Listening"){
                            mbtn5.setText("");
                        }
                        if(mbtn6.getText().toString()=="Listening"){
                            mbtn6.setText("");
                        }
                        if(mbtn7.getText().toString()=="Listening"){
                            mbtn7.setText("");
                        }
                        if(mbtn8.getText().toString()=="Listening"){
                            mbtn8.setText("");
                        }
                        if(mbtn9.getText().toString()=="Listening"){
                            mbtn9.setText("");
                        }
                        if(mbtn10.getText().toString()=="Listening"){
                            mbtn10.setText("");
                        }
                        if(mbtn11.getText().toString()=="Listening"){
                            mbtn11.setText("");
                        }
                        if(mbtn12.getText().toString()=="Listening"){
                            mbtn12.setText("");
                        }
                        if(mbtn13.getText().toString()=="Listening"){
                            mbtn13.setText("");
                        }
                        if(mbtn14.getText().toString()=="Listening"){
                            mbtn14.setText("");
                        }
                        if(mbtn15.getText().toString()=="Listening"){
                            mbtn15.setText("");
                        }
                        if(mbtn1.getText().toString()=="Listening"){
                            mbtn1.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime=System.currentTimeMillis();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime=event.getEventTime();
                        mSpeechRecognizer.stopListening();
                        long time = System.currentTimeMillis() - startTime;
                        duration=  duration + time;
                        if(clickCount==2){
                            if(duration <= 500)
                            {
                                mbtn16.setText("");
                                saveUserID.edit().remove("save16").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    mbtn16.setText("");
                    saveUserID.edit().remove("save16").commit();
                    return true;
                }*/
                return false;
            }
        });

        mbtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //matches.clear();
                saveUserID.edit().clear().commit();
                mbtn1.setText("");
                mbtn2.setText("");
                mbtn3.setText("");
                mbtn4.setText("");
                mbtn5.setText("");
                mbtn6.setText("");
                mbtn7.setText("");
                mbtn8.setText("");
                mbtn9.setText("");
                mbtn10.setText("");
                mbtn11.setText("");
                mbtn12.setText("");
                mbtn13.setText("");
                mbtn14.setText("");
                mbtn15.setText("");
                mbtn16.setText("");
            }
        });
        return view;
    }

    private void iniview(View view) {
        ButtonView(view);
    }

    private void ButtonView(View view) {
        mbtnDelete=(Button)view.findViewById(R.id.btnDelete);
        mbtn1=(Button)view.findViewById(R.id.btn1);
        mbtn2=(Button)view.findViewById(R.id.btn2);
        mbtn3=(Button)view.findViewById(R.id.btn3);
        mbtn4=(Button)view.findViewById(R.id.btn4);
        mbtn5=(Button)view.findViewById(R.id.btn5);
        mbtn6=(Button)view.findViewById(R.id.btn6);
        mbtn7=(Button)view.findViewById(R.id.btn7);
        mbtn8=(Button)view.findViewById(R.id.btn8);
        mbtn9=(Button)view.findViewById(R.id.btn9);
        mbtn10=(Button)view.findViewById(R.id.btn10);
        mbtn11=(Button)view.findViewById(R.id.btn11);
        mbtn12=(Button)view.findViewById(R.id.btn12);
        mbtn13=(Button)view.findViewById(R.id.btn13);
        mbtn14=(Button)view.findViewById(R.id.btn14);
        mbtn15=(Button)view.findViewById(R.id.btn15);
        mbtn16=(Button)view.findViewById(R.id.btn16_3);

        if(saveUserID.contains("save1")){
            getMessagefromSP1=saveUserID.getString("save1", "");
            mbtn1.setText(getMessagefromSP1);
        }else{
            mbtn1.setText("");
        }

        if(saveUserID.contains("save2")){
            getMessagefromSP2=saveUserID.getString("save2", "");
            mbtn2.setText(getMessagefromSP2);
        }
        else{
            mbtn2.setText("");
        }

        if(saveUserID.contains("save3")){
            getMessagefromSP3=saveUserID.getString("save3", "");
            mbtn3.setText(getMessagefromSP3);
        }else{
            mbtn3.setText("");
        }

        if(saveUserID.contains("save4")){
            getMessagefromSP4=saveUserID.getString("save4", "");
            mbtn4.setText(getMessagefromSP4);
        }else{
            mbtn4.setText("");
        }

        if(saveUserID.contains("save5")){
            getMessagefromSP5=saveUserID.getString("save5", "");
            mbtn5.setText(getMessagefromSP5);
        }else{
            mbtn5.setText("");
        }

        if(saveUserID.contains("save6")){
            getMessagefromSP6=saveUserID.getString("save6", "");
            mbtn6.setText(getMessagefromSP6);
        }else{
            mbtn6.setText("");
        }

        if(saveUserID.contains("save7")){
            getMessagefromSP7=saveUserID.getString("save7", "");
            mbtn7.setText(getMessagefromSP7);
        }else{
            mbtn7.setText("");
        }

        if(saveUserID.contains("save8")){
            getMessagefromSP8=saveUserID.getString("save8", "");
            mbtn8.setText(getMessagefromSP8);
        }else{
            mbtn8.setText("");
        }

        if(saveUserID.contains("save9")){
            getMessagefromSP9=saveUserID.getString("save9", "");
            mbtn9.setText(getMessagefromSP9);
        }else{
            mbtn9.setText("");
        }

        if(saveUserID.contains("save10")){
            getMessagefromSP10=saveUserID.getString("save10", "");
            mbtn10.setText(getMessagefromSP10);
        }else{
            mbtn10.setText("");
        }

        if(saveUserID.contains("save11")){
            getMessagefromSP11=saveUserID.getString("save11", "");
            mbtn11.setText(getMessagefromSP11);
        }else{
            mbtn11.setText("");
        }

        if(saveUserID.contains("save12")){
            getMessagefromSP12=saveUserID.getString("save12", "");
            mbtn12.setText(getMessagefromSP12);
        }else{
            mbtn12.setText("");
        }

        if(saveUserID.contains("save13")){
            getMessagefromSP13=saveUserID.getString("save13", "");
            mbtn13.setText(getMessagefromSP13);
        }else{
            mbtn13.setText("");
        }

        if(saveUserID.contains("save14")){
            getMessagefromSP14=saveUserID.getString("save14", "");
            mbtn14.setText(getMessagefromSP14);
        }else{
            mbtn14.setText("");
        }

        if(saveUserID.contains("save15")){
            getMessagefromSP15=saveUserID.getString("save15", "");
            mbtn15.setText(getMessagefromSP15);
        }else{
            mbtn15.setText("");
        }

        if(saveUserID.contains("save16")){
            getMessagefromSP16=saveUserID.getString("save16", "");
            mbtn16.setText(getMessagefromSP16);
        }else{
            mbtn16.setText("");
        }

    }

    private void checkPermission() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            if (!(android.support.v4.content.ContextCompat.checkSelfPermission(getActivity(), android.Manifest.permission.RECORD_AUDIO) == android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                /*android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                        android.net.Uri.parse("package:" + getPackageName()));*/
                ActivityCompat.requestPermissions(getActivity(),
                        new String[]{Manifest.permission.RECORD_AUDIO},
                        1);
            }
        }
    }

    @Override

    public void onDestroy() {
        super.onDestroy();
    }
}
