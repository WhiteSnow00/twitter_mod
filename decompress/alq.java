// 
// Decompiled by Procyon v0.6.0
// 

public final class alq
{
    public final mgv a;
    public final hag b;
    
    public alq(final mgv a, final hag b, final xbm xbm) {
        czd.f((Object)a, "twitterUserManager");
        czd.f((Object)b, "loginController");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        final h5j p3 = a.p();
        final w19 b2 = mw.b(p3, "twitterUserManager.observeLogInUserInfo()");
        ((z9a)xbm).d().q((oj)new alq$a(b2));
        b2.c(p3.subscribe((lj6)new f$r3((qsb)new alq$b(this))));
    }
}
