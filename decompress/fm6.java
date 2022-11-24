import android.graphics.Paint;
import android.graphics.Canvas;
import java.util.Collection;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Path;
import android.graphics.Matrix;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fm6 implements lj9, e0k, wm1$a, yqe
{
    public lte a;
    public RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final List<wl6> h;
    public final ceg i;
    public List<e0k> j;
    public nzt k;
    
    public fm6(final ceg ceg, final ym1 ym1, final isp isp) {
        final String a = isp.a;
        final boolean c = isp.c;
        final List b = isp.b;
        final ArrayList list = new ArrayList<wl6>(b.size());
        final int n = 0;
        for (int i = 0; i < b.size(); ++i) {
            final wl6 a2 = b.get(i).a(ceg, ym1);
            if (a2 != null) {
                list.add(a2);
            }
        }
        final List b2 = isp.b;
        while (true) {
            for (int j = n; j < b2.size(); ++j) {
                final zm6 zm6 = b2.get(j);
                if (zm6 instanceof s80) {
                    final s80 s80 = (s80)zm6;
                    this(ceg, ym1, a, c, (List<wl6>)list, s80);
                    return;
                }
            }
            final s80 s80 = null;
            continue;
        }
    }
    
    public fm6(final ceg i, final ym1 ym1, final String f, final boolean g, final List<wl6> h, final s80 s80) {
        this.a = new lte();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = f;
        this.i = i;
        this.g = g;
        this.h = h;
        if (s80 != null) {
            (this.k = new nzt(s80)).a(ym1);
            this.k.b((wm1$a)this);
        }
        final ArrayList<t8c> list = new ArrayList<t8c>();
        int size = h.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final wl6 wl6 = h.get(n);
            size = n;
            if (!(wl6 instanceof t8c)) {
                continue;
            }
            list.add((t8c)wl6);
            size = n;
        }
        int size2 = list.size();
        while (--size2 >= 0) {
            list.get(size2).d((ListIterator)h.listIterator(h.size()));
        }
    }
    
    public final void a() {
        this.i.invalidateSelf();
    }
    
    public final void b(final List<wl6> list, final List<wl6> list2) {
        final ArrayList list3 = new ArrayList(this.h.size() + list.size());
        list3.addAll(list);
        int size = this.h.size();
        while (--size >= 0) {
            final wl6 wl6 = this.h.get(size);
            wl6.b((List)list3, (List)this.h.subList(0, size));
            list3.add(wl6);
        }
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.c.set(matrix);
        final nzt k = this.k;
        if (k != null) {
            this.c.preConcat(k.e());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int i = this.h.size() - 1; i >= 0; --i) {
            final wl6 wl6 = this.h.get(i);
            if (wl6 instanceof lj9) {
                ((lj9)wl6).c(this.e, this.c, b);
                rectF.union(this.e);
            }
        }
    }
    
    public final List<e0k> d() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); ++i) {
                final wl6 wl6 = this.h.get(i);
                if (wl6 instanceof e0k) {
                    this.j.add(wl6);
                }
            }
        }
        return this.j;
    }
    
    public final <T> void e(final T t, final seg seg) {
        final nzt k = this.k;
        if (k != null) {
            k.c((Object)t, seg);
        }
    }
    
    public final void f(final xqe xqe, final int n, final List<xqe> list, xqe xqe2) {
        if (!xqe.e(this.f, n) && !"__container".equals(this.f)) {
            return;
        }
        xqe a = xqe2;
        if (!"__container".equals(this.f)) {
            xqe2 = (a = xqe2.a(this.f));
            if (xqe.c(this.f, n)) {
                list.add(xqe2.g((yqe)this));
                a = xqe2;
            }
        }
        if (xqe.f(this.f, n)) {
            final int d = xqe.d(this.f, n);
            for (int i = 0; i < this.h.size(); ++i) {
                final wl6 wl6 = this.h.get(i);
                if (wl6 instanceof yqe) {
                    ((yqe)wl6).f(xqe, d + n, (List)list, a);
                }
            }
        }
    }
    
    @Override
    public final void g(final Canvas canvas, final Matrix matrix, int n) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        final nzt k = this.k;
        int alpha = n;
        if (k != null) {
            this.c.preConcat(k.e());
            final wm1 j = this.k.j;
            int intValue;
            if (j == null) {
                intValue = 100;
            }
            else {
                intValue = (int)j.f();
            }
            alpha = (int)(intValue / 100.0f * n / 255.0f * 255.0f);
        }
        final boolean w0 = this.i.W0;
        final int n2 = n = 0;
        Label_0200: {
            if (w0) {
                int i = 0;
                int n3 = 0;
                while (true) {
                    while (i < this.h.size()) {
                        n = n3;
                        if (this.h.get(i) instanceof lj9) {
                            n = ++n3;
                            if (n3 >= 2) {
                                final boolean b = true;
                                n = n2;
                                if (!b) {
                                    break Label_0200;
                                }
                                n = n2;
                                if (alpha != 255) {
                                    n = 1;
                                }
                                break Label_0200;
                            }
                        }
                        ++i;
                        n3 = n;
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
        if (n != 0) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.c(this.b, this.c, true);
            this.a.setAlpha(alpha);
            wnw.f(canvas, this.b, (Paint)this.a, 31);
        }
        if (n != 0) {
            alpha = 255;
        }
        for (int l = this.h.size() - 1; l >= 0; --l) {
            final wl6 value = this.h.get(l);
            if (value instanceof lj9) {
                ((lj9)value).g(canvas, this.c, alpha);
            }
        }
        if (n != 0) {
            canvas.restore();
        }
    }
    
    public final String getName() {
        return this.f;
    }
    
    @Override
    public final Path s() {
        this.c.reset();
        final nzt k = this.k;
        if (k != null) {
            this.c.set(k.e());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int i = this.h.size() - 1; i >= 0; --i) {
            final wl6 wl6 = this.h.get(i);
            if (wl6 instanceof e0k) {
                this.d.addPath(((e0k)wl6).s(), this.c);
            }
        }
        return this.d;
    }
}
