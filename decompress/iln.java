import android.os.BaseBundle;
import android.os.Bundle;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;
import androidx.fragment.app.Fragment$InstantiationException;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import com.twitter.rooms.subsystem.api.models.RoomViewType;
import androidx.fragment.app.p;
import androidx.fragment.app.Fragment;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iln implements ilx<oln, gln, eln>
{
    public final View D0;
    public final ul1 E0;
    public final Fragment F0;
    public final p G0;
    public final aob H0;
    public final omq I0;
    public final yv8 J0;
    public final mjo K0;
    public final nnl<gln> L0;
    public boolean M0;
    public final ahm<RoomViewType> N0;
    public final hln O0;
    public final rhh<oln> P0;
    
    public iln(final View d0, final ul1 e0, final Fragment f0, final p g0, final aob h0, final omq i0, final yv8 j0, final mjo k0, final jf1 jf1) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)h0, "fragmentProvider");
        czd.f((Object)i0, "spaceViewDispatcher");
        czd.f((Object)j0, "dialogNavigationDelegate");
        czd.f((Object)k0, "utilsViewEventDispatcher");
        czd.f((Object)jf1, "navigator");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = (nnl<gln>)new nnl();
        this.N0 = (ahm<RoomViewType>)ahm.e();
        jf1.a((jf1.jf1$a)(this.O0 = new hln(this)));
        final ViewParent parent = d0.getParent();
        czd.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        final FrameLayout frameLayout = (FrameLayout)((View)parent).findViewById(2131428647);
        if (frameLayout != null) {
            BottomSheetBehavior.y((View)frameLayout).H(3);
        }
        this.P0 = (rhh<oln>)q3j.g0((qsb)new iln$b(this));
    }
    
    public final void T(final jbx jbx) {
        final oln oln = (oln)jbx;
        czd.f((Object)oln, "state");
        this.P0.b((Object)oln);
    }
    
    public final void q(final Object o) {
        final eln eln = (eln)o;
        czd.f((Object)eln, "effect");
        if (eln instanceof eln$a) {
            this.J0.E0();
        }
        else if (eln instanceof eln$b) {
            final ksk a = ((eln$b)eln).a;
            final Bundle a2 = nh.A("twitter:id", 874340);
            if (!((BaseBundle)a2).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final ejo k = m1f.k(a2);
            final int a3 = c5j.a;
            ((wk1)k).e2(((cnb)this.E0).P(), "TAG_POST_SURVEY_SHEET_FRAGMENT");
            this.K0.a((vmj)new vmj.i(a.a, a.b, a.c, a.d, a.e, a.f, a.g, a.h, a.i, a.j, a.k));
            this.J0.E0();
        }
    }
    
    public final h5j<gln> w() {
        return (h5j<gln>)this.L0;
    }
}
