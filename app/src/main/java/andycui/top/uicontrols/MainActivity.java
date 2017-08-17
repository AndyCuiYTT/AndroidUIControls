package andycui.top.uicontrols;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    private ArrayAdapter<ListCellData> adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new ArrayAdapter<ListCellData>(this,android.R.layout.simple_list_item_1);
        setListAdapter(adapter);

        adapter.add(new ListCellData(this,"RadioGroup",new Intent(this,AtyUsingRadioGroup.class)));

        adapter.add(new ListCellData(this,"CheckBox",new Intent(this,AtyUsingCheckBox.class)));
        adapter.add(new ListCellData(this,"datePicker",new Intent(this,AtyUsingDataPicker.class)));
        adapter.add(new ListCellData(this,"timePicker",new Intent(this,AtyUsingTimePicker.class)));
        adapter.add(new ListCellData(this,"spinner",new Intent(this,AtyUsingSpinner.class)));
        adapter.add(new ListCellData(this,"progressBar",new Intent(this,AtyUseingProgressBar.class)));
        adapter.add(new ListCellData(this,"autoCompleteTextView", new Intent(this,AtyUsingAutoCompleteTextView.class)));
        adapter.add(new ListCellData(this,"seekBar",new Intent(this,AtyUsingSeekBar.class)));
        adapter.add(new ListCellData(this,"gridView",new Intent(this,AtyUsingCridView.class)));
        adapter.add(new ListCellData(this,"progressDialog",new Intent(this,AtyUsingProgressDialog.class)));
        adapter.add(new ListCellData(this,"notification",new Intent(this,AtyUsingNotification.class)));
        adapter.add(new ListCellData(this,"scrollView",new Intent(this,AtyUsingScrollView.class)));
        adapter.add(new ListCellData(this,"ratingBar",new Intent(this,AtyUsingRatingBar.class)));
        adapter.add(new ListCellData(this,"imageSwitcher",new Intent(this,AtyUsingImageSwitcher.class)));
        adapter.add(new ListCellData(this,"galley",new Intent(this,AtyUsingGallery.class)));
        adapter.add(new ListCellData(this,"editText",new Intent(this,AtyUsingEditText.class)));




    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        ListCellData data = adapter.getItem(position);
        data.startActivity();


    }
}
