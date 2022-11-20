import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k9 implements jbx
{
    public final h6w a;
    public final zlj b;
    public final String c;
    public final lu2 d;
    public final Long e;
    public final xj6 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final r12 j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final int n;
    public final boolean o;
    
    public k9(final h6w a, final zlj b, final String c, final lu2 d, final Long e, final xj6 f, final boolean g, final boolean h, final boolean i, final r12 j, final boolean k, final boolean l, final String m, final int n, final boolean o) {
        czd.f((Object)c, "addressText");
        czd.f((Object)f, "contactOptionsConfig");
        czd.f((Object)j, "blockInteractions");
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
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    public static k9 l(final k9 k9, h6w a, zlj b, String c, lu2 d, Long e, xj6 f, boolean g, boolean h, r12 j, boolean i, boolean l, String m, boolean o, final int n) {
        if ((n & 0x1) != 0x0) {
            a = k9.a;
        }
        if ((n & 0x2) != 0x0) {
            b = k9.b;
        }
        if ((n & 0x4) != 0x0) {
            c = k9.c;
        }
        if ((n & 0x8) != 0x0) {
            d = k9.d;
        }
        if ((n & 0x10) != 0x0) {
            e = k9.e;
        }
        if ((n & 0x20) != 0x0) {
            f = k9.f;
        }
        if ((n & 0x40) != 0x0) {
            g = k9.g;
        }
        if ((n & 0x80) != 0x0) {
            h = k9.h;
        }
        final boolean b2 = (n & 0x100) != 0x0 && k9.i;
        if ((n & 0x200) != 0x0) {
            j = k9.j;
        }
        if ((n & 0x400) != 0x0) {
            i = k9.k;
        }
        if ((n & 0x800) != 0x0) {
            l = k9.l;
        }
        if ((n & 0x1000) != 0x0) {
            m = k9.m;
        }
        int n2;
        if ((n & 0x2000) != 0x0) {
            n2 = k9.n;
        }
        else {
            n2 = 0;
        }
        if ((n & 0x4000) != 0x0) {
            o = k9.o;
        }
        Objects.requireNonNull(k9);
        czd.f((Object)c, "addressText");
        czd.f((Object)f, "contactOptionsConfig");
        czd.f((Object)j, "blockInteractions");
        return new k9(a, b, c, d, e, f, g, h, b2, j, i, l, m, n2, o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k9)) {
            return false;
        }
        final k9 k9 = (k9)o;
        return czd.a((Object)this.a, (Object)k9.a) && czd.a((Object)this.b, (Object)k9.b) && czd.a((Object)this.c, (Object)k9.c) && czd.a((Object)this.d, (Object)k9.d) && czd.a((Object)this.e, (Object)k9.e) && czd.a((Object)this.f, (Object)k9.f) && this.g == k9.g && this.h == k9.h && this.i == k9.i && czd.a((Object)this.j, (Object)k9.j) && this.k == k9.k && this.l == k9.l && czd.a((Object)this.m, (Object)k9.m) && this.n == k9.n && this.o == k9.o;
    }
    
    @Override
    public final int hashCode() {
        final h6w a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final zlj b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int f = hmg.f(this.c, (hashCode2 * 31 + hashCode3) * 31, 31);
        final lu2 d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final Long e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final int hashCode6 = this.f.hashCode();
        final int g = this.g ? 1 : 0;
        int n = 1;
        int n2 = g;
        if (g != 0) {
            n2 = 1;
        }
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        int i;
        if ((i = (this.i ? 1 : 0)) != 0) {
            i = 1;
        }
        final int hashCode7 = this.j.hashCode();
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        int l;
        if ((l = (this.l ? 1 : 0)) != 0) {
            l = 1;
        }
        final String m = this.m;
        if (m != null) {
            hashCode = m.hashCode();
        }
        final int n3 = this.n;
        final int o = this.o ? 1 : 0;
        if (o == 0) {
            n = o;
        }
        return (((((hashCode7 + ((((hashCode6 + ((f + hashCode4) * 31 + hashCode5) * 31) * 31 + n2) * 31 + h) * 31 + i) * 31) * 31 + k) * 31 + l) * 31 + hashCode) * 31 + n3) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final h6w a = this.a;
        final zlj b = this.b;
        final String c = this.c;
        final lu2 d = this.d;
        final Long e = this.e;
        final xj6 f = this.f;
        final boolean g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final r12 j = this.j;
        final boolean k = this.k;
        final boolean l = this.l;
        final String m = this.m;
        final int n = this.n;
        final boolean o = this.o;
        final StringBuilder sb = new StringBuilder();
        sb.append("AboutModuleViewState(businessUrl=");
        sb.append(a);
        sb.append(", openClosedDisplayTextComponents=");
        sb.append(b);
        sb.append(", addressText=");
        sb.append(c);
        sb.append(", businessContact=");
        sb.append(d);
        sb.append(", userId=");
        sb.append(e);
        sb.append(", contactOptionsConfig=");
        sb.append(f);
        sb.append(", showDirectionsButton=");
        jg9.u(sb, g, ", showContactButton=", h, ", loading=");
        sb.append(i);
        sb.append(", blockInteractions=");
        sb.append(j);
        sb.append(", showDividers=");
        jg9.u(sb, k, ", showButtonSpacer=", l, ", locationMapUrl=");
        bo1.z(sb, m, ", moduleTitle=", n, ", showTitle=");
        return wnj.D(sb, o, ")");
    }
}
