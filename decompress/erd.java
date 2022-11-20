// 
// Decompiled by Procyon v0.6.0
// 

public final class erd implements drd
{
    public final qsb<crd, Boolean> a;
    public final hwj b;
    
    public erd(final int n, final qsb a, final rf8 rf8) {
        this.a = (qsb<crd, Boolean>)a;
        this.b = (hwj)blz.Q(new crd(n));
    }
    
    @Override
    public final int a() {
        return ((crd)this.b.getValue()).a;
    }
}
