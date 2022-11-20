import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d3k
{
    public static final c Companion;
    public final eu8 a;
    public final qbu b;
    
    static {
        Companion = new c();
    }
    
    public d3k(final eu8 a, final qbu b, final xq0 xq0, final xbm xbm) {
        czd.f((Object)a, "deviceStorageStats");
        czd.f((Object)b, "preferences");
        czd.f((Object)xq0, "applicationLifecycle");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        final wc6 wc6 = new wc6();
        wc6.a(xq0.f().observeOn(owo.c()).subscribe((lj6)new r58((qsb)new qsb<tmi, fzv>(this) {
            public final d3k D0;
            
            public final Object invoke(Object d0) {
                final tmi tmi = (tmi)d0;
                d0 = this.D0;
                synchronized (d0) {
                    final Iterator iterator = ((d3k)d0).a.a().iterator();
                    long n = 0L;
                    while (iterator.hasNext()) {
                        n += ((eu8$a)iterator.next()).a;
                    }
                    if (n / 1000000 < 100L) {
                        ((d3k)d0).a();
                        monitorexit(d0);
                    }
                    else {
                        final int b = ((d3k)d0).b();
                        final fmv b2 = asa.b();
                        final boolean b3 = false;
                        final int f = b2.f("android_growth_performance_holdback_perf_runtime_storage_bloat_bytes", 0);
                        final int n2 = f - 10000 + 1;
                        final itd itd = new itd(n2, f + 10000 - 1);
                        int n3 = b3 ? 1 : 0;
                        if (b <= ((gtd)itd).E0) {
                            n3 = (b3 ? 1 : 0);
                            if (n2 <= b) {
                                n3 = 1;
                            }
                        }
                        if (n3 != 0) {
                            s9g.a("PerformanceRuntimeStorageBloatManager", "Not writing bloat as we are currently consuming the desired amount.");
                            monitorexit(d0);
                        }
                        else if (f == 0 && b > 0) {
                            ((d3k)d0).a();
                        }
                        else if (f > 0) {
                            if (b > 0) {
                                ((d3k)d0).a();
                            }
                            ((d3k)d0).c(f);
                        }
                    }
                    return fzv.a;
                }
            }
        }, 25), (lj6)new jdi((qsb)d3k$b.D0, 5)));
        xbm.i((oj)new fdv(wc6, 15));
    }
    
    public final void a() {
        final Set h = this.b.h("perf_bloat_storage_list", (Set)p2a.D0);
        final qbu$c i = this.b.i();
        ((qbu$d)i).clear();
        i.e();
        final int size = h.size();
        final StringBuilder sb = new StringBuilder();
        sb.append("Cleared ");
        sb.append(size * 10000);
        sb.append(" bytes");
        s9g.a("PerformanceRuntimeStorageBloatManager", sb.toString());
    }
    
    public final int b() {
        final Set h = this.b.h("perf_bloat_storage_list", (Set)p2a.D0);
        final int size = h.size();
        final StringBuilder sb = new StringBuilder();
        sb.append("Currently using ");
        sb.append(size * 10000);
        sb.append(" bytes");
        s9g.a("PerformanceRuntimeStorageBloatManager", sb.toString());
        return h.size() * 10000;
    }
    
    public final void c(int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Filling up ");
        sb.append(n);
        sb.append(" bytes");
        s9g.a("PerformanceRuntimeStorageBloatManager", sb.toString());
        final char[] array = new char[10000];
        Arrays.fill(array, '.');
        final String s = new String(array);
        final int n2 = n / 10000;
        final HashSet set = new HashSet();
        final qbu$c i = this.b.i();
        n = 1;
        if (1 <= n2) {
            while (true) {
                final String value = String.valueOf(n);
                ((qbu$d)i).b(value, s);
                set.add(value);
                if (n == n2) {
                    break;
                }
                ++n;
            }
        }
        ((qbu$d)i).d("perf_bloat_storage_list", (Set)set);
        i.e();
    }
    
    public static final class c
    {
    }
}
