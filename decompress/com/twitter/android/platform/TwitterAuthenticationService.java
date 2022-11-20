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
    public u1v D0;
    
    public final IBinder onBind(final Intent intent) {
        return ((AbstractAccountAuthenticator)this.D0).getIBinder();
    }
    
    public final void onCreate() {
        super.onCreate();
        this.D0 = new u1v((Context)this);
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.D0 = null;
    }
}
