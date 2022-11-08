// 
// Decompiled by Procyon v0.6.0
// 

public final class pr4
{
    public static final a Companion;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public final long a = a;
    
    static {
        Companion = new a();
        b = m0n.q(4278190080L);
        m0n.q(4282664004L);
        m0n.q(4287137928L);
        m0n.q(4291611852L);
        c = m0n.q(4294967295L);
        d = m0n.q(4294901760L);
        m0n.q(4278255360L);
        e = m0n.q(4278190335L);
        m0n.q(4294967040L);
        m0n.q(4278255615L);
        m0n.q(4294902015L);
        f = m0n.p(0);
        final bs4 a = bs4.a;
        g = m0n.o(0.0f, 0.0f, 0.0f, 0.0f, (as4)bs4.t);
    }
    
    public static final long a(final long n, final as4 as4) {
        zzd.f((Object)as4, "colorSpace");
        if (zzd.a((Object)as4, (Object)f(n))) {
            return n;
        }
        final ci6 o = lr0.o(f(n), as4, 2);
        final float[] s = m0n.S(n);
        o.a(s);
        return m0n.o(s[0], s[1], s[2], s[3], as4);
    }
    
    public static long b(final long n, final float n2) {
        return m0n.o(h(n), g(n), e(n), n2, f(n));
    }
    
    public static final boolean c(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float d(final long n) {
        float n2;
        float n3;
        if ((0x3FL & n) == 0x0L) {
            n2 = (float)dcs.N(n >>> 56 & 0xFFL);
            n3 = 255.0f;
        }
        else {
            n2 = (float)dcs.N(n >>> 6 & 0x3FFL);
            n3 = 1023.0f;
        }
        return n2 / n3;
    }
    
    public static final float e(final long n) {
        float e;
        if ((0x3FL & n) == 0x0L) {
            e = (float)dcs.N(n >>> 32 & 0xFFL) / 255.0f;
        }
        else {
            final short n2 = (short)(n >>> 16 & 0xFFFFL);
            final i7b.a companion = i7b.Companion;
            e = i7b.e(n2);
        }
        return e;
    }
    
    public static final as4 f(final long n) {
        final bs4 a = bs4.a;
        return bs4.v[(int)(n & 0x3FL)];
    }
    
    public static final float g(final long n) {
        float e;
        if ((0x3FL & n) == 0x0L) {
            e = (float)dcs.N(n >>> 40 & 0xFFL) / 255.0f;
        }
        else {
            final short n2 = (short)(n >>> 32 & 0xFFFFL);
            final i7b.a companion = i7b.Companion;
            e = i7b.e(n2);
        }
        return e;
    }
    
    public static final float h(final long n) {
        float e;
        if ((0x3FL & n) == 0x0L) {
            e = (float)dcs.N(n >>> 48 & 0xFFL) / 255.0f;
        }
        else {
            final short n2 = (short)(n >>> 48 & 0xFFFFL);
            final i7b.a companion = i7b.Companion;
            e = i7b.e(n2);
        }
        return e;
    }
    
    public static int i(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static String j(final long n) {
        final StringBuilder g = w48.g("Color(");
        g.append(h(n));
        g.append(", ");
        g.append(g(n));
        g.append(", ");
        g.append(e(n));
        g.append(", ");
        g.append(d(n));
        g.append(", ");
        return xpa.m(g, f(n).a, ')');
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof pr4;
        boolean b2 = false;
        if (b) {
            if (a == ((pr4)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return i(this.a);
    }
    
    @Override
    public final String toString() {
        return j(this.a);
    }
    
    public static final class a
    {
    }
}
