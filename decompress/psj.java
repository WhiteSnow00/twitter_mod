// 
// Decompiled by Procyon v0.6.0
// 

public final class psj implements osj
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    public psj(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final float a() {
        return this.d;
    }
    
    public final float b(final cwe cwe) {
        e0e.f((Object)cwe, "layoutDirection");
        float n;
        if (cwe == cwe.F0) {
            n = this.a;
        }
        else {
            n = this.c;
        }
        return n;
    }
    
    public final float c(final cwe cwe) {
        e0e.f((Object)cwe, "layoutDirection");
        float n;
        if (cwe == cwe.F0) {
            n = this.c;
        }
        else {
            n = this.a;
        }
        return n;
    }
    
    public final float d() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof psj;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final float a = this.a;
        final psj psj = (psj)o;
        boolean b3 = b2;
        if (s99.b(a, psj.a)) {
            b3 = b2;
            if (s99.b(this.b, psj.b)) {
                b3 = b2;
                if (s99.b(this.c, psj.c)) {
                    b3 = b2;
                    if (s99.b(this.d, psj.d)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + dn.g(this.c, dn.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("PaddingValues(start=");
        f.append((Object)s99.e(this.a));
        f.append(", top=");
        f.append((Object)s99.e(this.b));
        f.append(", end=");
        f.append((Object)s99.e(this.c));
        f.append(", bottom=");
        f.append((Object)s99.e(this.d));
        f.append(')');
        return f.toString();
    }
}
