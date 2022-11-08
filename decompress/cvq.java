import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvq implements oax
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List<y9r> d;
    public final List<eap> e;
    public final boolean f;
    
    public cvq() {
        this(false, false, false, null, null, false, 63, null);
    }
    
    public cvq(final boolean a, final boolean b, final boolean c, final List<y9r> d, final List<eap> e, final boolean f) {
        zzd.f((Object)d, "stations");
        zzd.f((Object)e, "sections");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static cvq l(final cvq cvq, boolean a, boolean b, boolean c, List d, List e, boolean f, final int n) {
        if ((n & 0x1) != 0x0) {
            a = cvq.a;
        }
        if ((n & 0x2) != 0x0) {
            b = cvq.b;
        }
        if ((n & 0x4) != 0x0) {
            c = cvq.c;
        }
        if ((n & 0x8) != 0x0) {
            d = cvq.d;
        }
        if ((n & 0x10) != 0x0) {
            e = cvq.e;
        }
        if ((n & 0x20) != 0x0) {
            f = cvq.f;
        }
        Objects.requireNonNull(cvq);
        zzd.f((Object)d, "stations");
        zzd.f((Object)e, "sections");
        return new cvq(a, b, c, d, e, f);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cvq)) {
            return false;
        }
        final cvq cvq = (cvq)o;
        return this.a == cvq.a && this.b == cvq.b && this.c == cvq.c && zzd.a((Object)this.d, (Object)cvq.d) && zzd.a((Object)this.e, (Object)cvq.e) && this.f == cvq.f;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        final int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final int m = hy8.m((List)this.e, hy8.m((List)this.d, ((n2 * 31 + b) * 31 + c) * 31, 31), 31);
        int f = this.f ? 1 : 0;
        if (f != 0) {
            f = n;
        }
        return m + f;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final List<y9r> d = this.d;
        final List<eap> e = this.e;
        final boolean f = this.f;
        final StringBuilder k = hi.K("SpacesStationsTabViewState(showLoading=", a, ", isRefreshing=", b, ", hasError=");
        k.append(c);
        k.append(", stations=");
        k.append(d);
        k.append(", sections=");
        k.append(e);
        k.append(", isVisible=");
        k.append(f);
        k.append(")");
        return k.toString();
    }
}
