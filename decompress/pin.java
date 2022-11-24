import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pin implements ccx
{
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List<t1r> f;
    public final String g;
    public final String h;
    public final z21 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final yh5 m;
    
    public pin(final String a, final String b, final boolean c, final boolean d, final boolean e, final List<? extends t1r> f, final String g, final String h, final z21 i, final boolean j, final boolean k, final boolean l, final yh5 m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (List<t1r>)f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static pin l(final pin pin, List f, String h, z21 i, boolean k, yh5 m, final int n) {
        String g = null;
        String a;
        if ((n & 0x1) != 0x0) {
            a = pin.a;
        }
        else {
            a = null;
        }
        String b;
        if ((n & 0x2) != 0x0) {
            b = pin.b;
        }
        else {
            b = null;
        }
        final boolean b2 = (n & 0x4) != 0x0 && pin.c;
        final boolean b3 = (n & 0x8) != 0x0 && pin.d;
        final boolean b4 = (n & 0x10) != 0x0 && pin.e;
        if ((n & 0x20) != 0x0) {
            f = pin.f;
        }
        if ((n & 0x40) != 0x0) {
            g = pin.g;
        }
        if ((n & 0x80) != 0x0) {
            h = pin.h;
        }
        if ((n & 0x100) != 0x0) {
            i = pin.i;
        }
        final boolean b5 = (n & 0x200) != 0x0 && pin.j;
        if ((n & 0x400) != 0x0) {
            k = pin.k;
        }
        final boolean b6 = (n & 0x800) != 0x0 && pin.l;
        if ((n & 0x1000) != 0x0) {
            m = pin.m;
        }
        Objects.requireNonNull(pin);
        e0e.f((Object)f, "speakerList");
        return new pin(a, b, b2, b3, b4, f, g, h, i, b5, k, b6, m);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pin)) {
            return false;
        }
        final pin pin = (pin)o;
        return e0e.a((Object)this.a, (Object)pin.a) && e0e.a((Object)this.b, (Object)pin.b) && this.c == pin.c && this.d == pin.d && this.e == pin.e && e0e.a((Object)this.f, (Object)pin.f) && e0e.a((Object)this.g, (Object)pin.g) && e0e.a((Object)this.h, (Object)pin.h) && e0e.a((Object)this.i, (Object)pin.i) && this.j == pin.j && this.k == pin.k && this.l == pin.l && e0e.a((Object)this.m, (Object)pin.m);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int c = this.c ? 1 : 0;
        int n = 1;
        int n2 = c;
        if (c != 0) {
            n2 = 1;
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final int o = go9.o((List)this.f, ((((hashCode2 * 31 + hashCode3) * 31 + n2) * 31 + d) * 31 + e) * 31, 31);
        final String g = this.g;
        int hashCode4;
        if (g == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = g.hashCode();
        }
        final String h = this.h;
        int hashCode5;
        if (h == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = h.hashCode();
        }
        final z21 i = this.i;
        int hashCode6;
        if (i == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = i.hashCode();
        }
        int j;
        if ((j = (this.j ? 1 : 0)) != 0) {
            j = 1;
        }
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        final int l = this.l ? 1 : 0;
        if (l == 0) {
            n = l;
        }
        final yh5 m = this.m;
        if (m != null) {
            hashCode = m.hashCode();
        }
        return ((((((o + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + j) * 31 + k) * 31 + n) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final List<t1r> f = this.f;
        final String g = this.g;
        final String h = this.h;
        final z21 i = this.i;
        final boolean j = this.j;
        final boolean k = this.k;
        final boolean l = this.l;
        final yh5 m = this.m;
        final StringBuilder k2 = l58.k("RoomEndScreenViewState(title=", a, ", dateText=", b, ", showMoreSettings=");
        l58.l(k2, c, ", showPlayButton=", d, ", showAnalyticsButton=");
        k2.append(e);
        k2.append(", speakerList=");
        k2.append(f);
        k2.append(", topicsString=");
        jba.s(k2, g, ", listenerText=", h, ", participants=");
        k2.append(i);
        k2.append(", showClippingSettings=");
        k2.append(j);
        k2.append(", isAvailableForClipping=");
        l58.l(k2, k, ", isAvailableForReplay=", l, ", community=");
        k2.append(m);
        k2.append(")");
        return k2.toString();
    }
}
