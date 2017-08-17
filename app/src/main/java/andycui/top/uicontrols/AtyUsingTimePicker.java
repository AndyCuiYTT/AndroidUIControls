package andycui.top.uicontrols;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingTimePicker extends Activity {

    private Button btnTimePicker;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_timepicker);

        btnTimePicker = findViewById(R.id.btn_timePicker);

        btnTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new TimePickerDialog(AtyUsingTimePicker.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        btnTimePicker.setText(String.format("%d:%d",i,i1));
                    }
                },10,30,true).show();
            }
        });

    }
}
