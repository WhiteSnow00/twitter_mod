import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cw0
{
    public final Map<String, Long> a;
    public final Map<String, Long> b;
    
    public cw0() {
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
    }
    
    public final long a() {
        final Long n = (Long)this.b.get((Object)"blocking");
        long longValue;
        if (n != null) {
            longValue = n;
        }
        else {
            longValue = -1L;
        }
        return longValue;
    }
    
    public final void b(final String s) {
        this.a.put((Object)s, (Object)SystemClock.uptimeMillis());
    }
    
    public final void c(final String s) {
        final Long n = (Long)this.a.get((Object)s);
        if (n != null) {
            this.b.put((Object)s, (Object)(SystemClock.uptimeMillis() - n));
        }
    }
}
