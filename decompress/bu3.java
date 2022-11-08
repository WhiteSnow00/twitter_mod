import android.graphics.Typeface;
import java.util.Iterator;
import android.text.TextUtils;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import android.util.DisplayMetrics;
import android.graphics.Paint$Align;
import android.graphics.Color;
import android.view.ViewConfiguration;
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
public abstract class bu3<T extends du3<? extends s2d<? extends z7a>>> extends ViewGroup implements fu3
{
    public boolean C0;
    public T D0;
    public boolean E0;
    public boolean F0;
    public float G0;
    public now H0;
    public Paint I0;
    public Paint J0;
    public aux K0;
    public boolean L0;
    public up8 M0;
    public i7f N0;
    public vgj O0;
    public gu3 P0;
    public String Q0;
    public ugj R0;
    public k7f S0;
    public w78 T0;
    public eu3 U0;
    public t9x V0;
    public cu3 W0;
    public float X0;
    public float Y0;
    public float Z0;
    public float a1;
    public boolean b1;
    public flc[] c1;
    public float d1;
    public boolean e1;
    public d3d f1;
    public ArrayList<Runnable> g1;
    public boolean h1;
    
    public bu3(final Context context, final AttributeSet set) {
        super(context, set);
        this.C0 = false;
        this.D0 = null;
        this.E0 = true;
        this.F0 = true;
        this.G0 = 0.9f;
        this.H0 = new now(0, 3);
        this.L0 = true;
        this.Q0 = "No chart data available.";
        this.V0 = new t9x();
        this.X0 = 0.0f;
        this.Y0 = 0.0f;
        this.Z0 = 0.0f;
        this.a1 = 0.0f;
        this.b1 = false;
        this.d1 = 0.0f;
        this.e1 = true;
        this.g1 = new ArrayList<Runnable>();
        this.h1 = false;
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
        if (this.D0 == null) {
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
            this.c1 = null;
        }
        else {
            if (this.C0) {
                final StringBuilder g = w48.g("Highlighted: ");
                g.append(flc.toString());
                Log.i("MPAndroidChart", g.toString());
            }
            if (this.D0.f(flc) == null) {
                this.c1 = null;
            }
            else {
                this.c1 = new flc[] { flc };
            }
        }
        this.setLastHighlighted(this.c1);
        if (this.O0 != null) {
            if (!this.k()) {
                this.O0.a();
            }
            else {
                this.O0.b();
            }
        }
        ((View)this).invalidate();
    }
    
    public final void g(final flc[] c1) {
        this.setLastHighlighted(this.c1 = c1);
        ((View)this).invalidate();
    }
    
    public cu3 getAnimator() {
        return this.W0;
    }
    
    public gfg getCenter() {
        return gfg.b(((View)this).getWidth() / 2.0f, ((View)this).getHeight() / 2.0f);
    }
    
    public gfg getCenterOfView() {
        return this.getCenter();
    }
    
    public gfg getCenterOffsets() {
        final t9x v0 = this.V0;
        return gfg.b(v0.b.centerX(), v0.b.centerY());
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
        return this.V0.b;
    }
    
    public T getData() {
        return this.D0;
    }
    
    public z3d getDefaultValueFormatter() {
        return (z3d)this.H0;
    }
    
    public up8 getDescription() {
        return this.M0;
    }
    
    public float getDragDecelerationFrictionCoef() {
        return this.G0;
    }
    
    public float getExtraBottomOffset() {
        return this.Z0;
    }
    
    public float getExtraLeftOffset() {
        return this.a1;
    }
    
    public float getExtraRightOffset() {
        return this.Y0;
    }
    
    public float getExtraTopOffset() {
        return this.X0;
    }
    
    public flc[] getHighlighted() {
        return this.c1;
    }
    
    public x2d getHighlighter() {
        return (x2d)this.U0;
    }
    
    public ArrayList<Runnable> getJobs() {
        return this.g1;
    }
    
    public i7f getLegend() {
        return this.N0;
    }
    
    public k7f getLegendRenderer() {
        return this.S0;
    }
    
    public d3d getMarker() {
        return this.f1;
    }
    
    @Deprecated
    public d3d getMarkerView() {
        return this.getMarker();
    }
    
    public float getMaxHighlightDistance() {
        return this.d1;
    }
    
    public ugj getOnChartGestureListener() {
        return this.R0;
    }
    
    public gu3 getOnTouchListener() {
        return this.P0;
    }
    
    public w78 getRenderer() {
        return this.T0;
    }
    
    public t9x getViewPortHandler() {
        return this.V0;
    }
    
    public aux getXAxis() {
        return this.K0;
    }
    
    public float getXChartMax() {
        return ((qe1)this.K0).q;
    }
    
    public float getXChartMin() {
        return ((qe1)this.K0).r;
    }
    
    public float getXRange() {
        return ((qe1)this.K0).s;
    }
    
    public float getYMax() {
        return this.D0.a;
    }
    
    public float getYMin() {
        return this.D0.b;
    }
    
    public void h() {
        ((View)this).setWillNotDraw(false);
        this.W0 = new cu3((ValueAnimator$AnimatorUpdateListener)new bu3$a(this));
        final Context context = ((View)this).getContext();
        final DisplayMetrics a = nmw.a;
        if (context == null) {
            nmw.b = ViewConfiguration.getMinimumFlingVelocity();
            nmw.c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        }
        else {
            final ViewConfiguration value = ViewConfiguration.get(context);
            nmw.b = value.getScaledMinimumFlingVelocity();
            nmw.c = value.getScaledMaximumFlingVelocity();
            nmw.a = context.getResources().getDisplayMetrics();
        }
        this.d1 = nmw.c(500.0f);
        this.M0 = new up8();
        final i7f n0 = new i7f();
        this.N0 = n0;
        this.S0 = new k7f(this.V0, n0);
        this.K0 = new aux();
        this.I0 = new Paint(1);
        (this.J0 = new Paint(1)).setColor(Color.rgb(247, 189, 51));
        this.J0.setTextAlign(Paint$Align.CENTER);
        this.J0.setTextSize(nmw.c(12.0f));
        if (this.C0) {
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
        final flc[] c1 = this.c1;
        boolean b2;
        final boolean b = b2 = false;
        if (c1 != null) {
            b2 = b;
            if (c1.length > 0) {
                b2 = (c1[0] != null || b);
            }
        }
        return b2;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.h1) {
            this.j((View)this);
        }
    }
    
    public void onDraw(final Canvas canvas) {
        if (this.D0 == null) {
            if (TextUtils.isEmpty((CharSequence)this.Q0) ^ true) {
                final gfg center = this.getCenter();
                canvas.drawText(this.Q0, center.b, center.c, this.J0);
            }
            return;
        }
        if (!this.b1) {
            this.b();
            this.b1 = true;
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            this.getChildAt(i).layout(n, n2, n3, n4);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final int n3 = (int)nmw.c(50.0f);
        ((View)this).setMeasuredDimension(Math.max(((View)this).getSuggestedMinimumWidth(), View.resolveSize(n3, n)), Math.max(((View)this).getSuggestedMinimumHeight(), View.resolveSize(n3, n2)));
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        if (this.C0) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (n > 0 && n2 > 0 && n < 10000 && n2 < 10000) {
            final t9x v0 = this.V0;
            final float c = (float)n;
            final float d = (float)n2;
            final RectF b = v0.b;
            final float left = b.left;
            final float top = b.top;
            final float l = v0.l();
            final float k = v0.k();
            v0.d = d;
            v0.c = c;
            v0.n(left, top, l, k);
            if (this.C0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Setting chart dimens, width: ");
                sb.append(n);
                sb.append(", height: ");
                sb.append(n2);
                Log.i("MPAndroidChart", sb.toString());
            }
            final Iterator<Runnable> iterator = this.g1.iterator();
            while (iterator.hasNext()) {
                ((View)this).post((Runnable)iterator.next());
            }
            this.g1.clear();
        }
        this.i();
        super.onSizeChanged(n, n2, n3, n4);
    }
    
    public void setData(final T d0) {
        this.D0 = d0;
        int n = 0;
        this.b1 = false;
        if (d0 == null) {
            return;
        }
        final float b = d0.b;
        final float a = d0.a;
        float n2;
        if (d0.e() < 2) {
            n2 = Math.max(Math.abs(b), Math.abs(a));
        }
        else {
            n2 = Math.abs(a - b);
        }
        final float e = nmw.e((double)n2);
        if (!Float.isInfinite(e)) {
            n = (int)Math.ceil(-Math.log10(e)) + 2;
        }
        this.H0.g(n);
        for (final s2d s2d : this.D0.i) {
            if (s2d.Q() || s2d.l() == this.H0) {
                s2d.E((z3d)this.H0);
            }
        }
        this.i();
        if (this.C0) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }
    
    public void setDescription(final up8 m0) {
        this.M0 = m0;
    }
    
    public void setDragDecelerationEnabled(final boolean f0) {
        this.F0 = f0;
    }
    
    public void setDragDecelerationFrictionCoef(float g0) {
        float n = g0;
        if (g0 < 0.0f) {
            n = 0.0f;
        }
        g0 = n;
        if (n >= 1.0f) {
            g0 = 0.999f;
        }
        this.G0 = g0;
    }
    
    @Deprecated
    public void setDrawMarkerViews(final boolean drawMarkers) {
        this.setDrawMarkers(drawMarkers);
    }
    
    public void setDrawMarkers(final boolean e1) {
        this.e1 = e1;
    }
    
    public void setExtraBottomOffset(final float n) {
        this.Z0 = nmw.c(n);
    }
    
    public void setExtraLeftOffset(final float n) {
        this.a1 = nmw.c(n);
    }
    
    public void setExtraRightOffset(final float n) {
        this.Y0 = nmw.c(n);
    }
    
    public void setExtraTopOffset(final float n) {
        this.X0 = nmw.c(n);
    }
    
    public void setHardwareAccelerationEnabled(final boolean b) {
        if (b) {
            ((View)this).setLayerType(2, (Paint)null);
        }
        else {
            ((View)this).setLayerType(1, (Paint)null);
        }
    }
    
    public void setHighlightPerTapEnabled(final boolean e0) {
        this.E0 = e0;
    }
    
    public void setHighlighter(final eu3 u0) {
        this.U0 = u0;
    }
    
    public void setLastHighlighted(final flc[] array) {
        if (array != null && array.length > 0 && array[0] != null) {
            this.P0.E0 = array[0];
        }
        else {
            this.P0.E0 = null;
        }
    }
    
    public void setLogEnabled(final boolean c0) {
        this.C0 = c0;
    }
    
    public void setMarker(final d3d f1) {
        this.f1 = f1;
    }
    
    @Deprecated
    public void setMarkerView(final d3d marker) {
        this.setMarker(marker);
    }
    
    public void setMaxHighlightDistance(final float n) {
        this.d1 = nmw.c(n);
    }
    
    public void setNoDataText(final String q0) {
        this.Q0 = q0;
    }
    
    public void setNoDataTextColor(final int color) {
        this.J0.setColor(color);
    }
    
    public void setNoDataTextTypeface(final Typeface typeface) {
        this.J0.setTypeface(typeface);
    }
    
    public void setOnChartGestureListener(final ugj r0) {
        this.R0 = r0;
    }
    
    public void setOnChartValueSelectedListener(final vgj o0) {
        this.O0 = o0;
    }
    
    public void setOnTouchListener(final gu3 p) {
        this.P0 = p;
    }
    
    public void setRenderer(final w78 t0) {
        if (t0 != null) {
            this.T0 = t0;
        }
    }
    
    public void setTouchEnabled(final boolean l0) {
        this.L0 = l0;
    }
    
    public void setUnbindEnabled(final boolean h1) {
        this.h1 = h1;
    }
}
