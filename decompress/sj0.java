import android.content.Context;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import java.util.WeakHashMap;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sj0
{
    public final View a;
    public final fk0 b;
    public int c;
    public ebt d;
    public ebt e;
    public ebt f;
    
    public sj0(final View a) {
        this.c = -1;
        this.a = a;
        this.b = fk0.a();
    }
    
    public final void a() {
        final Drawable background = this.a.getBackground();
        if (background != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final int n = 1;
            if ((sdk_INT <= 21) ? (sdk_INT == 21) : (this.d != null)) {
                if (this.f == null) {
                    this.f = new ebt();
                }
                final ebt f = this.f;
                f.a = null;
                f.d = false;
                f.b = null;
                f.c = false;
                final View a = this.a;
                final WeakHashMap a2 = b7x.a;
                final ColorStateList g = b7x$i.g(a);
                if (g != null) {
                    f.d = true;
                    f.a = g;
                }
                final PorterDuff$Mode h = b7x$i.h(this.a);
                if (h != null) {
                    f.c = true;
                    f.b = h;
                }
                int n2;
                if (!f.d && !f.c) {
                    n2 = 0;
                }
                else {
                    fk0.f(background, f, this.a.getDrawableState());
                    n2 = n;
                }
                if (n2 != 0) {
                    return;
                }
            }
            final ebt e = this.e;
            if (e != null) {
                fk0.f(background, e, this.a.getDrawableState());
            }
            else {
                final ebt d = this.d;
                if (d != null) {
                    fk0.f(background, d, this.a.getDrawableState());
                }
            }
        }
    }
    
    public final ColorStateList b() {
        final ebt e = this.e;
        ColorStateList a;
        if (e != null) {
            a = e.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final PorterDuff$Mode c() {
        final ebt e = this.e;
        PorterDuff$Mode b;
        if (e != null) {
            b = e.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final void d(final AttributeSet set, int n) {
        final Context context = this.a.getContext();
        final int[] h1 = fr0.h1;
        final gbt q = gbt.q(context, set, h1, n);
        final View a = this.a;
        b7x.y(a, a.getContext(), h1, set, q.b, n);
        n = 0;
        try {
            if (q.o(0)) {
                this.c = q.l(0, -1);
                final ColorStateList d = this.b.d(this.a.getContext(), this.c);
                if (d != null) {
                    this.g(d);
                }
            }
            if (q.o(1)) {
                b7x.C(this.a, q.c(1));
            }
            if (q.o(2)) {
                final View a2 = this.a;
                final PorterDuff$Mode d2 = je9.d(q.j(2, -1), null);
                final int sdk_INT = Build$VERSION.SDK_INT;
                b7x$i.r(a2, d2);
                if (sdk_INT == 21) {
                    final Drawable background = a2.getBackground();
                    if (b7x$i.g(a2) != null || b7x$i.h(a2) != null) {
                        n = 1;
                    }
                    if (background != null && n != 0) {
                        if (background.isStateful()) {
                            background.setState(a2.getDrawableState());
                        }
                        b7x$d.q(a2, background);
                    }
                }
            }
        }
        finally {
            q.r();
        }
    }
    
    public final void e() {
        this.c = -1;
        this.g(null);
        this.a();
    }
    
    public final void f(final int c) {
        this.c = c;
        final fk0 b = this.b;
        ColorStateList d;
        if (b != null) {
            d = b.d(this.a.getContext(), c);
        }
        else {
            d = null;
        }
        this.g(d);
        this.a();
    }
    
    public final void g(final ColorStateList a) {
        if (a != null) {
            if (this.d == null) {
                this.d = new ebt();
            }
            final ebt d = this.d;
            d.a = a;
            d.d = true;
        }
        else {
            this.d = null;
        }
        this.a();
    }
    
    public final void h(final ColorStateList a) {
        if (this.e == null) {
            this.e = new ebt();
        }
        final ebt e = this.e;
        e.a = a;
        e.d = true;
        this.a();
    }
    
    public final void i(final PorterDuff$Mode b) {
        if (this.e == null) {
            this.e = new ebt();
        }
        final ebt e = this.e;
        e.b = b;
        e.c = true;
        this.a();
    }
}
