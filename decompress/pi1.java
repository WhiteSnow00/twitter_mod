import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pi1 extends bkc
{
    public int w0;
    public boolean x0;
    public int y0;
    public boolean z0;
    
    public pi1() {
        this.w0 = 0;
        this.x0 = true;
        this.y0 = 0;
        this.z0 = false;
    }
    
    @Override
    public final boolean H() {
        return this.z0;
    }
    
    @Override
    public final boolean I() {
        return this.z0;
    }
    
    public final boolean b0() {
        final kj6$a i0 = kj6$a.I0;
        final kj6$a g0 = kj6$a.G0;
        final kj6$a h0 = kj6$a.H0;
        final kj6$a f0 = kj6$a.F0;
        int j = 0;
        int n = 0;
        int n2 = 1;
        int v0;
        while (true) {
            v0 = super.v0;
            if (n >= v0) {
                break;
            }
            final tj6 tj6 = super.u0[n];
            int n3 = 0;
            Label_0125: {
                if (!this.x0 && !tj6.g()) {
                    n3 = n2;
                }
                else {
                    final int w0 = this.w0;
                    if ((w0 != 0 && w0 != 1) || tj6.H()) {
                        final int w2 = this.w0;
                        if (w2 != 2) {
                            n3 = n2;
                            if (w2 != 3) {
                                break Label_0125;
                            }
                        }
                        n3 = n2;
                        if (tj6.I()) {
                            break Label_0125;
                        }
                    }
                    n3 = 0;
                }
            }
            ++n;
            n2 = n3;
        }
        if (n2 != 0 && v0 > 0) {
            int n4 = 0;
            int n5 = 0;
            while (j < super.v0) {
                final tj6 tj7 = super.u0[j];
                if (this.x0 || tj7.g()) {
                    int n6 = n4;
                    int n7;
                    if ((n7 = n5) == 0) {
                        final int w3 = this.w0;
                        if (w3 == 0) {
                            n4 = tj7.n(f0).d();
                        }
                        else if (w3 == 1) {
                            n4 = tj7.n(h0).d();
                        }
                        else if (w3 == 2) {
                            n4 = tj7.n(g0).d();
                        }
                        else if (w3 == 3) {
                            n4 = tj7.n(i0).d();
                        }
                        n7 = 1;
                        n6 = n4;
                    }
                    final int w4 = this.w0;
                    if (w4 == 0) {
                        n4 = Math.min(n6, tj7.n(f0).d());
                        n5 = n7;
                    }
                    else if (w4 == 1) {
                        n4 = Math.max(n6, tj7.n(h0).d());
                        n5 = n7;
                    }
                    else if (w4 == 2) {
                        n4 = Math.min(n6, tj7.n(g0).d());
                        n5 = n7;
                    }
                    else {
                        n4 = n6;
                        n5 = n7;
                        if (w4 == 3) {
                            n4 = Math.max(n6, tj7.n(i0).d());
                            n5 = n7;
                        }
                    }
                }
                ++j;
            }
            final int n8 = n4 + this.y0;
            final int w5 = this.w0;
            if (w5 != 0 && w5 != 1) {
                this.R(n8, n8);
            }
            else {
                this.Q(n8, n8);
            }
            return this.z0 = true;
        }
        return false;
    }
    
    public final int c0() {
        final int w0 = this.w0;
        if (w0 == 0 || w0 == 1) {
            return 0;
        }
        if (w0 != 2 && w0 != 3) {
            return -1;
        }
        return 1;
    }
    
    @Override
    public final void f(final ydf ydf, final boolean b) {
        final a h0 = tj6.a.H0;
        final kj6[] r = super.R;
        r[0] = super.J;
        r[2] = super.K;
        r[1] = super.L;
        r[3] = super.M;
        int n = 0;
        kj6[] r2;
        while (true) {
            r2 = super.R;
            if (n >= r2.length) {
                break;
            }
            r2[n].i = ydf.l((Object)r2[n]);
            ++n;
        }
        final int w0 = this.w0;
        if (w0 >= 0 && w0 < 4) {
            final kj6 kj6 = r2[w0];
            if (!this.z0) {
                this.b0();
            }
            if (this.z0) {
                this.z0 = false;
                final int w2 = this.w0;
                if (w2 != 0 && w2 != 1) {
                    if (w2 == 2 || w2 == 3) {
                        ydf.e(super.K.i, super.b0);
                        ydf.e(super.M.i, super.b0);
                    }
                }
                else {
                    ydf.e(super.J.i, super.a0);
                    ydf.e(super.L.i, super.a0);
                }
                return;
            }
            while (true) {
                for (int i = 0; i < super.v0; ++i) {
                    final tj6 tj6 = super.u0[i];
                    if (this.x0 || tj6.g()) {
                        final int w3 = this.w0;
                        if ((w3 != 0 && w3 != 1) || tj6.U[0] != h0 || tj6.J.f == null || tj6.L.f == null) {
                            if ((w3 != 2 && w3 != 3) || tj6.U[1] != h0 || tj6.K.f == null || tj6.M.f == null) {
                                continue;
                            }
                        }
                        final boolean b2 = true;
                        final boolean b3 = super.J.g() || super.L.g();
                        final boolean b4 = super.K.g() || super.M.g();
                        boolean b5 = false;
                        Label_0484: {
                            if (!b2) {
                                final int w4 = this.w0;
                                if ((w4 == 0 && b3) || (w4 == 2 && b4) || (w4 == 1 && b3) || (w4 == 3 && b4)) {
                                    b5 = true;
                                    break Label_0484;
                                }
                            }
                            b5 = false;
                        }
                        int n2 = 5;
                        if (!b5) {
                            n2 = 4;
                        }
                        for (int j = 0; j < super.v0; ++j) {
                            final tj6 tj7 = super.u0[j];
                            if (this.x0 || tj7.g()) {
                                final lmq l = ydf.l((Object)tj7.R[this.w0]);
                                final kj6[] r3 = tj7.R;
                                final int w5 = this.w0;
                                r3[w5].i = l;
                                int n3;
                                if (r3[w5].f != null && r3[w5].f.d == this) {
                                    n3 = r3[w5].g + 0;
                                }
                                else {
                                    n3 = 0;
                                }
                                if (w5 != 0 && w5 != 2) {
                                    final lmq k = kj6.i;
                                    final int y0 = this.y0;
                                    final at0 m = ydf.m();
                                    final lmq n4 = ydf.n();
                                    n4.I0 = 0;
                                    m.d(k, l, n4, y0 + n3);
                                    ydf.c(m);
                                }
                                else {
                                    final lmq i2 = kj6.i;
                                    final int y2 = this.y0;
                                    final at0 m2 = ydf.m();
                                    final lmq n5 = ydf.n();
                                    n5.I0 = 0;
                                    m2.e(i2, l, n5, y2 - n3);
                                    ydf.c(m2);
                                }
                                ydf.d(kj6.i, l, this.y0 + n3, n2);
                            }
                        }
                        final int w6 = this.w0;
                        if (w6 == 0) {
                            ydf.d(super.L.i, super.J.i, 0, 8);
                            ydf.d(super.J.i, super.V.L.i, 0, 4);
                            ydf.d(super.J.i, super.V.J.i, 0, 0);
                            return;
                        }
                        if (w6 == 1) {
                            ydf.d(super.J.i, super.L.i, 0, 8);
                            ydf.d(super.J.i, super.V.J.i, 0, 4);
                            ydf.d(super.J.i, super.V.L.i, 0, 0);
                            return;
                        }
                        if (w6 == 2) {
                            ydf.d(super.M.i, super.K.i, 0, 8);
                            ydf.d(super.K.i, super.V.M.i, 0, 4);
                            ydf.d(super.K.i, super.V.K.i, 0, 0);
                            return;
                        }
                        if (w6 == 3) {
                            ydf.d(super.K.i, super.M.i, 0, 8);
                            ydf.d(super.K.i, super.V.K.i, 0, 4);
                            ydf.d(super.K.i, super.V.M.i, 0, 0);
                        }
                        return;
                    }
                }
                final boolean b2 = false;
                continue;
            }
        }
    }
    
    @Override
    public final boolean g() {
        return true;
    }
    
    @Override
    public final void k(final tj6 tj6, final HashMap<tj6, tj6> hashMap) {
        super.k(tj6, hashMap);
        final pi1 pi1 = (pi1)tj6;
        this.w0 = pi1.w0;
        this.x0 = pi1.x0;
        this.y0 = pi1.y0;
    }
    
    @Override
    public final String toString() {
        String s = m51.y(ehk.f("[Barrier] "), super.j0, " {");
        for (int i = 0; i < super.v0; ++i) {
            final tj6 tj6 = super.u0[i];
            String l = s;
            if (i > 0) {
                l = mqb.l(s, ", ");
            }
            final StringBuilder f = ehk.f(l);
            f.append(tj6.j0);
            s = f.toString();
        }
        return mqb.l(s, "}");
    }
}
