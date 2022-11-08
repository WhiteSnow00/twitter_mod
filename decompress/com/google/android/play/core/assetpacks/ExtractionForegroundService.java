// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class ExtractionForegroundService extends Service
{
    public final zoy C0;
    
    public ExtractionForegroundService() {
        this.C0 = new zoy(this);
    }
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.C0;
    }
}
