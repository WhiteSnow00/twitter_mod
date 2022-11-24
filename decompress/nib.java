import androidx.fragment.app.p;
import com.twitter.ui.user.BaseUserView;
import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nib implements BaseUserView$a
{
    public final oib F0;
    public final qgv G0;
    public final UserView H0;
    public final hp6 I0;
    
    public nib(final oib f0, final qgv g0, final UserView h0, final hp6 i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void d(final BaseUserView baseUserView, final long n, int o2) {
        final oib f0 = this.F0;
        final qgv g0 = this.G0;
        final UserView h0 = this.H0;
        final hp6 i0 = this.I0;
        final UserView userView = (UserView)baseUserView;
        e0e.f((Object)f0, "this$0");
        e0e.f((Object)g0, "$user");
        e0e.f((Object)h0, "$userView");
        e0e.f((Object)i0, "$contextualTweet");
        e0e.f((Object)userView, "<anonymous parameter 0>");
        if (!f0.i.a(slq.R0)) {
            if (f0.e.f(g0.F0, 1)) {
                h0.G1 = false;
                final mib mib = new mib(f0, h0);
                final p p3 = f0.f.P();
                o2 = bl1.o2;
                ((bbq)new mbq((ddq)new n5w((Object)mib, (Object)p3, 7))).G((rk6)new aoa((stb)new qib(h0, f0, i0, g0), 9), (rk6)lvb.e);
            }
            else {
                h0.G1 = true;
                final hmu c = f0.c;
                String s;
                if (fbx.I(g0.K1)) {
                    s = "follow_back";
                }
                else {
                    s = "follow";
                }
                c.a(i0, "follow_nudge", s, f0.e);
                f0.e.j(g0.F0, 1);
            }
        }
    }
}
