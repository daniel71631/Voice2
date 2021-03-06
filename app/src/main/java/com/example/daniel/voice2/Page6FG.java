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

public class Page6FG extends Fragment {

    private Button m6btn1, m6btn2,m6btn3, m6btn4, m6btn5, m6btn6, m6btn7, m6btn8, m6btn9, m6btn10, m6btn11,
            m6btn12, m6btn13, m6btn14, m6btn15, m6btn16;
    private Button m6btnDelete;
    private SpeechRecognizer mSpeechRecognizer;
    private android.content.Intent mSpeechRecognizerIntent;
    private ArrayList<String> matches6;
    private String TAG="Page6";
    private String getMessage, getMessagefromSP1, getMessagefromSP2, getMessagefromSP3, getMessagefromSP4, getMessagefromSP5, getMessagefromSP6, getMessagefromSP7, getMessagefromSP8, getMessagefromSP9,
            getMessagefromSP10, getMessagefromSP11, getMessagefromSP12, getMessagefromSP13, getMessagefromSP14, getMessagefromSP15, getMessagefromSP16;
    private long startTime=0;
    private long endTime=0;
    private SharedPreferences saveUserID6;
    private static final String data = "DATA6";
    private int clickCount = 0;
    private long StartTime;
    private long duration;
    final Handler handler = new Handler();

    public static Fragment newInstance(){
        Page6FG fragment = new Page6FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveUserID6=getActivity().getSharedPreferences(data,0);

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
                matches6 = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        getMessage=matches6.get(0);
                        if(getMessage!=null && m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText(getMessage);
                            saveUserID6.edit().putString("save1", getMessage).commit();
                        }else if(getMessage!=null && m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText(getMessage);
                            saveUserID6.edit().putString("save2", getMessage).commit();
                        }else if(getMessage!=null && m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText(getMessage);
                            saveUserID6.edit().putString("save3", getMessage).commit();
                        }else if(getMessage!=null && m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText(getMessage);
                            saveUserID6.edit().putString("save4", getMessage).commit();
                        }else if(getMessage!=null && m6btn5.getText().toString()=="Listening"){
                            m6btn5.setText(getMessage);
                            saveUserID6.edit().putString("save5", getMessage).commit();
                        }else if(getMessage!=null && m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText(getMessage);
                            saveUserID6.edit().putString("save6", getMessage).commit();
                        }else if(getMessage!=null && m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText(getMessage);
                            saveUserID6.edit().putString("save7", getMessage).commit();
                        }else if(getMessage!=null && m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText(getMessage);
                            saveUserID6.edit().putString("save8", getMessage).commit();
                        }else if(getMessage!=null && m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText(getMessage);
                            saveUserID6.edit().putString("save9", getMessage).commit();
                        }else if(getMessage!=null && m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText(getMessage);
                            saveUserID6.edit().putString("save10", getMessage).commit();
                        }else if(getMessage!=null && m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText(getMessage);
                            saveUserID6.edit().putString("save11", getMessage).commit();
                        }else if(getMessage!=null && m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText(getMessage);
                            saveUserID6.edit().putString("save12", getMessage).commit();
                        }else if(getMessage!=null && m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText(getMessage);
                            saveUserID6.edit().putString("save13", getMessage).commit();
                        }else if(getMessage!=null && m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText(getMessage);
                            saveUserID6.edit().putString("save14", getMessage).commit();
                        }else if(getMessage!=null && m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText(getMessage);
                            saveUserID6.edit().putString("save15", getMessage).commit();
                        }else if(getMessage!=null && m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText(getMessage);
                            saveUserID6.edit().putString("save16", getMessage).commit();
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
        final View view = inflater.inflate(R.layout.page6fg, container, false);
        iniview(view);

        m6btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn1.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn1.setText("");
                                saveUserID6.edit().remove("save1").commit();
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

        m6btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn2.setText("Listening");

                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn2.setText("");
                                saveUserID6.edit().remove("save2").commit();
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

        m6btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn3.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn3.setText("");
                                saveUserID6.edit().remove("save3").commit();
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

        m6btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn4.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn4.setText("");
                                saveUserID6.edit().remove("save4").commit();
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

        m6btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn5.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening") {
                            m6btn1.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn5.setText("");
                                saveUserID6.edit().remove("save5").commit();
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

        m6btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn6.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn6.setText("");
                                saveUserID6.edit().remove("save6").commit();
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

        m6btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn7.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn7.setText("");
                                saveUserID6.edit().remove("save7").commit();
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

        m6btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn8.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn8.setText("");
                                saveUserID6.edit().remove("save8").commit();
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

        m6btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn9.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn9.setText("");
                                saveUserID6.edit().remove("save9").commit();
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

        m6btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn10.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn10.setText("");
                                saveUserID6.edit().remove("save10").commit();
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
        m6btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn11.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn11.setText("");
                                saveUserID6.edit().remove("save11").commit();
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

        m6btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn12.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn12.setText("");
                                saveUserID6.edit().remove("save12").commit();
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

        m6btn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn13.setText("Listening");


                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn13.setText("");
                                saveUserID6.edit().remove("save13").commit();
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

        m6btn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn14.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn14.setText("");
                                saveUserID6.edit().remove("save14").commit();
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
        m6btn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn15.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
                        }
                        if(m6btn16.getText().toString()=="Listening"){
                            m6btn16.setText("");
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
                                m6btn15.setText("");
                                saveUserID6.edit().remove("save15").commit();
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

        m6btn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m6btn16.setText("Listening");

                        if(m6btn2.getText().toString()=="Listening"){
                            m6btn2.setText("");
                        }
                        if(m6btn3.getText().toString()=="Listening"){
                            m6btn3.setText("");
                        }
                        if(m6btn4.getText().toString()=="Listening"){
                            m6btn4.setText("");
                        }
                        if(m6btn5.getText().toString()=="Listening") {
                            m6btn5.setText("");
                        }
                        if(m6btn6.getText().toString()=="Listening"){
                            m6btn6.setText("");
                        }
                        if(m6btn7.getText().toString()=="Listening"){
                            m6btn7.setText("");
                        }
                        if(m6btn8.getText().toString()=="Listening"){
                            m6btn8.setText("");
                        }
                        if(m6btn9.getText().toString()=="Listening"){
                            m6btn9.setText("");
                        }
                        if(m6btn10.getText().toString()=="Listening"){
                            m6btn10.setText("");
                        }
                        if(m6btn11.getText().toString()=="Listening"){
                            m6btn11.setText("");
                        }
                        if(m6btn12.getText().toString()=="Listening"){
                            m6btn12.setText("");
                        }
                        if(m6btn13.getText().toString()=="Listening"){
                            m6btn13.setText("");
                        }
                        if(m6btn14.getText().toString()=="Listening"){
                            m6btn14.setText("");
                        }
                        if(m6btn15.getText().toString()=="Listening"){
                            m6btn15.setText("");
                        }
                        if(m6btn1.getText().toString()=="Listening"){
                            m6btn1.setText("");
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
                                m6btn16.setText("");
                                saveUserID6.edit().remove("save16").commit();
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

        m6btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //matches.clear();
                saveUserID6.edit().clear().commit();
                m6btn1.setText("");
                m6btn2.setText("");
                m6btn3.setText("");
                m6btn4.setText("");
                m6btn5.setText("");
                m6btn6.setText("");
                m6btn7.setText("");
                m6btn8.setText("");
                m6btn9.setText("");
                m6btn10.setText("");
                m6btn11.setText("");
                m6btn12.setText("");
                m6btn13.setText("");
                m6btn14.setText("");
                m6btn15.setText("");
                m6btn16.setText("");
            }
        });
        return view;
    }

    private void iniview(View view) {
        ButtonView(view);
    }

    private void ButtonView(View view) {
        m6btnDelete = (Button) view.findViewById(R.id.btnDelete6);
        m6btn1 = (Button) view.findViewById(R.id.btn1_6);
        m6btn2 = (Button) view.findViewById(R.id.btn2_6);
        m6btn3 = (Button) view.findViewById(R.id.btn3_6);
        m6btn4 = (Button) view.findViewById(R.id.btn4_6);
        m6btn5 = (Button) view.findViewById(R.id.btn5_6);
        m6btn6 = (Button) view.findViewById(R.id.btn6_6);
        m6btn7 = (Button) view.findViewById(R.id.btn7_6);
        m6btn8 = (Button) view.findViewById(R.id.btn8_6);
        m6btn9 = (Button) view.findViewById(R.id.btn9_6);
        m6btn10 = (Button) view.findViewById(R.id.btn10_6);
        m6btn11 = (Button) view.findViewById(R.id.btn11_6);
        m6btn12 = (Button) view.findViewById(R.id.btn12_6);
        m6btn13 = (Button) view.findViewById(R.id.btn13_6);
        m6btn14 = (Button) view.findViewById(R.id.btn14_6);
        m6btn15 = (Button) view.findViewById(R.id.btn15_6);
        m6btn16 = (Button) view.findViewById(R.id.btn16_6);

        if (saveUserID6.contains("save1")) {
            getMessagefromSP1 = saveUserID6.getString("save1", "");
            m6btn1.setText(getMessagefromSP1);
        } else {
            m6btn1.setText("");
        }

        if (saveUserID6.contains("save2")) {
            getMessagefromSP2 = saveUserID6.getString("save2", "");
            m6btn2.setText(getMessagefromSP2);
        } else {
            m6btn2.setText("");
        }

        if (saveUserID6.contains("save3")) {
            getMessagefromSP3 = saveUserID6.getString("save3", "");
            m6btn3.setText(getMessagefromSP3);
        } else {
            m6btn3.setText("");
        }

        if (saveUserID6.contains("save4")) {
            getMessagefromSP4 = saveUserID6.getString("save4", "");
            m6btn4.setText(getMessagefromSP4);
        } else {
            m6btn4.setText("");
        }

        if (saveUserID6.contains("save5")) {
            getMessagefromSP5 = saveUserID6.getString("save5", "");
            m6btn5.setText(getMessagefromSP5);
        } else {
            m6btn5.setText("");
        }

        if (saveUserID6.contains("save6")) {
            getMessagefromSP6 = saveUserID6.getString("save6", "");
            m6btn6.setText(getMessagefromSP6);
        } else {
            m6btn6.setText("");
        }

        if (saveUserID6.contains("save7")) {
            getMessagefromSP7 = saveUserID6.getString("save7", "");
            m6btn7.setText(getMessagefromSP7);
        } else {
            m6btn7.setText("");
        }

        if (saveUserID6.contains("save8")) {
            getMessagefromSP8 = saveUserID6.getString("save8", "");
            m6btn8.setText(getMessagefromSP8);
        } else {
            m6btn8.setText("");
        }

        if (saveUserID6.contains("save9")) {
            getMessagefromSP9 = saveUserID6.getString("save9", "");
            m6btn9.setText(getMessagefromSP9);
        } else {
            m6btn9.setText("");
        }

        if (saveUserID6.contains("save10")) {
            getMessagefromSP10 = saveUserID6.getString("save10", "");
            m6btn10.setText(getMessagefromSP10);
        } else {
            m6btn10.setText("");
        }

        if (saveUserID6.contains("save11")) {
            getMessagefromSP11 = saveUserID6.getString("save11", "");
            m6btn11.setText(getMessagefromSP11);
        } else {
            m6btn11.setText("");
        }

        if (saveUserID6.contains("save12")) {
            getMessagefromSP12 = saveUserID6.getString("save12", "");
            m6btn12.setText(getMessagefromSP12);
        } else {
            m6btn12.setText("");
        }

        if (saveUserID6.contains("save13")) {
            getMessagefromSP13 = saveUserID6.getString("save13", "");
            m6btn13.setText(getMessagefromSP13);
        } else {
            m6btn13.setText("");
        }

        if (saveUserID6.contains("save14")) {
            getMessagefromSP14 = saveUserID6.getString("save14", "");
            m6btn14.setText(getMessagefromSP14);
        } else {
            m6btn14.setText("");
        }

        if (saveUserID6.contains("save15")) {
            getMessagefromSP15 = saveUserID6.getString("save15", "");
            m6btn15.setText(getMessagefromSP15);
        } else {
            m6btn15.setText("");
        }

        if (saveUserID6.contains("save16")) {
            getMessagefromSP16 = saveUserID6.getString("save16", "");
            m6btn16.setText(getMessagefromSP16);
        } else {
            m6btn16.setText("");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
