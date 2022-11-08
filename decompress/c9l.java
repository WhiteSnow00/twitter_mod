import com.twitter.util.user.UserIdentifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c9l extends af4
{
    public final /* synthetic */ e9l I0;
    
    public c9l(final e9l i0, final int n) {
        this.I0 = i0;
        super(n);
    }
    
    public final void onClick(final View view) {
        if (this.I0.m != null) {
            final UserIdentifier current = UserIdentifier.getCurrent();
            final String i = bgl.i(current.hasId(this.I0.n.d()));
            final zf4 zf4 = new zf4(current);
            zf4.q(new String[] { i, "profile::place_tag:click" });
            zf4.t = this.I0.s.a;
            final int a = w4j.a;
            saw.b((okm)zf4);
            final e9l i2 = this.I0;
            i2.m.g(new s1c(i2.s, (zv6)null, (String)null));
        }
    }
}
