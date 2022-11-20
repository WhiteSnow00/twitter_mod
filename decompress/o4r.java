// 
// Decompiled by Procyon v0.6.0
// 

public final class o4r<T> implements uza<T>
{
    public final float a;
    public final float b;
    public final T c;
    
    public o4r() {
        this(null, 7);
    }
    
    public o4r(final float a, final float b, final T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public o4r(Object o, final int n) {
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
    
    public final bqw a(final zhv zhv) {
        czd.f((Object)zhv, "converter");
        final float a = this.a;
        final float b = this.b;
        final T c = this.c;
        kc0 kc0;
        if (c == null) {
            kc0 = null;
        }
        else {
            kc0 = (kc0)zhv.a().invoke((Object)c);
        }
        return (bqw)new kqw(a, b, kc0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof o4r;
        boolean b2 = true;
        if (b) {
            final o4r o4r = (o4r)o;
            if (o4r.a == this.a && o4r.b == this.b && czd.a((Object)o4r.c, (Object)this.c)) {
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
        return Float.floatToIntBits(this.b) + c0.g(this.a, hashCode * 31, 31);
    }
}
