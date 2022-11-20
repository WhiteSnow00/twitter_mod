// 
// Decompiled by Procyon v0.6.0
// 

public final class viz extends uey
{
    public final glz e;
    
    public viz(final glz e, final wbz wbz) {
        this.e = e;
        super(wbz);
    }
    
    @Override
    public final void b() {
        final glz e = this.e;
        ((axy)e).g();
        if (!e.n()) {
            return;
        }
        ((pbz)e).D0.b().Q0.a("Inactivity, disconnecting from the service");
        e.z();
    }
}
