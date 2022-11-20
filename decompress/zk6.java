import android.graphics.Paint;
import android.graphics.Canvas;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Path;
import android.graphics.Matrix;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zk6 implements ji9, nzj, a, bqe
{
    public ose a;
    public RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final List<qk6> h;
    public final idg i;
    public List<nzj> j;
    public uyt k;
    
    public zk6(final idg i, final tm1 tm1, final String f, final boolean g, final List<qk6> h, final s80 s80) {
        this.a = new ose();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = f;
        this.i = i;
        this.g = g;
        this.h = h;
        if (s80 != null) {
            (this.k = new uyt(s80)).a(tm1);
            this.k.b((a)this);
        }
        final ArrayList<r7c> list = new ArrayList<r7c>();
        int size = h.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final qk6 qk6 = h.get(n);
            size = n;
            if (!(qk6 instanceof r7c)) {
                continue;
            }
            list.add((r7c)qk6);
            size = n;
        }
        int size2 = list.size();
        while (--size2 >= 0) {
            list.get(size2).d(h.listIterator(h.size()));
        }
    }
    
    public zk6(final idg idg, final tm1 tm1, final nrp nrp) {
        final String a = nrp.a;
        final boolean c = nrp.c;
        final List b = nrp.b;
        final ArrayList list = new ArrayList<qk6>(b.size());
        final int n = 0;
        for (int i = 0; i < b.size(); ++i) {
            final qk6 a2 = b.get(i).a(idg, tm1);
            if (a2 != null) {
                list.add(a2);
            }
        }
        final List b2 = nrp.b;
        while (true) {
            for (int j = n; j < b2.size(); ++j) {
                final tl6 tl6 = b2.get(j);
                if (tl6 instanceof s80) {
                    final s80 s80 = (s80)tl6;
                    this(idg, tm1, a, c, (List<qk6>)list, s80);
                    return;
                }
            }
            final s80 s80 = null;
            continue;
        }
    }
    
    public final void a() {
        this.i.invalidateSelf();
    }
    
    public final void b(final List<qk6> list, final List<qk6> list2) {
        final ArrayList list3 = new ArrayList(this.h.size() + list.size());
        list3.addAll(list);
        int size = this.h.size();
        while (--size >= 0) {
            final qk6 qk6 = this.h.get(size);
            qk6.b((List)list3, (List)this.h.subList(0, size));
            list3.add(qk6);
        }
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.c.set(matrix);
        final uyt k = this.k;
        if (k != null) {
            this.c.preConcat(k.e());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int i = this.h.size() - 1; i >= 0; --i) {
            final qk6 qk6 = this.h.get(i);
            if (qk6 instanceof ji9) {
                ((ji9)qk6).c(this.e, this.c, b);
                rectF.union(this.e);
            }
        }
    }
    
    public final List<nzj> d() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); ++i) {
                final qk6 qk6 = this.h.get(i);
                if (qk6 instanceof nzj) {
                    this.j.add(qk6);
                }
            }
        }
        return this.j;
    }
    
    public final <T> void e(final T t, final ydg ydg) {
        final uyt k = this.k;
        if (k != null) {
            k.c((Object)t, ydg);
        }
    }
    
    public final void f(final aqe aqe, final int n, final List<aqe> list, aqe aqe2) {
        if (!aqe.e(this.f, n) && !"__container".equals(this.f)) {
            return;
        }
        aqe a = aqe2;
        if (!"__container".equals(this.f)) {
            aqe2 = (a = aqe2.a(this.f));
            if (aqe.c(this.f, n)) {
                list.add(aqe2.g((bqe)this));
                a = aqe2;
            }
        }
        if (aqe.f(this.f, n)) {
            final int d = aqe.d(this.f, n);
            for (int i = 0; i < this.h.size(); ++i) {
                final qk6 qk6 = this.h.get(i);
                if (qk6 instanceof bqe) {
                    ((bqe)qk6).f(aqe, d + n, (List)list, a);
                }
            }
        }
    }
    
    public final void g(final Canvas canvas, final Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        final uyt k = this.k;
        int alpha = i;
        if (k != null) {
            this.c.preConcat(k.e());
            final rm1 j = this.k.j;
            int intValue;
            if (j == null) {
                intValue = 100;
            }
            else {
                intValue = j.f();
            }
            alpha = (int)(intValue / 100.0f * i / 255.0f * 255.0f);
        }
        final boolean u0 = this.i.U0;
        final int n = i = 0;
        Label_0200: {
            if (u0) {
                i = 0;
                int n2 = 0;
                while (true) {
                    while (i < this.h.size()) {
                        int n3 = n2;
                        if (this.h.get(i) instanceof ji9) {
                            n3 = ++n2;
                            if (n2 >= 2) {
                                final boolean b = true;
                                i = n;
                                if (!b) {
                                    break Label_0200;
                                }
                                i = n;
                                if (alpha != 255) {
                                    i = 1;
                                }
                                break Label_0200;
                            }
                        }
                        ++i;
                        n2 = n3;
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
        if (i != 0) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.c(this.b, this.c, true);
            ((Paint)this.a).setAlpha(alpha);
            hnw.f(canvas, this.b, (Paint)this.a, 31);
        }
        if (i != 0) {
            alpha = 255;
        }
        for (int l = this.h.size() - 1; l >= 0; --l) {
            final qk6 value = this.h.get(l);
            if (value instanceof ji9) {
                ((ji9)value).g(canvas, this.c, alpha);
            }
        }
        if (i != 0) {
            canvas.restore();
        }
    }
    
    public final String getName() {
        return this.f;
    }
    
    public final Path r() {
        this.c.reset();
        final uyt k = this.k;
        if (k != null) {
            this.c.set(k.e());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int i = this.h.size() - 1; i >= 0; --i) {
            final qk6 qk6 = this.h.get(i);
            if (qk6 instanceof nzj) {
                this.d.addPath(((nzj)qk6).r(), this.c);
            }
        }
        return this.d;
    }
}
