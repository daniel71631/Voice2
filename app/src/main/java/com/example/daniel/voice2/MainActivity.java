package com.example.daniel.voice2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolBar=(Toolbar)findViewById(R.id.toolbar);
        mToolBar.setNavigationIcon(R.drawable.ic_clear_cancel_32dp);
        mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });


        List<Fragment> fragments = new ArrayList<>();
        fragments.add(Page1FG.newInstance());
        fragments.add(Page2FG.newInstance());
        fragments.add(Page3FG.newInstance());
        fragments.add(Page4FG.newInstance());
        fragments.add(Page5FG.newInstance());
        fragments.add(Page6FG.newInstance());
        fragments.add(Page7FG.newInstance());
        fragments.add(Page8FG.newInstance());
        fragments.add(Page9FG.newInstance());
        fragments.add(Page10FG.newInstance());


        mViewPager = (ViewPager) findViewById(R.id.ViewPg);
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(),fragments);
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
