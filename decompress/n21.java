import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n21 implements jbx
{
    public final rof a;
    public final boolean b;
    public final deq c;
    public final boolean d;
    public final boolean e;
    
    public n21() {
        this(null, false, null, false, false, 31, null);
    }
    
    public n21(final rof a, final boolean b, final deq c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public n21(final rof rof, final boolean b, final deq deq, final boolean b2, final boolean b3, final int n, final rf8 rf8) {
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = false;
        this.e = false;
    }
    
    public static n21 l(final n21 n21, rof a, boolean b, deq c, boolean d, boolean e, final int n22) {
        if ((n22 & 0x1) != 0x0) {
            a = n21.a;
        }
        if ((n22 & 0x2) != 0x0) {
            b = n21.b;
        }
        if ((n22 & 0x4) != 0x0) {
            c = n21.c;
        }
        if ((n22 & 0x8) != 0x0) {
            d = n21.d;
        }
        if ((n22 & 0x10) != 0x0) {
            e = n21.e;
        }
        Objects.requireNonNull(n21);
        return new n21(a, b, c, d, e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n21)) {
            return false;
        }
        final n21 n21 = (n21)o;
        return czd.a((Object)this.a, (Object)n21.a) && this.b == n21.b && czd.a((Object)this.c, (Object)n21.c) && this.d == n21.d && this.e == n21.e;
    }
    
    @Override
    public final int hashCode() {
        final rof a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final int b = this.b ? 1 : 0;
        int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        final deq c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        final int e = this.e ? 1 : 0;
        if (e == 0) {
            n = e;
        }
        return (((hashCode2 * 31 + n2) * 31 + hashCode) * 31 + d) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final rof a = this.a;
        final boolean b = this.b;
        final deq c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioSpaceHeroViewState(audioSpace=");
        sb.append(a);
        sb.append(", isSelected=");
        sb.append(b);
        sb.append(", slate=");
        sb.append(c);
        sb.append(", collapsed=");
        sb.append(d);
        sb.append(", attached=");
        return wnj.D(sb, e, ")");
    }
}
