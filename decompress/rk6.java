// 
// Decompiled by Procyon v0.6.0
// 

public final class rk6
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    
    public rk6() {
        this(false, false, false, false, null, 63);
    }
    
    public rk6(boolean a, boolean b, boolean c, boolean d, String e, final int n) {
        final boolean b2 = false;
        if ((n & 0x1) != 0x0) {
            a = false;
        }
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        if ((n & 0x4) != 0x0) {
            c = false;
        }
        if ((n & 0x8) != 0x0) {
            d = false;
        }
        if ((n & 0x10) != 0x0) {
            e = "";
        }
        boolean f = b2;
        Label_0089: {
            if ((n & 0x20) != 0x0) {
                if (!d && !c && !b) {
                    f = b2;
                    if (!a) {
                        break Label_0089;
                    }
                }
                f = true;
            }
        }
        zzd.f((Object)e, "displayPhoneNumber");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rk6)) {
            return false;
        }
        final rk6 rk6 = (rk6)o;
        return this.a == rk6.a && this.b == rk6.b && this.c == rk6.c && this.d == rk6.d && zzd.a((Object)this.e, (Object)rk6.e) && this.f == rk6.f;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        final int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        final int a2 = l7k.a(this.e, (((n2 * 31 + b) * 31 + c) * 31 + d) * 31, 31);
        int f = this.f ? 1 : 0;
        if (f != 0) {
            f = n;
        }
        return a2 + f;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final String e = this.e;
        final boolean f = this.f;
        final StringBuilder k = hi.K("ContactOptionsConfig(enableEmail=", a, ", enableSms=", b, ", enableDm=");
        lo0.z(k, c, ", enableCall=", d, ", displayPhoneNumber=");
        k.append(e);
        k.append(", hasAtLeastOneContactOption=");
        k.append(f);
        k.append(")");
        return k.toString();
    }
}
