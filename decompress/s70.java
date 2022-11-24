import android.view.MotionEvent;
import android.os.Build$VERSION;
import java.util.Set;
import android.view.ViewParent;
import android.graphics.Rect;
import android.graphics.Region$Op;
import android.graphics.Region;
import java.util.Objects;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import java.util.Map;
import java.util.List;
import java.util.WeakHashMap;
import androidx.compose.ui.platform.AndroidComposeView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class s70 extends ViewGroup implements uci
{
    public final kci F0;
    public View G0;
    public ptb<vzv> H0;
    public boolean I0;
    public dlh J0;
    public stb<? super dlh, vzv> K0;
    public rp8 L0;
    public stb<? super rp8, vzv> M0;
    public tbf N0;
    public juo O0;
    public final njq P0;
    public final stb<s70, vzv> Q0;
    public final ptb<vzv> R0;
    public stb<? super Boolean, vzv> S0;
    public final int[] T0;
    public int U0;
    public int V0;
    public final e6h W0;
    public final swe X0;
    
    public s70(final Context context, final xe6 xe6, final kci f0) {
        e0e.f((Object)context, "context");
        e0e.f((Object)f0, "dispatcher");
        super(context);
        this.F0 = f0;
        if (xe6 != null) {
            zqx.c((View)this, xe6);
        }
        ((View)this).setSaveFromParentEnabled(false);
        this.H0 = (ptb<vzv>)s70$m.F0;
        final dlh.a companion = dlh.Companion;
        this.J0 = (dlh)companion;
        this.L0 = kqe.c();
        this.P0 = new njq((stb)new s70$l(this));
        this.Q0 = new s70$h(this);
        this.R0 = new s70$k(this);
        this.T0 = new int[2];
        this.U0 = Integer.MIN_VALUE;
        this.V0 = Integer.MIN_VALUE;
        this.W0 = new e6h();
        final swe x0 = new swe(false, 0, 3, null);
        e0e.f((Object)companion, "<this>");
        final cqk f2 = new cqk();
        f2.F0 = (stb<? super MotionEvent, Boolean>)new dqk(this);
        final xnm xnm = new xnm();
        final xnm g0 = f2.G0;
        if (g0 != null) {
            g0.F0 = null;
        }
        f2.G0 = xnm;
        xnm.F0 = f2;
        this.setOnRequestDisallowInterceptTouchEvent$ui_release((stb<? super Boolean, vzv>)xnm);
        final dlh p3 = d4j.p0(rd9.a((dlh)f2, (stb<? super wd9, vzv>)new s70$f(x0, this)), (stb)new s70$g(this, x0));
        x0.f(this.J0.E(p3));
        this.K0 = (stb<? super dlh, vzv>)new stb<dlh, vzv>(x0, p3) {
            public final swe F0;
            public final dlh G0;
            
            public final Object invoke(final Object o) {
                final dlh dlh = (dlh)o;
                e0e.f((Object)dlh, "it");
                this.F0.f(dlh.E(this.G0));
                return vzv.a;
            }
        };
        x0.a(this.L0);
        this.M0 = (stb<? super rp8, vzv>)new stb<rp8, vzv>(x0) {
            public final swe F0;
            
            public final Object invoke(final Object o) {
                final rp8 rp8 = (rp8)o;
                e0e.f((Object)rp8, "it");
                this.F0.a(rp8);
                return vzv.a;
            }
        };
        final e8m e8m = new e8m();
        x0.n1 = (stb<? super orj, vzv>)new stb<orj, vzv>(this, x0, e8m) {
            public final s70 F0;
            public final swe G0;
            public final e8m<View> H0;
            
            public final Object invoke(Object f0) {
                final orj orj = (orj)f0;
                e0e.f((Object)orj, "owner");
                AndroidComposeView androidComposeView;
                if (orj instanceof AndroidComposeView) {
                    androidComposeView = (AndroidComposeView)orj;
                }
                else {
                    androidComposeView = null;
                }
                if (androidComposeView != null) {
                    final s70 f2 = this.F0;
                    final swe g0 = this.G0;
                    e0e.f((Object)f2, "view");
                    e0e.f((Object)g0, "layoutNode");
                    androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(f2, g0);
                    ((ViewGroup)androidComposeView.getAndroidViewsHandler$ui_release()).addView((View)f2);
                    androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(g0, f2);
                    final WeakHashMap a = b7x.a;
                    b7x$d.s((View)f2, 1);
                    b7x.z((View)f2, (wf)new o20(g0, androidComposeView, androidComposeView));
                }
                f0 = this.H0.F0;
                if (f0 != null) {
                    this.F0.setView$ui_release((View)f0);
                }
                return vzv.a;
            }
        };
        x0.o1 = (stb<? super orj, vzv>)new stb<orj, vzv>(this, e8m) {
            public final s70 F0;
            public final e8m<View> G0;
            
            public final Object invoke(final Object o) {
                final orj orj = (orj)o;
                e0e.f((Object)orj, "owner");
                AndroidComposeView androidComposeView;
                if (orj instanceof AndroidComposeView) {
                    androidComposeView = (AndroidComposeView)orj;
                }
                else {
                    androidComposeView = null;
                }
                if (androidComposeView != null) {
                    final s70 f0 = this.F0;
                    e0e.f((Object)f0, "view");
                    androidComposeView.t((ptb)new p20(androidComposeView, f0));
                }
                this.G0.F0 = this.F0.getView();
                this.F0.setView$ui_release(null);
                return vzv.a;
            }
        };
        x0.d(new zqg(this, x0) {
            public final s70 a;
            public final swe b;
            
            @Override
            public final int a(final b0e b0e, final List<? extends jzd> list, final int n) {
                e0e.f((Object)b0e, "<this>");
                return this.g(n);
            }
            
            @Override
            public final arg b(final crg crg, final List<? extends wqg> list, final long n) {
                e0e.f((Object)crg, "$this$measure");
                e0e.f((Object)list, "measurables");
                if (vj6.j(n) != 0) {
                    this.a.getChildAt(0).setMinimumWidth(vj6.j(n));
                }
                if (vj6.i(n) != 0) {
                    this.a.getChildAt(0).setMinimumHeight(vj6.i(n));
                }
                final s70 a = this.a;
                final int j = vj6.j(n);
                final int h = vj6.h(n);
                final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
                e0e.c((Object)layoutParams);
                final int a2 = s70.a(a, j, h, layoutParams.width);
                final s70 a3 = this.a;
                final int i = vj6.i(n);
                final int g = vj6.g(n);
                final ViewGroup$LayoutParams layoutParams2 = this.a.getLayoutParams();
                e0e.c((Object)layoutParams2);
                ((View)a).measure(a2, s70.a(a3, i, g, layoutParams2.height));
                return brg.c(crg, ((View)this.a).getMeasuredWidth(), ((View)this.a).getMeasuredHeight(), (Map)null, (stb)new s70$e$a(this.a, this.b), 4, (Object)null);
            }
            
            @Override
            public final int c(final b0e b0e, final List<? extends jzd> list, final int n) {
                e0e.f((Object)b0e, "<this>");
                return this.g(n);
            }
            
            @Override
            public final int d(final b0e b0e, final List<? extends jzd> list, final int n) {
                e0e.f((Object)b0e, "<this>");
                return this.f(n);
            }
            
            @Override
            public final int e(final b0e b0e, final List<? extends jzd> list, final int n) {
                e0e.f((Object)b0e, "<this>");
                return this.f(n);
            }
            
            public final int f(final int n) {
                final s70 a = this.a;
                final ViewGroup$LayoutParams layoutParams = a.getLayoutParams();
                e0e.c((Object)layoutParams);
                ((View)a).measure(s70.a(a, 0, n, layoutParams.width), View$MeasureSpec.makeMeasureSpec(0, 0));
                return ((View)this.a).getMeasuredHeight();
            }
            
            public final int g(final int n) {
                final s70 a = this.a;
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                final s70 a2 = this.a;
                final ViewGroup$LayoutParams layoutParams = a2.getLayoutParams();
                e0e.c((Object)layoutParams);
                ((View)a).measure(measureSpec, s70.a(a2, 0, n, layoutParams.height));
                return ((View)this.a).getMeasuredWidth();
            }
        });
        this.X0 = x0;
    }
    
    public static final int a(final s70 s70, int n, final int n2, final int n3) {
        Objects.requireNonNull(s70);
        if (n3 < 0 && n != n2) {
            if (n3 == -2 && n2 != Integer.MAX_VALUE) {
                n = View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE);
            }
            else if (n3 == -1 && n2 != Integer.MAX_VALUE) {
                n = View$MeasureSpec.makeMeasureSpec(n2, 1073741824);
            }
            else {
                n = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        else {
            n = View$MeasureSpec.makeMeasureSpec(jb2.F(n3, n, n2), 1073741824);
        }
        return n;
    }
    
    public final boolean gatherTransparentRegion(final Region region) {
        if (region == null) {
            return true;
        }
        ((View)this).getLocationInWindow(this.T0);
        final int[] t0 = this.T0;
        region.op(t0[0], t0[1], ((View)this).getWidth() + t0[0], ((View)this).getHeight() + this.T0[1], Region$Op.DIFFERENCE);
        return true;
    }
    
    public final rp8 getDensity() {
        return this.L0;
    }
    
    public final swe getLayoutNode() {
        return this.X0;
    }
    
    public ViewGroup$LayoutParams getLayoutParams() {
        final View g0 = this.G0;
        ViewGroup$LayoutParams layoutParams;
        if (g0 == null || (layoutParams = g0.getLayoutParams()) == null) {
            layoutParams = new ViewGroup$LayoutParams(-1, -1);
        }
        return layoutParams;
    }
    
    public final tbf getLifecycleOwner() {
        return this.N0;
    }
    
    public final dlh getModifier() {
        return this.J0;
    }
    
    public int getNestedScrollAxes() {
        final e6h w0 = this.W0;
        return w0.b | w0.a;
    }
    
    public final stb<rp8, vzv> getOnDensityChanged$ui_release() {
        return (stb<rp8, vzv>)this.M0;
    }
    
    public final stb<dlh, vzv> getOnModifierChanged$ui_release() {
        return (stb<dlh, vzv>)this.K0;
    }
    
    public final stb<Boolean, vzv> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return (stb<Boolean, vzv>)this.S0;
    }
    
    public final juo getSavedStateRegistryOwner() {
        return this.O0;
    }
    
    public final ptb<vzv> getUpdate() {
        return this.H0;
    }
    
    public final View getView() {
        return this.G0;
    }
    
    public final void i(final View view, final View view2, final int n, final int n2) {
        e0e.f((Object)view, "child");
        e0e.f((Object)view2, "target");
        this.W0.c(n, n2);
    }
    
    public final ViewParent invalidateChildInParent(final int[] array, final Rect rect) {
        super.invalidateChildInParent(array, rect);
        this.X0.D();
        return null;
    }
    
    public final boolean isNestedScrollingEnabled() {
        final View g0 = this.G0;
        boolean b;
        if (g0 != null) {
            b = g0.isNestedScrollingEnabled();
        }
        else {
            b = super.isNestedScrollingEnabled();
        }
        return b;
    }
    
    public final void j(final View view, final int n) {
        e0e.f((Object)view, "target");
        this.W0.d(n);
    }
    
    public final void k(final View view, int l, final int n, final int[] array, final int n2) {
        e0e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return;
        }
        final kci f0 = this.F0;
        final float n3 = (float)l;
        final float n4 = -1;
        final long e = kqe.e(n3 * n4, n * n4);
        l = omi.l(n2);
        final jci c = f0.c;
        long n5;
        if (c != null) {
            n5 = c.f(e, l);
        }
        else {
            Objects.requireNonNull(kgj.Companion);
            n5 = kgj.b;
        }
        array[0] = eg8.B(kgj.d(n5));
        array[1] = eg8.B(kgj.e(n5));
    }
    
    public final void m(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        e0e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return;
        }
        final kci f0 = this.F0;
        final float n6 = (float)n;
        final float n7 = -1;
        final long b = f0.b(kqe.e(n6 * n7, n2 * n7), kqe.e(n3 * n7, n4 * n7), omi.l(n5));
        array[0] = eg8.B(kgj.d(b));
        array[1] = eg8.B(kgj.e(b));
    }
    
    public final void n(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        e0e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return;
        }
        final kci f0 = this.F0;
        final float n6 = (float)n;
        final float n7 = -1;
        f0.b(kqe.e(n6 * n7, n2 * n7), kqe.e(n3 * n7, n4 * n7), omi.l(n5));
    }
    
    public final boolean o(final View view, final View view2, final int n, final int n2) {
        e0e.f((Object)view, "child");
        e0e.f((Object)view2, "target");
        boolean b = true;
        if ((n & 0x2) == 0x0) {
            b = ((n & 0x1) != 0x0 && b);
        }
        return b;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final njq p0 = this.P0;
        p0.e = (piq$a$a)piq.Companion.d((hub<? super Set<?>, ? super piq, vzv>)p0.b);
    }
    
    public final void onDescendantInvalidated(final View view, final View view2) {
        e0e.f((Object)view, "child");
        e0e.f((Object)view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.X0.D();
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final piq$a$a e = this.P0.e;
        if (e != null) {
            e.dispose();
        }
        this.P0.a();
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final View g0 = this.G0;
        if (g0 != null) {
            g0.layout(0, 0, n3 - n, n4 - n2);
        }
    }
    
    public final void onMeasure(final int u0, final int v0) {
        final View g0 = this.G0;
        if (g0 != null) {
            g0.measure(u0, v0);
        }
        final View g2 = this.G0;
        int measuredHeight = 0;
        int measuredWidth;
        if (g2 != null) {
            measuredWidth = g2.getMeasuredWidth();
        }
        else {
            measuredWidth = 0;
        }
        final View g3 = this.G0;
        if (g3 != null) {
            measuredHeight = g3.getMeasuredHeight();
        }
        ((View)this).setMeasuredDimension(measuredWidth, measuredHeight);
        this.U0 = u0;
        this.V0 = v0;
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        e0e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return false;
        }
        ma7.D(this.F0.d(), (yy6)null, 0, (hub)new s70$i(b, this, zzz.i(n * -1.0f, n2 * -1.0f), (mp6)null), 3);
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        e0e.f((Object)view, "target");
        if (!this.isNestedScrollingEnabled()) {
            return false;
        }
        ma7.D(this.F0.d(), (yy6)null, 0, (hub)new s70$j(this, zzz.i(n * -1.0f, n2 * -1.0f), (mp6)null), 3);
        return false;
    }
    
    public final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        if (Build$VERSION.SDK_INT < 23 && n == 0) {
            this.X0.D();
        }
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        final stb<? super Boolean, vzv> s0 = this.S0;
        if (s0 != null) {
            s0.invoke((Object)b);
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public final void setDensity(final rp8 l0) {
        e0e.f((Object)l0, "value");
        if (l0 != this.L0) {
            this.L0 = l0;
            final stb<? super rp8, vzv> m0 = this.M0;
            if (m0 != null) {
                m0.invoke((Object)l0);
            }
        }
    }
    
    public final void setLifecycleOwner(final tbf n0) {
        if (n0 != this.N0) {
            ((View)this).setTag(2131432602, (Object)(this.N0 = n0));
        }
    }
    
    public final void setModifier(final dlh j0) {
        e0e.f((Object)j0, "value");
        if (j0 != this.J0) {
            this.J0 = j0;
            final stb<? super dlh, vzv> k0 = this.K0;
            if (k0 != null) {
                k0.invoke((Object)j0);
            }
        }
    }
    
    public final void setOnDensityChanged$ui_release(final stb<? super rp8, vzv> m0) {
        this.M0 = m0;
    }
    
    public final void setOnModifierChanged$ui_release(final stb<? super dlh, vzv> k0) {
        this.K0 = k0;
    }
    
    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(final stb<? super Boolean, vzv> s0) {
        this.S0 = s0;
    }
    
    public final void setSavedStateRegistryOwner(final juo o0) {
        if (o0 != this.O0) {
            xcx.b((View)this, this.O0 = o0);
        }
    }
    
    public final void setUpdate(final ptb<vzv> h0) {
        e0e.f((Object)h0, "value");
        this.H0 = h0;
        this.I0 = true;
        this.R0.invoke();
    }
    
    public final void setView$ui_release(final View g0) {
        if (g0 != this.G0) {
            this.G0 = g0;
            this.removeAllViewsInLayout();
            if (g0 != null) {
                this.addView(g0);
                this.R0.invoke();
            }
        }
    }
    
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
