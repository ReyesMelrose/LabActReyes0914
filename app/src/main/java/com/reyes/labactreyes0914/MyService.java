package com.reyes.labactreyes0914;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("ll", "UST LOVERS' LANE");
        Log.d("qpark", "UST QPARK");
        Log.d("arch", "UST ARCH OF THE CENTURIES");
        Log.d("field", "UST FIELD");
    }
}
