import com.twitter.ui.user.UserView;
import com.twitter.media.ui.image.UserImageView;
import com.twitter.ui.user.BaseUserView$a;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkn implements xlx<ukn, Object, ujn>, ny9<ujn>
{
    public static final fkn.fkn$b Companion;
    public static final nxe<gmo> R0;
    public final znl<Object> F0;
    public final vjn G0;
    public final h5s H0;
    public final h5s I0;
    public final h5s J0;
    public final h5s K0;
    public final h5s L0;
    public final h5s M0;
    public final znl<vzv> N0;
    public final znl<vzv> O0;
    public final znl<vzv> P0;
    public final fih<ukn> Q0;
    
    static {
        Companion = new fkn.fkn$b();
        fkn.R0 = (h5s)jty.N((ptb)fkn$a.F0);
    }
    
    public fkn(final View view, final znl<Object> f0, final vjn g0) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)f0, "intentSubject");
        e0e.f((Object)g0, "effectHandler");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = (h5s)jty.N((ptb)new fkn$h(view));
        this.I0 = (h5s)jty.N((ptb)new fkn$g(view));
        this.J0 = (h5s)jty.N((ptb)new fkn$d(view));
        this.K0 = (h5s)jty.N((ptb)new fkn$f(view));
        this.L0 = (h5s)jty.N((ptb)new fkn$l(view));
        this.M0 = (h5s)jty.N((ptb)new fkn$e(view));
        this.N0 = (znl<vzv>)new znl();
        this.O0 = (znl<vzv>)new znl();
        this.P0 = (znl<vzv>)new znl();
        this.Q0 = (fih<ukn>)ma7.S((stb)new fkn$m(this, view));
        this.b().setFollowButtonClickListener((BaseUserView$a)new ug2((Object)this, 2));
        this.b().setPendingButtonClickListener((BaseUserView$a)new pn1((Object)this, 0));
        this.b().G1 = false;
    }
    
    public static final UserImageView a(final fkn fkn) {
        final Object value = fkn.K0.getValue();
        e0e.e(value, "<get-hostImageView>(...)");
        return (UserImageView)value;
    }
    
    public final void T(final ccx ccx) {
        final ukn ukn = (ukn)ccx;
        e0e.f((Object)ukn, "state");
        this.Q0.b((Object)ukn);
    }
    
    public final UserView b() {
        final Object value = this.M0.getValue();
        e0e.e(value, "<get-followContainer>(...)");
        return (UserView)value;
    }
    
    public final void r(final Object o) {
        final ujn ujn = (ujn)o;
        e0e.f((Object)ujn, "effect");
        this.G0.a(ujn);
    }
    
    public final t5j<Object> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)((t5j)this.N0).map((rtb)new a4o((stb)fkn$i.F0, 6)), (fbj)((t5j)this.O0).map((rtb)new vyn((stb)fkn$j.F0, 8)), (fbj)((t5j)this.P0).map((rtb)new uyn((stb)fkn$k.F0, 8)), (fbj)this.F0 });
        e0e.e((Object)mergeArray, "mergeArray(\n        foll\u2026     intentSubject,\n    )");
        return (t5j<Object>)mergeArray;
    }
}
