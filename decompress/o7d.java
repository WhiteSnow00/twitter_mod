import android.graphics.drawable.Drawable;
import android.content.res.AssetManager;
import android.content.Context;
import android.graphics.drawable.Drawable$Callback;
import java.io.IOException;
import android.text.TextUtils;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.graphics.BitmapFactory$Options;
import android.view.View;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.ColorFilter;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7d extends ym1
{
    public final Rect A;
    public final Rect B;
    public wm1<ColorFilter, ColorFilter> C;
    public final dte z;
    
    public o7d(final sdg sdg, final kve kve) {
        super(sdg, kve);
        this.z = new dte(3);
        this.A = new Rect();
        this.B = new Rect();
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        super.c(rectF, matrix, b);
        final Bitmap t = this.t();
        if (t != null) {
            rectF.set(0.0f, 0.0f, mmw.c() * t.getWidth(), mmw.c() * t.getHeight());
            super.m.mapRect(rectF);
        }
    }
    
    @Override
    public final <T> void e(final T t, final ieg ieg) {
        super.e(t, ieg);
        if (t == zdg.E) {
            if (ieg == null) {
                this.C = null;
            }
            else {
                this.C = new nnw(ieg, (Object)null);
            }
        }
    }
    
    @Override
    public final void j(final Canvas canvas, final Matrix matrix, final int alpha) {
        final Bitmap t = this.t();
        if (t != null) {
            if (!t.isRecycled()) {
                final float c = mmw.c();
                ((Paint)this.z).setAlpha(alpha);
                final nnw c2 = this.C;
                if (c2 != null) {
                    ((Paint)this.z).setColorFilter((ColorFilter)c2.f());
                }
                canvas.save();
                canvas.concat(matrix);
                this.A.set(0, 0, t.getWidth(), t.getHeight());
                this.B.set(0, 0, (int)(t.getWidth() * c), (int)(t.getHeight() * c));
                canvas.drawBitmap(t, this.A, this.B, (Paint)this.z);
                canvas.restore();
            }
        }
    }
    
    public final Bitmap t() {
        final String g = super.o.g;
        final sdg n = super.n;
        final Drawable$Callback callback = ((Drawable)n).getCallback();
        final Bitmap bitmap = null;
        g6d k0;
        if (callback == null) {
            k0 = null;
        }
        else {
            final g6d k2 = n.K0;
            if (k2 != null) {
                final Drawable$Callback callback2 = ((Drawable)n).getCallback();
                Context context = null;
                Label_0073: {
                    if (callback2 != null) {
                        if (callback2 instanceof View) {
                            context = ((View)callback2).getContext();
                            break Label_0073;
                        }
                    }
                    context = null;
                }
                if ((context != null || k2.a != null) && !k2.a.equals(context)) {
                    n.K0 = null;
                }
            }
            if (n.K0 == null) {
                n.K0 = new g6d(((Drawable)n).getCallback(), n.L0, n.M0, n.D0.d);
            }
            k0 = n.K0;
        }
        Bitmap bitmap2 = bitmap;
        if (k0 != null) {
            final vdg vdg = k0.d.get(g);
            if (vdg == null) {
                bitmap2 = bitmap;
            }
            else {
                bitmap2 = vdg.d;
                if (bitmap2 == null) {
                    final f6d c = k0.c;
                    if (c != null) {
                        final Bitmap a = c.a();
                        if ((bitmap2 = a) != null) {
                            k0.a(g, a);
                            bitmap2 = a;
                        }
                    }
                    else {
                        final String c2 = vdg.c;
                        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                        bitmapFactory$Options.inScaled = true;
                        bitmapFactory$Options.inDensity = 160;
                        if (c2.startsWith("data:") && c2.indexOf("base64,") > 0) {
                            try {
                                final byte[] decode = Base64.decode(c2.substring(c2.indexOf(44) + 1), 0);
                                bitmap2 = BitmapFactory.decodeByteArray(decode, 0, decode.length, bitmapFactory$Options);
                                k0.a(g, bitmap2);
                            }
                            catch (final IllegalArgumentException ex) {
                                z9g.c("data URL did not have correct base64 format.", (Throwable)ex);
                                bitmap2 = bitmap;
                            }
                        }
                        else {
                            try {
                                if (TextUtils.isEmpty((CharSequence)k0.b)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                final AssetManager assets = k0.a.getAssets();
                                final StringBuilder sb = new StringBuilder();
                                sb.append(k0.b);
                                sb.append(c2);
                                bitmap2 = mmw.e(BitmapFactory.decodeStream(assets.open(sb.toString()), (Rect)null, bitmapFactory$Options), vdg.a, vdg.b);
                                k0.a(g, bitmap2);
                            }
                            catch (final IOException ex2) {
                                z9g.c("Unable to open asset.", (Throwable)ex2);
                                bitmap2 = bitmap;
                            }
                        }
                    }
                }
            }
        }
        return bitmap2;
    }
}
