import java.util.WeakHashMap;
import android.view.View$OnAttachStateChangeListener;
import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vpx implements y19
{
    public final xpx a;
    public final View b;
    
    public vpx(final xpx a, final View b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final xpx a = this.a;
        final View b = this.b;
        Objects.requireNonNull(a);
        czd.f((Object)b, "view");
        final int t = a.t - 1;
        a.t = t;
        if (t == 0) {
            final WeakHashMap a2 = j6x.a;
            j6x$i.u(b, (ugj)null);
            j6x.E(b, (npx$b)null);
            b.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)a.u);
        }
    }
}
