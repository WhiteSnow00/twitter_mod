import android.graphics.Path;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public class ezt
{
    public Matrix a;
    public Matrix b;
    public oax c;
    public float[] d;
    public Matrix e;
    public float[] f;
    public Matrix g;
    
    public ezt(final oax c) {
        this.a = new Matrix();
        this.b = new Matrix();
        this.d = new float[1];
        this.e = new Matrix();
        this.f = new float[2];
        this.g = new Matrix();
        new Matrix();
        this.c = c;
    }
    
    public final weg a(final float n, final float n2) {
        final float[] f = this.f;
        f[0] = n;
        f[1] = n2;
        this.f(f);
        final float[] f2 = this.f;
        return weg.b((double)f2[0], (double)f2[1]);
    }
    
    public final weg b(final float n, final float n2) {
        final weg b = weg.b(0.0, 0.0);
        this.c(n, n2, b);
        return b;
    }
    
    public final void c(final float n, final float n2, final weg weg) {
        final float[] f = this.f;
        f[0] = n;
        f[1] = n2;
        this.e(f);
        final float[] f2 = this.f;
        weg.b = f2[0];
        weg.c = f2[1];
    }
    
    public final void d(final Path path) {
        path.transform(this.a);
        path.transform(this.c.a);
        path.transform(this.b);
    }
    
    public final void e(final float[] array) {
        final Matrix e = this.e;
        e.reset();
        this.b.invert(e);
        e.mapPoints(array);
        this.c.a.invert(e);
        e.mapPoints(array);
        this.a.invert(e);
        e.mapPoints(array);
    }
    
    public final void f(final float[] array) {
        this.a.mapPoints(array);
        this.c.a.mapPoints(array);
        this.b.mapPoints(array);
    }
    
    public void g() {
        this.b.reset();
        final Matrix b = this.b;
        final oax c = this.c;
        b.postTranslate(c.b.left, c.d - c.k());
    }
    
    public final void h(final float n, float n2, float n3, final float n4) {
        final float n5 = this.c.a() / n2;
        final float n6 = this.c.b.height() / n3;
        n2 = n5;
        if (Float.isInfinite(n5)) {
            n2 = 0.0f;
        }
        n3 = n6;
        if (Float.isInfinite(n6)) {
            n3 = 0.0f;
        }
        this.a.reset();
        this.a.postTranslate(-n, -n4);
        this.a.postScale(n2, -n3);
    }
}
