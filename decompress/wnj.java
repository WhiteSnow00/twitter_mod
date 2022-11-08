// 
// Decompiled by Procyon v0.6.0
// 

public final class wnj<T> implements rll<T>, jl8<T>
{
    public a<T> a;
    public volatile rll<T> b;
    
    public wnj(final a<T> a, final rll<T> b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final a<T> a) {
        final rll<T> b = this.b;
        final vnj a2 = vnj.a;
        if (b != a2) {
            a.u(b);
            return;
        }
        rll<T> rll = null;
        synchronized (this) {
            final rll<T> b2 = this.b;
            if (b2 != a2) {
                rll = b2;
            }
            else {
                this.a = new zga(this.a, a, 2);
            }
            monitorexit(this);
            if (rll != null) {
                a.u(b2);
            }
        }
    }
    
    public final T get() {
        return (T)this.b.get();
    }
}
