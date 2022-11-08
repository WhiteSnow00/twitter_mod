import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uk implements okx<wk, tk, gk>
{
    public final NavigationHandler C0;
    public final OcfEventReporter D0;
    public final ik E0;
    public final v92 F0;
    
    public uk(final View view, final c4e<jk> adapter, final NavigationHandler c0, final mf1 mf1, final lsr lsr, final OcfEventReporter d0, final ik e0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)adapter, "adapter");
        zzd.f((Object)c0, "navigationHandler");
        zzd.f((Object)mf1, "backButtonHandler");
        zzd.f((Object)lsr, "subtaskProperties");
        zzd.f((Object)d0, "ocfEventReporter");
        zzd.f((Object)e0, "itemProvider");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(2131427473);
        this.F0 = new v92(view);
        recyclerView.setAdapter((RecyclerView$e)adapter);
        mf1.a(view, lsr.d, (View$OnClickListener)null);
    }
    
    public final void T(final oax oax) {
        final wk wk = (wk)oax;
        zzd.f((Object)wk, "state");
        ((s71)this.E0).d((i4e)new skf((Iterable)wk.a));
        final HorizonComposeButton d0 = this.F0.D0;
        final xrv b = wk.b;
        int visibility = 0;
        boolean g = false;
        Label_0071: {
            if (b != null) {
                final String c = b.c;
                if (c != null) {
                    g = pjr.g((CharSequence)c);
                    break Label_0071;
                }
            }
            g = false;
        }
        if (!g) {
            visibility = 8;
        }
        ((View)d0).setVisibility(visibility);
        final xrv b2 = wk.b;
        final CharSequence charSequence = null;
        String c2;
        if (b2 != null) {
            c2 = b2.c;
        }
        else {
            c2 = null;
        }
        d0.setText((CharSequence)c2);
        final v92 f0 = this.F0;
        final xrv c3 = wk.c;
        CharSequence c4 = charSequence;
        if (c3 != null) {
            c4 = c3.c;
        }
        f0.r0(c4);
    }
    
    public final void s(final Object o) {
        final gk gk = (gk)o;
        zzd.f((Object)gk, "effect");
        if (gk instanceof gk.a) {
            this.C0.e(((gk.a)gk).a);
        }
        else if (gk instanceof gk.b) {
            this.D0.c();
        }
    }
    
    public final b5j<tk> x() {
        final b5j merge = b5j.merge((Iterable)tdy.v0((Object[])new b5j[] { asy.q((View)this.F0.D0).map((qtb)new dzf((rtb)uk$a.C0, 7)), asy.q((View)this.F0.E0).map((qtb)new wpl((rtb)uk$b.C0, 4)) }));
        zzd.e((Object)merge, "merge(\n            listO\u2026}\n            )\n        )");
        return (b5j<tk>)merge;
    }
}
