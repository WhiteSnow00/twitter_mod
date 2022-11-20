import android.util.StateSet;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "RestrictedAPI" })
public class v8r extends yc9
{
    public a Q0;
    public boolean R0;
    
    public v8r() {
    }
    
    public v8r(final a a, final Resources resources) {
        this.e(new a(a, this, resources));
        this.onStateChange(this.getState());
    }
    
    @Override
    public final void applyTheme(final Resources$Theme resources$Theme) {
        super.applyTheme(resources$Theme);
        this.onStateChange(this.getState());
    }
    
    @Override
    public /* bridge */ c b() {
        return this.f();
    }
    
    @Override
    public void e(final c d0) {
        super.D0 = d0;
        final int j0 = super.J0;
        if (j0 >= 0) {
            final Drawable d2 = d0.d(j0);
            if ((super.F0 = d2) != null) {
                this.c(d2);
            }
        }
        super.G0 = null;
        if (d0 instanceof a) {
            this.Q0 = (a)d0;
        }
    }
    
    public a f() {
        return new a(this.Q0, this, null);
    }
    
    public boolean isStateful() {
        return true;
    }
    
    @Override
    public Drawable mutate() {
        if (!this.R0) {
            super.mutate();
            this.Q0.e();
            this.R0 = true;
        }
        return this;
    }
    
    @Override
    public boolean onStateChange(final int[] array) {
        final boolean onStateChange = super.onStateChange(array);
        int n;
        if ((n = this.Q0.h(array)) < 0) {
            n = this.Q0.h(StateSet.WILD_CARD);
        }
        return this.d(n) || onStateChange;
    }
    
    public static class a extends c
    {
        public int[][] H;
        
        public a(final a a, final v8r v8r, final Resources resources) {
            super((c)a, v8r, resources);
            if (a != null) {
                this.H = a.H;
            }
            else {
                this.H = new int[super.g.length][];
            }
        }
        
        @Override
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
            return new v8r(this, null);
        }
        
        public Drawable newDrawable(final Resources resources) {
            return new v8r(this, resources);
        }
    }
}
