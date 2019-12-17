package com.example.szidonialaszlo.broadcastreceiverproject;


/**
 * Created by szidonia.laszlo on 2018. 01. 05..
 */

public class MyPowerReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "POWER DISCONNECTED - ",
                Toast.LENGTH_LONG).show();
        // Vibrate the mobile phone
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);

        String action = intent.getAction();
        System.out.println("action = "+action+" packageName = "+intent.getDataString());

        PackageManager pm = context.getPackageManager();
        Intent launchIntent = pm.getLaunchIntentForPackage("hu.d2.offsitesr");
        context.startActivity(launchIntent);
    }
}
