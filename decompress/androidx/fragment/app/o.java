// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.View;
import android.content.Context;
import java.util.Iterator;
import java.util.Objects;
import android.os.Bundle;
import java.util.concurrent.CopyOnWriteArrayList;

public final class o
{
    public final CopyOnWriteArrayList<a> a;
    public final p b;
    
    public o(final p b) {
        this.a = new CopyOnWriteArrayList<a>();
        this.b = b;
    }
    
    public final void a(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.a(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                Objects.requireNonNull(a.a);
            }
        }
    }
    
    public final void b(final Fragment fragment, final boolean b) {
        final p b2 = this.b;
        final Context e0 = b2.u.E0;
        final Fragment w = b2.w;
        if (w != null) {
            w.R0().m.b(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                Objects.requireNonNull(a.a);
            }
        }
    }
    
    public final void c(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.c(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.a(this.b, fragment, bundle);
            }
        }
    }
    
    public final void d(final Fragment fragment, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.d(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.b(this.b, fragment);
            }
        }
    }
    
    public final void e(final Fragment fragment, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.e(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                Objects.requireNonNull(a.a);
            }
        }
    }
    
    public final void f(final Fragment fragment, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.f(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.c(this.b, fragment);
            }
        }
    }
    
    public final void g(final Fragment fragment, final boolean b) {
        final p b2 = this.b;
        final Context e0 = b2.u.E0;
        final Fragment w = b2.w;
        if (w != null) {
            w.R0().m.g(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                Objects.requireNonNull(a.a);
            }
        }
    }
    
    public final void h(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.h(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.d(this.b, fragment);
            }
        }
    }
    
    public final void i(final Fragment fragment, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.i(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.e(this.b, fragment);
            }
        }
    }
    
    public final void j(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.j(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.f(this.b, fragment, bundle);
            }
        }
    }
    
    public final void k(final Fragment fragment, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.k(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.g(this.b, fragment);
            }
        }
    }
    
    public final void l(final Fragment fragment, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.l(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.h(this.b, fragment);
            }
        }
    }
    
    public final void m(final Fragment fragment, final View view, final Bundle bundle, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.m(fragment, view, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.i(this.b, fragment, view, bundle);
            }
        }
    }
    
    public final void n(final Fragment fragment, final boolean b) {
        final Fragment w = this.b.w;
        if (w != null) {
            w.R0().m.n(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.j(this.b, fragment);
            }
        }
    }
    
    public static final class a
    {
        public final p.k a;
        public final boolean b;
        
        public a(final p.k a, final boolean b) {
            this.a = a;
            this.b = b;
        }
    }
}
