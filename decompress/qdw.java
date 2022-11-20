import android.widget.CompoundButton;
import com.twitter.ui.user.BaseUserView;
import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView$a;
import android.widget.CheckBox;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.ui.user.UserSocialView;
import android.view.View$OnClickListener;
import android.view.View;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist.h;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qdw implements s3e<e>
{
    public final qdw$c D0;
    public final h E0;
    public final w19 F0;
    
    public qdw(final qdw$c d0, final h e0) {
        this.F0 = new w19();
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final View getItemView() {
        return ((v7x)this.D0).getHeldView();
    }
    
    public final void q(final Object o) {
        final e e = (e)o;
        final UserSocialView n = this.D0.N();
        final cgv a = e.b.a;
        ((UserView)n).setUser(a);
        ((UserView)n).setIsFollower(chw.c0(a.I1));
        ((BaseUserView)n).setProfileDescription(a.G0);
        final mfv$b mfv$b = new mfv$b();
        mfv$b.a = 50;
        mfv$b.k = e.b.b;
        mfv$b.j = 50;
        n.setSocialProof((mfv)((n4j)mfv$b).e());
        ((UserView)n).E1 = false;
        this.D0.K((View$OnClickListener)new eoa((Object)this, (Object)a, 2));
        this.F0.c(((h5j)this.E0.e).subscribe((lj6)new uzo((Object)this, (Object)a, 2)));
    }
    
    public final void unbind() {
        this.F0.a();
    }
    
    public static final class a extends nk8 implements qdw$c
    {
        public final UserSocialView E0;
        
        public a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
            final View inflate = layoutInflater.inflate(2131624564, viewGroup, false);
            super(inflate);
            this.E0 = (UserSocialView)inflate.findViewById(2131428211);
        }
        
        public final void K(final View$OnClickListener view$OnClickListener) {
            final CheckBox y0 = ((UserView)this.E0).Y0;
            jee.l((Object)y0);
            ((View)y0).setOnClickListener(view$OnClickListener);
            ((View)this.E0).setOnClickListener(view$OnClickListener);
        }
        
        public final UserSocialView N() {
            return this.E0;
        }
        
        public final void setChecked(final boolean checked) {
            final CheckBox y0 = ((UserView)this.E0).Y0;
            jee.l((Object)y0);
            final CheckBox checkBox = y0;
            ((CompoundButton)y0).setChecked(checked);
        }
    }
    
    public static final class b implements qdw$c
    {
        public final i9t D0;
        
        public b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
            final View inflate = layoutInflater.inflate(2131624584, viewGroup, false);
            final i9t d0 = new i9t(inflate.getContext(), inflate);
            this.D0 = d0;
            ((UserView)d0.G0).setFollowVisibility(0);
        }
        
        public final void K(final View$OnClickListener view$OnClickListener) {
            ((UserView)this.D0.G0).setFollowButtonClickListener((BaseUserView$a)new f2c((Object)view$OnClickListener, 0));
        }
        
        public final UserSocialView N() {
            return this.D0.G0;
        }
        
        public final View getHeldView() {
            return ((e9x)this.D0).D0;
        }
        
        public final void setChecked(final boolean isFollowing) {
            ((UserView)this.D0.G0).setIsFollowing(isFollowing);
        }
    }
}
