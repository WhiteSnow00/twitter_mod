import java.util.Objects;
import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wdb implements View$OnLongClickListener
{
    public final xdb F0;
    public final UserIdentifier G0;
    public final hp6 H0;
    
    public wdb(final xdb f0, final UserIdentifier g0, final hp6 h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final boolean onLongClick(final View view) {
        final xdb f0 = this.F0;
        final UserIdentifier g0 = this.G0;
        final hp6 h0 = this.H0;
        Objects.requireNonNull(f0);
        final fg4 fg4 = new fg4(g0);
        ((o1p)fg4).T = dda.g("tweet", "", h0.X2(), "", "copy").toString();
        final int a = o5j.a;
        sbw.b((tlm)fg4);
        final fg4 fg5 = new fg4(g0);
        ((o1p)fg5).T = dda.g("tweet", "", h0.X2(), "", "long_press").toString();
        sbw.b((tlm)fg5);
        p70.a(((View)((rfs)f0).G0).getContext(), h0.E());
        ehk.c().c(2131952888, 0);
        return true;
    }
}
