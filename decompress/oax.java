import android.view.View;
import android.graphics.RectF;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public class oax
{
    public final Matrix a;
    public RectF b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public Matrix n;
    public final float[] o;
    
    public oax() {
        this.a = new Matrix();
        this.b = new RectF();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 1.0f;
        this.f = Float.MAX_VALUE;
        this.g = 1.0f;
        this.h = Float.MAX_VALUE;
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = new Matrix();
        this.o = new float[9];
    }
    
    public final float a() {
        return this.b.width();
    }
    
    public final boolean b() {
        final float i = this.i;
        final float g = this.g;
        return i <= g && g <= 1.0f;
    }
    
    public final boolean c() {
        final float j = this.j;
        final float e = this.e;
        return j <= e && e <= 1.0f;
    }
    
    public final boolean d(float n) {
        n = (int)(n * 100.0f) / 100.0f;
        return this.b.bottom >= n;
    }
    
    public final boolean e(final float n) {
        return this.b.left <= n + 1.0f;
    }
    
    public final boolean f(float n) {
        n = (int)(n * 100.0f) / 100.0f;
        return this.b.right >= n - 1.0f;
    }
    
    public final boolean g(final float n) {
        return this.b.top <= n;
    }
    
    public final boolean h(final float n) {
        return this.e(n) && this.f(n);
    }
    
    public final boolean i(final float n) {
        return this.g(n) && this.d(n);
    }
    
    public final void j(final Matrix matrix, final RectF rectF) {
        matrix.getValues(this.o);
        final float[] o = this.o;
        final float n = o[2];
        final float n2 = o[0];
        final float n3 = o[5];
        final float n4 = o[4];
        this.i = Math.min(Math.max(this.g, n2), this.h);
        this.j = Math.min(Math.max(this.e, n4), this.f);
        float width = 0.0f;
        float height;
        if (rectF != null) {
            width = rectF.width();
            height = rectF.height();
        }
        else {
            height = 0.0f;
        }
        this.k = Math.min(Math.max(n, (this.i - 1.0f) * -width - this.l), this.l);
        final float max = Math.max(Math.min(n3, (this.j - 1.0f) * height + this.m), -this.m);
        final float[] o2 = this.o;
        o2[2] = this.k;
        o2[0] = this.i;
        o2[5] = max;
        o2[4] = this.j;
        matrix.setValues(o2);
    }
    
    public final float k() {
        return this.d - this.b.bottom;
    }
    
    public final float l() {
        return this.c - this.b.right;
    }
    
    public final Matrix m(final Matrix matrix, final View view, final boolean b) {
        this.a.set(matrix);
        this.j(this.a, this.b);
        if (b) {
            view.invalidate();
        }
        matrix.set(this.a);
        return matrix;
    }
    
    public final void n(final float n, final float n2, final float n3, final float n4) {
        this.b.set(n, n2, this.c - n3, this.d - n4);
    }
}
