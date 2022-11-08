import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfy extends jey
{
    public final transient int E0;
    public final transient int F0;
    public final /* synthetic */ jey G0;
    
    public kfy(final jey g0, final int e0, final int f0) {
        this.G0 = g0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final Object get(final int n) {
        tdy.b1(n, this.F0);
        return this.G0.get(n + this.E0);
    }
    
    public final Object[] i() {
        return this.G0.i();
    }
    
    public final int j() {
        return this.G0.j() + this.E0;
    }
    
    public final int l() {
        return this.G0.j() + this.E0 + this.F0;
    }
    
    @Override
    public final jey m(final int n, final int n2) {
        tdy.d1(n, n2, this.F0);
        final jey g0 = this.G0;
        final int e0 = this.E0;
        return (jey)g0.subList(n + e0, n2 + e0);
    }
    
    public final int size() {
        return this.F0;
    }
}
