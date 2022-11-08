import android.os.BaseBundle;
import android.os.Bundle;
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

public final class vkn implements okx<bln, tkn, rkn>
{
    public final View C0;
    public final yl1 D0;
    public final Fragment E0;
    public final p F0;
    public final epb G0;
    public final ulq H0;
    public final nw8 I0;
    public final xio J0;
    public final zml<tkn> K0;
    public boolean L0;
    public final kgm<RoomViewType> M0;
    public final ukn N0;
    public final mhh<bln> O0;
    
    public vkn(final View c0, final yl1 d0, final Fragment e0, final p f0, final epb g0, final ulq h0, final nw8 i0, final xio j0, final nf1 nf1) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)g0, "fragmentProvider");
        zzd.f((Object)h0, "spaceViewDispatcher");
        zzd.f((Object)i0, "dialogNavigationDelegate");
        zzd.f((Object)j0, "utilsViewEventDispatcher");
        zzd.f((Object)nf1, "navigator");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = (zml<tkn>)new zml();
        this.M0 = (kgm<RoomViewType>)kgm.e();
        nf1.a((nf1$a)(this.N0 = new ukn(this)));
        final ViewParent parent = c0.getParent();
        zzd.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        final FrameLayout frameLayout = (FrameLayout)((View)parent).findViewById(2131428647);
        if (frameLayout != null) {
            BottomSheetBehavior.y(frameLayout).H(3);
        }
        this.O0 = (mhh<bln>)ajy.a0((rtb)new vkn$b(this));
    }
    
    public final void T(final oax oax) {
        final bln bln = (bln)oax;
        zzd.f((Object)bln, "state");
        this.O0.b((Object)bln);
    }
    
    public final void s(final Object o) {
        final rkn rkn = (rkn)o;
        zzd.f((Object)rkn, "effect");
        if (rkn instanceof rkn$a) {
            this.I0.E0();
        }
        else if (rkn instanceof rkn$b) {
            final bsk a = ((rkn$b)rkn).a;
            final Bundle w = zi.w("twitter:id", 874340);
            if (!((BaseBundle)w).containsKey("twitter:id")) {
                throw new Fragment.InstantiationException("Missing fragment id", null);
            }
            final pio f = xha.f(w);
            final int a2 = w4j.a;
            ((cl1)f).e2(((gob)this.D0).Q(), "TAG_POST_SURVEY_SHEET_FRAGMENT");
            this.J0.a((qmj)new qmj$i(a.a, a.b, a.c, a.d, a.e, a.f, a.g, a.h, a.i, a.j, a.k));
            this.I0.E0();
        }
    }
    
    public final b5j<tkn> x() {
        return (b5j<tkn>)this.K0;
    }
}
