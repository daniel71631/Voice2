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

public class Page8FG extends Fragment {

    private Button m8btn1, m8btn2,m8btn3, m8btn4, m8btn5, m8btn6, m8btn7, m8btn8, m8btn9, m8btn10, m8btn11,
            m8btn12, m8btn13, m8btn14, m8btn15, m8btn16;
    private Button m8btnDelete;
    private SpeechRecognizer mSpeechRecognizer;
    private android.content.Intent mSpeechRecognizerIntent;
    private ArrayList<String> matches8;
    private String TAG="Page8";
    private String getMessage, getMessagefromSP1, getMessagefromSP2, getMessagefromSP3, getMessagefromSP4, getMessagefromSP5, getMessagefromSP6, getMessagefromSP7, getMessagefromSP8, getMessagefromSP9,
            getMessagefromSP10, getMessagefromSP11, getMessagefromSP12, getMessagefromSP13, getMessagefromSP14, getMessagefromSP15, getMessagefromSP16;
    private long startTime=0;
    private long endTime=0;
    private SharedPreferences saveUserID8;
    private static final String data = "DATA8";
    private int clickCount = 0;
    private long StartTime;
    private long duration;
    final Handler handler = new Handler();

    public static Fragment newInstance(){
        Page8FG fragment = new Page8FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveUserID8=getActivity().getSharedPreferences(data,0);

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
                matches8 = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        getMessage=matches8.get(0);
                        if(getMessage!=null && m8btn8.getText().toString()=="Listening"){
                            m8btn1.setText(getMessage);
                            saveUserID8.edit().putString("save1", getMessage).commit();
                        }else if(getMessage!=null && m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText(getMessage);
                            saveUserID8.edit().putString("save2", getMessage).commit();
                        }else if(getMessage!=null && m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText(getMessage);
                            saveUserID8.edit().putString("save3", getMessage).commit();
                        }else if(getMessage!=null && m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText(getMessage);
                            saveUserID8.edit().putString("save4", getMessage).commit();
                        }else if(getMessage!=null && m8btn5.getText().toString()=="Listening"){
                            m8btn5.setText(getMessage);
                            saveUserID8.edit().putString("save5", getMessage).commit();
                        }else if(getMessage!=null && m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText(getMessage);
                            saveUserID8.edit().putString("save6", getMessage).commit();
                        }else if(getMessage!=null && m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText(getMessage);
                            saveUserID8.edit().putString("save7", getMessage).commit();
                        }else if(getMessage!=null && m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText(getMessage);
                            saveUserID8.edit().putString("save8", getMessage).commit();
                        }else if(getMessage!=null && m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText(getMessage);
                            saveUserID8.edit().putString("save9", getMessage).commit();
                        }else if(getMessage!=null && m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText(getMessage);
                            saveUserID8.edit().putString("save10", getMessage).commit();
                        }else if(getMessage!=null && m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText(getMessage);
                            saveUserID8.edit().putString("save11", getMessage).commit();
                        }else if(getMessage!=null && m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText(getMessage);
                            saveUserID8.edit().putString("save12", getMessage).commit();
                        }else if(getMessage!=null && m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText(getMessage);
                            saveUserID8.edit().putString("save13", getMessage).commit();
                        }else if(getMessage!=null && m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText(getMessage);
                            saveUserID8.edit().putString("save14", getMessage).commit();
                        }else if(getMessage!=null && m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText(getMessage);
                            saveUserID8.edit().putString("save15", getMessage).commit();
                        }else if(getMessage!=null && m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText(getMessage);
                            saveUserID8.edit().putString("save16", getMessage).commit();
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
        final View view = inflater.inflate(R.layout.page8fg, container, false);
        iniview(view);

        m8btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn1.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn1.setText("");
                                saveUserID8.edit().remove("save1").commit();
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

        m8btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn2.setText("Listening");

                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn2.setText("");
                                saveUserID8.edit().remove("save2").commit();
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

        m8btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn3.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn3.setText("");
                                saveUserID8.edit().remove("save3").commit();
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

        m8btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn4.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn4.setText("");
                                saveUserID8.edit().remove("save4").commit();
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

        m8btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn5.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening") {
                            m8btn1.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn5.setText("");
                                saveUserID8.edit().remove("save5").commit();
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

        m8btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn6.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn6.setText("");
                                saveUserID8.edit().remove("save6").commit();
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

        m8btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn7.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn7.setText("");
                                saveUserID8.edit().remove("save7").commit();
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

        m8btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn8.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn8.setText("");
                                saveUserID8.edit().remove("save8").commit();
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

        m8btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn9.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn9.setText("");
                                saveUserID8.edit().remove("save9").commit();
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

        m8btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn10.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn10.setText("");
                                saveUserID8.edit().remove("save10").commit();
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
        m8btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn11.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn11.setText("");
                                saveUserID8.edit().remove("save11").commit();
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

        m8btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn12.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn12.setText("");
                                saveUserID8.edit().remove("save12").commit();
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

        m8btn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn13.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn13.setText("");
                                saveUserID8.edit().remove("save13").commit();
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

        m8btn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn14.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn14.setText("");
                                saveUserID8.edit().remove("save14").commit();
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
        m8btn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn15.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
                        }
                        if(m8btn16.getText().toString()=="Listening"){
                            m8btn16.setText("");
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
                                m8btn15.setText("");
                                saveUserID8.edit().remove("save15").commit();
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

        m8btn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);
                        m8btn16.setText("Listening");

                        if(m8btn2.getText().toString()=="Listening"){
                            m8btn2.setText("");
                        }
                        if(m8btn3.getText().toString()=="Listening"){
                            m8btn3.setText("");
                        }
                        if(m8btn4.getText().toString()=="Listening"){
                            m8btn4.setText("");
                        }
                        if(m8btn5.getText().toString()=="Listening") {
                            m8btn5.setText("");
                        }
                        if(m8btn6.getText().toString()=="Listening"){
                            m8btn6.setText("");
                        }
                        if(m8btn7.getText().toString()=="Listening"){
                            m8btn7.setText("");
                        }
                        if(m8btn8.getText().toString()=="Listening"){
                            m8btn8.setText("");
                        }
                        if(m8btn9.getText().toString()=="Listening"){
                            m8btn9.setText("");
                        }
                        if(m8btn10.getText().toString()=="Listening"){
                            m8btn10.setText("");
                        }
                        if(m8btn11.getText().toString()=="Listening"){
                            m8btn11.setText("");
                        }
                        if(m8btn12.getText().toString()=="Listening"){
                            m8btn12.setText("");
                        }
                        if(m8btn13.getText().toString()=="Listening"){
                            m8btn13.setText("");
                        }
                        if(m8btn14.getText().toString()=="Listening"){
                            m8btn14.setText("");
                        }
                        if(m8btn15.getText().toString()=="Listening"){
                            m8btn15.setText("");
                        }
                        if(m8btn1.getText().toString()=="Listening"){
                            m8btn1.setText("");
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
                                m8btn16.setText("");
                                saveUserID8.edit().remove("save16").commit();
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

        m8btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //matches.clear();
                saveUserID8.edit().clear().commit();
                m8btn1.setText("");
                m8btn2.setText("");
                m8btn3.setText("");
                m8btn4.setText("");
                m8btn5.setText("");
                m8btn6.setText("");
                m8btn7.setText("");
                m8btn8.setText("");
                m8btn9.setText("");
                m8btn10.setText("");
                m8btn11.setText("");
                m8btn12.setText("");
                m8btn13.setText("");
                m8btn14.setText("");
                m8btn15.setText("");
                m8btn16.setText("");
            }
        });
        return view;
    }

    private void iniview(View view) {
        ButtonView(view);
    }

    private void ButtonView(View view) {
        m8btnDelete = (Button) view.findViewById(R.id.btnDelete8);
        m8btn1 = (Button) view.findViewById(R.id.btn1_8);
        m8btn2 = (Button) view.findViewById(R.id.btn2_8);
        m8btn3 = (Button) view.findViewById(R.id.btn3_8);
        m8btn4 = (Button) view.findViewById(R.id.btn4_8);
        m8btn5 = (Button) view.findViewById(R.id.btn5_8);
        m8btn6 = (Button) view.findViewById(R.id.btn6_8);
        m8btn7 = (Button) view.findViewById(R.id.btn7_8);
        m8btn8 = (Button) view.findViewById(R.id.btn8_8);
        m8btn9 = (Button) view.findViewById(R.id.btn9_8);
        m8btn10 = (Button) view.findViewById(R.id.btn10_8);
        m8btn11 = (Button) view.findViewById(R.id.btn11_8);
        m8btn12 = (Button) view.findViewById(R.id.btn12_8);
        m8btn13 = (Button) view.findViewById(R.id.btn13_8);
        m8btn14 = (Button) view.findViewById(R.id.btn14_8);
        m8btn15 = (Button) view.findViewById(R.id.btn15_8);
        m8btn16 = (Button) view.findViewById(R.id.btn16_8);

        if (saveUserID8.contains("save1")) {
            getMessagefromSP1 = saveUserID8.getString("save1", "");
            m8btn1.setText(getMessagefromSP1);
        } else {
            m8btn1.setText("");
        }

        if (saveUserID8.contains("save2")) {
            getMessagefromSP2 = saveUserID8.getString("save2", "");
            m8btn2.setText(getMessagefromSP2);
        } else {
            m8btn2.setText("");
        }

        if (saveUserID8.contains("save3")) {
            getMessagefromSP3 = saveUserID8.getString("save3", "");
            m8btn3.setText(getMessagefromSP3);
        } else {
            m8btn3.setText("");
        }

        if (saveUserID8.contains("save4")) {
            getMessagefromSP4 = saveUserID8.getString("save4", "");
            m8btn4.setText(getMessagefromSP4);
        } else {
            m8btn4.setText("");
        }

        if (saveUserID8.contains("save5")) {
            getMessagefromSP5 = saveUserID8.getString("save5", "");
            m8btn5.setText(getMessagefromSP5);
        } else {
            m8btn5.setText("");
        }

        if (saveUserID8.contains("save6")) {
            getMessagefromSP6 = saveUserID8.getString("save6", "");
            m8btn6.setText(getMessagefromSP6);
        } else {
            m8btn6.setText("");
        }

        if (saveUserID8.contains("save7")) {
            getMessagefromSP7 = saveUserID8.getString("save7", "");
            m8btn7.setText(getMessagefromSP7);
        } else {
            m8btn7.setText("");
        }

        if (saveUserID8.contains("save8")) {
            getMessagefromSP8 = saveUserID8.getString("save8", "");
            m8btn8.setText(getMessagefromSP8);
        } else {
            m8btn8.setText("");
        }

        if (saveUserID8.contains("save9")) {
            getMessagefromSP9 = saveUserID8.getString("save9", "");
            m8btn9.setText(getMessagefromSP9);
        } else {
            m8btn9.setText("");
        }

        if (saveUserID8.contains("save10")) {
            getMessagefromSP10 = saveUserID8.getString("save10", "");
            m8btn10.setText(getMessagefromSP10);
        } else {
            m8btn10.setText("");
        }

        if (saveUserID8.contains("save11")) {
            getMessagefromSP11 = saveUserID8.getString("save11", "");
            m8btn11.setText(getMessagefromSP11);
        } else {
            m8btn11.setText("");
        }

        if (saveUserID8.contains("save12")) {
            getMessagefromSP12 = saveUserID8.getString("save12", "");
            m8btn12.setText(getMessagefromSP12);
        } else {
            m8btn12.setText("");
        }

        if (saveUserID8.contains("save13")) {
            getMessagefromSP13 = saveUserID8.getString("save13", "");
            m8btn13.setText(getMessagefromSP13);
        } else {
            m8btn13.setText("");
        }

        if (saveUserID8.contains("save14")) {
            getMessagefromSP14 = saveUserID8.getString("save14", "");
            m8btn14.setText(getMessagefromSP14);
        } else {
            m8btn14.setText("");
        }

        if (saveUserID8.contains("save15")) {
            getMessagefromSP15 = saveUserID8.getString("save15", "");
            m8btn15.setText(getMessagefromSP15);
        } else {
            m8btn15.setText("");
        }

        if (saveUserID8.contains("save16")) {
            getMessagefromSP16 = saveUserID8.getString("save16", "");
            m8btn16.setText(getMessagefromSP16);
        } else {
            m8btn16.setText("");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
