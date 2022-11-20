// 
// Decompiled by Procyon v0.6.0
// 

public final class dnj
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    public final boolean j;
    
    public dnj() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, 1023, null);
    }
    
    public dnj(final long a, final long b, final long c, final long d, final long e, final long f, final long g, final long h, final boolean i, final boolean j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public dnj(final long n, final long n2, final long n3, final long n4, final long n5, final long n6, final long n7, final long n8, final boolean b, final boolean b2, final int n9, final rf8 rf8) {
        this(1L, 0L, 0L, 0L, 1L, 0L, 0L, 0L, true, true);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dnj)) {
            return false;
        }
        final dnj dnj = (dnj)o;
        return this.a == dnj.a && this.b == dnj.b && this.c == dnj.c && this.d == dnj.d && this.e == dnj.e && this.f == dnj.f && this.g == dnj.g && this.h == dnj.h && this.i == dnj.i && this.j == dnj.j;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b ^ b >>> 32);
        final long c = this.c;
        final int n3 = (int)(c ^ c >>> 32);
        final long d = this.d;
        final int n4 = (int)(d ^ d >>> 32);
        final long e = this.e;
        final int n5 = (int)(e ^ e >>> 32);
        final long f = this.f;
        final int n6 = (int)(f ^ f >>> 32);
        final long g = this.g;
        final int n7 = (int)(g ^ g >>> 32);
        final long h = this.h;
        final int n8 = (int)(h ^ h >>> 32);
        final int i = this.i ? 1 : 0;
        int n9 = 1;
        int n10 = i;
        if (i != 0) {
            n10 = 1;
        }
        final int j = this.j ? 1 : 0;
        if (j == 0) {
            n9 = j;
        }
        return ((((((((n * 31 + n2) * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + n10) * 31 + n9;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final long e = this.e;
        final long f = this.f;
        final long g = this.g;
        final long h = this.h;
        final boolean i = this.i;
        final boolean j = this.j;
        final StringBuilder x = pd.x("OpenbackLimits(displays=", a, ", displayInterval=");
        x.append(b);
        e1.C(x, ", clicks=", c, ", clickInterval=");
        x.append(d);
        e1.C(x, ", dismisses=", e, ", dismissInterval=");
        x.append(f);
        e1.C(x, ", interactions=", g, ", interactionInterval=");
        pd.z(x, h, ", ignoreNightTime=", i);
        x.append(", ignoreGlobalLimits=");
        x.append(j);
        x.append(")");
        return x.toString();
    }
}
