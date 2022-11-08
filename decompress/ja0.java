import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ja0
{
    public final l90 a;
    public final a b;
    public final Paint c;
    
    public ja0(final l90 a, final a b) {
        this.a = a;
        this.b = b;
        final Paint c = new Paint();
        (this.c = c).setColor(0);
        c.setStyle(Paint$Style.FILL);
        c.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
    }
    
    public final void a(final Canvas canvas, final q90 q90) {
        final int a = q90.a;
        final float n = (float)a;
        final int b = q90.b;
        canvas.drawRect(n, (float)b, (float)(a + q90.c), (float)(b + q90.d), this.c);
    }
    
    public final boolean b(final q90 q90) {
        return q90.a == 0 && q90.b == 0 && q90.c == ((o90)this.a).d.width() && q90.d == ((o90)this.a).d.height();
    }
    
    public final boolean c(final int n) {
        boolean b = true;
        if (n == 0) {
            return true;
        }
        final q90[] f = ((o90)this.a).f;
        final q90 q90 = f[n];
        final q90 q91 = f[n - 1];
        if (q90.e == 2 && this.b(q90)) {
            return true;
        }
        if (q91.f != 2 || !this.b(q91)) {
            b = false;
        }
        return b;
    }
    
    public final void d(final int n, final Bitmap bitmap) {
        final Canvas canvas = new Canvas(bitmap);
        final PorterDuff$Mode src = PorterDuff$Mode.SRC;
        final int n2 = 0;
        canvas.drawColor(0, src);
        int i = 0;
        Label_0262: {
            if (!this.c(n)) {
                int n3 = n - 1;
                while (true) {
                    i = n2;
                    if (n3 < 0) {
                        break Label_0262;
                    }
                    final q90 q90 = ((o90)this.a).f[n3];
                    final int f = q90.f;
                    int n4 = 0;
                    Label_0114: {
                        if (f != 1) {
                            if (f == 2) {
                                if (this.b(q90)) {
                                    n4 = 2;
                                    break Label_0114;
                                }
                            }
                            else {
                                if (f == 3) {
                                    n4 = 3;
                                    break Label_0114;
                                }
                                n4 = 4;
                                break Label_0114;
                            }
                        }
                        n4 = 1;
                    }
                    final int d = nb0.D(n4);
                    if (d != 0) {
                        if (d == 1) {
                            i = n3 + 1;
                            break Label_0262;
                        }
                        if (d == 3) {
                            break;
                        }
                    }
                    else {
                        final q90 q91 = ((o90)this.a).f[n3];
                        final wi4<Bitmap> b = this.b.b(n3);
                        if (b != null) {
                            Label_0231: {
                                try {
                                    canvas.drawBitmap((Bitmap)b.h(), 0.0f, 0.0f, (Paint)null);
                                    if (q91.f == 2) {
                                        this.a(canvas, q91);
                                    }
                                }
                                finally {
                                    break Label_0231;
                                }
                                i = n3 + 1;
                                b.close();
                                break Label_0262;
                            }
                            b.close();
                        }
                        else if (this.c(n3)) {
                            break;
                        }
                    }
                    --n3;
                }
                i = n3;
            }
            else {
                i = n;
            }
        }
        while (i < n) {
            final q90 q92 = ((o90)this.a).f[i];
            final int f2 = q92.f;
            if (f2 != 3) {
                if (q92.e == 2) {
                    this.a(canvas, q92);
                }
                ((o90)this.a).d(i, canvas);
                this.b.a();
                if (f2 == 2) {
                    this.a(canvas, q92);
                }
            }
            ++i;
        }
        final q90 q93 = ((o90)this.a).f[n];
        if (q93.e == 2) {
            this.a(canvas, q93);
        }
        ((o90)this.a).d(n, canvas);
        final pa0 b2 = ((o90)this.a).b;
        if (b2 != null) {
            final f12 d2 = b2.d;
            if (d2 != null) {
                d2.a();
            }
        }
    }
    
    public interface a
    {
        void a();
        
        wi4<Bitmap> b(final int p0);
    }
}
