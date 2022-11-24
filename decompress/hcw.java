import com.twitter.util.user.UserIdentifier;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcw
{
    public static final b Companion;
    public static final long a;
    
    static {
        Companion = new b();
        a = TimeUnit.SECONDS.toMillis(5L);
    }
    
    public hcw(final dgw dgw, final kfw kfw) {
        e0e.f((Object)dgw, "userObjectGraphProvider");
        e0e.f((Object)kfw, "userManager");
        final t5j r = kfw.r();
        final e39 d;
        d.c(r.doOnComplete((sj)new hcw$c(d = j00.d(r, "userManager.observeLogOut()"))).subscribe((rk6)new f$o4((stb)new stb<UserIdentifier, vzv>(dgw) {
            public final dgw F0;
            
            public final Object invoke(final Object o) {
                xw0.g(TimeUnit.MILLISECONDS, hcw.a, (sj)new hcw$a(this.F0, (UserIdentifier)o));
                return vzv.a;
            }
        })));
    }
    
    public static final class b
    {
    }
}
