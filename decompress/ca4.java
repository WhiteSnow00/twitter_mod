import android.animation.Animator;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Paint;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Path$FillType;
import android.graphics.Path;
import android.graphics.Canvas;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.Objects;
import android.content.Context;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.animation.LinearInterpolator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ca4 extends Drawable implements Animatable
{
    public static final LinearInterpolator J0;
    public static final kra K0;
    public static final int[] L0;
    public final a D0;
    public float E0;
    public Resources F0;
    public ValueAnimator G0;
    public float H0;
    public boolean I0;
    
    static {
        J0 = new LinearInterpolator();
        K0 = new kra();
        L0 = new int[] { -16777216 };
    }
    
    public ca4(final Context context) {
        Objects.requireNonNull(context);
        this.F0 = context.getResources();
        final a d0 = new a();
        this.D0 = d0;
        d0.i = ca4.L0;
        d0.a(0);
        d0.h = 2.5f;
        d0.b.setStrokeWidth(2.5f);
        this.invalidateSelf();
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new aa4(this, d0));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator((TimeInterpolator)ca4.J0);
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new ba4(this, d0));
        this.G0 = ofFloat;
    }
    
    public final void a(final float n, final a a, final boolean b) {
        if (this.I0) {
            this.d(n, a);
            final float n2 = (float)(Math.floor(a.m / 0.8f) + 1.0);
            final float k = a.k;
            final float l = a.l;
            a.e = (l - 0.01f - k) * n + k;
            a.f = l;
            final float m = a.m;
            a.g = k6e.e(n2, m, n, m);
        }
        else if (n != 1.0f || b) {
            final float i = a.m;
            float j;
            float f;
            if (n < 0.5f) {
                final float n3 = n / 0.5f;
                j = a.k;
                f = ((pcg)ca4.K0).getInterpolation(n3) * 0.79f + 0.01f + j;
            }
            else {
                final float n4 = (n - 0.5f) / 0.5f;
                f = a.k + 0.79f;
                j = f - ((1.0f - ((pcg)ca4.K0).getInterpolation(n4)) * 0.79f + 0.01f);
            }
            final float h0 = this.H0;
            a.e = j;
            a.f = f;
            a.g = 0.20999998f * n + i;
            this.E0 = (n + h0) * 216.0f;
        }
    }
    
    public final void b(final float n, float n2, final float n3, final float n4) {
        final a d0 = this.D0;
        final float density = this.F0.getDisplayMetrics().density;
        n2 *= density;
        d0.h = n2;
        d0.b.setStrokeWidth(n2);
        d0.q = n * density;
        d0.a(0);
        d0.r = (int)(n3 * density);
        d0.s = (int)(n4 * density);
    }
    
    public final void c(final int n) {
        if (n == 0) {
            this.b(11.0f, 3.0f, 12.0f, 6.0f);
        }
        else {
            this.b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        this.invalidateSelf();
    }
    
    public final void d(float n, final a a) {
        if (n > 0.75f) {
            n = (n - 0.75f) / 0.25f;
            final int[] i = a.i;
            final int j = a.j;
            final int n2 = i[j];
            final int n3 = i[(j + 1) % i.length];
            final int n4 = n2 >> 24 & 0xFF;
            final int n5 = n2 >> 16 & 0xFF;
            final int n6 = n2 >> 8 & 0xFF;
            final int n7 = n2 & 0xFF;
            a.u = (n4 + (int)(((n3 >> 24 & 0xFF) - n4) * n) << 24 | n5 + (int)(((n3 >> 16 & 0xFF) - n5) * n) << 16 | n6 + (int)(((n3 >> 8 & 0xFF) - n6) * n) << 8 | n7 + (int)(n * ((n3 & 0xFF) - n7)));
        }
        else {
            a.u = a.i[a.j];
        }
    }
    
    public final void draw(final Canvas canvas) {
        final Rect bounds = this.getBounds();
        canvas.save();
        canvas.rotate(this.E0, bounds.exactCenterX(), bounds.exactCenterY());
        final a d0 = this.D0;
        final RectF a = d0.a;
        final float q = d0.q;
        float n = d0.h / 2.0f + q;
        if (q <= 0.0f) {
            n = Math.min(bounds.width(), bounds.height()) / 2.0f - Math.max(d0.r * d0.p / 2.0f, d0.h / 2.0f);
        }
        a.set(bounds.centerX() - n, bounds.centerY() - n, bounds.centerX() + n, bounds.centerY() + n);
        final float e = d0.e;
        final float g = d0.g;
        final float n2 = (e + g) * 360.0f;
        final float n3 = (d0.f + g) * 360.0f - n2;
        d0.b.setColor(d0.u);
        d0.b.setAlpha(d0.t);
        final float n4 = d0.h / 2.0f;
        a.inset(n4, n4);
        canvas.drawCircle(a.centerX(), a.centerY(), a.width() / 2.0f, d0.d);
        final float n5 = -n4;
        a.inset(n5, n5);
        canvas.drawArc(a, n2, n3, false, d0.b);
        if (d0.n) {
            final Path o = d0.o;
            if (o == null) {
                (d0.o = new Path()).setFillType(Path$FillType.EVEN_ODD);
            }
            else {
                o.reset();
            }
            final float n6 = Math.min(a.width(), a.height()) / 2.0f;
            final float n7 = d0.r * d0.p / 2.0f;
            d0.o.moveTo(0.0f, 0.0f);
            d0.o.lineTo(d0.r * d0.p, 0.0f);
            final Path o2 = d0.o;
            final float n8 = (float)d0.r;
            final float p = d0.p;
            o2.lineTo(n8 * p / 2.0f, d0.s * p);
            d0.o.offset(a.centerX() + n6 - n7, d0.h / 2.0f + a.centerY());
            d0.o.close();
            d0.c.setColor(d0.u);
            d0.c.setAlpha(d0.t);
            canvas.save();
            canvas.rotate(n2 + n3, a.centerX(), a.centerY());
            canvas.drawPath(d0.o, d0.c);
            canvas.restore();
        }
        canvas.restore();
    }
    
    public final int getAlpha() {
        return this.D0.t;
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final boolean isRunning() {
        return ((Animator)this.G0).isRunning();
    }
    
    public final void setAlpha(final int t) {
        this.D0.t = t;
        this.invalidateSelf();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.D0.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public final void start() {
        ((Animator)this.G0).cancel();
        final a d0 = this.D0;
        final float e = d0.e;
        d0.k = e;
        final float f = d0.f;
        d0.l = f;
        d0.m = d0.g;
        if (f != e) {
            this.I0 = true;
            ((Animator)this.G0).setDuration(666L);
            ((Animator)this.G0).start();
        }
        else {
            d0.a(0);
            final a d2 = this.D0;
            d2.k = 0.0f;
            d2.l = 0.0f;
            d2.m = 0.0f;
            d2.e = 0.0f;
            d2.f = 0.0f;
            d2.g = 0.0f;
            ((Animator)this.G0).setDuration(1332L);
            ((Animator)this.G0).start();
        }
    }
    
    public final void stop() {
        ((Animator)this.G0).cancel();
        this.E0 = 0.0f;
        this.D0.b(false);
        this.D0.a(0);
        final a d0 = this.D0;
        d0.k = 0.0f;
        d0.l = 0.0f;
        d0.m = 0.0f;
        d0.e = 0.0f;
        d0.f = 0.0f;
        d0.g = 0.0f;
        this.invalidateSelf();
    }
    
    public static final class a
    {
        public final RectF a;
        public final Paint b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;
        
        public a() {
            this.a = new RectF();
            final Paint b = new Paint();
            this.b = b;
            final Paint c = new Paint();
            this.c = c;
            final Paint d = new Paint();
            this.d = d;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            b.setStrokeCap(Paint$Cap.SQUARE);
            b.setAntiAlias(true);
            b.setStyle(Paint$Style.STROKE);
            c.setStyle(Paint$Style.FILL);
            c.setAntiAlias(true);
            d.setColor(0);
        }
        
        public final void a(final int j) {
            this.j = j;
            this.u = this.i[j];
        }
        
        public final void b(final boolean n) {
            if (this.n != n) {
                this.n = n;
            }
        }
    }
}
