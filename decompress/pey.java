import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pey extends xey
{
    public final transient int H0;
    public final transient int I0;
    public final xey J0;
    
    public pey(final xey j0, final int h0, final int i0) {
        this.J0 = j0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final int g() {
        return this.J0.i() + this.H0 + this.I0;
    }
    
    public final Object get(final int n) {
        bs4.x0(n, this.I0);
        return this.J0.get(n + this.H0);
    }
    
    public final int i() {
        return this.J0.i() + this.H0;
    }
    
    public final Object[] j() {
        return this.J0.j();
    }
    
    @Override
    public final xey k(final int n, final int n2) {
        bs4.B0(n, n2, this.I0);
        final xey j0 = this.J0;
        final int h0 = this.H0;
        return j0.k(n + h0, n2 + h0);
    }
    
    public final int size() {
        return this.I0;
    }
    
    public final /* bridge */ List subList(final int n, final int n2) {
        return this.k(n, n2);
    }
}
