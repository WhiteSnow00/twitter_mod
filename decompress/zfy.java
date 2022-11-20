import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfy extends yey
{
    public final transient int F0;
    public final transient int G0;
    public final yey H0;
    
    public zfy(final yey h0, final int f0, final int g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object get(final int n) {
        g63.g0(n, this.G0);
        return ((List<Object>)this.H0).get(n + this.F0);
    }
    
    public final Object[] i() {
        return ((qfy)this.H0).i();
    }
    
    public final int j() {
        return ((qfy)this.H0).j() + this.F0;
    }
    
    public final int l() {
        return ((qfy)this.H0).j() + this.F0 + this.G0;
    }
    
    public final yey m(final int n, final int n2) {
        g63.i0(n, n2, this.G0);
        final yey h0 = this.H0;
        final int f0 = this.F0;
        return (yey)h0.subList(n + f0, n2 + f0);
    }
    
    public final int size() {
        return this.G0;
    }
    
    public final List subList(final int n, final int n2) {
        return (List)this.m(n, n2);
    }
}
