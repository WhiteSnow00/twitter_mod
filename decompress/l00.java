import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l00
{
    public static final b Companion;
    public final v00 a;
    
    static {
        Companion = new b();
    }
    
    public l00(final v00 a, final uew uew) {
        czd.f((Object)a, "repositoryRegistry");
        czd.f((Object)uew, "userManager");
        this.a = a;
        final h5j r = uew.r();
        final w19 b;
        b.c(r.doOnComplete((oj)new l00$c(b = mw.b(r, "userManager.observeLogOut()"))).subscribe((lj6)new f$i((qsb)new qsb<UserIdentifier, fzv>(this) {
            public final l00 D0;
            
            public final Object invoke(final Object o) {
                rw0.c((oj)new l00$a(this.D0, (UserIdentifier)o));
                return fzv.a;
            }
        })));
    }
    
    public static final class b
    {
    }
}
