// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import java.util.Objects;
import android.os.IBinder;
import android.content.Context;
import android.app.job.JobParameters;
import android.util.SparseArray;
import android.util.Log;
import android.os.PowerManager$WakeLock;
import android.content.Intent;
import android.app.Service;

public final class AppMeasurementService extends Service implements flz
{
    public hlz C0;
    
    public final boolean a(final int n) {
        return this.stopSelfResult(n);
    }
    
    public final void b(Intent c0) {
        final SparseArray c2 = nhx.C0;
        final int intExtra = c0.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        c0 = (Intent)nhx.C0;
        synchronized (c0) {
            final PowerManager$WakeLock powerManager$WakeLock = (PowerManager$WakeLock)((SparseArray)c0).get(intExtra);
            if (powerManager$WakeLock != null) {
                powerManager$WakeLock.release();
                ((SparseArray)c0).remove(intExtra);
                monitorexit(c0);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("No active wake lock id #");
                sb.append(intExtra);
                Log.w("WakefulBroadcastReceiv.", sb.toString());
            }
        }
    }
    
    public final void c(final JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }
    
    public final hlz d() {
        if (this.C0 == null) {
            this.C0 = new hlz((Context)this);
        }
        return this.C0;
    }
    
    public final IBinder onBind(final Intent intent) {
        final hlz d = this.d();
        Objects.requireNonNull(d);
        if (intent == null) {
            d.c().H0.a("onBind called with null intent");
        }
        else {
            final String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                final Object o = new waz(boz.O(d.a));
                return (IBinder)o;
            }
            d.c().K0.b("onBind received unknown action", (Object)action);
        }
        final Object o = null;
        return (IBinder)o;
    }
    
    public final void onCreate() {
        super.onCreate();
        y7z.v(this.d().a, (ppy)null, (Long)null).b().P0.a("Local AppMeasurementService is starting up");
    }
    
    public final void onDestroy() {
        y7z.v(this.d().a, (ppy)null, (Long)null).b().P0.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }
    
    public final void onRebind(final Intent intent) {
        this.d().a(intent);
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        final hlz d = this.d();
        final b2z b = y7z.v(d.a, (ppy)null, (Long)null).b();
        if (intent == null) {
            b.K0.a("AppMeasurementService started with null intent");
        }
        else {
            final String action = intent.getAction();
            b.P0.c("Local AppMeasurementService called. startId, action", (Object)n2, (Object)action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                final alz alz = new alz(d, n2, b, intent);
                final boz o = boz.O(d.a);
                o.a().q((Runnable)new d9z(o, (Runnable)alz));
            }
        }
        return 2;
    }
    
    public final boolean onUnbind(final Intent intent) {
        this.d().b(intent);
        return true;
    }
}
