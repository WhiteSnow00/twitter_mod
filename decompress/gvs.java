import com.twitter.ui.user.BaseUserView;
import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView$a;
import android.view.View$OnClickListener;
import java.util.Objects;
import android.view.View;
import android.widget.ImageView;
import com.twitter.ui.user.UserSocialView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvs implements ilx<hvs, Object, Object>
{
    public final a9t D0;
    public final k8w E0;
    public final ppu F0;
    public final UserSocialView G0;
    public final ImageView H0;
    
    public gvs(View viewById, final a9t d0, final k8w e0, final ppu f0) {
        czd.f((Object)viewById, "rootView");
        czd.f((Object)d0, "clickListenerProvider");
        czd.f((Object)e0, "userActionDelegate");
        czd.f((Object)f0, "followButtonClickListener");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        final UserSocialView g0 = (UserSocialView)viewById;
        this.G0 = g0;
        viewById = ((View)g0).findViewById(2131432473);
        czd.e((Object)viewById, "userSocialView.findViewById(R.id.user_image_icon)");
        this.H0 = (ImageView)viewById;
    }
    
    public final void T(final jbx jbx) {
        final hvs hvs = (hvs)jbx;
        czd.f((Object)hvs, "state");
        final cgv a = hvs.a;
        final UserSocialView g0 = this.G0;
        ((UserView)g0).setUser(a);
        ((BaseUserView)g0).setProfileDescription(a.G0);
        if (chw.c0(a.I1)) {
            final mfv$b mfv$b = new mfv$b();
            mfv$b.a = 23;
            g0.setSocialProof((mfv)((n4j)mfv$b).e());
        }
        ((View)g0).setTag(2131432324, (Object)a.D0);
        ((BaseUserView)g0).setPromotedContent(a.b1);
        final k8w e0 = this.E0;
        final UserSocialView g2 = this.G0;
        Objects.requireNonNull(e0);
        czd.f((Object)g2, "userSocialView");
        ((UserView)g2).d();
        final long d0 = a.D0;
        if (e0.c.getId() != d0) {
            ((UserView)g2).setIsFollower(chw.c0(a.I1));
            ((UserView)g2).setFollowVisibility(0);
            ((UserView)g2).E1 = (a.M0 ^ true);
            ((UserView)g2).setIsFollowing(chw.d0(a.I1));
            if (czd.a((Object)chw.m0(a.I1), (Object)Boolean.TRUE)) {
                ((UserView)g2).setFollowVisibility(8);
                ((UserView)g2).setAutoblockVisibility(0);
            }
            else if (chw.Y(a.I1)) {
                ((UserView)g2).setFollowVisibility(8);
                ((UserView)g2).setBlockVisibility(0);
            }
            else if (a.M0 && chw.b0(a.I1)) {
                ((UserView)g2).setFollowVisibility(8);
                ((UserView)g2).setPendingVisibility(0);
            }
            ((UserView)g2).setMuted(hqo.d(a.I1));
            if (e0.b.k) {
                ((UserView)g2).setIsFollowing(e0.a.f(d0, 1));
            }
            else {
                e0.a.n(a);
            }
        }
        final long d2 = hvs.a.D0;
        final UserSocialView g3 = this.G0;
        final a9t d3 = this.D0;
        ((View)g3).setOnClickListener((View$OnClickListener)new yk1((Object)d3, (Object)this, d2, 1));
        ((UserView)g3).setFollowButtonClickListener((BaseUserView$a)this.F0);
        Objects.requireNonNull(d3);
        ((UserView)g3).setBlockButtonClickListener((BaseUserView$a)new t3j(d3, 1));
        ((UserView)g3).setAutoblockButtonClickListener((BaseUserView$a)new u3j(d3, 1));
        ((UserView)g3).setPendingButtonClickListener((BaseUserView$a)new w8t(d3));
        ((UserView)g3).setMutedViewClickListener(d3.f());
        ((UserView)g3).setPendingFollowerAcceptButtonClickListener((BaseUserView$a)new x8t(d3));
        ((UserView)g3).setPendingFollowerDenyButtonClickListener((BaseUserView$a)new gy0((Object)d3, 1));
        final ozl b = hvs.b;
        this.H0.setVisibility(0);
        final ImageView h0 = this.H0;
        h0.setImageDrawable(krm.Companion.b((View)h0).j(pzl.b(b)));
    }
    
    public final void q(final Object o) {
    }
    
    public final h5j w() {
        return zip.a();
    }
}
