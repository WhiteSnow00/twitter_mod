import com.twitter.timeline.newtweetsbanner.BaseNewTweetsBannerPresenter;
import com.twitter.ui.widget.NewItemBannerView;
import com.twitter.android.liveevent.landing.scribe.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afi implements szs, gnf$b
{
    public final bfi C0;
    public final String D0;
    public final com.twitter.android.liveevent.landing.scribe.a E0;
    public final a F0;
    
    public afi(final a f0, final NewItemBannerView newItemBannerView, final String d0, final com.twitter.android.liveevent.landing.scribe.a e0, final iyf iyf, final z7x z7x, final nkf nkf) {
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
        final long h = dta.b().h("live_event_timeline_new_tweets_pill_interval_seconds", 0L);
        long n;
        if (h > 0L) {
            n = h * 1000L;
        }
        else {
            n = 240000L;
        }
        this.C0 = new bfi(newItemBannerView, (szs)this, n, -1L, z7x);
        nkf.u1((u93)new en((Object)this, 3));
    }
    
    public final void a() {
        ((acv)this.F0).y0();
        this.E0.r(this.D0, "click");
    }
    
    public final void b() {
        this.E0.r(this.D0, "show");
    }
    
    public final void c() {
        this.E0.r(this.D0, "dismiss");
    }
    
    public final void d0(final gnf gnf) {
        this.C0.h();
    }
    
    public final void p(final gnf gnf) {
        ((BaseNewTweetsBannerPresenter)this.C0).E0 = true;
    }
    
    public final void w(final gnf gnf, final int n) {
        this.C0.k(false);
    }
    
    public interface a
    {
    }
}
