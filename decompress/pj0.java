import java.util.WeakHashMap;
import java.util.Objects;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pj0 implements ogj
{
    public final /* synthetic */ AppBarLayout C0;
    
    public pj0(final AppBarLayout c0) {
        this.C0 = c0;
    }
    
    public final vox a(final View view, final vox vox) {
        final AppBarLayout c0 = this.C0;
        Objects.requireNonNull(c0);
        final WeakHashMap a = p5x.a;
        vox i0;
        if (p5x$d.b((View)c0)) {
            i0 = vox;
        }
        else {
            i0 = null;
        }
        if (!a5j.a((Object)c0.I0, (Object)i0)) {
            c0.I0 = i0;
            int n;
            if (c0.T0 != null && c0.getTopInset() > 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            ((View)c0).setWillNotDraw((boolean)((n ^ 0x1) != 0x0));
            ((View)c0).requestLayout();
        }
        return vox;
    }
}
