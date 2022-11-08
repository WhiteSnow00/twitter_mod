// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import android.content.Context;

public abstract class c
{
    public Context C0;
    public WorkerParameters D0;
    public volatile boolean E0;
    public boolean F0;
    
    public c(final Context c0, final WorkerParameters d0) {
        if (c0 == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (d0 != null) {
            this.C0 = c0;
            this.D0 = d0;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }
    
    public hnf<dmb> b() {
        final bnp bnp = new bnp();
        bnp.p((Throwable)new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return (hnf<dmb>)bnp;
    }
    
    public void c() {
    }
    
    public abstract hnf<a> d();
    
    public final void e() {
        this.E0 = true;
        this.c();
    }
    
    public abstract static class a
    {
    }
}
