import androidx.fragment.app.s;
import android.view.View$OnClickListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.twitter.app.common.args.ContentViewArgs;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import androidx.fragment.app.p;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijo implements ilx<ljo, hjo, gjo>
{
    public final View D0;
    public final yv8 E0;
    public final gfo F0;
    public final aob G0;
    public final p H0;
    public final rhh<ljo> I0;
    
    public ijo(final View d0, final yv8 e0, final gfo f0, final aob g0, final p h0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)e0, "dialogNavigationDelegate");
        czd.f((Object)f0, "roomToaster");
        czd.f((Object)g0, "fragmentProvider");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final ViewParent parent = d0.getParent();
        czd.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        final FrameLayout frameLayout = (FrameLayout)((View)parent).findViewById(2131428647);
        if (frameLayout != null) {
            BottomSheetBehavior.y((View)frameLayout).H(3);
        }
        this.I0 = (rhh<ljo>)q3j.g0((qsb)new ijo$b(this));
    }
    
    public final void T(final jbx jbx) {
        final ljo ljo = (ljo)jbx;
        czd.f((Object)ljo, "state");
        this.I0.b((Object)ljo);
    }
    
    public final <ARGS extends ContentViewArgs> void a(final ARGS args, final String s) {
        if (this.H0.H(s) == null) {
            final Fragment b = this.G0.b(args);
            final a a = new a(this.H0);
            ((s)a).g(2131432518, b, s);
            ((s)a).c();
        }
    }
    
    public final void q(final Object o) {
        final gjo gjo = (gjo)o;
        czd.f((Object)gjo, "effect");
        final boolean b = gjo instanceof gjo$a;
        final int n = 32;
        if (b) {
            this.E0.E0();
            final gjo$a gjo$a = (gjo$a)gjo;
            final Integer b2 = gjo$a.b;
            int intValue;
            if (b2 != null) {
                intValue = b2;
            }
            else {
                intValue = 32;
            }
            final String a = gjo$a.a;
            if (a != null) {
                final w5s$a w5s$a = new w5s$a();
                w5s$a.t(a);
                w5s$a.q(intValue);
                w5s$a.e = (red$c)red$c$a.b;
                w5s$a.r("");
                if (gjo$a.c) {
                    w5s$a.o(2131958308, (View$OnClickListener)new vop((Object)gjo, 4));
                }
                this.F0.f((w5s)((n4j)w5s$a).e());
            }
        }
        if (gjo instanceof gjo$b) {
            this.E0.E0();
            final gjo$b gjo$b = (gjo$b)gjo;
            if (gjo$b.a != null) {
                final Integer c = gjo$b.c;
                int intValue2 = n;
                if (c != null) {
                    intValue2 = c;
                }
                final ejq$a ejq$a = new ejq$a();
                ejq$a.o(gjo$b.a);
                ejq$a.p(gjo$b.b);
                ejq$a.g = intValue2;
                this.F0.e((ejq)((n4j)ejq$a).e());
            }
        }
    }
    
    public final h5j w() {
        return zip.a();
    }
}
