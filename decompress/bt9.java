import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bt9 implements jbx
{
    public final String a;
    public final boolean b;
    
    public bt9() {
        this(null, false, 3, null);
    }
    
    public bt9(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public bt9(final String s, final boolean b, final int n, final rf8 rf8) {
        this.a = "";
        this.b = false;
    }
    
    public static bt9 l(final bt9 bt9, String a, boolean b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = bt9.a;
        }
        if ((n & 0x2) != 0x0) {
            b = bt9.b;
        }
        Objects.requireNonNull(bt9);
        czd.f((Object)a, "pronouns");
        return new bt9(a, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bt9)) {
            return false;
        }
        final bt9 bt9 = (bt9)o;
        return czd.a((Object)this.a, (Object)bt9.a) && this.b == bt9.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        return neg.h("EditPronounsViewState(pronouns=", this.a, ", showPronounsSpeedBump=", this.b, ")");
    }
}
