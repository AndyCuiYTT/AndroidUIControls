package andycui.top.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingImageSwitcher extends Activity {

    private ImageSwitcher imageSwitcher;
    private boolean showImg1 = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_imageswitcher);

        imageSwitcher = findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(AtyUsingImageSwitcher.this);
            }
        });

        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(AtyUsingImageSwitcher.this,android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(AtyUsingImageSwitcher.this,android.R.anim.fade_out));

        imageSwitcher.setImageResource(R.drawable.img1);

        imageSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showImg1 = !showImg1;
                showCurrentImage();
            }
        });



    }

    private void showCurrentImage(){
        if(showImg1){
            imageSwitcher.setImageResource(R.drawable.img1);
        }else {
            imageSwitcher.setImageResource(R.drawable.img2);
        }
    }


}
