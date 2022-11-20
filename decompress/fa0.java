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

public final class fa0
{
    public final j90 a;
    public final a b;
    public final Paint c;
    
    public fa0(final j90 a, final a b) {
        this.a = a;
        this.b = b;
        final Paint c = new Paint();
        (this.c = c).setColor(0);
        c.setStyle(Paint$Style.FILL);
        c.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
    }
    
    public final void a(final Canvas canvas, final n90 n90) {
        final int a = n90.a;
        final float n91 = (float)a;
        final int b = n90.b;
        canvas.drawRect(n91, (float)b, (float)(a + n90.c), (float)(b + n90.d), this.c);
    }
    
    public final boolean b(final n90 n90) {
        return n90.a == 0 && n90.b == 0 && n90.c == ((l90)this.a).d.width() && n90.d == ((l90)this.a).d.height();
    }
    
    public final boolean c(final int n) {
        boolean b = true;
        if (n == 0) {
            return true;
        }
        final n90[] f = ((l90)this.a).f;
        final n90 n2 = f[n];
        final n90 n3 = f[n - 1];
        if (n2.e == 2 && this.b(n2)) {
            return true;
        }
        if (n3.f != 2 || !this.b(n3)) {
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
        Label_0254: {
            if (!this.c(n)) {
                int n3 = n - 1;
                while (true) {
                    i = n2;
                    if (n3 < 0) {
                        break Label_0254;
                    }
                    final n90 n4 = ((l90)this.a).f[n3];
                    final int f = n4.f;
                    int n5 = 0;
                    Label_0110: {
                        if (f != 1) {
                            if (f == 2) {
                                if (this.b(n4)) {
                                    n5 = 2;
                                    break Label_0110;
                                }
                            }
                            else {
                                if (f == 3) {
                                    n5 = 3;
                                    break Label_0110;
                                }
                                n5 = 4;
                                break Label_0110;
                            }
                        }
                        n5 = 1;
                    }
                    final int e = ib0.E(n5);
                    if (e != 0) {
                        if (e == 1) {
                            i = n3 + 1;
                            break Label_0254;
                        }
                        if (e == 3) {
                            break;
                        }
                    }
                    else {
                        final n90 n6 = ((l90)this.a).f[n3];
                        final xh4<Bitmap> b = this.b.b(n3);
                        if (b != null) {
                            Label_0224: {
                                try {
                                    canvas.drawBitmap((Bitmap)b.h(), 0.0f, 0.0f, (Paint)null);
                                    if (n6.f == 2) {
                                        this.a(canvas, n6);
                                    }
                                }
                                finally {
                                    break Label_0224;
                                }
                                i = n3 + 1;
                                b.close();
                                break Label_0254;
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
            final n90 n7 = ((l90)this.a).f[i];
            final int f2 = n7.f;
            if (f2 != 3) {
                if (n7.e == 2) {
                    this.a(canvas, n7);
                }
                ((l90)this.a).d(i, canvas);
                this.b.a();
                if (f2 == 2) {
                    this.a(canvas, n7);
                }
            }
            ++i;
        }
        final n90 n8 = ((l90)this.a).f[n];
        if (n8.e == 2) {
            this.a(canvas, n8);
        }
        ((l90)this.a).d(n, canvas);
        final la0 b2 = ((l90)this.a).b;
        if (b2 != null) {
            final z02 d = b2.d;
            if (d != null) {
                d.a();
            }
        }
    }
    
    public interface a
    {
        void a();
        
        xh4<Bitmap> b(final int p0);
    }
}
