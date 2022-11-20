import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rbw
{
    public static final b Companion;
    public static final long a;
    
    static {
        Companion = new b();
        a = TimeUnit.SECONDS.toMillis(5L);
    }
    
    public rbw(final nfw nfw, final uew uew) {
        czd.f((Object)nfw, "userObjectGraphProvider");
        czd.f((Object)uew, "userManager");
        final h5j r = uew.r();
        final w19 b;
        b.c(r.doOnComplete((oj)new oj(b = mw.b(r, "userManager.observeLogOut()")) {
            public final w19 D0;
            
            public final void run() {
                this.D0.a();
            }
        }).subscribe((lj6)new f$o4((qsb)new rbw$d(nfw))));
    }
    
    public static final class b
    {
    }
}
