import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import android.database.DataSetObserver;
import android.database.Observable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhk extends Observable<DataSetObserver>
{
    public static final nmp<dhk> f;
    public final Map<a, pgk> a;
    public long b;
    public jw6 c;
    public boolean d;
    public y1c e;
    
    static {
        dhk.f = new dhk.dhk$b();
    }
    
    public dhk() {
        this.a = new HashMap<a, pgk>();
        this.e = y1c.f;
    }
    
    public dhk(final dhk dhk) {
        this.a = new HashMap<a, pgk>(dhk.a);
        this.b = dhk.b;
        this.c = dhk.c;
        this.d = dhk.d;
        this.e = dhk.e;
    }
    
    public dhk(final Map a, final long b, final jw6 c, final boolean d, final y1c e, final ehk ehk) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        final Iterator iterator = super.mObservers.iterator();
        while (iterator.hasNext()) {
            ((DataSetObserver)iterator.next()).onChanged();
        }
    }
    
    public final pgk b(final a a) {
        return this.a.get(a);
    }
    
    public final int c(final efv efv) {
        final Map<a, pgk> a = this.a;
        final a f0 = dhk.a.F0;
        if (a.containsKey(f0)) {
            final int index = this.a.get(f0).a.indexOf(efv);
            if (index >= 0) {
                return index;
            }
        }
        final Map<a, pgk> a2 = this.a;
        final a g0 = dhk.a.G0;
        int index2;
        if (a2.containsKey(g0)) {
            index2 = this.a.get(g0).a.indexOf(efv);
        }
        else {
            index2 = -1;
        }
        return index2;
    }
    
    public final String d(final efv efv) {
        final Map<a, pgk> a = this.a;
        final a f0 = dhk.a.F0;
        int index;
        if (a.containsKey(f0)) {
            index = this.a.get(f0).a.indexOf(efv);
        }
        else {
            index = -1;
        }
        if (index >= 0 && index < 25) {
            return "default";
        }
        if (index < 0) {
            final Map<a, pgk> a2 = this.a;
            final a g0 = dhk.a.G0;
            if (!a2.containsKey(g0) || !this.a.get(g0).a.contains(efv)) {
                return "unknown";
            }
        }
        return "search";
    }
    
    public final boolean e(final jw6 jw6) {
        final pgk pgk = this.a.get(dhk.a.F0);
        if (jw6 != null && pgk != null && !pgk.a.isEmpty()) {
            final jw6 c = this.c;
            if (c != null) {
                if (c.a(jw6) <= 30.0f) {
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
        if (o != null && dhk.class == o.getClass()) {
            final dhk dhk = (dhk)o;
            return this.b == dhk.b && this.d == dhk.d && this.a.equals(dhk.a) && o5j.a((Object)this.c, (Object)dhk.c) && this.e.equals(dhk.e);
        }
        return false;
    }
    
    public final dhk f(final y1c e) {
        this.e = e;
        this.a();
        return this;
    }
    
    public final boolean g(final jw6 jw6) {
        if (!this.d) {
            if (!this.e(jw6)) {
                final g5s a = nq1.a;
                if (System.currentTimeMillis() - this.b <= 300000L) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final int hashCode() {
        return this.e.hashCode() + ((o5j.f((Object)this.c) + a88.k(this.b, this.a.hashCode() * 31, 31)) * 31 + (this.d ? 1 : 0)) * 31;
    }
    
    public enum a
    {
        F0, 
        G0;
        
        public static final a[] H0;
    }
}
