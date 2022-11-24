import android.graphics.Insets;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsd
{
    public static final lsd e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        e = new lsd(0, 0, 0, 0);
    }
    
    public lsd(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static lsd a(final lsd lsd, final lsd lsd2) {
        return b(Math.max(lsd.a, lsd2.a), Math.max(lsd.b, lsd2.b), Math.max(lsd.c, lsd2.c), Math.max(lsd.d, lsd2.d));
    }
    
    public static lsd b(final int n, final int n2, final int n3, final int n4) {
        if (n == 0 && n2 == 0 && n3 == 0 && n4 == 0) {
            return lsd.e;
        }
        return new lsd(n, n2, n3, n4);
    }
    
    public static lsd c(final Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    public static lsd d(final Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }
    
    public final Insets e() {
        return lsd.a.a(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && lsd.class == o.getClass()) {
            final lsd lsd = (lsd)o;
            return this.d == lsd.d && this.a == lsd.a && this.c == lsd.c && this.b == lsd.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("Insets{left=");
        f.append(this.a);
        f.append(", top=");
        f.append(this.b);
        f.append(", right=");
        f.append(this.c);
        f.append(", bottom=");
        return gwl.x(f, this.d, '}');
    }
    
    public static final class a
    {
        public static Insets a(final int n, final int n2, final int n3, final int n4) {
            return Insets.of(n, n2, n3, n4);
        }
    }
}
