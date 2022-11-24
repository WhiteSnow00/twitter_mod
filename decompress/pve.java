import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pve implements ddm
{
    public final hub<iz6, mp6<? super vzv>, Object> F0;
    public final yo6 G0;
    public a7r H0;
    
    public pve(final yy6 yy6, final hub<? super iz6, ? super mp6<? super vzv>, ?> f0) {
        e0e.f((Object)yy6, "parentCoroutineContext");
        e0e.f((Object)f0, "task");
        this.F0 = (hub<iz6, mp6<? super vzv>, Object>)f0;
        this.G0 = (yo6)r1n.e(yy6);
    }
    
    public final void a() {
        final a7r h0 = this.H0;
        if (h0 != null) {
            ((qae)h0).a(iuk.b("Old job was still running!", (Throwable)null));
        }
        this.H0 = (a7r)ma7.D((iz6)this.G0, (yy6)null, 0, (hub)this.F0, 3);
    }
    
    public final void c() {
        final a7r h0 = this.H0;
        if (h0 != null) {
            ((qae)h0).a((CancellationException)null);
        }
        this.H0 = null;
    }
    
    public final void d() {
        final a7r h0 = this.H0;
        if (h0 != null) {
            ((qae)h0).a((CancellationException)null);
        }
        this.H0 = null;
    }
}
