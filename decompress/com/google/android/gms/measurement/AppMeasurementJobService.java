// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.os.BaseBundle;
import android.content.Context;
import android.app.job.JobParameters;
import android.content.Intent;
import android.annotation.TargetApi;
import android.app.job.JobService;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements flz
{
    public hlz C0;
    
    public final boolean a(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final void b(final Intent intent) {
    }
    
    @TargetApi(24)
    public final void c(final JobParameters jobParameters) {
        this.jobFinished(jobParameters, false);
    }
    
    public final hlz d() {
        if (this.C0 == null) {
            this.C0 = new hlz((Context)this);
        }
        return this.C0;
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
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        final hlz d = this.d();
        final b2z b = y7z.v(d.a, (ppy)null, (Long)null).b();
        final String string = ((BaseBundle)jobParameters.getExtras()).getString("action");
        b.P0.b("Local AppMeasurementJobService called. action", (Object)string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            final b9y b9y = new b9y(d, b, jobParameters);
            final boz o = boz.O(d.a);
            o.a().q((Runnable)new d9z(o, (Runnable)b9y));
        }
        return true;
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        return false;
    }
    
    public final boolean onUnbind(final Intent intent) {
        this.d().b(intent);
        return true;
    }
}
