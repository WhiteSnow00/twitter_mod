import java.util.List;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;
import android.view.View;
import android.view.ViewStub;
import com.twitter.media.av.ui.AutoPlayBadgeView;
import com.twitter.android.liveevent.ui.SimplePeriscopeBadge;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dg2
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public dg2(final Context a, final sfv b, final ufv d) {
        final hiu f0 = hiu.F0;
        this.e = luh.a(0);
        this.f = cvh.a(0);
        this.a = a;
        this.b = b;
        this.c = f0;
        this.d = d;
    }
    
    public dg2(ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "rootView");
        this.a = viewGroup;
        final View viewById = ((View)viewGroup).findViewById(2131432045);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.timecode_badge)");
        this.c = viewById;
        final View viewById2 = ((View)viewGroup).findViewById(2131427766);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.badge_container)");
        viewGroup = (ViewGroup)viewById2;
        this.b = viewGroup;
        final View viewById3 = ((View)viewGroup).findViewById(2131430544);
        e0e.e((Object)viewById3, "videoBadgeContainer.find\u2026eriscope_badge_container)");
        this.d = viewById3;
        final View viewById4 = ((View)viewGroup).findViewById(2131432549);
        e0e.e((Object)viewById4, "videoBadgeContainer.find\u2026id.video_badge_container)");
        final AutoPlayBadgeView e = (AutoPlayBadgeView)viewById4;
        this.e = e;
        this.f = new x3c((ViewStub)((View)e).findViewById(2131432584));
        e.setShouldFadeOutBadgeOverride(true);
        this.a();
    }
    
    public final void a() {
        ((View)this.b).setVisibility(8);
    }
    
    public final void b(final UserIdentifier userIdentifier, final zqv zqv) {
        if (!((Set)this.f).contains(zqv.a)) {
            final List list = (List)this.e;
            final String convertToString = ((wkr)new na7()).convertToString((Object)zqv.b);
            final fg4 fg4 = new fg4(userIdentifier);
            iuk.h(fg4, (Context)this.a, (hp6)((yzr)this.c).get(), (String)null);
            ((o1p)fg4).i((d1p)this.d);
            ((o1p)fg4).q(new String[] { fg4.E((sfv)this.b, "cursor", "", "impression") });
            ((o1p)fg4).c = convertToString;
            final int a = o5j.a;
            list.add(fg4);
            ((Set)this.f).add(zqv.a);
        }
    }
    
    public final void c(final long concurrentViewerCount) {
        if (concurrentViewerCount > 0L) {
            ((SimplePeriscopeBadge)this.d).e();
            ((SimplePeriscopeBadge)this.d).setConcurrentViewerCount(concurrentViewerCount);
        }
        else {
            ((SimplePeriscopeBadge)this.d).c();
        }
    }
    
    public final void d(final h1 avDataSource) {
        ((View)this.d).setVisibility(8);
        ((AutoPlayBadgeView)this.e).setAVDataSource(avDataSource);
        ((View)this.e).setVisibility(0);
    }
}
