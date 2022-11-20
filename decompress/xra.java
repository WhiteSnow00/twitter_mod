import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xra
{
    public final uew a;
    
    public xra(final uew a) {
        this.a = a;
    }
    
    public static xra a() {
        return ((ryi)((b5j)br0.a()).B((Class)ryi.class)).l3();
    }
    
    public final void b(final UserIdentifier userIdentifier, final elm elm) {
        fca.a().b(userIdentifier, elm);
    }
    
    public final void c(final String s) {
        for (final UserIdentifier userIdentifier : this.a.d()) {
            final af4 af4 = new af4(userIdentifier);
            ((u0p)af4).q(new String[] { "app", "fcm", null, "token", s });
            this.b(userIdentifier, (elm)af4);
        }
    }
    
    public final void d(final UserIdentifier userIdentifier, final String s, final String v) {
        final af4 af4 = new af4(userIdentifier);
        ((u0p)af4).q(new String[] { "notification", "status_bar", null, s, "push_data_received" });
        ((u0p)af4).v = v;
        final int a = c5j.a;
        ((u0p)af4).s = 2;
        this.b(userIdentifier, (elm)af4);
    }
}
