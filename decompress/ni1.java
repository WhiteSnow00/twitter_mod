import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ni1 extends ajc
{
    public int w0;
    public boolean x0;
    public int y0;
    public boolean z0;
    
    public ni1() {
        this.w0 = 0;
        this.x0 = true;
        this.y0 = 0;
        this.z0 = false;
    }
    
    public final boolean H() {
        return this.z0;
    }
    
    public final boolean I() {
        return this.z0;
    }
    
    public final boolean b0() {
        final ei6$a g0 = ei6$a.G0;
        final ei6$a e0 = ei6$a.E0;
        final ei6$a f0 = ei6$a.F0;
        final ei6$a d0 = ei6$a.D0;
        int i = 0;
        int n = 0;
        int n2 = 1;
        int v0;
        while (true) {
            v0 = super.v0;
            if (n >= v0) {
                break;
            }
            final ni6 ni6 = super.u0[n];
            int n3 = 0;
            Label_0125: {
                if (!this.x0 && !ni6.g()) {
                    n3 = n2;
                }
                else {
                    final int w0 = this.w0;
                    if ((w0 != 0 && w0 != 1) || ni6.H()) {
                        final int w2 = this.w0;
                        if (w2 != 2) {
                            n3 = n2;
                            if (w2 != 3) {
                                break Label_0125;
                            }
                        }
                        n3 = n2;
                        if (ni6.I()) {
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
            while (i < super.v0) {
                final ni6 ni7 = super.u0[i];
                if (this.x0 || ni7.g()) {
                    int n6 = n4;
                    int n7;
                    if ((n7 = n5) == 0) {
                        final int w3 = this.w0;
                        if (w3 == 0) {
                            n4 = ni7.n(d0).d();
                        }
                        else if (w3 == 1) {
                            n4 = ni7.n(f0).d();
                        }
                        else if (w3 == 2) {
                            n4 = ni7.n(e0).d();
                        }
                        else if (w3 == 3) {
                            n4 = ni7.n(g0).d();
                        }
                        n7 = 1;
                        n6 = n4;
                    }
                    final int w4 = this.w0;
                    if (w4 == 0) {
                        n4 = Math.min(n6, ni7.n(d0).d());
                        n5 = n7;
                    }
                    else if (w4 == 1) {
                        n4 = Math.max(n6, ni7.n(f0).d());
                        n5 = n7;
                    }
                    else if (w4 == 2) {
                        n4 = Math.min(n6, ni7.n(e0).d());
                        n5 = n7;
                    }
                    else {
                        n4 = n6;
                        n5 = n7;
                        if (w4 == 3) {
                            n4 = Math.max(n6, ni7.n(g0).d());
                            n5 = n7;
                        }
                    }
                }
                ++i;
            }
            final int n8 = n4 + this.y0;
            final int w5 = this.w0;
            if (w5 != 0 && w5 != 1) {
                ((ni6)this).R(n8, n8);
            }
            else {
                ((ni6)this).Q(n8, n8);
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
    
    public final void f(final bdf bdf, final boolean b) {
        final ni6$a f0 = ni6$a.F0;
        final ei6[] r = ((ni6)this).R;
        r[0] = ((ni6)this).J;
        r[2] = ((ni6)this).K;
        r[1] = ((ni6)this).L;
        r[3] = ((ni6)this).M;
        int n = 0;
        ei6[] r2;
        while (true) {
            r2 = ((ni6)this).R;
            if (n >= r2.length) {
                break;
            }
            r2[n].i = bdf.l((Object)r2[n]);
            ++n;
        }
        final int w0 = this.w0;
        if (w0 >= 0 && w0 < 4) {
            final ei6 ei6 = r2[w0];
            if (!this.z0) {
                this.b0();
            }
            if (this.z0) {
                this.z0 = false;
                final int w2 = this.w0;
                if (w2 != 0 && w2 != 1) {
                    if (w2 == 2 || w2 == 3) {
                        bdf.e(((ni6)this).K.i, ((ni6)this).b0);
                        bdf.e(((ni6)this).M.i, ((ni6)this).b0);
                    }
                }
                else {
                    bdf.e(((ni6)this).J.i, ((ni6)this).a0);
                    bdf.e(((ni6)this).L.i, ((ni6)this).a0);
                }
                return;
            }
            while (true) {
                for (int i = 0; i < super.v0; ++i) {
                    final ni6 ni6 = super.u0[i];
                    if (this.x0 || ni6.g()) {
                        final int w3 = this.w0;
                        if ((w3 != 0 && w3 != 1) || ni6.U[0] != f0 || ni6.J.f == null || ni6.L.f == null) {
                            if ((w3 != 2 && w3 != 3) || ni6.U[1] != f0 || ni6.K.f == null || ni6.M.f == null) {
                                continue;
                            }
                        }
                        final boolean b2 = true;
                        final boolean b3 = ((ni6)this).J.g() || ((ni6)this).L.g();
                        final boolean b4 = ((ni6)this).K.g() || ((ni6)this).M.g();
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
                            final ni6 ni7 = super.u0[j];
                            if (this.x0 || ni7.g()) {
                                final olq l = bdf.l((Object)ni7.R[this.w0]);
                                final ei6[] r3 = ni7.R;
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
                                    final olq k = ei6.i;
                                    final int y0 = this.y0;
                                    final xs0 m = bdf.m();
                                    final olq n4 = bdf.n();
                                    n4.G0 = 0;
                                    m.d(k, l, n4, y0 + n3);
                                    bdf.c(m);
                                }
                                else {
                                    final olq i2 = ei6.i;
                                    final int y2 = this.y0;
                                    final xs0 m2 = bdf.m();
                                    final olq n5 = bdf.n();
                                    n5.G0 = 0;
                                    m2.e(i2, l, n5, y2 - n3);
                                    bdf.c(m2);
                                }
                                bdf.d(ei6.i, l, this.y0 + n3, n2);
                            }
                        }
                        final int w6 = this.w0;
                        if (w6 == 0) {
                            bdf.d(((ni6)this).L.i, ((ni6)this).J.i, 0, 8);
                            bdf.d(((ni6)this).J.i, ((ni6)this).V.L.i, 0, 4);
                            bdf.d(((ni6)this).J.i, ((ni6)this).V.J.i, 0, 0);
                            return;
                        }
                        if (w6 == 1) {
                            bdf.d(((ni6)this).J.i, ((ni6)this).L.i, 0, 8);
                            bdf.d(((ni6)this).J.i, ((ni6)this).V.J.i, 0, 4);
                            bdf.d(((ni6)this).J.i, ((ni6)this).V.L.i, 0, 0);
                            return;
                        }
                        if (w6 == 2) {
                            bdf.d(((ni6)this).M.i, ((ni6)this).K.i, 0, 8);
                            bdf.d(((ni6)this).K.i, ((ni6)this).V.M.i, 0, 4);
                            bdf.d(((ni6)this).K.i, ((ni6)this).V.K.i, 0, 0);
                            return;
                        }
                        if (w6 == 3) {
                            bdf.d(((ni6)this).K.i, ((ni6)this).M.i, 0, 8);
                            bdf.d(((ni6)this).K.i, ((ni6)this).V.K.i, 0, 4);
                            bdf.d(((ni6)this).K.i, ((ni6)this).V.M.i, 0, 0);
                        }
                        return;
                    }
                }
                final boolean b2 = false;
                continue;
            }
        }
    }
    
    public final boolean g() {
        return true;
    }
    
    public final void k(final ni6 ni6, final HashMap<ni6, ni6> hashMap) {
        super.k(ni6, (HashMap)hashMap);
        final ni1 ni7 = (ni1)ni6;
        this.w0 = ni7.w0;
        this.x0 = ni7.x0;
        this.y0 = ni7.y0;
    }
    
    public final String toString() {
        String s = ed.B(fu8.j("[Barrier] "), ((ni6)this).j0, " {");
        for (int i = 0; i < super.v0; ++i) {
            final ni6 ni6 = super.u0[i];
            String h = s;
            if (i > 0) {
                h = hmg.h(s, ", ");
            }
            final StringBuilder j = fu8.j(h);
            j.append(ni6.j0);
            s = j.toString();
        }
        return hmg.h(s, "}");
    }
}
