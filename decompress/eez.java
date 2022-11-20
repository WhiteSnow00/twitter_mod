import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eez implements wuz
{
    public final Integer D0;
    public final int E0;
    public final int F0;
    public final Long G0;
    public final Long H0;
    public final List I0;
    public final List J0;
    
    public eez(final Integer d0, final int e0, final int f0, final Long g0, final Long h0, final List i0, final List j0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final o2r j(o2r b) {
        final Integer d0 = this.D0;
        final int e0 = this.E0;
        final int f0 = this.F0;
        final Long g0 = this.G0;
        final Long h0 = this.H0;
        List<String> list = this.I0;
        final List j0 = this.J0;
        final int p = ara.p;
        if (b == null) {
            b = o2r.b(0, 0, 0, 0L, 0L, new ArrayList<String>(), new ArrayList<String>());
        }
        int n;
        if (d0 == null) {
            n = b.g();
        }
        else {
            n = d0;
        }
        long n2;
        if (g0 == null) {
            n2 = b.a();
        }
        else {
            n2 = g0;
        }
        long n3;
        if (h0 == null) {
            n3 = b.i();
        }
        else {
            n3 = h0;
        }
        if (list == null) {
            list = b.e();
        }
        List<String> d2;
        if (j0 == null) {
            d2 = b.d();
        }
        else {
            d2 = j0;
        }
        return o2r.b(n, e0, f0, n2, n3, list, d2);
    }
}
