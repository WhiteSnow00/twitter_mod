import com.google.android.exoplayer2.e0$d;
import com.google.android.exoplayer2.e0$b;
import java.util.Objects;
import android.net.Uri;
import com.google.android.exoplayer2.q$b;
import com.google.android.exoplayer2.q$f;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.e0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edq extends e0
{
    public static final Object S0;
    public final long G0;
    public final long H0;
    public final long I0;
    public final long J0;
    public final long K0;
    public final long L0;
    public final boolean M0;
    public final boolean N0;
    public final boolean O0;
    public final Object P0;
    public final q Q0;
    public final q$f R0;
    
    static {
        S0 = new Object();
        final q$b q$b = new q$b();
        q$b.a = "SinglePeriodTimeline";
        q$b.b = Uri.EMPTY;
        q$b.a();
    }
    
    public edq(final long g0, final long h0, final long i0, final long j0, final long k0, final long l0, final boolean m0, final boolean n0, final boolean o0, final Object p12, final q q0, final q$f r0) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p12;
        Objects.requireNonNull(q0);
        this.Q0 = q0;
        this.R0 = r0;
    }
    
    public final int c(final Object o) {
        int n;
        if (edq.S0.equals(o)) {
            n = 0;
        }
        else {
            n = -1;
        }
        return n;
    }
    
    public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
        omi.o(n, 1);
        Object s0;
        if (b) {
            s0 = edq.S0;
        }
        else {
            s0 = null;
        }
        final long i0 = this.I0;
        final long n2 = -this.K0;
        Objects.requireNonNull(e0$b);
        e0$b.i((Object)null, s0, 0, i0, n2, sq.L0, false);
        return e0$b;
    }
    
    public final int j() {
        return 1;
    }
    
    public final Object n(final int n) {
        omi.o(n, 1);
        return edq.S0;
    }
    
    public final e0$d p(final int n, final e0$d e0$d, long n2) {
        omi.o(n, 1);
        final long l0 = this.L0;
        final boolean n3 = this.N0;
        long n4 = l0;
        Label_0089: {
            if (n3) {
                n4 = l0;
                if (!this.O0) {
                    n4 = l0;
                    if (n2 != 0L) {
                        final long j0 = this.J0;
                        if (j0 != -9223372036854775807L) {
                            n2 = (n4 = l0 + n2);
                            if (n2 <= j0) {
                                break Label_0089;
                            }
                        }
                        n4 = -9223372036854775807L;
                    }
                }
            }
        }
        e0$d.f(e0$d.W0, this.Q0, this.P0, this.G0, this.H0, -9223372036854775807L, this.M0, n3, this.R0, n4, this.J0, 0, 0, this.K0);
        return e0$d;
    }
    
    public final int q() {
        return 1;
    }
}
