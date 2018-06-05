package com.example.daniel.voice2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Page2FG extends Fragment implements View.OnClickListener {

    public static Fragment newInstance(){
        Page1FG fragment = new Page1FG();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page2fg, container, false);
        iniview(view);
        return view;
    }

    private void iniview(View view) {

    }

    @Override
    public void onClick(View v) {

    }
}
