import java.util.Objects;
import com.twitter.android.liveevent.landing.LiveEventAppBarLayoutBehavior;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpf implements AppBarLayout$OnOffsetChangedListener
{
    public final int a;
    public final Object b;
    
    public cpf(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void onOffsetChanged(final AppBarLayout appBarLayout, final int k0) {
        switch (this.a) {
            default: {
                final ozv ozv = (ozv)this.b;
                e0e.f((Object)ozv, "this$0");
                ozv.K0 = k0;
                return;
            }
            case 0: {
                final LiveEventAppBarLayoutBehavior liveEventAppBarLayoutBehavior = (LiveEventAppBarLayoutBehavior)this.b;
                Objects.requireNonNull(liveEventAppBarLayoutBehavior);
                liveEventAppBarLayoutBehavior.x = (appBarLayout.getTotalScrollRange() + k0 == 0);
            }
        }
    }
}
