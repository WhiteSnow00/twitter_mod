import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class lel extends ep1
{
    public final mbi<?> u1;
    public boolean v1;
    public boolean w1;
    
    public lel(final ybv ybv, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final jev jev, final ael ael, final alj alj, final mbi<?> u1) {
        super(ybv, aws, qrs, zh7, udf, dsb, rpd, zoi, context, uc, exs, g0t, x3e, pca, adx, jev, ael, alj);
        this.w1 = true;
        this.u1 = u1;
        final Bundle q = ybv.q;
        if (q != null) {
            this.w1 = q.getBoolean("state_first_fetch", true);
        }
    }
    
    public static void C1(final lel lel) {
        if (lel.v1) {
            final zf4 zf4 = new zf4();
            zf4.q(new String[] { "profile", "edit_profile_flow", null, "timeline", "launch" });
            saw.b((okm)zf4);
            ((acv)lel).r0().startActivity(bgl.j((Context)((acv)lel).C0, "profile"));
        }
        else {
            final zf4 zf5 = new zf4();
            zf5.q(new String[] { "profile", "compose", null, "timeline", "launch" });
            saw.b((okm)zf5);
            final mbi<?> u1 = lel.u1;
            final o76 o76 = new o76();
            o76.q(false);
            u1.d((zm)o76);
        }
    }
    
    public int D1() {
        return 2131953839;
    }
    
    public final w2a E1() {
        ij1.b(this.B1());
        final boolean h = x3j.H(true);
        this.v1 = h;
        int n;
        int d1;
        int n2;
        if (h) {
            n = 2131953844;
            d1 = 2131953843;
            n2 = 2131953842;
        }
        else {
            n = 2131953845;
            d1 = this.D1();
            n2 = 2131953840;
        }
        final w2a$a w2a$a = new w2a$a();
        final jx6 a = yds.a;
        w2a$a.a = (yds)new jjr(n);
        w2a$a.b = (yds)new jjr(d1);
        w2a$a.c = (yds)new jjr(n2);
        return (w2a)((h4j)w2a$a).e();
    }
    
    public final boolean I0() {
        return true;
    }
    
    public final void J0() {
        if (!this.B1() && this.w1) {
            this.w1 = false;
            ((mts)this).d1(3);
        }
        else {
            ((mts)this).d1(4);
        }
    }
    
    public final void K0() {
        ((acv)this).X0.a2();
        ((mts)this).d1(3);
        this.w1 = false;
    }
    
    public final void Q0(final Bundle bundle) {
        super.Q0(bundle);
        bundle.putBoolean("state_first_fetch", this.w1);
    }
    
    public final boolean i0() {
        return false;
    }
    
    public lcv$b m0(final lcv$b lcv$b) {
        super.m0(lcv$b);
        lcv$b.a = "profile_tweets";
        if (this.B1()) {
            final y2a.d b = lcv$b.b;
            b.a = 2131625219;
            b.b = 0;
            final y2a.e c = new y2a.e(this.E1());
            c.a = (y2a.c)new yga((Object)this, 12);
            b.c = c;
        }
        return lcv$b;
    }
    
    public final void r1() {
        super.r1();
        final jel b = jel.B(((acv)this).F0, ((acv)this).a1, false);
        if (b != null && (b.u |= 0x1) == 0x3) {
            ((ejg)b).i();
        }
        yqh.h().b5().d((jue$a)jue$a.D0);
    }
    
    public final void t1() {
        if (this.B1() && this.v1 != x3j.H(true)) {
            final y2a.d d0 = ((acv)this).X0.O0.D0;
            final y2a.e c = new y2a.e(this.E1());
            c.a = (y2a.c)new yqx((Object)this, 16);
            d0.c = c;
            if (((acv)this).X0.O1()) {
                ((acv)this).X0.O0.b(true);
            }
        }
        if (((acv)this).B0()) {
            final l4e<Object> v0 = ((acv<Object>)this).v0();
            final int a = w4j.a;
            ((zoi)v0).g();
        }
    }
    
    public final int x0(final long n) {
        return ((acv)this).X0.I1(n);
    }
}
