import java.util.concurrent.TimeUnit;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ykb implements afc
{
    public final xq0 a;
    public final zec b;
    public final gwo c;
    public final xbm d;
    
    public ykb(final xq0 a, final zec b, final gwo c, final xbm d) {
        czd.f((Object)a, "applicationLifecycle");
        czd.f((Object)b, "hashflagPreferences");
        czd.f((Object)c, "scheduler");
        czd.f((Object)d, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        final t19 subscribe = this.a.i().observeOn(this.c).switchMap((psb)new g0i((qsb)new qsb<Boolean, taj<? extends Long>>(this) {
            public final ykb D0;
            
            public final Object invoke(final Object o) {
                final Boolean b = (Boolean)o;
                czd.f((Object)b, "isVisible");
                h5j h5j;
                if (b) {
                    final zec b2 = this.D0.b;
                    Objects.requireNonNull(b2);
                    final long millis = TimeUnit.SECONDS.toMillis(b2.a.getLong("hashflag_last_fetch_time", -1L));
                    final m4s a = hq1.a;
                    final long currentTimeMillis = System.currentTimeMillis();
                    Objects.requireNonNull(afc.Companion);
                    final long c = afc$a.c;
                    long n;
                    if ((n = c - (currentTimeMillis - millis)) < 0L) {
                        n = 0L;
                    }
                    h5j = h5j.interval(n, c, TimeUnit.MILLISECONDS);
                }
                else {
                    h5j = h5j.empty();
                }
                return h5j;
            }
        }, 9)).switchMapSingle((psb)new vt1((qsb)ykb$b.D0, 3)).subscribe();
        czd.e((Object)subscribe, "override fun scheduleWor\u2026releaseCompletable)\n    }");
        f.a(subscribe, (z9a)this.d);
    }
}
