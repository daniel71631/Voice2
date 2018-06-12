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

public class Page7FG extends Fragment {

    private Button m7btn1, m7btn2,m7btn3, m7btn4, m7btn5, m7btn6, m7btn7, m7btn8, m7btn9, m7btn10, m7btn11,
            m7btn12, m7btn13, m7btn14, m7btn15, m7btn16;
    private Button m7btnDelete;
    private SpeechRecognizer mSpeechRecognizer;
    private android.content.Intent mSpeechRecognizerIntent;
    private ArrayList<String> matches7;
    private String TAG="Page7";
    private String getMessage, getMessagefromSP1, getMessagefromSP2, getMessagefromSP3, getMessagefromSP4, getMessagefromSP5, getMessagefromSP6, getMessagefromSP7, getMessagefromSP8, getMessagefromSP9,
            getMessagefromSP10, getMessagefromSP11, getMessagefromSP12, getMessagefromSP13, getMessagefromSP14, getMessagefromSP15, getMessagefromSP16;
    private long startTime=0;
    private long endTime=0;
    private SharedPreferences saveUserID7;
    private static final String data = "DATA7";
    private int clickCount = 0;
    private long StartTime;
    private long duration;
    final Handler handler = new Handler();

    public static Fragment newInstance(){
        Page7FG fragment = new Page7FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveUserID7=getActivity().getSharedPreferences(data,0);

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
                matches7 = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        getMessage=matches7.get(0);
                        if(getMessage!=null && m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText(getMessage);
                            saveUserID7.edit().putString("save1", getMessage).commit();
                        }else if(getMessage!=null && m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText(getMessage);
                            saveUserID7.edit().putString("save2", getMessage).commit();
                        }else if(getMessage!=null && m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText(getMessage);
                            saveUserID7.edit().putString("save3", getMessage).commit();
                        }else if(getMessage!=null && m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText(getMessage);
                            saveUserID7.edit().putString("save4", getMessage).commit();
                        }else if(getMessage!=null && m7btn5.getText().toString()=="Listening"){
                            m7btn5.setText(getMessage);
                            saveUserID7.edit().putString("save5", getMessage).commit();
                        }else if(getMessage!=null && m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText(getMessage);
                            saveUserID7.edit().putString("save6", getMessage).commit();
                        }else if(getMessage!=null && m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText(getMessage);
                            saveUserID7.edit().putString("save7", getMessage).commit();
                        }else if(getMessage!=null && m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText(getMessage);
                            saveUserID7.edit().putString("save8", getMessage).commit();
                        }else if(getMessage!=null && m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText(getMessage);
                            saveUserID7.edit().putString("save9", getMessage).commit();
                        }else if(getMessage!=null && m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText(getMessage);
                            saveUserID7.edit().putString("save10", getMessage).commit();
                        }else if(getMessage!=null && m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText(getMessage);
                            saveUserID7.edit().putString("save11", getMessage).commit();
                        }else if(getMessage!=null && m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText(getMessage);
                            saveUserID7.edit().putString("save12", getMessage).commit();
                        }else if(getMessage!=null && m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText(getMessage);
                            saveUserID7.edit().putString("save13", getMessage).commit();
                        }else if(getMessage!=null && m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText(getMessage);
                            saveUserID7.edit().putString("save14", getMessage).commit();
                        }else if(getMessage!=null && m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText(getMessage);
                            saveUserID7.edit().putString("save15", getMessage).commit();
                        }else if(getMessage!=null && m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText(getMessage);
                            saveUserID7.edit().putString("save16", getMessage).commit();
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
        final View view = inflater.inflate(R.layout.page7fg, container, false);
        iniview(view);

        m7btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn1.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn1.setText("");
                                saveUserID7.edit().remove("save1").commit();
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

        m7btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn2.setText("Listening");

                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn2.setText("");
                                saveUserID7.edit().remove("save2").commit();
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

        m7btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn3.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn3.setText("");
                                saveUserID7.edit().remove("save3").commit();
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

        m7btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn4.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn4.setText("");
                                saveUserID7.edit().remove("save4").commit();
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

        m7btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn5.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn5.setText("");
                                saveUserID7.edit().remove("save5").commit();
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

        m7btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn6.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn6.setText("");
                                saveUserID7.edit().remove("save6").commit();
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

        m7btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn7.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn7.setText("");
                                saveUserID7.edit().remove("save7").commit();
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

        m7btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn8.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn8.setText("");
                                saveUserID7.edit().remove("save8").commit();
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

        m7btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn9.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn9.setText("");
                                saveUserID7.edit().remove("save9").commit();
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

        m7btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn10.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn10.setText("");
                                saveUserID7.edit().remove("save10").commit();
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
        m7btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn11.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn11.setText("");
                                saveUserID7.edit().remove("save11").commit();
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

        m7btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn12.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn12.setText("");
                                saveUserID7.edit().remove("save12").commit();
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

        m7btn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn13.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn13.setText("");
                                saveUserID7.edit().remove("save13").commit();
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

        m7btn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn14.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn14.setText("");
                                saveUserID7.edit().remove("save14").commit();
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
        m7btn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn15.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
                        }
                        if(m7btn16.getText().toString()=="Listening"){
                            m7btn16.setText("");
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
                                m7btn15.setText("");
                                saveUserID7.edit().remove("save15").commit();
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

        m7btn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m7btn16.setText("Listening");

                        if(m7btn2.getText().toString()=="Listening"){
                            m7btn2.setText("");
                        }
                        if(m7btn3.getText().toString()=="Listening"){
                            m7btn3.setText("");
                        }
                        if(m7btn4.getText().toString()=="Listening"){
                            m7btn4.setText("");
                        }
                        if(m7btn5.getText().toString()=="Listening") {
                            m7btn5.setText("");
                        }
                        if(m7btn6.getText().toString()=="Listening"){
                            m7btn6.setText("");
                        }
                        if(m7btn7.getText().toString()=="Listening"){
                            m7btn7.setText("");
                        }
                        if(m7btn8.getText().toString()=="Listening"){
                            m7btn8.setText("");
                        }
                        if(m7btn9.getText().toString()=="Listening"){
                            m7btn9.setText("");
                        }
                        if(m7btn10.getText().toString()=="Listening"){
                            m7btn10.setText("");
                        }
                        if(m7btn11.getText().toString()=="Listening"){
                            m7btn11.setText("");
                        }
                        if(m7btn12.getText().toString()=="Listening"){
                            m7btn12.setText("");
                        }
                        if(m7btn13.getText().toString()=="Listening"){
                            m7btn13.setText("");
                        }
                        if(m7btn14.getText().toString()=="Listening"){
                            m7btn14.setText("");
                        }
                        if(m7btn15.getText().toString()=="Listening"){
                            m7btn15.setText("");
                        }
                        if(m7btn1.getText().toString()=="Listening"){
                            m7btn1.setText("");
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
                                m7btn16.setText("");
                                saveUserID7.edit().remove("save16").commit();
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

        m7btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //matches.clear();
                saveUserID7.edit().clear().commit();
                m7btn1.setText("");
                m7btn2.setText("");
                m7btn3.setText("");
                m7btn4.setText("");
                m7btn5.setText("");
                m7btn6.setText("");
                m7btn7.setText("");
                m7btn8.setText("");
                m7btn9.setText("");
                m7btn10.setText("");
                m7btn11.setText("");
                m7btn12.setText("");
                m7btn13.setText("");
                m7btn14.setText("");
                m7btn15.setText("");
                m7btn16.setText("");
            }
        });
        return view;
    }

    private void iniview(View view) {
        ButtonView(view);
    }

    private void ButtonView(View view) {
        m7btnDelete = (Button) view.findViewById(R.id.btnDelete7);
        m7btn1 = (Button) view.findViewById(R.id.btn1_7);
        m7btn2 = (Button) view.findViewById(R.id.btn2_7);
        m7btn3 = (Button) view.findViewById(R.id.btn3_7);
        m7btn4 = (Button) view.findViewById(R.id.btn4_7);
        m7btn5 = (Button) view.findViewById(R.id.btn5_7);
        m7btn6 = (Button) view.findViewById(R.id.btn6_7);
        m7btn7 = (Button) view.findViewById(R.id.btn7_7);
        m7btn8 = (Button) view.findViewById(R.id.btn8_7);
        m7btn9 = (Button) view.findViewById(R.id.btn9_7);
        m7btn10 = (Button) view.findViewById(R.id.btn10_7);
        m7btn11 = (Button) view.findViewById(R.id.btn11_7);
        m7btn12 = (Button) view.findViewById(R.id.btn12_7);
        m7btn13 = (Button) view.findViewById(R.id.btn13_7);
        m7btn14 = (Button) view.findViewById(R.id.btn14_7);
        m7btn15 = (Button) view.findViewById(R.id.btn15_7);
        m7btn16 = (Button) view.findViewById(R.id.btn16_7);

        if (saveUserID7.contains("save1")) {
            getMessagefromSP1 = saveUserID7.getString("save1", "");
            m7btn1.setText(getMessagefromSP1);
        } else {
            m7btn1.setText("");
        }

        if (saveUserID7.contains("save2")) {
            getMessagefromSP2 = saveUserID7.getString("save2", "");
            m7btn2.setText(getMessagefromSP2);
        } else {
            m7btn2.setText("");
        }

        if (saveUserID7.contains("save3")) {
            getMessagefromSP3 = saveUserID7.getString("save3", "");
            m7btn3.setText(getMessagefromSP3);
        } else {
            m7btn3.setText("");
        }

        if (saveUserID7.contains("save4")) {
            getMessagefromSP4 = saveUserID7.getString("save4", "");
            m7btn4.setText(getMessagefromSP4);
        } else {
            m7btn4.setText("");
        }

        if (saveUserID7.contains("save5")) {
            getMessagefromSP5 = saveUserID7.getString("save5", "");
            m7btn5.setText(getMessagefromSP5);
        } else {
            m7btn5.setText("");
        }

        if (saveUserID7.contains("save6")) {
            getMessagefromSP6 = saveUserID7.getString("save6", "");
            m7btn6.setText(getMessagefromSP6);
        } else {
            m7btn6.setText("");
        }

        if (saveUserID7.contains("save7")) {
            getMessagefromSP7 = saveUserID7.getString("save7", "");
            m7btn7.setText(getMessagefromSP7);
        } else {
            m7btn7.setText("");
        }

        if (saveUserID7.contains("save8")) {
            getMessagefromSP8 = saveUserID7.getString("save8", "");
            m7btn8.setText(getMessagefromSP8);
        } else {
            m7btn8.setText("");
        }

        if (saveUserID7.contains("save9")) {
            getMessagefromSP9 = saveUserID7.getString("save9", "");
            m7btn9.setText(getMessagefromSP9);
        } else {
            m7btn9.setText("");
        }

        if (saveUserID7.contains("save10")) {
            getMessagefromSP10 = saveUserID7.getString("save10", "");
            m7btn10.setText(getMessagefromSP10);
        } else {
            m7btn10.setText("");
        }

        if (saveUserID7.contains("save11")) {
            getMessagefromSP11 = saveUserID7.getString("save11", "");
            m7btn11.setText(getMessagefromSP11);
        } else {
            m7btn11.setText("");
        }

        if (saveUserID7.contains("save12")) {
            getMessagefromSP12 = saveUserID7.getString("save12", "");
            m7btn12.setText(getMessagefromSP12);
        } else {
            m7btn12.setText("");
        }

        if (saveUserID7.contains("save13")) {
            getMessagefromSP13 = saveUserID7.getString("save13", "");
            m7btn13.setText(getMessagefromSP13);
        } else {
            m7btn13.setText("");
        }

        if (saveUserID7.contains("save14")) {
            getMessagefromSP14 = saveUserID7.getString("save14", "");
            m7btn14.setText(getMessagefromSP14);
        } else {
            m7btn14.setText("");
        }

        if (saveUserID7.contains("save15")) {
            getMessagefromSP15 = saveUserID7.getString("save15", "");
            m7btn15.setText(getMessagefromSP15);
        } else {
            m7btn15.setText("");
        }

        if (saveUserID7.contains("save16")) {
            getMessagefromSP16 = saveUserID7.getString("save16", "");
            m7btn16.setText(getMessagefromSP16);
        } else {
            m7btn16.setText("");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
