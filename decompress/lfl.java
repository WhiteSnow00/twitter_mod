import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class lfl extends gp1
{
    public final fci<?> x1;
    public boolean y1;
    public boolean z1;
    
    public lfl(final hdv hdv, final fxs fxs, final bts bts, final ii7<hp6> ii7, final def<vxs> def, final dsb dsb, final vpd vpd, final vpi<vxs> vpi, final Context context, final tc tc, final oys oys, final p1t p1t, final d4e<vxs> d4e, final fda<fo> fda, final mex mex, final sfv sfv, final afl afl, final ulj ulj, final fci<?> x1) {
        super(hdv, fxs, bts, (ii7)ii7, (def)def, dsb, vpd, (vpi)vpi, context, tc, oys, p1t, (d4e)d4e, (fda)fda, mex, sfv, afl, ulj);
        this.z1 = true;
        this.x1 = x1;
        final Bundle q = hdv.q;
        if (q != null) {
            this.z1 = q.getBoolean("state_first_fetch", true);
        }
    }
    
    public static void C1(final lfl lfl) {
        if (lfl.y1) {
            final fg4 fg4 = new fg4();
            ((o1p)fg4).q(new String[] { "profile", "edit_profile_flow", null, "timeline", "launch" });
            sbw.b((tlm)fg4);
            ((idv)lfl).q0().startActivity(zgl.j((Context)((idv)lfl).F0, "profile"));
        }
        else {
            final fg4 fg5 = new fg4();
            ((o1p)fg5).q(new String[] { "profile", "compose", null, "timeline", "launch" });
            sbw.b((tlm)fg5);
            final fci<?> x1 = lfl.x1;
            final f86 f86 = new f86();
            f86.q(false);
            x1.d((cn)f86);
        }
    }
    
    public int D1() {
        return 2131953839;
    }
    
    public final i3a E1() {
        fj1.b(this.B1());
        final boolean z0 = xd.z0(true);
        this.y1 = z0;
        int n;
        int d1;
        int n2;
        if (z0) {
            n = 2131953844;
            d1 = 2131953843;
            n2 = 2131953842;
        }
        else {
            n = 2131953845;
            d1 = this.D1();
            n2 = 2131953840;
        }
        final i3a$a i3a$a = new i3a$a();
        final tx6 a = lfs.a;
        i3a$a.a = (lfs)new zkr(n);
        i3a$a.b = (lfs)new zkr(d1);
        i3a$a.c = (lfs)new zkr(n2);
        return (i3a)((z4j)i3a$a).e();
    }
    
    public final boolean I0() {
        return true;
    }
    
    public final void J0() {
        if (!this.B1() && this.z1) {
            this.z1 = false;
            ((xus)this).d1(3);
        }
        else {
            ((xus)this).d1(4);
        }
    }
    
    public final void K0() {
        ((idv)this).a1.a2();
        ((xus)this).d1(3);
        this.z1 = false;
    }
    
    public final void Q0(final Bundle bundle) {
        super.Q0(bundle);
        bundle.putBoolean("state_first_fetch", this.z1);
    }
    
    public final boolean i0() {
        return false;
    }
    
    public udv$b l0(final udv$b udv$b) {
        super.l0(udv$b);
        udv$b.a = "profile_tweets";
        if (this.B1()) {
            final k3a$d b = udv$b.b;
            b.a = 2131625221;
            b.b = 0;
            final k3a$e c = new k3a$e(this.E1());
            c.a = (k3a$c)new srd((Object)this, 13);
            b.c = c;
        }
        return udv$b;
    }
    
    public final void r1() {
        super.r1();
        final jfl b = jfl.B(((idv)this).I0, ((idv)this).d1, false);
        if (b != null && (b.r |= 0x1) == 0x3) {
            ((wjg)b).i();
        }
        k5b.i().b5().d((sue$a)sue$a.G0);
    }
    
    public final void t1() {
        if (this.B1() && this.y1 != xd.z0(true)) {
            final k3a$d g0 = ((idv)this).a1.R0.G0;
            final k3a$e c = new k3a$e(this.E1());
            c.a = (k3a$c)new q5w((Object)this, 14);
            g0.c = c;
            if (((idv)this).a1.O1()) {
                ((idv)this).a1.R0.b(true);
            }
        }
        if (((idv)this).B0()) {
            final s4e v0 = ((idv)this).v0();
            final int a = o5j.a;
            ((vpi)v0).g();
        }
    }
    
    public final int x0(final long n) {
        return ((idv)this).a1.I1(n);
    }
}
