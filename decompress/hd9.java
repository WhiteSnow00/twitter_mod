import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hd9
{
    public static void a(final Drawable drawable, final Drawable drawable2) {
        if (drawable2 != null && drawable != null) {
            if (drawable != drawable2) {
                drawable.setBounds(drawable2.getBounds());
                drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
                drawable.setLevel(drawable2.getLevel());
                drawable.setVisible(drawable2.isVisible(), false);
                drawable.setState(drawable2.getState());
            }
        }
    }
    
    public static int b(final int n, final int n2) {
        if (n2 == 255) {
            return n;
        }
        if (n2 == 0) {
            return n & 0xFFFFFF;
        }
        return (n & 0xFFFFFF) | (n >>> 24) * (n2 + (n2 >> 7)) >> 8 << 24;
    }
    
    public static void c(final Drawable drawable, final Drawable$Callback callback, final tyt tyt) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof syt) {
                ((syt)drawable).f(tyt);
            }
        }
    }
    
    public static void d(final Drawable drawable, final ed9 ed9) {
        if (drawable != null) {
            if (ed9 != null) {
                final int a = ed9.a;
                if (a != -1) {
                    drawable.setAlpha(a);
                }
                if (ed9.b) {
                    drawable.setColorFilter(ed9.c);
                }
                final int d = ed9.d;
                final boolean b = false;
                if (d != -1) {
                    drawable.setDither(d != 0);
                }
                final int e = ed9.e;
                if (e != -1) {
                    boolean filterBitmap = b;
                    if (e != 0) {
                        filterBitmap = true;
                    }
                    drawable.setFilterBitmap(filterBitmap);
                }
            }
        }
    }
}
