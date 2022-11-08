import kotlin.NoWhenBranchMatchedException;
import com.twitter.util.user.UserIdentifier;
import com.twitter.util.InvalidDataException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d5l implements b5l
{
    public final e3s a;
    public final ix4 b;
    public final q1w c;
    public final tiw d;
    public final hn6 e;
    public final ocw f;
    public final a5l g;
    public final d3v h;
    public final d3v i;
    public final hr3 j;
    public final e3s k;
    public final y9w l;
    public final ix4 m;
    public final faw n;
    public final qlr o;
    public final q1w p;
    public final qyb q;
    public final qyb r;
    public final dml s;
    
    public d5l(final e3s a, final ix4 b, final q1w c, final tiw d, final hn6 e, final ocw f, final a5l g, final d3v h, final d3v i, final hr3 j, final e3s k, final y9w l, final ix4 m, final faw n, final qlr o, final q1w p19, final qyb q, final qyb r, final dml s) {
        zzd.f((Object)d, "userStore");
        zzd.f((Object)e, "contentUriNotifier");
        zzd.f((Object)f, "userInfo");
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
    
    public static final n9q o(final d5l d5l, final String s) {
        return ((omm)d5l.h).S((Object)new wjw(s, true)).y(yvo.c());
    }
    
    public static final snj p(final d5l d5l, final vrm vrm) {
        Objects.requireNonNull(d5l);
        if (vrm.d()) {
            snj snj;
            if (vrm.d() && vrm.c() instanceof efw.b) {
                final Object c = vrm.c();
                zzd.d(c, "null cannot be cast to non-null type com.twitter.model.core.entity.UserOrValidationError.ValidationError");
                snj = snj.b((Object)((efw.b)c).a);
            }
            else {
                snj = snj.b;
                final int a = w4j.a;
            }
            return snj;
        }
        throw new InvalidDataException(((pav)vrm.b()).e());
    }
    
    public final n9q<snj<knw>> a(final String s, final u33 u33, final k7 k7, final boolean b) {
        return (n9q<snj<knw>>)new taq((ubq)((n9q)new naq((ubq)this.k.S((Object)new qjw(s, u33, k7)).y(yvo.c()), (fk6)new nol((rtb)new e5l(this), 8))).w((qtb)new i5i((rtb)new f5l(this), 7)), (qtb)new wpl((rtb)new d5l$v(b, this, s), 9));
    }
    
    public final n9q<snj<knw>> b(final String s, final mef mef, final boolean b) {
        return (n9q<snj<knw>>)new taq((ubq)((n9q)new naq((ubq)((omm)this.m).S((Object)new sjw(s, mef)).y(yvo.c()), (fk6)new ccj((rtb)new g5l(this), 5))).w((qtb)new i4i((rtb)new h5l(this), 11)), (qtb)new wj4((rtb)new d5l$w(b, this, s), 29));
    }
    
    public final n9q<snj<knw>> c(final u33 u33, final k7 k7, final boolean b) {
        return (n9q<snj<knw>>)((n9q)new oaq((ubq)new naq((ubq)((omm)this.i).S((Object)new t9w(u33, k7, b)).y(yvo.c()), (fk6)new zgw((rtb)new d5l$a(this), 1)), (fk6)new hlx((rtb)new d5l$b(this), 4))).w((qtb)new ozb((rtb)new d5l$c((Object)this), 2));
    }
    
    public final iz5 d(final boolean b) {
        return this.q(4, ((omm)this.c).S((Object)new r1w(UserIdentifier.Companion.c(), b)));
    }
    
    public final n9q<snj<knw>> e(final mef mef, final boolean b) {
        return (n9q<snj<knw>>)((n9q)new oaq((ubq)new naq((ubq)((omm)this.l).S((Object)new aaw(mef, b)).y(yvo.c()), (fk6)new hlx((rtb)new d5l$d(this), 2)), (fk6)new xol((rtb)new d5l$e(this), 3))).w((qtb)new dzf((rtb)new d5l$f((Object)this), 10));
    }
    
    public final iz5 f(final String s) {
        return (iz5)new yz5((ubq)((n9q)new oaq((ubq)new naq((ubq)((omm)this.j).S((Object)s).y(yvo.c()), (fk6)new ccj((rtb)new d5l$j(this), 3)), (fk6)new tst((rtb)new d5l$k(this), 4))).w((qtb)new jhb((rtb)d5l$l.C0, 5)));
    }
    
    public final n9q<snj<knw>> g(final String s, final yeh yeh, final boolean b) {
        return (n9q<snj<knw>>)new taq((ubq)((n9q)new naq((ubq)((omm)this.p).S((Object)new ujw(s, this.s.B0(yeh))).y(yvo.c()), (fk6)new yhc((rtb)new i5l(this), 6))).w((qtb)new wpl((rtb)new j5l(this), 10)), (qtb)new uii((rtb)new rtb<snj<knw>, ubq<? extends snj<knw>>>() {
            public final /* synthetic */ d5l D0;
            
            public final Object invoke(final Object o) {
                final snj snj = (snj)o;
                zzd.f((Object)snj, "validationError");
                n9q n9q;
                if (snj.e() && b) {
                    n9q = d5l.o(this.D0, s).w((qtb)new q3m((rtb)n5l.C0, 8));
                }
                else {
                    n9q = n9q.v((Object)snj);
                }
                return n9q;
            }
        }, 9));
    }
    
    public final n9q<snj<knw>> h(final yeh yeh, final boolean b) {
        return (n9q<snj<knw>>)((n9q)new oaq((ubq)new naq((ubq)((omm)this.o).S((Object)new caw(this.s.B0(yeh), b)).y(yvo.c()), (fk6)new tst((rtb)new d5l$g(this), 3)), (fk6)new aqi((rtb)new d5l$h(this), 9))).w((qtb)new wj4((rtb)new d5l$i((Object)this), 28));
    }
    
    public final n9q<snj<String>> i(final String s) {
        zzd.f((Object)s, "address");
        return (n9q<snj<String>>)((omm)this.r).S((Object)new syb(s)).y(yvo.c()).l((fk6)new c5l((rtb)new d5l$s(this), 0)).m((fk6)new ccj((rtb)new d5l$t(this), 4)).w((qtb)new i4i((rtb)d5l$u.C0, 10));
    }
    
    public final iz5 j(final String s) {
        return (iz5)new yz5((ubq)((n9q)new oaq((ubq)new naq((ubq)((omm)this.n).S((Object)s).y(yvo.c()), (fk6)new hlx((rtb)new d5l$m(this), 3)), (fk6)new xol((rtb)new d5l$n(this), 4))).w((qtb)new dzf((rtb)d5l$o.C0, 11)));
    }
    
    public final iz5 k() {
        return this.q(1, ((omm)this.b).S((Object)new g3s(UserIdentifier.Companion.c())));
    }
    
    public final iz5 l(final v6l v6l) {
        final v2s v2s = new v2s(UserIdentifier.Companion.c(), v6l);
        Objects.requireNonNull(l7k.a);
        final int ordinal = ((Enum)v6l).ordinal();
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
        return this.q(n, this.a.S((Object)v2s));
    }
    
    public final iz5 m(final String s) {
        return (iz5)new yz5((ubq)((n9q)new oaq((ubq)new naq((ubq)((omm)this.q).S((Object)s).y(yvo.c()), (fk6)new cwt((rtb)new d5l$p(this), 10)), (fk6)new nol((rtb)new d5l$q(this), 7))).w((qtb)new i5i((rtb)d5l$r.C0, 6)));
    }
    
    public final n9q<snj<z8w>> n(final String s, final boolean b) {
        zzd.f((Object)s, "moduleId");
        return (n9q<snj<z8w>>)((omm)this.h).S((Object)new wjw(s, b)).y(yvo.c()).w((qtb)new jhb((rtb)d5l$y.C0, 6));
    }
    
    public final iz5 q(final Object o, final n9q<vrm<rhw, pav>> n9q) {
        return (iz5)new yz5((ubq)((n9q)new naq((ubq)n9q.y(yvo.c()), (fk6)new nol((rtb)new o5l(this, (int)o), 6))).w((qtb)new i5i((rtb)new p5l(this, (int)o), 5)).w((qtb)new naf((rtb)new q5l(this, (int)o), 1)));
    }
}
