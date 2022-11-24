import kotlin.NoWhenBranchMatchedException;
import com.twitter.util.user.UserIdentifier;
import com.twitter.util.InvalidDataException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d6l implements a6l
{
    public final k4v a;
    public final s4s b;
    public final gnr c;
    public final bkw d;
    public final tn6 e;
    public final qdw f;
    public final z5l g;
    public final nr3 h;
    public final nr3 i;
    public final dbw j;
    public final k4v k;
    public final waw l;
    public final s4s m;
    public final fbw n;
    public final zaw o;
    public final gnr p;
    public final rx4 q;
    public final rx4 r;
    public final h7z s;
    
    public d6l(final k4v a, final s4s b, final gnr c, final bkw d, final tn6 e, final qdw f, final z5l g, final nr3 h, final nr3 i, final dbw j, final k4v k, final waw l, final s4s m, final fbw n, final zaw o, final gnr p19, final rx4 q, final rx4 r, final h7z s) {
        e0e.f((Object)d, "userStore");
        e0e.f((Object)e, "contentUriNotifier");
        e0e.f((Object)f, "userInfo");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p19;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    public static final bbq o(final d6l d6l, final String s) {
        return ((tnm<flw, Object, osc>)d6l.h).S(new flw(s, true)).y(jxo.c());
    }
    
    public static final noj p(final d6l d6l, final btm btm) {
        Objects.requireNonNull(d6l);
        if (btm.d()) {
            noj noj;
            if (btm.d() && btm.c() instanceof hgw.b) {
                final Object c = btm.c();
                e0e.d(c, "null cannot be cast to non-null type com.twitter.model.core.entity.UserOrValidationError.ValidationError");
                noj = noj.b((Object)((hgw.b)c).a);
            }
            else {
                noj = noj.b;
                final int a = o5j.a;
            }
            return noj;
        }
        throw new InvalidDataException(((zbv)btm.b()).e());
    }
    
    @Override
    public final bbq<noj<uow>> a(final String s, final e43 e43, final i7 i7, final boolean b) {
        return (bbq<noj<uow>>)new hcq((idq)((bbq)new bcq((idq)((tnm<zkw, Object, osc>)this.k).S(new zkw(s, e43, i7)).y(jxo.c()), (rk6)new xql((stb)new e6l(this), 11))).w((rtb)new kzf((stb)new f6l(this), 3)), (rtb)new yql((stb)new d6l$v(b, this, s), 10));
    }
    
    @Override
    public final bbq<noj<uow>> b(final String s, final vef vef, final boolean b) {
        return (bbq<noj<uow>>)new hcq((idq)((bbq)new bcq((idq)((tnm<blw, Object, osc>)this.m).S(new blw(s, vef)).y(jxo.c()), (rk6)new c6l((stb)new g6l(this), 0))).w((rtb)new t3i((stb)new h6l(this), 9)), (rtb)new uti((stb)new d6l$w(b, this, s), 4));
    }
    
    @Override
    public final bbq<noj<uow>> c(final e43 e43, final i7 i7, final boolean b) {
        return (bbq<noj<uow>>)((bbq)new ccq((idq)new bcq((idq)((tnm<raw, Object, osc>)this.i).S(new raw(e43, i7, b)).y(jxo.c()), (rk6)new gpl((stb)new d6l$a(this), 5)), (rk6)new rm8((stb)new d6l$b(this), 9))).w((rtb)new x2i((stb)new d6l$c((Object)this), 12));
    }
    
    @Override
    public final yz5 d(final boolean b) {
        return this.q(4, (bbq)((tnm<u2w, Object, osc>)this.c).S(new u2w(UserIdentifier.Companion.c(), b)));
    }
    
    @Override
    public final bbq<noj<uow>> e(final vef vef, final boolean b) {
        return (bbq<noj<uow>>)((bbq)new ccq((idq)new bcq((idq)((tnm<yaw, Object, osc>)this.l).S(new yaw(vef, b)).y(jxo.c()), (rk6)new rm8((stb)new d6l$d(this), 7)), (rk6)new b6l((stb)new d6l$e(this), 0))).w((rtb)new l5i((stb)new d6l$f((Object)this), 10));
    }
    
    @Override
    public final yz5 f(final String s) {
        return (yz5)new o06((idq)((bbq)new ccq((idq)new bcq((idq)((tnm<String, Object, osc>)this.j).S(s).y(jxo.c()), (rk6)new zc6((stb)new d6l$j(this), 28)), (rk6)new ltt((stb)new d6l$k(this), 3))).w((rtb)new dql((stb)d6l$l.F0, 4)));
    }
    
    @Override
    public final bbq<noj<uow>> g(final String s, final pfh pfh, final boolean b) {
        return (bbq<noj<uow>>)new hcq((idq)((bbq)new bcq((idq)((tnm<dlw, Object, osc>)this.p).S(new dlw(s, this.s.d(pfh))).y(jxo.c()), (rk6)new aic((stb)new i6l(this), 6))).w((rtb)new yql((stb)new j6l(this), 11)), (rtb)new x0i((stb)new d6l$x(b, this, s), 7));
    }
    
    @Override
    public final bbq<noj<uow>> h(final pfh pfh, final boolean b) {
        return (bbq<noj<uow>>)((bbq)new ccq((idq)new bcq((idq)((tnm<bbw, Object, osc>)this.o).S(new bbw(this.s.d(pfh), b)).y(jxo.c()), (rk6)new ltt((stb)new d6l$g(this), 2)), (rk6)new ppl((stb)new d6l$h(this), 4))).w((rtb)new uti((stb)new d6l$i((Object)this), 3));
    }
    
    @Override
    public final bbq<noj<String>> i(final String s) {
        e0e.f((Object)s, "address");
        return (bbq<noj<String>>)((tnm<tyb, Object, osc>)this.r).S(new tyb(s)).y(jxo.c()).l((rk6)new ucj((stb)new d6l$s(this), 2)).m((rk6)new zc6((stb)new d6l$t(this), 29)).w((rtb)new t3i((stb)d6l$u.F0, 8));
    }
    
    @Override
    public final yz5 j(final String s) {
        return (yz5)new o06((idq)((bbq)new ccq((idq)new bcq((idq)((tnm<String, Object, osc>)this.n).S(s).y(jxo.c()), (rk6)new rm8((stb)new d6l$m(this), 8)), (rk6)new b6l((stb)new d6l$n(this), 1))).w((rtb)new l5i((stb)d6l$o.F0, 11)));
    }
    
    @Override
    public final yz5 k() {
        return this.q(1, (bbq)((tnm<t4s, Object, osc>)this.b).S(new t4s(UserIdentifier.Companion.c())));
    }
    
    @Override
    public final yz5 l(final u7l u7l) {
        final i4s i4s = new i4s(UserIdentifier.Companion.c(), u7l);
        Objects.requireNonNull(mqb.b);
        final int ordinal = ((Enum)u7l).ordinal();
        int n;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            n = 3;
        }
        else {
            n = 2;
        }
        return this.q(n, (bbq)((tnm<i4s, Object, osc>)this.a).S(i4s));
    }
    
    @Override
    public final yz5 m(final String s) {
        return (yz5)new o06((idq)((bbq)new ccq((idq)new bcq((idq)((tnm<String, Object, osc>)this.q).S(s).y(jxo.c()), (rk6)new cyt((stb)new d6l$p(this), 12)), (rk6)new xql((stb)new d6l$q(this), 10))).w((rtb)new kzf((stb)d6l$r.F0, 2)));
    }
    
    @Override
    public final bbq<noj<x9w>> n(final String s, final boolean b) {
        e0e.f((Object)s, "moduleId");
        return (bbq<noj<x9w>>)((tnm<flw, Object, osc>)this.h).S(new flw(s, b)).y(jxo.c()).w((rtb)new dql((stb)d6l$y.F0, 5));
    }
    
    public final yz5 q(final Object o, final bbq<btm<ziw, zbv>> bbq) {
        return (yz5)new o06((idq)((bbq)new bcq((idq)bbq.y(jxo.c()), (rk6)new xql((stb)new n6l(this, (int)o), 9))).w((rtb)new kzf((stb)new o6l(this, (int)o), 1)).w((rtb)new mr0((stb)new p6l(this, (int)o), 27)));
    }
}
