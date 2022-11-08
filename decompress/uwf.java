import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uwf implements bra<ViewGroup, owf>
{
    public final ayw a;
    
    public uwf(final ayw a) {
        this.a = a;
    }
    
    public final owf f(final ViewGroup viewGroup) {
        final ocw d = ncw.d();
        final UserIdentifier k = d.k();
        final aav d2 = aav.d2(k);
        return new owf(new dwf(((View)viewGroup).getContext().getApplicationContext(), d, psc.c(), d2, (mwf)new xsf()), new quf(je6.a(((View)viewGroup).getContext(), k, ((rp1)d2).T())), this.a, yvo.c(), h6q.L());
    }
}
