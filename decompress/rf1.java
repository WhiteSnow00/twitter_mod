import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rf1
{
    public final Queue<fvj<ksc<?, ?>, Long>> a;
    public final zau b;
    public final m29 c;
    public final qvo d;
    public final u93<ksc<?, ?>> e;
    public final AtomicLong f;
    public final AtomicLong g;
    public final AtomicInteger h;
    public boolean i;
    public long j;
    
    public rf1(final qvo d, final u93<ksc<?, ?>> u93) {
        this.a = new LinkedBlockingQueue();
        this.b = zau.d();
        this.c = new m29();
        this.f = new AtomicLong();
        this.g = new AtomicLong();
        this.h = new AtomicInteger();
        this.i = false;
        this.j = 0L;
        this.d = d;
        this.e = new ui7((Object)this, (Object)u93, 2);
    }
    
    public final void a(final pf1 pf1) {
        final long a = this.b.a();
        if (pf1.b > 0) {
            final AtomicLong f = this.f;
            f.set(Math.max(f.get(), pf1.b + a));
        }
        if (pf1.a > 0) {
            final AtomicLong g = this.g;
            g.set(Math.max(g.get(), pf1.a + a));
        }
        this.h.set(pf1.c);
        this.c.c(f.f((rj)new ut1((Object)this, 9), Math.max(this.f.get(), this.g.get()) - a, TimeUnit.MILLISECONDS, this.d).p());
    }
    
    public final <REQ extends ksc<?, ?>> fvj<REQ, Long> b() {
        final fvj poll = this.a.poll();
        final int a = w4j.a;
        return (fvj<REQ, Long>)poll;
    }
    
    public final <REQ extends ksc<?, ?>> void c() {
        synchronized (this) {
            final fvj<ksc, Long> b = this.b();
            if (b != null) {
                this.i = true;
                final Object a = ((g2j)b).a;
                pf8.r(a);
                final int a2 = w4j.a;
                final ksc ksc = (ksc)a;
                final long a3 = this.b.a();
                final Object b2 = ((g2j)b).b;
                pf8.r(b2);
                final long longValue = (long)b2;
                final long j = this.j;
                long max;
                if (j > 0L) {
                    max = Math.max(Math.min(j + this.h.get(), this.f.get()) - a3, 0L);
                }
                else {
                    max = 0L;
                }
                final long max2 = Math.max(max, longValue - a3);
                if (max2 > 0L) {
                    f.f((rj)new pj4((Object)this, (Object)ksc, 3), max2, TimeUnit.MILLISECONDS, this.d).p();
                }
                else {
                    ((cw0)ksc).F((cw0$b)new qf1(this));
                    this.e.a((Object)ksc);
                }
            }
            else {
                this.i = false;
            }
        }
    }
    
    public final boolean d(final long n) {
        return n < this.f.get() || n < this.g.get();
    }
}
