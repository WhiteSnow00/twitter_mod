import com.twitter.android.topiccarousel.followtoggle.FollowToggleViewDelegateBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iib extends ste implements nsb<fzv>
{
    public final FollowToggleViewDelegateBinder D0;
    public final bo6 E0;
    public final fib F0;
    
    public iib(final FollowToggleViewDelegateBinder d0, final bo6 e0, final fib f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(0);
    }
    
    public final Object invoke() {
        final FollowToggleViewDelegateBinder d0 = this.D0;
        d0.c.a(this.E0, "follow_toggle", "unfollow", d0.b);
        this.D0.b(this.F0, this.E0);
        return fzv.a;
    }
}
