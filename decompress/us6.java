import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class us6 extends fn7
{
    public final String e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final List<vf7> l;
    public final akd m;
    public final akd n;
    public final akd o;
    
    public us6(final a a) {
        super((fn7.a)a, a.d);
        this.g = a.e;
        this.h = a.f;
        this.i = a.g;
        this.j = a.h;
        this.k = a.i;
        this.f = a.k;
        this.e = a.j;
        Object l;
        if ((l = a.l) == null) {
            l = v2a.C0;
        }
        this.l = (List<vf7>)l;
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
    
    public static final class a extends fn7.a<us6, a>
    {
        public int d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public String j;
        public int k;
        public List<vf7> l;
        public akd m;
        public akd n;
        public akd o;
        
        public final Object i() {
            return new us6(this);
        }
    }
}
