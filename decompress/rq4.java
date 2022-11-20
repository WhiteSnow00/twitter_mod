import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
import com.google.android.exoplayer2.f$a;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rq4 implements f
{
    public static final f$a<rq4> I0;
    public final int D0;
    public final int E0;
    public final int F0;
    public final byte[] G0;
    public int H0;
    
    static {
        rq4.I0 = b9l.O0;
    }
    
    public rq4(final int d0, final int e0, final int f0, final byte[] g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Pure
    public static int a(final int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 9) {
            return 6;
        }
        if (n != 4 && n != 5 && n != 6 && n != 7) {
            return -1;
        }
        return 2;
    }
    
    @Pure
    public static int b(final int n) {
        if (n != 1) {
            if (n == 16) {
                return 6;
            }
            if (n == 18) {
                return 7;
            }
            if (n != 6 && n != 7) {
                return -1;
            }
        }
        return 3;
    }
    
    public static String c(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && rq4.class == o.getClass()) {
            final rq4 rq4 = (rq4)o;
            if (this.D0 != rq4.D0 || this.E0 != rq4.E0 || this.F0 != rq4.F0 || !Arrays.equals(this.G0, rq4.G0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.H0 == 0) {
            this.H0 = Arrays.hashCode(this.G0) + (((527 + this.D0) * 31 + this.E0) * 31 + this.F0) * 31;
        }
        return this.H0;
    }
    
    @Override
    public final String toString() {
        final int d0 = this.D0;
        final int e0 = this.E0;
        final int f0 = this.F0;
        final boolean b = this.G0 != null;
        final StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(d0);
        sb.append(", ");
        sb.append(e0);
        sb.append(", ");
        sb.append(f0);
        sb.append(", ");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
