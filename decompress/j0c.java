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

public final class j0c implements anp
{
    public final ColorDrawable a;
    public final Resources b;
    public alo c;
    public final rjo d;
    public final hra e;
    public final vmb f;
    
    public j0c(final k0c k0c) {
        final ColorDrawable a = new ColorDrawable(0);
        this.a = a;
        srb.b();
        this.b = k0c.a;
        this.c = k0c.p;
        final vmb f = new vmb((Drawable)a);
        this.f = f;
        final List<Drawable> n = k0c.n;
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
        if (k0c.o != null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final int n4 = n2 + n3;
        final Drawable[] array = new Drawable[n4 + 6];
        array[0] = this.g(k0c.m, null);
        array[1] = this.g(k0c.d, k0c.e);
        final duo$b l = k0c.l;
        f.setColorFilter((ColorFilter)null);
        array[2] = otx.e((Drawable)f, l);
        array[3] = this.g(k0c.j, k0c.k);
        array[4] = this.g(k0c.f, k0c.g);
        array[5] = this.g(k0c.h, k0c.i);
        if (n4 > 0) {
            final List<Drawable> n5 = k0c.n;
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
            final StateListDrawable o = k0c.o;
            if (o != null) {
                array[n7 + 6] = this.g((Drawable)o, null);
            }
        }
        final hra e = new hra(array);
        this.e = e;
        e.N0 = k0c.b;
        if (e.M0 == 1) {
            e.M0 = 0;
        }
        ((vmb)(this.d = new rjo(otx.d((Drawable)e, this.c)))).mutate();
        this.m();
        srb.b();
    }
    
    public final void a(final float n, final boolean b) {
        if (((ts0)this.e).a(3) == null) {
            return;
        }
        this.e.d();
        this.o(n);
        if (b) {
            this.e.g();
        }
        this.e.e();
    }
    
    public final Drawable b() {
        return (Drawable)this.d;
    }
    
    public final void c() {
        this.f.o((Drawable)this.a);
        this.m();
    }
    
    public final void d(Drawable c, final float n, final boolean b) {
        c = otx.c(c, this.c, this.b);
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
    
    public final void e() {
        this.e.d();
        this.i();
        if (((ts0)this.e).a(5) != null) {
            this.h(5);
        }
        else {
            this.h(1);
        }
        this.e.e();
    }
    
    public final void f(final Drawable g0) {
        final rjo d = this.d;
        d.G0 = g0;
        ((Drawable)d).invalidateSelf();
    }
    
    public final Drawable g(final Drawable drawable, final duo$b duo$b) {
        return otx.e(otx.c(drawable, this.c, this.b), duo$b);
    }
    
    public final Rect getBounds() {
        return ((Drawable)this.d).getBounds();
    }
    
    public final void h(final int n) {
        if (n >= 0) {
            final hra e = this.e;
            e.M0 = 0;
            e.S0[n] = true;
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
            final hra e = this.e;
            e.M0 = 0;
            e.S0[n] = false;
            e.invalidateSelf();
        }
    }
    
    public final vd9 k(final int n) {
        final hra e = this.e;
        Objects.requireNonNull(e);
        final boolean b = false;
        ri4.j(Boolean.valueOf(n >= 0));
        boolean b2 = b;
        if (n < ((ts0)e).F0.length) {
            b2 = true;
        }
        ri4.j(Boolean.valueOf(b2));
        final vd9[] f0 = ((ts0)e).F0;
        if (f0[n] == null) {
            f0[n] = new ss0((ts0)e, n);
        }
        Object o;
        final vd9 vd9 = (vd9)(o = f0[n]);
        if (vd9.k() instanceof aog) {
            o = vd9.k();
        }
        Object o2 = o;
        if (((vd9)o).k() instanceof auo) {
            o2 = ((vd9)o).k();
        }
        return (vd9)o2;
    }
    
    public final auo l(final int n) {
        final vd9 k = this.k(n);
        if (k instanceof auo) {
            return (auo)k;
        }
        final Drawable e = otx.e(k.d((Drawable)otx.a), (duo$b)duo$j.a);
        k.d(e);
        ri4.s((Object)e, (Object)"Parent has no child drawable!");
        return (auo)e;
    }
    
    public final void m() {
        final hra e = this.e;
        if (e != null) {
            e.d();
            final hra e2 = this.e;
            e2.M0 = 0;
            Arrays.fill(e2.S0, true);
            e2.invalidateSelf();
            this.i();
            this.h(1);
            this.e.g();
            this.e.e();
        }
    }
    
    public final void n(final int n, Drawable c) {
        if (c == null) {
            ((ts0)this.e).b(n, (Drawable)null);
            return;
        }
        c = otx.c(c, this.c, this.b);
        this.k(n).d(c);
    }
    
    public final void o(final float n) {
        final Drawable a = ((ts0)this.e).a(3);
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
    
    public final void p(final alo c) {
        this.c = c;
        final rjo d = this.d;
        final ColorDrawable a = otx.a;
        final Drawable c2 = ((vmb)d).C0;
        if (c.a == 1) {
            if (c2 instanceof sko) {
                final sko sko = (sko)c2;
                otx.b((kko)sko, c);
                sko.Q0 = c.d;
                ((Drawable)sko).invalidateSelf();
            }
            else {
                ((vmb)d).o(otx.d(((vmb)d).o((Drawable)otx.a), c));
            }
        }
        else if (c2 instanceof sko) {
            final sko sko2 = (sko)c2;
            final ColorDrawable a2 = otx.a;
            ((vmb)d).o(((vmb)sko2).o((Drawable)a2));
            ((Drawable)a2).setCallback((Drawable$Callback)null);
        }
        for (int i = 0; i < ((ts0)this.e).E0.length; ++i) {
            vd9 k = this.k(i);
            final alo c3 = this.c;
            final Resources b = this.b;
            while (true) {
                final Drawable j = k.k();
                if (j == k || !(j instanceof vd9)) {
                    break;
                }
                k = (vd9)j;
            }
            final Drawable l = k.k();
            if (c3 != null && c3.a == 2) {
                if (l instanceof kko) {
                    otx.b((kko)l, c3);
                }
                else if (l != null) {
                    k.d((Drawable)otx.a);
                    k.d(otx.a(l, c3, b));
                }
            }
            else if (l instanceof kko) {
                final kko kko = (kko)l;
                kko.b(false);
                kko.g();
                kko.a(0, 0.0f);
                kko.e(0.0f);
                kko.h(false);
                kko.j();
            }
        }
    }
}
