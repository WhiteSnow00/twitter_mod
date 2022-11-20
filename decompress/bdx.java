import java.util.HashMap;
import android.os.SystemClock;
import java.util.Objects;
import android.util.Pair;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdx implements adx
{
    public static final List<Integer> f;
    public final skg a;
    public final boolean b;
    public final Map<Integer, Long> c;
    public final Map<Integer, Long> d;
    public Pair<Integer, Long> e;
    
    static {
        bdx.f = (gdd)gdd.i((Object[])new Integer[] { 0, 25, 50, 75, 80, 100 });
    }
    
    public bdx(final skg a, final boolean b) {
        this.a = a;
        this.b = b;
        this.c = (xth$a)xth.a(21);
        this.d = (xth$a)xth.a(21);
        for (int i = 0; i <= 100; i += 5) {
            ((HashMap<Integer, Long>)this.c).put(Integer.valueOf(i), Long.valueOf(0L));
            ((HashMap<Integer, Long>)this.d).put(Integer.valueOf(i), Long.valueOf(0L));
        }
    }
    
    public final Map<Integer, Long> a() {
        if (this.b) {
            final qjg t = qjg.t();
            final gdd f = bdx.f;
            int n = ((List)f).size() - 1;
            int intValue = (int)((List)f).get(n);
            int i = 100;
            long max = 0L;
            while (i >= 0) {
                max = Math.max(((HashMap<K, Long>)this.c).get((Object)i), max);
                int intValue2 = intValue;
                int n2 = n;
                if (i <= intValue) {
                    if (max != 0L) {
                        t.w((Object)intValue, (Object)max);
                    }
                    --n;
                    intValue2 = intValue;
                    if ((n2 = n) >= 0) {
                        intValue2 = ((List<Integer>)bdx.f).get(n);
                        n2 = n;
                    }
                }
                i -= 5;
                intValue = intValue2;
                n = n2;
            }
            return (Map)((n4j)t).e();
        }
        return (Map<Integer, Long>)this.c;
    }
    
    public final void b(final float n) {
        final int n2 = (int)n;
        final int n3 = n2 - n2 % 5;
        Objects.requireNonNull(this.a);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final Pair<Integer, Long> e = this.e;
        if (e == null) {
            if (n != 0.0f) {
                this.e = (Pair<Integer, Long>)new Pair((Object)n3, (Object)elapsedRealtime);
            }
        }
        else {
            final long longValue = (long)e.second;
            for (int i = 0; i <= 100; i += 5) {
                final long longValue2 = ((HashMap<K, Long>)this.d).get(i);
                if (i <= (int)this.e.first) {
                    final long n4 = longValue2 + (elapsedRealtime - longValue);
                    ((HashMap<Integer, Long>)this.d).put(Integer.valueOf(i), Long.valueOf(n4));
                    this.c(i, n4);
                }
                if (i > n3) {
                    this.c(i, longValue2);
                    ((HashMap<Integer, Long>)this.d).put(Integer.valueOf(i), Long.valueOf(0L));
                }
            }
            Pair e2;
            if (n != 0.0f) {
                e2 = new Pair((Object)n3, (Object)elapsedRealtime);
            }
            else {
                e2 = null;
            }
            this.e = (Pair<Integer, Long>)e2;
        }
    }
    
    public final void c(final int n, final long n2) {
        if (((HashMap<K, Long>)this.d).get(n) > ((HashMap<K, Long>)this.c).get(n)) {
            ((HashMap<Integer, Long>)this.c).put(Integer.valueOf(n), Long.valueOf(n2));
        }
    }
}
