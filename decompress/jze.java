import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jze implements a5p
{
    public static final jze.jze$c Companion;
    public static final ouo<jze, ?> u;
    public final hze a;
    public final fvh<zye> b;
    public final juh c;
    public float d;
    public final wwj e;
    public final wwj f;
    public final wwj g;
    public final qk8 h;
    public boolean i;
    public int j;
    public final ivh<x0f$a> k;
    public boolean l;
    public final wwj m;
    public final jze$e n;
    public final ne1 o;
    public final wwj p;
    public final wwj q;
    public boolean r;
    public boolean s;
    public final x0f t;
    
    static {
        Companion = new jze.jze$c();
        jze.u = (puo.puo$c)mmf.a((hub)jze$a.F0, (stb)jze$b.F0);
    }
    
    public jze() {
        this(0, 0);
    }
    
    public jze(final int n, final int n2) {
        this.a = new hze(n, n2);
        this.b = (wwj)zzz.W((Object)f3a.a);
        this.c = new juh();
        this.e = (wwj)zzz.W((Object)0);
        this.f = (wwj)zzz.W((Object)new sp8(1.0f, 1.0f));
        this.g = (wwj)zzz.W((Object)Boolean.TRUE);
        this.h = new qk8((stb<? super Float, Float>)new jze$g(this));
        this.i = true;
        this.j = -1;
        this.k = (ivh<x0f$a>)new ivh((Object[])new x0f$a[16]);
        this.m = (wwj)zzz.W((Object)null);
        this.n = new jze$e(this);
        this.o = new ne1();
        this.p = (wwj)zzz.W((Object)jze$d.F0);
        this.q = (wwj)zzz.W((Object)null);
        this.t = new x0f();
    }
    
    public final boolean a() {
        return this.h.a();
    }
    
    public final float b(final float n) {
        return this.h.b(n);
    }
    
    public final Object c(jvh g0, hub<? super g4p, ? super mp6<? super vzv>, ?> h0, final mp6<? super vzv> mp6) {
        jze$f jze$f2 = null;
        Label_0054: {
            if (mp6 instanceof jze$f) {
                final jze$f jze$f = (jze$f)mp6;
                final int k0 = jze$f.K0;
                if ((k0 & Integer.MIN_VALUE) != 0x0) {
                    jze$f.K0 = k0 + Integer.MIN_VALUE;
                    jze$f2 = jze$f;
                    break Label_0054;
                }
            }
            jze$f2 = new jze$f(this, (mp6)mp6);
        }
        final Object i0 = jze$f2.I0;
        final jz6 f0 = jz6.F0;
        final int k2 = jze$f2.K0;
        jze f2;
        if (k2 != 0) {
            if (k2 != 1) {
                if (k2 == 2) {
                    jb2.M0(i0);
                    return vzv.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                h0 = jze$f2.H0;
                g0 = jze$f2.G0;
                f2 = jze$f2.F0;
                jb2.M0(i0);
            }
        }
        else {
            jb2.M0(i0);
            final ne1 o = this.o;
            jze$f2.F0 = this;
            jze$f2.G0 = g0;
            jze$f2.H0 = h0;
            jze$f2.K0 = 1;
            if (o.a((mp6)jze$f2) == f0) {
                return f0;
            }
            f2 = this;
        }
        final qk8 h2 = f2.h;
        jze$f2.F0 = null;
        jze$f2.G0 = null;
        jze$f2.H0 = null;
        jze$f2.K0 = 2;
        if (h2.c(g0, (hub<? super g4p, ? super mp6<? super vzv>, ?>)h0, (mp6<? super vzv>)jze$f2) == f0) {
            return f0;
        }
        return vzv.a;
    }
    
    public final int d() {
        return this.a.b();
    }
    
    public final int e() {
        return this.a.c();
    }
    
    public final zye f() {
        return ((cjq<zye>)this.b).getValue();
    }
    
    public final boolean g() {
        return ((cjq<Boolean>)this.g).getValue();
    }
    
    public final void h(final int n, final int n2) {
        final hze a = this.a;
        a.d(n, n2);
        a.d = null;
        final hye hye = ((cjq<hye>)this.q).getValue();
        if (hye != null) {
            hye.c();
        }
        final zcm zcm = ((cjq<zcm>)this.m).getValue();
        if (zcm != null) {
            zcm.h();
        }
    }
    
    public final void i(final jye jye) {
        e0e.f((Object)jye, "itemProvider");
        final hze a = this.a;
        Objects.requireNonNull(a);
        final piq a2 = piq.Companion.a();
        try {
            final piq i = a2.i();
            try {
                a.d(jty.A((q0f)jye, a.d, a.b()), a.c());
            }
            finally {
                a2.p(i);
            }
        }
        finally {
            a2.c();
        }
    }
}
