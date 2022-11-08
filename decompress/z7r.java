import android.util.StateSet;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "RestrictedAPI" })
public class z7r extends qd9
{
    public a P0;
    public boolean Q0;
    
    public z7r() {
    }
    
    public z7r(final a a, final Resources resources) {
        this.e(new a(a, this, resources));
        this.onStateChange(((Drawable)this).getState());
    }
    
    public final void applyTheme(final Resources$Theme resources$Theme) {
        super.applyTheme(resources$Theme);
        this.onStateChange(((Drawable)this).getState());
    }
    
    public void e(final qd9$c c0) {
        super.C0 = c0;
        final int i0 = super.I0;
        if (i0 >= 0) {
            final Drawable d = c0.d(i0);
            if ((super.E0 = d) != null) {
                this.c(d);
            }
        }
        super.F0 = null;
        if (c0 instanceof a) {
            this.P0 = (a)c0;
        }
    }
    
    public a f() {
        return new a(this.P0, this, null);
    }
    
    public boolean isStateful() {
        return true;
    }
    
    public Drawable mutate() {
        if (!this.Q0) {
            super.mutate();
            this.P0.e();
            this.Q0 = true;
        }
        return (Drawable)this;
    }
    
    public boolean onStateChange(final int[] array) {
        final boolean onStateChange = super.onStateChange(array);
        int n;
        if ((n = this.P0.h(array)) < 0) {
            n = this.P0.h(StateSet.WILD_CARD);
        }
        return this.d(n) || onStateChange;
    }
    
    public static class a extends qd9$c
    {
        public int[][] H;
        
        public a(final a a, final z7r z7r, final Resources resources) {
            super((qd9$c)a, (qd9)z7r, resources);
            if (a != null) {
                this.H = a.H;
            }
            else {
                this.H = new int[super.g.length][];
            }
        }
        
        public void e() {
            final int[][] h = this.H;
            final int[][] h2 = new int[h.length][];
            for (int i = h.length - 1; i >= 0; --i) {
                final int[][] h3 = this.H;
                int[] array;
                if (h3[i] != null) {
                    array = h3[i].clone();
                }
                else {
                    array = null;
                }
                h2[i] = array;
            }
            this.H = h2;
        }
        
        public final int h(final int[] array) {
            final int[][] h = this.H;
            for (int h2 = super.h, i = 0; i < h2; ++i) {
                if (StateSet.stateSetMatches(h[i], array)) {
                    return i;
                }
            }
            return -1;
        }
        
        public Drawable newDrawable() {
            return (Drawable)new z7r(this, null);
        }
        
        public Drawable newDrawable(final Resources resources) {
            return (Drawable)new z7r(this, resources);
        }
    }
}
