import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class r7a implements kgs
{
    public static final nmp<r7a> I0;
    public static final Comparator<r7a> J0;
    public final int F0;
    public final int G0;
    public final int H0;
    
    static {
        r7a.I0 = (tx6)rx6.b(new cmp[] { new cmp((Class)wtg.class, (nmp)new wtg$b()), new cmp((Class)w6w.class, (nmp)new w6w$d()), new cmp((Class)z4h.class, (nmp)new z4h$b()), new cmp((Class)sgc.class, (nmp)new sgc$b()), new cmp((Class)on3.class, (nmp)new on3$b()), new cmp((Class)olc.class, (nmp)new olc$b()), new cmp((Class)mvd.class, (nmp)new mvd$b()) });
        r7a.J0 = c.F0;
    }
    
    public r7a(final a a) {
        this.F0 = a.a;
        this.G0 = a.b;
        this.H0 = a.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof r7a && this.f((r7a)o));
    }
    
    public final boolean f(final r7a r7a) {
        return this == r7a || (r7a != null && this.G0 == r7a.G0 && this.H0 == r7a.H0);
    }
    
    public abstract a g();
    
    @Override
    public int hashCode() {
        return this.F0 * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder f = ehk.f("Entity{entityId=");
        f.append(this.F0);
        f.append(", start=");
        f.append(this.G0);
        f.append(", end=");
        return gwl.x(f, this.H0, '}');
    }
    
    public abstract static class a<E extends r7a, B extends a<E, B>> extends z4j<E>
    {
        public int a;
        public int b;
        public int c;
        
        public a() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
        }
        
        public a(final r7a r7a) {
            this.a = -1;
            this.b = -1;
            this.c = -1;
            this.a = r7a.F0;
            this.b = r7a.G0;
            this.c = r7a.H0;
        }
        
        public void m() {
            if (this.a == -1) {
                this.a = this.b;
            }
        }
        
        public final B o(final poa$b poa$b) {
            this.b = poa$b.b();
            this.c = poa$b.a();
            final int a = o5j.a;
            return (B)this;
        }
    }
    
    public static final class c implements Comparator<r7a>
    {
        public static final Comparator<r7a> F0;
        
        static {
            c.F0 = new c();
        }
        
        @Override
        public final int compare(final Object o, final Object o2) {
            final r7a r7a = (r7a)o;
            final r7a r7a2 = (r7a)o2;
            final int g0 = r7a.G0;
            final int g2 = r7a2.G0;
            int n;
            if (g0 < g2) {
                n = -1;
            }
            else if (g0 == g2) {
                n = 0;
            }
            else {
                n = 1;
            }
            return n;
        }
    }
}
