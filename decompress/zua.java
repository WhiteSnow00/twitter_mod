import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zua implements View$OnClickListener
{
    public final u0t D0;
    public final kua E0;
    public final yua F0;
    public final ava G0;
    public final wl3 H0;
    
    public zua(final u0t d0, final kua e0, final yua f0, final ava g0, final wl3 h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void onClick(final View view) {
        final u0t d0 = this.D0;
        final kua e0 = this.E0;
        final yua f0 = this.F0;
        final ava g0 = this.G0;
        final wl3 h0 = this.H0;
        czd.f((Object)d0, "$timelinePagedCarouselItem");
        czd.f((Object)e0, "$feedbackButtonType");
        czd.f((Object)f0, "$impressionHelper");
        czd.f((Object)g0, "this$0");
        czd.f((Object)h0, "$pageChangeRequestListener");
        czd.f((Object)view, "view");
        if (view instanceof HorizonComposeButton) {
            final v0t k = d0.k;
            if (k instanceof t0t) {
                czd.d((Object)k, "null cannot be cast to non-null type com.twitter.model.timeline.urt.TimelinePagedCarouselFeedbackItem");
                final t0t t0t = (t0t)k;
                final int ordinal = ((Enum)e0).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        f0.m((cxs)d0, false);
                        final String a = t0t.d.a;
                        czd.e((Object)a, "timelinePagedCarouselFee\u2026negativeCallback.endpoint");
                        g0.c(a);
                    }
                }
                else {
                    f0.m((cxs)d0, true);
                    final String a2 = t0t.c.a;
                    czd.e((Object)a2, "timelinePagedCarouselFee\u2026positiveCallback.endpoint");
                    g0.c(a2);
                    final Long n = t0t.g.get(d0m$a$a.D0);
                    if (n != null) {
                        final long longValue = n.longValue();
                        final yaa b = g0.b;
                        final cvs c = ((cxs)d0).c();
                        czd.e((Object)c, "timelinePagedCarouselItem.entityInfo");
                        b.e((Object)new q3u(longValue, c, (bba)bba.c));
                    }
                }
                h0.a.onNext((Object)wl3$a.D0);
            }
        }
    }
}
