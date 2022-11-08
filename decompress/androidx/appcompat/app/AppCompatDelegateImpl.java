// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.widget.AdapterView;
import android.widget.AbsListView;
import android.os.BaseBundle;
import android.view.ViewManager;
import android.view.MotionEvent;
import android.location.Location;
import java.util.Calendar;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import android.view.ActionMode;
import android.view.ActionMode$Callback;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.Toolbar;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.ref.WeakReference;
import android.view.MenuInflater;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.AndroidRuntimeException;
import android.view.KeyCharacterMap;
import androidx.appcompat.view.menu.i$a;
import android.view.ViewParent;
import android.content.res.Resources$Theme;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.c$a;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.c;
import android.app.UiModeManager;
import android.location.LocationManager;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import android.content.res.TypedArray;
import android.text.TextUtils;
import androidx.appcompat.widget.ContentFrameLayout$a;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.reflect.InvocationTargetException;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.media.AudioManager;
import android.view.ViewConfiguration;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.appcompat.view.menu.e;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Window$Callback;
import java.lang.reflect.Field;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import java.util.Objects;
import androidx.lifecycle.d$c;
import java.util.Map;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.os.Handler;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.os.Build$VERSION;
import android.app.Activity;
import android.content.ContextWrapper;
import android.app.Dialog;
import android.os.Build;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import android.view.Window;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater$Factory2;
import androidx.appcompat.view.menu.e$a;

public final class AppCompatDelegateImpl extends androidx.appcompat.app.g implements e$a, LayoutInflater$Factory2
{
    public static final l7q<String, Integer> C1;
    public static final int[] D1;
    public static final boolean E1;
    public static final boolean F1;
    public Rect A1;
    public al0 B1;
    public final Object F0;
    public final Context G0;
    public Window H0;
    public g I0;
    public final xj0 J0;
    public a K0;
    public ryr L0;
    public CharSequence M0;
    public sc8 N0;
    public AppCompatDelegateImpl.AppCompatDelegateImpl$c O0;
    public l P0;
    public zk Q0;
    public ActionBarContextView R0;
    public PopupWindow S0;
    public dk0 T0;
    public bax U0;
    public boolean V0;
    public boolean W0;
    public ViewGroup X0;
    public TextView Y0;
    public View Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState[] i1;
    public AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public Configuration o1;
    public int p1;
    public int q1;
    public boolean r1;
    public boolean s1;
    public j t1;
    public h u1;
    public boolean v1;
    public int w1;
    public final AppCompatDelegateImpl$a x1;
    public boolean y1;
    public Rect z1;
    
    static {
        C1 = new l7q();
        D1 = new int[] { 16842836 };
        E1 = ("robolectric".equals(Build.FINGERPRINT) ^ true);
        F1 = true;
    }
    
    public AppCompatDelegateImpl(Context baseContext, final Window window, final xj0 j0, final Object f0) {
        this.U0 = null;
        this.V0 = true;
        this.p1 = -100;
        this.x1 = new AppCompatDelegateImpl$a(this);
        this.G0 = baseContext;
        this.J0 = j0;
        this.F0 = f0;
        Label_0110: {
            if (f0 instanceof Dialog) {
                while (true) {
                    while (baseContext != null) {
                        if (baseContext instanceof f) {
                            final f f2 = (f)baseContext;
                            if (f2 != null) {
                                this.p1 = f2.T().g();
                            }
                            break Label_0110;
                        }
                        else {
                            if (!(baseContext instanceof ContextWrapper)) {
                                break;
                            }
                            baseContext = ((ContextWrapper)baseContext).getBaseContext();
                        }
                    }
                    final f f2 = null;
                    continue;
                }
            }
        }
        if (this.p1 == -100) {
            final l7q<String, Integer> c1 = AppCompatDelegateImpl.C1;
            final Integer n = (Integer)c1.getOrDefault((Object)this.F0.getClass().getName(), (Object)null);
            if (n != null) {
                this.p1 = n;
                c1.remove((Object)this.F0.getClass().getName());
            }
        }
        if (window != null) {
            this.B(window);
        }
        ik0.e();
    }
    
    public final boolean A(final boolean b) {
        final boolean n1 = this.n1;
        final boolean b2 = false;
        if (n1) {
            return false;
        }
        int n2 = this.p1;
        if (n2 == -100) {
            n2 = androidx.appcompat.app.g.C0;
        }
        final int r = this.R(this.G0, n2);
        final Context g0 = this.G0;
        final Object o = null;
        final Map map = null;
        final Object o2 = null;
        final Configuration f = this.F(g0, r, null, false);
        final Context g2 = this.G0;
        final boolean s1 = this.s1;
        final boolean b3 = true;
        boolean r2 = false;
        Label_0249: {
            if (!s1 && this.F0 instanceof Activity) {
                final PackageManager packageManager = g2.getPackageManager();
                if (packageManager == null) {
                    r2 = false;
                    break Label_0249;
                }
                try {
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    int n3;
                    if (sdk_INT >= 29) {
                        n3 = 269221888;
                    }
                    else if (sdk_INT >= 24) {
                        n3 = 786432;
                    }
                    else {
                        n3 = 0;
                    }
                    final ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(g2, (Class)this.F0.getClass()), n3);
                    this.r1 = (activityInfo != null && (activityInfo.configChanges & 0x200) != 0x0);
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", (Throwable)ex);
                    this.r1 = false;
                }
            }
            this.s1 = true;
            r2 = this.r1;
        }
        Configuration configuration;
        if ((configuration = this.o1) == null) {
            configuration = this.G0.getResources().getConfiguration();
        }
        final int n4 = configuration.uiMode & 0x30;
        final int n5 = f.uiMode & 0x30;
        int n6 = b2 ? 1 : 0;
        Label_0429: {
            if (n4 != n5) {
                n6 = (b2 ? 1 : 0);
                if (b) {
                    n6 = (b2 ? 1 : 0);
                    if (!r2) {
                        n6 = (b2 ? 1 : 0);
                        if (this.l1) {
                            if (!AppCompatDelegateImpl.E1) {
                                n6 = (b2 ? 1 : 0);
                                if (!this.m1) {
                                    break Label_0429;
                                }
                            }
                            final Object f2 = this.F0;
                            n6 = (b2 ? 1 : 0);
                            if (f2 instanceof Activity) {
                                n6 = (b2 ? 1 : 0);
                                if (!((Activity)f2).isChild()) {
                                    final Activity activity = (Activity)this.F0;
                                    final int c = hn.c;
                                    if (Build$VERSION.SDK_INT >= 28) {
                                        activity.recreate();
                                    }
                                    else {
                                        new Handler(((Context)activity).getMainLooper()).post((Runnable)new r20(activity, 1));
                                    }
                                    n6 = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean b4;
        if (n6 == 0 && n4 != n5) {
            final Resources resources = this.G0.getResources();
            final Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (n5 | (resources.getConfiguration().uiMode & 0xFFFFFFCF));
            resources.updateConfiguration(configuration2, (DisplayMetrics)null);
            final int sdk_INT2 = Build$VERSION.SDK_INT;
            if (sdk_INT2 < 26) {
                if (sdk_INT2 < 28) {
                    if (sdk_INT2 >= 24) {
                        if (!crm.h) {
                            try {
                                (crm.g = Resources.class.getDeclaredField("mResourcesImpl")).setAccessible(true);
                            }
                            catch (final NoSuchFieldException ex2) {
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", (Throwable)ex2);
                            }
                            crm.h = true;
                        }
                        final Field g3 = crm.g;
                        if (g3 != null) {
                            Object value;
                            try {
                                value = g3.get(resources);
                            }
                            catch (final IllegalAccessException ex3) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", (Throwable)ex3);
                                value = null;
                            }
                            if (value != null) {
                                if (!crm.b) {
                                    try {
                                        (crm.a = value.getClass().getDeclaredField("mDrawableCache")).setAccessible(true);
                                    }
                                    catch (final NoSuchFieldException ex4) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", (Throwable)ex4);
                                    }
                                    crm.b = true;
                                }
                                final Field a = crm.a;
                                Object value2 = o2;
                                if (a != null) {
                                    try {
                                        value2 = a.get(value);
                                    }
                                    catch (final IllegalAccessException ex5) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", (Throwable)ex5);
                                        value2 = o2;
                                    }
                                }
                                if (value2 != null) {
                                    crm.a(value2);
                                }
                            }
                        }
                    }
                    else if (sdk_INT2 >= 23) {
                        if (!crm.b) {
                            try {
                                (crm.a = Resources.class.getDeclaredField("mDrawableCache")).setAccessible(true);
                            }
                            catch (final NoSuchFieldException ex6) {
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", (Throwable)ex6);
                            }
                            crm.b = true;
                        }
                        final Field a2 = crm.a;
                        Object value3 = o;
                        if (a2 != null) {
                            try {
                                value3 = a2.get(resources);
                            }
                            catch (final IllegalAccessException ex7) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", (Throwable)ex7);
                                value3 = o;
                            }
                        }
                        if (value3 != null) {
                            crm.a(value3);
                        }
                    }
                    else {
                        if (!crm.b) {
                            try {
                                (crm.a = Resources.class.getDeclaredField("mDrawableCache")).setAccessible(true);
                            }
                            catch (final NoSuchFieldException ex8) {
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", (Throwable)ex8);
                            }
                            crm.b = true;
                        }
                        final Field a3 = crm.a;
                        if (a3 != null) {
                            Map map2;
                            try {
                                map2 = (Map)a3.get(resources);
                            }
                            catch (final IllegalAccessException ex9) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", (Throwable)ex9);
                                map2 = map;
                            }
                            if (map2 != null) {
                                map2.clear();
                            }
                        }
                    }
                }
            }
            final int q1 = this.q1;
            if (q1 != 0) {
                this.G0.setTheme(q1);
                if (Build$VERSION.SDK_INT >= 23) {
                    this.G0.getTheme().applyStyle(this.q1, true);
                }
            }
            b4 = b3;
            if (r2) {
                final Object f3 = this.F0;
                b4 = b3;
                if (f3 instanceof Activity) {
                    final Activity activity2 = (Activity)f3;
                    if (activity2 instanceof lbf) {
                        b4 = b3;
                        if (((lbf)activity2).b().b().b(d$c.E0)) {
                            activity2.onConfigurationChanged(configuration2);
                            b4 = b3;
                        }
                    }
                    else {
                        b4 = b3;
                        if (this.m1) {
                            b4 = b3;
                            if (!this.n1) {
                                activity2.onConfigurationChanged(configuration2);
                                b4 = b3;
                            }
                        }
                    }
                }
            }
        }
        else {
            b4 = (n6 != 0);
        }
        if (b4) {
            final Object f4 = this.F0;
            if (f4 instanceof f) {
                Objects.requireNonNull(f4);
            }
        }
        if (n2 == 0) {
            this.M(this.G0).e();
        }
        else {
            final j t1 = this.t1;
            if (t1 != null) {
                ((AppCompatDelegateImpl$i)t1).a();
            }
        }
        if (n2 == 3) {
            final Context g4 = this.G0;
            if (this.u1 == null) {
                this.u1 = new h(g4);
            }
            ((AppCompatDelegateImpl$i)this.u1).e();
        }
        else {
            final h u1 = this.u1;
            if (u1 != null) {
                ((AppCompatDelegateImpl$i)u1).a();
            }
        }
        return b4;
    }
    
    public final void B(final Window h0) {
        if (this.H0 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        final Window$Callback callback = h0.getCallback();
        if (!(callback instanceof g)) {
            h0.setCallback((Window$Callback)(this.I0 = new g(callback)));
            final u9t p = u9t.p(this.G0, (AttributeSet)null, AppCompatDelegateImpl.D1);
            final Drawable h2 = p.h(0);
            if (h2 != null) {
                h0.setBackgroundDrawable(h2);
            }
            p.r();
            this.H0 = h0;
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    
    public final void C(final int n, AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState i0, final Menu menu) {
        AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState appCompatDelegateImpl$PanelFeatureState = i0;
        Object h = menu;
        if (menu == null) {
            AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState appCompatDelegateImpl$PanelFeatureState2;
            if ((appCompatDelegateImpl$PanelFeatureState2 = i0) == null) {
                appCompatDelegateImpl$PanelFeatureState2 = i0;
                if (n >= 0) {
                    final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState[] i2 = this.i1;
                    appCompatDelegateImpl$PanelFeatureState2 = i0;
                    if (n < i2.length) {
                        appCompatDelegateImpl$PanelFeatureState2 = i2[n];
                    }
                }
            }
            appCompatDelegateImpl$PanelFeatureState = appCompatDelegateImpl$PanelFeatureState2;
            h = menu;
            if (appCompatDelegateImpl$PanelFeatureState2 != null) {
                h = appCompatDelegateImpl$PanelFeatureState2.h;
                appCompatDelegateImpl$PanelFeatureState = appCompatDelegateImpl$PanelFeatureState2;
            }
        }
        if (appCompatDelegateImpl$PanelFeatureState != null && !appCompatDelegateImpl$PanelFeatureState.m) {
            return;
        }
        if (!this.n1) {
            i0 = (AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState)this.I0;
            final Window$Callback callback = this.H0.getCallback();
            Objects.requireNonNull(i0);
            try {
                ((g)i0).G0 = true;
                callback.onPanelClosed(n, (Menu)h);
            }
            finally {
                ((g)i0).G0 = false;
            }
        }
    }
    
    public final void D(final e e) {
        if (this.h1) {
            return;
        }
        this.h1 = true;
        this.N0.l();
        final Window$Callback o = this.O();
        if (o != null && !this.n1) {
            o.onPanelClosed(108, (Menu)e);
        }
        this.h1 = false;
    }
    
    public final void E(final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState appCompatDelegateImpl$PanelFeatureState, final boolean b) {
        if (b && appCompatDelegateImpl$PanelFeatureState.a == 0) {
            final sc8 n0 = this.N0;
            if (n0 != null && n0.e()) {
                this.D(appCompatDelegateImpl$PanelFeatureState.h);
                return;
            }
        }
        final WindowManager windowManager = (WindowManager)this.G0.getSystemService("window");
        if (windowManager != null && appCompatDelegateImpl$PanelFeatureState.m) {
            final k e = appCompatDelegateImpl$PanelFeatureState.e;
            if (e != null) {
                ((ViewManager)windowManager).removeView((View)e);
                if (b) {
                    this.C(appCompatDelegateImpl$PanelFeatureState.a, appCompatDelegateImpl$PanelFeatureState, null);
                }
            }
        }
        appCompatDelegateImpl$PanelFeatureState.k = false;
        appCompatDelegateImpl$PanelFeatureState.l = false;
        appCompatDelegateImpl$PanelFeatureState.m = false;
        appCompatDelegateImpl$PanelFeatureState.f = null;
        appCompatDelegateImpl$PanelFeatureState.n = true;
        if (this.j1 == appCompatDelegateImpl$PanelFeatureState) {
            this.j1 = null;
        }
    }
    
    public final Configuration F(final Context context, int n, final Configuration to, final boolean b) {
        if (n != 1) {
            if (n != 2) {
                if (b) {
                    n = 0;
                }
                else {
                    n = (context.getApplicationContext().getResources().getConfiguration().uiMode & 0x30);
                }
            }
            else {
                n = 32;
            }
        }
        else {
            n = 16;
        }
        final Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        if (to != null) {
            configuration.setTo(to);
        }
        configuration.uiMode = (n | (configuration.uiMode & 0xFFFFFFCF));
        return configuration;
    }
    
    public final boolean G(final KeyEvent keyEvent) {
        final Object f0 = this.F0;
        final boolean b = f0 instanceof zpe$a;
        final boolean b2 = true;
        boolean k1 = true;
        if (b || f0 instanceof gk0) {
            final View decorView = this.H0.getDecorView();
            if (decorView != null && zpe.a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82) {
            final g i0 = this.I0;
            final Window$Callback callback = this.H0.getCallback();
            Objects.requireNonNull(i0);
            try {
                i0.F0 = true;
                final boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                i0.F0 = false;
                if (dispatchKeyEvent) {
                    return true;
                }
            }
            finally {
                i0.F0 = false;
            }
        }
        final int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    boolean b3 = b2;
                    if (keyEvent.getRepeatCount() != 0) {
                        return b3;
                    }
                    final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n = this.N(0);
                    b3 = b2;
                    if (!n.m) {
                        this.U(n, keyEvent);
                        b3 = b2;
                        return b3;
                    }
                    return b3;
                }
            }
            else {
                if ((keyEvent.getFlags() & 0x80) == 0x0) {
                    k1 = false;
                }
                this.k1 = k1;
            }
        }
        else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.Q0 != null) {
                    return b2;
                }
                final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n2 = this.N(0);
                final sc8 n3 = this.N0;
                int n4 = 0;
                Label_0433: {
                    if (n3 != null && n3.a() && !ViewConfiguration.get(this.G0).hasPermanentMenuKey()) {
                        if (this.N0.e()) {
                            n4 = (this.N0.b() ? 1 : 0);
                            break Label_0433;
                        }
                        if (!this.n1 && this.U(n2, keyEvent)) {
                            n4 = (this.N0.c() ? 1 : 0);
                            break Label_0433;
                        }
                    }
                    else {
                        n4 = (n2.m ? 1 : 0);
                        if (n4 != 0 || n2.l) {
                            this.E(n2, true);
                            break Label_0433;
                        }
                        if (n2.k) {
                            boolean u;
                            if (n2.o) {
                                n2.k = false;
                                u = this.U(n2, keyEvent);
                            }
                            else {
                                u = true;
                            }
                            if (u) {
                                this.S(n2, keyEvent);
                                n4 = 1;
                                break Label_0433;
                            }
                        }
                    }
                    n4 = 0;
                }
                boolean b3 = b2;
                if (n4 == 0) {
                    return b3;
                }
                final AudioManager audioManager = (AudioManager)this.G0.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    b3 = b2;
                    return b3;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                b3 = b2;
                return b3;
            }
        }
        else {
            final boolean k2 = this.k1;
            this.k1 = false;
            final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n5 = this.N(0);
            if (n5.m) {
                boolean b3 = b2;
                if (!k2) {
                    this.E(n5, true);
                    b3 = b2;
                    return b3;
                }
                return b3;
            }
            else {
                final zk q0 = this.Q0;
                boolean b4 = false;
                Label_0578: {
                    if (q0 != null) {
                        q0.c();
                    }
                    else {
                        this.P();
                        final a k3 = this.K0;
                        if (k3 == null || !k3.b()) {
                            b4 = false;
                            break Label_0578;
                        }
                    }
                    b4 = true;
                }
                if (b4) {
                    return b2;
                }
            }
        }
        return false;
    }
    
    public final void H(final int n) {
        final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n2 = this.N(n);
        if (n2.h != null) {
            final Bundle p = new Bundle();
            n2.h.x(p);
            if (((BaseBundle)p).size() > 0) {
                n2.p = p;
            }
            n2.h.B();
            n2.h.clear();
        }
        n2.o = true;
        n2.n = true;
        if ((n == 108 || n == 0) && this.N0 != null) {
            final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n3 = this.N(0);
            n3.k = false;
            this.U(n3, null);
        }
    }
    
    public final void I() {
        final bax u0 = this.U0;
        if (u0 != null) {
            u0.b();
        }
    }
    
    public final void J() {
        if (!this.W0) {
            final TypedArray obtainStyledAttributes = this.G0.obtainStyledAttributes(ck1.O0);
            if (!obtainStyledAttributes.hasValue(117)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(126, false)) {
                this.s(1);
            }
            else if (obtainStyledAttributes.getBoolean(117, false)) {
                this.s(108);
            }
            if (obtainStyledAttributes.getBoolean(118, false)) {
                this.s(109);
            }
            if (obtainStyledAttributes.getBoolean(119, false)) {
                this.s(10);
            }
            this.f1 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.K();
            this.H0.getDecorView();
            final LayoutInflater from = LayoutInflater.from(this.G0);
            ViewGroup viewGroup;
            if (!this.g1) {
                if (this.f1) {
                    viewGroup = (ViewGroup)from.inflate(2131623948, (ViewGroup)null);
                    this.d1 = false;
                    this.c1 = false;
                }
                else if (this.c1) {
                    final TypedValue typedValue = new TypedValue();
                    this.G0.getTheme().resolveAttribute(2130968611, typedValue, true);
                    Object g0;
                    if (typedValue.resourceId != 0) {
                        g0 = new no6(this.G0, typedValue.resourceId);
                    }
                    else {
                        g0 = this.G0;
                    }
                    final ViewGroup viewGroup2 = (ViewGroup)LayoutInflater.from((Context)g0).inflate(2131623959, (ViewGroup)null);
                    (this.N0 = (sc8)((View)viewGroup2).findViewById(2131428615)).setWindowCallback(this.O());
                    if (this.d1) {
                        this.N0.h(109);
                    }
                    if (this.a1) {
                        this.N0.h(2);
                    }
                    viewGroup = viewGroup2;
                    if (this.b1) {
                        this.N0.h(5);
                        viewGroup = viewGroup2;
                    }
                }
                else {
                    viewGroup = null;
                }
            }
            else if (this.e1) {
                viewGroup = (ViewGroup)from.inflate(2131623958, (ViewGroup)null);
            }
            else {
                viewGroup = (ViewGroup)from.inflate(2131623957, (ViewGroup)null);
            }
            if (viewGroup == null) {
                final StringBuilder g2 = w48.g("AppCompat does not support the current theme features: { windowActionBar: ");
                g2.append(this.c1);
                g2.append(", windowActionBarOverlay: ");
                g2.append(this.d1);
                g2.append(", android:windowIsFloating: ");
                g2.append(this.f1);
                g2.append(", windowActionModeOverlay: ");
                g2.append(this.e1);
                g2.append(", windowNoTitle: ");
                throw new IllegalArgumentException(bd.y(g2, this.g1, " }"));
            }
            final bk0 bk0 = new bk0(this);
            final WeakHashMap a = p5x.a;
            p5x$i.u((View)viewGroup, (ogj)bk0);
            if (this.N0 == null) {
                this.Y0 = (TextView)((View)viewGroup).findViewById(2131432073);
            }
            final Method a2 = vbx.a;
            try {
                final Method method = ((View)viewGroup).getClass().getMethod("makeOptionalFitsSystemWindows", (Class<?>[])new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(viewGroup, new Object[0]);
            }
            catch (final IllegalAccessException ex) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", (Throwable)ex);
            }
            catch (final InvocationTargetException ex2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", (Throwable)ex2);
            }
            catch (final NoSuchMethodException ex3) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            }
            final ContentFrameLayout contentFrameLayout = (ContentFrameLayout)((View)viewGroup).findViewById(2131427440);
            final ViewGroup viewGroup3 = (ViewGroup)this.H0.findViewById(16908290);
            if (viewGroup3 != null) {
                while (viewGroup3.getChildCount() > 0) {
                    final View child = viewGroup3.getChildAt(0);
                    viewGroup3.removeViewAt(0);
                    ((ViewGroup)contentFrameLayout).addView(child);
                }
                ((View)viewGroup3).setId(-1);
                ((View)contentFrameLayout).setId(16908290);
                if (viewGroup3 instanceof FrameLayout) {
                    ((FrameLayout)viewGroup3).setForeground((Drawable)null);
                }
            }
            this.H0.setContentView((View)viewGroup);
            contentFrameLayout.setAttachListener((ContentFrameLayout$a)new ck0(this));
            this.X0 = viewGroup;
            final Object f0 = this.F0;
            CharSequence charSequence;
            if (f0 instanceof Activity) {
                charSequence = ((Activity)f0).getTitle();
            }
            else {
                charSequence = this.M0;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                final sc8 n0 = this.N0;
                if (n0 != null) {
                    n0.setWindowTitle(charSequence);
                }
                else {
                    final a k0 = this.K0;
                    if (k0 != null) {
                        k0.u(charSequence);
                    }
                    else {
                        final TextView y0 = this.Y0;
                        if (y0 != null) {
                            y0.setText(charSequence);
                        }
                    }
                }
            }
            final ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout)((View)this.X0).findViewById(16908290);
            final View decorView = this.H0.getDecorView();
            contentFrameLayout2.I0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            final WeakHashMap a3 = p5x.a;
            if (p5x$g.c((View)contentFrameLayout2)) {
                ((View)contentFrameLayout2).requestLayout();
            }
            final TypedArray obtainStyledAttributes2 = this.G0.obtainStyledAttributes(ck1.O0);
            obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
            obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
            if (obtainStyledAttributes2.hasValue(122)) {
                obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
            }
            if (obtainStyledAttributes2.hasValue(123)) {
                obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
            }
            if (obtainStyledAttributes2.hasValue(120)) {
                obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
            }
            if (obtainStyledAttributes2.hasValue(121)) {
                obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
            }
            obtainStyledAttributes2.recycle();
            ((View)contentFrameLayout2).requestLayout();
            this.W0 = true;
            final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n2 = this.N(0);
            if (!this.n1 && n2.h == null) {
                this.Q(108);
            }
        }
    }
    
    public final void K() {
        if (this.H0 == null) {
            final Object f0 = this.F0;
            if (f0 instanceof Activity) {
                this.B(((Activity)f0).getWindow());
            }
        }
        if (this.H0 != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }
    
    public final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState L(final Menu menu) {
        final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState[] i1 = this.i1;
        int j = 0;
        int length;
        if (i1 != null) {
            length = i1.length;
        }
        else {
            length = 0;
        }
        while (j < length) {
            final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState appCompatDelegateImpl$PanelFeatureState = i1[j];
            if (appCompatDelegateImpl$PanelFeatureState != null && appCompatDelegateImpl$PanelFeatureState.h == menu) {
                return appCompatDelegateImpl$PanelFeatureState;
            }
            ++j;
        }
        return null;
    }
    
    public final AppCompatDelegateImpl$i M(Context applicationContext) {
        if (this.t1 == null) {
            if (n0v.d == null) {
                applicationContext = applicationContext.getApplicationContext();
                n0v.d = new n0v(applicationContext, (LocationManager)applicationContext.getSystemService("location"));
            }
            this.t1 = new j(n0v.d);
        }
        return (AppCompatDelegateImpl$i)this.t1;
    }
    
    public final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState N(final int n) {
        final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState[] i1 = this.i1;
        AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState[] i2 = null;
        Label_0042: {
            if (i1 != null) {
                i2 = i1;
                if (i1.length > n) {
                    break Label_0042;
                }
            }
            i2 = new AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState[n + 1];
            if (i1 != null) {
                System.arraycopy(i1, 0, i2, 0, i1.length);
            }
            this.i1 = i2;
        }
        AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState appCompatDelegateImpl$PanelFeatureState;
        if ((appCompatDelegateImpl$PanelFeatureState = i2[n]) == null) {
            appCompatDelegateImpl$PanelFeatureState = new AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState(n);
            i2[n] = appCompatDelegateImpl$PanelFeatureState;
        }
        return appCompatDelegateImpl$PanelFeatureState;
    }
    
    public final Window$Callback O() {
        return this.H0.getCallback();
    }
    
    public final void P() {
        this.J();
        if (this.c1) {
            if (this.K0 == null) {
                final Object f0 = this.F0;
                if (f0 instanceof Activity) {
                    this.K0 = new i((Activity)this.F0, this.d1);
                }
                else if (f0 instanceof Dialog) {
                    this.K0 = new i((Dialog)this.F0);
                }
                final a k0 = this.K0;
                if (k0 != null) {
                    k0.n(this.y1);
                }
            }
        }
    }
    
    public final void Q(final int n) {
        this.w1 |= 1 << n;
        if (!this.v1) {
            final View decorView = this.H0.getDecorView();
            final AppCompatDelegateImpl$a x1 = this.x1;
            final WeakHashMap a = p5x.a;
            p5x$d.m(decorView, (Runnable)x1);
            this.v1 = true;
        }
    }
    
    public final int R(final Context context, int n) {
        if (n != -100) {
            if (n != -1) {
                if (n != 0) {
                    final int n2 = 1;
                    if (n != 1 && n != 2) {
                        if (n == 3) {
                            if (this.u1 == null) {
                                this.u1 = new h(context);
                            }
                            n = n2;
                            if (this.u1.c.isPowerSaveMode()) {
                                n = 2;
                            }
                            return n;
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
                else {
                    if (Build$VERSION.SDK_INT >= 23 && ((UiModeManager)context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                        return -1;
                    }
                    return this.M(context).c();
                }
            }
            return n;
        }
        return -1;
    }
    
    public final void S(final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState appCompatDelegateImpl$PanelFeatureState, final KeyEvent keyEvent) {
        if (!appCompatDelegateImpl$PanelFeatureState.m) {
            if (!this.n1) {
                if (appCompatDelegateImpl$PanelFeatureState.a == 0 && (this.G0.getResources().getConfiguration().screenLayout & 0xF) == 0x4) {
                    return;
                }
                final Window$Callback o = this.O();
                if (o != null && !o.onMenuOpened(appCompatDelegateImpl$PanelFeatureState.a, (Menu)appCompatDelegateImpl$PanelFeatureState.h)) {
                    this.E(appCompatDelegateImpl$PanelFeatureState, true);
                    return;
                }
                final WindowManager windowManager = (WindowManager)this.G0.getSystemService("window");
                if (windowManager == null) {
                    return;
                }
                if (!this.U(appCompatDelegateImpl$PanelFeatureState, keyEvent)) {
                    return;
                }
                final k e = appCompatDelegateImpl$PanelFeatureState.e;
                int n = 0;
                Label_0759: {
                    Label_0756: {
                        if (e == null || appCompatDelegateImpl$PanelFeatureState.n) {
                            if (e == null) {
                                this.P();
                                final a k0 = this.K0;
                                Context e2;
                                if (k0 != null) {
                                    e2 = k0.e();
                                }
                                else {
                                    e2 = null;
                                }
                                Context g0 = e2;
                                if (e2 == null) {
                                    g0 = this.G0;
                                }
                                final TypedValue typedValue = new TypedValue();
                                final Resources$Theme theme = g0.getResources().newTheme();
                                theme.setTo(g0.getTheme());
                                theme.resolveAttribute(2130968604, typedValue, true);
                                final int resourceId = typedValue.resourceId;
                                if (resourceId != 0) {
                                    theme.applyStyle(resourceId, true);
                                }
                                theme.resolveAttribute(2130970289, typedValue, true);
                                final int resourceId2 = typedValue.resourceId;
                                if (resourceId2 != 0) {
                                    theme.applyStyle(resourceId2, true);
                                }
                                else {
                                    theme.applyStyle(2132018555, true);
                                }
                                final no6 j = new no6(g0, 0);
                                j.getTheme().setTo(theme);
                                appCompatDelegateImpl$PanelFeatureState.j = j;
                                final TypedArray obtainStyledAttributes = ((Context)j).obtainStyledAttributes(ck1.O0);
                                appCompatDelegateImpl$PanelFeatureState.b = obtainStyledAttributes.getResourceId(86, 0);
                                appCompatDelegateImpl$PanelFeatureState.d = obtainStyledAttributes.getResourceId(1, 0);
                                obtainStyledAttributes.recycle();
                                appCompatDelegateImpl$PanelFeatureState.e = new k((Context)appCompatDelegateImpl$PanelFeatureState.j);
                                appCompatDelegateImpl$PanelFeatureState.c = 81;
                            }
                            else if (appCompatDelegateImpl$PanelFeatureState.n && ((ViewGroup)e).getChildCount() > 0) {
                                ((ViewGroup)appCompatDelegateImpl$PanelFeatureState.e).removeAllViews();
                            }
                            final View g2 = appCompatDelegateImpl$PanelFeatureState.g;
                            boolean b = false;
                            Label_0601: {
                                Label_0594: {
                                    if (g2 == null) {
                                        if (appCompatDelegateImpl$PanelFeatureState.h != null) {
                                            if (this.P0 == null) {
                                                this.P0 = new l();
                                            }
                                            final l p2 = this.P0;
                                            if (appCompatDelegateImpl$PanelFeatureState.i == null) {
                                                final c i = new c((Context)appCompatDelegateImpl$PanelFeatureState.j);
                                                appCompatDelegateImpl$PanelFeatureState.i = i;
                                                i.G0 = (i$a)p2;
                                                appCompatDelegateImpl$PanelFeatureState.h.b((androidx.appcompat.view.menu.i)i);
                                            }
                                            final c l = appCompatDelegateImpl$PanelFeatureState.i;
                                            final k e3 = appCompatDelegateImpl$PanelFeatureState.e;
                                            if (l.F0 == null) {
                                                l.F0 = (ExpandedMenuView)l.D0.inflate(2131623949, (ViewGroup)e3, false);
                                                if (l.H0 == null) {
                                                    l.H0 = new c$a(l);
                                                }
                                                ((AbsListView)l.F0).setAdapter((ListAdapter)l.H0);
                                                ((AdapterView)l.F0).setOnItemClickListener((AdapterView$OnItemClickListener)l);
                                            }
                                            if ((appCompatDelegateImpl$PanelFeatureState.f = (View)l.F0) != null) {
                                                break Label_0594;
                                            }
                                        }
                                        b = false;
                                        break Label_0601;
                                    }
                                    appCompatDelegateImpl$PanelFeatureState.f = g2;
                                }
                                b = true;
                            }
                            if (b) {
                                boolean b2 = false;
                                Label_0648: {
                                    Label_0646: {
                                        if (appCompatDelegateImpl$PanelFeatureState.f != null) {
                                            if (appCompatDelegateImpl$PanelFeatureState.g == null) {
                                                if (((c$a)appCompatDelegateImpl$PanelFeatureState.i.i()).getCount() <= 0) {
                                                    break Label_0646;
                                                }
                                            }
                                            b2 = true;
                                            break Label_0648;
                                        }
                                    }
                                    b2 = false;
                                }
                                if (b2) {
                                    ViewGroup$LayoutParams layoutParams;
                                    if ((layoutParams = appCompatDelegateImpl$PanelFeatureState.f.getLayoutParams()) == null) {
                                        layoutParams = new ViewGroup$LayoutParams(-2, -2);
                                    }
                                    appCompatDelegateImpl$PanelFeatureState.e.setBackgroundResource(appCompatDelegateImpl$PanelFeatureState.b);
                                    final ViewParent parent = appCompatDelegateImpl$PanelFeatureState.f.getParent();
                                    if (parent instanceof ViewGroup) {
                                        ((ViewGroup)parent).removeView(appCompatDelegateImpl$PanelFeatureState.f);
                                    }
                                    ((ViewGroup)appCompatDelegateImpl$PanelFeatureState.e).addView(appCompatDelegateImpl$PanelFeatureState.f, layoutParams);
                                    if (!appCompatDelegateImpl$PanelFeatureState.f.hasFocus()) {
                                        appCompatDelegateImpl$PanelFeatureState.f.requestFocus();
                                    }
                                    break Label_0756;
                                }
                            }
                            appCompatDelegateImpl$PanelFeatureState.n = true;
                            return;
                        }
                        final View g3 = appCompatDelegateImpl$PanelFeatureState.g;
                        if (g3 != null) {
                            final ViewGroup$LayoutParams layoutParams2 = g3.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                n = -1;
                                break Label_0759;
                            }
                        }
                    }
                    n = -2;
                }
                appCompatDelegateImpl$PanelFeatureState.l = false;
                final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams(n, -2, 0, 0, 1002, 8519680, -3);
                windowManager$LayoutParams.gravity = appCompatDelegateImpl$PanelFeatureState.c;
                windowManager$LayoutParams.windowAnimations = appCompatDelegateImpl$PanelFeatureState.d;
                ((ViewManager)windowManager).addView((View)appCompatDelegateImpl$PanelFeatureState.e, (ViewGroup$LayoutParams)windowManager$LayoutParams);
                appCompatDelegateImpl$PanelFeatureState.m = true;
            }
        }
    }
    
    public final boolean T(final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState appCompatDelegateImpl$PanelFeatureState, final int n, final KeyEvent keyEvent) {
        final boolean system = keyEvent.isSystem();
        final boolean b = false;
        if (system) {
            return false;
        }
        if (!appCompatDelegateImpl$PanelFeatureState.k) {
            final boolean performShortcut = b;
            if (!this.U(appCompatDelegateImpl$PanelFeatureState, keyEvent)) {
                return performShortcut;
            }
        }
        final e h = appCompatDelegateImpl$PanelFeatureState.h;
        boolean performShortcut = b;
        if (h != null) {
            performShortcut = h.performShortcut(n, keyEvent, 1);
        }
        return performShortcut;
    }
    
    public final boolean U(final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState j1, final KeyEvent keyEvent) {
        if (this.n1) {
            return false;
        }
        if (j1.k) {
            return true;
        }
        final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState j2 = this.j1;
        if (j2 != null && j2 != j1) {
            this.E(j2, false);
        }
        final Window$Callback o = this.O();
        if (o != null) {
            j1.g = o.onCreatePanelView(j1.a);
        }
        final int a = j1.a;
        final boolean b = a == 0 || a == 108;
        if (b) {
            final sc8 n0 = this.N0;
            if (n0 != null) {
                n0.f();
            }
        }
        if (j1.g == null && (!b || !(this.K0 instanceof androidx.appcompat.app.h))) {
            final e h = j1.h;
            if (h == null || j1.o) {
                if (h == null) {
                    final Context g0 = this.G0;
                    final int a2 = j1.a;
                    Object o2 = null;
                    Label_0356: {
                        if (a2 != 0) {
                            o2 = g0;
                            if (a2 != 108) {
                                break Label_0356;
                            }
                        }
                        o2 = g0;
                        if (this.N0 != null) {
                            final TypedValue typedValue = new TypedValue();
                            final Resources$Theme theme = g0.getTheme();
                            theme.resolveAttribute(2130968611, typedValue, true);
                            Resources$Theme theme2;
                            if (typedValue.resourceId != 0) {
                                theme2 = g0.getResources().newTheme();
                                theme2.setTo(theme);
                                theme2.applyStyle(typedValue.resourceId, true);
                                theme2.resolveAttribute(2130968612, typedValue, true);
                            }
                            else {
                                theme.resolveAttribute(2130968612, typedValue, true);
                                theme2 = null;
                            }
                            Resources$Theme theme3 = theme2;
                            if (typedValue.resourceId != 0) {
                                if ((theme3 = theme2) == null) {
                                    theme3 = g0.getResources().newTheme();
                                    theme3.setTo(theme);
                                }
                                theme3.applyStyle(typedValue.resourceId, true);
                            }
                            o2 = g0;
                            if (theme3 != null) {
                                o2 = new no6(g0, 0);
                                ((no6)o2).getTheme().setTo(theme3);
                            }
                        }
                    }
                    final e e = new e((Context)o2);
                    e.e = (e.e$a)this;
                    j1.a(e);
                    if (j1.h == null) {
                        return false;
                    }
                }
                if (b) {
                    final sc8 n2 = this.N0;
                    if (n2 != null) {
                        if (this.O0 == null) {
                            this.O0 = new AppCompatDelegateImpl.AppCompatDelegateImpl$c(this);
                        }
                        n2.d((Menu)j1.h, (i$a)this.O0);
                    }
                }
                j1.h.B();
                if (!o.onCreatePanelMenu(j1.a, (Menu)j1.h)) {
                    j1.a((e)null);
                    if (b) {
                        final sc8 n3 = this.N0;
                        if (n3 != null) {
                            n3.d((Menu)null, (i$a)this.O0);
                        }
                    }
                    return false;
                }
                j1.o = false;
            }
            j1.h.B();
            final Bundle p2 = j1.p;
            if (p2 != null) {
                j1.h.w(p2);
                j1.p = null;
            }
            if (!o.onPreparePanel(0, j1.g, (Menu)j1.h)) {
                if (b) {
                    final sc8 n4 = this.N0;
                    if (n4 != null) {
                        n4.d((Menu)null, (i$a)this.O0);
                    }
                }
                j1.h.A();
                return false;
            }
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            j1.h.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
            j1.h.A();
        }
        j1.k = true;
        j1.l = false;
        this.j1 = j1;
        return true;
    }
    
    public final void V() {
        if (!this.W0) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
    
    public final int W(vox o) {
        int i = o.i();
        final ActionBarContextView r0 = this.R0;
        final int n = 8;
        int n6;
        int n7;
        if (r0 != null && ((View)r0).getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)((View)this.R0).getLayoutParams();
            final boolean shown = ((View)this.R0).isShown();
            boolean b = true;
            final int n2 = 1;
            int n3;
            if (shown) {
                if (this.z1 == null) {
                    this.z1 = new Rect();
                    this.A1 = new Rect();
                }
                final Rect z1 = this.z1;
                final Rect a1 = this.A1;
                z1.set(o.g(), o.i(), o.h(), o.f());
                vbx.a((View)this.X0, z1, a1);
                final int top = z1.top;
                final int left = z1.left;
                final int right = z1.right;
                o = p5x.o((View)this.X0);
                int g;
                if (o == null) {
                    g = 0;
                }
                else {
                    g = o.g();
                }
                int h;
                if (o == null) {
                    h = 0;
                }
                else {
                    h = o.h();
                }
                if (layoutParams.topMargin == top && layoutParams.leftMargin == left && layoutParams.rightMargin == right) {
                    b = false;
                }
                else {
                    layoutParams.topMargin = top;
                    layoutParams.leftMargin = left;
                    layoutParams.rightMargin = right;
                    b = true;
                }
                if (top > 0 && this.Z0 == null) {
                    (this.Z0 = new View(this.G0)).setVisibility(8);
                    final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, layoutParams.topMargin, 51);
                    frameLayout$LayoutParams.leftMargin = g;
                    frameLayout$LayoutParams.rightMargin = h;
                    this.X0.addView(this.Z0, -1, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
                }
                else {
                    final View z2 = this.Z0;
                    if (z2 != null) {
                        final ViewGroup$MarginLayoutParams layoutParams2 = (ViewGroup$MarginLayoutParams)z2.getLayoutParams();
                        final int height = layoutParams2.height;
                        final int topMargin = layoutParams.topMargin;
                        if (height != topMargin || layoutParams2.leftMargin != g || layoutParams2.rightMargin != h) {
                            layoutParams2.height = topMargin;
                            layoutParams2.leftMargin = g;
                            layoutParams2.rightMargin = h;
                            this.Z0.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        }
                    }
                }
                final View z3 = this.Z0;
                if (z3 != null) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                if (n3 != 0 && z3.getVisibility() != 0) {
                    final View z4 = this.Z0;
                    final WeakHashMap a2 = p5x.a;
                    int n4;
                    if ((p5x$d.g(z4) & 0x2000) != 0x0) {
                        n4 = n2;
                    }
                    else {
                        n4 = 0;
                    }
                    int backgroundColor;
                    if (n4 != 0) {
                        backgroundColor = eo6.b(this.G0, 2131099654);
                    }
                    else {
                        backgroundColor = eo6.b(this.G0, 2131099653);
                    }
                    z4.setBackgroundColor(backgroundColor);
                }
                int n5 = i;
                if (!this.e1) {
                    n5 = i;
                    if (n3 != 0) {
                        n5 = 0;
                    }
                }
                i = n5;
            }
            else {
                if (layoutParams.topMargin != 0) {
                    layoutParams.topMargin = 0;
                }
                else {
                    b = false;
                }
                n3 = 0;
            }
            n6 = i;
            n7 = n3;
            if (b) {
                ((View)this.R0).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                n6 = i;
                n7 = n3;
            }
        }
        else {
            n7 = 0;
            n6 = i;
        }
        final View z5 = this.Z0;
        if (z5 != null) {
            int visibility = n;
            if (n7 != 0) {
                visibility = 0;
            }
            z5.setVisibility(visibility);
        }
        return n6;
    }
    
    public final boolean a(final e e, final MenuItem menuItem) {
        final Window$Callback o = this.O();
        if (o != null && !this.n1) {
            final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState l = this.L((Menu)e.l());
            if (l != null) {
                return o.onMenuItemSelected(l.a, menuItem);
            }
        }
        return false;
    }
    
    public final void b(final e e) {
        final sc8 n0 = this.N0;
        if (n0 != null && n0.a() && (!ViewConfiguration.get(this.G0).hasPermanentMenuKey() || this.N0.g())) {
            final Window$Callback o = this.O();
            if (this.N0.e()) {
                this.N0.b();
                if (!this.n1) {
                    o.onPanelClosed(108, (Menu)this.N(0).h);
                }
            }
            else if (o != null && !this.n1) {
                if (this.v1 && (0x1 & this.w1) != 0x0) {
                    this.H0.getDecorView().removeCallbacks((Runnable)this.x1);
                    this.x1.run();
                }
                final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n2 = this.N(0);
                final e h = n2.h;
                if (h != null && !n2.o && o.onPreparePanel(0, n2.g, (Menu)h)) {
                    o.onMenuOpened(108, (Menu)n2.h);
                    this.N0.c();
                }
            }
        }
        else {
            final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n3 = this.N(0);
            n3.n = true;
            this.E(n3, false);
            this.S(n3, null);
        }
    }
    
    public final void c(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.J();
        ((ViewGroup)((View)this.X0).findViewById(16908290)).addView(view, viewGroup$LayoutParams);
        this.I0.a(this.H0.getCallback());
    }
    
    public final boolean d() {
        return this.A(true);
    }
    
    public final Context e(Context theme) {
        this.l1 = true;
        int n = this.p1;
        if (n == -100) {
            n = androidx.appcompat.app.g.C0;
        }
        final int r = this.R((Context)theme, n);
        if (AppCompatDelegateImpl.F1 && theme instanceof ContextThemeWrapper) {
            final Configuration f = this.F((Context)theme, r, null, false);
            try {
                ((ContextThemeWrapper)theme).applyOverrideConfiguration(f);
                return (Context)theme;
            }
            catch (final IllegalStateException ex) {}
        }
        if (theme instanceof no6) {
            final Configuration f2 = this.F((Context)theme, r, null, false);
            try {
                ((no6)theme).a(f2);
                return (Context)theme;
            }
            catch (final IllegalStateException ex2) {}
        }
        if (!AppCompatDelegateImpl.E1) {
            return (Context)theme;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        final Configuration configuration2 = ((Context)theme).createConfigurationContext(configuration).getResources().getConfiguration();
        final Configuration configuration3 = ((Context)theme).getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configuration5;
        if (!configuration2.equals(configuration3)) {
            final Configuration configuration4 = new Configuration();
            configuration4.fontScale = 0.0f;
            if (configuration2.diff(configuration3) == 0) {
                configuration5 = configuration4;
            }
            else {
                final float fontScale = configuration2.fontScale;
                final float fontScale2 = configuration3.fontScale;
                if (fontScale != fontScale2) {
                    configuration4.fontScale = fontScale2;
                }
                final int mcc = configuration2.mcc;
                final int mcc2 = configuration3.mcc;
                if (mcc != mcc2) {
                    configuration4.mcc = mcc2;
                }
                final int mnc = configuration2.mnc;
                final int mnc2 = configuration3.mnc;
                if (mnc != mnc2) {
                    configuration4.mnc = mnc2;
                }
                if (sdk_INT >= 24) {
                    AppCompatDelegateImpl.AppCompatDelegateImpl$e.a(configuration2, configuration3, configuration4);
                }
                else if (!a5j.a((Object)configuration2.locale, (Object)configuration3.locale)) {
                    configuration4.locale = configuration3.locale;
                }
                final int touchscreen = configuration2.touchscreen;
                final int touchscreen2 = configuration3.touchscreen;
                if (touchscreen != touchscreen2) {
                    configuration4.touchscreen = touchscreen2;
                }
                final int keyboard = configuration2.keyboard;
                final int keyboard2 = configuration3.keyboard;
                if (keyboard != keyboard2) {
                    configuration4.keyboard = keyboard2;
                }
                final int keyboardHidden = configuration2.keyboardHidden;
                final int keyboardHidden2 = configuration3.keyboardHidden;
                if (keyboardHidden != keyboardHidden2) {
                    configuration4.keyboardHidden = keyboardHidden2;
                }
                final int navigation = configuration2.navigation;
                final int navigation2 = configuration3.navigation;
                if (navigation != navigation2) {
                    configuration4.navigation = navigation2;
                }
                final int navigationHidden = configuration2.navigationHidden;
                final int navigationHidden2 = configuration3.navigationHidden;
                if (navigationHidden != navigationHidden2) {
                    configuration4.navigationHidden = navigationHidden2;
                }
                final int orientation = configuration2.orientation;
                final int orientation2 = configuration3.orientation;
                if (orientation != orientation2) {
                    configuration4.orientation = orientation2;
                }
                final int screenLayout = configuration2.screenLayout;
                final int n2 = configuration3.screenLayout & 0xF;
                if ((screenLayout & 0xF) != n2) {
                    configuration4.screenLayout |= n2;
                }
                final int screenLayout2 = configuration2.screenLayout;
                final int n3 = configuration3.screenLayout & 0xC0;
                if ((screenLayout2 & 0xC0) != n3) {
                    configuration4.screenLayout |= n3;
                }
                final int screenLayout3 = configuration2.screenLayout;
                final int n4 = configuration3.screenLayout & 0x30;
                if ((screenLayout3 & 0x30) != n4) {
                    configuration4.screenLayout |= n4;
                }
                final int screenLayout4 = configuration2.screenLayout;
                final int n5 = configuration3.screenLayout & 0x300;
                if ((screenLayout4 & 0x300) != n5) {
                    configuration4.screenLayout |= n5;
                }
                if (sdk_INT >= 26) {
                    AppCompatDelegateImpl.AppCompatDelegateImpl$f.a(configuration2, configuration3, configuration4);
                }
                final int uiMode = configuration2.uiMode;
                final int n6 = configuration3.uiMode & 0xF;
                if ((uiMode & 0xF) != n6) {
                    configuration4.uiMode |= n6;
                }
                final int uiMode2 = configuration2.uiMode;
                final int n7 = configuration3.uiMode & 0x30;
                if ((uiMode2 & 0x30) != n7) {
                    configuration4.uiMode |= n7;
                }
                final int screenWidthDp = configuration2.screenWidthDp;
                final int screenWidthDp2 = configuration3.screenWidthDp;
                if (screenWidthDp != screenWidthDp2) {
                    configuration4.screenWidthDp = screenWidthDp2;
                }
                final int screenHeightDp = configuration2.screenHeightDp;
                final int screenHeightDp2 = configuration3.screenHeightDp;
                if (screenHeightDp != screenHeightDp2) {
                    configuration4.screenHeightDp = screenHeightDp2;
                }
                final int smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                final int smallestScreenWidthDp2 = configuration3.smallestScreenWidthDp;
                if (smallestScreenWidthDp != smallestScreenWidthDp2) {
                    configuration4.smallestScreenWidthDp = smallestScreenWidthDp2;
                }
                final int densityDpi = configuration2.densityDpi;
                final int densityDpi2 = configuration3.densityDpi;
                configuration5 = configuration4;
                if (densityDpi != densityDpi2) {
                    configuration4.densityDpi = densityDpi2;
                    configuration5 = configuration4;
                }
            }
        }
        else {
            configuration5 = null;
        }
        final Configuration f3 = this.F((Context)theme, r, configuration5, true);
        final no6 no6 = new no6((Context)theme, 2132018567);
        no6.a(f3);
        while (true) {
            try {
                boolean b;
                if (((Context)theme).getTheme() != null) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (b) {
                    theme = (InvocationTargetException)no6.getTheme();
                    final int sdk_INT2 = Build$VERSION.SDK_INT;
                    if (sdk_INT2 >= 29) {
                        brm.a((Resources$Theme)theme);
                    }
                    else if (sdk_INT2 >= 23) {
                        synchronized (arm.a) {
                            if (!arm.c) {
                                try {
                                    (arm.b = Resources$Theme.class.getDeclaredMethod("rebase", (Class<?>[])new Class[0])).setAccessible(true);
                                }
                                catch (final NoSuchMethodException ex3) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", (Throwable)ex3);
                                }
                                arm.c = true;
                            }
                            final Method b2 = arm.b;
                            if (b2 != null) {
                                try {
                                    b2.invoke(theme, new Object[0]);
                                    return (Context)no6;
                                }
                                catch (final InvocationTargetException theme) {}
                                catch (final IllegalAccessException ex4) {}
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", (Throwable)theme);
                                arm.b = null;
                            }
                        }
                    }
                }
                return (Context)no6;
            }
            catch (final NullPointerException ex5) {
                continue;
            }
            break;
        }
    }
    
    public final <T extends View> T f(final int n) {
        this.J();
        return (T)this.H0.findViewById(n);
    }
    
    public final int g() {
        return this.p1;
    }
    
    public final MenuInflater h() {
        if (this.L0 == null) {
            this.P();
            final a k0 = this.K0;
            Context context;
            if (k0 != null) {
                context = k0.e();
            }
            else {
                context = this.G0;
            }
            this.L0 = new ryr(context);
        }
        return (MenuInflater)this.L0;
    }
    
    public final a i() {
        this.P();
        return this.K0;
    }
    
    public final void j() {
        final LayoutInflater from = LayoutInflater.from(this.G0);
        if (from.getFactory() == null) {
            from.setFactory2((LayoutInflater$Factory2)this);
        }
        else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }
    
    public final void k() {
        if (this.K0 != null) {
            this.P();
            if (!this.K0.f()) {
                this.Q(0);
            }
        }
    }
    
    public final void l(final Configuration configuration) {
        if (this.c1 && this.W0) {
            this.P();
            final a k0 = this.K0;
            if (k0 != null) {
                k0.g();
            }
        }
        final ik0 a = ik0.a();
        final Context g0 = this.G0;
        synchronized (a) {
            final pqm a2 = a.a;
            synchronized (a2) {
                final ocg ocg = a2.d.get(g0);
                if (ocg != null) {
                    ocg.c();
                }
                monitorexit(a2);
                monitorexit(a);
                this.o1 = new Configuration(this.G0.getResources().getConfiguration());
                this.A(false);
                configuration.updateFrom(this.G0.getResources().getConfiguration());
            }
        }
    }
    
    public final void m() {
        this.l1 = true;
        this.A(false);
        this.K();
        final Object f0 = this.F0;
        if (f0 instanceof Activity) {
            String c = null;
            try {
                final Activity activity = (Activity)f0;
                try {
                    c = bai.c((Context)activity, activity.getComponentName());
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    throw new IllegalArgumentException((Throwable)ex);
                }
            }
            catch (final IllegalArgumentException ex2) {}
            if (c != null) {
                final a k0 = this.K0;
                if (k0 == null) {
                    this.y1 = true;
                }
                else {
                    k0.n(true);
                }
            }
            synchronized (androidx.appcompat.app.g.E0) {
                androidx.appcompat.app.g.r((androidx.appcompat.app.g)this);
                androidx.appcompat.app.g.D0.add((Object)new WeakReference(this));
            }
        }
        this.o1 = new Configuration(this.G0.getResources().getConfiguration());
        this.m1 = true;
    }
    
    public final void n() {
        if (this.F0 instanceof Activity) {
            synchronized (androidx.appcompat.app.g.E0) {
                androidx.appcompat.app.g.r((androidx.appcompat.app.g)this);
            }
        }
        if (this.v1) {
            this.H0.getDecorView().removeCallbacks((Runnable)this.x1);
        }
        this.n1 = true;
        Label_0132: {
            if (this.p1 != -100) {
                final Object f0 = this.F0;
                if (f0 instanceof Activity && ((Activity)f0).isChangingConfigurations()) {
                    AppCompatDelegateImpl.C1.put((Object)this.F0.getClass().getName(), (Object)this.p1);
                    break Label_0132;
                }
            }
            AppCompatDelegateImpl.C1.remove((Object)this.F0.getClass().getName());
        }
        final a k0 = this.K0;
        if (k0 != null) {
            k0.h();
        }
        final j t1 = this.t1;
        if (t1 != null) {
            ((AppCompatDelegateImpl$i)t1).a();
        }
        final h u1 = this.u1;
        if (u1 != null) {
            ((AppCompatDelegateImpl$i)u1).a();
        }
    }
    
    public final void o() {
        this.P();
        final a k0 = this.K0;
        if (k0 != null) {
            k0.t(true);
        }
    }
    
    public final View onCreateView(View o, String attributeValue, final Context context, final AttributeSet set) {
        if (this.B1 == null) {
            final String string = this.G0.obtainStyledAttributes(ck1.O0).getString(116);
            if (string == null) {
                this.B1 = new al0();
            }
            else {
                try {
                    this.B1 = (al0)this.G0.getClassLoader().loadClass(string).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                }
                finally {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    final Throwable t;
                    Log.i("AppCompatDelegate", sb.toString(), t);
                    this.B1 = new al0();
                }
            }
        }
        final al0 b1 = this.B1;
        final int a = vow.a;
        Objects.requireNonNull(b1);
        int n = 4;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ck1.e1, 0, 0);
        final int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Object o2;
        if (resourceId != 0 && (!(context instanceof no6) || ((no6)context).a != resourceId)) {
            o2 = new no6(context, resourceId);
        }
        else {
            o2 = context;
        }
        Objects.requireNonNull(attributeValue);
        Label_0646: {
            switch (attributeValue) {
                case "Button": {
                    n = 13;
                    break Label_0646;
                }
                case "EditText": {
                    n = 12;
                    break Label_0646;
                }
                case "CheckBox": {
                    n = 11;
                    break Label_0646;
                }
                case "AutoCompleteTextView": {
                    n = 10;
                    break Label_0646;
                }
                case "ImageView": {
                    n = 9;
                    break Label_0646;
                }
                case "ToggleButton": {
                    n = 8;
                    break Label_0646;
                }
                case "RadioButton": {
                    n = 7;
                    break Label_0646;
                }
                case "Spinner": {
                    n = 6;
                    break Label_0646;
                }
                case "SeekBar": {
                    n = 5;
                    break Label_0646;
                }
                case "ImageButton": {
                    break Label_0646;
                }
                case "TextView": {
                    n = 3;
                    break Label_0646;
                }
                case "MultiAutoCompleteTextView": {
                    n = 2;
                    break Label_0646;
                }
                case "CheckedTextView": {
                    n = 1;
                    break Label_0646;
                }
                case "RatingBar": {
                    n = 0;
                    break Label_0646;
                }
                default:
                    break;
            }
            n = -1;
        }
        switch (n) {
            default: {
                o = b1.f((Context)o2, attributeValue, set);
                break;
            }
            case 13: {
                o = b1.b((Context)o2, set);
                b1.h((View)o, attributeValue);
                break;
            }
            case 12: {
                o = new AppCompatEditText((Context)o2, set);
                break;
            }
            case 11: {
                o = b1.c((Context)o2, set);
                b1.h((View)o, attributeValue);
                break;
            }
            case 10: {
                o = b1.a((Context)o2, set);
                b1.h((View)o, attributeValue);
                break;
            }
            case 9: {
                o = new AppCompatImageView((Context)o2, set);
                break;
            }
            case 8: {
                o = new zk0((Context)o2, set);
                break;
            }
            case 7: {
                o = b1.d((Context)o2, set);
                b1.h((View)o, attributeValue);
                break;
            }
            case 6: {
                o = new AppCompatSpinner((Context)o2, set);
                break;
            }
            case 5: {
                o = new AppCompatSeekBar((Context)o2, set);
                break;
            }
            case 4: {
                o = new AppCompatImageButton((Context)o2, set);
                break;
            }
            case 3: {
                o = b1.e((Context)o2, set);
                b1.h((View)o, attributeValue);
                break;
            }
            case 2: {
                o = new mk0((Context)o2, set);
                break;
            }
            case 1: {
                o = new yj0((Context)o2, set);
                break;
            }
            case 0: {
                o = new rk0((Context)o2, set);
                break;
            }
        }
        Object o3 = o;
        if (o == null) {
            o3 = o;
            if (context != o2) {
                final boolean equals = attributeValue.equals("view");
                o3 = null;
                if (equals) {
                    attributeValue = set.getAttributeValue((String)null, "class");
                }
                try {
                    final Object[] a2 = b1.a;
                    a2[0] = o2;
                    a2[1] = set;
                    if (-1 == attributeValue.indexOf(46)) {
                        int n2 = 0;
                        while (true) {
                            final String[] g = al0.g;
                            if (n2 >= 3) {
                                break;
                            }
                            o = b1.g((Context)o2, attributeValue, g[n2]);
                            if (o != null) {
                                final Object[] a3 = b1.a;
                                a3[1] = (a3[0] = null);
                                o3 = o;
                                break;
                            }
                            ++n2;
                        }
                    }
                    else {
                        o = b1.g((Context)o2, attributeValue, (String)null);
                        final Object[] a4 = b1.a;
                        a4[1] = (a4[0] = null);
                        o3 = o;
                    }
                }
                catch (final Exception ex) {
                    final Object[] a5 = b1.a;
                    a5[1] = (a5[0] = null);
                }
                finally {
                    final Object[] a6 = b1.a;
                    a6[1] = (a6[0] = null);
                }
            }
        }
        if (o3 != null) {
            final Context context2 = ((View)o3).getContext();
            if (context2 instanceof ContextWrapper) {
                final WeakHashMap a7 = p5x.a;
                if (p5x$c.a((View)o3)) {
                    final TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(set, al0.c);
                    final String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        ((View)o3).setOnClickListener((View$OnClickListener)new al0$a((View)o3, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build$VERSION.SDK_INT <= 28) {
                final TypedArray obtainStyledAttributes3 = ((Context)o2).obtainStyledAttributes(set, al0.d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    p5x.A((View)o3, obtainStyledAttributes3.getBoolean(0, false));
                }
                obtainStyledAttributes3.recycle();
                final TypedArray obtainStyledAttributes4 = ((Context)o2).obtainStyledAttributes(set, al0.e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    p5x.B((View)o3, (CharSequence)obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                final TypedArray obtainStyledAttributes5 = ((Context)o2).obtainStyledAttributes(set, al0.f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    final boolean boolean1 = obtainStyledAttributes5.getBoolean(0, false);
                    final WeakHashMap a8 = p5x.a;
                    new l5x().e((View)o3, (Object)boolean1);
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return (View)o3;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
    
    public final void p() {
        this.d();
    }
    
    public final void q() {
        this.P();
        final a k0 = this.K0;
        if (k0 != null) {
            k0.t(false);
        }
    }
    
    public final boolean s(final int n) {
        int n2;
        if (n == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            n2 = 108;
        }
        else if ((n2 = n) == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            n2 = 109;
        }
        if (this.g1 && n2 == 108) {
            return false;
        }
        if (this.c1 && n2 == 1) {
            this.c1 = false;
        }
        if (n2 == 1) {
            this.V();
            return this.g1 = true;
        }
        if (n2 == 2) {
            this.V();
            return this.a1 = true;
        }
        if (n2 == 5) {
            this.V();
            return this.b1 = true;
        }
        if (n2 == 10) {
            this.V();
            return this.e1 = true;
        }
        if (n2 == 108) {
            this.V();
            return this.c1 = true;
        }
        if (n2 != 109) {
            return this.H0.requestFeature(n2);
        }
        this.V();
        return this.d1 = true;
    }
    
    public final void t(final int n) {
        this.J();
        final ViewGroup viewGroup = (ViewGroup)((View)this.X0).findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.G0).inflate(n, viewGroup);
        this.I0.a(this.H0.getCallback());
    }
    
    public final void u(final View view) {
        this.J();
        final ViewGroup viewGroup = (ViewGroup)((View)this.X0).findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.I0.a(this.H0.getCallback());
    }
    
    public final void v(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.J();
        final ViewGroup viewGroup = (ViewGroup)((View)this.X0).findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, viewGroup$LayoutParams);
        this.I0.a(this.H0.getCallback());
    }
    
    public final void w(final Toolbar toolbar) {
        if (!(this.F0 instanceof Activity)) {
            return;
        }
        this.P();
        final a k0 = this.K0;
        if (!(k0 instanceof i)) {
            this.L0 = null;
            if (k0 != null) {
                k0.h();
            }
            this.K0 = null;
            if (toolbar != null) {
                final Object f0 = this.F0;
                CharSequence charSequence;
                if (f0 instanceof Activity) {
                    charSequence = ((Activity)f0).getTitle();
                }
                else {
                    charSequence = this.M0;
                }
                final androidx.appcompat.app.h k2 = new androidx.appcompat.app.h(toolbar, charSequence, (Window$Callback)this.I0);
                this.K0 = k2;
                this.I0.D0 = (AppCompatDelegateImpl$b)k2.c;
            }
            else {
                this.I0.D0 = null;
            }
            this.k();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }
    
    public final void x(final int q1) {
        this.q1 = q1;
    }
    
    public final void y(final CharSequence text) {
        this.M0 = text;
        final sc8 n0 = this.N0;
        if (n0 != null) {
            n0.setWindowTitle(text);
        }
        else {
            final a k0 = this.K0;
            if (k0 != null) {
                k0.u(text);
            }
            else {
                final TextView y0 = this.Y0;
                if (y0 != null) {
                    y0.setText(text);
                }
            }
        }
    }
    
    public final zk z(final zk$a zk$a) {
        Label_0682: {
            if (zk$a == null) {
                break Label_0682;
            }
            final zk q0 = this.Q0;
            if (q0 != null) {
                q0.c();
            }
            final d d = new d(zk$a);
            this.P();
            final a k0 = this.K0;
            if (k0 != null && (this.Q0 = k0.v((zk$a)d)) != null) {
                final xj0 j0 = this.J0;
                if (j0 != null) {
                    j0.s();
                }
            }
            Label_0677: {
                if (this.Q0 != null) {
                    break Label_0677;
                }
                this.I();
                final zk q2 = this.Q0;
                if (q2 != null) {
                    q2.c();
                }
                final xj0 j2 = this.J0;
                while (true) {
                    if (j2 == null || this.n1) {
                        break Label_0116;
                    }
                    try {
                        j2.d();
                        final ActionBarContextView r0 = this.R0;
                        boolean b = true;
                        if (r0 == null) {
                            if (this.f1) {
                                final TypedValue typedValue = new TypedValue();
                                final Resources$Theme theme = this.G0.getTheme();
                                theme.resolveAttribute(2130968611, typedValue, true);
                                Object g0;
                                if (typedValue.resourceId != 0) {
                                    final Resources$Theme theme2 = this.G0.getResources().newTheme();
                                    theme2.setTo(theme);
                                    theme2.applyStyle(typedValue.resourceId, true);
                                    g0 = new no6(this.G0, 0);
                                    ((no6)g0).getTheme().setTo(theme2);
                                }
                                else {
                                    g0 = this.G0;
                                }
                                this.R0 = new ActionBarContextView((Context)g0, null);
                                nrk.b(this.S0 = new PopupWindow((Context)g0, (AttributeSet)null, 2130968631), 2);
                                this.S0.setContentView((View)this.R0);
                                this.S0.setWidth(-1);
                                ((Context)g0).getTheme().resolveAttribute(2130968605, typedValue, true);
                                this.R0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, ((Context)g0).getResources().getDisplayMetrics()));
                                this.S0.setHeight(-2);
                                this.T0 = new dk0(this);
                            }
                            else {
                                final ViewStubCompat viewStubCompat = (ViewStubCompat)((View)this.X0).findViewById(2131427479);
                                if (viewStubCompat != null) {
                                    this.P();
                                    final a k2 = this.K0;
                                    Context e;
                                    if (k2 != null) {
                                        e = k2.e();
                                    }
                                    else {
                                        e = null;
                                    }
                                    Context g2 = e;
                                    if (e == null) {
                                        g2 = this.G0;
                                    }
                                    viewStubCompat.setLayoutInflater(LayoutInflater.from(g2));
                                    this.R0 = (ActionBarContextView)viewStubCompat.a();
                                }
                            }
                        }
                        if (this.R0 != null) {
                            this.I();
                            this.R0.h();
                            final g5r q3 = new g5r(((View)this.R0).getContext(), this.R0, (zk$a)d);
                            if (d.c((zk)q3, (Menu)q3.J0)) {
                                q3.i();
                                this.R0.f((zk)q3);
                                this.Q0 = (zk)q3;
                                Label_0521: {
                                    if (this.W0) {
                                        final ViewGroup x0 = this.X0;
                                        if (x0 != null) {
                                            final WeakHashMap a = p5x.a;
                                            if (p5x$g.c((View)x0)) {
                                                break Label_0521;
                                            }
                                        }
                                    }
                                    b = false;
                                }
                                if (b) {
                                    ((View)this.R0).setAlpha(0.0f);
                                    final bax c = p5x.c((View)this.R0);
                                    c.a(1.0f);
                                    (this.U0 = c).g((dax)new ek0(this));
                                }
                                else {
                                    ((View)this.R0).setAlpha(1.0f);
                                    this.R0.setVisibility(0);
                                    if (((View)this.R0).getParent() instanceof View) {
                                        final View view = (View)((View)this.R0).getParent();
                                        final WeakHashMap a2 = p5x.a;
                                        p5x$h.c(view);
                                    }
                                }
                                if (this.S0 != null) {
                                    this.H0.getDecorView().post((Runnable)this.T0);
                                }
                            }
                            else {
                                this.Q0 = null;
                            }
                        }
                        if (this.Q0 != null) {
                            final xj0 j3 = this.J0;
                            if (j3 != null) {
                                j3.s();
                            }
                        }
                        this.Q0 = this.Q0;
                        return this.Q0;
                        throw new IllegalArgumentException("ActionMode callback can not be null.");
                    }
                    catch (final AbstractMethodError abstractMethodError) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public final class d implements zk$a
    {
        public zk$a C0;
        
        public d(final zk$a c0) {
            this.C0 = c0;
        }
        
        public final boolean a(final zk zk, final MenuItem menuItem) {
            return this.C0.a(zk, menuItem);
        }
        
        public final void b(final zk zk) {
            this.C0.b(zk);
            final AppCompatDelegateImpl d0 = AppCompatDelegateImpl.this;
            if (d0.S0 != null) {
                d0.H0.getDecorView().removeCallbacks((Runnable)AppCompatDelegateImpl.this.T0);
            }
            final AppCompatDelegateImpl d2 = AppCompatDelegateImpl.this;
            if (d2.R0 != null) {
                d2.I();
                final AppCompatDelegateImpl d3 = AppCompatDelegateImpl.this;
                final bax c = p5x.c((View)d3.R0);
                c.a(0.0f);
                d3.U0 = c;
                AppCompatDelegateImpl.this.U0.g((dax)new AppCompatDelegateImpl$d$a(this));
            }
            final xj0 j0 = AppCompatDelegateImpl.this.J0;
            if (j0 != null) {
                j0.f();
            }
            final AppCompatDelegateImpl d4 = AppCompatDelegateImpl.this;
            d4.Q0 = null;
            final ViewGroup x0 = d4.X0;
            final WeakHashMap a = p5x.a;
            p5x$h.c((View)x0);
        }
        
        public final boolean c(final zk zk, final Menu menu) {
            return this.C0.c(zk, menu);
        }
        
        public final boolean d(final zk zk, final Menu menu) {
            final ViewGroup x0 = AppCompatDelegateImpl.this.X0;
            final WeakHashMap a = p5x.a;
            p5x$h.c((View)x0);
            return this.C0.d(zk, menu);
        }
    }
    
    public final class g extends mox
    {
        public AppCompatDelegateImpl$b D0;
        public boolean E0;
        public boolean F0;
        public boolean G0;
        
        public g(final Window$Callback window$Callback) {
            super(window$Callback);
        }
        
        public final void a(final Window$Callback window$Callback) {
            try {
                this.E0 = true;
                window$Callback.onContentChanged();
            }
            finally {
                this.E0 = false;
            }
        }
        
        public final ActionMode b(final ActionMode$Callback actionMode$Callback) {
            final oyr.a a = new oyr.a(AppCompatDelegateImpl.this.G0, actionMode$Callback);
            final zk z = AppCompatDelegateImpl.this.z((zk$a)a);
            if (z != null) {
                return a.e(z);
            }
            return null;
        }
        
        @Override
        public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
            if (this.F0) {
                return super.C0.dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }
        
        @Override
        public final boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
            final boolean dispatchKeyShortcutEvent = super.dispatchKeyShortcutEvent(keyEvent);
            boolean b = false;
            if (!dispatchKeyShortcutEvent) {
                final AppCompatDelegateImpl h0 = AppCompatDelegateImpl.this;
                final int keyCode = keyEvent.getKeyCode();
                h0.P();
                final androidx.appcompat.app.a k0 = h0.K0;
                boolean b2 = false;
                Label_0157: {
                    Label_0148: {
                        if (k0 == null || !k0.i(keyCode, keyEvent)) {
                            final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState j1 = h0.j1;
                            if (j1 == null || !h0.T(j1, keyEvent.getKeyCode(), keyEvent)) {
                                if (h0.j1 == null) {
                                    final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n = h0.N(0);
                                    h0.U(n, keyEvent);
                                    final boolean t = h0.T(n, keyEvent.getKeyCode(), keyEvent);
                                    n.k = false;
                                    if (t) {
                                        break Label_0148;
                                    }
                                }
                                b2 = false;
                                break Label_0157;
                            }
                            final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState j2 = h0.j1;
                            if (j2 != null) {
                                j2.l = true;
                            }
                        }
                    }
                    b2 = true;
                }
                if (!b2) {
                    return b;
                }
            }
            b = true;
            return b;
        }
        
        public final void onContentChanged() {
            if (this.E0) {
                super.C0.onContentChanged();
            }
        }
        
        @Override
        public final boolean onCreatePanelMenu(final int n, final Menu menu) {
            return (n != 0 || menu instanceof e) && super.onCreatePanelMenu(n, menu);
        }
        
        @Override
        public final View onCreatePanelView(final int n) {
            final AppCompatDelegateImpl$b d0 = this.D0;
            if (d0 != null) {
                final androidx.appcompat.app.h.e e = (androidx.appcompat.app.h.e)d0;
                View view;
                if (n == 0) {
                    view = new View(e.a.a.getContext());
                }
                else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(n);
        }
        
        @Override
        public final boolean onMenuOpened(final int n, final Menu menu) {
            super.onMenuOpened(n, menu);
            final AppCompatDelegateImpl h0 = AppCompatDelegateImpl.this;
            Objects.requireNonNull(h0);
            if (n == 108) {
                h0.P();
                final androidx.appcompat.app.a k0 = h0.K0;
                if (k0 != null) {
                    k0.c(true);
                }
            }
            return true;
        }
        
        @Override
        public final void onPanelClosed(final int n, final Menu menu) {
            if (this.G0) {
                super.C0.onPanelClosed(n, menu);
                return;
            }
            super.onPanelClosed(n, menu);
            final AppCompatDelegateImpl h0 = AppCompatDelegateImpl.this;
            Objects.requireNonNull(h0);
            if (n == 108) {
                h0.P();
                final androidx.appcompat.app.a k0 = h0.K0;
                if (k0 != null) {
                    k0.c(false);
                }
            }
            else if (n == 0) {
                final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState n2 = h0.N(n);
                if (n2.m) {
                    h0.E(n2, false);
                }
            }
        }
        
        @Override
        public final boolean onPreparePanel(final int n, final View view, final Menu menu) {
            e e;
            if (menu instanceof e) {
                e = (e)menu;
            }
            else {
                e = null;
            }
            if (n == 0 && e == null) {
                return false;
            }
            if (e != null) {
                e.x = true;
            }
            final AppCompatDelegateImpl$b d0 = this.D0;
            if (d0 != null) {
                final androidx.appcompat.app.h.e e2 = (androidx.appcompat.app.h.e)d0;
                if (n == 0) {
                    final androidx.appcompat.app.h a = e2.a;
                    if (!a.d) {
                        a.a.m = true;
                        a.d = true;
                    }
                }
            }
            final boolean onPreparePanel = super.onPreparePanel(n, view, menu);
            if (e != null) {
                e.x = false;
            }
            return onPreparePanel;
        }
        
        @Override
        public final void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
            final e h = AppCompatDelegateImpl.this.N(0).h;
            if (h != null) {
                super.onProvideKeyboardShortcuts(list, (Menu)h, n);
            }
            else {
                super.onProvideKeyboardShortcuts(list, menu, n);
            }
        }
        
        @Override
        public final ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
            if (Build$VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.V0) {
                return this.b(actionMode$Callback);
            }
            return super.onWindowStartingActionMode(actionMode$Callback);
        }
        
        @Override
        public final ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
            if (AppCompatDelegateImpl.this.V0 && n == 0) {
                return this.b(actionMode$Callback);
            }
            return super.onWindowStartingActionMode(actionMode$Callback, n);
        }
    }
    
    public final class h extends AppCompatDelegateImpl$i
    {
        public final PowerManager c;
        
        public h(final Context context) {
            super(AppCompatDelegateImpl.this);
            this.c = (PowerManager)context.getApplicationContext().getSystemService("power");
        }
        
        public final IntentFilter b() {
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
        
        public final int c() {
            int n;
            if (this.c.isPowerSaveMode()) {
                n = 2;
            }
            else {
                n = 1;
            }
            return n;
        }
        
        public final void d() {
            AppCompatDelegateImpl.this.d();
        }
    }
    
    public final class j extends AppCompatDelegateImpl$i
    {
        public final n0v c;
        
        public j(final n0v c) {
            super(AppCompatDelegateImpl.this);
            this.c = c;
        }
        
        public final IntentFilter b() {
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
        
        public final int c() {
            final n0v c = this.c;
            final n0v$a c2 = c.c;
            final long b = c2.b;
            final long currentTimeMillis = System.currentTimeMillis();
            final int n = 0;
            boolean a = false;
            final int n2 = 1;
            int n3 = 0;
            Label_0425: {
                if (b > currentTimeMillis) {
                    n3 = (c2.a ? 1 : 0);
                }
                else {
                    final int e = r9x.e(c.a, "android.permission.ACCESS_COARSE_LOCATION");
                    Location a2 = null;
                    Location a3;
                    if (e == 0) {
                        a3 = c.a("network");
                    }
                    else {
                        a3 = null;
                    }
                    if (r9x.e(c.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        a2 = c.a("gps");
                    }
                    Location location = null;
                    Label_0156: {
                        if (a2 != null && a3 != null) {
                            location = a3;
                            if (a2.getTime() <= a3.getTime()) {
                                break Label_0156;
                            }
                        }
                        else {
                            location = a3;
                            if (a2 == null) {
                                break Label_0156;
                            }
                        }
                        location = a2;
                    }
                    if (location != null) {
                        final n0v$a c3 = c.c;
                        final long currentTimeMillis2 = System.currentTimeMillis();
                        if (m0v.d == null) {
                            m0v.d = new m0v();
                        }
                        final m0v d = m0v.d;
                        d.a(currentTimeMillis2 - 86400000L, location.getLatitude(), location.getLongitude());
                        d.a(currentTimeMillis2, location.getLatitude(), location.getLongitude());
                        if (d.c == 1) {
                            a = true;
                        }
                        final long b2 = d.b;
                        final long a4 = d.a;
                        d.a(currentTimeMillis2 + 86400000L, location.getLatitude(), location.getLongitude());
                        final long b3 = d.b;
                        long b4;
                        if (b2 != -1L && a4 != -1L) {
                            long n4;
                            if (currentTimeMillis2 > a4) {
                                n4 = b3 + 0L;
                            }
                            else if (currentTimeMillis2 > b2) {
                                n4 = a4 + 0L;
                            }
                            else {
                                n4 = b2 + 0L;
                            }
                            b4 = n4 + 60000L;
                        }
                        else {
                            b4 = 43200000L + currentTimeMillis2;
                        }
                        c3.a = a;
                        c3.b = b4;
                        n3 = (c2.a ? 1 : 0);
                    }
                    else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        final int value = Calendar.getInstance().get(11);
                        if (value >= 6) {
                            n3 = n;
                            if (value < 22) {
                                break Label_0425;
                            }
                        }
                        n3 = 1;
                    }
                }
            }
            int n5 = n2;
            if (n3 != 0) {
                n5 = 2;
            }
            return n5;
        }
        
        public final void d() {
            AppCompatDelegateImpl.this.d();
        }
    }
    
    public final class k extends ContentFrameLayout
    {
        public k(final Context context) {
            super(context, (AttributeSet)null);
        }
        
        public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }
        
        public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                final int n = (int)motionEvent.getX();
                final int n2 = (int)motionEvent.getY();
                if (n < -5 || n2 < -5 || n > ((View)this).getWidth() + 5 || n2 > ((View)this).getHeight() + 5) {
                    final AppCompatDelegateImpl k0 = AppCompatDelegateImpl.this;
                    k0.E(k0.N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        
        public final void setBackgroundResource(final int n) {
            ((View)this).setBackgroundDrawable(qli.g(((View)this).getContext(), n));
        }
    }
    
    public final class l implements i$a
    {
        public final void a(e e, final boolean b) {
            final Object l = e.l();
            final boolean b2 = l != e;
            final AppCompatDelegateImpl c0 = AppCompatDelegateImpl.this;
            if (b2) {
                e = (e)l;
            }
            final AppCompatDelegateImpl.AppCompatDelegateImpl$PanelFeatureState i = c0.L((Menu)e);
            if (i != null) {
                if (b2) {
                    AppCompatDelegateImpl.this.C(i.a, i, (Menu)l);
                    AppCompatDelegateImpl.this.E(i, true);
                }
                else {
                    AppCompatDelegateImpl.this.E(i, b);
                }
            }
        }
        
        public final boolean b(final e e) {
            if (e == e.l()) {
                final AppCompatDelegateImpl c0 = AppCompatDelegateImpl.this;
                if (c0.c1) {
                    final Window$Callback o = c0.O();
                    if (o != null && !AppCompatDelegateImpl.this.n1) {
                        o.onMenuOpened(108, (Menu)e);
                    }
                }
            }
            return true;
        }
    }
}
