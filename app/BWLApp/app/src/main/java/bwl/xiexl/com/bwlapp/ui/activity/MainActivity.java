package bwl.xiexl.com.bwlapp.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import bwl.xiexl.com.bwlapp.R;
import bwl.xiexl.com.bwlapp.util.UiUtil;

public class MainActivity extends Activity {


    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.ll_save)
    LinearLayout llSave;
    @BindView(R.id.ll_get)
    LinearLayout llGet;
    private long exitTime = 0;

    //首页
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvTitle.setText("首页");
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                UiUtil.showToast("再按一次退出");
                exitTime = System.currentTimeMillis();
            } else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @OnClick({R.id.ll_save, R.id.ll_get})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_save:
                Intent intent = new Intent().setClass(this,SaveActivity.class);
                startActivity(intent);
                break;
            case R.id.ll_get:
                break;
        }
    }
}
