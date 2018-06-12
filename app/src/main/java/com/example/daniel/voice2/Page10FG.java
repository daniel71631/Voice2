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

public class Page10FG extends Fragment {

    private Button m10btn1, m10btn2,m10btn3, m10btn4, m10btn5, m10btn6, m10btn7, m10btn8, m10btn9, m10btn10, m10btn11,
            m10btn12, m10btn13, m10btn14, m10btn15, m10btn16;
    private Button m10btnDelete;
    private SpeechRecognizer mSpeechRecognizer;
    private android.content.Intent mSpeechRecognizerIntent;
    private ArrayList<String> matches10;
    private String TAG="Page10";
    private String getMessage, getMessagefromSP1, getMessagefromSP2, getMessagefromSP3, getMessagefromSP4, getMessagefromSP5, getMessagefromSP6, getMessagefromSP7, getMessagefromSP8, getMessagefromSP9,
            getMessagefromSP10, getMessagefromSP11, getMessagefromSP12, getMessagefromSP13, getMessagefromSP14, getMessagefromSP15, getMessagefromSP16;
    private long startTime=0;
    private long endTime=0;
    private SharedPreferences saveUserID10;
    private static final String data = "DATA10";
    private int clickCount = 0;
    private long StartTime;
    private long duration;
    final Handler handler = new Handler();

    public static Fragment newInstance(){
        Page10FG fragment = new Page10FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveUserID10=getActivity().getSharedPreferences(data,0);

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
                matches10 = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        getMessage=matches10.get(0);
                        if(getMessage!=null && m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText(getMessage);
                            saveUserID10.edit().putString("save1", getMessage).commit();
                        }else if(getMessage!=null && m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText(getMessage);
                            saveUserID10.edit().putString("save2", getMessage).commit();
                        }else if(getMessage!=null && m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText(getMessage);
                            saveUserID10.edit().putString("save3", getMessage).commit();
                        }else if(getMessage!=null && m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText(getMessage);
                            saveUserID10.edit().putString("save4", getMessage).commit();
                        }else if(getMessage!=null && m10btn5.getText().toString()=="Listening"){
                            m10btn5.setText(getMessage);
                            saveUserID10.edit().putString("save5", getMessage).commit();
                        }else if(getMessage!=null && m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText(getMessage);
                            saveUserID10.edit().putString("save6", getMessage).commit();
                        }else if(getMessage!=null && m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText(getMessage);
                            saveUserID10.edit().putString("save7", getMessage).commit();
                        }else if(getMessage!=null && m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText(getMessage);
                            saveUserID10.edit().putString("save8", getMessage).commit();
                        }else if(getMessage!=null && m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText(getMessage);
                            saveUserID10.edit().putString("save9", getMessage).commit();
                        }else if(getMessage!=null && m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText(getMessage);
                            saveUserID10.edit().putString("save10", getMessage).commit();
                        }else if(getMessage!=null && m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText(getMessage);
                            saveUserID10.edit().putString("save11", getMessage).commit();
                        }else if(getMessage!=null && m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText(getMessage);
                            saveUserID10.edit().putString("save12", getMessage).commit();
                        }else if(getMessage!=null && m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText(getMessage);
                            saveUserID10.edit().putString("save13", getMessage).commit();
                        }else if(getMessage!=null && m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText(getMessage);
                            saveUserID10.edit().putString("save14", getMessage).commit();
                        }else if(getMessage!=null && m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText(getMessage);
                            saveUserID10.edit().putString("save15", getMessage).commit();
                        }else if(getMessage!=null && m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText(getMessage);
                            saveUserID10.edit().putString("save16", getMessage).commit();
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
        final View view = inflater.inflate(R.layout.page10fg, container, false);
        iniview(view);

        m10btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn1.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn1.setText("");
                                saveUserID10.edit().remove("save1").commit();
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

        m10btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn2.setText("Listening");

                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn2.setText("");
                                saveUserID10.edit().remove("save2").commit();
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

        m10btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn3.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn3.setText("");
                                saveUserID10.edit().remove("save3").commit();
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

        m10btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn4.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn4.setText("");
                                saveUserID10.edit().remove("save4").commit();
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

        m10btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn5.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening") {
                            m10btn1.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn5.setText("");
                                saveUserID10.edit().remove("save5").commit();
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

        m10btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn6.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn6.setText("");
                                saveUserID10.edit().remove("save6").commit();
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

        m10btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn7.setText("Listening");


                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn7.setText("");
                                saveUserID10.edit().remove("save7").commit();
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

        m10btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn8.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn8.setText("");
                                saveUserID10.edit().remove("save8").commit();
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

        m10btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn9.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn9.setText("");
                                saveUserID10.edit().remove("save9").commit();
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

        m10btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn10.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn10.setText("");
                                saveUserID10.edit().remove("save10").commit();
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
        m10btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn11.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn11.setText("");
                                saveUserID10.edit().remove("save11").commit();
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

        m10btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn12.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn12.setText("");
                                saveUserID10.edit().remove("save12").commit();
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

        m10btn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn13.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn13.setText("");
                                saveUserID10.edit().remove("save13").commit();
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

        m10btn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn14.setText("Listening");


                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn14.setText("");
                                saveUserID10.edit().remove("save14").commit();
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
        m10btn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn15.setText("Listening");

                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
                        }
                        if(m10btn16.getText().toString()=="Listening"){
                            m10btn16.setText("");
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
                                m10btn15.setText("");
                                saveUserID10.edit().remove("save15").commit();
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

        m10btn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m10btn16.setText("Listening");


                        if(m10btn2.getText().toString()=="Listening"){
                            m10btn2.setText("");
                        }
                        if(m10btn3.getText().toString()=="Listening"){
                            m10btn3.setText("");
                        }
                        if(m10btn4.getText().toString()=="Listening"){
                            m10btn4.setText("");
                        }
                        if(m10btn5.getText().toString()=="Listening") {
                            m10btn5.setText("");
                        }
                        if(m10btn6.getText().toString()=="Listening"){
                            m10btn6.setText("");
                        }
                        if(m10btn7.getText().toString()=="Listening"){
                            m10btn7.setText("");
                        }
                        if(m10btn8.getText().toString()=="Listening"){
                            m10btn8.setText("");
                        }
                        if(m10btn9.getText().toString()=="Listening"){
                            m10btn9.setText("");
                        }
                        if(m10btn10.getText().toString()=="Listening"){
                            m10btn10.setText("");
                        }
                        if(m10btn11.getText().toString()=="Listening"){
                            m10btn11.setText("");
                        }
                        if(m10btn12.getText().toString()=="Listening"){
                            m10btn12.setText("");
                        }
                        if(m10btn13.getText().toString()=="Listening"){
                            m10btn13.setText("");
                        }
                        if(m10btn14.getText().toString()=="Listening"){
                            m10btn14.setText("");
                        }
                        if(m10btn15.getText().toString()=="Listening"){
                            m10btn15.setText("");
                        }
                        if(m10btn1.getText().toString()=="Listening"){
                            m10btn1.setText("");
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
                                m10btn16.setText("");
                                saveUserID10.edit().remove("save16").commit();
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

        m10btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //matches.clear();
                saveUserID10.edit().clear().commit();
                m10btn1.setText("");
                m10btn2.setText("");
                m10btn3.setText("");
                m10btn4.setText("");
                m10btn5.setText("");
                m10btn6.setText("");
                m10btn7.setText("");
                m10btn8.setText("");
                m10btn9.setText("");
                m10btn10.setText("");
                m10btn11.setText("");
                m10btn12.setText("");
                m10btn13.setText("");
                m10btn14.setText("");
                m10btn15.setText("");
                m10btn16.setText("");
            }
        });
        return view;
    }

    private void iniview(View view) {
        ButtonView(view);
    }

    private void ButtonView(View view) {
        m10btnDelete = (Button) view.findViewById(R.id.btnDelete10);
        m10btn1 = (Button) view.findViewById(R.id.btn1_10);
        m10btn2 = (Button) view.findViewById(R.id.btn2_10);
        m10btn3 = (Button) view.findViewById(R.id.btn3_10);
        m10btn4 = (Button) view.findViewById(R.id.btn4_10);
        m10btn5 = (Button) view.findViewById(R.id.btn5_10);
        m10btn6 = (Button) view.findViewById(R.id.btn6_10);
        m10btn7 = (Button) view.findViewById(R.id.btn7_10);
        m10btn8 = (Button) view.findViewById(R.id.btn8_10);
        m10btn9 = (Button) view.findViewById(R.id.btn9_10);
        m10btn10 = (Button) view.findViewById(R.id.btn10_10);
        m10btn11 = (Button) view.findViewById(R.id.btn11_10);
        m10btn12 = (Button) view.findViewById(R.id.btn12_10);
        m10btn13 = (Button) view.findViewById(R.id.btn13_10);
        m10btn14 = (Button) view.findViewById(R.id.btn14_10);
        m10btn15 = (Button) view.findViewById(R.id.btn15_10);
        m10btn16 = (Button) view.findViewById(R.id.btn16_10);

        if (saveUserID10.contains("save1")) {
            getMessagefromSP1 = saveUserID10.getString("save1", "");
            m10btn1.setText(getMessagefromSP1);
        } else {
            m10btn1.setText("");
        }

        if (saveUserID10.contains("save2")) {
            getMessagefromSP2 = saveUserID10.getString("save2", "");
            m10btn2.setText(getMessagefromSP2);
        } else {
            m10btn2.setText("");
        }

        if (saveUserID10.contains("save3")) {
            getMessagefromSP3 = saveUserID10.getString("save3", "");
            m10btn3.setText(getMessagefromSP3);
        } else {
            m10btn3.setText("");
        }

        if (saveUserID10.contains("save4")) {
            getMessagefromSP4 = saveUserID10.getString("save4", "");
            m10btn4.setText(getMessagefromSP4);
        } else {
            m10btn4.setText("");
        }

        if (saveUserID10.contains("save5")) {
            getMessagefromSP5 = saveUserID10.getString("save5", "");
            m10btn5.setText(getMessagefromSP5);
        } else {
            m10btn5.setText("");
        }

        if (saveUserID10.contains("save6")) {
            getMessagefromSP6 = saveUserID10.getString("save6", "");
            m10btn6.setText(getMessagefromSP6);
        } else {
            m10btn6.setText("");
        }

        if (saveUserID10.contains("save7")) {
            getMessagefromSP7 = saveUserID10.getString("save7", "");
            m10btn7.setText(getMessagefromSP7);
        } else {
            m10btn7.setText("");
        }

        if (saveUserID10.contains("save8")) {
            getMessagefromSP8 = saveUserID10.getString("save8", "");
            m10btn8.setText(getMessagefromSP8);
        } else {
            m10btn8.setText("");
        }

        if (saveUserID10.contains("save9")) {
            getMessagefromSP9 = saveUserID10.getString("save9", "");
            m10btn9.setText(getMessagefromSP9);
        } else {
            m10btn9.setText("");
        }

        if (saveUserID10.contains("save10")) {
            getMessagefromSP10 = saveUserID10.getString("save10", "");
            m10btn10.setText(getMessagefromSP10);
        } else {
            m10btn10.setText("");
        }

        if (saveUserID10.contains("save11")) {
            getMessagefromSP11 = saveUserID10.getString("save11", "");
            m10btn11.setText(getMessagefromSP11);
        } else {
            m10btn11.setText("");
        }

        if (saveUserID10.contains("save12")) {
            getMessagefromSP12 = saveUserID10.getString("save12", "");
            m10btn12.setText(getMessagefromSP12);
        } else {
            m10btn12.setText("");
        }

        if (saveUserID10.contains("save13")) {
            getMessagefromSP13 = saveUserID10.getString("save13", "");
            m10btn13.setText(getMessagefromSP13);
        } else {
            m10btn13.setText("");
        }

        if (saveUserID10.contains("save14")) {
            getMessagefromSP14 = saveUserID10.getString("save14", "");
            m10btn14.setText(getMessagefromSP14);
        } else {
            m10btn14.setText("");
        }

        if (saveUserID10.contains("save15")) {
            getMessagefromSP15 = saveUserID10.getString("save15", "");
            m10btn15.setText(getMessagefromSP15);
        } else {
            m10btn15.setText("");
        }

        if (saveUserID10.contains("save16")) {
            getMessagefromSP16 = saveUserID10.getString("save16", "");
            m10btn16.setText(getMessagefromSP16);
        } else {
            m10btn16.setText("");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
