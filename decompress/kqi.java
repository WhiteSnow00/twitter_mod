// 
// Decompiled by Procyon v0.6.0
// 

public final class kqi
{
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final nqi g;
    
    public kqi(final String a, final String b, final int c, final String d, final boolean e, final boolean f, final nqi g) {
        e0e.f((Object)a, "id");
        e0e.f((Object)b, "name");
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
        if (!(o instanceof kqi)) {
            return false;
        }
        final kqi kqi = (kqi)o;
        return e0e.a((Object)this.a, (Object)kqi.a) && e0e.a((Object)this.b, (Object)kqi.b) && this.c == kqi.c && e0e.a((Object)this.d, (Object)kqi.d) && this.e == kqi.e && this.f == kqi.f && this.g == kqi.g;
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.b, this.a.hashCode() * 31, 31);
        final int c = this.c;
        final String d2 = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d2 == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d2.hashCode();
        }
        final int e = this.e ? 1 : 0;
        int n = 1;
        int n2 = e;
        if (e != 0) {
            n2 = 1;
        }
        final int f = this.f ? 1 : 0;
        if (f == 0) {
            n = f;
        }
        final nqi g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((d + c) * 31 + hashCode2) * 31 + n2) * 31 + n) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final String d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final nqi g = this.g;
        final StringBuilder k = l58.k("NotificationChannel(id=", a, ", name=", b, ", importance=");
        bj.A(k, c, ", description=", d, ", lights=");
        l58.l(k, e, ", vibrate=", f, ", sound=");
        k.append(g);
        k.append(")");
        return k.toString();
    }
}
