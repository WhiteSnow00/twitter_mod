// 
// Decompiled by Procyon v0.6.0
// 

public final class vrj implements urj
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    public vrj(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final float a() {
        return this.d;
    }
    
    public final float b(final tve tve) {
        zzd.f((Object)tve, "layoutDirection");
        float n;
        if (tve == tve.C0) {
            n = this.a;
        }
        else {
            n = this.c;
        }
        return n;
    }
    
    public final float c(final tve tve) {
        zzd.f((Object)tve, "layoutDirection");
        float n;
        if (tve == tve.C0) {
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
        final boolean b = o instanceof vrj;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final float a = this.a;
        final vrj vrj = (vrj)o;
        boolean b3 = b2;
        if (e99.b(a, vrj.a)) {
            b3 = b2;
            if (e99.b(this.b, vrj.b)) {
                b3 = b2;
                if (e99.b(this.c, vrj.c)) {
                    b3 = b2;
                    if (e99.b(this.d, vrj.d)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + c0.h(this.c, c0.h(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("PaddingValues(start=");
        g.append((Object)e99.e(this.a));
        g.append(", top=");
        g.append((Object)e99.e(this.b));
        g.append(", end=");
        g.append((Object)e99.e(this.c));
        g.append(", bottom=");
        g.append((Object)e99.e(this.d));
        g.append(')');
        return g.toString();
    }
}
