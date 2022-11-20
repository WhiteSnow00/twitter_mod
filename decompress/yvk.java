// 
// Decompiled by Procyon v0.6.0
// 

public final class yvk
{
    public static final b Companion;
    public final sbu a;
    public final mv1<taf> b;
    public long c;
    public boolean d;
    public boolean e;
    
    static {
        Companion = new b();
    }
    
    public yvk(final h5j<taf> h5j, final sbu a, final xbm xbm) {
        czd.f((Object)a, "systemClock");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = (mv1<taf>)new mv1();
        this.c = -1L;
        final t19 subscribe = h5j.subscribe((lj6)new st1((qsb)new qsb<taf, fzv>(this) {
            public final yvk D0;
            
            public final Object invoke(final Object o) {
                final taf taf = (taf)o;
                if (taf instanceof taf$q) {
                    final yvk d0 = this.D0;
                    d0.c = d0.a.a();
                    this.D0.d = true;
                }
                else if (taf instanceof taf$n) {
                    final yvk d2 = this.D0;
                    d2.d = false;
                    d2.e = true;
                }
                else if (taf instanceof taf$p) {
                    final yvk d3 = this.D0;
                    d3.d = false;
                    d3.c = -1L;
                }
                else if (taf instanceof taf$m) {
                    final yvk d4 = this.D0;
                    d4.e = false;
                    d4.c = -1L;
                }
                this.D0.b.onNext((Object)taf);
                return fzv.a;
            }
        }, 2));
        czd.e((Object)subscribe, "eventObservable.subscrib\u2026lifecycleEvent)\n        }");
        f.a(subscribe, (z9a)xbm);
    }
    
    public static final class b
    {
    }
}
