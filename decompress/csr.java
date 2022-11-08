import android.view.View$OnClickListener;
import com.twitter.onboarding.ocf.NavigationHandler;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csr implements sn6
{
    public final kn C0;
    public final lsr D0;
    public final ydj E0;
    public final OcfEventReporter F0;
    public final NavigationHandler G0;
    public final jn6$a$a H0;
    
    public csr(final kn c0, final lsr d0, final ydj e0, final OcfEventReporter f0, final NavigationHandler g0, final nf1 nf1, final nsr nsr, final mf1 mf1, final d0c d0c) {
        zzd.f((Object)c0, "activityFinisher");
        zzd.f((Object)d0, "subtaskProperties");
        zzd.f((Object)e0, "ocfRichTextProcessorHelper");
        zzd.f((Object)f0, "ocfEventReporter");
        zzd.f((Object)g0, "navigationHandler");
        zzd.f((Object)nf1, "navigator");
        zzd.f((Object)nsr, "subtaskViewHolder");
        zzd.f((Object)mf1, "backButtonHandler");
        zzd.f((Object)d0c, "genericComponentViewHolder");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        final jn6$a companion = jn6.Companion;
        final jn6$a$a h0 = (jn6$a$a)companion.a(nsr.getHeldView());
        this.H0 = h0;
        companion.a(nsr.getHeldView());
        if (rp2.w0(d0.f.a)) {
            rp2.w0(d0.f.b);
        }
        nsr.B((lxm)e0, d0.f.a);
        nsr.q((lxm)e0, d0.f.b);
        mf1.a(nsr.getHeldView(), d0.d, (View$OnClickListener)new rzw((Object)this, 19));
        if (!g0.i()) {
            nf1.a((nf1$a)new bsr(this));
        }
        d0c.a(h0.C0);
        f0.c();
    }
    
    public final jn6 c() {
        return (jn6)this.H0;
    }
}
