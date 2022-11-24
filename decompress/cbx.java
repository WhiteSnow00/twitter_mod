import android.view.ViewGroup;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbx implements ihj
{
    public final Rect F0;
    public final ViewPager G0;
    
    public cbx(final ViewPager g0) {
        this.G0 = g0;
        this.F0 = new Rect();
    }
    
    public final fqx a(final View view, fqx f) {
        final fqx t = b7x.t(view, f);
        if (t.k()) {
            return t;
        }
        final Rect f2 = this.F0;
        f2.left = t.g();
        f2.top = t.i();
        f2.right = t.h();
        f2.bottom = t.f();
        for (int i = 0; i < ((ViewGroup)this.G0).getChildCount(); ++i) {
            f = b7x.f(((ViewGroup)this.G0).getChildAt(i), t);
            f2.left = Math.min(f.g(), f2.left);
            f2.top = Math.min(f.i(), f2.top);
            f2.right = Math.min(f.h(), f2.right);
            f2.bottom = Math.min(f.f(), f2.bottom);
        }
        return t.l(f2.left, f2.top, f2.right, f2.bottom);
    }
}
