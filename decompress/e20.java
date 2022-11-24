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

public final class e20 implements ah3
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
        Objects.requireNonNull(mi4.Companion);
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
    
    public final void d(final c0k c0k, int n) {
        e0e.f((Object)c0k, "path");
        final Canvas a = this.a;
        if (c0k instanceof f50) {
            final Path a2 = ((f50)c0k).a;
            Objects.requireNonNull(mi4.Companion);
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
    
    public final void f(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final uvj uvj) {
        this.a.drawArc(n, n2, n3, n4, n5, n6, false, uvj.p());
    }
    
    public final void g(final p6m p6m, final int n) {
        this.a(p6m.a, p6m.b, p6m.c, p6m.d, n);
    }
    
    public final void h(final m6d m6d, final long n, final long n2, final long n3, final long n4, final uvj uvj) {
        e0e.f((Object)m6d, "image");
        final Canvas a = this.a;
        final Bitmap a2 = rtd.a(m6d);
        final Rect b = this.b;
        final hud$a companion = hud.Companion;
        final int left = (int)(n >> 32);
        b.left = left;
        b.top = hud.c(n);
        b.right = left + (int)(n2 >> 32);
        b.bottom = nud.b(n2) + hud.c(n);
        final Rect c = this.c;
        final int left2 = (int)(n3 >> 32);
        c.left = left2;
        c.top = hud.c(n3);
        c.right = left2 + (int)(n4 >> 32);
        c.bottom = nud.b(n4) + hud.c(n3);
        a.drawBitmap(a2, b, c, uvj.p());
    }
    
    public final void i(final m6d m6d, final long n, final uvj uvj) {
        e0e.f((Object)m6d, "image");
        this.a.drawBitmap(rtd.a(m6d), kgj.d(n), kgj.e(n), uvj.p());
    }
    
    public final void j() {
        jb2.O(this.a, true);
    }
    
    public final void k(final p6m p6m, final uvj uvj) {
        ad.a((ah3)this, p6m, uvj);
    }
    
    public final void l(final long n, final long n2, final uvj uvj) {
        this.a.drawLine(kgj.d(n), kgj.e(n), kgj.d(n2), kgj.e(n2), uvj.p());
    }
    
    public final void m(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final uvj uvj) {
        this.a.drawRoundRect(n, n2, n3, n4, n5, n6, uvj.p());
    }
    
    public final void n(final c0k c0k, final uvj uvj) {
        e0e.f((Object)c0k, "path");
        final Canvas a = this.a;
        if (c0k instanceof f50) {
            a.drawPath(((f50)c0k).a, uvj.p());
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
        jb2.O(this.a, false);
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
    
    public final void s(final p6m p6m, final uvj uvj) {
        this.a.saveLayer(p6m.a, p6m.b, p6m.c, p6m.d, uvj.p(), 31);
    }
    
    public final void t(final long n, final float n2, final uvj uvj) {
        this.a.drawCircle(kgj.d(n), kgj.e(n), n2, uvj.p());
    }
    
    public final void u(final float n, final float n2, final float n3, final float n4, final uvj uvj) {
        e0e.f((Object)uvj, "paint");
        this.a.drawRect(n, n2, n3, n4, uvj.p());
    }
    
    public final void v(final Canvas a) {
        e0e.f((Object)a, "<set-?>");
        this.a = a;
    }
}
