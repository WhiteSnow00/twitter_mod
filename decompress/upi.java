// 
// Decompiled by Procyon v0.6.0
// 

public final class upi
{
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final xpi g;
    
    public upi(final String a, final String b, final int c, final String d, final boolean e, final boolean f, final xpi g) {
        czd.f((Object)a, "id");
        czd.f((Object)b, "name");
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
        if (!(o instanceof upi)) {
            return false;
        }
        final upi upi = (upi)o;
        return czd.a((Object)this.a, (Object)upi.a) && czd.a((Object)this.b, (Object)upi.b) && this.c == upi.c && czd.a((Object)this.d, (Object)upi.d) && this.e == upi.e && this.f == upi.f && this.g == upi.g;
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
        final int c = this.c;
        final String d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final int e = this.e ? 1 : 0;
        int n = 1;
        int n2 = e;
        if (e != 0) {
            n2 = 1;
        }
        final int f2 = this.f ? 1 : 0;
        if (f2 == 0) {
            n = f2;
        }
        final xpi g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((f + c) * 31 + hashCode2) * 31 + n2) * 31 + n) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final String d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final xpi g = this.g;
        final StringBuilder q = tqf.q("NotificationChannel(id=", a, ", name=", b, ", importance=");
        i81.x(q, c, ", description=", d, ", lights=");
        jg9.u(q, e, ", vibrate=", f, ", sound=");
        q.append(g);
        q.append(")");
        return q.toString();
    }
}
