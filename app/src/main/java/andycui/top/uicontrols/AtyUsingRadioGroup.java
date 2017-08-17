package andycui.top.uicontrols;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class AtyUsingRadioGroup extends AppCompatActivity {

    private RadioButton radioRight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty_using_radio_group);

        radioRight = (RadioButton) findViewById(R.id.radioRight);
        findViewById(R.id.sunbmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioRight.isChecked()) {
                    new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("判断").setMessage("回答正确").setPositiveButton("关闭", null).show();
                } else {
                    new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("判断").setMessage("回答错误").setPositiveButton("关闭", null).show();
                }
            }
        });


    }
}
