package andycui.top.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingSpinner extends Activity {

    private Spinner spinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_spinner);

        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);

        spinner.setAdapter(arrayAdapter);
        arrayAdapter.add("Andy");
        arrayAdapter.add("Ager");
        arrayAdapter.add("Angelo");



    }
}
