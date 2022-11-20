import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.util.user.UserIdentifier;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nqv extends de6<r2t> implements woj
{
    public yrm A1;
    public jcp B1;
    public int C1;
    public int D1;
    public final lws o1;
    public final long p1;
    public final Context q1;
    public final vav r1;
    public final t2t s1;
    public final yov t1;
    public final pqv u1;
    public final AtomicReference<oqv> v1;
    public wzs w1;
    public css x1;
    public vai.a y1;
    public m5h z1;
    
    public nqv(final Context q1, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final int n2, final yov t1, final String s, final pqv u1, final vav r1) {
        super(userIdentifier, n2);
        this.v1 = new AtomicReference<oqv>();
        this.z1 = m5h.d;
        this.B1 = (jcp)jcp.b;
        this.C1 = 0;
        this.D1 = 0;
        this.q1 = q1;
        this.r1 = r1;
        this.p1 = ((anm)this).Q0.getId();
        this.u1 = u1;
        this.s1 = new t2t(q1, ((anm)this).Q0, new nm6(q1.getContentResolver()), r1);
        this.t1 = t1;
        this.o1 = new lws(n, s, userIdentifier2.getId());
    }
    
    public final void c0(final atm<xrc<r2t, kbv>> atm) {
    }
    
    public void d0(final boolean b) {
        final vba r0 = ((anm)this).R0;
        if (r0 != null) {
            final af4 af4 = new af4(((anm)this).Q0);
            ((u0p)af4).T = r0.toString();
            final int a = c5j.a;
            ((u0p)af4).a = this.w0();
            ((u0p)af4).i(((anm)this).S0);
            cbw.b((elm)af4);
        }
    }
    
    public final int g() {
        return this.C1;
    }
    
    public asc<r2t, kbv> g0() {
        final r2t$b$a r2t$b$a = new r2t$b$a();
        r2t$b$a.c = super.l1;
        r2t$b$a.a = this.p1;
        r2t$b$a.d = this.y0();
        r2t$b$a.e = this.z0();
        r2t$b$a.b = this.o1;
        r2t$b$a.f = (this instanceof rpv);
        final r2t$b r2t$b = (r2t$b)((n4j)r2t$b$a).e();
        if (this.t0()) {
            final g7c r0 = this.r0();
            jee.l((Object)r0);
            final i7c i7c = new i7c(r2t$b);
            final f7c b = r0.b;
            return (asc<r2t, kbv>)e7c.Companion.a((com.bluelinelabs.logansquare.typeconverters.TypeConverter<Object>)i7c, b, dnp.t((Object)new f6c(b.a("instructions")), (Object[])new f6c[] { new f6c(r0.b.a("response_objects")) }));
        }
        return (asc<r2t, kbv>)new hqv(r2t$b);
    }
    
    public void m0(final xrc<r2t, kbv> xrc) {
        final vba r0 = ((anm)this).R0;
        if (r0 != null) {
            final af4 af4 = new af4(((anm)this).Q0);
            Objects.requireNonNull(vba.Companion);
            final String h = hmg.h(r0.e, "_failed");
            final String a = r0.a;
            final String b = r0.b;
            final String c = r0.c;
            final String d = r0.d;
            czd.f((Object)a, "page");
            czd.f((Object)b, "section");
            czd.f((Object)c, "component");
            czd.f((Object)d, "element");
            czd.f((Object)h, "action");
            ((u0p)af4).T = new vba(a, b, c, d, h).toString();
            final int a2 = c5j.a;
            ((u0p)af4).a = this.w0();
            ((u0p)af4).i(((anm)this).S0);
            cbw.b((elm)af4);
        }
    }
    
    public void n0(final xrc<r2t, kbv> xrc) {
        final r2t r2t = (r2t)xrc.g;
        if (r2t != null) {
            this.x0(this.s1.a(r2t, (oqv)this.v1.get()));
        }
    }
    
    public p6c p0() {
        final oqv a = this.t1.a();
        this.v1.set(a);
        final g7c r0 = this.r0();
        jee.l((Object)r0);
        final p6c p6c = new p6c();
        p6c.r(r0.a);
        p6c.q(r0.c);
        ((qjg)p6c.i).x(r0.d);
        if (super.l1 != 1 && a != null) {
            p6c.p("cursor", (Object)a.a);
        }
        return p6c;
    }
    
    public final mcv q0() {
        final zvl s0 = this.s0();
        jee.l((Object)s0);
        final String a = s0.a;
        final boolean b = ikr.g((CharSequence)a) && a.endsWith(".json");
        final StringBuilder sb = new StringBuilder();
        sb.append("You must supply a non-empty json path that ends with .json - endpoint: ");
        sb.append(a);
        cj1.c(b, sb.toString());
        final oqv a2 = this.t1.a();
        this.v1.set(a2);
        final mcv mcv = new mcv();
        ((tqc$a)mcv).m(a);
        if (super.l1 != 1 && a2 != null) {
            ((tqc$a)mcv).d("cursor", a2.a);
        }
        ((tqc$a)mcv).i(this.u1.a);
        ((tqc$a)mcv).f("earned", true);
        ((tqc$a)mcv).i(s0.b);
        ((tqc$a)mcv).e = s0.d;
        final int a3 = c5j.a;
        ((tqc$a)mcv).d = s0.e;
        if (asa.b().b("subscriptions_android_is_blue_verified_field_enabled", false)) {
            ((tqc$a)mcv).f("include_ext_is_blue_verified", true);
        }
        for (final Map.Entry<String, V> entry : s0.c.entrySet()) {
            ((tqc$a)mcv).l((String)entry.getKey(), (String)entry.getValue());
        }
        return mcv;
    }
    
    public final int t() {
        return this.D1;
    }
    
    public final oqv v0() {
        return this.v1.get();
    }
    
    public uro w0() {
        return uro.a(asa.b().f("scribe_tlnav_sample_size", 10000));
    }
    
    public void x0(final yrm a1) {
        this.A1 = a1;
        this.z1 = a1.b();
        final int a2 = c5j.a;
        final t3q$a t3q$a = (t3q$a)fq4.q(fq4.e((Iterable)a1.a, (xtk)c1p.j));
        css a3;
        if (t3q$a != null) {
            a3 = t3q$a.a;
        }
        else {
            a3 = null;
        }
        this.x1 = a3;
        this.y1 = (vai.a)fq4.q(fq4.e((Iterable)a1.a, (xtk)b1p.h));
        this.C1 = a1.e();
        this.D1 = a1.a();
        this.w1 = a1.b;
    }
    
    public abstract boolean y0();
    
    public abstract boolean z0();
}
