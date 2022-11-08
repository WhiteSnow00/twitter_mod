import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k3r
{
    public static int k;
    public m3r a;
    public final String b;
    public final a c;
    public final a d;
    public final a e;
    public double f;
    public boolean g;
    public CopyOnWriteArraySet<t3r> h;
    public double i;
    public final cq1 j;
    
    public k3r(final cq1 j) {
        this.c = new a();
        this.d = new a();
        this.e = new a();
        this.g = true;
        this.h = new CopyOnWriteArraySet<t3r>();
        this.i = 0.0;
        if (j != null) {
            this.j = j;
            final StringBuilder g = w48.g("spring:");
            final int k = k3r.k;
            k3r.k = k + 1;
            g.append(k);
            this.b = g.toString();
            this.a = m3r.c;
            return;
        }
        throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
    }
    
    public final k3r a(final t3r t3r) {
        if (t3r != null) {
            this.h.add(t3r);
            return this;
        }
        throw new IllegalArgumentException("newListener is required");
    }
    
    public final boolean b() {
        return Math.abs(this.c.b) <= 0.005 && (Math.abs(this.f - this.c.a) <= 0.005 || this.a.b == 0.0);
    }
    
    public final k3r c(double a) {
        this.c.a = a;
        this.j.a(this.b);
        final Iterator<t3r> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(this);
        }
        final a c = this.c;
        a = c.a;
        this.f = a;
        this.e.a = a;
        c.b = 0.0;
        return this;
    }
    
    public final k3r d(final double f) {
        if (this.f == f && this.b()) {
            return this;
        }
        final double a = this.c.a;
        this.f = f;
        this.j.a(this.b);
        final Iterator<t3r> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
        return this;
    }
    
    public final k3r e(final m3r a) {
        this.a = a;
        return this;
    }
    
    public static final class a
    {
        public double a;
        public double b;
    }
}
