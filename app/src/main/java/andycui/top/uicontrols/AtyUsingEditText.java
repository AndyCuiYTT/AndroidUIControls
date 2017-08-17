package andycui.top.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingEditText extends Activity {

    private EditText editText;
    private Button button;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_edittext);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.btn_getText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(editText.getText())){
                    Toast.makeText(AtyUsingEditText.this,"文本为空",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AtyUsingEditText.this,editText.getText().toString(),Toast.LENGTH_SHORT).show();
                }


            }
        });



    }
}
