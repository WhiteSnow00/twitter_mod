import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fku
{
    public final LinkedHashMap<Long, b39> a;
    public final jku b;
    
    public fku(final jku b) {
        this.a = new LinkedHashMap<Long, b39>(this.a() * 2);
        this.b = b;
    }
    
    public final int a() {
        return ita.b().f("livepipeline_tweetengagement_cache_max_count", 32);
    }
    
    public final void b(final Long n) {
        final b39 b39 = this.a.remove(n);
        if (b39 == null) {
            final LinkedHashMap<Long, b39> a = this.a;
            final vfk a2 = vfk.a();
            final long longValue = n;
            Objects.requireNonNull(a2);
            a.put(n, (b39)a2.c(dgk.K0, longValue).throttleFirst(1L, TimeUnit.SECONDS).subscribeWith((ocj)new kku(this.b)));
        }
        else {
            this.a.put(n, b39);
        }
    }
    
    public final void c(final int n, final int n2) {
        synchronized (this) {
            final int size = this.a.size();
            if (size <= n) {
                return;
            }
            final Iterator<Map.Entry<Long, b39>> iterator = this.a.entrySet().iterator();
            int i = size - n2;
            while (i > 0) {
                try {
                    final Map.Entry<K, b39> entry = (Map.Entry<K, b39>)iterator.next();
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
                    nag.d("TweetEngagementController", sb.toString(), (Throwable)ex);
                }
                break;
            }
        }
    }
}
