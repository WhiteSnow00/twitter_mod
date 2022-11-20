// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.qrcodes.view;

import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Path$Direction;
import java.util.Arrays;
import android.graphics.Path;
import android.graphics.PorterDuff$Mode;
import com.google.zxing.WriterException;
import java.util.Map;
import java.util.HashMap;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.media.ui.image.UserImageView;
import android.widget.ImageView;
import java.util.Random;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Bitmap;
import android.widget.RelativeLayout;

public class QRCodeView extends RelativeLayout
{
    public final Bitmap D0;
    public final RectF E0;
    public final Paint F0;
    public final int[] G0;
    public final int H0;
    public int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final Random N0;
    public b63 O0;
    public ImageView P0;
    public UserImageView Q0;
    public float R0;
    public int S0;
    
    public QRCodeView(final Context context, AttributeSet obtainStyledAttributes) {
        super(context, obtainStyledAttributes, 0);
        this.E0 = new RectF();
        final Random n0 = new Random();
        this.N0 = n0;
        ((View)this).setWillNotDraw(false);
        final int[] g0 = { kn6.b(context, 2131100865), kn6.b(context, 2131099946), kn6.b(context, 2131100548), kn6.b(context, 2131099729), kn6.b(context, 2131100704) };
        this.G0 = g0;
        this.I0 = g0[n0.nextInt(5)];
        obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, wj1.I0, 0, 0);
        try {
            this.H0 = ((TypedArray)obtainStyledAttributes).getColor(2, kn6.b(context, 2131100880));
            final int dimensionPixelSize = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(4, 1);
            this.J0 = dimensionPixelSize;
            this.K0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(3, 0);
            this.L0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(1, 0);
            this.M0 = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(0, 0);
            ((TypedArray)obtainStyledAttributes).recycle();
            this.D0 = b12.d(edq.f(dimensionPixelSize), Bitmap$Config.ARGB_8888);
            this.F0 = new Paint(3);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public b63 getQRCodeMatrix() {
        cj1.g();
        return this.O0;
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.D0 != null) {
            final int width = ((View)this).getWidth();
            final int height = ((View)this).getHeight();
            final int j0 = this.J0;
            final float n = (width - j0) / 2.0f;
            final float n2 = (height - j0) / 2.0f;
            final RectF e0 = this.E0;
            final int m0 = this.M0;
            e0.set((float)m0, (float)m0, (float)(width - m0), (float)(height - m0));
            this.F0.setColor(this.I0);
            this.F0.setStyle(Paint$Style.FILL);
            final RectF e2 = this.E0;
            final int l0 = this.L0;
            canvas.drawRoundRect(e2, (float)l0, (float)l0, this.F0);
            this.F0.setColor(this.H0);
            this.F0.setStyle(Paint$Style.STROKE);
            this.F0.setStrokeWidth((float)this.M0);
            final RectF e3 = this.E0;
            final int l2 = this.L0;
            canvas.drawRoundRect(e3, (float)l2, (float)l2, this.F0);
            canvas.drawBitmap(this.D0, n, n2, (Paint)null);
        }
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.P0 = (ImageView)((View)this).findViewById(2131429889);
        (this.Q0 = (UserImageView)((View)this).findViewById(2131432470)).F(kn6.b(((View)this).getContext(), 2131100711), 2131167224);
    }
    
    public void setLogo(final ImageView p) {
        cj1.g();
        this.P0 = p;
    }
    
    public void setUser(final cgv cgv) {
        if (cgv != null) {
            this.Q0.H(cgv);
            final String string = jsl.a.buildUpon().appendPath(cgv.K0).toString();
            final HashMap hashMap = new HashMap();
            hashMap.put(g3a.E0, "UTF-8");
            b63 e;
            try {
                e = p3a.b(string, a8a.F0, (Map)hashMap).e;
            }
            catch (final WriterException ex) {
                m8a.d((Throwable)ex);
                e = null;
            }
            this.O0 = e;
            if (e != null && this.D0 != null) {
                final int b = e.b;
                this.R0 = this.J0 / (float)b;
                int s0 = b / 3;
                if (s0 % 2 != 1) {
                    ++s0;
                }
                this.S0 = s0;
                jee.l((Object)e);
                final int b2 = e.b;
                final int c = this.O0.c;
                final Bitmap d0 = this.D0;
                jee.l((Object)d0);
                final Canvas canvas = new Canvas(d0);
                canvas.drawColor(0, PorterDuff$Mode.CLEAR);
                final int s2 = this.S0;
                final int n = (b2 - s2) / 2;
                final int n2 = (c - s2) / 2;
                for (int i = n; i < this.S0 + n; ++i) {
                    for (int j = n2; j < this.S0 + n2; ++j) {
                        this.O0.c(i, j, false);
                    }
                }
                for (int k = b2 - 6; k < b2; ++k) {
                    for (int l = c - 5; l < c; ++l) {
                        this.O0.c(k, l, false);
                    }
                }
                final Path path = new Path();
                final float[] array = new float[8];
                this.F0.setColor(this.H0);
                this.F0.setStyle(Paint$Style.FILL);
                for (int n3 = 0; n3 < b2; ++n3) {
                    for (int n4 = 0; n4 < c; ++n4) {
                        if (this.O0.a(n3, n4) > 0) {
                            Arrays.fill(array, (float)this.K0);
                            final int n5 = n3 - 1;
                            boolean b3 = false;
                            Label_0439: {
                                if (n5 >= 0) {
                                    final b63 o0 = this.O0;
                                    if (o0 != null && o0.a(n5, n4) > 0) {
                                        b3 = true;
                                        break Label_0439;
                                    }
                                }
                                b3 = false;
                            }
                            if (b3) {
                                array[6] = (array[7] = 0.0f);
                                array[0] = (array[1] = 0.0f);
                            }
                            final int n6 = n4 - 1;
                            boolean b4 = false;
                            Label_0509: {
                                if (n6 >= 0) {
                                    final b63 o2 = this.O0;
                                    if (o2 != null && o2.a(n3, n6) > 0) {
                                        b4 = true;
                                        break Label_0509;
                                    }
                                }
                                b4 = false;
                            }
                            if (b4) {
                                array[2] = (array[3] = 0.0f);
                                array[0] = (array[1] = 0.0f);
                            }
                            final b63 o3 = this.O0;
                            boolean b5 = false;
                            Label_0582: {
                                if (o3 != null) {
                                    final int n7 = n3 + 1;
                                    if (n7 < o3.b && o3.a(n7, n4) > 0) {
                                        b5 = true;
                                        break Label_0582;
                                    }
                                }
                                b5 = false;
                            }
                            if (b5) {
                                array[4] = (array[5] = 0.0f);
                                array[2] = (array[3] = 0.0f);
                            }
                            final b63 o4 = this.O0;
                            boolean b6 = false;
                            Label_0655: {
                                if (o4 != null) {
                                    final int n8 = n4 + 1;
                                    if (n8 < o4.c && o4.a(n3, n8) > 0) {
                                        b6 = true;
                                        break Label_0655;
                                    }
                                }
                                b6 = false;
                            }
                            if (b6) {
                                array[6] = (array[7] = 0.0f);
                                array[4] = (array[5] = 0.0f);
                            }
                            final float n9 = (float)n3;
                            final float r0 = this.R0;
                            final float n10 = n9 * r0;
                            final float n11 = n4 * r0;
                            this.E0.set((float)Math.round(n10), (float)Math.round(n11), (float)Math.round(n10 + this.R0), (float)Math.round(n11 + this.R0));
                            path.reset();
                            path.addRoundRect(this.E0, array, Path$Direction.CW);
                            canvas.drawPath(path, this.F0);
                        }
                    }
                }
                final ViewGroup$LayoutParams layoutParams = ((View)this.P0).getLayoutParams();
                layoutParams.width = Math.round(this.R0 * 5.0f);
                ((View)this.P0).setLayoutParams(layoutParams);
                this.Q0.setSize(Math.round((this.S0 - 2) * this.R0));
            }
        }
    }
    
    public void setUserImageView(final UserImageView q0) {
        cj1.g();
        this.Q0 = q0;
    }
}
