// 
// Decompiled by Procyon v0.6.0
// 

public final class mrk
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final kap d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    
    public mrk() {
        this(false, true, true, kap.C0, true, true, false);
    }
    
    public mrk(boolean b, boolean b2, final int n) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        final boolean b3 = (n & 0x2) != 0x0;
        final boolean b4 = (n & 0x4) != 0x0;
        kap c0;
        if ((n & 0x8) != 0x0) {
            c0 = kap.C0;
        }
        else {
            c0 = null;
        }
        if ((n & 0x10) != 0x0) {
            b2 = true;
        }
        final boolean b5 = (n & 0x20) != 0x0;
        zzd.f((Object)c0, "securePolicy");
        this(b, b3, b4, c0, b2, b5, false);
    }
    
    public mrk(final boolean a, final boolean b, final boolean c, final kap d, final boolean e, final boolean f, final boolean g) {
        zzd.f((Object)d, "securePolicy");
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
        if (!(o instanceof mrk)) {
            return false;
        }
        final boolean a = this.a;
        final mrk mrk = (mrk)o;
        return a == mrk.a && this.b == mrk.b && this.c == mrk.c && this.d == mrk.d && this.e == mrk.e && this.f == mrk.f && this.g == mrk.g;
    }
    
    @Override
    public final int hashCode() {
        final boolean b = this.b;
        int n = 1231;
        int n2;
        if (b) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        int n3;
        if (this.a) {
            n3 = 1231;
        }
        else {
            n3 = 1237;
        }
        int n4;
        if (b) {
            n4 = 1231;
        }
        else {
            n4 = 1237;
        }
        int n5;
        if (this.c) {
            n5 = 1231;
        }
        else {
            n5 = 1237;
        }
        final int hashCode = this.d.hashCode();
        int n6;
        if (this.e) {
            n6 = 1231;
        }
        else {
            n6 = 1237;
        }
        int n7;
        if (this.f) {
            n7 = 1231;
        }
        else {
            n7 = 1237;
        }
        if (!this.g) {
            n = 1237;
        }
        return (((hashCode + (((n2 * 31 + n3) * 31 + n4) * 31 + n5) * 31) * 31 + n6) * 31 + n7) * 31 + n;
    }
}
