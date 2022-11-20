// 
// Decompiled by Procyon v0.6.0
// 

public final class c6m
{
    public static final a Companion;
    public static final c6m e;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    static {
        Companion = new a();
        e = new c6m(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public c6m(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a(final long n) {
        return wfj.d(n) >= this.a && wfj.d(n) < this.c && wfj.e(n) >= this.b && wfj.e(n) < this.d;
    }
    
    public final long b() {
        final float a = this.a;
        final float n = (this.c - a) / 2.0f;
        final float b = this.b;
        return wj1.a(n + a, (this.d - b) / 2.0f + b);
    }
    
    public final long c() {
        return oj7.d(this.c - this.a, this.d - this.b);
    }
    
    public final long d() {
        return wj1.a(this.a, this.b);
    }
    
    public final boolean e(final c6m c6m) {
        czd.f((Object)c6m, "other");
        if (this.c > c6m.a) {
            if (c6m.c > this.a) {
                if (this.d > c6m.b) {
                    if (c6m.d > this.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c6m)) {
            return false;
        }
        final c6m c6m = (c6m)o;
        return czd.a((Object)this.a, (Object)c6m.a) && czd.a((Object)this.b, (Object)c6m.b) && czd.a((Object)this.c, (Object)c6m.c) && czd.a((Object)this.d, (Object)c6m.d);
    }
    
    public final c6m f(final float n, final float n2) {
        return new c6m(this.a + n, this.b + n2, this.c + n, this.d + n2);
    }
    
    public final c6m g(final long n) {
        return new c6m(wfj.d(n) + this.a, wfj.e(n) + this.b, wfj.d(n) + this.c, wfj.e(n) + this.d);
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + c0.g(this.c, c0.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Rect.fromLTRB(");
        j.append(max.H(this.a));
        j.append(", ");
        j.append(max.H(this.b));
        j.append(", ");
        j.append(max.H(this.c));
        j.append(", ");
        j.append(max.H(this.d));
        j.append(')');
        return j.toString();
    }
    
    public static final class a
    {
    }
}
