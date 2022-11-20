import android.graphics.Color;
import android.util.TypedValue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ey9
{
    public static final int f;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    
    static {
        f = (int)Math.round(5.1000000000000005);
    }
    
    public ey9(final Context context) {
        final TypedValue a = qmg.a(context, 2130969421);
        final boolean a2 = a != null && a.type == 18 && a.data != 0;
        final int r = rp9.R(context, 2130969420, 0);
        final int r2 = rp9.R(context, 2130969419, 0);
        final int r3 = rp9.R(context, 2130968983, 0);
        final float density = context.getResources().getDisplayMetrics().density;
        this.a = a2;
        this.b = r;
        this.c = r2;
        this.d = r3;
        this.e = density;
    }
    
    public final int a(int n, float min) {
        int k = n;
        if (this.a) {
            final boolean b = er4.k(n, 255) == this.d;
            k = n;
            if (b) {
                final float e = this.e;
                if (e > 0.0f && min > 0.0f) {
                    min = Math.min(((float)Math.log1p(min / e) * 4.5f + 2.0f) / 100.0f, 1.0f);
                }
                else {
                    min = 0.0f;
                }
                final int alpha = Color.alpha(n);
                final int n2 = n = rp9.q0(er4.k(n, 255), this.b, min);
                if (min > 0.0f) {
                    final int c = this.c;
                    n = n2;
                    if (c != 0) {
                        n = er4.g(er4.k(c, ey9.f), n2);
                    }
                }
                k = er4.k(n, alpha);
            }
        }
        return k;
    }
}
