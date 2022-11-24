import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import java.util.Objects;
import android.graphics.Bitmap;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l90 implements j90
{
    public final o90 a;
    public final oa0 b;
    public final ha0 c;
    public final Rect d;
    public final int[] e;
    public final n90[] f;
    public final Rect g;
    public final Rect h;
    public final boolean i;
    public Bitmap j;
    
    public l90(final o90 a, final oa0 b, final Rect rect, final boolean i) {
        this.g = new Rect();
        this.h = new Rect();
        this.a = a;
        this.b = b;
        final ha0 a2 = b.a;
        this.c = a2;
        final int[] k = a2.k();
        this.e = k;
        Objects.requireNonNull(a);
        final int n = 0;
        for (int j = 0; j < k.length; ++j) {
            if (k[j] < 11) {
                k[j] = 100;
            }
        }
        final o90 a3 = this.a;
        final int[] e = this.e;
        Objects.requireNonNull(a3);
        for (int l = 0; l < e.length; ++l) {
            final int n2 = e[l];
        }
        final o90 a4 = this.a;
        final int[] e2 = this.e;
        Objects.requireNonNull(a4);
        final int[] array = new int[e2.length];
        int n3 = 0;
        int n4 = 0;
        while (n3 < e2.length) {
            array[n3] = n4;
            n4 += e2[n3];
            ++n3;
        }
        this.d = a(this.c, rect);
        this.i = i;
        this.f = new n90[this.c.c()];
        for (int n5 = n; n5 < this.c.c(); ++n5) {
            this.f[n5] = this.c.g(n5);
        }
    }
    
    public static Rect a(final ha0 ha0, final Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, ha0.getWidth(), ha0.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), ha0.getWidth()), Math.min(rect.height(), ha0.getHeight()));
    }
    
    public final int b() {
        return this.c.c();
    }
    
    public final Bitmap c(final int n, final int n2) {
        synchronized (this) {
            final Bitmap j = this.j;
            if (j != null && (j.getWidth() < n || this.j.getHeight() < n2)) {
                synchronized (this) {
                    final Bitmap i = this.j;
                    if (i != null) {
                        i.recycle();
                        this.j = null;
                    }
                }
            }
            if (this.j == null) {
                this.j = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
            }
            this.j.eraseColor(0);
            return this.j;
        }
    }
    
    public final void d(final int n, final Canvas canvas) {
        final na0 j = this.c.j(n);
        try {
            if (this.c.f()) {
                this.f(canvas, j);
            }
            else {
                this.e(canvas, j);
            }
        }
        finally {
            j.dispose();
        }
    }
    
    public final void e(final Canvas canvas, final na0 na0) {
        int width;
        int height;
        int b;
        int c;
        if (this.i) {
            final float max = Math.max(na0.getWidth() / (float)Math.min(na0.getWidth(), canvas.getWidth()), na0.getHeight() / (float)Math.min(na0.getHeight(), canvas.getHeight()));
            width = (int)(na0.getWidth() / max);
            height = (int)(na0.getHeight() / max);
            b = (int)(na0.b() / max);
            c = (int)(na0.c() / max);
        }
        else {
            width = na0.getWidth();
            height = na0.getHeight();
            b = na0.b();
            c = na0.c();
        }
        synchronized (this) {
            na0.a(width, height, this.j = this.c(width, height));
            canvas.save();
            canvas.translate((float)b, (float)c);
            canvas.drawBitmap(this.j, 0.0f, 0.0f, (Paint)null);
            canvas.restore();
        }
    }
    
    public final void f(final Canvas canvas, final na0 na0) {
        final double n = this.d.width() / (double)this.c.getWidth();
        final double n2 = this.d.height() / (double)this.c.getHeight();
        final int n3 = (int)Math.round(na0.getWidth() * n);
        final int n4 = (int)Math.round(na0.getHeight() * n2);
        final int n5 = (int)(na0.b() * n);
        final int n6 = (int)(na0.c() * n2);
        synchronized (this) {
            final int width = this.d.width();
            final int height = this.d.height();
            this.c(width, height);
            final Bitmap j = this.j;
            if (j != null) {
                na0.a(n3, n4, j);
            }
            this.g.set(0, 0, width, height);
            this.h.set(n5, n6, width + n5, height + n6);
            final Bitmap i = this.j;
            if (i != null) {
                canvas.drawBitmap(i, this.g, this.h, (Paint)null);
            }
        }
    }
}
