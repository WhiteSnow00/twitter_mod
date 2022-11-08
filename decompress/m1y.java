import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m1y extends uau
{
    public final WeakReference<n1y> C0;
    
    public m1y(final n1y n1y) {
        this.C0 = new WeakReference<n1y>(n1y);
    }
    
    public final void r() {
        final n1y n1y = this.C0.get();
        if (n1y == null) {
            return;
        }
        n1y.s(n1y);
    }
}
