import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gto
{
    public static final dto<bd0, Object> a;
    public static final dto<List<bd0$b<?>>, Object> b;
    public static final dto<bd0$b<?>, Object> c;
    public static final dto<wpw, Object> d;
    public static final dto<q5w, Object> e;
    public static final dto<pvj, Object> f;
    public static final dto<ozq, Object> g;
    public static final dto<kes, Object> h;
    public static final dto<jhs, Object> i;
    public static final dto<khs, Object> j;
    public static final dto<rlb, Object> k;
    public static final dto<rr1, Object> l;
    public static final dto<mis, Object> m;
    public static final dto<jqp, Object> n;
    public static final dto<pr4, Object> o;
    public static final dto<cjs, Object> p;
    public static final dto<qfj, Object> q;
    public static final dto<k5g, Object> r;
    public static final dto<i5g, Object> s;
    
    static {
        gto.a = (eto.eto$c)eto.a((gub)gto$a.C0, (rtb)gto$b.C0);
        gto.b = (eto.eto$c)eto.a((gub)gto$c.C0, (rtb)gto$d.C0);
        gto.c = (eto.eto$c)eto.a((gub)gto$e.C0, (rtb)gto$f.C0);
        gto.d = (eto.eto$c)eto.a((gub)gto$k0.C0, (rtb)gto$l0.C0);
        gto.e = (eto.eto$c)eto.a((gub)gto$i0.C0, (rtb)gto$j0.C0);
        gto.f = (eto.eto$c)eto.a((gub)gto$s.C0, (rtb)gto$t.C0);
        gto.g = (eto.eto$c)eto.a((gub)gto$w.C0, (rtb)gto$x.C0);
        gto.h = (eto.eto$c)eto.a((gub)gto$y.C0, (rtb)gto$z.C0);
        gto.i = (eto.eto$c)eto.a((gub)gto$a0.C0, (rtb)gto$b0.C0);
        gto.j = (eto.eto$c)eto.a((gub)gto$c0.C0, (rtb)gto$d0.C0);
        gto.k = (eto.eto$c)eto.a((gub)gto$k.C0, (rtb)gto$l.C0);
        gto.l = (eto.eto$c)eto.a((gub)gto$g.C0, (rtb)gto$h.C0);
        gto.m = (eto.eto$c)eto.a((gub)gto$e0.C0, (rtb)gto$f0.C0);
        gto.n = (eto.eto$c)eto.a((gub)gto$u.C0, (rtb)gto$v.C0);
        gto.o = (eto.eto$c)eto.a((gub)gto$i.C0, (rtb)gto$j.C0);
        gto.p = (eto.eto$c)eto.a((gub)gto$g0.C0, (rtb)gto$h0.C0);
        gto.q = (eto.eto$c)eto.a((gub)gto$q.C0, (rtb)gto$r.C0);
        gto.r = (eto.eto$c)eto.a((gub)gto$m.C0, (rtb)gto$n.C0);
        gto.s = (eto.eto$c)eto.a((gub)gto$o.C0, (rtb)gto$p.C0);
    }
    
    public static final dto<pr4, Object> a(final pr4.a a) {
        zzd.f((Object)a, "<this>");
        return (dto<pr4, Object>)gto.o;
    }
    
    public static final dto<cjs, Object> b(final cjs$a cjs$a) {
        zzd.f((Object)cjs$a, "<this>");
        return (dto<cjs, Object>)gto.p;
    }
    
    public static final <T extends dto<Original, Saveable>, Original, Saveable> Object c(final Original original, final T t, final fto fto) {
        zzd.f((Object)t, "saver");
        zzd.f((Object)fto, "scope");
        Object o;
        if (original == null || (o = t.a(fto, (Object)original)) == null) {
            o = Boolean.FALSE;
        }
        return o;
    }
}
