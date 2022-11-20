// 
// Decompiled by Procyon v0.6.0
// 

public final class e
{
    public static final a Companion;
    public final m8a a;
    public g b;
    
    static {
        Companion = new a();
    }
    
    public e(final m8a a) {
        czd.f((Object)a, "errorReporter");
        this.a = a;
        final h5j o = asa.b().o("android_anr_reporting_timeout_ms");
        czd.e((Object)o, "getCurrent()\n           \u2026ANR_REPORTING_TIMEOUT_MS)");
        final w19 w19;
        w19.c(o.doOnComplete((oj)new e$b(w19 = new w19())).subscribe((lj6)new f$a((qsb)new qsb<dsa<Integer>, fzv>(this) {
            public final e D0;
            
            public final Object invoke(final Object o) {
                final dsa dsa = (dsa)o;
                final boolean b = dsa.b() >= 2000;
                String s;
                if (b) {
                    s = "enabled";
                }
                else {
                    s = "disabled";
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("ANR Watchdog ");
                sb.append(s);
                s9g.a("anr", sb.toString());
                if (b) {
                    final e d0 = this.D0;
                    final int b2 = dsa.b();
                    final g b3 = d0.b;
                    if (b3 != null) {
                        ((Thread)b3).interrupt();
                        d0.b = null;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Starting ANR Watchdog with a timeout of ");
                    sb2.append(b2);
                    s9g.a("anr", sb2.toString());
                    final g b4 = new g(b2);
                    b4.J0 = false;
                    b4.I0 = null;
                    b4.D0 = (g$e)new lo((Object)d0, 4);
                    ((Thread)b4).start();
                    d0.b = b4;
                }
                else {
                    final e d2 = this.D0;
                    final g b5 = d2.b;
                    if (b5 != null) {
                        ((Thread)b5).interrupt();
                        d2.b = null;
                    }
                }
                return fzv.a;
            }
        })));
    }
    
    public static final class a
    {
    }
}
