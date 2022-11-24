// 
// Decompiled by Procyon v0.6.0
// 

public final class z30 implements nik
{
    public final int a;
    
    public z30(final int a) {
        this.a = a;
    }
    
    public final int a(final int n) {
        return n;
    }
    
    public final qkb b(final qkb qkb) {
        return qkb;
    }
    
    public final int c(final int n) {
        return n;
    }
    
    public final qlb d(final qlb qlb) {
        e0e.f((Object)qlb, "fontWeight");
        final int a = this.a;
        if (a != 0 && a != Integer.MAX_VALUE) {
            return new qlb(jb2.F(qlb.F0 + a, 1, 1000));
        }
        return qlb;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof z30 && this.a == ((z30)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        return gwl.x(ehk.f("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.a, ')');
    }
}
