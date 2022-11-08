import java.util.Collection;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izj extends vmw
{
    public oq2 b;
    public float c;
    public List<? extends rzj> d;
    public float e;
    public float f;
    public oq2 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public pkr q;
    public final h50 r;
    public final h50 s;
    public final gxe t;
    public final tzj u;
    
    public izj() {
        this.c = 1.0f;
        final int a = xow.a;
        this.d = (List<? extends rzj>)v2a.C0;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        this.p = true;
        this.r = (h50)lr0.c();
        this.s = (h50)lr0.c();
        this.t = rp2.y0(3, (otb)izj$a.C0);
        this.u = new tzj();
    }
    
    public final void a(final ld9 ld9) {
        zzd.f((Object)ld9, "<this>");
        if (this.n) {
            this.u.a.clear();
            this.r.c();
            final tzj u = this.u;
            final List<? extends rzj> d = this.d;
            Objects.requireNonNull(u);
            zzd.f((Object)d, "nodes");
            u.a.addAll(d);
            u.c((hzj)this.r);
            this.f();
        }
        else if (this.p) {
            this.f();
        }
        this.n = false;
        this.p = false;
        final oq2 b = this.b;
        if (b != null) {
            kd9.g(ld9, (hzj)this.s, b, this.c, (uau)null, (sr4)null, 0, 56, (Object)null);
        }
        final oq2 g = this.g;
        if (g != null) {
            final pkr q = this.q;
            Object q2;
            if (this.o || (q2 = q) == null) {
                q2 = new pkr(this.f, this.j, this.h, this.i, 16);
                this.q = (pkr)q2;
                this.o = false;
            }
            kd9.g(ld9, (hzj)this.s, g, this.e, (uau)q2, (sr4)null, 0, 48, (Object)null);
        }
    }
    
    public final pzj e() {
        return (pzj)this.t.getValue();
    }
    
    public final void f() {
        this.s.c();
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
                gzj.a((hzj)this.s, (hzj)this.r, 0L, 2, null);
                return;
            }
        }
        this.e().b((hzj)this.r);
        final float length = this.e().getLength();
        final float i = this.k;
        final float m = this.m;
        final float n3 = (i + m) % 1.0f * length;
        final float n4 = (this.l + m) % 1.0f * length;
        if (n3 > n4) {
            this.e().a(n3, length, (hzj)this.s);
            this.e().a(0.0f, n4, (hzj)this.s);
        }
        else {
            this.e().a(n3, n4, (hzj)this.s);
        }
    }
    
    public final String toString() {
        return this.r.toString();
    }
}
