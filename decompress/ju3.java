import android.graphics.Typeface;
import java.util.Iterator;
import android.text.TextUtils;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import android.util.DisplayMetrics;
import android.graphics.Paint$Align;
import android.graphics.Color;
import android.view.ViewConfiguration;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.ViewParent;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.graphics.Paint;
import android.annotation.SuppressLint;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "NewApi" })
public abstract class ju3<T extends lu3<? extends x2d<? extends n8a>>> extends ViewGroup implements nu3
{
    public boolean F0;
    public T G0;
    public boolean H0;
    public boolean I0;
    public float J0;
    public xpw K0;
    public Paint L0;
    public Paint M0;
    public jvx N0;
    public boolean O0;
    public iq8 P0;
    public r7f Q0;
    public phj R0;
    public ou3 S0;
    public String T0;
    public ohj U0;
    public t7f V0;
    public l88 W0;
    public mu3 X0;
    public hbx Y0;
    public ku3 Z0;
    public float a1;
    public float b1;
    public float c1;
    public float d1;
    public boolean e1;
    public flc[] f1;
    public float g1;
    public boolean h1;
    public i3d i1;
    public ArrayList<Runnable> j1;
    public boolean k1;
    
    public ju3(final Context context, final AttributeSet set) {
        super(context, set);
        this.F0 = false;
        this.G0 = null;
        this.H0 = true;
        this.I0 = true;
        this.J0 = 0.9f;
        this.K0 = new xpw(0, 3);
        this.O0 = true;
        this.T0 = "No chart data available.";
        this.Y0 = new hbx();
        this.a1 = 0.0f;
        this.b1 = 0.0f;
        this.c1 = 0.0f;
        this.d1 = 0.0f;
        this.e1 = false;
        this.g1 = 0.0f;
        this.h1 = true;
        this.j1 = new ArrayList<Runnable>();
        this.k1 = false;
        this.h();
    }
    
    public abstract void b();
    
    public final void c() {
        final ViewParent parent = ((View)this).getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
    
    public flc d(final float n, final float n2) {
        if (this.G0 == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        return this.getHighlighter().a(n, n2);
    }
    
    public float[] e(final flc flc) {
        return new float[] { flc.i, flc.j };
    }
    
    public final void f(final flc flc) {
        if (flc == null) {
            this.f1 = null;
        }
        else {
            if (this.F0) {
                final StringBuilder f = ehk.f("Highlighted: ");
                f.append(flc.toString());
                Log.i("MPAndroidChart", f.toString());
            }
            if (this.G0.f(flc) == null) {
                this.f1 = null;
            }
            else {
                this.f1 = new flc[] { flc };
            }
        }
        this.setLastHighlighted(this.f1);
        if (this.R0 != null) {
            if (!this.k()) {
                this.R0.a();
            }
            else {
                this.R0.b();
            }
        }
        ((View)this).invalidate();
    }
    
    public final void g(final flc[] f1) {
        this.setLastHighlighted(this.f1 = f1);
        ((View)this).invalidate();
    }
    
    public ku3 getAnimator() {
        return this.Z0;
    }
    
    public qfg getCenter() {
        return qfg.b(((View)this).getWidth() / 2.0f, ((View)this).getHeight() / 2.0f);
    }
    
    public qfg getCenterOfView() {
        return this.getCenter();
    }
    
    public qfg getCenterOffsets() {
        final hbx y0 = this.Y0;
        return qfg.b(y0.b.centerX(), y0.b.centerY());
    }
    
    public Bitmap getChartBitmap() {
        final Bitmap bitmap = Bitmap.createBitmap(((View)this).getWidth(), ((View)this).getHeight(), Bitmap$Config.RGB_565);
        final Canvas canvas = new Canvas(bitmap);
        final Drawable background = ((View)this).getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        else {
            canvas.drawColor(-1);
        }
        ((View)this).draw(canvas);
        return bitmap;
    }
    
    public RectF getContentRect() {
        return this.Y0.b;
    }
    
    public T getData() {
        return this.G0;
    }
    
    public e4d getDefaultValueFormatter() {
        return (e4d)this.K0;
    }
    
    public iq8 getDescription() {
        return this.P0;
    }
    
    public float getDragDecelerationFrictionCoef() {
        return this.J0;
    }
    
    public float getExtraBottomOffset() {
        return this.c1;
    }
    
    public float getExtraLeftOffset() {
        return this.d1;
    }
    
    public float getExtraRightOffset() {
        return this.b1;
    }
    
    public float getExtraTopOffset() {
        return this.a1;
    }
    
    public flc[] getHighlighted() {
        return this.f1;
    }
    
    public c3d getHighlighter() {
        return (c3d)this.X0;
    }
    
    public ArrayList<Runnable> getJobs() {
        return this.j1;
    }
    
    public r7f getLegend() {
        return this.Q0;
    }
    
    public t7f getLegendRenderer() {
        return this.V0;
    }
    
    public i3d getMarker() {
        return this.i1;
    }
    
    @Deprecated
    public i3d getMarkerView() {
        return this.getMarker();
    }
    
    public float getMaxHighlightDistance() {
        return this.g1;
    }
    
    public abstract int getMaxVisibleCount();
    
    public ohj getOnChartGestureListener() {
        return this.U0;
    }
    
    public ou3 getOnTouchListener() {
        return this.S0;
    }
    
    public l88 getRenderer() {
        return this.W0;
    }
    
    public hbx getViewPortHandler() {
        return this.Y0;
    }
    
    public jvx getXAxis() {
        return this.N0;
    }
    
    public float getXChartMax() {
        return ((pe1)this.N0).q;
    }
    
    public float getXChartMin() {
        return ((pe1)this.N0).r;
    }
    
    public float getXRange() {
        return ((pe1)this.N0).s;
    }
    
    public abstract float getYChartMax();
    
    public abstract float getYChartMin();
    
    public float getYMax() {
        return this.G0.a;
    }
    
    public float getYMin() {
        return this.G0.b;
    }
    
    public void h() {
        ((View)this).setWillNotDraw(false);
        this.Z0 = new ku3((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener(this) {
            public final ju3 F0;
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                ((View)this.F0).postInvalidate();
            }
        });
        final Context context = ((View)this).getContext();
        final DisplayMetrics a = xnw.a;
        if (context == null) {
            xnw.b = ViewConfiguration.getMinimumFlingVelocity();
            xnw.c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        }
        else {
            final ViewConfiguration value = ViewConfiguration.get(context);
            xnw.b = value.getScaledMinimumFlingVelocity();
            xnw.c = value.getScaledMaximumFlingVelocity();
            xnw.a = context.getResources().getDisplayMetrics();
        }
        this.g1 = xnw.c(500.0f);
        this.P0 = new iq8();
        final r7f q0 = new r7f();
        this.Q0 = q0;
        this.V0 = new t7f(this.Y0, q0);
        this.N0 = new jvx();
        this.L0 = new Paint(1);
        (this.M0 = new Paint(1)).setColor(Color.rgb(247, 189, 51));
        this.M0.setTextAlign(Paint$Align.CENTER);
        this.M0.setTextSize(xnw.c(12.0f));
        if (this.F0) {
            Log.i("", "Chart.init()");
        }
    }
    
    public abstract void i();
    
    public final void j(final View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback((Drawable$Callback)null);
        }
        if (view instanceof ViewGroup) {
            int n = 0;
            ViewGroup viewGroup;
            while (true) {
                viewGroup = (ViewGroup)view;
                if (n >= viewGroup.getChildCount()) {
                    break;
                }
                this.j(viewGroup.getChildAt(n));
                ++n;
            }
            viewGroup.removeAllViews();
        }
    }
    
    public final boolean k() {
        final flc[] f1 = this.f1;
        boolean b2;
        final boolean b = b2 = false;
        if (f1 != null) {
            b2 = b;
            if (f1.length > 0) {
                b2 = (f1[0] != null || b);
            }
        }
        return b2;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.k1) {
            this.j((View)this);
        }
    }
    
    public void onDraw(final Canvas canvas) {
        if (this.G0 == null) {
            if (TextUtils.isEmpty((CharSequence)this.T0) ^ true) {
                final qfg center = this.getCenter();
                canvas.drawText(this.T0, center.b, center.c, this.M0);
            }
            return;
        }
        if (!this.e1) {
            this.b();
            this.e1 = true;
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            this.getChildAt(i).layout(n, n2, n3, n4);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final int n3 = (int)xnw.c(50.0f);
        ((View)this).setMeasuredDimension(Math.max(((View)this).getSuggestedMinimumWidth(), View.resolveSize(n3, n)), Math.max(((View)this).getSuggestedMinimumHeight(), View.resolveSize(n3, n2)));
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        if (this.F0) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (n > 0 && n2 > 0 && n < 10000 && n2 < 10000) {
            final hbx y0 = this.Y0;
            final float c = (float)n;
            final float d = (float)n2;
            final RectF b = y0.b;
            final float left = b.left;
            final float top = b.top;
            final float l = y0.l();
            final float k = y0.k();
            y0.d = d;
            y0.c = c;
            y0.n(left, top, l, k);
            if (this.F0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Setting chart dimens, width: ");
                sb.append(n);
                sb.append(", height: ");
                sb.append(n2);
                Log.i("MPAndroidChart", sb.toString());
            }
            final Iterator<Runnable> iterator = this.j1.iterator();
            while (iterator.hasNext()) {
                ((View)this).post((Runnable)iterator.next());
            }
            this.j1.clear();
        }
        this.i();
        super.onSizeChanged(n, n2, n3, n4);
    }
    
    public void setData(final T g0) {
        this.G0 = g0;
        int n = 0;
        this.e1 = false;
        if (g0 == null) {
            return;
        }
        final float b = g0.b;
        final float a = g0.a;
        float n2;
        if (g0.e() < 2) {
            n2 = Math.max(Math.abs(b), Math.abs(a));
        }
        else {
            n2 = Math.abs(a - b);
        }
        final float e = xnw.e((double)n2);
        if (!Float.isInfinite(e)) {
            n = (int)Math.ceil(-Math.log10(e)) + 2;
        }
        this.K0.l(n);
        for (final x2d x2d : this.G0.i) {
            if (x2d.Q() || x2d.l() == this.K0) {
                x2d.E((e4d)this.K0);
            }
        }
        this.i();
        if (this.F0) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }
    
    public void setDescription(final iq8 p) {
        this.P0 = p;
    }
    
    public void setDragDecelerationEnabled(final boolean i0) {
        this.I0 = i0;
    }
    
    public void setDragDecelerationFrictionCoef(float j0) {
        float n = j0;
        if (j0 < 0.0f) {
            n = 0.0f;
        }
        j0 = n;
        if (n >= 1.0f) {
            j0 = 0.999f;
        }
        this.J0 = j0;
    }
    
    @Deprecated
    public void setDrawMarkerViews(final boolean drawMarkers) {
        this.setDrawMarkers(drawMarkers);
    }
    
    public void setDrawMarkers(final boolean h1) {
        this.h1 = h1;
    }
    
    public void setExtraBottomOffset(final float n) {
        this.c1 = xnw.c(n);
    }
    
    public void setExtraLeftOffset(final float n) {
        this.d1 = xnw.c(n);
    }
    
    public void setExtraRightOffset(final float n) {
        this.b1 = xnw.c(n);
    }
    
    public void setExtraTopOffset(final float n) {
        this.a1 = xnw.c(n);
    }
    
    public void setHardwareAccelerationEnabled(final boolean b) {
        if (b) {
            ((View)this).setLayerType(2, (Paint)null);
        }
        else {
            ((View)this).setLayerType(1, (Paint)null);
        }
    }
    
    public void setHighlightPerTapEnabled(final boolean h0) {
        this.H0 = h0;
    }
    
    public void setHighlighter(final mu3 x0) {
        this.X0 = x0;
    }
    
    public void setLastHighlighted(final flc[] array) {
        if (array != null && array.length > 0 && array[0] != null) {
            this.S0.H0 = array[0];
        }
        else {
            this.S0.H0 = null;
        }
    }
    
    public void setLogEnabled(final boolean f0) {
        this.F0 = f0;
    }
    
    public void setMarker(final i3d i1) {
        this.i1 = i1;
    }
    
    @Deprecated
    public void setMarkerView(final i3d marker) {
        this.setMarker(marker);
    }
    
    public void setMaxHighlightDistance(final float n) {
        this.g1 = xnw.c(n);
    }
    
    public void setNoDataText(final String t0) {
        this.T0 = t0;
    }
    
    public void setNoDataTextColor(final int color) {
        this.M0.setColor(color);
    }
    
    public void setNoDataTextTypeface(final Typeface typeface) {
        this.M0.setTypeface(typeface);
    }
    
    public void setOnChartGestureListener(final ohj u0) {
        this.U0 = u0;
    }
    
    public void setOnChartValueSelectedListener(final phj r0) {
        this.R0 = r0;
    }
    
    public void setOnTouchListener(final ou3 s0) {
        this.S0 = s0;
    }
    
    public void setRenderer(final l88 w0) {
        if (w0 != null) {
            this.W0 = w0;
        }
    }
    
    public void setTouchEnabled(final boolean o0) {
        this.O0 = o0;
    }
    
    public void setUnbindEnabled(final boolean k1) {
        this.k1 = k1;
    }
}
