package andycui.top.uicontrols;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class AtyUsingCheckBox extends AppCompatActivity {

    private CheckBox cbBz,cbRb,cbHsr,cbMt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty_using_check_box);

        cbBz = (CheckBox) findViewById(R.id.cb_bz);
        cbRb = (CheckBox) findViewById(R.id.cb_rb);
        cbHsr = (CheckBox) findViewById(R.id.cb_hsr);
        cbMt = (CheckBox) findViewById(R.id.cb_mt);

        findViewById(R.id.btn_submite).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "中午要吃的东西：\n";

                if (cbBz.isChecked()){
                    str+="包子\n";
                }

                if (cbRb.isChecked()){
                    str+="肉饼\n";
                }

                if (cbHsr.isChecked()){
                    str+="红烧肉\n";
                }

                if (cbMt.isChecked()){
                    str+="面条\n";
                }

                new AlertDialog.Builder(AtyUsingCheckBox.this).setTitle("食物").setMessage(str).setPositiveButton("关闭",null).show();

            }
        });
    }
}
