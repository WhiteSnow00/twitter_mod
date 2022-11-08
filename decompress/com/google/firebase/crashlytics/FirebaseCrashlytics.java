// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.crashlytics;

import java.util.concurrent.Callable;
import android.util.Log;
import java.util.Objects;

public class FirebaseCrashlytics
{
    public final w07 a;
    
    public FirebaseCrashlytics(final w07 a) {
        this.a = a;
    }
    
    public static FirebaseCrashlytics getInstance() {
        final FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics)b1b.c().b((Class)FirebaseCrashlytics.class);
        Objects.requireNonNull(firebaseCrashlytics, "FirebaseCrashlytics component is not present.");
        return firebaseCrashlytics;
    }
    
    public zas<Boolean> checkForUnsentReports() {
        final p07 h = this.a.h;
        Object o;
        if (!h.q.compareAndSet(false, true)) {
            Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", (Throwable)null);
            o = zbs.e((Object)Boolean.FALSE);
        }
        else {
            o = h.n.a;
        }
        return (zas<Boolean>)o;
    }
    
    public void deleteUnsentReports() {
        final p07 h = this.a.h;
        h.o.d((Object)Boolean.FALSE);
        final rzz a = h.p.a;
    }
    
    public boolean didCrashOnPreviousExecution() {
        return this.a.g;
    }
    
    public void log(final String s) {
        final w07 a = this.a;
        Objects.requireNonNull(a);
        final long currentTimeMillis = System.currentTimeMillis();
        final long d = a.d;
        final p07 h = a.h;
        h.e.b((Callable)new q07(h, currentTimeMillis - d, s));
    }
    
    public void recordException(final Throwable t) {
        if (t == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", (Throwable)null);
            return;
        }
        final p07 h = this.a.h;
        final Thread currentThread = Thread.currentThread();
        Objects.requireNonNull(h);
        final long currentTimeMillis = System.currentTimeMillis();
        final g07 e = h.e;
        final r07 r07 = new r07(h, currentTimeMillis, t, currentThread);
        Objects.requireNonNull(e);
        e.b((Callable)new h07((Runnable)r07));
    }
    
    public void sendUnsentReports() {
        final p07 h = this.a.h;
        h.o.d((Object)Boolean.TRUE);
        final rzz a = h.p.a;
    }
    
    public void setCrashlyticsCollectionEnabled(final Boolean b) {
        this.a.d(b);
    }
    
    public void setCrashlyticsCollectionEnabled(final boolean b) {
        this.a.d(Boolean.valueOf(b));
    }
    
    public void setCustomKey(final String s, final double n) {
        this.a.e(s, Double.toString(n));
    }
    
    public void setCustomKey(final String s, final float n) {
        this.a.e(s, Float.toString(n));
    }
    
    public void setCustomKey(final String s, final int n) {
        this.a.e(s, Integer.toString(n));
    }
    
    public void setCustomKey(final String s, final long n) {
        this.a.e(s, Long.toString(n));
    }
    
    public void setCustomKey(final String s, final String s2) {
        this.a.e(s, s2);
    }
    
    public void setCustomKey(final String s, final boolean b) {
        this.a.e(s, Boolean.toString(b));
    }
    
    public void setCustomKeys(final sa7 sa7) {
        throw null;
    }
    
    public void setUserId(final String s) {
        final new d = this.a.h.d;
        Objects.requireNonNull(d);
        final String a = wre.a(s, 1024);
        synchronized (d.f) {
            final String s2 = d.f.getReference();
            boolean equals;
            if (a == null) {
                equals = (s2 == null);
            }
            else {
                equals = a.equals(s2);
            }
            if (equals) {
                monitorexit(d.f);
            }
            else {
                d.f.set(a, true);
                monitorexit(d.f);
                d.b.b((Callable)new lew((Object)d, 0));
            }
        }
    }
}
