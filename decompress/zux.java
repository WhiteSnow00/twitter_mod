import android.util.DisplayMetrics;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zux extends me1
{
    public float A;
    public boolean t;
    public int u;
    public float v;
    public float w;
    public float x;
    public int y;
    public zux.zux$a z;
    
    public zux(final zux.zux$a z) {
        this.t = true;
        this.u = -7829368;
        this.v = 1.0f;
        this.w = 10.0f;
        this.x = 10.0f;
        this.y = 1;
        this.A = Float.POSITIVE_INFINITY;
        this.z = z;
        ((u06)this).c = 0.0f;
    }
    
    public final void a(float r, final float n) {
        if (super.p) {
            r = super.r;
        }
        final float abs = Math.abs(n - r);
        float n2 = r;
        float n3 = n;
        if (abs == 0.0f) {
            n3 = n + 1.0f;
            n2 = r - 1.0f;
        }
        if (!super.p) {
            super.r = n2 - abs / 100.0f * this.x;
        }
        r = abs / 100.0f * this.w + n3;
        super.q = r;
        super.s = Math.abs(r - super.r);
    }
    
    public final float e(final Paint paint) {
        paint.setTextSize(((u06)this).d);
        final String c = this.c();
        final DisplayMetrics a = inw.a;
        final float n = ((u06)this).b * 2.0f + (int)paint.measureText(c);
        float n3;
        final float n2 = n3 = this.A;
        if (n2 > 0.0f) {
            n3 = n2;
            if (n2 != Float.POSITIVE_INFINITY) {
                n3 = inw.c(n2);
            }
        }
        if (n3 <= 0.0) {
            n3 = n;
        }
        return Math.max(0.0f, Math.min(n, n3));
    }
    
    public final boolean f() {
        return ((u06)this).a && super.l && this.y == 1;
    }
}
