// 
// Decompiled by Procyon v0.6.0
// 

public final class utw extends sox
{
    public to8 k;
    public mr1 l;
    
    public utw(final ni6 ni6) {
        super(ni6);
        final to8 k = new to8((sox)this);
        this.k = k;
        this.l = null;
        super.h.e = 6;
        super.i.e = 7;
        k.e = 8;
        super.f = 1;
    }
    
    public final void a(final po8 po8) {
        final ni6$a f0 = ni6$a.F0;
        if (ib0.E(super.j) != 3) {
            final sw8 e = super.e;
            if (((to8)e).c && !((to8)e).j && super.d == f0) {
                final ni6 b = super.b;
                final int s = b.s;
                if (s != 2) {
                    if (s == 3) {
                        final sw8 e2 = ((sox)b.d).e;
                        if (((to8)e2).j) {
                            final int z = b.Z;
                            int n2 = 0;
                            Label_0177: {
                                float n = 0.0f;
                                Label_0170: {
                                    float n3;
                                    float n4;
                                    if (z != -1) {
                                        if (z == 0) {
                                            n = ((to8)e2).g * b.Y;
                                            break Label_0170;
                                        }
                                        if (z != 1) {
                                            n2 = 0;
                                            break Label_0177;
                                        }
                                        n3 = (float)((to8)e2).g;
                                        n4 = b.Y;
                                    }
                                    else {
                                        n3 = (float)((to8)e2).g;
                                        n4 = b.Y;
                                    }
                                    n = n3 / n4;
                                }
                                n2 = (int)(n + 0.5f);
                            }
                            e.d(n2);
                        }
                    }
                }
                else {
                    final ni6 v = b.V;
                    if (v != null) {
                        final sw8 e3 = v.e.e;
                        if (((to8)e3).j) {
                            e.d((int)(((to8)e3).g * b.z + 0.5f));
                        }
                    }
                }
            }
            final to8 h = super.h;
            if (h.c) {
                final to8 i = super.i;
                if (i.c) {
                    if (h.j && i.j && ((to8)super.e).j) {
                        return;
                    }
                    if (!((to8)super.e).j && super.d == f0) {
                        final ni6 b2 = super.b;
                        if (b2.r == 0 && !b2.F()) {
                            final to8 to8 = super.h.l.get(0);
                            final to8 to9 = super.i.l.get(0);
                            final int g = to8.g;
                            final to8 h2 = super.h;
                            final int n5 = g + h2.f;
                            final int n6 = to9.g + super.i.f;
                            h2.d(n5);
                            super.i.d(n6);
                            super.e.d(n6 - n5);
                            return;
                        }
                    }
                    if (!((to8)super.e).j && super.d == f0 && super.a == 1 && super.h.l.size() > 0 && super.i.l.size() > 0) {
                        final int n7 = super.i.l.get(0).g + super.i.f - (super.h.l.get(0).g + super.h.f);
                        final sw8 e4 = super.e;
                        final int m = e4.m;
                        if (n7 < m) {
                            e4.d(n7);
                        }
                        else {
                            e4.d(m);
                        }
                    }
                    if (!((to8)super.e).j) {
                        return;
                    }
                    if (super.h.l.size() > 0 && super.i.l.size() > 0) {
                        final to8 to10 = super.h.l.get(0);
                        final to8 to11 = super.i.l.get(0);
                        int g2 = to10.g;
                        final to8 h3 = super.h;
                        final int f2 = h3.f;
                        int g3 = to11.g;
                        final int f3 = super.i.f;
                        float g4 = super.b.g0;
                        if (to10 == to11) {
                            g4 = 0.5f;
                        }
                        else {
                            g2 += f2;
                            g3 += f3;
                        }
                        h3.d((int)((g3 - g2 - ((to8)super.e).g) * g4 + (g2 + 0.5f)));
                        super.i.d(super.h.g + ((to8)super.e).g);
                    }
                }
            }
            return;
        }
        final ni6 b3 = super.b;
        this.l(b3.K, b3.M, 1);
    }
    
    public final void d() {
        final ni6$a g0 = ni6$a.G0;
        final ni6$a d0 = ni6$a.D0;
        final ni6$a f0 = ni6$a.F0;
        final ni6 b = super.b;
        if (b.a) {
            super.e.d(b.q());
        }
        if (!((to8)super.e).j) {
            final ni6 b2 = super.b;
            super.d = b2.U[1];
            if (b2.E) {
                this.l = new mr1((sox)this);
            }
            final ni6$a d2 = super.d;
            if (d2 != f0) {
                if (d2 == g0) {
                    final ni6 v = super.b.V;
                    if (v != null && v.U[1] == d0) {
                        final int q = v.q();
                        final int e = super.b.K.e();
                        final int e2 = super.b.M.e();
                        this.b(super.h, v.e.h, super.b.K.e());
                        this.b(super.i, v.e.i, -super.b.M.e());
                        super.e.d(q - e - e2);
                        return;
                    }
                }
                if (d2 == d0) {
                    super.e.d(super.b.q());
                }
            }
        }
        else if (super.d == g0) {
            final ni6 b3 = super.b;
            final ni6 v2 = b3.V;
            if (v2 != null && v2.U[1] == d0) {
                this.b(super.h, v2.e.h, b3.K.e());
                this.b(super.i, v2.e.i, -super.b.M.e());
                return;
            }
        }
        final sw8 e3 = super.e;
        final boolean j = ((to8)e3).j;
        if (j) {
            final ni6 b4 = super.b;
            if (b4.a) {
                final ei6[] r = b4.R;
                if (r[2].f != null && r[3].f != null) {
                    if (b4.F()) {
                        super.h.f = super.b.R[2].e();
                        super.i.f = -super.b.R[3].e();
                    }
                    else {
                        final to8 h = this.h(super.b.R[2]);
                        if (h != null) {
                            this.b(super.h, h, super.b.R[2].e());
                        }
                        final to8 h2 = this.h(super.b.R[3]);
                        if (h2 != null) {
                            this.b(super.i, h2, -super.b.R[3].e());
                        }
                        super.h.b = true;
                        super.i.b = true;
                    }
                    final ni6 b5 = super.b;
                    if (b5.E) {
                        this.b(this.k, super.h, b5.c0);
                    }
                    return;
                }
                else if (r[2].f != null) {
                    final to8 h3 = this.h(r[2]);
                    if (h3 == null) {
                        return;
                    }
                    this.b(super.h, h3, super.b.R[2].e());
                    this.b(super.i, super.h, ((to8)super.e).g);
                    final ni6 b6 = super.b;
                    if (b6.E) {
                        this.b(this.k, super.h, b6.c0);
                    }
                    return;
                }
                else if (r[3].f != null) {
                    final to8 h4 = this.h(r[3]);
                    if (h4 != null) {
                        this.b(super.i, h4, -super.b.R[3].e());
                        this.b(super.h, super.i, -((to8)super.e).g);
                    }
                    final ni6 b7 = super.b;
                    if (b7.E) {
                        this.b(this.k, super.h, b7.c0);
                    }
                    return;
                }
                else if (r[4].f != null) {
                    final to8 h5 = this.h(r[4]);
                    if (h5 != null) {
                        this.b(this.k, h5, 0);
                        this.b(super.h, this.k, -super.b.c0);
                        this.b(super.i, super.h, ((to8)super.e).g);
                    }
                    return;
                }
                else {
                    if (b4 instanceof yic || b4.V == null || b4.n(ei6$a.I0).f != null) {
                        return;
                    }
                    final ni6 b8 = super.b;
                    this.b(super.h, b8.V.e.h, b8.z());
                    this.b(super.i, super.h, ((to8)super.e).g);
                    final ni6 b9 = super.b;
                    if (b9.E) {
                        this.b(this.k, super.h, b9.c0);
                    }
                    return;
                }
            }
        }
        if (!j && super.d == f0) {
            final ni6 b10 = super.b;
            final int s = b10.s;
            if (s != 2) {
                if (s == 3) {
                    if (!b10.F()) {
                        final ni6 b11 = super.b;
                        if (b11.r != 3) {
                            final sw8 e4 = ((sox)b11.d).e;
                            ((to8)super.e).l.add(e4);
                            ((to8)e4).k.add(super.e);
                            final sw8 e5 = super.e;
                            ((to8)e5).b = true;
                            ((to8)e5).k.add(super.h);
                            ((to8)super.e).k.add(super.i);
                        }
                    }
                }
            }
            else {
                final ni6 v3 = b10.V;
                if (v3 != null) {
                    final sw8 e6 = v3.e.e;
                    ((to8)e3).l.add(e6);
                    ((to8)e6).k.add(super.e);
                    final sw8 e7 = super.e;
                    ((to8)e7).b = true;
                    ((to8)e7).k.add(super.h);
                    ((to8)super.e).k.add(super.i);
                }
            }
        }
        else {
            ((to8)e3).b((po8)this);
        }
        final ni6 b12 = super.b;
        final ei6[] r2 = b12.R;
        if (r2[2].f != null && r2[3].f != null) {
            if (b12.F()) {
                super.h.f = super.b.R[2].e();
                super.i.f = -super.b.R[3].e();
            }
            else {
                final to8 h6 = this.h(super.b.R[2]);
                final to8 h7 = this.h(super.b.R[3]);
                if (h6 != null) {
                    h6.b((po8)this);
                }
                if (h7 != null) {
                    h7.b((po8)this);
                }
                super.j = 4;
            }
            if (super.b.E) {
                this.c(this.k, super.h, 1, (sw8)this.l);
            }
        }
        else if (r2[2].f != null) {
            final to8 h8 = this.h(r2[2]);
            if (h8 != null) {
                this.b(super.h, h8, super.b.R[2].e());
                this.c(super.i, super.h, 1, super.e);
                if (super.b.E) {
                    this.c(this.k, super.h, 1, (sw8)this.l);
                }
                if (super.d == f0) {
                    final ni6 b13 = super.b;
                    if (b13.Y > 0.0f) {
                        final bqc d3 = b13.d;
                        if (((sox)d3).d == f0) {
                            ((to8)((sox)d3).e).k.add(super.e);
                            ((to8)super.e).l.add(((sox)super.b.d).e);
                            ((to8)super.e).a = this;
                        }
                    }
                }
            }
        }
        else if (r2[3].f != null) {
            final to8 h9 = this.h(r2[3]);
            if (h9 != null) {
                this.b(super.i, h9, -super.b.R[3].e());
                this.c(super.h, super.i, -1, super.e);
                if (super.b.E) {
                    this.c(this.k, super.h, 1, (sw8)this.l);
                }
            }
        }
        else if (r2[4].f != null) {
            final to8 h10 = this.h(r2[4]);
            if (h10 != null) {
                this.b(this.k, h10, 0);
                this.c(super.h, this.k, -1, (sw8)this.l);
                this.c(super.i, super.h, 1, super.e);
            }
        }
        else if (!(b12 instanceof yic)) {
            final ni6 v4 = b12.V;
            if (v4 != null) {
                this.b(super.h, v4.e.h, b12.z());
                this.c(super.i, super.h, 1, super.e);
                if (super.b.E) {
                    this.c(this.k, super.h, 1, (sw8)this.l);
                }
                if (super.d == f0) {
                    final ni6 b14 = super.b;
                    if (b14.Y > 0.0f) {
                        final bqc d4 = b14.d;
                        if (((sox)d4).d == f0) {
                            ((to8)((sox)d4).e).k.add(super.e);
                            ((to8)super.e).l.add(((sox)super.b.d).e);
                            ((to8)super.e).a = this;
                        }
                    }
                }
            }
        }
        if (((to8)super.e).l.size() == 0) {
            ((to8)super.e).c = true;
        }
    }
    
    public final void e() {
        final to8 h = super.h;
        if (h.j) {
            super.b.b0 = h.g;
        }
    }
    
    public final void f() {
        super.c = null;
        super.h.c();
        super.i.c();
        this.k.c();
        ((to8)super.e).c();
        super.g = false;
    }
    
    public final boolean k() {
        return super.d != ni6$a.F0 || super.b.s == 0;
    }
    
    public final void m() {
        super.g = false;
        super.h.c();
        super.h.j = false;
        super.i.c();
        super.i.j = false;
        this.k.c();
        this.k.j = false;
        ((to8)super.e).j = false;
    }
    
    public final String toString() {
        final StringBuilder j = fu8.j("VerticalRun ");
        j.append(super.b.j0);
        return j.toString();
    }
}
