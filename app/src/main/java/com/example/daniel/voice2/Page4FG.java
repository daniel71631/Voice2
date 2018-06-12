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

public class
Page4FG extends Fragment {

    private Button m4btn1, m4btn2,m4btn3, m4btn4, m4btn5, m4btn6, m4btn7, m4btn8, m4btn9, m4btn10, m4btn11,
            m4btn12, m4btn13, m4btn14, m4btn15, m4btn16;
    private Button m4btnDelete;
    private SpeechRecognizer mSpeechRecognizer;
    private android.content.Intent mSpeechRecognizerIntent;
    private ArrayList<String> matches4;
    private String TAG="Page4";
    private String getMessage, getMessagefromSP1, getMessagefromSP2, getMessagefromSP3, getMessagefromSP4, getMessagefromSP5, getMessagefromSP6, getMessagefromSP7, getMessagefromSP8, getMessagefromSP9,
            getMessagefromSP10, getMessagefromSP11, getMessagefromSP12, getMessagefromSP13, getMessagefromSP14, getMessagefromSP15, getMessagefromSP16;
    private long startTime=0;
    private long endTime=0;
    private SharedPreferences saveUserID4;
    private static final String data = "DATA4";
    private int clickCount = 0;
    private long StartTime;
    private long duration;
    final Handler handler = new Handler();

    public static Fragment newInstance(){
        Page4FG fragment = new Page4FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveUserID4=getActivity().getSharedPreferences(data,0);

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
                matches4 = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        getMessage=matches4.get(0);
                        if(getMessage!=null && m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText(getMessage);
                            saveUserID4.edit().putString("save1", getMessage).commit();
                        }else if(getMessage!=null && m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText(getMessage);
                            saveUserID4.edit().putString("save2", getMessage).commit();
                        }else if(getMessage!=null && m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText(getMessage);
                            saveUserID4.edit().putString("save3", getMessage).commit();
                        }else if(getMessage!=null && m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText(getMessage);
                            saveUserID4.edit().putString("save4", getMessage).commit();
                        }else if(getMessage!=null && m4btn5.getText().toString()=="Listening"){
                            m4btn5.setText(getMessage);
                            saveUserID4.edit().putString("save5", getMessage).commit();
                        }else if(getMessage!=null && m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText(getMessage);
                            saveUserID4.edit().putString("save6", getMessage).commit();
                        }else if(getMessage!=null && m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText(getMessage);
                            saveUserID4.edit().putString("save7", getMessage).commit();
                        }else if(getMessage!=null && m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText(getMessage);
                            saveUserID4.edit().putString("save8", getMessage).commit();
                        }else if(getMessage!=null && m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText(getMessage);
                            saveUserID4.edit().putString("save9", getMessage).commit();
                        }else if(getMessage!=null && m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText(getMessage);
                            saveUserID4.edit().putString("save10", getMessage).commit();
                        }else if(getMessage!=null && m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText(getMessage);
                            saveUserID4.edit().putString("save11", getMessage).commit();
                        }else if(getMessage!=null && m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText(getMessage);
                            saveUserID4.edit().putString("save12", getMessage).commit();
                        }else if(getMessage!=null && m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText(getMessage);
                            saveUserID4.edit().putString("save13", getMessage).commit();
                        }else if(getMessage!=null && m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText(getMessage);
                            saveUserID4.edit().putString("save14", getMessage).commit();
                        }else if(getMessage!=null && m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText(getMessage);
                            saveUserID4.edit().putString("save15", getMessage).commit();
                        }else if(getMessage!=null && m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText(getMessage);
                            saveUserID4.edit().putString("save16", getMessage).commit();
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
        final View view = inflater.inflate(R.layout.page4fg, container, false);
        iniview(view);

        m4btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn1.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn1.setText("");
                                saveUserID4.edit().remove("save1").commit();
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

        m4btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn2.setText("Listening");

                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn2.setText("");
                                saveUserID4.edit().remove("save2").commit();
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

        m4btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn3.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn3.setText("");
                                saveUserID4.edit().remove("save3").commit();
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

        m4btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn4.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn4.setText("");
                                saveUserID4.edit().remove("save4").commit();
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

        m4btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn5.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening") {
                            m4btn1.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn5.setText("");
                                saveUserID4.edit().remove("save5").commit();
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

        m4btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn6.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn6.setText("");
                                saveUserID4.edit().remove("save6").commit();
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

        m4btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn7.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn7.setText("");
                                saveUserID4.edit().remove("save7").commit();
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

        m4btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn8.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn8.setText("");
                                saveUserID4.edit().remove("save8").commit();
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

        m4btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn9.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn9.setText("");
                                saveUserID4.edit().remove("save9").commit();
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

        m4btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn10.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn10.setText("");
                                saveUserID4.edit().remove("save10").commit();
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
        m4btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn11.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn11.setText("");
                                saveUserID4.edit().remove("save11").commit();
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

        m4btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn12.setText("Listening");


                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn12.setText("");
                                saveUserID4.edit().remove("save12").commit();
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

        m4btn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn13.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn13.setText("");
                                saveUserID4.edit().remove("save13").commit();
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

        m4btn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn14.setText("Listening");


                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn14.setText("");
                                saveUserID4.edit().remove("save14").commit();
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
        m4btn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn15.setText("Listening");

                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
                        }
                        if(m4btn16.getText().toString()=="Listening"){
                            m4btn16.setText("");
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
                                m4btn15.setText("");
                                saveUserID4.edit().remove("save15").commit();
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

        m4btn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m4btn16.setText("Listening");


                        if(m4btn2.getText().toString()=="Listening"){
                            m4btn2.setText("");
                        }
                        if(m4btn3.getText().toString()=="Listening"){
                            m4btn3.setText("");
                        }
                        if(m4btn4.getText().toString()=="Listening"){
                            m4btn4.setText("");
                        }
                        if(m4btn5.getText().toString()=="Listening") {
                            m4btn5.setText("");
                        }
                        if(m4btn6.getText().toString()=="Listening"){
                            m4btn6.setText("");
                        }
                        if(m4btn7.getText().toString()=="Listening"){
                            m4btn7.setText("");
                        }
                        if(m4btn8.getText().toString()=="Listening"){
                            m4btn8.setText("");
                        }
                        if(m4btn9.getText().toString()=="Listening"){
                            m4btn9.setText("");
                        }
                        if(m4btn10.getText().toString()=="Listening"){
                            m4btn10.setText("");
                        }
                        if(m4btn11.getText().toString()=="Listening"){
                            m4btn11.setText("");
                        }
                        if(m4btn12.getText().toString()=="Listening"){
                            m4btn12.setText("");
                        }
                        if(m4btn13.getText().toString()=="Listening"){
                            m4btn13.setText("");
                        }
                        if(m4btn14.getText().toString()=="Listening"){
                            m4btn14.setText("");
                        }
                        if(m4btn15.getText().toString()=="Listening"){
                            m4btn15.setText("");
                        }
                        if(m4btn1.getText().toString()=="Listening"){
                            m4btn1.setText("");
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
                                m4btn16.setText("");
                                saveUserID4.edit().remove("save16").commit();
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

        m4btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //matches.clear();
                saveUserID4.edit().clear().commit();
                m4btn1.setText("");
                m4btn2.setText("");
                m4btn3.setText("");
                m4btn4.setText("");
                m4btn5.setText("");
                m4btn6.setText("");
                m4btn7.setText("");
                m4btn8.setText("");
                m4btn9.setText("");
                m4btn10.setText("");
                m4btn11.setText("");
                m4btn12.setText("");
                m4btn13.setText("");
                m4btn14.setText("");
                m4btn15.setText("");
                m4btn16.setText("");
            }
        });
        return view;
    }

    private void iniview(View view) {
        ButtonView(view);
    }

    private void ButtonView(View view) {
        m4btnDelete = (Button) view.findViewById(R.id.btnDelete4);
        m4btn1 = (Button) view.findViewById(R.id.btn1_4);
        m4btn2 = (Button) view.findViewById(R.id.btn2_4);
        m4btn3 = (Button) view.findViewById(R.id.btn3_4);
        m4btn4 = (Button) view.findViewById(R.id.btn4_4);
        m4btn5 = (Button) view.findViewById(R.id.btn5_4);
        m4btn6 = (Button) view.findViewById(R.id.btn6_4);
        m4btn7 = (Button) view.findViewById(R.id.btn7_4);
        m4btn8 = (Button) view.findViewById(R.id.btn8_4);
        m4btn9 = (Button) view.findViewById(R.id.btn9_4);
        m4btn10 = (Button) view.findViewById(R.id.btn10_4);
        m4btn11 = (Button) view.findViewById(R.id.btn11_4);
        m4btn12 = (Button) view.findViewById(R.id.btn12_4);
        m4btn13 = (Button) view.findViewById(R.id.btn13_4);
        m4btn14 = (Button) view.findViewById(R.id.btn14_4);
        m4btn15 = (Button) view.findViewById(R.id.btn15_4);
        m4btn16 = (Button) view.findViewById(R.id.btn16_4);

        if (saveUserID4.contains("save1")) {
            getMessagefromSP1 = saveUserID4.getString("save1", "");
            m4btn1.setText(getMessagefromSP1);
        } else {
            m4btn1.setText("");
        }

        if (saveUserID4.contains("save2")) {
            getMessagefromSP2 = saveUserID4.getString("save2", "");
            m4btn2.setText(getMessagefromSP2);
        } else {
            m4btn2.setText("");
        }

        if (saveUserID4.contains("save3")) {
            getMessagefromSP3 = saveUserID4.getString("save3", "");
            m4btn3.setText(getMessagefromSP3);
        } else {
            m4btn3.setText("");
        }

        if (saveUserID4.contains("save4")) {
            getMessagefromSP4 = saveUserID4.getString("save4", "");
            m4btn4.setText(getMessagefromSP4);
        } else {
            m4btn4.setText("");
        }

        if (saveUserID4.contains("save5")) {
            getMessagefromSP5 = saveUserID4.getString("save5", "");
            m4btn5.setText(getMessagefromSP5);
        } else {
            m4btn5.setText("");
        }

        if (saveUserID4.contains("save6")) {
            getMessagefromSP6 = saveUserID4.getString("save6", "");
            m4btn6.setText(getMessagefromSP6);
        } else {
            m4btn6.setText("");
        }

        if (saveUserID4.contains("save7")) {
            getMessagefromSP7 = saveUserID4.getString("save7", "");
            m4btn7.setText(getMessagefromSP7);
        } else {
            m4btn7.setText("");
        }

        if (saveUserID4.contains("save8")) {
            getMessagefromSP8 = saveUserID4.getString("save8", "");
            m4btn8.setText(getMessagefromSP8);
        } else {
            m4btn8.setText("");
        }

        if (saveUserID4.contains("save9")) {
            getMessagefromSP9 = saveUserID4.getString("save9", "");
            m4btn9.setText(getMessagefromSP9);
        } else {
            m4btn9.setText("");
        }

        if (saveUserID4.contains("save10")) {
            getMessagefromSP10 = saveUserID4.getString("save10", "");
            m4btn10.setText(getMessagefromSP10);
        } else {
            m4btn10.setText("");
        }

        if (saveUserID4.contains("save11")) {
            getMessagefromSP11 = saveUserID4.getString("save11", "");
            m4btn11.setText(getMessagefromSP11);
        } else {
            m4btn11.setText("");
        }

        if (saveUserID4.contains("save12")) {
            getMessagefromSP12 = saveUserID4.getString("save12", "");
            m4btn12.setText(getMessagefromSP12);
        } else {
            m4btn12.setText("");
        }

        if (saveUserID4.contains("save13")) {
            getMessagefromSP13 = saveUserID4.getString("save13", "");
            m4btn13.setText(getMessagefromSP13);
        } else {
            m4btn13.setText("");
        }

        if (saveUserID4.contains("save14")) {
            getMessagefromSP14 = saveUserID4.getString("save14", "");
            m4btn14.setText(getMessagefromSP14);
        } else {
            m4btn14.setText("");
        }

        if (saveUserID4.contains("save15")) {
            getMessagefromSP15 = saveUserID4.getString("save15", "");
            m4btn15.setText(getMessagefromSP15);
        } else {
            m4btn15.setText("");
        }

        if (saveUserID4.contains("save16")) {
            getMessagefromSP16 = saveUserID4.getString("save16", "");
            m4btn16.setText(getMessagefromSP16);
        } else {
            m4btn16.setText("");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
