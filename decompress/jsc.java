// 
// Decompiled by Procyon v0.6.0
// 

public final class jsc implements fga
{
    public wdi F0;
    public final gw0 G0;
    
    public jsc(final gw0 g0) {
        this.G0 = g0;
    }
    
    public final void a(final asc asc) {
        synchronized ("HttpOperationNARCLogger") {
            vmw.g((Object)this.F0);
            this.F0.c();
        }
    }
    
    public final void b(final asc asc, final Exception ex) {
    }
    
    public final void c(final asc asc) {
    }
    
    public final void d(final asc asc) {
        synchronized ("HttpOperationNARCLogger") {
            j0i.b((bd)(this.F0 = new wdi(asc, this.G0)));
        }
    }
}
