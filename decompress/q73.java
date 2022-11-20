import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public class q73 implements Comparable<q73>
{
    public final String D0;
    public final long E0;
    public final long F0;
    public final boolean G0;
    public final File H0;
    public final long I0;
    
    public q73(final String d0, final long e0, final long f0, final long i0, final File h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = (h0 != null);
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final int b(final q73 q73) {
        if (!this.D0.equals(q73.D0)) {
            return this.D0.compareTo(q73.D0);
        }
        final long n = lcmp(this.E0 - q73.E0, 0L);
        int n2;
        if (n == 0) {
            n2 = 0;
        }
        else if (n < 0) {
            n2 = -1;
        }
        else {
            n2 = 1;
        }
        return n2;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.b((q73)o);
    }
    
    @Override
    public final String toString() {
        final long e0 = this.E0;
        final long f0 = this.F0;
        final StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(e0);
        sb.append(", ");
        return hmg.i(sb, f0, "]");
    }
}
