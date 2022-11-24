import android.util.StateSet;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "RestrictedAPI" })
public class u9r extends be9
{
    public a S0;
    public boolean T0;
    
    public u9r() {
    }
    
    public u9r(final a a, final Resources resources) {
        this.e(new a(a, this, resources));
        this.onStateChange(((Drawable)this).getState());
    }
    
    public final void applyTheme(final Resources$Theme resources$Theme) {
        super.applyTheme(resources$Theme);
        this.onStateChange(((Drawable)this).getState());
    }
    
    public /* bridge */ be9$c b() {
        return this.f();
    }
    
    public void e(final be9$c f0) {
        super.F0 = f0;
        final int l0 = super.L0;
        if (l0 >= 0) {
            final Drawable d = f0.d(l0);
            if ((super.H0 = d) != null) {
                this.c(d);
            }
        }
        super.I0 = null;
        if (f0 instanceof a) {
            this.S0 = (a)f0;
        }
    }
    
    public a f() {
        return new a(this.S0, this, null);
    }
    
    public boolean isStateful() {
        return true;
    }
    
    public Drawable mutate() {
        if (!this.T0) {
            super.mutate();
            this.S0.e();
            this.T0 = true;
        }
        return (Drawable)this;
    }
    
    public boolean onStateChange(final int[] array) {
        final boolean onStateChange = super.onStateChange(array);
        int n;
        if ((n = this.S0.h(array)) < 0) {
            n = this.S0.h(StateSet.WILD_CARD);
        }
        return this.d(n) || onStateChange;
    }
    
    public static class a extends be9$c
    {
        public int[][] H;
        
        public a(final a a, final u9r u9r, final Resources resources) {
            super((be9$c)a, (be9)u9r, resources);
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
            return (Drawable)new u9r(this, null);
        }
        
        public Drawable newDrawable(final Resources resources) {
            return (Drawable)new u9r(this, resources);
        }
    }
}
