import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c5r
{
    public static int k;
    public e5r a;
    public final String b;
    public final a c;
    public final a d;
    public final a e;
    public double f;
    public boolean g;
    public CopyOnWriteArraySet<l5r> h;
    public double i;
    public final dq1 j;
    
    public c5r(final dq1 j) {
        this.c = new a();
        this.d = new a();
        this.e = new a();
        this.g = true;
        this.h = new CopyOnWriteArraySet<l5r>();
        this.i = 0.0;
        if (j != null) {
            this.j = j;
            final StringBuilder f = ehk.f("spring:");
            final int k = c5r.k;
            c5r.k = k + 1;
            f.append(k);
            this.b = f.toString();
            this.a = e5r.c;
            return;
        }
        throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
    }
    
    public final c5r a(final l5r l5r) {
        if (l5r != null) {
            this.h.add(l5r);
            return this;
        }
        throw new IllegalArgumentException("newListener is required");
    }
    
    public final boolean b() {
        return Math.abs(this.c.b) <= 0.005 && (Math.abs(this.f - this.c.a) <= 0.005 || this.a.b == 0.0);
    }
    
    public final c5r c(double a) {
        this.c.a = a;
        this.j.a(this.b);
        final Iterator<l5r> iterator = this.h.iterator();
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
    
    public final c5r d(final double f) {
        if (this.f == f && this.b()) {
            return this;
        }
        final double a = this.c.a;
        this.f = f;
        this.j.a(this.b);
        final Iterator<l5r> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
        return this;
    }
    
    public final c5r e(final e5r a) {
        this.a = a;
        return this;
    }
    
    public static final class a
    {
        public double a;
        public double b;
    }
}
