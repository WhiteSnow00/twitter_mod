import android.view.View;
import com.twitter.ui.user.BaseUserView;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.twitter.ui.widget.ToggleImageButton;
import java.util.Objects;
import com.twitter.ui.user.BaseUserView$a;
import android.view.ViewGroup;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.ui.user.UserView;

// 
// Decompiled by Procyon v0.6.0
// 

public class bdw extends v3e<hbw, dkw<UserView>>
{
    public final Context d;
    public final UserIdentifier e;
    public final bdw.bdw$a f;
    
    public bdw(final Context d, final UserIdentifier e, final bdw.bdw$a f) {
        super((Class)hbw.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void n(final dkw<UserView> dkw, final hbw hbw, final ibm ibm) {
        final UserView userView = (UserView)dkw.D0;
        final hfv h = hbw.h;
        pf8.r(h);
        final long c0 = h.C0;
        userView.setUser(h);
        userView.setIsFollower(tdy.d0(h.H1));
        ((BaseUserView)userView).setPromotedContent(h.a1);
        ((BaseUserView)userView).a(bgl.d(h.F0), this.f.i);
        if (this.f.a != null) {
            userView.setFollowButtonClickListener((BaseUserView$a)new xcw(this, h));
        }
        if (this.f.f != null) {
            userView.setProfileClickListener((BaseUserView$a)new ycw(this, h));
        }
        if (this.f.b != null) {
            userView.setBlockButtonClickListener((BaseUserView$a)new wcw((Object)this, (Object)h, 0));
        }
        if (this.f.c != null) {
            userView.setAutoblockButtonClickListener((BaseUserView$a)new vcw((v3e)this, (Object)h, 0));
        }
        if (this.f.d != null) {
            userView.setPendingButtonClickListener((BaseUserView$a)new zcw(this, h));
        }
        userView.d();
        final bdw.bdw$a f = this.f;
        if (f.h && (f.j || this.e.getId() != c0)) {
            if (tdy.o0(h.H1) == Boolean.TRUE) {
                userView.setAutoblockVisibility(0);
                ((BaseUserView)userView).a((jeu)null, false);
            }
            else if (tdy.Y(h.H1)) {
                final ToggleImageButton u0 = userView.U0;
                if (u0 != null) {
                    u0.setToggledOn(true);
                }
                userView.setBlockVisibility(0);
                ((BaseUserView)userView).a((jeu)null, false);
            }
            else if (tdy.c0(h.H1)) {
                userView.setPendingVisibility(0);
            }
            else {
                userView.setFollowVisibility(0);
                userView.setIsFollowing(tdy.e0(h.H1));
            }
            Objects.requireNonNull(this.f);
        }
        if (this.f.k) {
            userView.d();
            userView.setDeleteUserVisibility(0);
            if (this.f.g != null) {
                userView.setDeleteUserButtonClickListener((BaseUserView$a)new xno((Object)this, (Object)h, 0));
            }
        }
        if (this.f.l && userView.Y0 != null) {
            if (tdy.Y(h.H1)) {
                final TextView z0 = userView.Z0;
                if (z0 != null) {
                    z0.setText((CharSequence)this.d.getString(2131952221, new Object[] { h.J0 }));
                }
                userView.Y0.setVisibility(0);
            }
            else {
                userView.Y0.setVisibility(8);
            }
        }
    }
    
    public dkw<UserView> o(final ViewGroup viewGroup) {
        return (dkw<UserView>)dkw.l0(LayoutInflater.from(((View)viewGroup).getContext()), viewGroup, 2131625946);
    }
}
