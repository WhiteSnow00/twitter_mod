import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hol
{
    public final adw a;
    public final qbu b;
    
    public hol(final adw a, final ovk ovk) {
        this.a = a;
        final qbu c = ovk.c("c2dm");
        this.b = c;
        synchronized (this) {
            if (c.b("ver")) {
                final int g = c.g("ver", 2);
                if (g < 2) {
                    d(c, g);
                }
            }
            else {
                d(c, 0);
            }
        }
    }
    
    public static hol a(final UserIdentifier userIdentifier) {
        return ((syi)mfw.a().e(userIdentifier, (Class)syi.class)).q8();
    }
    
    public static void d(final qbu qbu, int n) {
        final qbu$c i = qbu.i();
        int n2 = n;
        if (n == 0) {
            n2 = 1;
        }
        if ((n = n2) == 1) {
            i.a("reg_id").a("backoff").a("backoff_ceil");
            n = 2;
        }
        i.g("ver", n).e();
    }
    
    public final boolean b() {
        final qbu b = this.b;
        final boolean b2 = true;
        if (b.e("enabled", true)) {
            boolean b3 = b2;
            if (!this.a.g()) {
                return b3;
            }
            if (!gds.b()) {
                b3 = b2;
                return b3;
            }
        }
        return false;
    }
    
    public final void c(final boolean b) {
        this.b.i().f("enabled", b).e();
    }
}
