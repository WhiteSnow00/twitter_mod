import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eg8 implements zc9
{
    public final Resources a;
    public final zc9 b;
    
    public eg8(final Resources a, final zc9 b) {
        this.a = a;
        this.b = b;
    }
    
    public final Drawable a(final vh4 vh4) {
        try {
            pqb.b();
            if (vh4 instanceof ai4) {
                final ai4 ai4 = (ai4)vh4;
                final BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, ai4.G0);
                final int i0 = ai4.I0;
                final boolean b = false;
                if (i0 == 0 || i0 == -1) {
                    final int j0 = ai4.J0;
                    int n = b ? 1 : 0;
                    if (j0 != 1) {
                        n = (b ? 1 : 0);
                        if (j0 != 0) {
                            n = 1;
                        }
                    }
                    if (n == 0) {
                        return (Drawable)bitmapDrawable;
                    }
                }
                return (Drawable)new roj((Drawable)bitmapDrawable, ai4.I0, ai4.J0);
            }
            final zc9 b2 = this.b;
            if (b2 != null && b2.b(vh4)) {
                return this.b.a(vh4);
            }
            return null;
        }
        finally {
            pqb.b();
        }
    }
    
    public final boolean b(final vh4 vh4) {
        return true;
    }
}
