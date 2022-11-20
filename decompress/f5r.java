import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f5r implements htr
{
    public final List<List<q77>> D0;
    public final List<Long> E0;
    
    public f5r(final List<List<q77>> d0, final List<Long> e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final int b(final long n) {
        final List<Long> e0 = this.E0;
        final Long value = n;
        final int a = cnw.a;
        int binarySearch = Collections.binarySearch(e0, value);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        else {
            while (++binarySearch < e0.size() && ((Comparable<Long>)e0.get(binarySearch)).compareTo(value) == 0) {}
        }
        if (binarySearch >= this.E0.size()) {
            binarySearch = -1;
        }
        return binarySearch;
    }
    
    public final List<q77> e(final long n) {
        final int d = cnw.d((List)this.E0, (Comparable)n, false);
        if (d == -1) {
            return Collections.emptyList();
        }
        return this.D0.get(d);
    }
    
    public final long f(final int n) {
        final boolean b = true;
        omy.g(n >= 0);
        omy.g(n < this.E0.size() && b);
        return this.E0.get(n);
    }
    
    public final int g() {
        return this.E0.size();
    }
}
