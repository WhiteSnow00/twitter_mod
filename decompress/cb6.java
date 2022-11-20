import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cb6 implements dur<xtu, ytr>
{
    public final ob6 a;
    public final pgc b;
    
    public cb6(final Context context, final UserIdentifier userIdentifier) {
        this(context, (iiv)new liv(context, userIdentifier, "compose"), userIdentifier);
    }
    
    public cb6(final Context context, final iiv iiv, final UserIdentifier userIdentifier) {
        final int a = eiv.a();
        this.a = new ob6(context, a, iiv, userIdentifier);
        this.b = new pgc(context, a, iiv, userIdentifier);
    }
    
    public final void a(final Object o, final dur$a dur$a) {
        final xtu xtu = (xtu)o;
        final int b = xtu.b;
        if (b == 1) {
            ((tiv)this.a).c((Object)xtu.a, (dur$a)new a5w((Object)dur$a, (Object)xtu), (String)null);
        }
        else if (b == 2) {
            if (!xtu.a.contains(" ")) {
                this.b.c((Object)xtu.a, (dur$a)new poo((Object)dur$a, (Object)xtu, 8), xtu.c);
            }
            else {
                dur$a.a((Object)xtu, n3e.j());
            }
        }
    }
    
    public final void cancel() {
        ((tiv)this.a).cancel();
        this.b.cancel();
    }
}
