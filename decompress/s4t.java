import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s4t
{
    public static final b Companion;
    public final UserIdentifier a;
    public final gfv b;
    public final hss c;
    public final gdv<cxs> d;
    public final gdf<cxs> e;
    public final cbw f;
    public boolean g;
    
    static {
        Companion = new b();
    }
    
    public s4t(final xba<qlf> xba, final UserIdentifier a, final gfv b, final wjf wjf, final hss c, final gdv<cxs> d, final gdf<cxs> e, final cbw f, final xbm xbm) {
        czd.f((Object)xba, "eventObservable");
        czd.f((Object)a, "currentUser");
        czd.f((Object)wjf, "listFetcher");
        czd.f((Object)c, "args");
        czd.f((Object)d, "viewHost");
        czd.f((Object)e, "lingerImpressionHelper");
        czd.f((Object)f, "userEventReporter");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        final h5j v0 = xba.v0();
        final w19 w19 = new w19();
        ((z9a)xbm).d().q((oj)new oj(w19) {
            public final w19 D0;
            
            public final void run() {
                this.D0.a();
            }
        });
        w19.c(v0.subscribe((lj6)new f$c4((qsb)new s4t$d(this))));
        wjf.F0((qsb)new s4t$a(this));
    }
    
    public final n3e<cxs> a() {
        n3e n3e;
        if (this.d.L1() && this.d.G1().c()) {
            n3e = this.d.G1().f();
            czd.e((Object)n3e, "{\n                viewHo\u2026vider.items\n            }");
        }
        else {
            n3e = n3e.j();
        }
        return (n3e<cxs>)n3e;
    }
    
    public static final class b
    {
    }
}
