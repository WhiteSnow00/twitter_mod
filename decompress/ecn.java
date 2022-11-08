import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecn implements oax
{
    public final boolean a;
    public final int b;
    public final r57 c;
    public final int d;
    public final g9i e;
    public final boolean f;
    public final boolean g;
    
    public ecn() {
        this(false, 127);
    }
    
    public ecn(final boolean a, final int b, final r57 c, final int d, final g9i e, final boolean f, final boolean g) {
        zzd.f((Object)e, "narrowcastType");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static ecn l(final ecn ecn, int b, r57 c, int d, g9i e, boolean f, boolean g, final int n) {
        final boolean b2 = (n & 0x1) != 0x0 && ecn.a;
        if ((n & 0x2) != 0x0) {
            b = ecn.b;
        }
        if ((n & 0x4) != 0x0) {
            c = ecn.c;
        }
        if ((n & 0x8) != 0x0) {
            d = ecn.d;
        }
        if ((n & 0x10) != 0x0) {
            e = ecn.e;
        }
        if ((n & 0x20) != 0x0) {
            f = ecn.f;
        }
        if ((n & 0x40) != 0x0) {
            g = ecn.g;
        }
        Objects.requireNonNull(ecn);
        zzd.f((Object)e, "narrowcastType");
        return new ecn(b2, b, c, d, e, f, g);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ecn)) {
            return false;
        }
        final ecn ecn = (ecn)o;
        return this.a == ecn.a && this.b == ecn.b && zzd.a((Object)this.c, (Object)ecn.c) && this.d == ecn.d && zzd.a((Object)this.e, (Object)ecn.e) && this.f == ecn.f && this.g == ecn.g;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final int b = this.b;
        final r57 c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final int d = this.d;
        final int hashCode2 = this.e.hashCode();
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        final int g = this.g ? 1 : 0;
        if (g == 0) {
            n = g;
        }
        return ((hashCode2 + (((n2 * 31 + b) * 31 + hashCode) * 31 + d) * 31) * 31 + f) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final int b = this.b;
        final r57 c = this.c;
        final int d = this.d;
        final g9i e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomCreationViewState(isEnabled=");
        sb.append(a);
        sb.append(", privacyControl=");
        sb.append(b);
        sb.append(", scheduledBroadcast=");
        sb.append(c);
        sb.append(", numScheduledSpaces=");
        sb.append(d);
        sb.append(", narrowcastType=");
        sb.append(e);
        sb.append(", hasMultiScheduledSpaces=");
        sb.append(f);
        sb.append(", disableScheduledSpaces=");
        return bd.y(sb, g, ")");
    }
}
