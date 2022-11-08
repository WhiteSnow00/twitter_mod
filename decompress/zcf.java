import java.util.ArrayList;
import android.graphics.Path$Direction;
import java.util.Iterator;
import java.util.Objects;
import android.graphics.PathEffect;
import android.graphics.Paint$Style;
import java.util.HashMap;
import android.graphics.Path;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zcf extends idf
{
    public bdf i;
    public Paint j;
    public WeakReference<Bitmap> k;
    public Canvas l;
    public Bitmap$Config m;
    public Path n;
    public Path o;
    public float[] p;
    public Path q;
    public HashMap<s2d, zcf.zcf$a> r;
    public float[] s;
    
    public zcf(final bdf i, final cu3 cu3, final t9x t9x) {
        super(cu3, t9x);
        this.m = Bitmap$Config.ARGB_8888;
        this.n = new Path();
        this.o = new Path();
        this.p = new float[4];
        this.q = new Path();
        this.r = new HashMap<s2d, zcf.zcf$a>();
        this.s = new float[2];
        this.i = i;
        (this.j = new Paint(1)).setStyle(Paint$Style.FILL);
        this.j.setColor(-1);
    }
    
    public final void i(final Canvas canvas) {
        final t9x t9x = (t9x)((r7b)this).b;
        final int n = (int)t9x.c;
        final int n2 = (int)t9x.d;
        final WeakReference<Bitmap> k = this.k;
        if (k == null || ((Bitmap)k.get()).getWidth() != n || this.k.get().getHeight() != n2) {
            if (n <= 0 || n2 <= 0) {
                return;
            }
            this.k = new WeakReference<Bitmap>(Bitmap.createBitmap(n, n2, this.m));
            this.l = new Canvas((Bitmap)this.k.get());
        }
        this.k.get().eraseColor(0);
        Iterator iterator = ((du3)this.i.getLineData()).i.iterator();
        while (iterator.hasNext()) {
            final y2d y2d = (y2d)iterator.next();
            if (((s2d)y2d).isVisible()) {
                if (((s2d)y2d).Z() < 1) {
                    continue;
                }
                ((w78)this).d.setStrokeWidth(((z2d)y2d).e());
                final Paint d = ((w78)this).d;
                y2d.K();
                d.setPathEffect((PathEffect)null);
                final int d2 = nb0.D(y2d.m());
                Label_2324: {
                    if (d2 != 2) {
                        if (d2 != 3) {
                            final int z = ((s2d)y2d).Z();
                            final boolean b = y2d.B();
                            int n3;
                            if (b) {
                                n3 = 4;
                            }
                            else {
                                n3 = 2;
                            }
                            final oyt a = ((mi1)this.i).a(((s2d)y2d).y());
                            Objects.requireNonNull(((w78)this).c);
                            ((w78)this).d.setStyle(Paint$Style.STROKE);
                            y2d.f();
                            ((qi1)this).g.a((pi1)this.i, (n2d)y2d);
                            if (((z2d)y2d).O() && z > 0) {
                                final qi1$a g = ((qi1)this).g;
                                final Path q = this.q;
                                final int a2 = g.a;
                                final int n4 = g.c + a2;
                                int n5 = 0;
                                int n6;
                                int n7;
                                do {
                                    n6 = n5 * 128 + a2;
                                    if ((n7 = n6 + 128) > n4) {
                                        n7 = n4;
                                    }
                                    if (n6 <= n7) {
                                        final float d3 = y2d.G().D(y2d, this.i);
                                        Objects.requireNonNull(((w78)this).c);
                                        final boolean b2 = y2d.m() == 2;
                                        q.reset();
                                        final z7a o = ((s2d)y2d).o(n6);
                                        q.moveTo(o.b(), d3);
                                        q.lineTo(o.b(), o.a() * 1.0f);
                                        int i = n6 + 1;
                                        z7a z7a = null;
                                        while (i <= n7) {
                                            final z7a o2 = ((s2d)y2d).o(i);
                                            if (b2 && z7a != null) {
                                                q.lineTo(o2.b(), z7a.a() * 1.0f);
                                            }
                                            q.lineTo(o2.b(), o2.a() * 1.0f);
                                            ++i;
                                            z7a = o2;
                                        }
                                        if (z7a != null) {
                                            q.lineTo(z7a.b(), d3);
                                        }
                                        q.close();
                                        a.d(q);
                                        ((z2d)y2d).k();
                                        this.r(canvas, q, ((z2d)y2d).D(), ((z2d)y2d).c());
                                    }
                                    ++n5;
                                } while (n6 <= n7);
                            }
                            if (((s2d)y2d).s().size() > 1) {
                                final int length = this.p.length;
                                final int n8 = n3 * 2;
                                if (length <= n8) {
                                    this.p = new float[n3 * 4];
                                }
                                int a3 = ((qi1)this).g.a;
                                while (true) {
                                    final qi1$a g2 = ((qi1)this).g;
                                    if (a3 > g2.c + g2.a) {
                                        break;
                                    }
                                    final z7a o3 = ((s2d)y2d).o(a3);
                                    if (o3 != null) {
                                        this.p[0] = o3.b();
                                        this.p[1] = o3.a() * 1.0f;
                                        if (a3 < ((qi1)this).g.b) {
                                            final z7a o4 = ((s2d)y2d).o(a3 + 1);
                                            if (o4 == null) {
                                                break;
                                            }
                                            if (b) {
                                                this.p[2] = o4.b();
                                                final float[] p = this.p;
                                                p[3] = p[1];
                                                p[4] = p[2];
                                                p[5] = p[3];
                                                p[6] = o4.b();
                                                this.p[7] = o4.a() * 1.0f;
                                            }
                                            else {
                                                this.p[2] = o4.b();
                                                this.p[3] = o4.a() * 1.0f;
                                            }
                                        }
                                        else {
                                            final float[] p2 = this.p;
                                            p2[2] = p2[0];
                                            p2[3] = p2[1];
                                        }
                                        a.f(this.p);
                                        if (!((t9x)((r7b)this).b).f(this.p[0])) {
                                            break;
                                        }
                                        if (((t9x)((r7b)this).b).e(this.p[2])) {
                                            if (((t9x)((r7b)this).b).g(this.p[1]) || ((t9x)((r7b)this).b).d(this.p[3])) {
                                                ((w78)this).d.setColor(((s2d)y2d).P(a3));
                                                canvas.drawLines(this.p, 0, n8, ((w78)this).d);
                                            }
                                        }
                                    }
                                    ++a3;
                                }
                            }
                            else {
                                final int length2 = this.p.length;
                                final int n9 = z * n3;
                                if (length2 < Math.max(n9, n3) * 2) {
                                    this.p = new float[Math.max(n9, n3) * 4];
                                }
                                if (((s2d)y2d).o(((qi1)this).g.a) != null) {
                                    int a4 = ((qi1)this).g.a;
                                    int n10 = 0;
                                    while (true) {
                                        final qi1$a g3 = ((qi1)this).g;
                                        if (a4 > g3.c + g3.a) {
                                            break;
                                        }
                                        int n11;
                                        if (a4 == 0) {
                                            n11 = 0;
                                        }
                                        else {
                                            n11 = a4 - 1;
                                        }
                                        final z7a o5 = ((s2d)y2d).o(n11);
                                        final z7a o6 = ((s2d)y2d).o(a4);
                                        int n12 = n10;
                                        if (o5 != null) {
                                            if (o6 == null) {
                                                n12 = n10;
                                            }
                                            else {
                                                final float[] p3 = this.p;
                                                final int n13 = n10 + 1;
                                                p3[n10] = o5.b();
                                                final float[] p4 = this.p;
                                                final int n14 = n13 + 1;
                                                p4[n13] = o5.a() * 1.0f;
                                                int n15 = n14;
                                                if (b) {
                                                    final float[] p5 = this.p;
                                                    final int n16 = n14 + 1;
                                                    p5[n14] = o6.b();
                                                    final float[] p6 = this.p;
                                                    final int n17 = n16 + 1;
                                                    p6[n16] = o5.a() * 1.0f;
                                                    final float[] p7 = this.p;
                                                    final int n18 = n17 + 1;
                                                    p7[n17] = o6.b();
                                                    final float[] p8 = this.p;
                                                    n15 = n18 + 1;
                                                    p8[n18] = o5.a() * 1.0f;
                                                }
                                                final float[] p9 = this.p;
                                                n12 = n15 + 1;
                                                p9[n15] = o6.b();
                                                this.p[n12] = o6.a() * 1.0f;
                                                ++n12;
                                            }
                                        }
                                        ++a4;
                                        n10 = n12;
                                    }
                                    if (n10 > 0) {
                                        a.f(this.p);
                                        final int max = Math.max((((qi1)this).g.c + 1) * n3, n3);
                                        ((w78)this).d.setColor(((s2d)y2d).z());
                                        canvas.drawLines(this.p, 0, max * 2, ((w78)this).d);
                                    }
                                }
                            }
                            ((w78)this).d.setPathEffect((PathEffect)null);
                        }
                        else {
                            Objects.requireNonNull(((w78)this).c);
                            final oyt a5 = ((mi1)this.i).a(((s2d)y2d).y());
                            ((qi1)this).g.a((pi1)this.i, (n2d)y2d);
                            this.n.reset();
                            final qi1$a g4 = ((qi1)this).g;
                            if (g4.c >= 1) {
                                z7a o7 = ((s2d)y2d).o(g4.a);
                                this.n.moveTo(o7.b(), o7.a() * 1.0f);
                                int n19 = ((qi1)this).g.a + 1;
                                while (true) {
                                    final qi1$a g5 = ((qi1)this).g;
                                    if (n19 > g5.c + g5.a) {
                                        break;
                                    }
                                    final z7a o8 = ((s2d)y2d).o(n19);
                                    final float n20 = (o8.b() - o7.b()) / 2.0f + o7.b();
                                    this.n.cubicTo(n20, o7.a() * 1.0f, n20, o8.a() * 1.0f, o8.b(), o8.a() * 1.0f);
                                    ++n19;
                                    o7 = o8;
                                }
                            }
                            if (((z2d)y2d).O()) {
                                this.o.reset();
                                this.o.addPath(this.n);
                                this.s(this.l, y2d, this.o, a5, ((qi1)this).g);
                            }
                            ((w78)this).d.setColor(((s2d)y2d).z());
                            ((w78)this).d.setStyle(Paint$Style.STROKE);
                            a5.d(this.n);
                            this.l.drawPath(this.n, ((w78)this).d);
                            ((w78)this).d.setPathEffect((PathEffect)null);
                        }
                    }
                    else {
                        final Iterator iterator2 = iterator;
                        Objects.requireNonNull(((w78)this).c);
                        Math.max(0.0f, Math.min(1.0f, 1.0f));
                        Objects.requireNonNull(((w78)this).c);
                        final oyt a6 = ((mi1)this.i).a(((s2d)y2d).y());
                        ((qi1)this).g.a((pi1)this.i, (n2d)y2d);
                        final float j = y2d.j();
                        this.n.reset();
                        final qi1$a g6 = ((qi1)this).g;
                        if (g6.c >= 1) {
                            final int n21 = g6.a + 1;
                            z7a o9 = ((s2d)y2d).o(Math.max(n21 - 2, 0));
                            z7a z7a2 = ((s2d)y2d).o(Math.max(n21 - 1, 0));
                            if (z7a2 == null) {
                                iterator = iterator2;
                                break Label_2324;
                            }
                            this.n.moveTo(z7a2.b(), z7a2.a() * 1.0f);
                            int n22 = ((qi1)this).g.a + 1;
                            int n23 = -1;
                            z7a z7a3 = z7a2;
                            while (true) {
                                final qi1$a g7 = ((qi1)this).g;
                                if (n22 > g7.c + g7.a) {
                                    break;
                                }
                                if (n23 != n22) {
                                    z7a2 = ((s2d)y2d).o(n22);
                                }
                                final int n24 = n22 + 1;
                                if (n24 < ((s2d)y2d).Z()) {
                                    n22 = n24;
                                }
                                final z7a o10 = ((s2d)y2d).o(n22);
                                this.n.cubicTo(z7a3.b() + (z7a2.b() - o9.b()) * j, (z7a3.a() + (z7a2.a() - o9.a()) * j) * 1.0f, z7a2.b() - (o10.b() - z7a3.b()) * j, (z7a2.a() - (o10.a() - z7a3.a()) * j) * 1.0f, z7a2.b(), z7a2.a() * 1.0f);
                                final z7a z7a4 = z7a2;
                                z7a2 = o10;
                                n23 = n22;
                                n22 = n24;
                                o9 = z7a3;
                                z7a3 = z7a4;
                            }
                        }
                        if (((z2d)y2d).O()) {
                            this.o.reset();
                            this.o.addPath(this.n);
                            this.s(this.l, y2d, this.o, a6, ((qi1)this).g);
                        }
                        ((w78)this).d.setColor(((s2d)y2d).z());
                        ((w78)this).d.setStyle(Paint$Style.STROKE);
                        a6.d(this.n);
                        this.l.drawPath(this.n, ((w78)this).d);
                        ((w78)this).d.setPathEffect((PathEffect)null);
                        iterator = iterator2;
                    }
                }
                ((w78)this).d.setPathEffect((PathEffect)null);
            }
        }
        canvas.drawBitmap((Bitmap)this.k.get(), 0.0f, 0.0f, ((w78)this).d);
    }
    
    public final void j(final Canvas canvas) {
        ((w78)this).d.setStyle(Paint$Style.FILL);
        Objects.requireNonNull(((w78)this).c);
        final float[] s = this.s;
        s[1] = (s[0] = 0.0f);
        final ArrayList i = ((du3)this.i.getLineData()).i;
        int n2;
        for (int j = 0; j < i.size(); j = n2 + 1) {
            final y2d y2d = (y2d)i.get(j);
            if (((s2d)y2d).isVisible() && y2d.a0() && ((s2d)y2d).Z() != 0) {
                this.j.setColor(y2d.g());
                final oyt a = ((mi1)this.i).a(((s2d)y2d).y());
                ((qi1)this).g.a((pi1)this.i, (n2d)y2d);
                final float n = y2d.N();
                final float c0 = y2d.c0();
                final boolean b = y2d.f0() && c0 < n && c0 > 0.0f;
                final boolean b2 = b && y2d.g() == 1122867;
                zcf.zcf$a zcf$a;
                if (this.r.containsKey(y2d)) {
                    zcf$a = this.r.get(y2d);
                }
                else {
                    zcf$a = new zcf.zcf$a(this);
                    this.r.put((s2d)y2d, zcf$a);
                }
                Objects.requireNonNull(zcf$a);
                final int c2 = y2d.C();
                final Bitmap[] b3 = zcf$a.b;
                boolean b4 = false;
                Label_0344: {
                    if (b3 == null) {
                        zcf$a.b = new Bitmap[c2];
                    }
                    else {
                        if (b3.length == c2) {
                            b4 = false;
                            break Label_0344;
                        }
                        zcf$a.b = new Bitmap[c2];
                    }
                    b4 = true;
                }
                n2 = j;
                if (b4) {
                    final int c3 = y2d.C();
                    final float n3 = y2d.N();
                    final float c4 = y2d.c0();
                    int n4 = 0;
                    while (true) {
                        n2 = j;
                        if (n4 >= c3) {
                            break;
                        }
                        final Bitmap$Config argb_4444 = Bitmap$Config.ARGB_4444;
                        final int n5 = (int)(n3 * 2.1);
                        final Bitmap bitmap = Bitmap.createBitmap(n5, n5, argb_4444);
                        final Canvas canvas2 = new Canvas(bitmap);
                        zcf$a.b[n4] = bitmap;
                        ((w78)zcf$a.c).d.setColor(y2d.Y(n4));
                        if (b2) {
                            zcf$a.a.reset();
                            zcf$a.a.addCircle(n3, n3, n3, Path$Direction.CW);
                            zcf$a.a.addCircle(n3, n3, c4, Path$Direction.CCW);
                            canvas2.drawPath(zcf$a.a, ((w78)zcf$a.c).d);
                        }
                        else {
                            canvas2.drawCircle(n3, n3, n3, ((w78)zcf$a.c).d);
                            if (b) {
                                canvas2.drawCircle(n3, n3, c4, zcf$a.c.j);
                            }
                        }
                        ++n4;
                    }
                }
                int k = 0;
                for (qi1$a g = ((qi1)this).g; k <= g.c + (k = g.a); ++k) {
                    final z7a o = ((s2d)y2d).o(k);
                    if (o == null) {
                        break;
                    }
                    this.s[0] = o.b();
                    this.s[1] = o.a() * 1.0f;
                    a.f(this.s);
                    if (!((t9x)((r7b)this).b).f(this.s[0])) {
                        break;
                    }
                    if (((t9x)((r7b)this).b).e(this.s[0])) {
                        if (((t9x)((r7b)this).b).i(this.s[1])) {
                            final Bitmap[] b5 = zcf$a.b;
                            final Bitmap bitmap2 = b5[k % b5.length];
                            if (bitmap2 != null) {
                                final float[] s2 = this.s;
                                canvas.drawBitmap(bitmap2, s2[0] - n, s2[1] - n, ((w78)this).d);
                            }
                        }
                    }
                }
            }
            else {
                n2 = j;
            }
        }
    }
    
    public final void k(final Canvas canvas, final flc[] array) {
        final adf lineData = this.i.getLineData();
        for (final flc flc : array) {
            final y2d y2d = (y2d)((du3)lineData).c(flc.f);
            if (y2d != null) {
                if (((s2d)y2d).b0()) {
                    final z7a j = ((s2d)y2d).I(flc.a, flc.b);
                    if (((qi1)this).p(j, (n2d)y2d)) {
                        final oyt a = ((mi1)this.i).a(((s2d)y2d).y());
                        final float b = j.b();
                        final float a2 = j.a();
                        Objects.requireNonNull(((w78)this).c);
                        final ffg a3 = a.a(b, a2 * 1.0f);
                        final float k = (float)a3.b;
                        final float l = (float)a3.c;
                        flc.i = k;
                        flc.j = l;
                        ((w78)this).e.setColor(((n2d)y2d).X());
                        ((w78)this).e.setStrokeWidth(((a3d)y2d).J());
                        final Paint e = ((w78)this).e;
                        ((a3d)y2d).S();
                        e.setPathEffect((PathEffect)null);
                        if (((a3d)y2d).A()) {
                            super.h.reset();
                            super.h.moveTo(k, ((t9x)((r7b)this).b).b.top);
                            super.h.lineTo(k, ((t9x)((r7b)this).b).b.bottom);
                            canvas.drawPath(super.h, ((w78)this).e);
                        }
                        if (((a3d)y2d).d0()) {
                            super.h.reset();
                            super.h.moveTo(((t9x)((r7b)this).b).b.left, l);
                            super.h.lineTo(((t9x)((r7b)this).b).b.right, l);
                            canvas.drawPath(super.h, ((w78)this).e);
                        }
                    }
                }
            }
        }
    }
    
    public final void m(final Canvas canvas) {
        if (((w78)this).o((fu3)this.i)) {
            final ArrayList i = ((du3)this.i.getLineData()).i;
            for (int j = 0; j < i.size(); ++j) {
                final y2d y2d = (y2d)i.get(j);
                if (((qi1)this).q((s2d)y2d)) {
                    ((w78)this).e((s2d)y2d);
                    final oyt a = ((mi1)this.i).a(((s2d)y2d).y());
                    int n = (int)(y2d.N() * 1.75f);
                    if (!y2d.a0()) {
                        n /= 2;
                    }
                    ((qi1)this).g.a((pi1)this.i, (n2d)y2d);
                    Objects.requireNonNull(((w78)this).c);
                    Objects.requireNonNull(((w78)this).c);
                    final qi1$a g = ((qi1)this).g;
                    final int a2 = g.a;
                    final int n2 = ((int)((g.b - a2) * 1.0f) + 1) * 2;
                    if (a.d.length != n2) {
                        a.d = new float[n2];
                    }
                    final float[] d = a.d;
                    for (int k = 0; k < n2; k += 2) {
                        final z7a o = ((s2d)y2d).o(k / 2 + a2);
                        if (o != null) {
                            d[k] = o.b();
                            d[k + 1] = o.a() * 1.0f;
                        }
                        else {
                            d[k + 1] = (d[k] = 0.0f);
                        }
                    }
                    a.g.set(a.a);
                    a.g.postConcat(a.c.a);
                    a.g.postConcat(a.b);
                    a.g.mapPoints(d);
                    for (int l = 0; l < d.length; l += 2) {
                        final float n3 = d[l];
                        final float n4 = d[l + 1];
                        if (!((t9x)((r7b)this).b).f(n3)) {
                            break;
                        }
                        if (((t9x)((r7b)this).b).e(n3)) {
                            if (((t9x)((r7b)this).b).i(n4)) {
                                final int n5 = l / 2;
                                final z7a o2 = ((s2d)y2d).o(((qi1)this).g.a + n5);
                                ((w78)this).l(canvas, ((s2d)y2d).l(), o2.a(), o2, j, n3, n4 - n, ((s2d)y2d).r(n5));
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void n() {
    }
    
    public final void s(final Canvas canvas, final y2d y2d, final Path path, final oyt oyt, final qi1$a qi1$a) {
        final float d = y2d.G().D(y2d, this.i);
        path.lineTo(((s2d)y2d).o(qi1$a.a + qi1$a.c).b(), d);
        path.lineTo(((s2d)y2d).o(qi1$a.a).b(), d);
        path.close();
        oyt.d(path);
        ((z2d)y2d).k();
        this.r(canvas, path, ((z2d)y2d).D(), ((z2d)y2d).c());
    }
}
