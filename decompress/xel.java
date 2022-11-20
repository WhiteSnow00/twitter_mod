import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class xel extends ap1
{
    public final obi<?> v1;
    public boolean w1;
    public boolean x1;
    
    public xel(final tcv tcv, final mws mws, final hss hss, final gh7<bo6> gh7, final gdf<cxs> gdf, final brb brb, final tod tod, final epi<cxs> epi, final Context context, final sc sc, final vxs vxs, final w0t w0t, final c3e<cxs> c3e, final xba<bo> xba, final udx udx, final efv efv, final mel mel, final flj flj, final obi<?> v1) {
        super(tcv, mws, hss, (gh7)gh7, (gdf)gdf, brb, tod, (epi)epi, context, sc, vxs, w0t, (c3e)c3e, (xba)xba, udx, efv, mel, flj);
        this.x1 = true;
        this.v1 = v1;
        final Bundle q = tcv.q;
        if (q != null) {
            this.x1 = q.getBoolean("state_first_fetch", true);
        }
    }
    
    public static void C1(final xel xel) {
        if (xel.w1) {
            final af4 af4 = new af4();
            ((u0p)af4).q(new String[] { "profile", "edit_profile_flow", null, "timeline", "launch" });
            cbw.b((elm)af4);
            ((ucv)xel).q0().startActivity(ngl.j((Context)((ucv)xel).D0, "profile"));
        }
        else {
            final af4 af5 = new af4();
            ((u0p)af5).q(new String[] { "profile", "compose", null, "timeline", "launch" });
            cbw.b((elm)af5);
            final obi<?> v1 = xel.v1;
            final z66 z66 = new z66();
            z66.q(false);
            v1.d((ym)z66);
        }
    }
    
    public int D1() {
        return 2131953839;
    }
    
    public final g2a E1() {
        cj1.b(this.B1());
        final boolean p1 = nza.p1(true);
        this.w1 = p1;
        int n;
        int d1;
        int n2;
        if (p1) {
            n = 2131953844;
            d1 = 2131953843;
            n2 = 2131953842;
        }
        else {
            n = 2131953845;
            d1 = this.D1();
            n2 = 2131953840;
        }
        final g2a$a g2a$a = new g2a$a();
        final nw6 a = tes.a;
        g2a$a.a = (tes)new dkr(n);
        g2a$a.b = (tes)new dkr(d1);
        g2a$a.c = (tes)new dkr(n2);
        return (g2a)((n4j)g2a$a).e();
    }
    
    public final boolean I0() {
        return true;
    }
    
    public final void J0() {
        if (!this.B1() && this.x1) {
            this.x1 = false;
            ((eus)this).d1(3);
        }
        else {
            ((eus)this).d1(4);
        }
    }
    
    public final void K0() {
        ((ucv)this).Y0.a2();
        ((eus)this).d1(3);
        this.x1 = false;
    }
    
    public final void Q0(final Bundle bundle) {
        super.Q0(bundle);
        bundle.putBoolean("state_first_fetch", this.x1);
    }
    
    public final boolean i0() {
        return false;
    }
    
    public gdv$b l0(final gdv$b gdv$b) {
        super.l0(gdv$b);
        gdv$b.a = "profile_tweets";
        if (this.B1()) {
            final i2a$d b = gdv$b.b;
            b.a = 2131625221;
            b.b = 0;
            final i2a$e c = new i2a$e(this.E1());
            c.a = (i2a$c)new e71((Object)this, 21);
            b.c = c;
        }
        return gdv$b;
    }
    
    public final void r1() {
        super.r1();
        final vel b = vel.B(((ucv)this).G0, ((ucv)this).b1, false);
        if (b != null && (b.u |= 0x1) == 0x3) {
            ((cjg)b).i();
        }
        w1e.z().b5().d((vte$a)vte$a.E0);
    }
    
    public final void t1() {
        if (this.B1() && this.w1 != nza.p1(true)) {
            final i2a$d e0 = ((ucv)this).Y0.P0.E0;
            final i2a$e c = new i2a$e(this.E1());
            c.a = (i2a$c)new erx((Object)this, 16);
            e0.c = c;
            if (((ucv)this).Y0.O1()) {
                ((ucv)this).Y0.P0.b(true);
            }
        }
        if (((ucv)this).B0()) {
            final q3e v0 = ((ucv)this).v0();
            final int a = c5j.a;
            ((epi)v0).g();
        }
    }
    
    public final int x0(final long n) {
        return ((ucv)this).Y0.I1(n);
    }
}
