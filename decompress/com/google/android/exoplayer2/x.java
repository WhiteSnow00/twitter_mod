// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.util.Log;
import java.util.concurrent.TimeoutException;
import android.os.Looper;

public final class x
{
    public final b a;
    public final a b;
    public final lh4 c;
    public final e0 d;
    public int e;
    public Object f;
    public Looper g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    
    public x(final a b, final b a, final e0 d, final int h, final lh4 c, final Looper g) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.g = g;
        this.c = c;
        this.h = h;
    }
    
    public final boolean a(final long n) throws InterruptedException, TimeoutException {
        synchronized (this) {
            omy.k(this.i);
            omy.k(this.g.getThread() != Thread.currentThread());
            final long c = this.c.c();
            long n2 = n;
            boolean k;
            while (true) {
                k = this.k;
                if (k || n2 <= 0L) {
                    break;
                }
                this.c.d();
                this.wait(n2);
                n2 = c + n - this.c.c();
            }
            if (k) {
                return this.j;
            }
            throw new TimeoutException("Message delivery timed out.");
        }
    }
    
    public final void b(final boolean b) {
        synchronized (this) {
            this.j |= b;
            this.k = true;
            this.notifyAll();
        }
    }
    
    public final x c() {
        omy.k(this.i ^ true);
        this.i = true;
        final m m = (m)this.b;
        synchronized (m) {
            if (!m.c1 && ((Thread)m.L0).isAlive()) {
                ((s5s.a)m.K0.d(14, this)).b();
                monitorexit(m);
            }
            else {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                this.b(false);
            }
            return this;
        }
    }
    
    public final x d(final Object f) {
        omy.k(this.i ^ true);
        this.f = f;
        return this;
    }
    
    public final x e(final int e) {
        omy.k(this.i ^ true);
        this.e = e;
        return this;
    }
    
    public interface a
    {
    }
    
    public interface b
    {
        void m(final int p0, final Object p1) throws ExoPlaybackException;
    }
}
