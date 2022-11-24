import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbc extends tj6
{
    public float u0;
    public int v0;
    public int w0;
    public kj6 x0;
    public int y0;
    public boolean z0;
    
    public dbc() {
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
    
    @Override
    public final boolean H() {
        return this.z0;
    }
    
    @Override
    public final boolean I() {
        return this.z0;
    }
    
    @Override
    public final void Z(final ydf ydf, final boolean b) {
        if (super.V == null) {
            return;
        }
        final int o = ydf.o((Object)this.x0);
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
    
    @Override
    public final void f(final ydf ydf, final boolean b) {
        final a g0 = tj6.a.G0;
        final uj6 uj6 = (uj6)super.V;
        if (uj6 == null) {
            return;
        }
        kj6 kj6 = ((tj6)uj6).n(kj6$a.F0);
        kj6 kj7 = ((tj6)uj6).n(kj6$a.H0);
        final tj6 v = super.V;
        final int n = 1;
        int n2;
        if (v != null && v.U[0] == g0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.y0 == 0) {
            kj6 = ((tj6)uj6).n(kj6$a.G0);
            kj7 = ((tj6)uj6).n(kj6$a.I0);
            final tj6 v2 = super.V;
            if (v2 != null && v2.U[1] == g0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (this.z0) {
            final kj6 x0 = this.x0;
            if (x0.c) {
                final lmq l = ydf.l((Object)x0);
                ydf.e(l, this.x0.d());
                if (this.v0 != -1) {
                    if (n2 != 0) {
                        ydf.f(ydf.l((Object)kj7), l, 0, 5);
                    }
                }
                else if (this.w0 != -1 && n2 != 0) {
                    final lmq i = ydf.l((Object)kj7);
                    ydf.f(l, ydf.l((Object)kj6), 0, 5);
                    ydf.f(i, l, 0, 5);
                }
                this.z0 = false;
                return;
            }
        }
        if (this.v0 != -1) {
            final lmq j = ydf.l((Object)this.x0);
            ydf.d(j, ydf.l((Object)kj6), this.v0, 8);
            if (n2 != 0) {
                ydf.f(ydf.l((Object)kj7), j, 0, 5);
            }
        }
        else if (this.w0 != -1) {
            final lmq k = ydf.l((Object)this.x0);
            final lmq m = ydf.l((Object)kj7);
            ydf.d(k, m, -this.w0, 8);
            if (n2 != 0) {
                ydf.f(k, ydf.l((Object)kj6), 0, 5);
                ydf.f(m, k, 0, 5);
            }
        }
        else if (this.u0 != -1.0f) {
            final lmq l2 = ydf.l((Object)this.x0);
            final lmq l3 = ydf.l((Object)kj7);
            final float u0 = this.u0;
            final at0 m2 = ydf.m();
            m2.d.k(l2, -1.0f);
            m2.d.k(l3, u0);
            ydf.c(m2);
        }
    }
    
    @Override
    public final boolean g() {
        return true;
    }
    
    @Override
    public final void k(final tj6 tj6, final HashMap<tj6, tj6> hashMap) {
        super.k(tj6, hashMap);
        final dbc dbc = (dbc)tj6;
        this.u0 = dbc.u0;
        this.v0 = dbc.v0;
        this.w0 = dbc.w0;
        this.b0(dbc.y0);
    }
    
    @Override
    public final kj6 n(final kj6$a kj6$a) {
        final int ordinal = ((Enum)kj6$a).ordinal();
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
