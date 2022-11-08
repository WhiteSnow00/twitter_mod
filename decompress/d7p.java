import android.app.Activity;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d7p extends c7t
{
    public final fxe<Boolean> B;
    public final grq C;
    public final String D;
    public final q6p E;
    public jev F;
    
    public d7p(final gob gob, final rnd rnd, final jev jev, final nca nca, final rcu rcu, final w7t w7t, final dsb dsb, final qvd qvd, final xr3 xr3, final fxe<Boolean> b, final crt crt, final mbi<?> mbi, final juu juu, final xuu xuu, final mtv mtv, final rsv rsv, final grq c, final String d, final q6p e, final jev f, final ty8 ty8, final uiu$a uiu$a) {
        super(gob, rnd, jev, nca, rcu, w7t, dsb, qvd, xr3, crt, (mbi)mbi, juu, xuu, mtv, rsv, ty8, uiu$a);
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public final void B(final cyu cyu) {
        final m6p a = m6p.a((Context)((br1)this).c, UserIdentifier.getCurrent());
        final vo6 vo6 = (vo6)((ja)cyu).a;
        a.b(vo6.M(), (CharSequence)vo6.t(), vo6.J(), vo6.A(), vo6.z0(), vo6.J0() || vo6.g0(), vo6.n());
        super.B(cyu);
    }
    
    public final void F(final String s) {
        final jev e = ((br1)this).e;
        String f = "";
        String e2;
        if (e != null) {
            e2 = ((vyo)e).e;
        }
        else {
            e2 = "";
        }
        if (e != null) {
            f = ((vyo)e).f;
        }
        this.C.e(s, this.D, e2, f);
    }
    
    public final zf4 G(final zf4 zf4) {
        zf4.x = this.E.a();
        final int a = w4j.a;
        return zf4;
    }
    
    public final void b(final vo6 b, final qgc c) {
        final rgc$a rgc$a = new rgc$a();
        rgc$a.a = (Activity)((br1)this).b;
        rgc$a.b = b;
        rgc$a.c = c;
        rgc$a.d = ((br1)this).e;
        rgc$a.e = "tweet";
        rgc$a.f = "hashtag_click";
        rgc$a.h = this.E.a();
        rgc$a.g = ((br1)this).g;
        ((jbu)((h4j)rgc$a).e()).a();
    }
    
    public final void d(final vo6 vo6, final w5w w5w) {
        w5w a = w5w;
        if (crt.b(w5w.I0)) {
            a = crt.a(w5w, (boolean)this.B.get());
        }
        ((br1)this).f.d(vo6, a);
    }
    
    public final void i(final vo6 b, final gn3 c) {
        final hn3$a hn3$a = new hn3$a();
        hn3$a.a = (Activity)((br1)this).b;
        hn3$a.b = b;
        hn3$a.c = c;
        hn3$a.d = ((br1)this).e;
        hn3$a.e = "tweet";
        hn3$a.f = "cashtag_click";
        hn3$a.h = this.E.a();
        hn3$a.g = ((br1)this).g;
        ((jbu)((h4j)hn3$a).e()).a();
    }
    
    public final void y(final vo6 b, final h4h c) {
        final i4h$a i4h$a = new i4h$a();
        i4h$a.a = (Activity)((br1)this).b;
        i4h$a.b = b;
        i4h$a.c = c;
        i4h$a.g = "tweet";
        i4h$a.f = "mention_click";
        i4h$a.h = this.E.a();
        i4h$a.d = ((br1)this).e;
        final long d = b.D();
        Object e;
        if (this.F != null) {
            e = new jev(this.F);
            ((vyo)e).a = 1;
            final int a = w4j.a;
            ((vyo)e).b(d);
        }
        else if (((br1)this).e != null) {
            e = new jev(((br1)this).e);
            ((vyo)e).a = 1;
            final int a2 = w4j.a;
            ((vyo)e).b(d);
        }
        else {
            e = null;
        }
        i4h$a.e = (jev)e;
        ((jbu)((h4j)i4h$a).e()).a();
    }
}
