// 
// Decompiled by Procyon v0.6.0
// 

public final class i7
{
    public final Long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    
    public i7(final Long a, final boolean b, final boolean c, final boolean d, final boolean e, final boolean f, final boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i7)) {
            return false;
        }
        final i7 i7 = (i7)o;
        return czd.a((Object)this.a, (Object)i7.a) && this.b == i7.b && this.c == i7.c && this.d == i7.d && this.e == i7.e && this.f == i7.f && this.g == i7.g;
    }
    
    @Override
    public final int hashCode() {
        final Long a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int b = this.b ? 1 : 0;
        int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        final int g = this.g ? 1 : 0;
        if (g == 0) {
            n = g;
        }
        return (((((hashCode * 31 + n2) * 31 + c) * 31 + d) * 31 + e) * 31 + f) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final Long a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("AboutModuleConfig(venueId=");
        sb.append(a);
        sb.append(", showDirections=");
        sb.append(b);
        sb.append(", enableDm=");
        jg9.u(sb, c, ", enableSms=", d, ", enableEmail=");
        jg9.u(sb, e, ", enableCall=", f, ", enableLocationMap=");
        return wnj.D(sb, g, ")");
    }
}
