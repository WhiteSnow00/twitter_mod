import android.widget.TextView;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import com.twitter.media.av.ui.control.SkipWithCountDownBadgeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdq implements y94
{
    public final k9q<SkipWithCountDownBadgeView> C0;
    public u4 D0;
    public Collection<e2> E0;
    public boolean F0;
    public boolean G0;
    
    public fdq(final ViewGroup viewGroup) {
        if (((View)viewGroup).findViewById(2131427720) != null) {
            final k9q c0 = new k9q((View)viewGroup, 2131427720, 2131427720);
            this.C0 = (k9q<SkipWithCountDownBadgeView>)c0;
            if (!bp7.E()) {
                ((wax)c0).h();
            }
        }
        else {
            this.C0 = null;
        }
    }
    
    public static void a(final fdq fdq) {
        fdq.F0 = false;
        final k9q<SkipWithCountDownBadgeView> c0 = fdq.C0;
        if (c0 != null) {
            final SkipWithCountDownBadgeView skipWithCountDownBadgeView = (SkipWithCountDownBadgeView)((wax)c0).f;
            if (skipWithCountDownBadgeView != null) {
                skipWithCountDownBadgeView.a();
            }
        }
    }
    
    public final void g(u4 d0) {
        this.D0 = d0;
        final k9q<SkipWithCountDownBadgeView> c0 = this.C0;
        if (c0 != null) {
            ((n9q)((wax)c0).d).G((fk6)new ocs((Object)d0, 5), (fk6)jvb.e);
        }
        d0 = this.D0;
        final List w = ijf.w((Object)new kwk((kwk$a)new cg8((Object)this, 10)), (Object[])new e2[] { (e2)new l2x((l2x$a)new fcn((Object)this, 2)), (e2)new lhl((lhl$a)new on3((Object)this, 6)), (e2)new vnk((vnk$a)new ddq(this)), (e2)new gnk((gnk$a)new edq(this)) });
        this.E0 = w;
        d0.e.k((Collection)w);
    }
    
    public final void h() {
        final k9q<SkipWithCountDownBadgeView> c0 = this.C0;
        if (c0 != null) {
            final SkipWithCountDownBadgeView skipWithCountDownBadgeView = (SkipWithCountDownBadgeView)((wax)c0).f;
            if (skipWithCountDownBadgeView != null) {
                final TextView e0 = skipWithCountDownBadgeView.E0;
                if (e0 != null) {
                    e0.setText((CharSequence)"");
                    ((View)skipWithCountDownBadgeView.E0).setVisibility(0);
                }
                final View c2 = skipWithCountDownBadgeView.C0;
                if (c2 != null) {
                    c2.setVisibility(8);
                }
            }
        }
    }
    
    public final void unbind() {
        final u4 d0 = this.D0;
        if (d0 != null) {
            final List e0 = this.E0;
            if (e0 != null) {
                d0.e.Z((Collection)e0);
            }
        }
    }
}
