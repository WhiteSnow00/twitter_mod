import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ft6 extends pn7
{
    public final String e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final List<eg7> l;
    public final ekd m;
    public final ekd n;
    public final ekd o;
    
    public ft6(final a a) {
        super((pn7.a)a, a.d);
        this.g = a.e;
        this.h = a.f;
        this.i = a.g;
        this.j = a.h;
        this.k = a.i;
        this.f = a.k;
        this.e = a.j;
        Object l;
        if ((l = a.l) == null) {
            l = h3a.F0;
        }
        this.l = (List<eg7>)l;
        this.m = a.m;
        this.n = a.n;
        this.o = a.o;
    }
    
    public final long a() {
        return this.i;
    }
    
    public final long b() {
        return this.g;
    }
    
    public final long c() {
        return this.j;
    }
    
    public final long d() {
        return this.k;
    }
    
    public static final class a extends pn7.a<ft6, a>
    {
        public int d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public String j;
        public int k;
        public List<eg7> l;
        public ekd m;
        public ekd n;
        public ekd o;
        
        public final Object i() {
            return new ft6(this);
        }
    }
}
