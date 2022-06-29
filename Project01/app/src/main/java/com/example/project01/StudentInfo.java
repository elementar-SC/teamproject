package com.example.project01;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class StudentInfo extends AppCompatActivity {
    private static final String TAG = "main:StudentInfo";

    Toolbar toolbar;
    TabLayout tabs;
    DrawerLayout drawerLayout;
    ActionBar actionBar;
    Fragment fragment_check_in;
    Fragment fragment_StudentDetail;
    Fragment fragment_Homework;
    Fragment fragment_test;
    Fragment selFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        // toolbar 적용
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);  // 내가 만든 바를 액션바로 지정
        drawerLayout = findViewById(R.id.drawerLayout);

        actionBar = getSupportActionBar();
        ActionBar actionBar = getSupportActionBar();
        // 원래 있던 제목(Project01) 안보이게 해준
        actionBar.setDisplayShowTitleEnabled(false);

        fragment_check_in = new Fragment_CheckIn();
        fragment_Homework = new Fragment_Homework();
        fragment_StudentDetail = new Fragment_StudentDetail();
        fragment_test = new Fragment_Test();
        // 먼저 화면에 학생정보가 보이게 초기화
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contain, fragment_StudentDetail).commit();

        // 탭을 동적으로 생성한다
        tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("학생정보"));
        tabs.addTab(tabs.newTab().setText("출결상황"));
        tabs.addTab(tabs.newTab().setText("과제결과"));
        tabs.addTab(tabs.newTab().setText("테스트결과"));

        // 탭 레이아웃에 리스너를 달아준다
        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            // 탭이 선택되었을때
            @Override    //               선택된 탭
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();  // 0, 1, 2, ...
                Log.d(TAG, "onTabSelected: " + position);

                if(position == 0){
                    selFragment = fragment_StudentDetail;
                }else if(position == 1){
                    selFragment = fragment_check_in;
                }else if(position == 2){
                    selFragment = fragment_Homework;
                }else if(position == 3){
                    selFragment = fragment_test;
                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contain, selFragment).commit();
            }
            // 탭이 선택되지 않았을 때
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            // 탭이 재선택 되었을때
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        ActionBarDrawerToggle toggle
                = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close );
        drawerLayout.addDrawerListener(toggle); // drawerLayout 에 toggle 을 붙임

        toggle.syncState();





    }
}