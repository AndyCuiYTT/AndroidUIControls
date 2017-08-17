package andycui.top.uicontrols;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

/**
 * Created by colin on 2017/8/16.
 */

public class AtyUsingDataPicker extends Activity {

    private Button btnDatePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_datepicker);

        btnDatePicker = findViewById(R.id.btn_datepicker);

        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               new DatePickerDialog(AtyUsingDataPicker.this, new DatePickerDialog.OnDateSetListener(){
                   @Override
                   public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                       btnDatePicker.setText(String.format("%d:%d:%d",i,i1,i2));
                   }
               },2013,5,20).show();
            }
        });


    }
}
