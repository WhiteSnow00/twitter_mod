import com.twitter.media.ui.image.d;
import android.view.View;
import com.twitter.onboarding.ocf.media.SelectBannerSubtaskViewHost;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddp extends jo1<jvg>
{
    public final SelectBannerSubtaskViewHost E0;
    
    public ddp(final SelectBannerSubtaskViewHost e0) {
        this.E0 = e0;
    }
    
    public final void c() {
        final SelectBannerSubtaskViewHost e0 = this.E0;
        e0.G1((String)null, "error");
        m1f.e().c(2131955911, 0);
        e0.R0 = false;
    }
    
    public final void d(final Object o) {
        final jvg jvg = (jvg)o;
        this.E0.I0 = jvg.g().toString();
        final SelectBannerSubtaskViewHost e0 = this.E0;
        final cdp p = e0.P0;
        final String i0 = e0.I0;
        if (i0 != null) {
            p.I0.setVisibility(8);
            ((View)p.H0).setVisibility(0);
            ((d)p.H0).p(x7d.g(i0));
            p.l0(true);
        }
        else {
            p.l0(false);
        }
        this.E0.G1("crop", "success");
        final ew9 j0 = this.E0.J0;
        if (j0 != null) {
            ((jw9)j0).n();
        }
        final SelectBannerSubtaskViewHost e2 = this.E0;
        final vzg i2 = vzg.I0;
        final nw6 g0 = jw9.G0;
        e2.J0 = (ew9)jw9.k(jvg, jvg.g(), i2, (String)null);
        ((jvg)((jw9)this.E0.J0).D0).e = jvg.e;
    }
}
