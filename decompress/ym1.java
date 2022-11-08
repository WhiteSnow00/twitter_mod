import java.util.Collections;
import android.graphics.Paint$Style;
import android.os.Build$VERSION;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.util.Iterator;
import java.util.Objects;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import android.graphics.PorterDuff$Mode;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ym1 implements aj9, wm1$a, pqe
{
    public final Path a;
    public final Matrix b;
    public final dte c;
    public final dte d;
    public final dte e;
    public final dte f;
    public final dte g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final String l;
    public final Matrix m;
    public final sdg n;
    public final kve o;
    public img p;
    public p7b q;
    public ym1 r;
    public ym1 s;
    public List<ym1> t;
    public final List<wm1<?, ?>> u;
    public final eyt v;
    public boolean w;
    public boolean x;
    public dte y;
    
    public ym1(final sdg n, final kve o) {
        this.a = new Path();
        this.b = new Matrix();
        boolean b = true;
        this.c = new dte(1);
        this.d = new dte(1, PorterDuff$Mode.DST_IN);
        this.e = new dte(1, PorterDuff$Mode.DST_OUT);
        final dte f = new dte(1);
        this.f = f;
        this.g = new dte(PorterDuff$Mode.CLEAR);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.m = new Matrix();
        this.u = new ArrayList();
        this.w = true;
        this.n = n;
        this.o = o;
        this.l = hi.I(new StringBuilder(), o.c, "#draw");
        if (o.u == 3) {
            ((Paint)f).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        }
        else {
            ((Paint)f).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
        }
        final u80 i = o.i;
        Objects.requireNonNull(i);
        (this.v = new eyt(i)).b((wm1$a)this);
        final List h = o.h;
        if (h != null && !h.isEmpty()) {
            final img p2 = new img(o.h);
            this.p = p2;
            final Iterator iterator = ((List)p2.C0).iterator();
            while (iterator.hasNext()) {
                ((wm1)iterator.next()).a((wm1$a)this);
            }
            for (final wm1 wm1 : (List)this.p.D0) {
                this.d((wm1<?, ?>)wm1);
                wm1.a((wm1$a)this);
            }
        }
        if (!this.o.t.isEmpty()) {
            final p7b q = new p7b(this.o.t);
            this.q = q;
            ((wm1)q).b = true;
            ((wm1)q).a((wm1$a)new xm1(this));
            if ((float)((wm1)this.q).f() != 1.0f) {
                b = false;
            }
            this.s(b);
            this.d((wm1<?, ?>)this.q);
        }
        else {
            this.s(true);
        }
    }
    
    public final void a() {
        this.n.invalidateSelf();
    }
    
    public final void b(final List<jl6> list, final List<jl6> list2) {
    }
    
    public void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.h();
        this.m.set(matrix);
        if (b) {
            final List<ym1> t = this.t;
            if (t != null) {
                int size = t.size();
                while (--size >= 0) {
                    this.m.preConcat(this.t.get(size).v.e());
                }
            }
            else {
                final ym1 s = this.s;
                if (s != null) {
                    this.m.preConcat(s.v.e());
                }
            }
        }
        this.m.preConcat(this.v.e());
    }
    
    public final void d(final wm1<?, ?> wm1) {
        if (wm1 == null) {
            return;
        }
        this.u.add(wm1);
    }
    
    public <T> void e(final T t, final ieg ieg) {
        this.v.c((Object)t, ieg);
    }
    
    public final void f(final oqe oqe, final int n, final List<oqe> list, oqe oqe2) {
        final ym1 r = this.r;
        if (r != null) {
            final oqe a = oqe2.a(r.o.c);
            if (oqe.c(this.r.o.c, n)) {
                list.add(a.g((pqe)this.r));
            }
            if (oqe.f(this.o.c, n)) {
                this.r.o(oqe, oqe.d(this.r.o.c, n) + n, list, a);
            }
        }
        if (!oqe.e(this.o.c, n)) {
            return;
        }
        oqe a2 = oqe2;
        if (!"__container".equals(this.o.c)) {
            oqe2 = (a2 = oqe2.a(this.o.c));
            if (oqe.c(this.o.c, n)) {
                list.add(oqe2.g((pqe)this));
                a2 = oqe2;
            }
        }
        if (oqe.f(this.o.c, n)) {
            this.o(oqe, oqe.d(this.o.c, n) + n, list, a2);
        }
    }
    
    public final void g(final Canvas canvas, final Matrix matrix, int i) {
        if (!this.w || this.o.v) {
            yos.g();
            return;
        }
        this.h();
        this.b.reset();
        this.b.set(matrix);
        for (int j = this.t.size() - 1; j >= 0; --j) {
            this.b.preConcat(this.t.get(j).v.e());
        }
        yos.g();
        final wm1 k = this.v.j;
        int intValue;
        if (k == null) {
            intValue = 100;
        }
        else {
            intValue = (int)k.f();
        }
        final int n = (int)(i / 255.0f * intValue / 100.0f * 255.0f);
        if (!this.l() && !this.k()) {
            this.b.preConcat(this.v.e());
            this.j(canvas, this.b, n);
            yos.g();
            yos.g();
            this.m();
            return;
        }
        this.c(this.h, this.b, false);
        final RectF h = this.h;
        if (this.l()) {
            if (this.o.u != 3) {
                this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.r.c(this.j, matrix, true);
                if (!h.intersect(this.j)) {
                    h.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        this.b.preConcat(this.v.e());
        final RectF h2 = this.h;
        final Matrix b = this.b;
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        Label_0608: {
            if (this.k()) {
                int size;
                hmg hmg;
                int d;
                RectF l;
                for (size = ((List)this.p.E0).size(), i = 0; i < size; ++i) {
                    hmg = ((List)this.p.E0).get(i);
                    this.a.set((Path)((List)this.p.C0).get(i).f());
                    this.a.transform(b);
                    d = nb0.D(hmg.a);
                    Label_0474: {
                        if (d != 0) {
                            if (d == 1) {
                                break Label_0608;
                            }
                            if (d != 2) {
                                if (d != 3) {
                                    break Label_0474;
                                }
                                break Label_0608;
                            }
                        }
                        if (hmg.d) {
                            break Label_0608;
                        }
                    }
                    this.a.computeBounds(this.k, false);
                    if (i == 0) {
                        this.i.set(this.k);
                    }
                    else {
                        l = this.i;
                        l.set(Math.min(l.left, this.k.left), Math.min(this.i.top, this.k.top), Math.max(this.i.right, this.k.right), Math.max(this.i.bottom, this.k.bottom));
                    }
                }
                if (!h2.intersect(this.i)) {
                    h2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        if (!this.h.intersect(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight())) {
            this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        yos.g();
        if (this.h.width() >= 1.0f && this.h.height() >= 1.0f) {
            ((Paint)this.c).setAlpha(255);
            mmw.f(canvas, this.h, (Paint)this.c, 31);
            yos.g();
            this.i(canvas);
            this.j(canvas, this.b, n);
            yos.g();
            if (this.k()) {
                final Matrix b2 = this.b;
                mmw.f(canvas, this.h, (Paint)this.d, 19);
                if (Build$VERSION.SDK_INT < 28) {
                    this.i(canvas);
                }
                yos.g();
                hmg hmg2;
                wm1 wm1;
                wm1 wm2;
                int d2;
                int n2;
                boolean b3 = false;
                for (i = 0; i < ((List)this.p.E0).size(); ++i) {
                    hmg2 = ((List)this.p.E0).get(i);
                    wm1 = ((List)this.p.C0).get(i);
                    wm2 = ((List)this.p.D0).get(i);
                    d2 = nb0.D(hmg2.a);
                    if (d2 != 0) {
                        if (d2 != 1) {
                            if (d2 != 2) {
                                if (d2 == 3) {
                                    Label_0963: {
                                        Label_0895: {
                                            if (!((List)this.p.C0).isEmpty()) {
                                                for (n2 = 0; n2 < ((List)this.p.E0).size(); ++n2) {
                                                    if (((hmg)((List)this.p.E0).get(n2)).a != 4) {
                                                        break Label_0895;
                                                    }
                                                }
                                                b3 = true;
                                                break Label_0963;
                                            }
                                        }
                                        b3 = false;
                                    }
                                    if (b3) {
                                        ((Paint)this.c).setAlpha(255);
                                        canvas.drawRect(this.h, (Paint)this.c);
                                    }
                                }
                            }
                            else if (hmg2.d) {
                                mmw.f(canvas, this.h, (Paint)this.d, 31);
                                canvas.drawRect(this.h, (Paint)this.c);
                                ((Paint)this.e).setAlpha((int)((int)wm2.f() * 2.55f));
                                this.a.set((Path)wm1.f());
                                this.a.transform(b2);
                                canvas.drawPath(this.a, (Paint)this.e);
                                canvas.restore();
                            }
                            else {
                                mmw.f(canvas, this.h, (Paint)this.d, 31);
                                this.a.set((Path)wm1.f());
                                this.a.transform(b2);
                                ((Paint)this.c).setAlpha((int)((int)wm2.f() * 2.55f));
                                canvas.drawPath(this.a, (Paint)this.c);
                                canvas.restore();
                            }
                        }
                        else {
                            if (i == 0) {
                                ((Paint)this.c).setColor(-16777216);
                                ((Paint)this.c).setAlpha(255);
                                canvas.drawRect(this.h, (Paint)this.c);
                            }
                            if (hmg2.d) {
                                mmw.f(canvas, this.h, (Paint)this.e, 31);
                                canvas.drawRect(this.h, (Paint)this.c);
                                ((Paint)this.e).setAlpha((int)((int)wm2.f() * 2.55f));
                                this.a.set((Path)wm1.f());
                                this.a.transform(b2);
                                canvas.drawPath(this.a, (Paint)this.e);
                                canvas.restore();
                            }
                            else {
                                this.a.set((Path)wm1.f());
                                this.a.transform(b2);
                                canvas.drawPath(this.a, (Paint)this.e);
                            }
                        }
                    }
                    else if (hmg2.d) {
                        mmw.f(canvas, this.h, (Paint)this.c, 31);
                        canvas.drawRect(this.h, (Paint)this.c);
                        this.a.set((Path)wm1.f());
                        this.a.transform(b2);
                        ((Paint)this.c).setAlpha((int)((int)wm2.f() * 2.55f));
                        canvas.drawPath(this.a, (Paint)this.e);
                        canvas.restore();
                    }
                    else {
                        this.a.set((Path)wm1.f());
                        this.a.transform(b2);
                        ((Paint)this.c).setAlpha((int)((int)wm2.f() * 2.55f));
                        canvas.drawPath(this.a, (Paint)this.c);
                    }
                }
                canvas.restore();
                yos.g();
            }
            if (this.l()) {
                mmw.f(canvas, this.h, (Paint)this.f, 19);
                yos.g();
                this.i(canvas);
                this.r.g(canvas, matrix, n);
                canvas.restore();
                yos.g();
                yos.g();
            }
            canvas.restore();
            yos.g();
        }
        if (this.x) {
            final dte y = this.y;
            if (y != null) {
                ((Paint)y).setStyle(Paint$Style.STROKE);
                ((Paint)this.y).setColor(-251901);
                ((Paint)this.y).setStrokeWidth(4.0f);
                canvas.drawRect(this.h, (Paint)this.y);
                ((Paint)this.y).setStyle(Paint$Style.FILL);
                ((Paint)this.y).setColor(1357638635);
                canvas.drawRect(this.h, (Paint)this.y);
            }
        }
        yos.g();
        this.m();
    }
    
    public final String getName() {
        return this.o.c;
    }
    
    public final void h() {
        if (this.t != null) {
            return;
        }
        if (this.s == null) {
            this.t = Collections.emptyList();
            return;
        }
        this.t = new ArrayList<ym1>();
        for (ym1 ym1 = this.s; ym1 != null; ym1 = ym1.s) {
            this.t.add(ym1);
        }
    }
    
    public final void i(final Canvas canvas) {
        final RectF h = this.h;
        canvas.drawRect(h.left - 1.0f, h.top - 1.0f, h.right + 1.0f, h.bottom + 1.0f, (Paint)this.g);
        yos.g();
    }
    
    public abstract void j(final Canvas p0, final Matrix p1, final int p2);
    
    public final boolean k() {
        final img p = this.p;
        return p != null && !((List)p.C0).isEmpty();
    }
    
    public final boolean l() {
        return this.r != null;
    }
    
    public final void m() {
        final f3k a = this.n.D0.a;
        final String c = this.o.c;
        if (a.a) {
            cqg cqg;
            if ((cqg = a.c.get(c)) == null) {
                cqg = new cqg();
                a.c.put(c, cqg);
            }
            final int a2 = cqg.a + 1;
            if ((cqg.a = a2) == Integer.MAX_VALUE) {
                cqg.a = a2 / 2;
            }
            if (c.equals("__container")) {
                final ft0 b = a.b;
                Objects.requireNonNull(b);
                final ft0$a ft0$a = new ft0$a(b);
                while (((vkd)ft0$a).hasNext()) {
                    ((f3k$a)((vkd)ft0$a).next()).a();
                }
            }
        }
    }
    
    public final void n(final wm1<?, ?> wm1) {
        this.u.remove(wm1);
    }
    
    public void o(final oqe oqe, final int n, final List<oqe> list, final oqe oqe2) {
    }
    
    public void p(final boolean x) {
        if (x && this.y == null) {
            this.y = new dte();
        }
        this.x = x;
    }
    
    public void q(final float n) {
        final eyt v = this.v;
        final wm1 j = v.j;
        if (j != null) {
            j.j(n);
        }
        final wm1 m = v.m;
        if (m != null) {
            m.j(n);
        }
        final wm1 n2 = v.n;
        if (n2 != null) {
            n2.j(n);
        }
        final wm1 f = v.f;
        if (f != null) {
            f.j(n);
        }
        final wm1 g = v.g;
        if (g != null) {
            g.j(n);
        }
        final wm1 h = v.h;
        if (h != null) {
            h.j(n);
        }
        final wm1 i = v.i;
        if (i != null) {
            i.j(n);
        }
        final p7b k = v.k;
        if (k != null) {
            ((wm1)k).j(n);
        }
        final p7b l = v.l;
        if (l != null) {
            ((wm1)l).j(n);
        }
        final img p = this.p;
        final int n3 = 0;
        if (p != null) {
            for (int n4 = 0; n4 < ((List)this.p.C0).size(); ++n4) {
                ((wm1)((List)this.p.C0).get(n4)).j(n);
            }
        }
        final float m2 = this.o.m;
        float n5 = n;
        if (m2 != 0.0f) {
            n5 = n / m2;
        }
        final p7b q = this.q;
        if (q != null) {
            ((wm1)q).j(n5 / m2);
        }
        final ym1 r = this.r;
        int n6 = n3;
        if (r != null) {
            r.q(r.o.m * n5);
            n6 = n3;
        }
        while (n6 < this.u.size()) {
            ((wm1)this.u.get(n6)).j(n5);
            ++n6;
        }
    }
    
    public final void s(final boolean w) {
        if (w != this.w) {
            this.w = w;
            this.n.invalidateSelf();
        }
    }
}
