import java.util.WeakHashMap;
import java.util.Objects;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lj0 implements ihj
{
    public final AppBarLayout F0;
    
    public lj0(final AppBarLayout f0) {
        this.F0 = f0;
    }
    
    public final fqx a(final View view, final fqx fqx) {
        final AppBarLayout f0 = this.F0;
        Objects.requireNonNull(f0);
        final WeakHashMap a = b7x.a;
        fqx l0;
        if (b7x$d.b((View)f0)) {
            l0 = fqx;
        }
        else {
            l0 = null;
        }
        if (!s5j.a((Object)f0.L0, (Object)l0)) {
            f0.L0 = l0;
            int n;
            if (f0.W0 != null && f0.getTopInset() > 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            ((View)f0).setWillNotDraw((boolean)((n ^ 0x1) != 0x0));
            ((View)f0).requestLayout();
        }
        return fqx;
    }
}
