package com.example.project01.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myprojectx.DTO.MemberDTO;
import com.example.myprojectx.R;
import com.example.project01.DTO.TestDTO;
import com.example.project01.Fragment_Test;
import com.example.project01.R;

import java.util.ArrayList;

public class TestAdapter extends
        RecyclerView.Adapter<TestAdapter.ViewHolder>{

    // 3. 메인한테 넘겨 받는것
    Fragment_Test context;
    ArrayList<TestDTO> dtos;

    LayoutInflater inflater;

    // 4. 생성자를 만들어 메인에게서 넘겨받은것을 연결
    public TestAdapter(Fragment_Test context, ArrayList<TestDTO> dtos) {
        this.context = context;
        this.dtos = dtos;

        inflater = LayoutInflater.from(this.context);
    }

    // 5. 메소드는 여기에 만든다
    ///////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////

    // 6. 화면을 인플레이트 시킨다
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.test_list, parent, false);

        return new ViewHolder(itemView);
    }

    // 7. 인플레이트 시킨 화면에 데이터를 셋팅시킨다
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // dtos에 있는 데이터를 순서대로 불러온다
        TestDTO dto = dtos.get(position); // 다섯개라고 가정하면 position은 0~4
        // 불러온 데이터를 ViewHolder에 만들어 놓은 setDto를 사용하여 셋팅한다
        holder.setDto(dto);
    }

    @Override
    public int getItemCount() {
        return dtos.size();
    }

    // 1. xml 파일에서 사용된 모든변수와 사용할 레이아웃을 클래스에서 선언한다 : 별 5개
    public class ViewHolder extends RecyclerView.ViewHolder{
        // 1-1. singerview.xml 에 사용된 모든 위젯을 정의한다
        TextView test_name, test_date, test_score;
        LinearLayout test_List;

        // 1-2. singerview.xml에서 정의한 아이디를 찾아 연결시킨다(생성자)
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            test_List = itemView.findViewById(R.id.test_List);
            test_name = itemView.findViewById(R.id.test_name);
            test_date = itemView.findViewById(R.id.test_date);
            test_score = itemView.findViewById(R.id.test_score);
        }

        // 1-3. 함수를 만들어서 singerview에 데이터를 연결시킨다
        public void setDto(TestDTO dto){
            test_name.setText(dto.getTest_name());
            test_date.setText(dto.getTest_date());
            test_score.setText(dto.getTest_score());

        }
    }


}
