// 
// Decompiled by Procyon v0.6.0
// 

public final class lh2 extends p1v
{
    public final String f;
    public final wvf g;
    public final vo6 h;
    public final long i;
    public final boolean j;
    
    public lh2(final String f, final wvf g, final long i, final boolean j) {
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = j;
        this.h = null;
    }
    
    public lh2(final String f, final wvf g, final long i, final boolean j, final vo6 h) {
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = j;
        this.h = h;
    }
    
    @Override
    public final zm d() {
        return (zm)new jh2(this.f, this.g.c(), this.j, this.h, this.i);
    }
}
