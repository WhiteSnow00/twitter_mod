// 
// Decompiled by Procyon v0.6.0
// 

public final class yfj extends rp9
{
    public final rp9 W0;
    public final float X0;
    
    public yfj(final rp9 w0, final float x0) {
        this.W0 = w0;
        this.X0 = x0;
    }
    
    @Override
    public final boolean N() {
        return this.W0.N();
    }
    
    @Override
    public final void V(final float n, final float n2, final float n3, final rrp rrp) {
        this.W0.V(n, n2 - this.X0, n3, rrp);
    }
}
