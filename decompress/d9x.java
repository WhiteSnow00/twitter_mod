import android.view.ViewGroup;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.view.ViewOutlineProvider;
import java.util.Objects;
import android.graphics.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import android.graphics.Matrix;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d9x extends View implements mrj
{
    public static final d9x.d9x$c Companion;
    public static final hub<View, Matrix, vzv> R0;
    public static final d9x$a S0;
    public static Method T0;
    public static Field U0;
    public static boolean V0;
    public static boolean W0;
    public final AndroidComposeView F0;
    public final nd9 G0;
    public stb<? super ah3, vzv> H0;
    public ptb<vzv> I0;
    public final fqj J0;
    public boolean K0;
    public Rect L0;
    public boolean M0;
    public boolean N0;
    public final dh3 O0;
    public final uve<View> P0;
    public long Q0;
    
    static {
        Companion = new d9x.d9x$c();
        d9x.R0 = d9x$b.F0;
        S0 = new d9x$a();
    }
    
    public d9x(final AndroidComposeView f0, final nd9 g0, final stb<? super ah3, vzv> h0, final ptb<vzv> i0) {
        e0e.f((Object)f0, "ownerView");
        e0e.f((Object)h0, "drawBlock");
        e0e.f((Object)i0, "invalidateParentLayer");
        super(((View)f0).getContext());
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = new fqj(f0.getDensity());
        this.O0 = new dh3(0);
        this.P0 = (uve<View>)new uve((hub)d9x.R0);
        Objects.requireNonNull(ozt.Companion);
        this.Q0 = ozt.b;
        this.setWillNotDraw(false);
        this.setId(View.generateViewId());
        ((ViewGroup)g0).addView((View)this);
    }
    
    private final c0k getManualClipPath() {
        if (this.getClipToOutline()) {
            final fqj j0 = this.J0;
            if (!(j0.i ^ true)) {
                j0.e();
                return j0.g;
            }
        }
        return null;
    }
    
    private final void setInvalidated(final boolean m0) {
        if (m0 != this.M0) {
            this.M0 = m0;
            this.F0.L((mrj)this, m0);
        }
    }
    
    public final void a(final avh avh, final boolean b) {
        if (b) {
            final float[] a = this.P0.a((Object)this);
            if (a != null) {
                rog.c(a, avh);
            }
            else {
                avh.a = 0.0f;
                avh.b = 0.0f;
                avh.c = 0.0f;
                avh.d = 0.0f;
            }
        }
        else {
            rog.c(this.P0.b((Object)this), avh);
        }
    }
    
    public final void b(final float scaleX, final float scaleY, final float alpha, final float translationX, final float translationY, final float elevation, final float rotationX, final float rotationY, final float rotation, final float cameraDistancePx, final long q0, final asp asp, final boolean b, final long n, final long n2, final cwe cwe, final rp8 rp8) {
        e0e.f((Object)asp, "shape");
        e0e.f((Object)cwe, "layoutDirection");
        e0e.f((Object)rp8, "density");
        this.Q0 = q0;
        this.setScaleX(scaleX);
        this.setScaleY(scaleY);
        this.setAlpha(alpha);
        this.setTranslationX(translationX);
        this.setTranslationY(translationY);
        this.setElevation(elevation);
        this.setRotation(rotation);
        this.setRotationX(rotationX);
        this.setRotationY(rotationY);
        this.setPivotX(ozt.b(this.Q0) * this.getWidth());
        this.setPivotY(ozt.c(this.Q0) * this.getHeight());
        this.setCameraDistancePx(cameraDistancePx);
        int n3 = 0;
        this.K0 = (b && asp == x6m.a);
        this.j();
        final boolean b2 = this.getManualClipPath() != null;
        this.setClipToOutline(b && asp != x6m.a);
        final boolean d = this.J0.d(asp, this.getAlpha(), this.getClipToOutline(), this.getElevation(), cwe, rp8);
        Object s0;
        if (this.J0.b() != null) {
            s0 = d9x.S0;
        }
        else {
            s0 = null;
        }
        this.setOutlineProvider((ViewOutlineProvider)s0);
        if (this.getManualClipPath() != null) {
            n3 = 1;
        }
        if ((b2 ? 1 : 0) != n3 || (n3 && d)) {
            this.invalidate();
        }
        if (!this.N0 && this.getElevation() > 0.0f) {
            final ptb<vzv> i0 = this.I0;
            if (i0 != null) {
                i0.invoke();
            }
        }
        this.P0.c();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            final f9x a = f9x.a;
            a.a((View)this, yru.I(n));
            a.b((View)this, yru.I(n2));
        }
        if (sdk_INT >= 31) {
            g9x.a.a((View)this, (sfm)null);
        }
    }
    
    public final long c(long n, final boolean b) {
        if (b) {
            final float[] a = this.P0.a((Object)this);
            if (a != null) {
                n = rog.b(a, n);
            }
            else {
                Objects.requireNonNull(kgj.Companion);
                n = kgj.c;
            }
        }
        else {
            n = rog.b(this.P0.b((Object)this), n);
        }
        return n;
    }
    
    public final void d(long g) {
        final int n = (int)(g >> 32);
        final int b = nud.b(g);
        if (n != this.getWidth() || b != this.getHeight()) {
            final float b2 = ozt.b(this.Q0);
            final float n2 = (float)n;
            this.setPivotX(b2 * n2);
            final float c = ozt.c(this.Q0);
            final float n3 = (float)b;
            this.setPivotY(c * n3);
            final fqj j0 = this.J0;
            g = jty.g(n2, n3);
            if (!aeq.a(j0.d, g)) {
                j0.d = g;
                j0.h = true;
            }
            Object s0;
            if (this.J0.b() != null) {
                s0 = d9x.S0;
            }
            else {
                s0 = null;
            }
            this.setOutlineProvider((ViewOutlineProvider)s0);
            this.layout(this.getLeft(), this.getTop(), this.getLeft() + n, this.getTop() + b);
            this.j();
            this.P0.c();
        }
    }
    
    public final void destroy() {
        this.setInvalidated(false);
        final AndroidComposeView f0 = this.F0;
        f0.a1 = true;
        this.H0 = null;
        this.I0 = null;
        final boolean o = f0.O((mrj)this);
        if (Build$VERSION.SDK_INT < 23 && !d9x.W0 && o) {
            this.setVisibility(8);
        }
        else {
            ((ViewGroup)this.G0).removeViewInLayout((View)this);
        }
    }
    
    public final void dispatchDraw(final Canvas a) {
        e0e.f((Object)a, "canvas");
        boolean b = false;
        this.setInvalidated(false);
        final dh3 o0 = this.O0;
        final Object f0 = o0.F0;
        final Canvas a2 = ((e20)f0).a;
        final e20 e20 = (e20)f0;
        Objects.requireNonNull(e20);
        e20.a = a;
        final e20 e21 = (e20)o0.F0;
        if (this.getManualClipPath() != null || !a.isHardwareAccelerated()) {
            b = true;
            ((ah3)e21).p();
            this.J0.a((ah3)e21);
        }
        final stb<? super ah3, vzv> h0 = this.H0;
        if (h0 != null) {
            h0.invoke((Object)e21);
        }
        if (b) {
            ((ah3)e21).c();
        }
        ((e20)o0.F0).v(a2);
    }
    
    public final void e(final stb<? super ah3, vzv> h0, final ptb<vzv> i0) {
        e0e.f((Object)h0, "drawBlock");
        e0e.f((Object)i0, "invalidateParentLayer");
        if (Build$VERSION.SDK_INT < 23 && !d9x.W0) {
            this.setVisibility(0);
        }
        else {
            ((ViewGroup)this.G0).addView((View)this);
        }
        this.K0 = false;
        this.N0 = false;
        Objects.requireNonNull(ozt.Companion);
        this.Q0 = ozt.b;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final boolean f(final long n) {
        final float d = kgj.d(n);
        final float e = kgj.e(n);
        final boolean k0 = this.K0;
        boolean b = true;
        if (k0) {
            if (0.0f > d || d >= this.getWidth() || 0.0f > e || e >= this.getHeight()) {
                b = false;
            }
            return b;
        }
        return !this.getClipToOutline() || this.J0.c(n);
    }
    
    public final void forceLayout() {
    }
    
    public final void g(final ah3 ah3) {
        e0e.f((Object)ah3, "canvas");
        final boolean n0 = this.getElevation() > 0.0f;
        this.N0 = n0;
        if (n0) {
            ah3.j();
        }
        this.G0.a(ah3, (View)this, this.getDrawingTime());
        if (this.N0) {
            ah3.q();
        }
    }
    
    public final float getCameraDistancePx() {
        return this.getCameraDistance() / this.getResources().getDisplayMetrics().densityDpi;
    }
    
    public final nd9 getContainer() {
        return this.G0;
    }
    
    public long getLayerId() {
        return this.getId();
    }
    
    public final AndroidComposeView getOwnerView() {
        return this.F0;
    }
    
    public long getOwnerViewId() {
        long a;
        if (Build$VERSION.SDK_INT >= 29) {
            a = d9x.d9x$d.a((View)this.F0);
        }
        else {
            a = -1L;
        }
        return a;
    }
    
    public final void h(final long n) {
        final hud$a companion = hud.Companion;
        final int n2 = (int)(n >> 32);
        if (n2 != this.getLeft()) {
            this.offsetLeftAndRight(n2 - this.getLeft());
            this.P0.c();
        }
        final int c = hud.c(n);
        if (c != this.getTop()) {
            this.offsetTopAndBottom(c - this.getTop());
            this.P0.c();
        }
    }
    
    public final void i() {
        if (this.M0 && !d9x.W0) {
            this.setInvalidated(false);
            d9x.Companion.a((View)this);
        }
    }
    
    public final void invalidate() {
        if (!this.M0) {
            this.setInvalidated(true);
            super.invalidate();
            ((View)this.F0).invalidate();
        }
    }
    
    public final void j() {
        Rect l2;
        if (this.K0) {
            final Rect l0 = this.L0;
            if (l0 == null) {
                this.L0 = new Rect(0, 0, this.getWidth(), this.getHeight());
            }
            else {
                e0e.c((Object)l0);
                l0.set(0, 0, this.getWidth(), this.getHeight());
            }
            l2 = this.L0;
        }
        else {
            l2 = null;
        }
        this.setClipBounds(l2);
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void setCameraDistancePx(final float n) {
        this.setCameraDistance(n * this.getResources().getDisplayMetrics().densityDpi);
    }
}
