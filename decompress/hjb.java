import com.twitter.android.topiccarousel.followtoggle.FollowToggleViewDelegateBinder;
import com.twitter.tweetview.core.TweetViewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hjb extends pue implements stb<kni, fbj<? extends hp6>>
{
    public final TweetViewViewModel F0;
    public final FollowToggleViewDelegateBinder G0;
    
    public hjb(final TweetViewViewModel f0, final FollowToggleViewDelegateBinder g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f((Object)o, "it");
        final xzu b = this.F0.b();
        if (b != null) {
            final hp6 a = b.a;
            if (a != null) {
                final FollowToggleViewDelegateBinder g0 = this.G0;
                g0.b.g(a.w(), g0.d.x2(a.w()));
            }
        }
        final xzu b2 = this.F0.b();
        hp6 a2;
        if (b2 != null) {
            a2 = b2.a;
        }
        else {
            a2 = null;
        }
        return t5j.just((Object)a2);
    }
}
