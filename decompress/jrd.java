import android.graphics.Insets;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrd
{
    public static final jrd e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        e = new jrd(0, 0, 0, 0);
    }
    
    public jrd(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static jrd a(final jrd jrd, final jrd jrd2) {
        return b(Math.max(jrd.a, jrd2.a), Math.max(jrd.b, jrd2.b), Math.max(jrd.c, jrd2.c), Math.max(jrd.d, jrd2.d));
    }
    
    public static jrd b(final int n, final int n2, final int n3, final int n4) {
        if (n == 0 && n2 == 0 && n3 == 0 && n4 == 0) {
            return jrd.e;
        }
        return new jrd(n, n2, n3, n4);
    }
    
    public static jrd c(final Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    public static jrd d(final Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }
    
    public final Insets e() {
        return jrd.a.a(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && jrd.class == o.getClass()) {
            final jrd jrd = (jrd)o;
            return this.d == jrd.d && this.a == jrd.a && this.c == jrd.c && this.b == jrd.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Insets{left=");
        j.append(this.a);
        j.append(", top=");
        j.append(this.b);
        j.append(", right=");
        j.append(this.c);
        j.append(", bottom=");
        return x70.C(j, this.d, '}');
    }
    
    public static final class a
    {
        public static Insets a(final int n, final int n2, final int n3, final int n4) {
            return Insets.of(n, n2, n3, n4);
        }
    }
}
