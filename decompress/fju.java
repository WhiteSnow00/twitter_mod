import android.os.SystemClock;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fju implements gnf$b
{
    public final xiu C0;
    public final l4e<nws> D0;
    public final Set<Long> E0;
    public final zml<Boolean> F0;
    public final int G0;
    public final int H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    
    public fju(final xiu c0, final l4e<nws> d0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = new LinkedHashSet();
        this.G0 = dta.b().f("livepipeline_tweetengagement_cache_prefetch_count", 8);
        final int f = dta.b().f("livepipeline_tweetengagement_scroll_dwell_ms", 1000);
        this.H0 = f;
        this.N0 = 0L;
        final zml f2 = new zml();
        this.F0 = (zml<Boolean>)f2;
        ((b5j)f2).delay((long)f, TimeUnit.MILLISECONDS, h6q.L()).subscribe((wbj)new fju.fju$a(this));
        this.b();
    }
    
    public final void a(int n, int n2, int max, b c0) {
        if ((n == 0 && n2 == 0) || max == 0) {
            return;
        }
        this.c(n, n2);
        final int size = this.E0.size();
        final Locale english = Locale.ENGLISH;
        cag.a("TweetEngagement", String.format(english, "Ensuring subs of visible tweets in position %s to %s, creating new subs to %s tweets, pre-subscribe: %s", n, n2, size, c0));
        if (size > 0 && c0 != b.E0) {
            if (c0 == b.C0) {
                max = Math.max(n - this.G0, 0);
                n2 = Math.max(n - 1, 0);
                n = max;
            }
            else {
                --max;
                n = Math.min(n2 + 1, max);
                n2 = Math.min(n2 + this.G0, max);
            }
            this.c(n, n2);
            cag.a("TweetEngagement", String.format(english, "Pre-subbing tweets in position %s to %s", n, n2));
        }
        final ijf h = ijf.H();
        h.q((Iterable)this.E0);
        h.Q();
        final List list = (List)((h4j)h).e();
        c0 = (b)this.C0;
        synchronized (c0) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((xiu)c0).b((Long)iterator.next());
            }
            n = ((xiu)c0).a();
            ((xiu)c0).c(n, n);
            monitorexit(c0);
            this.E0.clear();
        }
    }
    
    public final void b() {
        final xiu c0 = this.C0;
        c0.b.a();
        c0.c(0, 0);
        this.I0 = Integer.MIN_VALUE;
        this.J0 = Integer.MAX_VALUE;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = true;
        this.E0.clear();
    }
    
    public final void c(int i, final int n) {
        Object o = this.C0;
        synchronized (o) {
            final Set b = iuh.b((Collection)((xiu)o).a.keySet());
            monitorexit(o);
            if (this.D0.c()) {
                o = this.D0.f();
                while (i <= n) {
                    final Long value = sws.d((i4e)o, i);
                    final long longValue = value;
                    final int n2 = 0;
                    final boolean b2 = longValue != 0L;
                    int n3 = n2;
                    if (!((HashSet)b).contains(value)) {
                        n3 = n2;
                        if (!this.E0.contains(value)) {
                            n3 = 1;
                        }
                    }
                    if (b2 && n3 != 0) {
                        this.E0.add(value);
                    }
                    ++i;
                }
            }
        }
    }
    
    public final void t(final gnf gnf, final int i0, int j0, final int k0, final boolean b) {
        j0 = j0 + i0 - 1;
        if (b || this.M0) {
            if (!this.L0) {
                b b2;
                if (j0 > this.J0) {
                    b2 = fju.b.D0;
                }
                else if (i0 < this.I0) {
                    b2 = fju.b.C0;
                }
                else {
                    b2 = fju.b.E0;
                }
                this.a(i0, j0, k0, b2);
            }
            this.I0 = i0;
            this.J0 = j0;
            this.K0 = k0;
            this.M0 = false;
        }
    }
    
    public final void w(final gnf gnf, final int n) {
        if (n != 2 && n != 1) {
            this.F0.onNext((Object)Boolean.TRUE);
            this.L0 = false;
        }
        else {
            this.L0 = true;
            final hqs$a c = hqs.c;
            this.N0 = SystemClock.elapsedRealtime();
        }
    }
    
    public enum b
    {
        C0, 
        D0, 
        E0;
    }
}
