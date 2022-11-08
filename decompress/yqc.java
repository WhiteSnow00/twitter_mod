// 
// Decompiled by Procyon v0.6.0
// 

public final class yqc extends aox
{
    public static int[] k;
    
    static {
        yqc.k = new int[2];
    }
    
    public yqc(final hj6 hj6) {
        super(hj6);
        super.h.e = 4;
        super.i.e = 5;
        super.f = 0;
    }
    
    public final void a(final hp8 hp8) {
        final hj6$a e0 = hj6$a.E0;
        if (nb0.D(super.j) != 3) {
            final hx8 e2 = super.e;
            Label_1463: {
                if (!((lp8)e2).j && super.d == e0) {
                    final hj6 b = super.b;
                    final int r = b.r;
                    if (r != 2) {
                        if (r == 3) {
                            final int s = b.s;
                            if (s != 0 && s != 3) {
                                final int z = b.Z;
                                int n2 = 0;
                                Label_0187: {
                                    float n = 0.0f;
                                    Label_0179: {
                                        float n3;
                                        float n4;
                                        if (z != -1) {
                                            if (z == 0) {
                                                n = ((lp8)((aox)b.e).e).g / b.Y;
                                                break Label_0179;
                                            }
                                            if (z != 1) {
                                                n2 = 0;
                                                break Label_0187;
                                            }
                                            n3 = (float)((lp8)((aox)b.e).e).g;
                                            n4 = b.Y;
                                        }
                                        else {
                                            n3 = (float)((lp8)((aox)b.e).e).g;
                                            n4 = b.Y;
                                        }
                                        n = n3 * n4;
                                    }
                                    n2 = (int)(n + 0.5f);
                                }
                                e2.d(n2);
                            }
                            else {
                                final btw e3 = b.e;
                                final lp8 h = ((aox)e3).h;
                                final lp8 i = ((aox)e3).i;
                                final boolean b2 = b.J.f != null;
                                final boolean b3 = b.K.f != null;
                                final boolean b4 = b.L.f != null;
                                final boolean b5 = b.M.f != null;
                                final int z2 = b.Z;
                                if (b2 && b3 && b4 && b5) {
                                    final float y = b.Y;
                                    if (h.j && i.j) {
                                        final lp8 h2 = super.h;
                                        if (h2.c) {
                                            if (super.i.c) {
                                                final int g = h2.l.get(0).g;
                                                final int f = super.h.f;
                                                final int g2 = super.i.l.get(0).g;
                                                final int f2 = super.i.f;
                                                final int g3 = h.g;
                                                final int f3 = h.f;
                                                final int g4 = i.g;
                                                final int f4 = i.f;
                                                final int[] k = yqc.k;
                                                this.m(k, g + f, g2 - f2, g3 + f3, g4 - f4, y, z2);
                                                super.e.d(k[0]);
                                                ((aox)super.b.e).e.d(k[1]);
                                            }
                                        }
                                        return;
                                    }
                                    final lp8 h3 = super.h;
                                    if (h3.j) {
                                        final lp8 j = super.i;
                                        if (j.j) {
                                            if (!h.c || !i.c) {
                                                return;
                                            }
                                            final int g5 = h3.g;
                                            final int f5 = h3.f;
                                            final int g6 = j.g;
                                            final int f6 = j.f;
                                            final int g7 = h.l.get(0).g;
                                            final int f7 = h.f;
                                            final int g8 = i.l.get(0).g;
                                            final int f8 = i.f;
                                            final int[] l = yqc.k;
                                            this.m(l, g5 + f5, g6 - f6, g7 + f7, g8 - f8, y, z2);
                                            super.e.d(l[0]);
                                            ((aox)super.b.e).e.d(l[1]);
                                        }
                                    }
                                    final lp8 h4 = super.h;
                                    if (!h4.c || !super.i.c || !h.c || !i.c) {
                                        return;
                                    }
                                    final int g9 = h4.l.get(0).g;
                                    final int f9 = super.h.f;
                                    final int g10 = super.i.l.get(0).g;
                                    final int f10 = super.i.f;
                                    final int g11 = h.l.get(0).g;
                                    final int f11 = h.f;
                                    final int g12 = i.l.get(0).g;
                                    final int f12 = i.f;
                                    final int[] m = yqc.k;
                                    this.m(m, g9 + f9, g10 - f10, g11 + f11, g12 - f12, y, z2);
                                    super.e.d(m[0]);
                                    ((aox)super.b.e).e.d(m[1]);
                                }
                                else if (b2 && b4) {
                                    final lp8 h5 = super.h;
                                    if (!h5.c || !super.i.c) {
                                        return;
                                    }
                                    final float y2 = b.Y;
                                    final int n5 = h5.l.get(0).g + super.h.f;
                                    final int n6 = super.i.l.get(0).g - super.i.f;
                                    if (z2 != -1 && z2 != 0) {
                                        if (z2 == 1) {
                                            int g13 = this.g(n6 - n5, 0);
                                            final int n7 = (int)(g13 / y2 + 0.5f);
                                            final int g14 = this.g(n7, 1);
                                            if (n7 != g14) {
                                                g13 = (int)(g14 * y2 + 0.5f);
                                            }
                                            super.e.d(g13);
                                            ((aox)super.b.e).e.d(g14);
                                        }
                                    }
                                    else {
                                        int g15 = this.g(n6 - n5, 0);
                                        final int n8 = (int)(g15 * y2 + 0.5f);
                                        final int g16 = this.g(n8, 1);
                                        if (n8 != g16) {
                                            g15 = (int)(g16 / y2 + 0.5f);
                                        }
                                        super.e.d(g15);
                                        ((aox)super.b.e).e.d(g16);
                                    }
                                }
                                else if (b3 && b5) {
                                    if (!h.c || !i.c) {
                                        return;
                                    }
                                    final float y3 = b.Y;
                                    final int n9 = h.l.get(0).g + h.f;
                                    final int n10 = i.l.get(0).g - i.f;
                                    if (z2 != -1) {
                                        if (z2 == 0) {
                                            int g17 = this.g(n10 - n9, 1);
                                            final int n11 = (int)(g17 * y3 + 0.5f);
                                            final int g18 = this.g(n11, 0);
                                            if (n11 != g18) {
                                                g17 = (int)(g18 / y3 + 0.5f);
                                            }
                                            super.e.d(g18);
                                            ((aox)super.b.e).e.d(g17);
                                            break Label_1463;
                                        }
                                        if (z2 != 1) {
                                            break Label_1463;
                                        }
                                    }
                                    int g19 = this.g(n10 - n9, 1);
                                    final int n12 = (int)(g19 / y3 + 0.5f);
                                    final int g20 = this.g(n12, 0);
                                    if (n12 != g20) {
                                        g19 = (int)(g20 * y3 + 0.5f);
                                    }
                                    super.e.d(g20);
                                    ((aox)super.b.e).e.d(g19);
                                }
                            }
                        }
                    }
                    else {
                        final hj6 v = b.V;
                        if (v != null) {
                            final hx8 e4 = v.d.e;
                            if (((lp8)e4).j) {
                                e2.d((int)(((lp8)e4).g * b.w + 0.5f));
                            }
                        }
                    }
                }
            }
            final lp8 h6 = super.h;
            if (h6.c) {
                final lp8 i2 = super.i;
                if (i2.c) {
                    if (h6.j && i2.j && ((lp8)super.e).j) {
                        return;
                    }
                    if (!((lp8)super.e).j && super.d == e0) {
                        final hj6 b6 = super.b;
                        if (b6.r == 0 && !b6.E()) {
                            final lp8 lp8 = super.h.l.get(0);
                            final lp8 lp9 = super.i.l.get(0);
                            final int g21 = lp8.g;
                            final lp8 h7 = super.h;
                            final int n13 = g21 + h7.f;
                            final int n14 = lp9.g + super.i.f;
                            h7.d(n13);
                            super.i.d(n14);
                            super.e.d(n14 - n13);
                            return;
                        }
                    }
                    if (!((lp8)super.e).j && super.d == e0 && super.a == 1 && super.h.l.size() > 0 && super.i.l.size() > 0) {
                        final int min = Math.min(super.i.l.get(0).g + super.i.f - (super.h.l.get(0).g + super.h.f), super.e.m);
                        final hj6 b7 = super.b;
                        final int v2 = b7.v;
                        int n15 = Math.max(b7.u, min);
                        if (v2 > 0) {
                            n15 = Math.min(v2, n15);
                        }
                        super.e.d(n15);
                    }
                    if (!((lp8)super.e).j) {
                        return;
                    }
                    final lp8 lp10 = super.h.l.get(0);
                    final lp8 lp11 = super.i.l.get(0);
                    int g22 = lp10.g;
                    final lp8 h8 = super.h;
                    final int f13 = h8.f;
                    int g23 = lp11.g;
                    final int f14 = super.i.f;
                    float f15 = super.b.f0;
                    if (lp10 == lp11) {
                        f15 = 0.5f;
                    }
                    else {
                        g22 += f13;
                        g23 += f14;
                    }
                    h8.d((int)((g23 - g22 - ((lp8)super.e).g) * f15 + (g22 + 0.5f)));
                    super.i.d(super.h.g + ((lp8)super.e).g);
                }
            }
            return;
        }
        final hj6 b8 = super.b;
        this.l(b8.J, b8.L, 0);
    }
    
    public final void d() {
        final hj6$a e0 = hj6$a.E0;
        final hj6$a f0 = hj6$a.F0;
        final hj6$a c0 = hj6$a.C0;
        final hj6 b = super.b;
        if (b.a) {
            super.e.d(b.x());
        }
        final hx8 e2 = super.e;
        if (!((lp8)e2).j) {
            final hj6 b2 = super.b;
            final hj6$a d = b2.U[0];
            if ((super.d = d) != e0) {
                if (d == f0) {
                    final hj6 v = b2.V;
                    if (v != null) {
                        final hj6$a[] u = v.U;
                        if (u[0] == c0 || u[0] == f0) {
                            final int x = v.x();
                            final int e3 = super.b.J.e();
                            final int e4 = super.b.L.e();
                            this.b(super.h, v.d.h, super.b.J.e());
                            this.b(super.i, v.d.i, -super.b.L.e());
                            super.e.d(x - e3 - e4);
                            return;
                        }
                    }
                }
                if (d == c0) {
                    e2.d(b2.x());
                }
            }
        }
        else if (super.d == f0) {
            final hj6 b3 = super.b;
            final hj6 v2 = b3.V;
            if (v2 != null) {
                final hj6$a[] u2 = v2.U;
                if (u2[0] == c0 || u2[0] == f0) {
                    this.b(super.h, v2.d.h, b3.J.e());
                    this.b(super.i, v2.d.i, -super.b.L.e());
                    return;
                }
            }
        }
        final hx8 e5 = super.e;
        if (((lp8)e5).j) {
            final hj6 b4 = super.b;
            if (b4.a) {
                final yi6[] r = b4.R;
                if (r[0].f != null && r[1].f != null) {
                    if (b4.E()) {
                        super.h.f = super.b.R[0].e();
                        super.i.f = -super.b.R[1].e();
                        return;
                    }
                    final lp8 h = this.h(super.b.R[0]);
                    if (h != null) {
                        this.b(super.h, h, super.b.R[0].e());
                    }
                    final lp8 h2 = this.h(super.b.R[1]);
                    if (h2 != null) {
                        this.b(super.i, h2, -super.b.R[1].e());
                    }
                    super.h.b = true;
                    super.i.b = true;
                    return;
                }
                else if (r[0].f != null) {
                    final lp8 h3 = this.h(r[0]);
                    if (h3 != null) {
                        this.b(super.h, h3, super.b.R[0].e());
                        this.b(super.i, super.h, ((lp8)super.e).g);
                    }
                    return;
                }
                else if (r[1].f != null) {
                    final lp8 h4 = this.h(r[1]);
                    if (h4 != null) {
                        this.b(super.i, h4, -super.b.R[1].e());
                        this.b(super.h, super.i, -((lp8)super.e).g);
                    }
                    return;
                }
                else {
                    if (!(b4 instanceof xjc) && b4.V != null && b4.n(yi6$a.H0).f == null) {
                        final hj6 b5 = super.b;
                        this.b(super.h, b5.V.d.h, b5.y());
                        this.b(super.i, super.h, ((lp8)super.e).g);
                    }
                    return;
                }
            }
        }
        if (super.d == e0) {
            final hj6 b6 = super.b;
            final int r2 = b6.r;
            if (r2 != 2) {
                if (r2 == 3) {
                    if (b6.s == 3) {
                        super.h.a = this;
                        super.i.a = this;
                        final btw e6 = b6.e;
                        ((aox)e6).h.a = this;
                        ((aox)e6).i.a = this;
                        ((lp8)e5).a = this;
                        if (b6.F()) {
                            ((lp8)super.e).l.add(((aox)super.b.e).e);
                            ((lp8)((aox)super.b.e).e).k.add(super.e);
                            final btw e7 = super.b.e;
                            ((lp8)((aox)e7).e).a = this;
                            ((lp8)super.e).l.add(((aox)e7).h);
                            ((lp8)super.e).l.add(((aox)super.b.e).i);
                            ((aox)super.b.e).h.k.add(super.e);
                            ((aox)super.b.e).i.k.add(super.e);
                        }
                        else if (super.b.E()) {
                            ((lp8)((aox)super.b.e).e).l.add(super.e);
                            ((lp8)super.e).k.add(((aox)super.b.e).e);
                        }
                        else {
                            ((lp8)((aox)super.b.e).e).l.add(super.e);
                        }
                    }
                    else {
                        final hx8 e8 = ((aox)b6.e).e;
                        ((lp8)e5).l.add(e8);
                        ((lp8)e8).k.add(super.e);
                        ((aox)super.b.e).h.k.add(super.e);
                        ((aox)super.b.e).i.k.add(super.e);
                        final hx8 e9 = super.e;
                        ((lp8)e9).b = true;
                        ((lp8)e9).k.add(super.h);
                        ((lp8)super.e).k.add(super.i);
                        super.h.l.add(super.e);
                        super.i.l.add(super.e);
                    }
                }
            }
            else {
                final hj6 v3 = b6.V;
                if (v3 != null) {
                    final hx8 e10 = ((aox)v3.e).e;
                    ((lp8)e5).l.add(e10);
                    ((lp8)e10).k.add(super.e);
                    final hx8 e11 = super.e;
                    ((lp8)e11).b = true;
                    ((lp8)e11).k.add(super.h);
                    ((lp8)super.e).k.add(super.i);
                }
            }
        }
        final hj6 b7 = super.b;
        final yi6[] r3 = b7.R;
        if (r3[0].f != null && r3[1].f != null) {
            if (b7.E()) {
                super.h.f = super.b.R[0].e();
                super.i.f = -super.b.R[1].e();
            }
            else {
                final lp8 h5 = this.h(super.b.R[0]);
                final lp8 h6 = this.h(super.b.R[1]);
                if (h5 != null) {
                    h5.b((hp8)this);
                }
                if (h6 != null) {
                    h6.b((hp8)this);
                }
                super.j = 4;
            }
        }
        else if (r3[0].f != null) {
            final lp8 h7 = this.h(r3[0]);
            if (h7 != null) {
                this.b(super.h, h7, super.b.R[0].e());
                this.c(super.i, super.h, 1, super.e);
            }
        }
        else if (r3[1].f != null) {
            final lp8 h8 = this.h(r3[1]);
            if (h8 != null) {
                this.b(super.i, h8, -super.b.R[1].e());
                this.c(super.h, super.i, -1, super.e);
            }
        }
        else if (!(b7 instanceof xjc)) {
            final hj6 v4 = b7.V;
            if (v4 != null) {
                this.b(super.h, v4.d.h, b7.y());
                this.c(super.i, super.h, 1, super.e);
            }
        }
    }
    
    public final void e() {
        final lp8 h = super.h;
        if (h.j) {
            super.b.a0 = h.g;
        }
    }
    
    public final void f() {
        super.c = null;
        super.h.c();
        super.i.c();
        ((lp8)super.e).c();
        super.g = false;
    }
    
    public final boolean k() {
        return super.d != hj6$a.E0 || super.b.r == 0;
    }
    
    public final void m(final int[] array, int n, int n2, int n3, int n4, final float n5, final int n6) {
        n = n2 - n;
        n2 = n4 - n3;
        if (n6 != -1) {
            if (n6 != 0) {
                if (n6 == 1) {
                    n2 = (int)(n * n5 + 0.5f);
                    array[0] = n;
                    array[1] = n2;
                }
            }
            else {
                array[0] = (int)(n2 * n5 + 0.5f);
                array[1] = n2;
            }
        }
        else {
            n3 = (int)(n2 * n5 + 0.5f);
            n4 = (int)(n / n5 + 0.5f);
            if (n3 <= n) {
                array[0] = n3;
                array[1] = n2;
            }
            else if (n4 <= n2) {
                array[0] = n;
                array[1] = n4;
            }
        }
    }
    
    public final void n() {
        super.g = false;
        super.h.c();
        super.h.j = false;
        super.i.c();
        super.i.j = false;
        ((lp8)super.e).j = false;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("HorizontalRun ");
        g.append(super.b.j0);
        return g.toString();
    }
}
