import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdy extends sby
{
    public final /* synthetic */ jfy D0;
    
    public cdy(final jfy d0) {
        this.D0 = d0;
    }
    
    public final void a() {
        final jfy d0 = this.D0;
        if (d0.n != null) {
            d0.b.n("Unbind from service.", new Object[0]);
            final jfy d2 = this.D0;
            d2.a.unbindService((ServiceConnection)d2.m);
            final jfy d3 = this.D0;
            d3.g = false;
            d3.n = null;
            d3.m = null;
        }
        this.D0.d();
    }
}
