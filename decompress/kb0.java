import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.ColorFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public class kb0<T extends jb0> implements jb0
{
    public T C0;
    
    public kb0(final T c0) {
        this.C0 = c0;
    }
    
    public final int b() {
        final jb0 c0 = this.C0;
        int b;
        if (c0 == null) {
            b = 0;
        }
        else {
            b = ((qb0)c0).b();
        }
        return b;
    }
    
    public final int c() {
        final jb0 c0 = this.C0;
        int c2;
        if (c0 == null) {
            c2 = 0;
        }
        else {
            c2 = ((qb0)c0).c();
        }
        return c2;
    }
    
    @Override
    public final void clear() {
        final jb0 c0 = this.C0;
        if (c0 != null) {
            c0.clear();
        }
    }
    
    @Override
    public final void g(final ColorFilter colorFilter) {
        final jb0 c0 = this.C0;
        if (c0 != null) {
            c0.g(colorFilter);
        }
    }
    
    @Override
    public boolean i(final Drawable drawable, final Canvas canvas, final int n) {
        final jb0 c0 = this.C0;
        return c0 != null && c0.i(drawable, canvas, n);
    }
    
    public final int j(int j) {
        final jb0 c0 = this.C0;
        if (c0 == null) {
            j = 0;
        }
        else {
            j = ((qb0)c0).j(j);
        }
        return j;
    }
    
    @Override
    public final void k(final int n) {
        final jb0 c0 = this.C0;
        if (c0 != null) {
            c0.k(n);
        }
    }
    
    @Override
    public final int l() {
        final jb0 c0 = this.C0;
        int l;
        if (c0 == null) {
            l = -1;
        }
        else {
            l = c0.l();
        }
        return l;
    }
    
    @Override
    public final void m(final Rect rect) {
        final jb0 c0 = this.C0;
        if (c0 != null) {
            c0.m(rect);
        }
    }
    
    @Override
    public final int n() {
        final jb0 c0 = this.C0;
        int n;
        if (c0 == null) {
            n = -1;
        }
        else {
            n = c0.n();
        }
        return n;
    }
}
