package com.arno.unlockcounter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int countValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.countUpText)).setText( String.valueOf(countValue));

    }
    public class UserPresentBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context arg0, Intent intent) {

        /*Sent when the user is present after
         * device wakes up (e.g when the keyguard is gone)
         * */
            if(intent.getAction().equals(Intent.ACTION_USER_UNLOCKED)){

            }
        /*Device is shutting down. This is broadcast when the device
         * is being shut down (completely turned off, not sleeping)
         * */
            else if (intent.getAction().equals(Intent.ACTION_SHUTDOWN)) {

            }
        }

    }





    /** Called when the user clicks the Send button */
    public void countUp(View view) {
        countValue = countValue +1;
        ((TextView)findViewById(R.id.countUpText)).setText( String.valueOf(countValue));

    }
    /** Called when the user clicks the Send button */
    public void countDown(View view) {
        countValue = countValue -1;
        ((TextView)findViewById(R.id.countUpText)).setText( String.valueOf(countValue));

    }




}
