import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class j09 extends vza
{
    public final String K0;
    
    public j09(final Context context, final UserIdentifier userIdentifier, final String k0) {
        super(context, userIdentifier);
        this.K0 = k0;
    }
    
    public final void m() {
        final nm6 h = this.h();
        this.p(h);
        h.b();
        if (this.K0 != null) {
            final f8g$a f8g$a = new f8g$a(((dj1)this).D0, wil.L0);
            f8g$a.f = this.K0;
            ((orc)((n4j)f8g$a).e()).R();
        }
    }
    
    public abstract void p(final nm6 p0);
}
