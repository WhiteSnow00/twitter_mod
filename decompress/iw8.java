// 
// Decompiled by Procyon v0.6.0
// 

public final class iw8
{
    public final boolean a;
    public final boolean b;
    public final bbp c;
    public final boolean d;
    public final boolean e;
    
    public iw8() {
        final bbp d0 = bbp.D0;
        this.a = true;
        this.b = true;
        this.c = d0;
        this.d = true;
        this.e = true;
    }
    
    public iw8(boolean a, final int n) {
        if ((n & 0x1) != 0x0) {
            a = true;
        }
        final boolean b = (n & 0x2) != 0x0;
        bbp d0;
        if ((n & 0x4) != 0x0) {
            d0 = bbp.D0;
        }
        else {
            d0 = null;
        }
        czd.f((Object)d0, "securePolicy");
        this.a = a;
        this.b = b;
        this.c = d0;
        this.d = true;
        this.e = true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof iw8)) {
            return false;
        }
        final boolean a = this.a;
        final iw8 iw8 = (iw8)o;
        return a == iw8.a && this.b == iw8.b && this.c == iw8.c && this.d == iw8.d && this.e == iw8.e;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1231;
        int n2;
        if (a) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        int n3;
        if (this.b) {
            n3 = 1231;
        }
        else {
            n3 = 1237;
        }
        final int hashCode = this.c.hashCode();
        int n4;
        if (this.d) {
            n4 = 1231;
        }
        else {
            n4 = 1237;
        }
        if (!this.e) {
            n = 1237;
        }
        return ((hashCode + (n2 * 31 + n3) * 31) * 31 + n4) * 31 + n;
    }
}
