import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import android.content.ContentValues;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dby implements dsy
{
    public final Object F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    
    public dby(final eah f0, final gah g0, final u9h h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = new ConcurrentHashMap();
    }
    
    public dby(final Object f0, final Object g0, final Object h0, final Object i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public static void b(final ContentValues contentValues, final u7t u7t) {
        contentValues.put("data_type", Integer.valueOf(26));
        contentValues.put("data", kbv.j4((Object)u7t.q, (nmp)s7t.d));
    }
    
    public final /* bridge */ Object a() {
        return new way((hky)((dsy)this.F0).a(), (f100)((dsy)this.G0).a(), (xyz)((dsy)this.H0).a(), (rky)((dsy)this.I0).a());
    }
    
    public final u9h c(final String s) {
        if (!((Map)this.I0).containsKey(s)) {
            synchronized (this) {
                if (!((Map)this.I0).containsKey(s)) {
                    final Iterator iterator = this.e(s).iterator();
                    while (iterator.hasNext()) {
                        ((u9h)this.H0).a((bdk)iterator.next());
                    }
                    ((Map)this.I0).put(s, s);
                }
            }
        }
        return (u9h)this.H0;
    }
    
    public final void d() {
        final tvs tvs = (tvs)this.I0;
        final int a = o5j.a;
        b((ContentValues)this.H0, (u7t)tvs);
        if (vmw.v((h0s)this.F0, "timeline", (ContentValues)this.H0) > 0L) {
            ((e6h)this.G0).b(1);
        }
    }
    
    public final Collection e(final String s) {
        Object o = null;
        try {
            o = ((hc4)this.F0).a(s);
            o = ((gah)this.G0).b((InputStream)o);
            return (Collection)o;
        }
        catch (final IllegalStateException o) {}
        catch (final IllegalArgumentException ex) {}
        throw new IllegalStateException(mqb.l("Failed to read file ", s), (Throwable)o);
    }
}
