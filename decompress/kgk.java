import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import android.database.DataSetObserver;
import android.database.Observable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgk extends Observable<DataSetObserver>
{
    public static final alp<kgk> f;
    public final Map<a, wfk> a;
    public long b;
    public zv6 c;
    public boolean d;
    public v1c e;
    
    static {
        kgk.f = new kgk.kgk$b();
    }
    
    public kgk() {
        this.a = new HashMap<a, wfk>();
        this.e = v1c.f;
    }
    
    public kgk(final Map a, final long b, final zv6 c, final boolean d, final v1c e, final ffa ffa) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public kgk(final kgk kgk) {
        this.a = new HashMap<a, wfk>(kgk.a);
        this.b = kgk.b;
        this.c = kgk.c;
        this.d = kgk.d;
        this.e = kgk.e;
    }
    
    public final void a() {
        final Iterator iterator = super.mObservers.iterator();
        while (iterator.hasNext()) {
            ((DataSetObserver)iterator.next()).onChanged();
        }
    }
    
    public final wfk b(final a a) {
        return this.a.get(a);
    }
    
    public final int c(final vdv vdv) {
        final Map<a, wfk> a = this.a;
        final a c0 = kgk.a.C0;
        if (a.containsKey(c0)) {
            final int index = this.a.get(c0).a.indexOf(vdv);
            if (index >= 0) {
                return index;
            }
        }
        final Map<a, wfk> a2 = this.a;
        final a d0 = kgk.a.D0;
        int index2;
        if (a2.containsKey(d0)) {
            index2 = this.a.get(d0).a.indexOf(vdv);
        }
        else {
            index2 = -1;
        }
        return index2;
    }
    
    public final String d(final vdv vdv) {
        final Map<a, wfk> a = this.a;
        final a c0 = kgk.a.C0;
        int index;
        if (a.containsKey(c0)) {
            index = this.a.get(c0).a.indexOf(vdv);
        }
        else {
            index = -1;
        }
        if (index >= 0 && index < 25) {
            return "default";
        }
        if (index < 0) {
            final Map<a, wfk> a2 = this.a;
            final a d0 = kgk.a.D0;
            if (!a2.containsKey(d0) || !this.a.get(d0).a.contains(vdv)) {
                return "unknown";
            }
        }
        return "search";
    }
    
    public final boolean e(final zv6 zv6) {
        final wfk wfk = this.a.get(kgk.a.C0);
        if (zv6 != null && wfk != null && !wfk.a.isEmpty()) {
            final zv6 c = this.c;
            if (c != null) {
                if (c.a(zv6) <= 30.0f) {
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
        if (o != null && kgk.class == o.getClass()) {
            final kgk kgk = (kgk)o;
            return this.b == kgk.b && this.d == kgk.d && this.a.equals(kgk.a) && w4j.a((Object)this.c, (Object)kgk.c) && this.e.equals((Object)kgk.e);
        }
        return false;
    }
    
    public final kgk f(final v1c e) {
        this.e = e;
        this.a();
        return this;
    }
    
    public final boolean g(final zv6 zv6) {
        if (!this.d) {
            if (!this.e(zv6)) {
                final t3s a = mq1.a;
                if (System.currentTimeMillis() - this.b <= 300000L) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final int hashCode() {
        return this.e.hashCode() + ((w4j.f((Object)this.c) + jhd.j(this.b, this.a.hashCode() * 31, 31)) * 31 + (this.d ? 1 : 0)) * 31;
    }
    
    public enum a
    {
        C0, 
        D0;
    }
}
