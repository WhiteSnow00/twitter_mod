import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Animatable;
import java.util.Arrays;
import java.util.Objects;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import java.util.Iterator;
import java.util.List;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l0c implements nop
{
    public final ColorDrawable a;
    public final Resources b;
    public imo c;
    public final zko d;
    public final mra e;
    public final umb f;
    
    public l0c(final m0c m0c) {
        final ColorDrawable a = new ColorDrawable(0);
        this.a = a;
        rrb.b();
        this.b = m0c.a;
        this.c = m0c.p;
        final umb f = new umb((Drawable)a);
        this.f = f;
        final List<Drawable> n = m0c.n;
        int size;
        if (n != null) {
            size = n.size();
        }
        else {
            size = 1;
        }
        int n2 = size;
        if (size == 0) {
            n2 = 1;
        }
        int n3;
        if (m0c.o != null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final int n4 = n2 + n3;
        final Drawable[] array = new Drawable[n4 + 6];
        array[0] = this.g(m0c.m, null);
        array[1] = this.g(m0c.d, m0c.e);
        final ovo$b l = m0c.l;
        f.setColorFilter(null);
        array[2] = xux.e((Drawable)f, l);
        array[3] = this.g(m0c.j, m0c.k);
        array[4] = this.g(m0c.f, m0c.g);
        array[5] = this.g(m0c.h, m0c.i);
        if (n4 > 0) {
            final List<Drawable> n5 = m0c.n;
            int n7;
            if (n5 != null) {
                final Iterator<Drawable> iterator = n5.iterator();
                int n6 = 0;
                while (true) {
                    n7 = n6;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    array[n6 + 6] = this.g(iterator.next(), null);
                    ++n6;
                }
            }
            else {
                n7 = 1;
            }
            final StateListDrawable o = m0c.o;
            if (o != null) {
                array[n7 + 6] = this.g((Drawable)o, null);
            }
        }
        final mra e = new mra(array);
        this.e = e;
        e.Q0 = m0c.b;
        if (e.P0 == 1) {
            e.P0 = 0;
        }
        (this.d = new zko(xux.d((Drawable)e, this.c))).mutate();
        this.m();
        rrb.b();
    }
    
    @Override
    public final void a(final float n, final boolean b) {
        if (this.e.a(3) == null) {
            return;
        }
        this.e.d();
        this.o(n);
        if (b) {
            this.e.g();
        }
        this.e.e();
    }
    
    @Override
    public final void b() {
        this.f.o((Drawable)this.a);
        this.m();
    }
    
    @Override
    public final Drawable c() {
        return this.d;
    }
    
    @Override
    public final void d(Drawable c, final float n, final boolean b) {
        c = xux.c(c, this.c, this.b);
        c.mutate();
        this.f.o(c);
        this.e.d();
        this.i();
        this.h(2);
        this.o(n);
        if (b) {
            this.e.g();
        }
        this.e.e();
    }
    
    @Override
    public final void e() {
        this.e.d();
        this.i();
        if (this.e.a(5) != null) {
            this.h(5);
        }
        else {
            this.h(1);
        }
        this.e.e();
    }
    
    @Override
    public final void f(final Drawable j0) {
        final zko d = this.d;
        d.J0 = j0;
        d.invalidateSelf();
    }
    
    public final Drawable g(final Drawable drawable, final ovo$b ovo$b) {
        return xux.e(xux.c(drawable, this.c, this.b), ovo$b);
    }
    
    @Override
    public final Rect getBounds() {
        return this.d.getBounds();
    }
    
    public final void h(final int n) {
        if (n >= 0) {
            final mra e = this.e;
            e.P0 = 0;
            e.V0[n] = true;
            e.invalidateSelf();
        }
    }
    
    public final void i() {
        this.j(1);
        this.j(2);
        this.j(3);
        this.j(4);
        this.j(5);
    }
    
    public final void j(final int n) {
        if (n >= 0) {
            final mra e = this.e;
            e.P0 = 0;
            e.V0[n] = false;
            e.invalidateSelf();
        }
    }
    
    public final ge9 k(final int n) {
        final mra e = this.e;
        Objects.requireNonNull(e);
        final boolean b = false;
        xd.D(n >= 0);
        boolean b2 = b;
        if (n < e.I0.length) {
            b2 = true;
        }
        xd.D(b2);
        final ge9[] i0 = e.I0;
        if (i0[n] == null) {
            i0[n] = (ge9)new os0((ps0)e, n);
        }
        Object o;
        final ge9 ge9 = (ge9)(o = i0[n]);
        if (ge9.k() instanceof tog) {
            o = ge9.k();
        }
        Object o2 = o;
        if (((ge9)o).k() instanceof lvo) {
            o2 = ((ge9)o).k();
        }
        return (ge9)o2;
    }
    
    public final lvo l(final int n) {
        final ge9 k = this.k(n);
        if (k instanceof lvo) {
            return (lvo)k;
        }
        final Drawable e = xux.e(k.d((Drawable)xux.a), (ovo$b)ovo.j.a);
        k.d(e);
        xd.K(e, "Parent has no child drawable!");
        return (lvo)e;
    }
    
    public final void m() {
        final mra e = this.e;
        if (e != null) {
            e.d();
            final mra e2 = this.e;
            e2.P0 = 0;
            Arrays.fill(e2.V0, true);
            e2.invalidateSelf();
            this.i();
            this.h(1);
            this.e.g();
            this.e.e();
        }
    }
    
    public final void n(final int n, Drawable c) {
        if (c == null) {
            this.e.b(n, null);
            return;
        }
        c = xux.c(c, this.c, this.b);
        this.k(n).d(c);
    }
    
    public final void o(final float n) {
        final Drawable a = this.e.a(3);
        if (a == null) {
            return;
        }
        if (n >= 0.999f) {
            if (a instanceof Animatable) {
                ((Animatable)a).stop();
            }
            this.j(3);
        }
        else {
            if (a instanceof Animatable) {
                ((Animatable)a).start();
            }
            this.h(3);
        }
        a.setLevel(Math.round(n * 10000.0f));
    }
    
    public final void p(final imo c) {
        this.c = c;
        final zko d = this.d;
        final ColorDrawable a = xux.a;
        final Drawable f0 = d.F0;
        if (c.a == 1) {
            if (f0 instanceof amo) {
                final amo amo = (amo)f0;
                xux.b((slo)amo, c);
                amo.T0 = c.d;
                ((Drawable)amo).invalidateSelf();
            }
            else {
                d.o(xux.d(d.o((Drawable)xux.a), c));
            }
        }
        else if (f0 instanceof amo) {
            final amo amo2 = (amo)f0;
            final ColorDrawable a2 = xux.a;
            d.o(((umb)amo2).o((Drawable)a2));
            ((Drawable)a2).setCallback((Drawable$Callback)null);
        }
        for (int i = 0; i < this.e.H0.length; ++i) {
            ge9 k = this.k(i);
            final imo c2 = this.c;
            final Resources b = this.b;
            while (true) {
                final Drawable j = k.k();
                if (j == k || !(j instanceof ge9)) {
                    break;
                }
                k = (ge9)j;
            }
            final Drawable l = k.k();
            if (c2 != null && c2.a == 2) {
                if (l instanceof slo) {
                    xux.b((slo)l, c2);
                }
                else if (l != null) {
                    k.d((Drawable)xux.a);
                    k.d(xux.a(l, c2, b));
                }
            }
            else if (l instanceof slo) {
                final slo slo = (slo)l;
                slo.b(false);
                slo.g();
                slo.a(0, 0.0f);
                slo.e(0.0f);
                slo.h(false);
                slo.j();
            }
        }
    }
}
