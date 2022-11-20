import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bac extends ni6
{
    public float u0;
    public int v0;
    public int w0;
    public ei6 x0;
    public int y0;
    public boolean z0;
    
    public bac() {
        this.u0 = -1.0f;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = super.K;
        int i = 0;
        this.y0 = 0;
        super.S.clear();
        super.S.add(this.x0);
        while (i < super.R.length) {
            super.R[i] = this.x0;
            ++i;
        }
    }
    
    public final boolean H() {
        return this.z0;
    }
    
    public final boolean I() {
        return this.z0;
    }
    
    public final void Z(final bdf bdf, final boolean b) {
        if (super.V == null) {
            return;
        }
        final int o = bdf.o((Object)this.x0);
        if (this.y0 == 1) {
            super.a0 = o;
            super.b0 = 0;
            this.S(super.V.q());
            this.X(0);
        }
        else {
            super.a0 = 0;
            super.b0 = o;
            this.X(super.V.x());
            this.S(0);
        }
    }
    
    public final void a0(final int n) {
        this.x0.m(n);
        this.z0 = true;
    }
    
    public final void b0(int i) {
        if (this.y0 == i) {
            return;
        }
        this.y0 = i;
        super.S.clear();
        if (this.y0 == 1) {
            this.x0 = super.J;
        }
        else {
            this.x0 = super.K;
        }
        super.S.add(this.x0);
        int length;
        for (length = super.R.length, i = 0; i < length; ++i) {
            super.R[i] = this.x0;
        }
    }
    
    public final void f(final bdf bdf, final boolean b) {
        final ni6$a e0 = ni6$a.E0;
        final oi6 oi6 = (oi6)super.V;
        if (oi6 == null) {
            return;
        }
        ei6 ei6 = ((ni6)oi6).n(ei6$a.D0);
        ei6 ei7 = ((ni6)oi6).n(ei6$a.F0);
        final ni6 v = super.V;
        final int n = 1;
        int n2;
        if (v != null && v.U[0] == e0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.y0 == 0) {
            ei6 = ((ni6)oi6).n(ei6$a.E0);
            ei7 = ((ni6)oi6).n(ei6$a.G0);
            final ni6 v2 = super.V;
            if (v2 != null && v2.U[1] == e0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (this.z0) {
            final ei6 x0 = this.x0;
            if (x0.c) {
                final olq l = bdf.l((Object)x0);
                bdf.e(l, this.x0.d());
                if (this.v0 != -1) {
                    if (n2 != 0) {
                        bdf.f(bdf.l((Object)ei7), l, 0, 5);
                    }
                }
                else if (this.w0 != -1 && n2 != 0) {
                    final olq i = bdf.l((Object)ei7);
                    bdf.f(l, bdf.l((Object)ei6), 0, 5);
                    bdf.f(i, l, 0, 5);
                }
                this.z0 = false;
                return;
            }
        }
        if (this.v0 != -1) {
            final olq j = bdf.l((Object)this.x0);
            bdf.d(j, bdf.l((Object)ei6), this.v0, 8);
            if (n2 != 0) {
                bdf.f(bdf.l((Object)ei7), j, 0, 5);
            }
        }
        else if (this.w0 != -1) {
            final olq k = bdf.l((Object)this.x0);
            final olq m = bdf.l((Object)ei7);
            bdf.d(k, m, -this.w0, 8);
            if (n2 != 0) {
                bdf.f(k, bdf.l((Object)ei6), 0, 5);
                bdf.f(m, k, 0, 5);
            }
        }
        else if (this.u0 != -1.0f) {
            final olq l2 = bdf.l((Object)this.x0);
            final olq l3 = bdf.l((Object)ei7);
            final float u0 = this.u0;
            final xs0 m2 = bdf.m();
            m2.d.k(l2, -1.0f);
            m2.d.k(l3, u0);
            bdf.c(m2);
        }
    }
    
    public final boolean g() {
        return true;
    }
    
    public final void k(final ni6 ni6, final HashMap<ni6, ni6> hashMap) {
        super.k(ni6, (HashMap)hashMap);
        final bac bac = (bac)ni6;
        this.u0 = bac.u0;
        this.v0 = bac.v0;
        this.w0 = bac.w0;
        this.b0(bac.y0);
    }
    
    public final ei6 n(final ei6$a ei6$a) {
        final int ordinal = ((Enum)ei6$a).ordinal();
        Label_0040: {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        break Label_0040;
                    }
                    if (ordinal != 4) {
                        return null;
                    }
                }
                if (this.y0 == 0) {
                    return this.x0;
                }
                return null;
            }
        }
        if (this.y0 == 1) {
            return this.x0;
        }
        return null;
    }
}
