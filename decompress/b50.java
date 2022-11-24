import android.graphics.Paint$Style;
import android.graphics.ColorFilter;
import android.graphics.Paint$Join;
import android.graphics.PathEffect;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.os.Build$VERSION;
import android.graphics.Paint$Cap;
import java.util.Objects;
import android.graphics.Shader;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b50 implements uvj
{
    public Paint a;
    public int b;
    public Shader c;
    public vr4 d;
    public f0k e;
    
    public b50() {
        this.a = new Paint(7);
        Objects.requireNonNull(q12.Companion);
        this.b = 3;
    }
    
    public final float a() {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        return a.getAlpha() / 255.0f;
    }
    
    public final void b(final float n) {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        a.setAlpha((int)(float)Math.rint(n * 255.0f));
    }
    
    public final long c() {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        return yru.d(a.getColor());
    }
    
    public final void d(final int n) {
        final Paint a = this.a;
        e0e.f((Object)a, "$this$setNativeStrokeCap");
        Objects.requireNonNull(gmr.Companion);
        final int n2 = 0;
        Paint$Cap strokeCap;
        if (n == 2) {
            strokeCap = Paint$Cap.SQUARE;
        }
        else if (n == 1) {
            strokeCap = Paint$Cap.ROUND;
        }
        else {
            int n3 = n2;
            if (n == 0) {
                n3 = 1;
            }
            if (n3 != 0) {
                strokeCap = Paint$Cap.BUTT;
            }
            else {
                strokeCap = Paint$Cap.BUTT;
            }
        }
        a.setStrokeCap(strokeCap);
    }
    
    public final void e(final int b) {
        this.b = b;
        final Paint a = this.a;
        e0e.f((Object)a, "$this$setNativeBlendMode");
        if (Build$VERSION.SDK_INT >= 29) {
            vux.a.a(a, b);
        }
        else {
            a.setXfermode((Xfermode)new PorterDuffXfermode(c20.b(b)));
        }
    }
    
    public final vr4 f() {
        return this.d;
    }
    
    public final void g(final f0k e) {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        final g50 g50 = (g50)e;
        a.setPathEffect((PathEffect)null);
        this.e = e;
    }
    
    public final void h(int n) {
        final Paint a = this.a;
        e0e.f((Object)a, "$this$setNativeFilterQuality");
        Objects.requireNonNull(h0b.Companion);
        if (n == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        a.setFilterBitmap((boolean)((n ^ 0x1) != 0x0));
    }
    
    public final int i() {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        final Paint$Cap strokeCap = a.getStrokeCap();
        int n;
        if (strokeCap == null) {
            n = -1;
        }
        else {
            n = c50.a[((Enum)strokeCap).ordinal()];
        }
        final boolean b = false;
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    Objects.requireNonNull(gmr.Companion);
                    n2 = (b ? 1 : 0);
                }
                else {
                    Objects.requireNonNull(gmr.Companion);
                    n2 = 2;
                }
            }
            else {
                Objects.requireNonNull(gmr.Companion);
                n2 = 1;
            }
        }
        else {
            Objects.requireNonNull(gmr.Companion);
            n2 = (b ? 1 : 0);
        }
        return n2;
    }
    
    public final void j(final int n) {
        final Paint a = this.a;
        e0e.f((Object)a, "$this$setNativeStrokeJoin");
        Objects.requireNonNull(imr.Companion);
        final int n2 = 0;
        Paint$Join strokeJoin;
        if (n == 0) {
            strokeJoin = Paint$Join.MITER;
        }
        else if (n == 2) {
            strokeJoin = Paint$Join.BEVEL;
        }
        else {
            int n3 = n2;
            if (n == 1) {
                n3 = 1;
            }
            if (n3 != 0) {
                strokeJoin = Paint$Join.ROUND;
            }
            else {
                strokeJoin = Paint$Join.MITER;
            }
        }
        a.setStrokeJoin(strokeJoin);
    }
    
    public final void k(final long n) {
        final Paint a = this.a;
        e0e.f((Object)a, "$this$setNativeColor");
        a.setColor(yru.I(n));
    }
    
    public final f0k l() {
        return this.e;
    }
    
    public final int m() {
        return this.b;
    }
    
    public final int n() {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        final Paint$Join strokeJoin = a.getStrokeJoin();
        int n;
        if (strokeJoin == null) {
            n = -1;
        }
        else {
            n = c50.b[((Enum)strokeJoin).ordinal()];
        }
        final boolean b = false;
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    Objects.requireNonNull(imr.Companion);
                    n2 = (b ? 1 : 0);
                }
                else {
                    Objects.requireNonNull(imr.Companion);
                    n2 = 1;
                }
            }
            else {
                Objects.requireNonNull(imr.Companion);
                n2 = 2;
            }
        }
        else {
            Objects.requireNonNull(imr.Companion);
            n2 = (b ? 1 : 0);
        }
        return n2;
    }
    
    public final float o() {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        return a.getStrokeMiter();
    }
    
    public final Paint p() {
        return this.a;
    }
    
    public final void q(final Shader shader) {
        this.c = shader;
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        a.setShader(shader);
    }
    
    public final Shader r() {
        return this.c;
    }
    
    public final void s(final float strokeMiter) {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        a.setStrokeMiter(strokeMiter);
    }
    
    public final void t(final vr4 d) {
        this.d = d;
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        ColorFilter a2;
        if (d != null) {
            a2 = d.a;
        }
        else {
            a2 = null;
        }
        a.setColorFilter(a2);
    }
    
    public final int u() {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        int n;
        if (!a.isFilterBitmap()) {
            Objects.requireNonNull(h0b.Companion);
            n = 0;
        }
        else {
            Objects.requireNonNull(h0b.Companion);
            n = 1;
        }
        return n;
    }
    
    public final void v(final float strokeWidth) {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        a.setStrokeWidth(strokeWidth);
    }
    
    public final float w() {
        final Paint a = this.a;
        e0e.f((Object)a, "<this>");
        return a.getStrokeWidth();
    }
    
    public final void x(int n) {
        final Paint a = this.a;
        e0e.f((Object)a, "$this$setNativeStyle");
        Objects.requireNonNull(yvj.Companion);
        final int n2 = 1;
        if (n == 1) {
            n = n2;
        }
        else {
            n = 0;
        }
        Paint$Style style;
        if (n != 0) {
            style = Paint$Style.STROKE;
        }
        else {
            style = Paint$Style.FILL;
        }
        a.setStyle(style);
    }
}
