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

public class Page2FG extends Fragment {

    private Button m2btn1, m2btn2,m2btn3, m2btn4, m2btn5, m2btn6, m2btn7, m2btn8, m2btn9, m2btn10, m2btn11,
            m2btn12, m2btn13, m2btn14, m2btn15, m2btn16;
    private Button m2btnDelete;
    private SpeechRecognizer mSpeechRecognizer;
    private android.content.Intent mSpeechRecognizerIntent;
    private ArrayList<String> matches2;
    private String TAG="Page2";
    private String getMessage, getMessagefromSP1, getMessagefromSP2, getMessagefromSP3, getMessagefromSP4, getMessagefromSP5, getMessagefromSP6, getMessagefromSP7, getMessagefromSP8, getMessagefromSP9,
            getMessagefromSP10, getMessagefromSP11, getMessagefromSP12, getMessagefromSP13, getMessagefromSP14, getMessagefromSP15, getMessagefromSP16;
    private long startTime=0;
    private long endTime=0;
    private SharedPreferences saveUserID2;
    private static final String data = "DATA2";
    private int clickCount = 0;
    private long StartTime;
    private long duration;
    final Handler handler = new Handler();


    public static Fragment newInstance(){
        Page2FG fragment = new Page2FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveUserID2=getActivity().getSharedPreferences(data,0);

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
                matches2 = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        getMessage=matches2.get(0);
                        if(getMessage!=null && m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText(getMessage);
                            saveUserID2.edit().putString("save1", getMessage).commit();
                        }else if(getMessage!=null && m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText(getMessage);
                            saveUserID2.edit().putString("save2", getMessage).commit();
                        }else if(getMessage!=null && m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText(getMessage);
                            saveUserID2.edit().putString("save3", getMessage).commit();
                        }else if(getMessage!=null && m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText(getMessage);
                            saveUserID2.edit().putString("save4", getMessage).commit();
                        }else if(getMessage!=null && m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText(getMessage);
                            saveUserID2.edit().putString("save5", getMessage).commit();
                        }else if(getMessage!=null && m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText(getMessage);
                            saveUserID2.edit().putString("save6", getMessage).commit();
                        }else if(getMessage!=null && m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText(getMessage);
                            saveUserID2.edit().putString("save7", getMessage).commit();
                        }else if(getMessage!=null && m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText(getMessage);
                            saveUserID2.edit().putString("save8", getMessage).commit();
                        }else if(getMessage!=null && m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText(getMessage);
                            saveUserID2.edit().putString("save9", getMessage).commit();
                        }else if(getMessage!=null && m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText(getMessage);
                            saveUserID2.edit().putString("save10", getMessage).commit();
                        }else if(getMessage!=null && m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText(getMessage);
                            saveUserID2.edit().putString("save11", getMessage).commit();
                        }else if(getMessage!=null && m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText(getMessage);
                            saveUserID2.edit().putString("save12", getMessage).commit();
                        }else if(getMessage!=null && m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText(getMessage);
                            saveUserID2.edit().putString("save13", getMessage).commit();
                        }else if(getMessage!=null && m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText(getMessage);
                            saveUserID2.edit().putString("save14", getMessage).commit();
                        }else if(getMessage!=null && m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText(getMessage);
                            saveUserID2.edit().putString("save15", getMessage).commit();
                        }else if(getMessage!=null && m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText(getMessage);
                            saveUserID2.edit().putString("save16", getMessage).commit();
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
        final View view = inflater.inflate(R.layout.page2fg, container, false);
        iniview(view);

        m2btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn1.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn1.setText("");
                                saveUserID2.edit().remove("save1").commit();
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

        m2btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn2.setText("Listening");

                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn2.setText("");
                                saveUserID2.edit().remove("save2").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn2.setText("");
                    saveUserID2.edit().remove("save2").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn3.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn3.setText("");
                                saveUserID2.edit().remove("save3").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn3.setText("");
                    saveUserID2.edit().remove("save3").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn4.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn4.setText("");
                                saveUserID2.edit().remove("save4").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn4.setText("");
                    saveUserID2.edit().remove("save4").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn5.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn5.setText("");
                                saveUserID2.edit().remove("save5").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn5.setText("");
                    saveUserID2.edit().remove("save5").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn6.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn6.setText("");
                                saveUserID2.edit().remove("save6").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn6.setText("");
                    saveUserID2.edit().remove("save6").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn7.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn7.setText("");
                                saveUserID2.edit().remove("save7").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn8.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn8.setText("");
                                saveUserID2.edit().remove("save8").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn9.setText("Listening");


                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn9.setText("");
                                saveUserID2.edit().remove("save9").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn10.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn10.setText("");
                                saveUserID2.edit().remove("save10").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });
        m2btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn11.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn11.setText("");
                                saveUserID2.edit().remove("save11").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn12.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn12.setText("");
                                saveUserID2.edit().remove("save12").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn13.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn13.setText("");
                                saveUserID2.edit().remove("save13").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn14.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn14.setText("");
                                saveUserID2.edit().remove("save14").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });
        m2btn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn15.setText("Listening");


                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
                        }
                        if(m2btn16.getText().toString()=="Listening"){
                            m2btn16.setText("");
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
                                m2btn15.setText("");
                                saveUserID2.edit().remove("save15").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m2btn16.setText("Listening");

                        if(m2btn2.getText().toString()=="Listening"){
                            m2btn2.setText("");
                        }
                        if(m2btn3.getText().toString()=="Listening"){
                            m2btn3.setText("");
                        }
                        if(m2btn4.getText().toString()=="Listening"){
                            m2btn4.setText("");
                        }
                        if(m2btn5.getText().toString()=="Listening"){
                            m2btn5.setText("");
                        }
                        if(m2btn6.getText().toString()=="Listening"){
                            m2btn6.setText("");
                        }
                        if(m2btn7.getText().toString()=="Listening"){
                            m2btn7.setText("");
                        }
                        if(m2btn8.getText().toString()=="Listening"){
                            m2btn8.setText("");
                        }
                        if(m2btn9.getText().toString()=="Listening"){
                            m2btn9.setText("");
                        }
                        if(m2btn10.getText().toString()=="Listening"){
                            m2btn10.setText("");
                        }
                        if(m2btn11.getText().toString()=="Listening"){
                            m2btn11.setText("");
                        }
                        if(m2btn12.getText().toString()=="Listening"){
                            m2btn12.setText("");
                        }
                        if(m2btn13.getText().toString()=="Listening"){
                            m2btn13.setText("");
                        }
                        if(m2btn14.getText().toString()=="Listening"){
                            m2btn14.setText("");
                        }
                        if(m2btn15.getText().toString()=="Listening"){
                            m2btn15.setText("");
                        }
                        if(m2btn1.getText().toString()=="Listening"){
                            m2btn1.setText("");
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
                                m2btn16.setText("");
                                saveUserID2.edit().remove("save16").commit();
                            }
                            clickCount = 0;
                            duration = 0;
                        }
                        break;
                }
                /*if(endTime-startTime>2000){
                    Log.d(TAG,"TEST");
                    m2btn7.setText("");
                    saveUserID2.edit().remove("save7").commit();
                    return true;
                }*/
                return false;
            }
        });

        m2btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //matches.clear();
                saveUserID2.edit().clear().commit();
                m2btn1.setText("");
                m2btn2.setText("");
                m2btn3.setText("");
                m2btn4.setText("");
                m2btn5.setText("");
                m2btn6.setText("");
                m2btn7.setText("");
                m2btn8.setText("");
                m2btn9.setText("");
                m2btn10.setText("");
                m2btn11.setText("");
                m2btn12.setText("");
                m2btn13.setText("");
                m2btn14.setText("");
                m2btn15.setText("");
                m2btn16.setText("");
            }
        });
        return view;
    }

    private void iniview(View view) {
        ButtonView(view);
    }

    private void ButtonView(View view) {
        m2btnDelete = (Button) view.findViewById(R.id.btnDelete2);
        m2btn1 = (Button) view.findViewById(R.id.btn1_2);
        m2btn2 = (Button) view.findViewById(R.id.btn2_2);
        m2btn3 = (Button) view.findViewById(R.id.btn3_2);
        m2btn4 = (Button) view.findViewById(R.id.btn4_2);
        m2btn5 = (Button) view.findViewById(R.id.btn5_2);
        m2btn6 = (Button) view.findViewById(R.id.btn6_2);
        m2btn7 = (Button) view.findViewById(R.id.btn7_2);
        m2btn8 = (Button) view.findViewById(R.id.btn8_2);
        m2btn9 = (Button) view.findViewById(R.id.btn9_2);
        m2btn10 = (Button) view.findViewById(R.id.btn10_2);
        m2btn11 = (Button) view.findViewById(R.id.btn11_2);
        m2btn12 = (Button) view.findViewById(R.id.btn12_2);
        m2btn13 = (Button) view.findViewById(R.id.btn13_2);
        m2btn14 = (Button) view.findViewById(R.id.btn14_2);
        m2btn15 = (Button) view.findViewById(R.id.btn15_2);
        m2btn16 = (Button) view.findViewById(R.id.btn16_2);

        if (saveUserID2.contains("save1")) {
            getMessagefromSP1 = saveUserID2.getString("save1", "");
            m2btn1.setText(getMessagefromSP1);
        } else {
            m2btn1.setText("");
        }

        if (saveUserID2.contains("save2")) {
            getMessagefromSP2 = saveUserID2.getString("save2", "");
            m2btn2.setText(getMessagefromSP2);
        } else {
            m2btn2.setText("");
        }

        if (saveUserID2.contains("save3")) {
            getMessagefromSP3 = saveUserID2.getString("save3", "");
            m2btn3.setText(getMessagefromSP3);
        } else {
            m2btn3.setText("");
        }

        if (saveUserID2.contains("save4")) {
            getMessagefromSP4 = saveUserID2.getString("save4", "");
            m2btn4.setText(getMessagefromSP4);
        } else {
            m2btn4.setText("");
        }

        if (saveUserID2.contains("save5")) {
            getMessagefromSP5 = saveUserID2.getString("save5", "");
            m2btn5.setText(getMessagefromSP5);
        } else {
            m2btn5.setText("");
        }

        if (saveUserID2.contains("save6")) {
            getMessagefromSP6 = saveUserID2.getString("save6", "");
            m2btn6.setText(getMessagefromSP6);
        } else {
            m2btn6.setText("");
        }

        if (saveUserID2.contains("save7")) {
            getMessagefromSP7 = saveUserID2.getString("save7", "");
            m2btn7.setText(getMessagefromSP7);
        } else {
            m2btn7.setText("");
        }

        if (saveUserID2.contains("save8")) {
            getMessagefromSP8 = saveUserID2.getString("save8", "");
            m2btn8.setText(getMessagefromSP8);
        } else {
            m2btn8.setText("");
        }

        if (saveUserID2.contains("save9")) {
            getMessagefromSP9 = saveUserID2.getString("save9", "");
            m2btn9.setText(getMessagefromSP9);
        } else {
            m2btn9.setText("");
        }

        if (saveUserID2.contains("save10")) {
            getMessagefromSP10 = saveUserID2.getString("save10", "");
            m2btn10.setText(getMessagefromSP10);
        } else {
            m2btn10.setText("");
        }

        if (saveUserID2.contains("save11")) {
            getMessagefromSP11 = saveUserID2.getString("save11", "");
            m2btn11.setText(getMessagefromSP11);
        } else {
            m2btn11.setText("");
        }

        if (saveUserID2.contains("save12")) {
            getMessagefromSP12 = saveUserID2.getString("save12", "");
            m2btn12.setText(getMessagefromSP12);
        } else {
            m2btn12.setText("");
        }

        if (saveUserID2.contains("save13")) {
            getMessagefromSP13 = saveUserID2.getString("save13", "");
            m2btn13.setText(getMessagefromSP13);
        } else {
            m2btn13.setText("");
        }

        if (saveUserID2.contains("save14")) {
            getMessagefromSP14 = saveUserID2.getString("save14", "");
            m2btn14.setText(getMessagefromSP14);
        } else {
            m2btn14.setText("");
        }

        if (saveUserID2.contains("save15")) {
            getMessagefromSP15 = saveUserID2.getString("save15", "");
            m2btn15.setText(getMessagefromSP15);
        } else {
            m2btn15.setText("");
        }

        if (saveUserID2.contains("save16")) {
            getMessagefromSP16 = saveUserID2.getString("save16", "");
            m2btn16.setText(getMessagefromSP16);
        } else {
            m2btn16.setText("");
        }
    }

    @Override

    public void onDestroy() {
        super.onDestroy();
    }
}
