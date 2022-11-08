import android.view.View;
import android.graphics.drawable.Animatable;
import android.view.ViewGroup$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vsx implements fq6<i7d>
{
    public final m0c a;
    
    public vsx(final m0c a) {
        this.a = a;
        final ViewGroup$LayoutParams layoutParams = ((View)a).getLayoutParams();
        layoutParams.height = -2;
        ((View)a).setLayoutParams(layoutParams);
    }
    
    public final void b(final String s, final Throwable t) {
    }
    
    public final void c(final String s) {
    }
    
    public final void d(final String s, final Object o, final Animatable animatable) {
        final i7d i7d = (i7d)o;
        if (i7d != null) {
            this.a.setAspectRatio(i7d.getWidth() / (float)i7d.getHeight());
        }
    }
    
    public final void e(final String s, final Object o) {
    }
    
    public final void f(final String s, final Throwable t) {
    }
}
