package com.example.yingyot.nutexchange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.yingyot.nutexchange.R;

/**
 * Created by Yingyot on 3/12/2017 AD.
 */

public class MainFragment extends Fragment{

    //    Explicit หรือ การประกาศตัวแปร
    private RadioGroup radioGroup;
    private RadioButton usdRadioButton, thbRadioButton;
    private EditText editText;
    private Button button;


//    สร้างMainMethod ที่ใช้ในการจัดการ การทำงาน


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Initial View
        initialView();

//        Click USD to THB First
        clickUSDToTHBFirst();


    }   // Main Method

    private void clickUSDToTHBFirst() {
        usdRadioButton.setChecked(true);
    }

    private void initialView() {
        radioGroup = getView().findViewById(R.id.ragMoney);
        usdRadioButton = getView().findViewById(R.id.radUSD);
        thbRadioButton = getView().findViewById(R.id.radTHB);
        editText = getView().findViewById(R.id.edtMoney);
        button = getView().findViewById(R.id.btnExchange);
    }

    //    สร้างหน้ากาก Fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main,container, false);

        return view;
    }
}   // Main Class นี่คือ คลาสหลัก
