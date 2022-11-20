// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profiles.scrollingheader;

import android.os.BaseBundle;
import java.util.concurrent.Callable;
import java.util.Locale;
import android.os.Build;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ArgbEvaluator;
import android.graphics.Rect;
import android.content.res.Resources$NotFoundException;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout$c;
import android.view.ViewGroup;
import android.content.Context;
import androidx.fragment.app.p;
import java.util.List;
import android.view.animation.AnimationUtils;
import com.twitter.app.legacy.list.di.TwitterListViewObjectGraph;
import com.google.android.material.tabs.TabLayout$g;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.os.Bundle;
import com.twitter.ui.view.SwipeProgressBarView;
import com.twitter.profiles.filterbar.FilterBarComposeView;
import com.google.android.material.tabs.TabLayout;
import com.twitter.ui.view.RtlViewPager;
import com.twitter.ui.widget.DockLayout;
import com.google.android.material.tabs.TabLayout$d;

public abstract class c extends vbv implements SwipeRefreshObserverLayout$a, TabLayout$d, InterceptingRelativeLayout$b, UnboundedFrameLayout$a, f$b, f$a, b$a, l4p, j4p
{
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int[] F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public float K1;
    public final w19 L1;
    public final w19 M1;
    public DockLayout X0;
    public RtlViewPager Y0;
    public ksj Z0;
    public UnboundedFrameLayout a1;
    public TabLayout b1;
    public UnboundedLinearLayout c1;
    public FilterBarComposeView d1;
    public InterceptingRelativeLayout e1;
    public int f1;
    public int g1;
    public SwipeProgressBarView h1;
    public SwipeRefreshObserverLayout i1;
    public boolean j1;
    public t8r k1;
    public int l1;
    public c.c$e m1;
    public g n1;
    public Bundle o1;
    public Integer p1;
    public boolean q1;
    public b r1;
    public View s1;
    public View t1;
    public ImageView u1;
    public TextView v1;
    public Animation w1;
    public Animation x1;
    public int y1;
    public int z1;
    
    public c(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final jto jto, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.K1 = 2.0f;
        this.L1 = new w19();
        this.M1 = new w19();
        f.i(r8x.o(), (n93)new doa((Object)this, 19));
        jto.a((mso)new c$a(this));
    }
    
    public static c.c$c Z4(final Fragment fragment) {
        final c.c$d c$d = (c.c$d)xjr.h(fragment, (Class)c.c$d.class);
        c.c$c q;
        if (c$d != null) {
            q = c$d.Q();
        }
        else {
            q = null;
        }
        return q;
    }
    
    public void C() {
        if (this.C1 > this.f1) {
            this.m1.b();
            this.m1.a();
        }
        final int height = ((View)this.a1).getHeight();
        final int y1 = this.y1;
        final Integer p1 = this.p1;
        if (p1 != null) {
            final int n = height - this.f1;
            int max;
            if (this.q1) {
                max = -n;
            }
            else {
                max = Math.max(-n, p1);
            }
            this.y1 = max;
        }
        if (this.D1 != height) {
            this.D1 = height - this.f1;
            final Iterator iterator = this.Z0.N0.iterator();
            while (iterator.hasNext()) {
                this.l2((Fragment)this.Z0.q((jsj)iterator.next()));
            }
        }
        if (this.p1 != null) {
            final int y2 = this.y1;
            this.y1 = y1;
            this.e0(y2, this.Y0.getCurrentItem());
            this.p1 = null;
        }
        this.n1.d();
    }
    
    public final void C2(final TabLayout$g tabLayout$g) {
        final c.c$c z4 = Z4((Fragment)this.X4());
        if (z4 != null) {
            z4.b(this.l1);
        }
    }
    
    public final View F2() {
        final umd x4 = this.X4();
        if (x4 == null || !w1e.j((x1e)x4) || !(w1e.h((x1e)x4) instanceof TwitterListViewObjectGraph)) {
            return (View)this.Y0;
        }
        final a7m i0 = ((TwitterListViewObjectGraph)w1e.h((x1e)x4)).v7().I0;
        final c.c$c z4 = Z4((Fragment)x4);
        if (z4 != null && i0.y()) {
            return z4.a();
        }
        return (View)i0.b;
    }
    
    public boolean H0(final float n) {
        final int[] array = new int[2];
        ((View)this.c1).getLocationOnScreen(array);
        boolean b = true;
        if (n >= ((View)this.c1).getHeight() + array[1]) {
            b = false;
        }
        return b;
    }
    
    public final void J0(final TabLayout$g tabLayout$g) {
        this.k5(tabLayout$g.e);
    }
    
    public final void K1(final TabLayout$g tabLayout$g) {
    }
    
    public void L1(final boolean b) {
        this.G1 = false;
        final SwipeRefreshObserverLayout i1 = this.i1;
        if (i1.F0 != b) {
            i1.F0 = b;
        }
        this.j1 = b;
        if (b) {
            ((View)this.h1).setVisibility(0);
            this.h1.setProgressTop(this.A1);
            final SwipeProgressBarView h1 = this.h1;
            if (!h1.H0) {
                h1.F0 = AnimationUtils.currentAnimationTimeMillis();
                h1.H0 = true;
                ((View)h1).postInvalidate();
            }
            ((View)this.u1).clearAnimation();
            this.u1.setVisibility(8);
            this.v1.setText(2131954815);
            this.M1.c(rw0.k(1000L, (oj)new pvt((Object)this, 22)));
            final umd x4 = this.X4();
            if (x4 != null && ((elf)((co1)x4.n()).B((Class)elf.class)).Q2()) {
                final ym6 r = ((gml)w1e.e((x1e)x4)).R();
                final int a = c5j.a;
                ((ucv)r).a();
            }
            else {
                this.L1(false);
            }
        }
        else {
            this.I1 = false;
            this.M1.a();
            final SwipeProgressBarView h2 = this.h1;
            if (h2.H0) {
                h2.G0 = AnimationUtils.currentAnimationTimeMillis();
                h2.H0 = false;
                ((View)h2).postInvalidate();
            }
            ((View)this.h1).setVisibility(8);
            this.s1.setVisibility(8);
            this.B1 = 0;
            if (this.J1) {
                this.J1 = false;
                ((u9)this).F4().invalidate();
            }
        }
    }
    
    public void N4() {
        this.L1.a();
        this.M1.a();
        final g n1 = this.n1;
        if (n1 != null) {
            n1.a();
        }
        final UnboundedFrameLayout a1 = this.a1;
        if (a1 != null) {
            ((ViewGroup)a1).removeAllViews();
        }
        final InterceptingRelativeLayout e1 = this.e1;
        if (e1 != null) {
            e1.setInterceptHandler((InterceptingRelativeLayout$b)null);
        }
        final SwipeRefreshObserverLayout i1 = this.i1;
        if (i1 != null) {
            i1.setSwipeListener((SwipeRefreshObserverLayout$a)null);
        }
    }
    
    public int U() {
        return 0;
    }
    
    public abstract ksj W4(final List<jsj> p0, final RtlViewPager p1);
    
    public final void X() {
        if (this.G1) {
            this.L1(true);
        }
        else {
            this.L1.c(rw0.k(50L, (oj)new q00((Object)this, 22)));
        }
    }
    
    public final umd X4() {
        final jsj w = this.Z0.w();
        umd umd;
        if (w != null) {
            umd = (umd)w.a((p)this.Z0.M0);
        }
        else {
            umd = null;
        }
        return umd;
    }
    
    public int Y4() {
        return d4j.i((Context)((u9)this).E0, 2130968585);
    }
    
    public abstract int a5(final Resources p0);
    
    public final void b2(final float n) {
        if (!this.I1) {
            this.u1.setVisibility(0);
            ((View)this.v1).setVisibility(0);
            this.s1.setVisibility(0);
            this.I1 = true;
            this.J1 = true;
            super.T0.b();
            ((u9)this).F4().invalidate();
        }
        int text;
        if (100.0f * n <= 50.0f) {
            this.G1 = false;
            text = 2131956963;
            if (this.B1 == 1) {
                ((View)this.u1).clearAnimation();
                ((View)this.u1).startAnimation(this.x1);
                this.B1 = 2;
            }
            final int l1 = this.l1;
            this.s1.setTranslationY((float)((int)(l1 * n * 2.0f) - l1));
        }
        else {
            this.G1 = true;
            text = 2131956964;
            if (this.B1 != 1) {
                ((View)this.u1).clearAnimation();
                ((View)this.u1).startAnimation(this.w1);
                this.B1 = 1;
            }
            this.s1.setTranslationY(0.0f);
        }
        this.v1.setText(text);
    }
    
    public abstract CharSequence b5();
    
    public abstract CharSequence c5();
    
    public int d2(final hai hai) {
        if (this.J1) {
            final ViewGroup k4 = ((u9)this).K4();
            jee.l((Object)k4);
            ((View)k4).setVisibility(4);
            this.t1.setVisibility(0);
            return 0;
        }
        this.t1.setVisibility(8);
        return 2;
    }
    
    public c.c$e d5() {
        return new c.c$e(this);
    }
    
    public final void e0(final int y1, final int n) {
        if (n == this.Y0.getCurrentItem() && this.D1 != 0) {
            if (this.y1 != y1) {
                this.y1 = y1;
                final c.c$e m1 = this.m1;
                if (m1.c.g5() + y1 <= 0) {
                    m1.d();
                }
                else {
                    m1.b();
                }
                if (m1.c.f5() + y1 <= 0) {
                    m1.c();
                }
                else {
                    m1.a();
                }
                this.H1 = (this.C1 + y1 <= this.f1);
                this.n1.d();
                final UnboundedFrameLayout a1 = this.a1;
                final float n2 = (float)y1;
                ((View)a1).setTranslationY(n2);
                ((View)this.c1).setTranslationY(n2);
                final t8r k1 = this.k1;
                if (k1 != null) {
                    final int c1 = this.C1;
                    final int z1 = (y1 + c1) / (c1 / 5);
                    if ((this.z1 = z1) >= 5) {
                        this.z1 = 4;
                    }
                    else if (z1 < 0) {
                        this.z1 = 0;
                    }
                    k1.a = this.z1;
                    k1.invalidateSelf();
                }
                if (this.j1) {
                    this.h1.setProgressTop(Math.max(this.A1 + this.y1, 0));
                }
                this.i5(y1, n);
            }
        }
    }
    
    public final void e5() {
        final Resources m0 = ((u9)this).M0;
        this.m1 = this.d5();
        this.X0 = (DockLayout)((u9)this).C4(2131428769);
        this.Y0 = (RtlViewPager)((u9)this).C4(2131430503);
        final ksj w4 = this.W4(this.l5(), this.Y0);
        this.Z0 = w4;
        this.Y0.setAdapter((huj)w4);
        final TabLayout b1 = (TabLayout)((u9)this).C4(2131431879);
        this.b1 = b1;
        if (b1 != null) {
            this.c1 = (UnboundedLinearLayout)((u9)this).C4(2131431881);
            this.b1.a((TabLayout$c)this);
            this.b1.setupWithViewPager((ViewPager)this.Y0);
            this.d1 = (FilterBarComposeView)((u9)this).C4(2131432051);
        }
        final TypedArray obtainStyledAttributes = ((Context)((u9)this).E0).getTheme().obtainStyledAttributes(new int[] { 2130970956 });
        this.f1 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.g1 = this.Y4();
        this.l1 = m0.getDimensionPixelSize(2131166694);
        this.E1 = m0.getDisplayMetrics().widthPixels;
        this.C1 = this.a5(m0);
        Drawable n;
        try {
            n = d4j.n((Context)((u9)this).E0, 2130970532, 2131230838);
        }
        catch (final Resources$NotFoundException ex) {
            n = null;
        }
        final int c1 = this.C1;
        final k4p k4p = new k4p(m0, n, new Rect(0, c1 - this.f1, this.E1, c1));
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        final Integer value = 0;
        this.n1 = new g(m0, (f$b)this, (f$a)this, k4p, new a(k4p, (f$b)this, ValueAnimator.ofObject((TypeEvaluator)argbEvaluator, new Object[] { value, value })));
        ((ViewGroup)(this.a1 = (UnboundedFrameLayout)((u9)this).C4(2131428982))).removeAllViews();
        this.a1.setOnHeaderSizeChangedListener((UnboundedFrameLayout$a)this);
        (this.i1 = (SwipeRefreshObserverLayout)((u9)this).C4(2131431861)).setSwipeListener((SwipeRefreshObserverLayout$a)this);
        final int color = m0.getColor(2131099719);
        final int color2 = m0.getColor(2131099718);
        this.F1 = new int[] { color, color2, color, color2 };
        (this.h1 = (SwipeProgressBarView)((u9)this).C4(2131430784)).setColorScheme(this.F1);
        this.s1 = ((u9)this).C4(2131430828);
        this.t1 = ((u9)this).C4(2131430829);
        this.u1 = (ImageView)((u9)this).C4(2131430939);
        this.v1 = (TextView)((u9)this).C4(2131430941);
        this.w1 = AnimationUtils.loadAnimation((Context)((u9)this).E0, 2130772061);
        this.x1 = AnimationUtils.loadAnimation((Context)((u9)this).E0, 2130772060);
        final InterceptingRelativeLayout e1 = (InterceptingRelativeLayout)((u9)this).C4(2131429626);
        this.e1 = e1;
        if (e1 != null) {
            e1.setInterceptHandler((InterceptingRelativeLayout$b)this);
        }
        final Bundle o1 = this.o1;
        if (o1 != null) {
            this.p1 = ((BaseBundle)o1).getInt("STATE_HEADER_OFFSET");
            this.q1 = this.o1.getBoolean("STATE_HEADER_IS_PINNED");
        }
    }
    
    public int f5() {
        return this.D1;
    }
    
    public abstract int g5();
    
    public void h5() {
    }
    
    public void i5(final int n, final int n2) {
    }
    
    public void j5(final Bundle bundle) {
        ((BaseBundle)bundle).putInt("STATE_HEADER_OFFSET", this.y1);
        bundle.putBoolean("STATE_HEADER_IS_PINNED", this.D1 + this.y1 <= 0);
    }
    
    public abstract void k5(final int p0);
    
    public final void l2(final Fragment fragment) {
        final c.c$c z4 = Z4(fragment);
        if (z4 != null) {
            z4.c(this.D1 + this.l1, this.y1);
        }
    }
    
    public abstract List<jsj> l5();
    
    public abstract void m5(final Drawable p0);
    
    public final void n0(final t8r k1) {
        this.m5(this.k1 = k1);
    }
    
    public void n5(final View view) {
        if (this.C1 == this.f1) {
            this.m1.d();
        }
        this.A1 = this.C1 - this.f1;
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        ((ViewGroup)this.a1).removeAllViews();
        ((ViewGroup)this.a1).addView(view, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        ((View)this.a1).setVisibility(0);
    }
    
    public final void o5(final Bitmap bitmap) {
        final edq g = edq.g(this.E1, this.C1);
        final edq a = q60.a(bitmap);
        final boolean k = a.k(g);
        float n = 0.0f;
        float n2;
        float n3;
        if (k) {
            n2 = g.b / (float)a.b;
            n = (g.a - a.a * n2) / this.K1;
            n3 = 0.0f;
        }
        else {
            n2 = g.a / (float)a.a;
            n3 = (g.b - a.b * n2) / this.K1;
        }
        final Matrix matrix = new Matrix();
        matrix.setScale(n2, n2);
        matrix.postTranslate((float)(int)(n + 0.5f), (float)(int)(n3 + 0.5f));
        Bitmap$Config bitmap$Config = bitmap.getConfig();
        if (bitmap$Config == null) {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap d = b12.d(g, bitmap$Config);
        if (d == null) {
            return;
        }
        final Canvas canvas = new Canvas(d);
        final Paint paint = new Paint();
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, matrix, paint);
        if (this.r1 == null && (Build.BRAND.toLowerCase(Locale.ENGLISH).contains("blackberry") ^ true)) {
            this.n1.b(d, false);
            final b r1 = new b((Context)((u9)this).E0, (b$a)this, (com.twitter.profiles.scrollingheader.f)this.n1, this.z1);
            this.r1 = r1;
            r1.g.c(rw0.j((Callable)new b7g((Object)r1, (Object)d, 4), (n93)new mr2((Object)r1, 21), (ecq)r1.new b(), owo.a()));
        }
        else {
            this.n1.b(d, true);
        }
    }
    
    public final void p0() {
        this.r1 = null;
    }
    
    public final void z3() {
        this.z1 = 4;
    }
}
