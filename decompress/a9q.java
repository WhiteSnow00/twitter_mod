// 
// Decompiled by Procyon v0.6.0
// 

public final class a9q extends tsr
{
    public final /* synthetic */ b9q G0;
    
    public a9q(final b9q g0) {
        this.G0 = g0;
    }
    
    public final void q() {
        final b9q g0 = this.G0;
        synchronized (((v7q)g0).b) {
            this.r();
            ((v7q)g0).f[((v7q)g0).h++] = (pc8)this;
            ((v7q)g0).g();
        }
    }
}
