import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class z09 extends y0b
{
    public final String J0;
    
    public z09(final Context context, final UserIdentifier userIdentifier, final String j0) {
        super(context, userIdentifier);
        this.J0 = j0;
    }
    
    public final void m() {
        final hn6 h = this.h();
        this.p(h);
        h.b();
        if (this.J0 != null) {
            final q8g$a q8g$a = new q8g$a(((jj1)this).C0, jil.K0);
            q8g$a.f = this.J0;
            ((ksc)((h4j)q8g$a).e()).R();
        }
    }
    
    public abstract void p(final hn6 p0);
}
