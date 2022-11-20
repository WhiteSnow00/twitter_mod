import android.view.View;
import android.view.ViewStub;
import com.twitter.media.av.ui.AutoPlayBadgeView;
import com.twitter.android.liveevent.ui.SimplePeriscopeBadge;
import android.view.ViewGroup;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pf2
{
    public final TextView a;
    public final ViewGroup b;
    public final SimplePeriscopeBadge c;
    public final AutoPlayBadgeView d;
    public final v2c e;
    
    public pf2(ViewGroup b) {
        czd.f((Object)b, "rootView");
        final View viewById = ((View)b).findViewById(2131432044);
        czd.e((Object)viewById, "rootView.findViewById(R.id.timecode_badge)");
        this.a = (TextView)viewById;
        final View viewById2 = ((View)b).findViewById(2131427766);
        czd.e((Object)viewById2, "rootView.findViewById(R.id.badge_container)");
        b = (ViewGroup)viewById2;
        this.b = b;
        final View viewById3 = ((View)b).findViewById(2131430543);
        czd.e((Object)viewById3, "videoBadgeContainer.find\u2026eriscope_badge_container)");
        this.c = (SimplePeriscopeBadge)viewById3;
        final View viewById4 = ((View)b).findViewById(2131432548);
        czd.e((Object)viewById4, "videoBadgeContainer.find\u2026id.video_badge_container)");
        final AutoPlayBadgeView d = (AutoPlayBadgeView)viewById4;
        this.d = d;
        this.e = new v2c((ViewStub)((View)d).findViewById(2131432583));
        d.setShouldFadeOutBadgeOverride(true);
        this.a();
    }
    
    public final void a() {
        ((View)this.b).setVisibility(8);
    }
    
    public final void b(final long concurrentViewerCount) {
        if (concurrentViewerCount > 0L) {
            this.c.e();
            this.c.setConcurrentViewerCount(concurrentViewerCount);
        }
        else {
            this.c.c();
        }
    }
    
    public final void c(final i1 avDataSource) {
        ((View)this.c).setVisibility(8);
        this.d.setAVDataSource(avDataSource);
        ((View)this.d).setVisibility(0);
    }
}
