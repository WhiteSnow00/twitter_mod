import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Region$Op;
import java.util.Objects;
import android.graphics.Rect;
import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e20 implements ag3
{
    public Canvas a;
    public final Rect b;
    public final Rect c;
    
    public e20() {
        this.a = f20.a;
        this.b = new Rect();
        this.c = new Rect();
    }
    
    public final void a(final float n, final float n2, final float n3, final float n4, int n5) {
        final Canvas a = this.a;
        Objects.requireNonNull(hh4.Companion);
        if (n5 == 0) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        Region$Op region$Op;
        if (n5 != 0) {
            region$Op = Region$Op.DIFFERENCE;
        }
        else {
            region$Op = Region$Op.INTERSECT;
        }
        a.clipRect(n, n2, n3, n4, region$Op);
    }
    
    public final void b(final float n, final float n2) {
        this.a.translate(n, n2);
    }
    
    public final void c() {
        this.a.restore();
    }
    
    public final void d(final lzj lzj, int n) {
        czd.f((Object)lzj, "path");
        final Canvas a = this.a;
        if (lzj instanceof g50) {
            final Path a2 = ((g50)lzj).a;
            Objects.requireNonNull(hh4.Companion);
            if (n == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            Region$Op region$Op;
            if (n != 0) {
                region$Op = Region$Op.DIFFERENCE;
            }
            else {
                region$Op = Region$Op.INTERSECT;
            }
            a.clipPath(a2, region$Op);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
    
    public final void e(final float n, final float n2) {
        this.a.scale(n, n2);
    }
    
    public final void f(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final fvj fvj) {
        this.a.drawArc(n, n2, n3, n4, n5, n6, false, fvj.p());
    }
    
    public final void g(final c6m c6m, final int n) {
        this.a(c6m.a, c6m.b, c6m.c, c6m.d, n);
    }
    
    public final void h(final m5d m5d, final long n, final long n2, final long n3, final long n4, final fvj fvj) {
        czd.f((Object)m5d, "image");
        final Canvas a = this.a;
        final Bitmap a2 = psd.a(m5d);
        final Rect b = this.b;
        final ftd$a companion = ftd.Companion;
        final int left = (int)(n >> 32);
        b.left = left;
        b.top = ftd.c(n);
        b.right = left + (int)(n2 >> 32);
        b.bottom = ltd.b(n2) + ftd.c(n);
        final Rect c = this.c;
        final int left2 = (int)(n3 >> 32);
        c.left = left2;
        c.top = ftd.c(n3);
        c.right = left2 + (int)(n4 >> 32);
        c.bottom = ltd.b(n4) + ftd.c(n3);
        a.drawBitmap(a2, b, c, fvj.p());
    }
    
    public final void i(final m5d m5d, final long n, final fvj fvj) {
        czd.f((Object)m5d, "image");
        this.a.drawBitmap(psd.a(m5d), wfj.d(n), wfj.e(n), fvj.p());
    }
    
    public final void j() {
        as2.q(this.a, true);
    }
    
    public final void k(final c6m c6m, final fvj fvj) {
        nh.a((ag3)this, c6m, fvj);
    }
    
    public final void l(final long n, final long n2, final fvj fvj) {
        this.a.drawLine(wfj.d(n), wfj.e(n), wfj.d(n2), wfj.e(n2), fvj.p());
    }
    
    public final void m(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final fvj fvj) {
        this.a.drawRoundRect(n, n2, n3, n4, n5, n6, fvj.p());
    }
    
    public final void n(final lzj lzj, final fvj fvj) {
        czd.f((Object)lzj, "path");
        final Canvas a = this.a;
        if (lzj instanceof g50) {
            a.drawPath(((g50)lzj).a, fvj.p());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
    
    public final void o(final float n) {
        this.a.rotate(n);
    }
    
    public final void p() {
        this.a.save();
    }
    
    public final void q() {
        as2.q(this.a, false);
    }
    
    public final void r(final float[] values) {
        int i = 0;
    Label_0081:
        while (true) {
            while (i < 4) {
                for (int j = 0; j < 4; ++j) {
                    float n;
                    if (i == j) {
                        n = 1.0f;
                    }
                    else {
                        n = 0.0f;
                    }
                    if (values[i * 4 + j] != n) {
                        final boolean b = false;
                        break Label_0081;
                    }
                }
                ++i;
                continue;
                boolean b = false;
                if (!b) {
                    final Matrix matrix = new Matrix();
                    if (values[2] != 0.0f || values[6] != 0.0f || values[10] != 1.0f || values[14] != 0.0f || values[8] != 0.0f || values[9] != 0.0f || values[11] != 0.0f) {
                        throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
                    }
                    final float n2 = values[0];
                    final float n3 = values[1];
                    final float n4 = values[2];
                    final float n5 = values[3];
                    final float n6 = values[4];
                    final float n7 = values[5];
                    final float n8 = values[6];
                    final float n9 = values[7];
                    final float n10 = values[8];
                    final float n11 = values[12];
                    final float n12 = values[13];
                    final float n13 = values[15];
                    values[0] = n2;
                    values[1] = n6;
                    values[2] = n11;
                    values[3] = n3;
                    values[4] = n7;
                    values[5] = n12;
                    values[6] = n5;
                    values[7] = n9;
                    values[8] = n13;
                    matrix.setValues(values);
                    values[0] = n2;
                    values[1] = n3;
                    values[2] = n4;
                    values[3] = n5;
                    values[4] = n6;
                    values[5] = n7;
                    values[6] = n8;
                    values[7] = n9;
                    values[8] = n10;
                    this.a.concat(matrix);
                }
                return;
            }
            final boolean b = true;
            continue Label_0081;
        }
    }
    
    public final void s(final c6m c6m, final fvj fvj) {
        this.a.saveLayer(c6m.a, c6m.b, c6m.c, c6m.d, fvj.p(), 31);
    }
    
    public final void t(final long n, final float n2, final fvj fvj) {
        this.a.drawCircle(wfj.d(n), wfj.e(n), n2, fvj.p());
    }
    
    public final void u(final float n, final float n2, final float n3, final float n4, final fvj fvj) {
        czd.f((Object)fvj, "paint");
        this.a.drawRect(n, n2, n3, n4, fvj.p());
    }
    
    public final void v(final Canvas a) {
        czd.f((Object)a, "<set-?>");
        this.a = a;
    }
}
