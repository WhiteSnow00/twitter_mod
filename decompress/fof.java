import java.util.Objects;
import com.twitter.android.liveevent.landing.LiveEventAppBarLayoutBehavior;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fof implements AppBarLayout$OnOffsetChangedListener
{
    public final int a;
    public final Object b;
    
    public fof(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void onOffsetChanged(final AppBarLayout appBarLayout, final int i0) {
        switch (this.a) {
            default: {
                final yyv yyv = (yyv)this.b;
                czd.f((Object)yyv, "this$0");
                yyv.I0 = i0;
                return;
            }
            case 0: {
                final LiveEventAppBarLayoutBehavior liveEventAppBarLayoutBehavior = (LiveEventAppBarLayoutBehavior)this.b;
                Objects.requireNonNull(liveEventAppBarLayoutBehavior);
                liveEventAppBarLayoutBehavior.x = (appBarLayout.getTotalScrollRange() + i0 == 0);
            }
        }
    }
}
