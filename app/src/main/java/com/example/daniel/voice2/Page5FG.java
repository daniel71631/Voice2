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

public class Page5FG extends Fragment {

    private Button m5btn1, m5btn2,m5btn3, m5btn4, m5btn5, m5btn6, m5btn7, m5btn8, m5btn9, m5btn10, m5btn11,
            m5btn12, m5btn13, m5btn14, m5btn15, m5btn16;
    private Button m5btnDelete;
    private SpeechRecognizer mSpeechRecognizer;
    private android.content.Intent mSpeechRecognizerIntent;
    private ArrayList<String> matches5;
    private String TAG="Page5";
    private String getMessage, getMessagefromSP1, getMessagefromSP2, getMessagefromSP3, getMessagefromSP4, getMessagefromSP5, getMessagefromSP6, getMessagefromSP7, getMessagefromSP8, getMessagefromSP9,
            getMessagefromSP10, getMessagefromSP11, getMessagefromSP12, getMessagefromSP13, getMessagefromSP14, getMessagefromSP15, getMessagefromSP16;
    private long startTime=0;
    private long endTime=0;
    private SharedPreferences saveUserID5;
    private static final String data = "DATA5";
    private int clickCount = 0;
    private long StartTime;
    private long duration;
    final Handler handler = new Handler();


    public static Fragment newInstance(){
        Page5FG fragment = new Page5FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveUserID5=getActivity().getSharedPreferences(data,0);

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
                matches5 = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        getMessage=matches5.get(0);
                        if(getMessage!=null && m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText(getMessage);
                            saveUserID5.edit().putString("save1", getMessage).commit();
                        }else if(getMessage!=null && m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText(getMessage);
                            saveUserID5.edit().putString("save2", getMessage).commit();
                        }else if(getMessage!=null && m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText(getMessage);
                            saveUserID5.edit().putString("save3", getMessage).commit();
                        }else if(getMessage!=null && m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText(getMessage);
                            saveUserID5.edit().putString("save4", getMessage).commit();
                        }else if(getMessage!=null && m5btn5.getText().toString()=="Listening"){
                            m5btn5.setText(getMessage);
                            saveUserID5.edit().putString("save5", getMessage).commit();
                        }else if(getMessage!=null && m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText(getMessage);
                            saveUserID5.edit().putString("save6", getMessage).commit();
                        }else if(getMessage!=null && m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText(getMessage);
                            saveUserID5.edit().putString("save7", getMessage).commit();
                        }else if(getMessage!=null && m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText(getMessage);
                            saveUserID5.edit().putString("save8", getMessage).commit();
                        }else if(getMessage!=null && m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText(getMessage);
                            saveUserID5.edit().putString("save9", getMessage).commit();
                        }else if(getMessage!=null && m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText(getMessage);
                            saveUserID5.edit().putString("save10", getMessage).commit();
                        }else if(getMessage!=null && m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText(getMessage);
                            saveUserID5.edit().putString("save11", getMessage).commit();
                        }else if(getMessage!=null && m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText(getMessage);
                            saveUserID5.edit().putString("save12", getMessage).commit();
                        }else if(getMessage!=null && m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText(getMessage);
                            saveUserID5.edit().putString("save13", getMessage).commit();
                        }else if(getMessage!=null && m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText(getMessage);
                            saveUserID5.edit().putString("save14", getMessage).commit();
                        }else if(getMessage!=null && m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText(getMessage);
                            saveUserID5.edit().putString("save15", getMessage).commit();
                        }else if(getMessage!=null && m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText(getMessage);
                            saveUserID5.edit().putString("save16", getMessage).commit();
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
        final View view = inflater.inflate(R.layout.page5fg, container, false);
        iniview(view);

        m5btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn1.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn1.setText("");
                                saveUserID5.edit().remove("save1").commit();
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

        m5btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn2.setText("Listening");

                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn2.setText("");
                                saveUserID5.edit().remove("save2").commit();
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

        m5btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn3.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn3.setText("");
                                saveUserID5.edit().remove("save3").commit();
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

        m5btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn4.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn4.setText("");
                                saveUserID5.edit().remove("save4").commit();
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

        m5btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn5.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening") {
                            m5btn1.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn5.setText("");
                                saveUserID5.edit().remove("save5").commit();
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

        m5btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn6.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn6.setText("");
                                saveUserID5.edit().remove("sav16").commit();
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

        m5btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn7.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn7.setText("");
                                saveUserID5.edit().remove("save7").commit();
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

        m5btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn8.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn8.setText("");
                                saveUserID5.edit().remove("save8").commit();
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

        m5btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn9.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn9.setText("");
                                saveUserID5.edit().remove("save9").commit();
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

        m5btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn10.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn10.setText("");
                                saveUserID5.edit().remove("save10").commit();
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
        m5btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn11.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn11.setText("");
                                saveUserID5.edit().remove("save11").commit();
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

        m5btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn12.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn12.setText("");
                                saveUserID5.edit().remove("save12").commit();
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

        m5btn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn13.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn13.setText("");
                                saveUserID5.edit().remove("save13").commit();
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

        m5btn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn14.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn14.setText("");
                                saveUserID5.edit().remove("save14").commit();
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
        m5btn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn15.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
                        }
                        if(m5btn16.getText().toString()=="Listening"){
                            m5btn16.setText("");
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
                                m5btn15.setText("");
                                saveUserID5.edit().remove("save15").commit();
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

        m5btn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m5btn16.setText("Listening");

                        if(m5btn2.getText().toString()=="Listening"){
                            m5btn2.setText("");
                        }
                        if(m5btn3.getText().toString()=="Listening"){
                            m5btn3.setText("");
                        }
                        if(m5btn4.getText().toString()=="Listening"){
                            m5btn4.setText("");
                        }
                        if(m5btn5.getText().toString()=="Listening") {
                            m5btn5.setText("");
                        }
                        if(m5btn6.getText().toString()=="Listening"){
                            m5btn6.setText("");
                        }
                        if(m5btn7.getText().toString()=="Listening"){
                            m5btn7.setText("");
                        }
                        if(m5btn8.getText().toString()=="Listening"){
                            m5btn8.setText("");
                        }
                        if(m5btn9.getText().toString()=="Listening"){
                            m5btn9.setText("");
                        }
                        if(m5btn10.getText().toString()=="Listening"){
                            m5btn10.setText("");
                        }
                        if(m5btn11.getText().toString()=="Listening"){
                            m5btn11.setText("");
                        }
                        if(m5btn12.getText().toString()=="Listening"){
                            m5btn12.setText("");
                        }
                        if(m5btn13.getText().toString()=="Listening"){
                            m5btn13.setText("");
                        }
                        if(m5btn14.getText().toString()=="Listening"){
                            m5btn14.setText("");
                        }
                        if(m5btn15.getText().toString()=="Listening"){
                            m5btn15.setText("");
                        }
                        if(m5btn1.getText().toString()=="Listening"){
                            m5btn1.setText("");
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
                                m5btn16.setText("");
                                saveUserID5.edit().remove("save16").commit();
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

        m5btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //matches.clear();
                saveUserID5.edit().clear().commit();
                m5btn1.setText("");
                m5btn2.setText("");
                m5btn3.setText("");
                m5btn4.setText("");
                m5btn5.setText("");
                m5btn6.setText("");
                m5btn7.setText("");
                m5btn8.setText("");
                m5btn9.setText("");
                m5btn10.setText("");
                m5btn11.setText("");
                m5btn12.setText("");
                m5btn13.setText("");
                m5btn14.setText("");
                m5btn15.setText("");
                m5btn16.setText("");
            }
        });
        return view;
    }

    private void iniview(View view) {
        ButtonView(view);
    }

    private void ButtonView(View view) {
        m5btnDelete = (Button) view.findViewById(R.id.btnDelete5);
        m5btn1 = (Button) view.findViewById(R.id.btn1_5);
        m5btn2 = (Button) view.findViewById(R.id.btn2_5);
        m5btn3 = (Button) view.findViewById(R.id.btn3_5);
        m5btn4 = (Button) view.findViewById(R.id.btn4_5);
        m5btn5 = (Button) view.findViewById(R.id.btn5_5);
        m5btn6 = (Button) view.findViewById(R.id.btn6_5);
        m5btn7 = (Button) view.findViewById(R.id.btn7_5);
        m5btn8 = (Button) view.findViewById(R.id.btn8_5);
        m5btn9 = (Button) view.findViewById(R.id.btn9_5);
        m5btn10 = (Button) view.findViewById(R.id.btn10_5);
        m5btn11 = (Button) view.findViewById(R.id.btn11_5);
        m5btn12 = (Button) view.findViewById(R.id.btn12_5);
        m5btn13 = (Button) view.findViewById(R.id.btn13_5);
        m5btn14 = (Button) view.findViewById(R.id.btn14_5);
        m5btn15 = (Button) view.findViewById(R.id.btn15_5);
        m5btn16 = (Button) view.findViewById(R.id.btn16_5);

        if (saveUserID5.contains("save1")) {
            getMessagefromSP1 = saveUserID5.getString("save1", "");
            m5btn1.setText(getMessagefromSP1);
        } else {
            m5btn1.setText("");
        }

        if (saveUserID5.contains("save2")) {
            getMessagefromSP2 = saveUserID5.getString("save2", "");
            m5btn2.setText(getMessagefromSP2);
        } else {
            m5btn2.setText("");
        }

        if (saveUserID5.contains("save3")) {
            getMessagefromSP3 = saveUserID5.getString("save3", "");
            m5btn3.setText(getMessagefromSP3);
        } else {
            m5btn3.setText("");
        }

        if (saveUserID5.contains("save4")) {
            getMessagefromSP4 = saveUserID5.getString("save4", "");
            m5btn4.setText(getMessagefromSP4);
        } else {
            m5btn4.setText("");
        }

        if (saveUserID5.contains("save5")) {
            getMessagefromSP5 = saveUserID5.getString("save5", "");
            m5btn5.setText(getMessagefromSP5);
        } else {
            m5btn5.setText("");
        }

        if (saveUserID5.contains("save6")) {
            getMessagefromSP6 = saveUserID5.getString("save6", "");
            m5btn6.setText(getMessagefromSP6);
        } else {
            m5btn6.setText("");
        }

        if (saveUserID5.contains("save7")) {
            getMessagefromSP7 = saveUserID5.getString("save7", "");
            m5btn7.setText(getMessagefromSP7);
        } else {
            m5btn7.setText("");
        }

        if (saveUserID5.contains("save8")) {
            getMessagefromSP8 = saveUserID5.getString("save8", "");
            m5btn8.setText(getMessagefromSP8);
        } else {
            m5btn8.setText("");
        }

        if (saveUserID5.contains("save9")) {
            getMessagefromSP9 = saveUserID5.getString("save9", "");
            m5btn9.setText(getMessagefromSP9);
        } else {
            m5btn9.setText("");
        }

        if (saveUserID5.contains("save10")) {
            getMessagefromSP10 = saveUserID5.getString("save10", "");
            m5btn10.setText(getMessagefromSP10);
        } else {
            m5btn10.setText("");
        }

        if (saveUserID5.contains("save11")) {
            getMessagefromSP11 = saveUserID5.getString("save11", "");
            m5btn11.setText(getMessagefromSP11);
        } else {
            m5btn11.setText("");
        }

        if (saveUserID5.contains("save12")) {
            getMessagefromSP12 = saveUserID5.getString("save12", "");
            m5btn12.setText(getMessagefromSP12);
        } else {
            m5btn12.setText("");
        }

        if (saveUserID5.contains("save13")) {
            getMessagefromSP13 = saveUserID5.getString("save13", "");
            m5btn13.setText(getMessagefromSP13);
        } else {
            m5btn13.setText("");
        }

        if (saveUserID5.contains("save14")) {
            getMessagefromSP14 = saveUserID5.getString("save14", "");
            m5btn14.setText(getMessagefromSP14);
        } else {
            m5btn14.setText("");
        }

        if (saveUserID5.contains("save15")) {
            getMessagefromSP15 = saveUserID5.getString("save15", "");
            m5btn15.setText(getMessagefromSP15);
        } else {
            m5btn15.setText("");
        }

        if (saveUserID5.contains("save16")) {
            getMessagefromSP16 = saveUserID5.getString("save16", "");
            m5btn16.setText(getMessagefromSP16);
        } else {
            m5btn16.setText("");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
