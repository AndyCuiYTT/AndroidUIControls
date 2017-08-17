package andycui.top.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingAutoCompleteTextView extends Activity {

    private AutoCompleteTextView textView;
    private ArrayAdapter<String> actAdapter;
    private ArrayAdapter<String> mactAdapter;
    private MultiAutoCompleteTextView multiAutoCompleteTextView;
    private String[] strs = new String[]{"Hello iOS","Hello Java","Hello PHP","Hello android","Hello swift"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_autocompletetextview);

        actAdapter = new ArrayAdapter<String>(this,R.layout.aty_using_autocompletetextview_dropdown_item,strs);

        textView = findViewById(R.id.autoCompleteTextView);
        textView.setAdapter(actAdapter);

        mactAdapter = new ArrayAdapter<String>(this,R.layout.aty_using_autocompletetextview_dropdown_item,strs);

        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoCompleteTextView.setAdapter(mactAdapter);





    }
}
