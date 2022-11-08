// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class AssetPackExtractionService extends Service
{
    public rhy C0;
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.C0;
    }
    
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = ((Context)this).getApplicationContext();
        synchronized (asy.class) {
            if (asy.C0 == null) {
                final Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                asy.C0 = new goy(new huz(applicationContext));
            }
            final goy c0 = asy.C0;
            monitorexit(asy.class);
            this.C0 = (rhy)c0.d.a();
        }
    }
}
