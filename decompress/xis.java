import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xis
{
    public static final a Companion;
    public static final xis d;
    public final ozq a;
    public final pvj b;
    public final gik c;
    
    static {
        Companion = new a();
        d = new xis(0L, 0L, null, null, null, 0L, null, null, 0L, 262143);
    }
    
    public xis(long g, long c, rlb rlb, nlb nlb, rkb rkb, long c2, kes kes, rds rds, long c3, final int n) {
        if ((n & 0x1) != 0x0) {
            Objects.requireNonNull(pr4.Companion);
            g = pr4.g;
        }
        if ((n & 0x2) != 0x0) {
            Objects.requireNonNull(cjs.Companion);
            c = cjs.c;
        }
        if ((n & 0x4) != 0x0) {
            rlb = null;
        }
        if ((n & 0x8) != 0x0) {
            nlb = null;
        }
        if ((n & 0x20) != 0x0) {
            rkb = null;
        }
        if ((n & 0x80) != 0x0) {
            Objects.requireNonNull(cjs.Companion);
            c2 = cjs.c;
        }
        long g2;
        if ((n & 0x800) != 0x0) {
            Objects.requireNonNull(pr4.Companion);
            g2 = pr4.g;
        }
        else {
            g2 = 0L;
        }
        if ((n & 0x1000) != 0x0) {
            kes = null;
        }
        if ((n & 0x4000) != 0x0) {
            rds = null;
        }
        if ((n & 0x10000) != 0x0) {
            Objects.requireNonNull(cjs.Companion);
            c3 = cjs.c;
        }
        this(new ozq(ghs.Companion.a(g), c, rlb, nlb, (olb)null, rkb, (String)null, c2, (rr1)null, (jhs)null, (k5g)null, g2, kes, (jqp)null, (eik)null), new pvj(rds, (oes)null, c3, (khs)null, (rhk)null, (edf)null, (ycf)null, (i2d)null), null);
    }
    
    public xis(final ozq ozq, final pvj pvj) {
        zzd.f((Object)ozq, "spanStyle");
        final eik o = ozq.o;
        final rhk e = pvj.e;
        gik gik;
        if (o == null && e == null) {
            gik = null;
        }
        else {
            gik = new gik(o, e);
        }
        this(ozq, pvj, gik);
    }
    
    public xis(final ozq a, final pvj b, final gik c) {
        zzd.f((Object)a, "spanStyle");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static xis a(final xis xis, long c, long b, rlb c2, rkb f, kes m, rds a, oes b2, long c3, final int n) {
        if ((n & 0x1) != 0x0) {
            c = xis.a.c();
        }
        if ((n & 0x2) != 0x0) {
            b = xis.a.b;
        }
        if ((n & 0x4) != 0x0) {
            c2 = xis.a.c;
        }
        nlb d;
        if ((n & 0x8) != 0x0) {
            d = xis.a.d;
        }
        else {
            d = null;
        }
        olb e;
        if ((n & 0x10) != 0x0) {
            e = xis.a.e;
        }
        else {
            e = null;
        }
        if ((n & 0x20) != 0x0) {
            f = xis.a.f;
        }
        String g;
        if ((n & 0x40) != 0x0) {
            g = xis.a.g;
        }
        else {
            g = null;
        }
        long h;
        if ((n & 0x80) != 0x0) {
            h = xis.a.h;
        }
        else {
            h = 0L;
        }
        rr1 i;
        if ((n & 0x100) != 0x0) {
            i = xis.a.i;
        }
        else {
            i = null;
        }
        jhs j;
        if ((n & 0x200) != 0x0) {
            j = xis.a.j;
        }
        else {
            j = null;
        }
        k5g k;
        if ((n & 0x400) != 0x0) {
            k = xis.a.k;
        }
        else {
            k = null;
        }
        long l;
        if ((n & 0x800) != 0x0) {
            l = xis.a.l;
        }
        else {
            l = 0L;
        }
        if ((n & 0x1000) != 0x0) {
            m = xis.a.m;
        }
        jqp n2;
        if ((n & 0x2000) != 0x0) {
            n2 = xis.a.n;
        }
        else {
            n2 = null;
        }
        if ((n & 0x4000) != 0x0) {
            a = xis.b.a;
        }
        if ((0x8000 & n) != 0x0) {
            b2 = xis.b.b;
        }
        if ((0x10000 & n) != 0x0) {
            c3 = xis.b.c;
        }
        khs d2;
        if ((n & 0x20000) != 0x0) {
            d2 = xis.b.d;
        }
        else {
            d2 = null;
        }
        ghs ghs;
        if (pr4.c(c, xis.a.c())) {
            ghs = xis.a.a;
        }
        else {
            ghs = ghs.Companion.a(c);
        }
        final ozq ozq = new ozq(ghs, b, c2, d, e, f, g, h, i, j, k, l, m, n2, xis.a.o);
        final pvj b3 = xis.b;
        return new xis(ozq, new pvj(a, b2, c3, d2, b3.e, b3.f, b3.g, b3.h), xis.c);
    }
    
    public final float b() {
        return this.a.a();
    }
    
    public final oq2 c() {
        return this.a.b();
    }
    
    public final long d() {
        return this.a.c();
    }
    
    public final xis e(final xis xis) {
        if (xis != null && !zzd.a((Object)xis, (Object)xis.d)) {
            return new xis(this.a.e(xis.a), this.b.a(xis.b));
        }
        return this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof xis)) {
            return false;
        }
        final ozq a = this.a;
        final xis xis = (xis)o;
        return zzd.a((Object)a, (Object)xis.a) && zzd.a((Object)this.b, (Object)xis.b) && zzd.a((Object)this.c, (Object)xis.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final gik c = this.c;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("TextStyle(color=");
        g.append((Object)pr4.j(this.d()));
        g.append(", brush=");
        g.append(this.c());
        g.append(", alpha=");
        g.append(this.b());
        g.append(", fontSize=");
        g.append((Object)cjs.f(this.a.b));
        g.append(", fontWeight=");
        g.append(this.a.c);
        g.append(", fontStyle=");
        g.append(this.a.d);
        g.append(", fontSynthesis=");
        g.append(this.a.e);
        g.append(", fontFamily=");
        g.append(this.a.f);
        g.append(", fontFeatureSettings=");
        g.append(this.a.g);
        g.append(", letterSpacing=");
        g.append((Object)cjs.f(this.a.h));
        g.append(", baselineShift=");
        g.append(this.a.i);
        g.append(", textGeometricTransform=");
        g.append(this.a.j);
        g.append(", localeList=");
        g.append(this.a.k);
        g.append(", background=");
        g.append((Object)pr4.j(this.a.l));
        g.append(", textDecoration=");
        g.append(this.a.m);
        g.append(", shadow=");
        g.append(this.a.n);
        g.append(", textAlign=");
        g.append(this.b.a);
        g.append(", textDirection=");
        g.append(this.b.b);
        g.append(", lineHeight=");
        g.append((Object)cjs.f(this.b.c));
        g.append(", textIndent=");
        g.append(this.b.d);
        g.append(", platformStyle=");
        g.append(this.c);
        g.append(", lineHeightStyle=");
        g.append(this.b.f);
        g.append(", lineBreak=");
        g.append(this.b.g);
        g.append(", hyphens=");
        g.append(this.b.h);
        g.append(')');
        return g.toString();
    }
    
    public static final class a
    {
    }
}
