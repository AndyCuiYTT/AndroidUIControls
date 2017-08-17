package andycui.top.uicontrols;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by colin on 2017/8/17.
 */

public class AtyUsingNotification extends Activity {

    private NotificationManager notificationManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_notification);

        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);


        findViewById(R.id.btnShowNotification).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Notification notification = new Notification(R.drawable.ic_launcher,"Ticker Text", System.currentTimeMillis());
//                notification.setLatestEventInfo(this,"title","decription", PendingIntent.getActivity(AtyUsingNotification.this,1,getIntent(),0));


                Notification notification = new Notification.Builder(AtyUsingNotification.this).setSmallIcon(R.drawable.ic_launcher).setContentTitle("My Notification").setContentText("Hello Notification").setContentIntent(PendingIntent.getActivity(AtyUsingNotification.this,1,getIntent(),0)).getNotification();



                notificationManager.notify(R.layout.aty_using_notification,notification);

            }
        });

    }
}
