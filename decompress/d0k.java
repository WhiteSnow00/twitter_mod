import java.util.Collection;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d0k extends fow
{
    public wq2 b;
    public float c;
    public List<? extends m0k> d;
    public float e;
    public float f;
    public wq2 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public fmr q;
    public final f50 r;
    public final f50 s;
    public final nxe t;
    public final o0k u;
    
    public d0k() {
        this.c = 1.0f;
        final int a = hqw.a;
        this.d = (List<? extends m0k>)h3a.F0;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        this.p = true;
        this.r = (f50)shw.m();
        this.s = (f50)shw.m();
        this.t = jty.M(3, (ptb)d0k$a.F0);
        this.u = new o0k();
    }
    
    public final void a(final wd9 wd9) {
        e0e.f((Object)wd9, "<this>");
        if (this.n) {
            this.u.a.clear();
            this.r.b();
            final o0k u = this.u;
            final List<? extends m0k> d = this.d;
            Objects.requireNonNull(u);
            e0e.f((Object)d, "nodes");
            u.a.addAll(d);
            u.c((c0k)this.r);
            this.f();
        }
        else if (this.p) {
            this.f();
        }
        this.n = false;
        this.p = false;
        final wq2 b = this.b;
        if (b != null) {
            vd9.g(wd9, (c0k)this.s, b, this.c, null, null, 0, 56, null);
        }
        final wq2 g = this.g;
        if (g != null) {
            final fmr q = this.q;
            fmr q2;
            if (this.o || (q2 = q) == null) {
                q2 = new fmr(this.f, this.j, this.h, this.i, 16);
                this.q = q2;
                this.o = false;
            }
            vd9.g(wd9, (c0k)this.s, g, this.e, q2, null, 0, 48, null);
        }
    }
    
    public final k0k e() {
        return (k0k)this.t.getValue();
    }
    
    public final void f() {
        this.s.b();
        final float k = this.k;
        final int n = 1;
        if (k == 0.0f) {
            int n2;
            if (this.l == 1.0f) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                b0k.a((c0k)this.s, (c0k)this.r, 0L, 2, (Object)null);
                return;
            }
        }
        this.e().b((c0k)this.r);
        final float length = this.e().getLength();
        final float i = this.k;
        final float m = this.m;
        final float n3 = (i + m) % 1.0f * length;
        final float n4 = (this.l + m) % 1.0f * length;
        if (n3 > n4) {
            this.e().a(n3, length, (c0k)this.s);
            this.e().a(0.0f, n4, (c0k)this.s);
        }
        else {
            this.e().a(n3, n4, (c0k)this.s);
        }
    }
    
    public final String toString() {
        return this.r.toString();
    }
}
