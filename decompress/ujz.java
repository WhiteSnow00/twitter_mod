// 
// Decompiled by Procyon v0.6.0
// 

public final class ujz extends pfy
{
    public final fmz e;
    
    public ujz(final fmz e, final vcz vcz) {
        this.e = e;
        super(vcz);
    }
    
    @Override
    public final void b() {
        final fmz e = this.e;
        ((wxy)e).g();
        if (!e.n()) {
            return;
        }
        ((ocz)e).F0.b().S0.a("Inactivity, disconnecting from the service");
        e.z();
    }
}
