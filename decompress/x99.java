import java.util.List;
import java.io.IOException;
import android.os.Parcelable$Creator;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x99 implements yas
{
    public static final nmp<x99> Q0;
    public final int F0;
    public final int G0;
    public final Uri H0;
    public final Uri I0;
    public final e2h J0;
    public final n0h K0;
    public final onb L0;
    public final Long M0;
    public final Long N0;
    public final Boolean O0;
    public final jx9<?> P0;
    
    static {
        x99.Q0 = x99.x99$a.b;
    }
    
    public x99(final Uri uri, final Uri uri2, final e2h e2h, final n0h n0h, final jx9 jx9) {
        String scheme;
        if ((scheme = uri2.getScheme()) == null) {
            scheme = "";
        }
        int n = 0;
        Label_0150: {
            switch (scheme) {
                case "content": {
                    n = 3;
                    break Label_0150;
                }
                case "https": {
                    n = 2;
                    break Label_0150;
                }
                case "http": {
                    n = 1;
                    break Label_0150;
                }
                case "file": {
                    n = 0;
                    break Label_0150;
                }
                default:
                    break;
            }
            n = -1;
        }
        int n2;
        if (n != 0) {
            if (n != 1 && n != 2) {
                if (n != 3) {
                    n2 = -1;
                }
                else {
                    n2 = 2;
                }
            }
            else {
                n2 = 3;
            }
        }
        else {
            n2 = 4;
        }
        this(uri, uri2, e2h, n0h, jx9, n2);
    }
    
    public x99(final Uri h0, final Uri i0, final e2h j0, final n0h k0, final jx9 jx9, final int f0) {
        this.F0 = f0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.G0 = 0;
        this.O0 = Boolean.TRUE;
        jx9 f2;
        if (jx9 != null) {
            f2 = jx9.f();
        }
        else {
            f2 = null;
        }
        this.P0 = (jx9<?>)f2;
        this.L0 = null;
        this.M0 = 0L;
        this.N0 = 0L;
    }
    
    public x99(final jx9 jx9) {
        this(jx9, jx9.m(), null, 0);
    }
    
    public x99(final jx9 jx9, final Uri i0, final onb l0, final int g0) {
        this.F0 = 1;
        this.H0 = jx9.G0;
        this.I0 = i0;
        this.J0 = jx9.F0.c;
        this.K0 = jx9.H0;
        this.G0 = g0;
        this.P0 = (jx9<?>)jx9.f();
        this.L0 = l0;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = Boolean.TRUE;
    }
    
    public x99(final onb l0, final dwg dwg) {
        this.F0 = 3;
        final Uri parse = Uri.parse(l0.e);
        this.H0 = parse;
        this.I0 = Uri.parse(l0.g.F0);
        this.J0 = e2h.K0;
        final n0h k0 = new n0h(l0.e, l0.a, l0.d);
        this.K0 = k0;
        this.G0 = 0;
        final jx9<?> jx9 = null;
        jx9 i;
        if (dwg == null) {
            i = jx9;
        }
        else {
            i = jx9.k(dwg, parse, k0, (String)null);
        }
        this.P0 = (jx9<?>)i;
        this.L0 = l0;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = Boolean.TRUE;
    }
    
    public x99(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
        this.F0 = rmp.z();
        this.H0 = Uri.parse(rmp.C());
        this.I0 = Uri.parse(rmp.C());
        this.J0 = e2h.e(rmp.z());
        final Parcelable$Creator creator = n0h.CREATOR;
        final Object a = ((k5j)n0h$b.b).a(rmp);
        vmw.g(a);
        this.K0 = (n0h)a;
        this.P0 = (jx9<?>)((k5j)jx9.I0).a(rmp);
        int z;
        if (n >= 1) {
            z = rmp.z();
        }
        else {
            z = 0;
        }
        this.G0 = z;
        if (n >= 2) {
            this.L0 = (onb)onb.i.a(rmp);
        }
        else {
            this.L0 = null;
        }
        if (n == 2 && rmp.t() == 3) {
            rmp.A();
            rmp.A();
        }
        if (n >= 3) {
            this.M0 = rmp.A();
            this.N0 = rmp.A();
        }
        else {
            this.M0 = 0L;
            this.N0 = 0L;
        }
        if (n >= 4) {
            this.O0 = rmp.u();
        }
        else {
            this.O0 = Boolean.TRUE;
        }
    }
    
    public x99(final x99 x99, final long n, final long n2) {
        this.F0 = x99.F0;
        this.G0 = x99.G0;
        this.H0 = x99.H0;
        this.I0 = x99.I0;
        this.J0 = x99.J0;
        this.K0 = x99.K0;
        this.L0 = x99.L0;
        this.P0 = x99.P0;
        this.M0 = n;
        this.N0 = n2;
        this.O0 = Boolean.FALSE;
    }
    
    @Override
    public final List<m1h> a() {
        final jx9<?> p0 = this.P0;
        Object o;
        if (p0 instanceof yas) {
            o = ((yas)p0).a();
        }
        else {
            o = ged.G0;
            final int a = o5j.a;
        }
        return (List<m1h>)o;
    }
    
    public final jx9 b(final int n) {
        final jx9 jx9 = null;
        jx9 f = null;
        if ((n & 0x1) != 0x0) {
            final jx9<?> p = this.P0;
            if (p != null) {
                f = p.f();
            }
            return f;
        }
        if ((n & 0x2) != 0x0) {
            jx9 f2 = jx9;
            if (this.F0 == 1) {
                final jx9<?> p2 = this.P0;
                f2 = jx9;
                if (p2 != null) {
                    f2 = p2.f();
                }
            }
            return f2;
        }
        throw new IllegalArgumentException("invalid media selection");
    }
    
    public final bbq<Boolean> c(final x99 x99) {
        final jx9<?> p = this.P0;
        if (p == null) {
            return (bbq<Boolean>)bbq.v((Object)Boolean.FALSE);
        }
        if (x99 != null) {
            final jx9<?> p2 = x99.P0;
            if (p2 != null) {
                if (p.F0.a.equals(p2.F0.a)) {
                    return (bbq<Boolean>)bbq.v((Object)Boolean.FALSE);
                }
            }
        }
        return (bbq<Boolean>)this.P0.n();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && x99.class == o.getClass()) {
            final x99 x99 = (x99)o;
            if (this.F0 != x99.F0 || !this.H0.equals((Object)x99.H0) || !o5j.a((Object)this.P0, (Object)x99.P0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.P0) + (this.H0.hashCode() + this.F0 * 31) * 31;
    }
}
