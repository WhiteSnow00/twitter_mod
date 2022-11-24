import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqi implements oqi
{
    public final tsc a;
    public final zgv b;
    
    public pqi(final tsc a, final zgv b) {
        e0e.f((Object)a, "httpRequestController");
        e0e.f((Object)b, "userManager");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final long a(final UserIdentifier userIdentifier) {
        e0e.f((Object)userIdentifier, "userIdentifier");
        return this.b.g(userIdentifier).getUser().O1;
    }
    
    @Override
    public final bbq<Long> b(final qgv qgv) {
        final long o1 = qgv.O1;
        bbq bbq;
        if (o1 == 0L) {
            bbq = this.a.a(new q74(qgv.f())).w((rtb)new x2i((stb)new pqi$a(qgv), 4));
        }
        else {
            bbq = bbq.v((Object)o1);
        }
        return (bbq<Long>)bbq;
    }
}
