package bwl.xiexl.com.bwlapp.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import bwl.xiexl.com.bwlapp.R;

public class SaveActivity extends Activity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_right)
    TextView tvRight;
    @BindView(R.id.btn_left)
    Button btnLeft;
    @BindView(R.id.edt_title)
    EditText edtTitle;
    @BindView(R.id.spi_category)
    Spinner spiCategory;
    @BindView(R.id.edt_des)
    EditText edtDes;
    @BindView(R.id.img_upload1)
    ImageView imgUpload1;
    @BindView(R.id.img_upload2)
    ImageView imgUpload2;
    @BindView(R.id.btn_save)
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        ButterKnife.bind(this);
        btnLeft.setVisibility(View.VISIBLE);
        tvTitle.setText("添加");
    }

    @OnClick({R.id.btn_left,R.id.img_upload1, R.id.img_upload2, R.id.btn_save})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_left:
                finish();
                break;
            case R.id.img_upload1:
                break;
            case R.id.img_upload2:
                break;
            case R.id.btn_save:
                break;
        }
    }
}
