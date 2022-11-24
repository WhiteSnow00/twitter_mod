import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u0r implements ccx
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List<o11> d;
    public final List<oxq> e;
    public final String f;
    
    public u0r() {
        this(false, false, false, null, null, null, 63, null);
    }
    
    public u0r(final boolean a, final boolean b, final boolean c, final List<o11> d, final List<? extends oxq> e, final String f) {
        e0e.f((Object)e, "listItems");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (List<oxq>)e;
        this.f = f;
    }
    
    public u0r(final boolean b, final boolean b2, final boolean b3, final List list, final List list2, final String s, final int n, final wg8 wg8) {
        final h3a f0 = h3a.F0;
        this(false, false, false, (List<o11>)f0, (List<? extends oxq>)f0, null);
    }
    
    public static u0r l(final u0r u0r, boolean a, boolean b, boolean c, final int n) {
        if ((n & 0x1) != 0x0) {
            a = u0r.a;
        }
        if ((n & 0x2) != 0x0) {
            b = u0r.b;
        }
        if ((n & 0x4) != 0x0) {
            c = u0r.c;
        }
        List<o11> d;
        if ((n & 0x8) != 0x0) {
            d = u0r.d;
        }
        else {
            d = null;
        }
        List<oxq> e;
        if ((n & 0x10) != 0x0) {
            e = u0r.e;
        }
        else {
            e = null;
        }
        String f;
        if ((n & 0x20) != 0x0) {
            f = u0r.f;
        }
        else {
            f = null;
        }
        Objects.requireNonNull(u0r);
        e0e.f((Object)e, "listItems");
        return new u0r(a, b, c, d, e, f);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u0r)) {
            return false;
        }
        final u0r u0r = (u0r)o;
        return this.a == u0r.a && this.b == u0r.b && this.c == u0r.c && e0e.a((Object)this.d, (Object)u0r.d) && e0e.a((Object)this.e, (Object)u0r.e) && e0e.a((Object)this.f, (Object)u0r.f);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final int c = this.c ? 1 : 0;
        if (c == 0) {
            n = c;
        }
        final List<o11> d = this.d;
        final int n3 = 0;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        final int o = go9.o((List)this.e, (((n2 * 31 + b) * 31 + n) * 31 + hashCode) * 31, 31);
        final String f = this.f;
        int hashCode2;
        if (f == null) {
            hashCode2 = n3;
        }
        else {
            hashCode2 = f.hashCode();
        }
        return o + hashCode2;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final List<o11> d = this.d;
        final List<oxq> e = this.e;
        final String f = this.f;
        final StringBuilder p = a88.p("SpacesTabViewState(showLoading=", a, ", isRefreshing=", b, ", hasError=");
        p.append(c);
        p.append(", filters=");
        p.append(d);
        p.append(", listItems=");
        p.append(e);
        p.append(", selectedFilter=");
        p.append(f);
        p.append(")");
        return p.toString();
    }
}
