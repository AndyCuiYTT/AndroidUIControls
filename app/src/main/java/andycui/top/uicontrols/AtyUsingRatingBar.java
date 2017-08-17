package andycui.top.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingRatingBar extends Activity {

    private RatingBar ratingBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_ratingbar);

        ratingBar = findViewById(R.id.ratingBar);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(AtyUsingRatingBar.this,"评价为："+v,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
