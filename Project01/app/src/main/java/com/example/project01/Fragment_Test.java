package com.example.project01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01.ATask.MemberSelect;
import com.example.project01.Adapter.TestAdapter;
import com.example.project01.DTO.TestDTO;

import java.util.ArrayList;

public class Fragment_Test extends Fragment {

    RecyclerView recyclerView;

    TestAdapter adapter;

    ArrayList<TestDTO> dtos;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_test,
                container, false);

        dtos = new ArrayList<>();

        recyclerView = viewGroup.findViewById(R.id.recyclerView);
        // recyclerView에서 반드시 아래와 같이 초기화를 해줘야 함
        LinearLayoutManager layoutManager = new LinearLayoutManager
                (this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // 어댑터 객체 생성
        adapter = new TestAdapter(Fragment_Test.this, dtos);
        recyclerView.setAdapter(adapter);

        // 서버에 멤버들 ArrayList를 요구해서 가져온다 : AsyncTask 상속 받는 java
        TestSelect testSelect = new TestSelect(dtos, adapter);
        TestSelect.execute();



        return viewGroup;
    }
}
