import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p61
{
    public final boolean a;
    public final String b;
    public final mm3 c;
    public final uuf d;
    public final float e;
    public final boolean f;
    
    public p61(String b, final int n) {
        if ((n & 0x2) != 0x0) {
            b = null;
        }
        this.a = false;
        this.b = b;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = false;
    }
    
    public p61(final boolean a, final String b, final mm3 c, final uuf d, final float e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static p61 a(final p61 p8, boolean a, String b, mm3 c, uuf d, float e, boolean f, final int n) {
        if ((n & 0x1) != 0x0) {
            a = p8.a;
        }
        if ((n & 0x2) != 0x0) {
            b = p8.b;
        }
        if ((n & 0x4) != 0x0) {
            c = p8.c;
        }
        if ((n & 0x8) != 0x0) {
            d = p8.d;
        }
        if ((n & 0x10) != 0x0) {
            e = p8.e;
        }
        if ((n & 0x20) != 0x0) {
            f = p8.f;
        }
        Objects.requireNonNull(p8);
        return new p61(a, b, c, d, e, f);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p61)) {
            return false;
        }
        final p61 p = (p61)o;
        return this.a == p.a && e0e.a((Object)this.b, (Object)p.b) && e0e.a((Object)this.c, (Object)p.c) && e0e.a((Object)this.d, (Object)p.d) && Float.compare(this.e, p.e) == 0 && this.f == p.f;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        final int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final mm3 c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final uuf d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        final int g = dn.g(this.e, (((n2 * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31, 31);
        int f = this.f ? 1 : 0;
        if (f != 0) {
            f = n;
        }
        return g + f;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String b = this.b;
        final mm3 c = this.c;
        final uuf d = this.d;
        final float e = this.e;
        final boolean f = this.f;
        final StringBuilder b2 = va.B("AutoAdvanceState(isShowing=", a, ", dataSourceId=", b, ", nextItem=");
        b2.append(c);
        b2.append(", metadataSnapshot=");
        b2.append(d);
        b2.append(", progress=");
        b2.append(e);
        b2.append(", isFinished=");
        b2.append(f);
        b2.append(")");
        return b2.toString();
    }
}
