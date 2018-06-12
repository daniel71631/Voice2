package com.example.daniel.voice2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class Page3FG extends Fragment {

    private Button m3btn1, m3btn2,m3btn3, m3btn4, m3btn5, m3btn6, m3btn7, m3btn8, m3btn9, m3btn10, m3btn11,
            m3btn12, m3btn13, m3btn14, m3btn15, m3btn16;
    private Button m3btnDelete;
    private SpeechRecognizer mSpeechRecognizer;
    private android.content.Intent mSpeechRecognizerIntent;
    private ArrayList<String> matches3;
    private String TAG="Page3";
    private String getMessage, getMessagefromSP1, getMessagefromSP2, getMessagefromSP3, getMessagefromSP4, getMessagefromSP5, getMessagefromSP6, getMessagefromSP7, getMessagefromSP8, getMessagefromSP9,
            getMessagefromSP10, getMessagefromSP11, getMessagefromSP12, getMessagefromSP13, getMessagefromSP14, getMessagefromSP15, getMessagefromSP16;
    private long startTime=0;
    private long endTime=0;
    private SharedPreferences saveUserID3;
    private static final String data = "DATA3";
    private int clickCount = 0;
    private long StartTime;
    private long duration;
    final Handler handler = new Handler();


    public static Fragment newInstance(){
        Page3FG fragment = new Page3FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveUserID3=getActivity().getSharedPreferences(data,0);

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
                matches3 = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        getMessage=matches3.get(0);
                        if(getMessage!=null && m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText(getMessage);
                            saveUserID3.edit().putString("save1", getMessage).commit();
                        }else if(getMessage!=null && m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText(getMessage);
                            saveUserID3.edit().putString("save2", getMessage).commit();
                        }else if(getMessage!=null && m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText(getMessage);
                            saveUserID3.edit().putString("save3", getMessage).commit();
                        }else if(getMessage!=null && m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText(getMessage);
                            saveUserID3.edit().putString("save4", getMessage).commit();
                        }else if(getMessage!=null && m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText(getMessage);
                            saveUserID3.edit().putString("save5", getMessage).commit();
                        }else if(getMessage!=null && m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText(getMessage);
                            saveUserID3.edit().putString("save6", getMessage).commit();
                        }else if(getMessage!=null && m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText(getMessage);
                            saveUserID3.edit().putString("save7", getMessage).commit();
                        }else if(getMessage!=null && m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText(getMessage);
                            saveUserID3.edit().putString("save8", getMessage).commit();
                        }else if(getMessage!=null && m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText(getMessage);
                            saveUserID3.edit().putString("save9", getMessage).commit();
                        }else if(getMessage!=null && m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText(getMessage);
                            saveUserID3.edit().putString("save10", getMessage).commit();
                        }else if(getMessage!=null && m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText(getMessage);
                            saveUserID3.edit().putString("save11", getMessage).commit();
                        }else if(getMessage!=null && m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText(getMessage);
                            saveUserID3.edit().putString("save12", getMessage).commit();
                        }else if(getMessage!=null && m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText(getMessage);
                            saveUserID3.edit().putString("save13", getMessage).commit();
                        }else if(getMessage!=null && m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText(getMessage);
                            saveUserID3.edit().putString("save14", getMessage).commit();
                        }else if(getMessage!=null && m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText(getMessage);
                            saveUserID3.edit().putString("save15", getMessage).commit();
                        }else if(getMessage!=null && m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText(getMessage);
                            saveUserID3.edit().putString("save16", getMessage).commit();
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
        final View view = inflater.inflate(R.layout.page3fg, container, false);
        iniview(view);

        m3btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn1.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn1.setText("");
                                saveUserID3.edit().remove("save1").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn2.setText("Listening");

                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn2.setText("");
                                saveUserID3.edit().remove("save2").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn3.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn3.setText("");
                                saveUserID3.edit().remove("save3").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn4.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn4.setText("");
                                saveUserID3.edit().remove("save4").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn5.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn5.setText("");
                                saveUserID3.edit().remove("save5").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn6.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn6.setText("");
                                saveUserID3.edit().remove("save6").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn7.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn7.setText("");
                                saveUserID3.edit().remove("save7").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn8.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn8.setText("");
                                saveUserID3.edit().remove("save8").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn9.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn9.setText("");
                                saveUserID3.edit().remove("save9").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn10.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn10.setText("");
                                saveUserID3.edit().remove("save10").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });
        m3btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn11.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
                        }

                        //startTime=event.getEventTime();
                        startTime = event.getEventTime();
                        clickCount++;
                        break;
                    case MotionEvent.ACTION_UP:
                        endTime = event.getEventTime();
                        mSpeechRecognizer.stopListening();
                        long time = event.getEventTime() - startTime;
                        duration = duration + time;
                        if (clickCount == 2) {
                            if (duration <= 400) {
                                m3btn11.setText("");
                                saveUserID3.edit().remove("save11").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn12.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn12.setText("");
                                saveUserID3.edit().remove("save12").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn13.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn13.setText("");
                                saveUserID3.edit().remove("save13").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn14.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn14.setText("");
                                saveUserID3.edit().remove("save14").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });
        m3btn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn15.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
                        }
                        if(m3btn16.getText().toString()=="Listening"){
                            m3btn16.setText("");
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
                                m3btn15.setText("");
                                saveUserID3.edit().remove("save15").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m3btn16.setText("Listening");

                        if(m3btn2.getText().toString()=="Listening"){
                            m3btn2.setText("");
                        }
                        if(m3btn3.getText().toString()=="Listening"){
                            m3btn3.setText("");
                        }
                        if(m3btn4.getText().toString()=="Listening"){
                            m3btn4.setText("");
                        }
                        if(m3btn5.getText().toString()=="Listening"){
                            m3btn5.setText("");
                        }
                        if(m3btn6.getText().toString()=="Listening"){
                            m3btn6.setText("");
                        }
                        if(m3btn7.getText().toString()=="Listening"){
                            m3btn7.setText("");
                        }
                        if(m3btn8.getText().toString()=="Listening"){
                            m3btn8.setText("");
                        }
                        if(m3btn9.getText().toString()=="Listening"){
                            m3btn9.setText("");
                        }
                        if(m3btn10.getText().toString()=="Listening"){
                            m3btn10.setText("");
                        }
                        if(m3btn11.getText().toString()=="Listening"){
                            m3btn11.setText("");
                        }
                        if(m3btn12.getText().toString()=="Listening"){
                            m3btn12.setText("");
                        }
                        if(m3btn13.getText().toString()=="Listening"){
                            m3btn13.setText("");
                        }
                        if(m3btn14.getText().toString()=="Listening"){
                            m3btn14.setText("");
                        }
                        if(m3btn15.getText().toString()=="Listening"){
                            m3btn15.setText("");
                        }
                        if(m3btn1.getText().toString()=="Listening"){
                            m3btn1.setText("");
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
                                m3btn16.setText("");
                                saveUserID3.edit().remove("save16").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn1.setText("");
                    saveUserID2.edit().remove("save1").commit();
                    return true;
                }*/
                return false;
            }
        });

        m3btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //matches.clear();
                saveUserID3.edit().clear().commit();
                m3btn1.setText("");
                m3btn2.setText("");
                m3btn3.setText("");
                m3btn4.setText("");
                m3btn5.setText("");
                m3btn6.setText("");
                m3btn7.setText("");
                m3btn8.setText("");
                m3btn9.setText("");
                m3btn10.setText("");
                m3btn11.setText("");
                m3btn12.setText("");
                m3btn13.setText("");
                m3btn14.setText("");
                m3btn15.setText("");
                m3btn16.setText("");
            }
        });
        return view;
    }

    private void iniview(View view) {
        ButtonView(view);
    }

    private void ButtonView(View view) {
        m3btnDelete = (Button) view.findViewById(R.id.btnDelete3);
        m3btn1 = (Button) view.findViewById(R.id.btn1_3);
        m3btn2 = (Button) view.findViewById(R.id.btn2_3);
        m3btn3 = (Button) view.findViewById(R.id.btn3_3);
        m3btn4 = (Button) view.findViewById(R.id.btn4_3);
        m3btn5 = (Button) view.findViewById(R.id.btn5_3);
        m3btn6 = (Button) view.findViewById(R.id.btn6_3);
        m3btn7 = (Button) view.findViewById(R.id.btn7_3);
        m3btn8 = (Button) view.findViewById(R.id.btn8_3);
        m3btn9 = (Button) view.findViewById(R.id.btn9_3);
        m3btn10 = (Button) view.findViewById(R.id.btn10_3);
        m3btn11 = (Button) view.findViewById(R.id.btn11_3);
        m3btn12 = (Button) view.findViewById(R.id.btn12_3);
        m3btn13 = (Button) view.findViewById(R.id.btn13_3);
        m3btn14 = (Button) view.findViewById(R.id.btn14_3);
        m3btn15 = (Button) view.findViewById(R.id.btn15_3);
        m3btn16 = (Button) view.findViewById(R.id.btn16_3);

        if (saveUserID3.contains("save1")) {
            getMessagefromSP1 = saveUserID3.getString("save1", "");
            m3btn1.setText(getMessagefromSP1);
        } else {
            m3btn1.setText("");
        }

        if (saveUserID3.contains("save2")) {
            getMessagefromSP2 = saveUserID3.getString("save2", "");
            m3btn2.setText(getMessagefromSP2);
        } else {
            m3btn2.setText("");
        }

        if (saveUserID3.contains("save3")) {
            getMessagefromSP3 = saveUserID3.getString("save3", "");
            m3btn3.setText(getMessagefromSP3);
        } else {
            m3btn3.setText("");
        }

        if (saveUserID3.contains("save4")) {
            getMessagefromSP4 = saveUserID3.getString("save4", "");
            m3btn4.setText(getMessagefromSP4);
        } else {
            m3btn4.setText("");
        }

        if (saveUserID3.contains("save5")) {
            getMessagefromSP5 = saveUserID3.getString("save5", "");
            m3btn5.setText(getMessagefromSP5);
        } else {
            m3btn5.setText("");
        }

        if (saveUserID3.contains("save6")) {
            getMessagefromSP6 = saveUserID3.getString("save6", "");
            m3btn6.setText(getMessagefromSP6);
        } else {
            m3btn6.setText("");
        }

        if (saveUserID3.contains("save7")) {
            getMessagefromSP7 = saveUserID3.getString("save7", "");
            m3btn7.setText(getMessagefromSP7);
        } else {
            m3btn7.setText("");
        }

        if (saveUserID3.contains("save8")) {
            getMessagefromSP8 = saveUserID3.getString("save8", "");
            m3btn8.setText(getMessagefromSP8);
        } else {
            m3btn8.setText("");
        }

        if (saveUserID3.contains("save9")) {
            getMessagefromSP9 = saveUserID3.getString("save9", "");
            m3btn9.setText(getMessagefromSP9);
        } else {
            m3btn9.setText("");
        }

        if (saveUserID3.contains("save10")) {
            getMessagefromSP10 = saveUserID3.getString("save10", "");
            m3btn10.setText(getMessagefromSP10);
        } else {
            m3btn10.setText("");
        }

        if (saveUserID3.contains("save11")) {
            getMessagefromSP11 = saveUserID3.getString("save11", "");
            m3btn11.setText(getMessagefromSP11);
        } else {
            m3btn11.setText("");
        }

        if (saveUserID3.contains("save12")) {
            getMessagefromSP12 = saveUserID3.getString("save12", "");
            m3btn12.setText(getMessagefromSP12);
        } else {
            m3btn12.setText("");
        }

        if (saveUserID3.contains("save13")) {
            getMessagefromSP13 = saveUserID3.getString("save13", "");
            m3btn13.setText(getMessagefromSP13);
        } else {
            m3btn13.setText("");
        }

        if (saveUserID3.contains("save14")) {
            getMessagefromSP14 = saveUserID3.getString("save14", "");
            m3btn14.setText(getMessagefromSP14);
        } else {
            m3btn14.setText("");
        }

        if (saveUserID3.contains("save15")) {
            getMessagefromSP15 = saveUserID3.getString("save15", "");
            m3btn15.setText(getMessagefromSP15);
        } else {
            m3btn15.setText("");
        }

        if (saveUserID3.contains("save16")) {
            getMessagefromSP16 = saveUserID3.getString("save16", "");
            m3btn16.setText(getMessagefromSP16);
        } else {
            m3btn16.setText("");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
