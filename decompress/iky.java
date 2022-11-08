import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iky extends mky
{
    public final transient int E0;
    public final transient int F0;
    public final /* synthetic */ mky G0;
    
    public iky(final mky g0, final int e0, final int f0) {
        this.G0 = g0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final int g() {
        return ((sjy)this.G0).i() + this.E0 + this.F0;
    }
    
    public final Object get(final int n) {
        ck1.C(n, this.F0);
        return ((List<Object>)this.G0).get(n + this.E0);
    }
    
    public final int i() {
        return ((sjy)this.G0).i() + this.E0;
    }
    
    public final Object[] j() {
        return ((sjy)this.G0).j();
    }
    
    public final mky l(final int n, final int n2) {
        ck1.F(n, n2, this.F0);
        final mky g0 = this.G0;
        final int e0 = this.E0;
        return g0.l(n + e0, n2 + e0);
    }
    
    public final int size() {
        return this.F0;
    }
}
