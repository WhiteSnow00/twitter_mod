import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e6r implements fur
{
    public final List<List<v87>> F0;
    public final List<Long> G0;
    
    public e6r(final List<List<v87>> f0, final List<Long> g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final int b(final long n) {
        final List<Long> g0 = this.G0;
        final Long value = n;
        final int a = rnw.a;
        int binarySearch = Collections.binarySearch(g0, value);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        else {
            while (++binarySearch < g0.size() && ((Comparable<Long>)g0.get(binarySearch)).compareTo(value) == 0) {}
        }
        if (binarySearch >= this.G0.size()) {
            binarySearch = -1;
        }
        return binarySearch;
    }
    
    public final List<v87> e(final long n) {
        final int d = rnw.d((List)this.G0, (Comparable)n, false);
        if (d == -1) {
            return Collections.emptyList();
        }
        return this.F0.get(d);
    }
    
    public final long f(final int n) {
        final boolean b = true;
        omi.m(n >= 0);
        omi.m(n < this.G0.size() && b);
        return this.G0.get(n);
    }
    
    public final int g() {
        return this.G0.size();
    }
}
