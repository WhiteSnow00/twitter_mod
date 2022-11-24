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

public abstract class ym1 implements lj9, wm1$a, yqe
{
    public final Path a;
    public final Matrix b;
    public final lte c;
    public final lte d;
    public final lte e;
    public final lte f;
    public final lte g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final String l;
    public final Matrix m;
    public final ceg n;
    public final tve o;
    public zmg p;
    public o7b q;
    public ym1 r;
    public ym1 s;
    public List<ym1> t;
    public final List<wm1<?, ?>> u;
    public final nzt v;
    public boolean w;
    public boolean x;
    public lte y;
    
    public ym1(final ceg n, final tve o) {
        this.a = new Path();
        this.b = new Matrix();
        boolean b = true;
        this.c = new lte(1);
        this.d = new lte(1, PorterDuff$Mode.DST_IN);
        this.e = new lte(1, PorterDuff$Mode.DST_OUT);
        final lte f = new lte(1);
        this.f = f;
        this.g = new lte(PorterDuff$Mode.CLEAR);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.m = new Matrix();
        this.u = new ArrayList();
        this.w = true;
        this.n = n;
        this.o = o;
        this.l = m51.y(new StringBuilder(), o.c, "#draw");
        if (o.u == 3) {
            f.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        }
        else {
            f.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
        }
        final s80 i = o.i;
        Objects.requireNonNull(i);
        (this.v = new nzt(i)).b((wm1$a)this);
        final List h = o.h;
        if (h != null && !h.isEmpty()) {
            final zmg p2 = new zmg(o.h);
            this.p = p2;
            final Iterator iterator = ((List)p2.F0).iterator();
            while (iterator.hasNext()) {
                ((wm1)iterator.next()).a((wm1$a)this);
            }
            for (final wm1 wm1 : (List)this.p.G0) {
                this.d((wm1<?, ?>)wm1);
                wm1.a((wm1$a)this);
            }
        }
        if (!this.o.t.isEmpty()) {
            final o7b q = new o7b(this.o.t);
            this.q = q;
            ((wm1)q).b = true;
            ((wm1)q).a((wm1$a)new xm1(this));
            if ((float)((wm1)this.q).f() != 1.0f) {
                b = false;
            }
            this.r(b);
            this.d((wm1<?, ?>)this.q);
        }
        else {
            this.r(true);
        }
    }
    
    public final void a() {
        this.n.invalidateSelf();
    }
    
    public final void b(final List<wl6> list, final List<wl6> list2) {
    }
    
    @Override
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
    
    public <T> void e(final T t, final seg seg) {
        this.v.c((Object)t, seg);
    }
    
    public final void f(final xqe xqe, final int n, final List<xqe> list, xqe xqe2) {
        final ym1 r = this.r;
        if (r != null) {
            final xqe a = xqe2.a(r.o.c);
            if (xqe.c(this.r.o.c, n)) {
                list.add(a.g((yqe)this.r));
            }
            if (xqe.f(this.o.c, n)) {
                this.r.o(xqe, xqe.d(this.r.o.c, n) + n, list, a);
            }
        }
        if (!xqe.e(this.o.c, n)) {
            return;
        }
        xqe a2 = xqe2;
        if (!"__container".equals(this.o.c)) {
            xqe2 = (a2 = xqe2.a(this.o.c));
            if (xqe.c(this.o.c, n)) {
                list.add(xqe2.g((yqe)this));
                a2 = xqe2;
            }
        }
        if (xqe.f(this.o.c, n)) {
            this.o(xqe, xqe.d(this.o.c, n) + n, list, a2);
        }
    }
    
    @Override
    public final void g(final Canvas canvas, final Matrix matrix, int i) {
        if (!this.w || this.o.v) {
            tpz.y();
            return;
        }
        this.h();
        this.b.reset();
        this.b.set(matrix);
        for (int j = this.t.size() - 1; j >= 0; --j) {
            this.b.preConcat(this.t.get(j).v.e());
        }
        tpz.y();
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
            tpz.y();
            tpz.y();
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
                ymg ymg;
                int g;
                RectF l;
                for (size = ((List)this.p.H0).size(), i = 0; i < size; ++i) {
                    ymg = ((List)this.p.H0).get(i);
                    this.a.set((Path)((List)this.p.F0).get(i).f());
                    this.a.transform(b);
                    g = lb0.G(ymg.a);
                    Label_0474: {
                        if (g != 0) {
                            if (g == 1) {
                                break Label_0608;
                            }
                            if (g != 2) {
                                if (g != 3) {
                                    break Label_0474;
                                }
                                break Label_0608;
                            }
                        }
                        if (ymg.d) {
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
        tpz.y();
        if (this.h.width() >= 1.0f && this.h.height() >= 1.0f) {
            this.c.setAlpha(255);
            wnw.f(canvas, this.h, (Paint)this.c, 31);
            tpz.y();
            this.i(canvas);
            this.j(canvas, this.b, n);
            tpz.y();
            if (this.k()) {
                final Matrix b2 = this.b;
                wnw.f(canvas, this.h, (Paint)this.d, 19);
                if (Build$VERSION.SDK_INT < 28) {
                    this.i(canvas);
                }
                tpz.y();
                ymg ymg2;
                wm1 wm1;
                wm1 wm2;
                int g2;
                int n2;
                boolean b3 = false;
                for (i = 0; i < ((List)this.p.H0).size(); ++i) {
                    ymg2 = ((List)this.p.H0).get(i);
                    wm1 = ((List)this.p.F0).get(i);
                    wm2 = ((List)this.p.G0).get(i);
                    g2 = lb0.G(ymg2.a);
                    if (g2 != 0) {
                        if (g2 != 1) {
                            if (g2 != 2) {
                                if (g2 == 3) {
                                    Label_0963: {
                                        Label_0895: {
                                            if (!((List)this.p.F0).isEmpty()) {
                                                for (n2 = 0; n2 < ((List)this.p.H0).size(); ++n2) {
                                                    if (((ymg)((List)this.p.H0).get(n2)).a != 4) {
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
                                        this.c.setAlpha(255);
                                        canvas.drawRect(this.h, (Paint)this.c);
                                    }
                                }
                            }
                            else if (ymg2.d) {
                                wnw.f(canvas, this.h, (Paint)this.d, 31);
                                canvas.drawRect(this.h, (Paint)this.c);
                                this.e.setAlpha((int)((int)wm2.f() * 2.55f));
                                this.a.set((Path)wm1.f());
                                this.a.transform(b2);
                                canvas.drawPath(this.a, (Paint)this.e);
                                canvas.restore();
                            }
                            else {
                                wnw.f(canvas, this.h, (Paint)this.d, 31);
                                this.a.set((Path)wm1.f());
                                this.a.transform(b2);
                                this.c.setAlpha((int)((int)wm2.f() * 2.55f));
                                canvas.drawPath(this.a, (Paint)this.c);
                                canvas.restore();
                            }
                        }
                        else {
                            if (i == 0) {
                                this.c.setColor(-16777216);
                                this.c.setAlpha(255);
                                canvas.drawRect(this.h, (Paint)this.c);
                            }
                            if (ymg2.d) {
                                wnw.f(canvas, this.h, (Paint)this.e, 31);
                                canvas.drawRect(this.h, (Paint)this.c);
                                this.e.setAlpha((int)((int)wm2.f() * 2.55f));
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
                    else if (ymg2.d) {
                        wnw.f(canvas, this.h, (Paint)this.c, 31);
                        canvas.drawRect(this.h, (Paint)this.c);
                        this.a.set((Path)wm1.f());
                        this.a.transform(b2);
                        this.c.setAlpha((int)((int)wm2.f() * 2.55f));
                        canvas.drawPath(this.a, (Paint)this.e);
                        canvas.restore();
                    }
                    else {
                        this.a.set((Path)wm1.f());
                        this.a.transform(b2);
                        this.c.setAlpha((int)((int)wm2.f() * 2.55f));
                        canvas.drawPath(this.a, (Paint)this.c);
                    }
                }
                canvas.restore();
                tpz.y();
            }
            if (this.l()) {
                wnw.f(canvas, this.h, (Paint)this.f, 19);
                tpz.y();
                this.i(canvas);
                this.r.g(canvas, matrix, n);
                canvas.restore();
                tpz.y();
                tpz.y();
            }
            canvas.restore();
            tpz.y();
        }
        if (this.x) {
            final lte y = this.y;
            if (y != null) {
                y.setStyle(Paint$Style.STROKE);
                this.y.setColor(-251901);
                this.y.setStrokeWidth(4.0f);
                canvas.drawRect(this.h, (Paint)this.y);
                this.y.setStyle(Paint$Style.FILL);
                this.y.setColor(1357638635);
                canvas.drawRect(this.h, (Paint)this.y);
            }
        }
        tpz.y();
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
        tpz.y();
    }
    
    public abstract void j(final Canvas p0, final Matrix p1, final int p2);
    
    public final boolean k() {
        final zmg p = this.p;
        return p != null && !((List)p.F0).isEmpty();
    }
    
    public final boolean l() {
        return this.r != null;
    }
    
    public final void m() {
        final y3k a = this.n.G0.a;
        final String c = this.o.c;
        if (a.a) {
            vqg vqg;
            if ((vqg = a.c.get(c)) == null) {
                vqg = new vqg();
                a.c.put(c, vqg);
            }
            final int a2 = vqg.a + 1;
            if ((vqg.a = a2) == Integer.MAX_VALUE) {
                vqg.a = a2 / 2;
            }
            if (c.equals("__container")) {
                final bt0 b = a.b;
                Objects.requireNonNull(b);
                final bt0.a a3 = b.new a();
                while (a3.hasNext()) {
                    ((zkd<y3k$a>)a3).next().a();
                }
            }
        }
    }
    
    public final void n(final wm1<?, ?> wm1) {
        this.u.remove(wm1);
    }
    
    public void o(final xqe xqe, final int n, final List<xqe> list, final xqe xqe2) {
    }
    
    public void p(final boolean x) {
        if (x && this.y == null) {
            this.y = new lte();
        }
        this.x = x;
    }
    
    public void q(final float n) {
        final nzt v = this.v;
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
        final o7b k = v.k;
        if (k != null) {
            ((wm1)k).j(n);
        }
        final o7b l = v.l;
        if (l != null) {
            ((wm1)l).j(n);
        }
        final zmg p = this.p;
        final int n3 = 0;
        if (p != null) {
            for (int n4 = 0; n4 < ((List)this.p.F0).size(); ++n4) {
                ((wm1)((List)this.p.F0).get(n4)).j(n);
            }
        }
        final float m2 = this.o.m;
        float n5 = n;
        if (m2 != 0.0f) {
            n5 = n / m2;
        }
        final o7b q = this.q;
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
    
    public final void r(final boolean w) {
        if (w != this.w) {
            this.w = w;
            this.n.invalidateSelf();
        }
    }
}
