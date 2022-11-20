import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class boh implements jbx
{
    public final boolean a;
    public final List<joh> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public boh() {
        final f2a d0 = f2a.D0;
        this.a = false;
        this.b = (List<joh>)d0;
        this.c = false;
        this.d = true;
        this.e = false;
    }
    
    public boh(final boolean a, final List<? extends joh> b, final boolean c, final boolean d, final boolean e) {
        this.a = a;
        this.b = (List<joh>)b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static boh l(final boh boh, boolean a, List b, boolean c, boolean d, boolean e, final int n) {
        if ((n & 0x1) != 0x0) {
            a = boh.a;
        }
        if ((n & 0x2) != 0x0) {
            b = boh.b;
        }
        if ((n & 0x4) != 0x0) {
            c = boh.c;
        }
        if ((n & 0x8) != 0x0) {
            d = boh.d;
        }
        if ((n & 0x10) != 0x0) {
            e = boh.e;
        }
        Objects.requireNonNull(boh);
        czd.f((Object)b, "listItems");
        return new boh(a, b, c, d, e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof boh)) {
            return false;
        }
        final boh boh = (boh)o;
        return this.a == boh.a && czd.a((Object)this.b, (Object)boh.b) && this.c == boh.c && this.d == boh.d && this.e == boh.e;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final int d = sde.d((List)this.b, n2 * 31, 31);
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        int d2;
        if ((d2 = (this.d ? 1 : 0)) != 0) {
            d2 = 1;
        }
        final int e = this.e ? 1 : 0;
        if (e == 0) {
            n = e;
        }
        return ((d + c) * 31 + d2) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final List<joh> b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("ModuleOverviewViewState(loading=");
        sb.append(a);
        sb.append(", listItems=");
        sb.append(b);
        sb.append(", hasFeaturedSpotlight=");
        jg9.u(sb, c, ", showDisclaimer=", d, ", areModulesUpdated=");
        return wnj.D(sb, e, ")");
    }
}
