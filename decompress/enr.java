import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enr implements fur
{
    public final v87[] F0;
    public final long[] G0;
    
    public enr(final v87[] f0, final long[] g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final int b(final long n) {
        int b = rnw.b(this.G0, n, false);
        if (b >= this.G0.length) {
            b = -1;
        }
        return b;
    }
    
    public final List<v87> e(final long n) {
        final int f = rnw.f(this.G0, n, false);
        if (f != -1) {
            final v87[] f2 = this.F0;
            if (f2[f] != v87.W0) {
                return Collections.singletonList(f2[f]);
            }
        }
        return Collections.emptyList();
    }
    
    public final long f(final int n) {
        final boolean b = true;
        omi.m(n >= 0);
        omi.m(n < this.G0.length && b);
        return this.G0[n];
    }
    
    public final int g() {
        return this.G0.length;
    }
}
