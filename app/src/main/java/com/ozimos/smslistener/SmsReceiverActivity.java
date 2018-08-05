package com.ozimos.smslistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SmsReceiverActivity extends AppCompatActivity implements View.OnClickListener {
private TextView tvSmsFrom, tvPesanSms;
private Button btnTutup;
public static final String EXTRA_SMS_NO = "extra_sms_no";
public static final String EXTRA_SMS_PESAN = "extra_sms_pesan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_receiver);


        tvSmsFrom = (TextView) findViewById(R.id.tv_no);
        tvPesanSms = (TextView) findViewById(R.id.tv_pesan);
        btnTutup = (Button) findViewById(R.id.btn_close);
        btnTutup.setOnClickListener(this);

        String senderNo = getIntent().getStringExtra(EXTRA_SMS_NO);
        String senderPesan = getIntent().getStringExtra(EXTRA_SMS_PESAN);
        tvSmsFrom.setText("from :"+ senderNo);
        tvPesanSms.setText(senderPesan);
    }

    @Override
    public void onClick (View v){
        if (v.getId()==R.id.btn_close){
            finish();
        }
    }
}
