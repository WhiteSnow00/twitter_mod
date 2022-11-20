import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xbk implements wbk
{
    public final rbk a;
    
    public xbk(final rbk a) {
        this.a = a;
    }
    
    public final void a(final wbk$a wbk$a) {
        final UserIdentifier current = UserIdentifier.getCurrent();
        final trc c = trc.c();
        final h64 h64 = new h64(current);
        ((anm)h64).U((wv0$b)new xbk.xbk$a(wbk$a));
        c.f((orc)h64);
    }
    
    public final void b() {
        final rbk a = this.a;
        if (a.b == null) {
            a.b = (uy5)rw0.c((oj)new qbk(a, 0));
        }
    }
}
