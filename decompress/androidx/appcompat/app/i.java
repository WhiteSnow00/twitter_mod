// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.view.animation.Interpolator;
import android.view.MenuInflater;
import androidx.appcompat.widget.ActionMenuPresenter;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import androidx.appcompat.view.menu.e$a;
import androidx.appcompat.widget.b;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.view.menu.e;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import java.util.WeakHashMap;
import android.app.Dialog;
import android.app.Activity;
import java.util.ArrayList;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import android.content.Context;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarOverlayLayout$d;

public final class i extends a implements ActionBarOverlayLayout$d
{
    public static final DecelerateInterpolator A;
    public static final AccelerateInterpolator z;
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public tc8 e;
    public ActionBarContextView f;
    public View g;
    public boolean h;
    public d i;
    public d j;
    public zk$a k;
    public boolean l;
    public ArrayList<a$b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public cax t;
    public boolean u;
    public boolean v;
    public final i$a w;
    public final i$b x;
    public final i$c y;
    
    static {
        z = new AccelerateInterpolator();
        A = new DecelerateInterpolator();
    }
    
    public i(final Activity activity, final boolean b) {
        new ArrayList();
        this.m = new ArrayList<a$b>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new i$a(this);
        this.x = new i$b(this);
        this.y = new eax() {};
        final View decorView = activity.getWindow().getDecorView();
        this.x(decorView);
        if (!b) {
            this.g = decorView.findViewById(16908290);
        }
    }
    
    public i(final Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<a$b>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new i$a(this);
        this.x = new i$b(this);
        this.y = new eax() {};
        this.x(dialog.getWindow().getDecorView());
    }
    
    public final void A(final boolean b) {
        final boolean q = this.q;
        boolean b2 = false;
        Label_0026: {
            if (!this.r) {
                if (q) {
                    b2 = false;
                    break Label_0026;
                }
            }
            b2 = true;
        }
        if (b2) {
            if (!this.s) {
                this.s = true;
                final cax t = this.t;
                if (t != null) {
                    t.a();
                }
                this.d.setVisibility(0);
                if (this.o == 0 && (this.u || b)) {
                    ((View)this.d).setTranslationY(0.0f);
                    float n2;
                    final float n = n2 = (float)(-((View)this.d).getHeight());
                    if (b) {
                        final int[] array2;
                        final int[] array = array2 = new int[2];
                        array2[1] = (array2[0] = 0);
                        ((View)this.d).getLocationInWindow(array);
                        n2 = n - array[1];
                    }
                    ((View)this.d).setTranslationY(n2);
                    final cax t2 = new cax();
                    final bax c = p5x.c((View)this.d);
                    c.l(0.0f);
                    c.i((eax)this.y);
                    t2.b(c);
                    if (this.p) {
                        final View g = this.g;
                        if (g != null) {
                            g.setTranslationY(n2);
                            final bax c2 = p5x.c(this.g);
                            c2.l(0.0f);
                            t2.b(c2);
                        }
                    }
                    final DecelerateInterpolator a = androidx.appcompat.app.i.A;
                    final boolean e = t2.e;
                    if (!e) {
                        t2.c = (Interpolator)a;
                    }
                    if (!e) {
                        t2.b = 250L;
                    }
                    final i$b x = this.x;
                    if (!e) {
                        t2.d = (dax)x;
                    }
                    (this.t = t2).c();
                }
                else {
                    ((View)this.d).setAlpha(1.0f);
                    ((View)this.d).setTranslationY(0.0f);
                    if (this.p) {
                        final View g2 = this.g;
                        if (g2 != null) {
                            g2.setTranslationY(0.0f);
                        }
                    }
                    this.x.c((View)null);
                }
                final ActionBarOverlayLayout c3 = this.c;
                if (c3 != null) {
                    final WeakHashMap a2 = p5x.a;
                    p5x$h.c((View)c3);
                }
            }
        }
        else if (this.s) {
            this.s = false;
            final cax t3 = this.t;
            if (t3 != null) {
                t3.a();
            }
            if (this.o == 0 && (this.u || b)) {
                ((View)this.d).setAlpha(1.0f);
                this.d.setTransitioning(true);
                final cax t4 = new cax();
                float n4;
                final float n3 = n4 = (float)(-((View)this.d).getHeight());
                if (b) {
                    final int[] array4;
                    final int[] array3 = array4 = new int[2];
                    array4[1] = (array4[0] = 0);
                    ((View)this.d).getLocationInWindow(array3);
                    n4 = n3 - array3[1];
                }
                final bax c4 = p5x.c((View)this.d);
                c4.l(n4);
                c4.i((eax)this.y);
                t4.b(c4);
                if (this.p) {
                    final View g3 = this.g;
                    if (g3 != null) {
                        final bax c5 = p5x.c(g3);
                        c5.l(n4);
                        t4.b(c5);
                    }
                }
                final AccelerateInterpolator z = androidx.appcompat.app.i.z;
                final boolean e2 = t4.e;
                if (!e2) {
                    t4.c = (Interpolator)z;
                }
                if (!e2) {
                    t4.b = 250L;
                }
                final i$a w = this.w;
                if (!e2) {
                    t4.d = (dax)w;
                }
                (this.t = t4).c();
            }
            else {
                this.w.c((View)null);
            }
        }
    }
    
    public final boolean b() {
        final tc8 e = this.e;
        if (e != null && e.h()) {
            this.e.collapseActionView();
            return true;
        }
        return false;
    }
    
    public final void c(final boolean l) {
        if (l == this.l) {
            return;
        }
        this.l = l;
        for (int size = this.m.size(), i = 0; i < size; ++i) {
            this.m.get(i).a();
        }
    }
    
    public final int d() {
        return this.e.q();
    }
    
    public final Context e() {
        if (this.b == null) {
            final TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(2130968612, typedValue, true);
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                this.b = (Context)new ContextThemeWrapper(this.a, resourceId);
            }
            else {
                this.b = this.a;
            }
        }
        return this.b;
    }
    
    public final void g() {
        this.z(this.a.getResources().getBoolean(2131034113));
    }
    
    public final boolean i(final int n, final KeyEvent keyEvent) {
        final d i = this.i;
        if (i == null) {
            return false;
        }
        final e f0 = i.F0;
        if (f0 != null) {
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            final int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
            boolean qwertyMode = true;
            if (keyboardType == 1) {
                qwertyMode = false;
            }
            f0.setQwertyMode(qwertyMode);
            return f0.performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    public final void l(final View view) {
        this.e.E(view);
    }
    
    public final void m(final View view, final a$a layoutParams) {
        view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.e.E(view);
    }
    
    public final void n(final boolean b) {
        if (!this.h) {
            this.o(b);
        }
    }
    
    public final void o(final boolean b) {
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.y(n, 4);
    }
    
    public final void p(final int n) {
        if ((n & 0x4) != 0x0) {
            this.h = true;
        }
        this.e.C(n);
    }
    
    public final void q(final boolean b) {
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.y(n, 16);
    }
    
    public final void r() {
        this.y(2, 2);
    }
    
    public final void s(final boolean b) {
        int n;
        if (b) {
            n = 8;
        }
        else {
            n = 0;
        }
        this.y(n, 8);
    }
    
    public final void t(final boolean u) {
        if (!(this.u = u)) {
            final cax t = this.t;
            if (t != null) {
                t.a();
            }
        }
    }
    
    public final void u(final CharSequence windowTitle) {
        this.e.setWindowTitle(windowTitle);
    }
    
    public final zk v(final zk$a zk$a) {
        final d i = this.i;
        if (i != null) {
            i.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.h();
        final d j = new d(((View)this.f).getContext(), zk$a);
        j.F0.B();
        try {
            final boolean c = j.G0.c((zk)j, (Menu)j.F0);
            j.F0.A();
            if (c) {
                (this.i = j).i();
                this.f.f(j);
                this.w(true);
                return j;
            }
            return null;
        }
        finally {
            j.F0.A();
        }
    }
    
    public final void w(final boolean b) {
        if (b) {
            if (!this.r) {
                this.r = true;
                final ActionBarOverlayLayout c = this.c;
                if (c != null) {
                    c.setShowingForActionMode(true);
                }
                this.A(false);
            }
        }
        else if (this.r) {
            this.r = false;
            final ActionBarOverlayLayout c2 = this.c;
            if (c2 != null) {
                c2.setShowingForActionMode(false);
            }
            this.A(false);
        }
        final ActionBarContainer d = this.d;
        final WeakHashMap a = p5x.a;
        if (p5x$g.c((View)d)) {
            bax bax;
            bax bax2;
            if (b) {
                bax = this.e.j(4, 100L);
                bax2 = this.f.e(0, 200L);
            }
            else {
                bax2 = this.e.j(0, 200L);
                bax = this.f.e(8, 100L);
            }
            final cax cax = new cax();
            cax.a.add(bax);
            final View view = (View)bax.a.get();
            long duration;
            if (view != null) {
                duration = view.animate().getDuration();
            }
            else {
                duration = 0L;
            }
            final View view2 = (View)bax2.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            cax.a.add(bax2);
            cax.c();
        }
        else if (b) {
            this.e.setVisibility(4);
            this.f.setVisibility(0);
        }
        else {
            this.e.setVisibility(0);
            this.f.setVisibility(8);
        }
    }
    
    public final void x(final View view) {
        final ActionBarOverlayLayout c = (ActionBarOverlayLayout)view.findViewById(2131428615);
        this.c = c;
        if (c != null) {
            c.setActionBarVisibilityCallback((ActionBarOverlayLayout$d)this);
        }
        final View viewById = view.findViewById(2131427439);
        tc8 wrapper;
        if (viewById instanceof tc8) {
            wrapper = (tc8)viewById;
        }
        else {
            if (!(viewById instanceof Toolbar)) {
                final StringBuilder g = w48.g("Can't make a decor toolbar out of ");
                String simpleName;
                if (viewById != null) {
                    simpleName = ((Toolbar)viewById).getClass().getSimpleName();
                }
                else {
                    simpleName = "null";
                }
                g.append(simpleName);
                throw new IllegalStateException(g.toString());
            }
            wrapper = ((Toolbar)viewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView)view.findViewById(2131427457);
        final ActionBarContainer d = (ActionBarContainer)view.findViewById(2131427441);
        this.d = d;
        final tc8 e = this.e;
        if (e != null && this.f != null && d != null) {
            this.a = e.getContext();
            if ((this.e.q() & 0x4) != 0x0) {
                this.h = true;
            }
            final Context a = this.a;
            final int targetSdkVersion = a.getApplicationInfo().targetSdkVersion;
            this.e.n();
            this.z(a.getResources().getBoolean(2131034113));
            final TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet)null, ck1.F0, 2130968607, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                final ActionBarOverlayLayout c2 = this.c;
                if (!c2.J0) {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
                c2.setHideOnContentScrollEnabled(this.v = true);
            }
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                final float n = (float)dimensionPixelSize;
                final ActionBarContainer d2 = this.d;
                final WeakHashMap a2 = p5x.a;
                p5x$i.s((View)d2, n);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(i.class.getSimpleName());
        sb.append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void y(final int n, final int n2) {
        final int q = this.e.q();
        if ((n2 & 0x4) != 0x0) {
            this.h = true;
        }
        this.e.C((n & n2) | (~n2 & q));
    }
    
    public final void z(final boolean n) {
        if (!(this.n = n)) {
            this.e.o();
            this.d.setTabContainer((b)null);
        }
        else {
            this.d.setTabContainer((b)null);
            this.e.o();
        }
        final int i = this.e.i();
        final boolean b = false;
        final boolean b2 = i == 2;
        this.e.l(!this.n && b2);
        final ActionBarOverlayLayout c = this.c;
        boolean hasNonEmbeddedTabs = b;
        if (!this.n) {
            hasNonEmbeddedTabs = b;
            if (b2) {
                hasNonEmbeddedTabs = true;
            }
        }
        c.setHasNonEmbeddedTabs(hasNonEmbeddedTabs);
    }
    
    public final class d extends zk implements e$a
    {
        public final Context E0;
        public final e F0;
        public zk$a G0;
        public WeakReference<View> H0;
        
        public d(final Context e0, final zk$a g0) {
            this.E0 = e0;
            this.G0 = g0;
            final e f0 = new e(e0);
            f0.l = 1;
            this.F0 = f0;
            f0.e = (e.e$a)this;
        }
        
        public final boolean a(final e e, final MenuItem menuItem) {
            final zk$a g0 = this.G0;
            return g0 != null && g0.a((zk)this, menuItem);
        }
        
        public final void b(final e e) {
            if (this.G0 == null) {
                return;
            }
            this.i();
            final ActionMenuPresenter f0 = androidx.appcompat.app.i.this.f.F0;
            if (f0 != null) {
                f0.m();
            }
        }
        
        public final void c() {
            final i i0 = androidx.appcompat.app.i.this;
            if (i0.i != this) {
                return;
            }
            if (!(i0.q ^ true)) {
                i0.j = this;
                i0.k = this.G0;
            }
            else {
                this.G0.b((zk)this);
            }
            this.G0 = null;
            androidx.appcompat.app.i.this.w(false);
            final ActionBarContextView f = androidx.appcompat.app.i.this.f;
            if (f.M0 == null) {
                f.h();
            }
            final i i2 = androidx.appcompat.app.i.this;
            i2.c.setHideOnContentScrollEnabled(i2.v);
            androidx.appcompat.app.i.this.i = null;
        }
        
        public final View d() {
            final WeakReference<View> h0 = this.H0;
            View view;
            if (h0 != null) {
                view = h0.get();
            }
            else {
                view = null;
            }
            return view;
        }
        
        public final Menu e() {
            return (Menu)this.F0;
        }
        
        public final MenuInflater f() {
            return (MenuInflater)new ryr(this.E0);
        }
        
        public final CharSequence g() {
            return androidx.appcompat.app.i.this.f.getSubtitle();
        }
        
        public final CharSequence h() {
            return androidx.appcompat.app.i.this.f.getTitle();
        }
        
        public final void i() {
            if (androidx.appcompat.app.i.this.i != this) {
                return;
            }
            this.F0.B();
            try {
                this.G0.d((zk)this, (Menu)this.F0);
            }
            finally {
                this.F0.A();
            }
        }
        
        public final boolean j() {
            return androidx.appcompat.app.i.this.f.U0;
        }
        
        public final void k(final View customView) {
            androidx.appcompat.app.i.this.f.setCustomView(customView);
            this.H0 = new WeakReference<View>(customView);
        }
        
        public final void l(final int n) {
            androidx.appcompat.app.i.this.f.setSubtitle(androidx.appcompat.app.i.this.a.getResources().getString(n));
        }
        
        public final void m(final CharSequence subtitle) {
            androidx.appcompat.app.i.this.f.setSubtitle(subtitle);
        }
        
        public final void n(final int n) {
            this.o(androidx.appcompat.app.i.this.a.getResources().getString(n));
        }
        
        public final void o(final CharSequence title) {
            androidx.appcompat.app.i.this.f.setTitle(title);
        }
        
        public final void p(final boolean b) {
            super.D0 = b;
            androidx.appcompat.app.i.this.f.setTitleOptional(b);
        }
    }
}
