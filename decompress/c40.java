// 
// Decompiled by Procyon v0.6.0
// 

public final class c40 implements shk
{
    public final int a;
    
    public c40(final int a) {
        this.a = a;
    }
    
    public final int a(final int n) {
        return n;
    }
    
    public final rkb b(final rkb rkb) {
        return rkb;
    }
    
    public final int c(final int n) {
        return n;
    }
    
    public final rlb d(final rlb rlb) {
        zzd.f((Object)rlb, "fontWeight");
        final int a = this.a;
        if (a != 0 && a != Integer.MAX_VALUE) {
            return new rlb(pf8.v(rlb.C0 + a, 1, 1000));
        }
        return rlb;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c40 && this.a == ((c40)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        return y70.y(w48.g("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.a, ')');
    }
}
