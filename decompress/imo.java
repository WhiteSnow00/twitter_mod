import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imo
{
    public sox a;
    public ArrayList<sox> b;
    
    public imo(final sox a) {
        this.a = null;
        this.b = new ArrayList<sox>();
        this.a = a;
    }
    
    public final long a(to8 h, long n) {
        final sox d = h.d;
        if (d instanceof zic) {
            return n;
        }
        final int size = h.k.size();
        int i = 0;
        long n2 = n;
        while (i < size) {
            final po8 po8 = h.k.get(i);
            long min = n2;
            if (po8 instanceof to8) {
                final to8 to8 = (to8)po8;
                if (to8.d == d) {
                    min = n2;
                }
                else {
                    min = Math.min(n2, this.a(to8, to8.f + n));
                }
            }
            ++i;
            n2 = min;
        }
        long min2 = n2;
        if (h == d.i) {
            final long j = d.j();
            h = d.h;
            n -= j;
            min2 = Math.min(Math.min(n2, this.a(h, n)), n - d.h.f);
        }
        return min2;
    }
    
    public final long b(to8 i, long n) {
        final sox d = i.d;
        if (d instanceof zic) {
            return n;
        }
        final int size = i.k.size();
        int j = 0;
        long n2 = n;
        while (j < size) {
            final po8 po8 = i.k.get(j);
            long max = n2;
            if (po8 instanceof to8) {
                final to8 to8 = (to8)po8;
                if (to8.d == d) {
                    max = n2;
                }
                else {
                    max = Math.max(n2, this.b(to8, to8.f + n));
                }
            }
            ++j;
            n2 = max;
        }
        long max2 = n2;
        if (i == d.h) {
            final long k = d.j();
            i = d.i;
            n += k;
            max2 = Math.max(Math.max(n2, this.b(i, n)), n - d.i.f);
        }
        return max2;
    }
}
