// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.platform;

import android.accounts.AbstractAccountAuthenticator;
import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class TwitterAuthenticationService extends Service
{
    public z0v C0;
    
    public final IBinder onBind(final Intent intent) {
        return ((AbstractAccountAuthenticator)this.C0).getIBinder();
    }
    
    public final void onCreate() {
        super.onCreate();
        this.C0 = new z0v((Context)this);
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.C0 = null;
    }
}
