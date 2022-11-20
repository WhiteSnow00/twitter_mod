import com.twitter.ui.user.UserView;
import com.twitter.ui.user.UserSocialView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwh implements g9t$b
{
    public final void a(final UserSocialView userSocialView, final cgv cgv) {
        ((UserView)userSocialView).d();
        ((UserView)userSocialView).setMuted(true);
        ((UserView)userSocialView).setMutedActive(cgv.v1);
        ((UserView)userSocialView).setIsFollower(chw.c0(cgv.I1));
    }
}
