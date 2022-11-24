import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class upv extends xus
{
    public final znl<kni> v1;
    
    public upv(final hdv hdv, final fxs fxs, final bts bts, final ii7<hp6> ii7, final def<vxs> def, final dsb dsb, final vpd vpd, final vpi<vxs> vpi, final Context context, final tc tc, final oys oys, final p1t p1t, final d4e<vxs> d4e, final fda<fo> fda, final mex mex, final sfv sfv) {
        super(hdv, fxs, bts, (ii7)ii7, (def)def, dsb, vpd, (vpi)vpi, tc, oys, p1t, (d4e)d4e, (fda)fda, mex, sfv);
        final znl v1 = new znl();
        this.v1 = (znl<kni>)v1;
        f.j(((t5j)v1).throttleFirst(500L, TimeUnit.MILLISECONDS), (fa3)new h3((Object)this, 1), (gba)((idv)this).R0);
    }
    
    public final void P0(final hnf hnf) {
    }
    
    public final long e1() {
        return TimeUnit.MINUTES.toMillis(10L);
    }
    
    public final udv$b l0(final udv$b udv$b) {
        udv$b.a = "explore";
        final i3a$a i3a$a = new i3a$a();
        final tx6 a = lfs.a;
        i3a$a.a = (lfs)new zkr(2131953931);
        i3a$a.b = (lfs)new zkr(2131953915);
        i3a$a.e = 0;
        i3a$a.c = (lfs)new zkr(2131953917);
        final k3a$e c = new k3a$e((i3a)((z4j)i3a$a).e());
        c.a = (k3a$c)new vrx((Object)this, 10);
        final k3a$d b = udv$b.b;
        b.f = 2131166694;
        b.b();
        b.c = c;
        return udv$b;
    }
    
    public final int o0() {
        return 2;
    }
}
