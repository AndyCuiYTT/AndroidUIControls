package andycui.top.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ProgressBar;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUseingProgressBar extends Activity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_progressbar);


        progressBar = findViewById(R.id.progressBar_1);
        progressBar.setMax(100);
        progressBar.setProgress(50);


    }
}
