import java.io.IOException;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class d7a implements xes
{
    public static final alp<d7a> F0;
    public static final Comparator<d7a> G0;
    public final int C0;
    public final int D0;
    public final int E0;
    
    static {
        d7a.F0 = (jx6)hx6.b(new pkp[] { new pkp((Class)dtg.class, (alp)new dtg$b()), new pkp((Class)w5w.class, (alp)new w5w$d()), new pkp((Class)h4h.class, (alp)new h4h$b()), new pkp((Class)qgc.class, (alp)new qgc$b()), new pkp((Class)gn3.class, (alp)new gn3$b()), new pkp((Class)olc.class, (alp)new olc$b()), new pkp((Class)hvd.class, (alp)new hvd$b()) });
        d7a.G0 = c.C0;
    }
    
    public d7a(final a a) {
        this.C0 = a.a;
        this.D0 = a.b;
        this.E0 = a.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof d7a && this.f((d7a)o));
    }
    
    public final boolean f(final d7a d7a) {
        return this == d7a || (d7a != null && this.D0 == d7a.D0 && this.E0 == d7a.E0);
    }
    
    public abstract a g();
    
    @Override
    public int hashCode() {
        return this.C0 * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder g = w48.g("Entity{entityId=");
        g.append(this.C0);
        g.append(", start=");
        g.append(this.D0);
        g.append(", end=");
        return y70.y(g, this.E0, '}');
    }
    
    public abstract static class a<E extends d7a, B extends a<E, B>> extends h4j<E>
    {
        public int a;
        public int b;
        public int c;
        
        public a() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
        }
        
        public a(final d7a d7a) {
            this.a = -1;
            this.b = -1;
            this.c = -1;
            this.a = d7a.C0;
            this.b = d7a.D0;
            this.c = d7a.E0;
        }
        
        public void m() {
            if (this.a == -1) {
                this.a = this.b;
            }
        }
        
        public final B o(final ioa$b ioa$b) {
            this.b = ioa$b.b();
            this.c = ioa$b.a();
            final int a = w4j.a;
            return (B)this;
        }
    }
    
    public abstract static class b<E extends d7a, B extends a<E, B>> extends js2<E, B>
    {
        public b(final int n) {
            super(n);
        }
        
        public final void i(final elp elp, final B b, int n) throws IOException, ClassNotFoundException {
            if (n >= 2) {
                b.a = elp.z();
                n = w4j.a;
            }
            b.b = elp.z();
            n = w4j.a;
            b.c = elp.z();
        }
        
        public final void j(final flp flp, final E e) throws IOException {
            flp.z(e.C0).z(e.D0).z(e.E0);
        }
    }
    
    public static final class c implements Comparator<d7a>
    {
        public static final Comparator<d7a> C0;
        
        static {
            c.C0 = new c();
        }
        
        @Override
        public final int compare(final Object o, final Object o2) {
            final d7a d7a = (d7a)o;
            final d7a d7a2 = (d7a)o2;
            final int d0 = d7a.D0;
            final int d2 = d7a2.D0;
            int n;
            if (d0 < d2) {
                n = -1;
            }
            else if (d0 == d2) {
                n = 0;
            }
            else {
                n = 1;
            }
            return n;
        }
    }
}
