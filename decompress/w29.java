// 
// Decompiled by Procyon v0.6.0
// 

public final class w29
{
    public static final b Companion;
    public static final w29 f;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    
    static {
        Companion = new b();
        f = new w29(false, false, false, 0, 0);
    }
    
    public w29(final boolean a, final boolean b, final boolean c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w29)) {
            return false;
        }
        final w29 w29 = (w29)o;
        return this.a == w29.a && this.b == w29.b && this.c == w29.c && this.d == w29.d && this.e == w29.e;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final int c = this.c ? 1 : 0;
        if (c == 0) {
            n = c;
        }
        return (((n2 * 31 + b) * 31 + n) * 31 + this.d) * 31 + this.e;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final int d = this.d;
        final int e = this.e;
        final StringBuilder p = a88.p("DisplayOptions(hideBorder=", a, ", hideBottomPadding=", b, ", shouldAutoAdvance=");
        p.append(c);
        p.append(", edgeInset=");
        p.append(d);
        p.append(", componentSpacing=");
        return ad.y(p, e, ")");
    }
    
    public static final class b
    {
    }
}
