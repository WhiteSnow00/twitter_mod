import java.text.BreakIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lq1<T extends lq1<T>>
{
    public static final a Companion;
    public final xc0 a;
    public final long b;
    public final qjs c;
    public final ngj d;
    public final yjs e;
    public long f;
    public xc0 g;
    
    static {
        Companion = new a();
    }
    
    public lq1(final xc0 xc0, final long n, final qjs c, final ngj d, final yjs e) {
        this.a = xc0;
        this.b = n;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = n;
        this.g = xc0;
    }
    
    public final T A() {
        if (this.g.F0.length() > 0) {
            final long b = this.b;
            final zjs.a companion = zjs.Companion;
            this.f = p4j.f((int)(b >> 32), zjs.d(this.f));
        }
        return (T)this;
    }
    
    public final void B(final int n) {
        this.f = p4j.f(n, n);
    }
    
    public final int C() {
        return this.d.b(zjs.d(this.f));
    }
    
    public final Integer a() {
        final qjs c = this.c;
        Integer value;
        if (c != null) {
            value = this.d.a(c.e(c.f(this.d.b(zjs.f(this.f))), true));
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final Integer b() {
        final qjs c = this.c;
        Integer value;
        if (c != null) {
            value = this.d.a(c.j(c.f(this.d.b(zjs.g(this.f)))));
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final int c() {
        final String f0 = this.g.F0;
        final int d = zjs.d(this.f);
        e0e.f((Object)f0, "<this>");
        final BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(f0);
        return characterInstance.following(d);
    }
    
    public final int d(final qjs qjs, int n) {
        if (n >= this.a.length()) {
            return this.a.length();
        }
        int n2 = this.g.F0.length() - 1;
        if (n <= n2) {
            n2 = n;
        }
        final long n3 = qjs.n(n2);
        if (zjs.d(n3) <= n) {
            n = this.d(qjs, n + 1);
        }
        else {
            n = this.d.a(zjs.d(n3));
        }
        return n;
    }
    
    public final int e() {
        final String f0 = this.g.F0;
        final int d = zjs.d(this.f);
        e0e.f((Object)f0, "<this>");
        final BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(f0);
        return characterInstance.preceding(d);
    }
    
    public final int f(final qjs qjs, int n) {
        if (n < 0) {
            return 0;
        }
        int n2 = this.g.F0.length() - 1;
        if (n <= n2) {
            n2 = n;
        }
        final int n3 = (int)(qjs.n(n2) >> 32);
        if (n3 >= n) {
            n = this.f(qjs, n - 1);
        }
        else {
            n = this.d.a(n3);
        }
        return n;
    }
    
    public final boolean g() {
        final qjs c = this.c;
        frm m;
        if (c != null) {
            m = c.m(zjs.d(this.f));
        }
        else {
            m = null;
        }
        return m != frm.G0;
    }
    
    public final int h(final qjs qjs, int l) {
        final int c = this.C();
        final yjs e = this.e;
        if (e.a == null) {
            e.a = qjs.c(c).a;
        }
        l += qjs.f(c);
        if (l < 0) {
            return 0;
        }
        if (l >= qjs.b.f) {
            return this.g.F0.length();
        }
        final float d = qjs.d(l);
        final float n = 1;
        final Float a = this.e.a;
        e0e.c((Object)a);
        final float floatValue = a.floatValue();
        if ((this.g() && floatValue >= qjs.i(l)) || (!this.g() && floatValue <= qjs.h(l))) {
            return qjs.e(l, true);
        }
        l = qjs.l(kqe.e(a.floatValue(), d - n));
        return this.d.a(l);
    }
    
    public final T i() {
        if (this.g.F0.length() > 0) {
            final qjs c = this.c;
            if (c != null) {
                this.B(this.h(c, 1));
            }
        }
        return (T)this;
    }
    
    public final T j() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            if (this.g()) {
                this.o();
            }
            else {
                this.l();
            }
        }
        return (T)this;
    }
    
    public final T k() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            if (this.g()) {
                this.q();
            }
            else {
                this.n();
            }
        }
        return (T)this;
    }
    
    public final T l() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            final int c = this.c();
            if (c != -1) {
                this.B(c);
            }
        }
        return (T)this;
    }
    
    public final T m() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            this.B(tkr.f(this.g.F0, zjs.f(this.f)));
        }
        return (T)this;
    }
    
    public final T n() {
        final yjs e = this.e;
        Number value = null;
        e.a = null;
        if (this.g.F0.length() > 0) {
            final qjs c = this.c;
            if (c != null) {
                value = this.d(c, this.C());
            }
            if (value != null) {
                this.B(value.intValue());
            }
        }
        return (T)this;
    }
    
    public final T o() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            final int e = this.e();
            if (e != -1) {
                this.B(e);
            }
        }
        return (T)this;
    }
    
    public final T p() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            this.B(tkr.g(this.g.F0, zjs.g(this.f)));
        }
        return (T)this;
    }
    
    public final T q() {
        final yjs e = this.e;
        Number value = null;
        e.a = null;
        if (this.g.F0.length() > 0) {
            final qjs c = this.c;
            if (c != null) {
                value = this.f(c, this.C());
            }
            if (value != null) {
                this.B(value.intValue());
            }
        }
        return (T)this;
    }
    
    public final T r() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            if (this.g()) {
                this.l();
            }
            else {
                this.o();
            }
        }
        return (T)this;
    }
    
    public final T s() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            if (this.g()) {
                this.n();
            }
            else {
                this.q();
            }
        }
        return (T)this;
    }
    
    public final T t() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            this.B(this.g.F0.length());
        }
        return (T)this;
    }
    
    public final T u() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            this.B(0);
        }
        return (T)this;
    }
    
    public final T v() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            final Integer a = this.a();
            if (a != null) {
                this.B(a.intValue());
            }
        }
        return (T)this;
    }
    
    public final T w() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            if (this.g()) {
                this.y();
            }
            else {
                this.v();
            }
        }
        return (T)this;
    }
    
    public final T x() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            if (this.g()) {
                this.v();
            }
            else {
                this.y();
            }
        }
        return (T)this;
    }
    
    public final T y() {
        this.e.a = null;
        if (this.g.F0.length() > 0) {
            final Integer b = this.b();
            if (b != null) {
                this.B(b.intValue());
            }
        }
        return (T)this;
    }
    
    public final T z() {
        if (this.g.F0.length() > 0) {
            final qjs c = this.c;
            if (c != null) {
                this.B(this.h(c, -1));
            }
        }
        return (T)this;
    }
    
    public static final class a
    {
    }
}
