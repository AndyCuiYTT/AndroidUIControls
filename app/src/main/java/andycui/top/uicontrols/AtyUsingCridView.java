package andycui.top.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingCridView extends Activity {

    private GridView gridView;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_gridview);

        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);

        gridView = findViewById(R.id.gridView);
        gridView.setAdapter(arrayAdapter);

        for(int i = 0; i< 60;i++){
            arrayAdapter.add("gridView"+i);
        }



    }
}
