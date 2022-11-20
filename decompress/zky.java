import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zky extends dly
{
    public final transient int F0;
    public final transient int G0;
    public final dly H0;
    
    public zky(final dly h0, final int f0, final int g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final int g() {
        return ((jky)this.H0).i() + this.F0 + this.G0;
    }
    
    public final Object get(final int n) {
        gmw.c0(n, this.G0);
        return ((List<Object>)this.H0).get(n + this.F0);
    }
    
    public final int i() {
        return ((jky)this.H0).i() + this.F0;
    }
    
    public final Object[] j() {
        return ((jky)this.H0).j();
    }
    
    public final dly l(final int n, final int n2) {
        gmw.e0(n, n2, this.G0);
        final dly h0 = this.H0;
        final int f0 = this.F0;
        return h0.l(n + f0, n2 + f0);
    }
    
    public final int size() {
        return this.G0;
    }
    
    public final /* bridge */ List subList(final int n, final int n2) {
        return (List)this.l(n, n2);
    }
}
