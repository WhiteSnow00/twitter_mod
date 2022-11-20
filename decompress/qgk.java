import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import android.database.DataSetObserver;
import android.database.Observable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qgk extends Observable<DataSetObserver>
{
    public static final rlp<qgk> f;
    public final Map<a, cgk> a;
    public long b;
    public dv6 c;
    public boolean d;
    public y0c e;
    
    static {
        qgk.f = new qgk.qgk$b();
    }
    
    public qgk() {
        this.a = new HashMap<a, cgk>();
        this.e = y0c.f;
    }
    
    public qgk(final Map a, final long b, final dv6 c, final boolean d, final y0c e, final oqf oqf) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public qgk(final qgk qgk) {
        this.a = new HashMap<a, cgk>(qgk.a);
        this.b = qgk.b;
        this.c = qgk.c;
        this.d = qgk.d;
        this.e = qgk.e;
    }
    
    public final void a() {
        final Iterator iterator = super.mObservers.iterator();
        while (iterator.hasNext()) {
            ((DataSetObserver)iterator.next()).onChanged();
        }
    }
    
    public final cgk b(final a a) {
        return this.a.get(a);
    }
    
    public final int c(final qev qev) {
        final Map<a, cgk> a = this.a;
        final a d0 = qgk.a.D0;
        if (a.containsKey(d0)) {
            final int index = this.a.get(d0).a.indexOf(qev);
            if (index >= 0) {
                return index;
            }
        }
        final Map<a, cgk> a2 = this.a;
        final a e0 = qgk.a.E0;
        int index2;
        if (a2.containsKey(e0)) {
            index2 = this.a.get(e0).a.indexOf(qev);
        }
        else {
            index2 = -1;
        }
        return index2;
    }
    
    public final String d(final qev qev) {
        final Map<a, cgk> a = this.a;
        final a d0 = qgk.a.D0;
        int index;
        if (a.containsKey(d0)) {
            index = this.a.get(d0).a.indexOf(qev);
        }
        else {
            index = -1;
        }
        if (index >= 0 && index < 25) {
            return "default";
        }
        if (index < 0) {
            final Map<a, cgk> a2 = this.a;
            final a e0 = qgk.a.E0;
            if (!a2.containsKey(e0) || !this.a.get(e0).a.contains(qev)) {
                return "unknown";
            }
        }
        return "search";
    }
    
    public final boolean e(final dv6 dv6) {
        final cgk cgk = this.a.get(qgk.a.D0);
        if (dv6 != null && cgk != null && !cgk.a.isEmpty()) {
            final dv6 c = this.c;
            if (c != null) {
                if (c.a(dv6) <= 30.0f) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && qgk.class == o.getClass()) {
            final qgk qgk = (qgk)o;
            return this.b == qgk.b && this.d == qgk.d && this.a.equals(qgk.a) && c5j.a((Object)this.c, (Object)qgk.c) && this.e.equals((Object)qgk.e);
        }
        return false;
    }
    
    public final qgk f(final y0c e) {
        this.e = e;
        this.a();
        return this;
    }
    
    public final boolean g(final dv6 dv6) {
        if (!this.d) {
            if (!this.e(dv6)) {
                final m4s a = hq1.a;
                if (System.currentTimeMillis() - this.b <= 300000L) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final int hashCode() {
        return this.e.hashCode() + ((c5j.f((Object)this.c) + hmg.e(this.b, this.a.hashCode() * 31, 31)) * 31 + (this.d ? 1 : 0)) * 31;
    }
    
    public enum a
    {
        D0, 
        E0;
        
        public static final a[] F0;
    }
}
