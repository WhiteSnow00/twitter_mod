import java.util.Objects;
import android.graphics.Paint;
import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ki9<S extends dp1>
{
    public S a;
    public ld9 b;
    
    public ki9(final S a) {
        this.a = a;
    }
    
    public abstract void a(final Canvas p0, final Paint p1, final float p2, final float p3, final int p4);
    
    public abstract void b(final Canvas p0, final Paint p1);
    
    public abstract int c();
    
    public abstract int d();
    
    public final void e(final Canvas canvas, final float n) {
        Objects.requireNonNull(this.a);
        final v94 v94 = (v94)this;
        final da4 da4 = (da4)v94.a;
        final float n2 = da4.g / 2.0f + da4.h;
        canvas.translate(n2, n2);
        canvas.rotate(-90.0f);
        final float n3 = -n2;
        canvas.clipRect(n3, n3, n2, n2);
        final da4 da5 = (da4)v94.a;
        int c;
        if (da5.i == 0) {
            c = 1;
        }
        else {
            c = -1;
        }
        v94.c = c;
        final int a = ((dp1)da5).a;
        v94.d = a * n;
        v94.e = ((dp1)da5).b * n;
        v94.f = (da5.g - a) / 2.0f;
        if ((v94.b.e() && ((dp1)v94.a).e == 2) || (v94.b.d() && ((dp1)v94.a).f == 1)) {
            v94.f += (1.0f - n) * ((dp1)v94.a).a / 2.0f;
        }
        else if ((v94.b.e() && ((dp1)v94.a).e == 1) || (v94.b.d() && ((dp1)v94.a).f == 2)) {
            v94.f -= (1.0f - n) * ((dp1)v94.a).a / 2.0f;
        }
    }
}
