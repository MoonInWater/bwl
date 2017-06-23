package bwl.xiexl.com.bwlapp.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import bwl.xiexl.com.bwlapp.R;
import bwl.xiexl.com.bwlapp.util.UiUtil;


public class LoginActivity extends Activity {


    @BindView(R.id.edt_username)
    EditText edtUsername;
    @BindView(R.id.edt_pwd)
    EditText edtPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        tvTitle.setText("登录");
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        Intent intent = new Intent().setClass(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
