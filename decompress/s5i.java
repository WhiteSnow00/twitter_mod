import android.view.View;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s5i extends ste implements qsb<x5i, fzv>
{
    public final k5i D0;
    
    public s5i(final k5i d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final x5i x5i = (x5i)o;
        czd.f((Object)x5i, "$this$distinct");
        if (x5i.g) {
            final String f = x5i.f;
            if (f != null && f.length() != 0) {
                this.D0.L0.setText(2131955429);
                ((View)this.D0.I0).setVisibility(8);
                ((View)this.D0.K0).setVisibility(0);
                final k5i d0 = this.D0;
                final yz1 h = ((mux)new g63()).h(x5i.f, mi1.L0, ((View)d0.K0).getWidth(), ((View)d0.K0).getHeight());
                final int d2 = h.D0;
                final int e0 = h.E0;
                final int[] array = new int[d2 * e0];
                for (int i = 0; i < e0; ++i) {
                    for (int j = 0; j < d2; ++j) {
                        int n;
                        if (h.c(j, i)) {
                            n = -16777216;
                        }
                        else {
                            n = -1;
                        }
                        array[i * d2 + j] = n;
                    }
                }
                final Bitmap bitmap = Bitmap.createBitmap(d2, e0, Bitmap$Config.ARGB_8888);
                czd.e((Object)bitmap, "createBitmap(width, heig\u2026 Bitmap.Config.ARGB_8888)");
                bitmap.setPixels(array, 0, d2, 0, 0, d2, e0);
                d0.K0.setImageBitmap(bitmap);
                return fzv.a;
            }
        }
        this.D0.L0.setText(2131955360);
        ((View)this.D0.K0).setVisibility(4);
        ((View)this.D0.I0).setVisibility(0);
        this.D0.K0.setImageBitmap((Bitmap)null);
        return fzv.a;
    }
}
