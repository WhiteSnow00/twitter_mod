import com.twitter.app.profiles.di.retained.BaseProfileTimelineRetainedGraph;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbl extends gp1
{
    public nbl(final hdv hdv, final fxs fxs, final bts bts, final ii7<hp6> ii7, final def<vxs> def, final dsb dsb, final vpd vpd, final vpi<vxs> vpi, final Context context, final tc tc, final oys oys, final p1t p1t, final d4e<vxs> d4e, final fda<fo> fda, final mex mex, final sfv sfv, final afl afl, final ulj ulj) {
        super(hdv, fxs, bts, (ii7)ii7, (def)def, dsb, vpd, (vpi)vpi, context, tc, oys, p1t, (d4e)d4e, (fda)fda, mex, sfv, afl, ulj);
    }
    
    public final udv$b l0(final udv$b udv$b) {
        super.l0(udv$b);
        udv$b.a = "profile_media";
        if (this.B1()) {
            final i3a$a i3a$a = new i3a$a();
            final tx6 a = lfs.a;
            i3a$a.a = (lfs)new zkr(2131953835);
            i3a$a.b = (lfs)new zkr(2131953834);
            i3a$a.h = t3a.S0;
            final i3a i3a = (i3a)((z4j)i3a$a).e();
            udv$b.g = 2131624572;
            final k3a$d b = udv$b.b;
            b.a = 2131625221;
            b.b = 0;
            b.c = new k3a$e(i3a);
        }
        else if (egz.s()) {
            Object m0 = null;
            final qgv d = ((BaseProfileTimelineRetainedGraph)((idv)this).G0.o()).d().d;
            if (d != null) {
                m0 = d.M0;
            }
            if (m0 != null) {
                final i3a$a i3a$a2 = new i3a$a();
                i3a$a2.a = lfs.a(((idv)this).z0().getString(2131953833, new Object[] { m0 }));
                i3a$a2.b = (lfs)new zkr(2131953832);
                i3a$a2.h = t3a.S0;
                final i3a i3a2 = (i3a)((z4j)i3a$a2).e();
                udv$b.g = 2131624572;
                final k3a$d b2 = udv$b.b;
                b2.a = 2131625221;
                b2.b = 0;
                b2.c = new k3a$e(i3a2);
            }
        }
        return udv$b;
    }
}
