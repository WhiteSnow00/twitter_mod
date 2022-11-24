import android.graphics.Canvas;
import android.os.Build$VERSION;
import java.util.Objects;
import android.content.Context;
import java.util.List;
import android.widget.EdgeEffect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q30 implements krj
{
    public final irj a;
    public kgj b;
    public final EdgeEffect c;
    public final EdgeEffect d;
    public final EdgeEffect e;
    public final EdgeEffect f;
    public final List<EdgeEffect> g;
    public final EdgeEffect h;
    public final EdgeEffect i;
    public final EdgeEffect j;
    public final EdgeEffect k;
    public final fvh<vzv> l;
    public boolean m;
    public boolean n;
    public long o;
    public final fvh<Boolean> p;
    public boolean q;
    public final stb<nud, vzv> r;
    public spk s;
    public final dlh t;
    
    public q30(final Context context, final irj a) {
        e0e.f((Object)context, "context");
        this.a = a;
        final EdgeEffect r = lp7.r(context);
        this.c = r;
        final EdgeEffect r2 = lp7.r(context);
        this.d = r2;
        final EdgeEffect r3 = lp7.r(context);
        this.e = r3;
        final EdgeEffect r4 = lp7.r(context);
        this.f = r4;
        int i = 0;
        final List y0 = shw.y0((Object[])new EdgeEffect[] { r3, r, r4, r2 });
        this.g = y0;
        this.h = lp7.r(context);
        this.i = lp7.r(context);
        this.j = lp7.r(context);
        this.k = lp7.r(context);
        while (i < y0.size()) {
            ((EdgeEffect)y0.get(i)).setColor(yru.I(this.a.a));
            ++i;
        }
        final vzv a2 = vzv.a;
        this.l = (wwj)zzz.V((Object)a2, (djq)vei.a);
        this.m = true;
        Objects.requireNonNull(aeq.Companion);
        this.o = aeq.b;
        this.p = (wwj)zzz.W((Object)Boolean.FALSE);
        final q30$b r5 = new q30$b(this);
        this.r = r5;
        final dlh.a companion = dlh.Companion;
        final dlh b = y40.b;
        Objects.requireNonNull(companion);
        e0e.f((Object)b, "other");
        final dlh j = p4j.J(q1s.a(b, (Object)a2, (hub)new q30$a(this, (mp6)null)), (stb)r5);
        final ysd$a a3 = ysd.a;
        final ysd$a a4 = ysd.a;
        this.t = j.E((dlh)new td9(this));
    }
    
    public final void a(final long n, final long n2, int n3) {
        if (aeq.e(this.o)) {
            return;
        }
        Objects.requireNonNull(pci.Companion);
        final boolean b = true;
        if (n3 == 1) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            final kgj b2 = this.b;
            long n4;
            if (b2 != null) {
                n4 = b2.a;
            }
            else {
                n4 = jty.C(this.o);
            }
            if (kgj.d(n2) > 0.0f) {
                this.n(n2, n4);
            }
            else if (kgj.d(n2) < 0.0f) {
                this.o(n2, n4);
            }
            if (kgj.e(n2) > 0.0f) {
                this.p(n2, n4);
            }
            else if (kgj.e(n2) < 0.0f) {
                this.m(n2, n4);
            }
            Objects.requireNonNull(kgj.Companion);
            n3 = ((kgj.b(n2, kgj.b) ^ true) ? 1 : 0);
        }
        else {
            n3 = 0;
        }
        int finished;
        if (!this.e.isFinished() && kgj.d(n) < 0.0f) {
            final EdgeEffect e = this.e;
            final float d = kgj.d(n);
            e0e.f((Object)e, "<this>");
            if (e instanceof i5c) {
                final i5c i5c = (i5c)e;
                final float b3 = i5c.b + d;
                i5c.b = b3;
                if (Math.abs(b3) > i5c.a) {
                    i5c.onRelease();
                }
            }
            else {
                e.onRelease();
            }
            finished = (this.e.isFinished() ? 1 : 0);
        }
        else {
            finished = 0;
        }
        int n5 = finished;
        if (!this.f.isFinished()) {
            n5 = finished;
            if (kgj.d(n) > 0.0f) {
                final EdgeEffect f = this.f;
                final float d2 = kgj.d(n);
                e0e.f((Object)f, "<this>");
                if (f instanceof i5c) {
                    final i5c i5c2 = (i5c)f;
                    final float b4 = i5c2.b + d2;
                    i5c2.b = b4;
                    if (Math.abs(b4) > i5c2.a) {
                        i5c2.onRelease();
                    }
                }
                else {
                    f.onRelease();
                }
                n5 = ((finished || this.f.isFinished()) ? 1 : 0);
            }
        }
        int n6 = n5;
        if (!this.c.isFinished()) {
            n6 = n5;
            if (kgj.e(n) < 0.0f) {
                final EdgeEffect c = this.c;
                final float e2 = kgj.e(n);
                e0e.f((Object)c, "<this>");
                if (c instanceof i5c) {
                    final i5c i5c3 = (i5c)c;
                    final float b5 = i5c3.b + e2;
                    i5c3.b = b5;
                    if (Math.abs(b5) > i5c3.a) {
                        i5c3.onRelease();
                    }
                }
                else {
                    c.onRelease();
                }
                n6 = ((n5 || this.c.isFinished()) ? 1 : 0);
            }
        }
        int n7 = n6;
        if (!this.d.isFinished()) {
            n7 = n6;
            if (kgj.e(n) > 0.0f) {
                final EdgeEffect d3 = this.d;
                final float e3 = kgj.e(n);
                e0e.f((Object)d3, "<this>");
                if (d3 instanceof i5c) {
                    final i5c i5c4 = (i5c)d3;
                    final float b6 = i5c4.b + e3;
                    i5c4.b = b6;
                    if (Math.abs(b6) > i5c4.a) {
                        i5c4.onRelease();
                    }
                }
                else {
                    d3.onRelease();
                }
                n7 = ((n6 || this.d.isFinished()) ? 1 : 0);
            }
        }
        int n8 = b ? 1 : 0;
        if (n7 == 0) {
            if (n3 != 0) {
                n8 = (b ? 1 : 0);
            }
            else {
                n8 = 0;
            }
        }
        if (n8 != 0) {
            this.l();
        }
    }
    
    public final Object b(long i, final mp6<? super crw> mp6) {
        if (aeq.e(this.o)) {
            Objects.requireNonNull(crw.Companion);
            return new crw(crw.b);
        }
        final float b = crw.b(i);
        final int n = 0;
        final float n2 = 0.0f;
        float n3 = 0.0f;
        Label_0299: {
            if (b > 0.0f) {
                final EdgeEffect e = this.e;
                e0e.f((Object)e, "<this>");
                final int sdk_INT = Build$VERSION.SDK_INT;
                float b2;
                if (sdk_INT >= 31) {
                    b2 = le0.a.b(e);
                }
                else {
                    b2 = 0.0f;
                }
                if (b2 != 0.0f) {
                    final EdgeEffect e2 = this.e;
                    final int b3 = jb2.B0(crw.b(i));
                    e0e.f((Object)e2, "<this>");
                    if (sdk_INT >= 31) {
                        e2.onAbsorb(b3);
                    }
                    else if (e2.isFinished()) {
                        e2.onAbsorb(b3);
                    }
                    n3 = crw.b(i);
                    break Label_0299;
                }
            }
            if (crw.b(i) < 0.0f) {
                final EdgeEffect f = this.f;
                e0e.f((Object)f, "<this>");
                final int sdk_INT2 = Build$VERSION.SDK_INT;
                float b4;
                if (sdk_INT2 >= 31) {
                    b4 = le0.a.b(f);
                }
                else {
                    b4 = 0.0f;
                }
                if (b4 != 0.0f) {
                    final EdgeEffect f2 = this.f;
                    final int n4 = -jb2.B0(crw.b(i));
                    e0e.f((Object)f2, "<this>");
                    if (sdk_INT2 >= 31) {
                        f2.onAbsorb(n4);
                    }
                    else if (f2.isFinished()) {
                        f2.onAbsorb(n4);
                    }
                    n3 = crw.b(i);
                    break Label_0299;
                }
            }
            n3 = 0.0f;
        }
        float n5 = 0.0f;
        Label_0573: {
            if (crw.c(i) > 0.0f) {
                final EdgeEffect c = this.c;
                e0e.f((Object)c, "<this>");
                final int sdk_INT3 = Build$VERSION.SDK_INT;
                float b5;
                if (sdk_INT3 >= 31) {
                    b5 = le0.a.b(c);
                }
                else {
                    b5 = 0.0f;
                }
                if (b5 != 0.0f) {
                    final EdgeEffect c2 = this.c;
                    final int b6 = jb2.B0(crw.c(i));
                    e0e.f((Object)c2, "<this>");
                    if (sdk_INT3 >= 31) {
                        c2.onAbsorb(b6);
                    }
                    else if (c2.isFinished()) {
                        c2.onAbsorb(b6);
                    }
                    n5 = crw.c(i);
                    break Label_0573;
                }
            }
            n5 = n2;
            if (crw.c(i) < 0.0f) {
                final EdgeEffect d = this.d;
                e0e.f((Object)d, "<this>");
                final int sdk_INT4 = Build$VERSION.SDK_INT;
                float b7;
                if (sdk_INT4 >= 31) {
                    b7 = le0.a.b(d);
                }
                else {
                    b7 = 0.0f;
                }
                final boolean b8 = b7 == 0.0f;
                n5 = n2;
                if (!b8) {
                    final EdgeEffect d2 = this.d;
                    final int n6 = -jb2.B0(crw.c(i));
                    e0e.f((Object)d2, "<this>");
                    if (sdk_INT4 >= 31) {
                        d2.onAbsorb(n6);
                    }
                    else if (d2.isFinished()) {
                        d2.onAbsorb(n6);
                    }
                    n5 = crw.c(i);
                }
            }
        }
        i = zzz.i(n3, n5);
        Objects.requireNonNull(crw.Companion);
        int n7 = n;
        if (i == crw.b) {
            n7 = 1;
        }
        if (n7 == 0) {
            this.l();
        }
        return new crw(i);
    }
    
    public final boolean c() {
        final List<EdgeEffect> g = this.g;
        final int size = g.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final EdgeEffect edgeEffect = g.get(n);
            e0e.f((Object)edgeEffect, "<this>");
            float b3;
            if (Build$VERSION.SDK_INT >= 31) {
                b3 = le0.a.b(edgeEffect);
            }
            else {
                b3 = 0.0f;
            }
            if (b3 == 0.0f ^ true) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final Object d(final long n, final mp6<? super vzv> mp6) {
        if (aeq.e(this.o)) {
            return vzv.a;
        }
        boolean b = false;
        this.n = false;
        if (crw.b(n) > 0.0f) {
            final EdgeEffect e = this.e;
            final int b2 = jb2.B0(crw.b(n));
            e0e.f((Object)e, "<this>");
            if (Build$VERSION.SDK_INT >= 31) {
                e.onAbsorb(b2);
            }
            else if (e.isFinished()) {
                e.onAbsorb(b2);
            }
        }
        else if (crw.b(n) < 0.0f) {
            final EdgeEffect f = this.f;
            final int n2 = -jb2.B0(crw.b(n));
            e0e.f((Object)f, "<this>");
            if (Build$VERSION.SDK_INT >= 31) {
                f.onAbsorb(n2);
            }
            else if (f.isFinished()) {
                f.onAbsorb(n2);
            }
        }
        if (crw.c(n) > 0.0f) {
            final EdgeEffect c = this.c;
            final int b3 = jb2.B0(crw.c(n));
            e0e.f((Object)c, "<this>");
            if (Build$VERSION.SDK_INT >= 31) {
                c.onAbsorb(b3);
            }
            else if (c.isFinished()) {
                c.onAbsorb(b3);
            }
        }
        else if (crw.c(n) < 0.0f) {
            final EdgeEffect d = this.d;
            final int n3 = -jb2.B0(crw.c(n));
            e0e.f((Object)d, "<this>");
            if (Build$VERSION.SDK_INT >= 31) {
                d.onAbsorb(n3);
            }
            else if (d.isFinished()) {
                d.onAbsorb(n3);
            }
        }
        Objects.requireNonNull(crw.Companion);
        if (n == crw.b) {
            b = true;
        }
        if (!b) {
            this.l();
        }
        this.g();
        return vzv.a;
    }
    
    public final long e(long e) {
        if (aeq.e(this.o)) {
            Objects.requireNonNull(kgj.Companion);
            return kgj.b;
        }
        final boolean n = this.n;
        float n2 = 0.0f;
        final int n3 = 0;
        final int n4 = 0;
        if (!n) {
            final long c = jty.C(this.o);
            if (lp7.B(this.e) != 0.0f) {
                Objects.requireNonNull(kgj.Companion);
                this.n(kgj.b, c);
            }
            if (lp7.B(this.f) != 0.0f) {
                Objects.requireNonNull(kgj.Companion);
                this.o(kgj.b, c);
            }
            if (lp7.B(this.c) != 0.0f) {
                Objects.requireNonNull(kgj.Companion);
                this.p(kgj.b, c);
            }
            if (lp7.B(this.d) != 0.0f) {
                Objects.requireNonNull(kgj.Companion);
                this.m(kgj.b, c);
            }
            this.n = true;
        }
        final kgj b = this.b;
        long n5;
        if (b != null) {
            n5 = b.a;
        }
        else {
            n5 = jty.C(this.o);
        }
        float n6 = 0.0f;
        Label_0439: {
            if (kgj.e(e) != 0.0f) {
                if (lp7.B(this.c) != 0.0f) {
                    final float p = this.p(e, n5);
                    final boolean b2 = lp7.B(this.c) == 0.0f;
                    n6 = p;
                    if (b2) {
                        this.c.onRelease();
                        n6 = p;
                    }
                    break Label_0439;
                }
                else if (lp7.B(this.d) != 0.0f) {
                    final float m = this.m(e, n5);
                    final boolean b3 = lp7.B(this.d) == 0.0f;
                    n6 = m;
                    if (b3) {
                        this.d.onRelease();
                        n6 = m;
                    }
                    break Label_0439;
                }
            }
            n6 = 0.0f;
        }
        if (kgj.d(e) != 0.0f) {
            if (lp7.B(this.e) != 0.0f) {
                final float n7 = this.n(e, n5);
                int n8 = n4;
                if (lp7.B(this.e) == 0.0f) {
                    n8 = 1;
                }
                n2 = n7;
                if (n8 != 0) {
                    this.e.onRelease();
                    n2 = n7;
                }
            }
            else if (lp7.B(this.f) != 0.0f) {
                final float o = this.o(e, n5);
                int n9 = n3;
                if (lp7.B(this.f) == 0.0f) {
                    n9 = 1;
                }
                n2 = o;
                if (n9 != 0) {
                    this.f.onRelease();
                    n2 = o;
                }
            }
        }
        e = kqe.e(n2, n6);
        Objects.requireNonNull(kgj.Companion);
        if (!kgj.b(e, kgj.b)) {
            this.l();
        }
        return e;
    }
    
    public final dlh f() {
        return this.t;
    }
    
    public final void g() {
        final List<EdgeEffect> g = this.g;
        final int size = g.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final EdgeEffect edgeEffect = g.get(i);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && n == 0) {
                n = 0;
            }
            else {
                n = 1;
            }
            ++i;
        }
        if (n != 0) {
            this.l();
        }
    }
    
    public final boolean h(final wd9 wd9, final EdgeEffect edgeEffect, final Canvas canvas) {
        final int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-aeq.d(this.o), -aeq.b(this.o) + ((rp8)wd9).t0(this.a.b.a()));
        final boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
    
    public final boolean i(final wd9 wd9, final EdgeEffect edgeEffect, final Canvas canvas) {
        final int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-aeq.b(this.o), ((rp8)wd9).t0(this.a.b.b(wd9.getLayoutDirection())));
        final boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
    
    public final boolean isEnabled() {
        return ((cjq<Boolean>)this.p).getValue();
    }
    
    public final boolean j(final wd9 wd9, final EdgeEffect edgeEffect, final Canvas canvas) {
        final int save = canvas.save();
        final int b0 = jb2.B0(aeq.d(this.o));
        final float c = this.a.b.c(wd9.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, ((rp8)wd9).t0(c) + -(float)b0);
        final boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
    
    public final boolean k(final wd9 wd9, final EdgeEffect edgeEffect, final Canvas canvas) {
        final int save = canvas.save();
        canvas.translate(0.0f, ((rp8)wd9).t0(this.a.b.d()));
        final boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
    
    public final void l() {
        if (this.m) {
            ((cjq<vzv>)this.l).setValue(vzv.a);
        }
    }
    
    public final float m(final long n, final long n2) {
        final float n3 = kgj.d(n2) / aeq.d(this.o);
        final float n4 = kgj.e(n) / aeq.b(this.o);
        final EdgeEffect d = this.d;
        float c = -n4;
        final float n5 = 1 - n3;
        e0e.f((Object)d, "<this>");
        if (Build$VERSION.SDK_INT >= 31) {
            c = le0.a.c(d, c, n5);
        }
        else {
            d.onPull(c, n5);
        }
        return aeq.b(this.o) * -c;
    }
    
    public final float n(final long n, final long n2) {
        final float n3 = kgj.e(n2) / aeq.b(this.o);
        float c = kgj.d(n) / aeq.d(this.o);
        final EdgeEffect e = this.e;
        final float n4 = 1 - n3;
        e0e.f((Object)e, "<this>");
        if (Build$VERSION.SDK_INT >= 31) {
            c = le0.a.c(e, c, n4);
        }
        else {
            e.onPull(c, n4);
        }
        return aeq.d(this.o) * c;
    }
    
    public final float o(final long n, final long n2) {
        final float n3 = kgj.e(n2) / aeq.b(this.o);
        final float n4 = kgj.d(n) / aeq.d(this.o);
        final EdgeEffect f = this.f;
        float c = -n4;
        e0e.f((Object)f, "<this>");
        if (Build$VERSION.SDK_INT >= 31) {
            c = le0.a.c(f, c, n3);
        }
        else {
            f.onPull(c, n3);
        }
        return aeq.d(this.o) * -c;
    }
    
    public final float p(final long n, final long n2) {
        final float n3 = kgj.d(n2) / aeq.d(this.o);
        float c = kgj.e(n) / aeq.b(this.o);
        final EdgeEffect c2 = this.c;
        e0e.f((Object)c2, "<this>");
        if (Build$VERSION.SDK_INT >= 31) {
            c = le0.a.c(c2, c, n3);
        }
        else {
            c2.onPull(c, n3);
        }
        return aeq.b(this.o) * c;
    }
    
    public final void setEnabled(final boolean q) {
        final boolean b = this.q != q;
        ((cjq<Boolean>)this.p).setValue(Boolean.valueOf(q));
        this.q = q;
        if (b) {
            this.n = false;
            this.g();
        }
    }
}
