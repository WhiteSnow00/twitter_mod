// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import androidx.appcompat.view.menu.e$a;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i$a;
import androidx.appcompat.widget.ActionMenuView;
import android.annotation.SuppressLint;
import android.view.ViewGroup$LayoutParams;
import android.view.Menu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.WeakHashMap;
import android.view.View;
import android.content.Context;
import androidx.appcompat.view.menu.g;
import java.util.Objects;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar$f;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import android.view.Window$Callback;
import androidx.appcompat.widget.c;

public final class h extends a
{
    public final androidx.appcompat.widget.c a;
    public final Window$Callback b;
    public final e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ArrayList<a$b> g;
    public final h$a h;
    public final h$b i;
    
    public h(final Toolbar toolbar, final CharSequence windowTitle, final Window$Callback window$Callback) {
        this.g = new ArrayList<a$b>();
        this.h = new h$a(this);
        final Toolbar$f toolbar$f = (Toolbar$f)new Toolbar$f() {
            public final boolean onMenuItemClick(final MenuItem menuItem) {
                return androidx.appcompat.app.h.this.b.onMenuItemSelected(0, menuItem);
            }
        };
        this.i = toolbar$f;
        Objects.requireNonNull(toolbar);
        final androidx.appcompat.widget.c a = new androidx.appcompat.widget.c(toolbar, false);
        this.a = a;
        Objects.requireNonNull(window$Callback);
        this.b = window$Callback;
        a.l = window$Callback;
        toolbar.setOnMenuItemClickListener((Toolbar.Toolbar$f)toolbar$f);
        a.setWindowTitle(windowTitle);
        this.c = new e();
    }
    
    public final boolean a() {
        return this.a.a.o();
    }
    
    public final boolean b() {
        final Toolbar.d o1 = this.a.a.o1;
        if (o1 != null && o1.D0 != null) {
            g d0;
            if (o1 == null) {
                d0 = null;
            }
            else {
                d0 = o1.D0;
            }
            if (d0 != null) {
                d0.collapseActionView();
            }
            return true;
        }
        return false;
    }
    
    public final void c(final boolean f) {
        if (f == this.f) {
            return;
        }
        this.f = f;
        for (int size = this.g.size(), i = 0; i < size; ++i) {
            this.g.get(i).a();
        }
    }
    
    public final int d() {
        return this.a.b;
    }
    
    public final Context e() {
        return this.a.getContext();
    }
    
    public final boolean f() {
        ((View)this.a.a).removeCallbacks((Runnable)this.h);
        final Toolbar a = this.a.a;
        final h$a h = this.h;
        final WeakHashMap a2 = p5x.a;
        p5x$d.m((View)a, (Runnable)h);
        return true;
    }
    
    public final void g() {
    }
    
    public final void h() {
        ((View)this.a.a).removeCallbacks((Runnable)this.h);
    }
    
    public final boolean i(final int n, final KeyEvent keyEvent) {
        final Menu w = this.w();
        if (w != null) {
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
            w.setQwertyMode(qwertyMode);
            return w.performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    public final boolean j(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.a.a.y();
        }
        return true;
    }
    
    public final boolean k() {
        return this.a.a.y();
    }
    
    public final void l(final View view) {
        final a$a layoutParams = new a$a(-2, -2);
        if (view != null) {
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        this.a.E(view);
    }
    
    public final void m(final View view, final a$a layoutParams) {
        if (view != null) {
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        this.a.E(view);
    }
    
    public final void n(final boolean b) {
    }
    
    public final void o(final boolean b) {
        this.x(4, 4);
    }
    
    @SuppressLint({ "WrongConstant" })
    public final void p(final int n) {
        this.x(n, -1);
    }
    
    public final void q(final boolean b) {
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.x(n, 16);
    }
    
    public final void r() {
        this.x(2, 2);
    }
    
    public final void s(final boolean b) {
        int n;
        if (b) {
            n = 8;
        }
        else {
            n = 0;
        }
        this.x(n, 8);
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final CharSequence windowTitle) {
        this.a.setWindowTitle(windowTitle);
    }
    
    public final Menu w() {
        if (!this.e) {
            final androidx.appcompat.widget.c a = this.a;
            final c c = new c();
            final d d = new d();
            final Toolbar a2 = a.a;
            a2.p1 = (i$a)c;
            a2.q1 = (e$a)d;
            final ActionMenuView c2 = a2.C0;
            if (c2 != null) {
                c2.W0 = (i$a)c;
                c2.X0 = (e$a)d;
            }
            this.e = true;
        }
        return this.a.a.getMenu();
    }
    
    public final void x(final int n, final int n2) {
        final androidx.appcompat.widget.c a = this.a;
        a.C((n & n2) | (~n2 & a.b));
    }
    
    public final class c implements i$a
    {
        public boolean C0;
        
        public final void a(final androidx.appcompat.view.menu.e e, final boolean b) {
            if (this.C0) {
                return;
            }
            this.C0 = true;
            final ActionMenuView c0 = androidx.appcompat.app.h.this.a.a.C0;
            if (c0 != null) {
                final ActionMenuPresenter v0 = c0.V0;
                if (v0 != null) {
                    v0.i();
                }
            }
            androidx.appcompat.app.h.this.b.onPanelClosed(108, (Menu)e);
            this.C0 = false;
        }
        
        public final boolean b(final androidx.appcompat.view.menu.e e) {
            androidx.appcompat.app.h.this.b.onMenuOpened(108, (Menu)e);
            return true;
        }
    }
    
    public final class d implements e$a
    {
        public final boolean a(final androidx.appcompat.view.menu.e e, final MenuItem menuItem) {
            return false;
        }
        
        public final void b(final androidx.appcompat.view.menu.e e) {
            if (androidx.appcompat.app.h.this.a.a.s()) {
                androidx.appcompat.app.h.this.b.onPanelClosed(108, (Menu)e);
            }
            else if (androidx.appcompat.app.h.this.b.onPreparePanel(0, (View)null, (Menu)e)) {
                androidx.appcompat.app.h.this.b.onMenuOpened(108, (Menu)e);
            }
        }
    }
    
    public final class e implements AppCompatDelegateImpl$b
    {
    }
}
