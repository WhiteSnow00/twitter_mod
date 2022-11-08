import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m4r implements psr
{
    public final List<List<m87>> C0;
    public final List<Long> D0;
    
    public m4r(final List<List<m87>> c0, final List<Long> d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final int b(final long n) {
        final List<Long> d0 = this.D0;
        final Long value = n;
        final int a = imw.a;
        int binarySearch = Collections.binarySearch(d0, value);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        else {
            while (++binarySearch < d0.size() && ((Comparable<Long>)d0.get(binarySearch)).compareTo(value) == 0) {}
        }
        if (binarySearch >= this.D0.size()) {
            binarySearch = -1;
        }
        return binarySearch;
    }
    
    @Override
    public final List<m87> e(final long n) {
        final int d = imw.d((List)this.D0, (Comparable)n, false);
        if (d == -1) {
            return Collections.emptyList();
        }
        return this.C0.get(d);
    }
    
    @Override
    public final long f(final int n) {
        final boolean b = true;
        ri4.k(n >= 0);
        ri4.k(n < this.D0.size() && b);
        return this.D0.get(n);
    }
    
    @Override
    public final int g() {
        return this.D0.size();
    }
}
