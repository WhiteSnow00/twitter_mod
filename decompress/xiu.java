import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xiu
{
    public final LinkedHashMap<Long, j29> a;
    public final dju b;
    
    public xiu(final dju b) {
        this.a = new LinkedHashMap<Long, j29>(this.a() * 2);
        this.b = b;
    }
    
    public final int a() {
        return dta.b().f("livepipeline_tweetengagement_cache_max_count", 32);
    }
    
    public final void b(final Long n) {
        final j29 j29 = this.a.remove(n);
        if (j29 == null) {
            final LinkedHashMap<Long, j29> a = this.a;
            final cfk a2 = cfk.a();
            final long longValue = n;
            Objects.requireNonNull(a2);
            a.put(n, (j29)a2.c(kfk.H0, longValue).throttleFirst(1L, TimeUnit.SECONDS).subscribeWith((wbj)new eju(this.b)));
        }
        else {
            this.a.put(n, j29);
        }
    }
    
    public final void c(final int n, final int n2) {
        synchronized (this) {
            final int size = this.a.size();
            if (size <= n) {
                return;
            }
            final Iterator<Map.Entry<Long, j29>> iterator = this.a.entrySet().iterator();
            int i = size - n2;
            while (i > 0) {
                try {
                    final Map.Entry<K, j29> entry = (Map.Entry<K, j29>)iterator.next();
                    iterator.remove();
                    entry.getValue().dispose();
                    --i;
                    continue;
                }
                catch (final ConcurrentModificationException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("failed to trim cache, limit: ");
                    sb.append(n);
                    sb.append(", trimToSize: ");
                    sb.append(n2);
                    cag.d("TweetEngagementController", sb.toString(), (Throwable)ex);
                }
                break;
            }
        }
    }
}
