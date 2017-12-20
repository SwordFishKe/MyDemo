package com.tpv.xmic.dmr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {

    private static final String TAG = "DmrBootReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive() called with: context = [" + context + "], intent = [" + intent + "]");
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Intent startDmr = new Intent();
            startDmr.setAction("com.tpv.xmic.start.dmr");
            context.startService(startDmr);
        }
    }
}
