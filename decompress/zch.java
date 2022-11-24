import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zch implements tcp
{
    public final long[] a;
    public final long[] b;
    public final long c;
    
    public zch(final long[] a, final long[] b, long h) {
        this.a = a;
        this.b = b;
        if (h == -9223372036854775807L) {
            h = rnw.H(b[b.length - 1]);
        }
        this.c = h;
    }
    
    public static Pair<Long, Long> a(final long n, final long[] array, final long[] array2) {
        int f = rnw.f(array, n, true);
        final long n2 = array[f];
        final long n3 = array2[f];
        if (++f == array.length) {
            return (Pair<Long, Long>)Pair.create((Object)n2, (Object)n3);
        }
        final long n4 = array[f];
        final long n5 = array2[f];
        double n6;
        if (n4 == n2) {
            n6 = 0.0;
        }
        else {
            n6 = (n - (double)n2) / (n4 - n2);
        }
        return (Pair<Long, Long>)Pair.create((Object)n, (Object)((long)(n6 * (n5 - n3)) + n3));
    }
    
    public final qcp$a d(final long n) {
        final Pair<Long, Long> a = a(rnw.T(rnw.j(n, 0L, this.c)), this.b, this.a);
        final scp scp = new scp(rnw.H((long)a.first), (long)a.second);
        return new qcp$a(scp, scp);
    }
    
    @Override
    public final long e() {
        return -1L;
    }
    
    public final boolean f() {
        return true;
    }
    
    @Override
    public final long g(final long n) {
        return rnw.H((long)a(n, this.a, this.b).second);
    }
    
    public final long h() {
        return this.c;
    }
}
