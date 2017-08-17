package andycui.top.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.Gallery;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingGallery extends Activity {

    private Gallery gallery;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_gallery);

        gallery = findViewById(R.id.gallery);

        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        gallery.setAdapter(arrayAdapter);


        for (int i= 0; i< 60; i++){
            arrayAdapter.add("Galley"+1);
        }



    }
}
