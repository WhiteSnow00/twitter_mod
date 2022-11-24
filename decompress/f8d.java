import android.graphics.Matrix;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f8d implements nuk
{
    public final float c;
    public final ccm d;
    public final int e;
    public final float f;
    
    public f8d(final float c, final ccm d, final int e, final float f) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final boolean apply(final Object o) {
        final float c = this.c;
        final ccm d = this.d;
        final int e = this.e;
        final float f = this.f;
        final nir nir = (nir)o;
        final Matrix b = nir.b(c, d, e);
        final float n = nir.a.N0.a / 2.0f;
        final RectF rectF = new RectF(-0.5f, -n, 0.5f, n);
        b.mapRect(rectF);
        return rectF.left <= 1.0f && rectF.top <= f && rectF.right >= 0.0f && rectF.bottom >= 0.0f;
    }
}
