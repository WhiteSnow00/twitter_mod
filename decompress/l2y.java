import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l2y extends w3y
{
    public final WeakReference<o2y> a;
    
    public l2y(final o2y o2y) {
        this.a = new WeakReference<o2y>(o2y);
    }
    
    public final void K0(final n5y n5y) {
        final o2y o2y = this.a.get();
        if (o2y == null) {
            return;
        }
        o2y.a.k((z2y)new k2y((y2y)o2y, o2y, n5y));
    }
}
