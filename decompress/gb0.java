import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.ColorFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public class gb0<T extends fb0> implements fb0
{
    public T D0;
    
    public gb0(final T d0) {
        this.D0 = d0;
    }
    
    public final int b() {
        final fb0 d0 = this.D0;
        int b;
        if (d0 == null) {
            b = 0;
        }
        else {
            b = ((lb0)d0).b();
        }
        return b;
    }
    
    @Override
    public final void clear() {
        final fb0 d0 = this.D0;
        if (d0 != null) {
            d0.clear();
        }
    }
    
    public final int e() {
        final fb0 d0 = this.D0;
        int e;
        if (d0 == null) {
            e = 0;
        }
        else {
            e = ((lb0)d0).e();
        }
        return e;
    }
    
    @Override
    public final void l(final ColorFilter colorFilter) {
        final fb0 d0 = this.D0;
        if (d0 != null) {
            d0.l(colorFilter);
        }
    }
    
    @Override
    public boolean r(final Drawable drawable, final Canvas canvas, final int n) {
        final fb0 d0 = this.D0;
        return d0 != null && d0.r(drawable, canvas, n);
    }
    
    public final int t(int t) {
        final fb0 d0 = this.D0;
        if (d0 == null) {
            t = 0;
        }
        else {
            t = ((lb0)d0).t(t);
        }
        return t;
    }
    
    @Override
    public final void u(final int n) {
        final fb0 d0 = this.D0;
        if (d0 != null) {
            d0.u(n);
        }
    }
    
    @Override
    public final int v() {
        final fb0 d0 = this.D0;
        int v;
        if (d0 == null) {
            v = -1;
        }
        else {
            v = d0.v();
        }
        return v;
    }
    
    @Override
    public final void w(final Rect rect) {
        final fb0 d0 = this.D0;
        if (d0 != null) {
            d0.w(rect);
        }
    }
    
    @Override
    public final int y() {
        final fb0 d0 = this.D0;
        int y;
        if (d0 == null) {
            y = -1;
        }
        else {
            y = d0.y();
        }
        return y;
    }
}
