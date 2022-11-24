// 
// Decompiled by Procyon v0.6.0
// 

public final class n5r<T> implements w0b<T>
{
    public final float a;
    public final float b;
    public final T c;
    
    public n5r() {
        this(null, 7);
    }
    
    public n5r(final float a, final float b, final T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public n5r(Object o, final int n) {
        float n2 = 0.0f;
        float n3;
        if ((n & 0x1) != 0x0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        if ((n & 0x2) != 0x0) {
            n2 = 1500.0f;
        }
        if ((n & 0x4) != 0x0) {
            o = null;
        }
        this(n3, n2, o);
    }
    
    public final qqw a(final liv liv) {
        e0e.f((Object)liv, "converter");
        final float a = this.a;
        final float b = this.b;
        final T c = this.c;
        lc0 lc0;
        if (c == null) {
            lc0 = null;
        }
        else {
            lc0 = (lc0)liv.a().invoke((Object)c);
        }
        return (qqw)new arw(a, b, lc0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof n5r;
        boolean b2 = true;
        if (b) {
            final n5r n5r = (n5r)o;
            if (n5r.a == this.a && n5r.b == this.b && e0e.a((Object)n5r.c, (Object)this.c)) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final T c = this.c;
        int hashCode;
        if (c != null) {
            hashCode = c.hashCode();
        }
        else {
            hashCode = 0;
        }
        return Float.floatToIntBits(this.b) + dn.g(this.a, hashCode * 31, 31);
    }
}
