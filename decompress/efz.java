import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efz implements vvz
{
    public final Integer F0;
    public final int G0;
    public final int H0;
    public final Long I0;
    public final Long J0;
    public final List K0;
    public final List L0;
    
    public efz(final Integer f0, final int g0, final int h0, final Long i0, final Long j0, final List k0, final List l0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
    }
    
    public final n3r h(n3r b) {
        final Integer f0 = this.F0;
        final int g0 = this.G0;
        final int h0 = this.H0;
        final Long i0 = this.I0;
        final Long j0 = this.J0;
        List<String> list = this.K0;
        final List l0 = this.L0;
        final int p = isa.p;
        if (b == null) {
            b = n3r.b(0, 0, 0, 0L, 0L, new ArrayList<String>(), new ArrayList<String>());
        }
        int n;
        if (f0 == null) {
            n = b.g();
        }
        else {
            n = f0;
        }
        long n2;
        if (i0 == null) {
            n2 = b.a();
        }
        else {
            n2 = i0;
        }
        long n3;
        if (j0 == null) {
            n3 = b.i();
        }
        else {
            n3 = j0;
        }
        if (list == null) {
            list = b.e();
        }
        List<String> d;
        if (l0 == null) {
            d = b.d();
        }
        else {
            d = l0;
        }
        return n3r.b(n, g0, h0, n2, n3, list, d);
    }
}
