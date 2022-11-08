// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.util.SparseArray;
import android.os.PowerManager$WakeLock;
import android.content.ComponentName;
import android.os.PowerManager;
import java.util.Objects;
import android.content.Intent;
import android.content.Context;

public final class AppMeasurementReceiver extends nhx implements t4z
{
    public v4z E0;
    
    public final void onReceive(final Context context, Intent c0) {
        if (this.E0 == null) {
            this.E0 = new v4z((t4z)this);
        }
        final v4z e0 = this.E0;
        Objects.requireNonNull(e0);
        final b2z b = y7z.v(context, (ppy)null, (Long)null).b();
        if (c0 == null) {
            b.K0.a("Receiver called with null intent");
        }
        else {
            final String action = c0.getAction();
            b.P0.b("Local receiver got", (Object)action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                final Intent setClassName = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                setClassName.setAction("com.google.android.gms.measurement.UPLOAD");
                b.P0.a("Starting wakeful intent.");
                Objects.requireNonNull((AppMeasurementReceiver)e0.a);
                c0 = (Intent)nhx.C0;
                synchronized (c0) {
                    final int d0 = nhx.D0;
                    if ((nhx.D0 = d0 + 1) <= 0) {
                        nhx.D0 = 1;
                    }
                    setClassName.putExtra("androidx.contentpager.content.wakelockid", d0);
                    final ComponentName startService = context.startService(setClassName);
                    if (startService == null) {
                        return;
                    }
                    final PowerManager powerManager = (PowerManager)context.getSystemService("power");
                    final StringBuilder sb = new StringBuilder();
                    sb.append("androidx.core:wake:");
                    sb.append(startService.flattenToShortString());
                    final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(1, sb.toString());
                    wakeLock.setReferenceCounted(false);
                    wakeLock.acquire(60000L);
                    ((SparseArray)c0).put(d0, (Object)wakeLock);
                    return;
                }
            }
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                b.K0.a("Install Referrer Broadcasts are deprecated");
            }
        }
    }
}
