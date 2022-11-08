import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r1p
{
    public static final alp<r1p> r;
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;
    public ziu k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Boolean o;
    public Boolean p;
    public os9 q;
    
    static {
        r1p.r = new r1p.r1p$b();
    }
    
    public r1p(final r1p.r1p$a r1p$a) {
        this.a = r1p$a.a;
        this.i = r1p$a.b;
        this.b = r1p$a.c;
        this.c = r1p$a.d;
        this.d = r1p$a.e;
        this.e = r1p$a.f;
        this.f = r1p$a.g;
        this.g = r1p$a.h;
        this.h = r1p$a.i;
        this.j = r1p$a.j;
        this.k = r1p$a.k;
        this.l = r1p$a.l;
        this.m = r1p$a.m;
        this.n = r1p$a.n;
        this.o = r1p$a.o;
        this.p = r1p$a.p;
        this.q = r1p$a.q;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && r1p.class == o.getClass()) {
            final r1p r1p = (r1p)o;
            if (this.a != r1p.a || this.b != r1p.b || this.c != r1p.c || this.d != r1p.d || this.e != r1p.e || this.f != r1p.f || this.g != r1p.g || this.h != r1p.h || this.i != r1p.i || this.j != r1p.j || !w4j.a((Object)this.k, (Object)r1p.k) || this.l != r1p.l || this.m != r1p.m || this.n != r1p.n || this.o != r1p.o || this.p != r1p.p || this.q != r1p.q) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.f, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }
}
