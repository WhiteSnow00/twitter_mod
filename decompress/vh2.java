// 
// Decompiled by Procyon v0.6.0
// 

public final class vh2 extends w2v
{
    public final String f;
    public final cwf g;
    public final hp6 h;
    public final long i;
    public final boolean j;
    
    public vh2(final String f, final cwf g, final long i, final boolean j) {
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = j;
        this.h = null;
    }
    
    public vh2(final String f, final cwf g, final long i, final boolean j, final hp6 h) {
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = j;
        this.h = h;
    }
    
    @Override
    public final cn d() {
        return (cn)new th2(this.f, this.g.c(), this.j, this.h, this.i);
    }
}
