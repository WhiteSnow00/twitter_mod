import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmw
{
    public final UserIdentifier a;
    public final int b;
    public final String c;
    public final efv d;
    
    public kmw(final UserIdentifier userIdentifier, final UserIdentifier a, int a2, String c) {
        this.a = a;
        this.b = a2;
        this.c = c;
        final efv efv = null;
        c = null;
        efv d = null;
        Label_0112: {
            String s;
            if (a2 != 1) {
                if (a2 != 4) {
                    if (a2 != 18) {
                        d = efv;
                        break Label_0112;
                    }
                    s = "friendships";
                }
                else {
                    s = "list";
                    c = "users";
                }
            }
            else {
                s = "follower";
            }
            final efv efv2 = new efv();
            ((lzo)efv2).a = 5;
            a2 = c5j.a;
            ((lzo)efv2).b(userIdentifier.getId());
            ((lzo)efv2).c(s);
            ((lzo)efv2).d(c);
            d = efv2;
        }
        this.d = d;
    }
    
    public final af4 a(final cgv cgv, final String s) {
        final af4 af4 = new af4(this.a);
        final long d0 = cgv.D0;
        final uil b1 = cgv.b1;
        final ngv p2 = cgv.p1;
        String a;
        if (p2 != null) {
            a = p2.a;
        }
        else {
            a = null;
        }
        q3j.m(af4, d0, b1, a);
        ((u0p)af4).q(new String[] { s });
        ((u0p)af4).e((lzo)this.d);
        return af4;
    }
    
    public final elm b(final cgv cgv, final String s) {
        String s2;
        if (this.b == 1) {
            s2 = "followers:followers:";
        }
        else {
            s2 = null;
        }
        if (s2 != null) {
            return (elm)this.a(cgv, u0p.o(new String[] { s2, "user", s }));
        }
        return null;
    }
    
    public final void c(final cgv cgv, final String s) {
        final elm b = this.b(cgv, s);
        if (b != null) {
            cbw.b(b);
        }
    }
}
