package andycui.top.uicontrols;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingProgressDialog extends Activity {

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_progressdialog);

        findViewById(R.id.btnShowProgressDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 progressDialog = ProgressDialog.show(AtyUsingProgressDialog.this,"加载中","正在加载，请稍后。。。");


                new Thread(){
                    @Override
                    public void run() {

                        try {
                            Thread.sleep(5000);
                            progressDialog.dismiss();
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }
                }.start();

            }
        });

        findViewById(R.id.dismissProgressDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.dismiss();
            }
        });



    }
}
