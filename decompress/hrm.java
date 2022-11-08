import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrm
{
    public final List<std> a;
    public final gzs b;
    
    public hrm(final List<std> a, final gzs gzs) {
        this.a = a;
        final gzs d = gzs.d;
        gzs b = gzs;
        if (gzs == null) {
            b = d;
        }
        this.b = b;
    }
    
    public final int a() {
        final hds b = ids$a.b((Iterable)this.c(ids$a.class));
        final ir$a ir$a = (ir$a)hr4.q((List)this.c(ir$a.class));
        final zc4.a a = (zc4.a)hr4.q((List)this.c(zc4.a.class));
        if (b.D0) {
            return 1;
        }
        if (ir$a != null && ir$a.a) {
            return 1;
        }
        if (a != null) {
            return 2;
        }
        return 0;
    }
    
    public final l5h b() {
        final Iterator<std> iterator = this.a.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            final std std = iterator.next();
            if (std instanceof ir$a) {
                final int a = w4j.a;
                final l5h b = ((ir$a)std).b;
                n += b.a;
                n2 += b.b;
            }
        }
        return new l5h(n, n2);
    }
    
    public final <T extends std> List<T> c(final Class<T> clazz) {
        return hr4.i((List)this.a, (Class)clazz);
    }
    
    public final int d(final Integer n) {
        final Iterator<ir$a> iterator = this.c(ir$a.class).iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final List c = iterator.next().c;
            zzd.f((Object)c, "<this>");
            int n3;
            if (c.isEmpty()) {
                n3 = 0;
            }
            else {
                final Iterator iterator2 = c.iterator();
                int n4 = 0;
                while (true) {
                    n3 = n4;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final kus kus = (kus)iterator2.next();
                    if (!(boolean)(n == null || kus.c == n)) {
                        continue;
                    }
                    if (++n4 >= 0) {
                        continue;
                    }
                    tdy.U0();
                    throw null;
                }
            }
            n2 += n3;
        }
        return n2;
    }
    
    public final int e() {
        if (ids$a.b((Iterable)this.c(ids$a.class)).C0) {
            return 3;
        }
        return 0;
    }
}
