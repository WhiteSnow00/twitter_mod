// 
// Decompiled by Procyon v0.6.0
// 

public final class dfb extends ctd implements flh, ilh<dfb>, prj, wjj
{
    public static final dfb.dfb$b Companion;
    public static final stb<dfb, vzv> V0;
    public dfb G0;
    public final ivh<dfb> H0;
    public vfb I0;
    public dfb J0;
    public xeb K0;
    public oeb<jlo> L0;
    public jlh M0;
    public dw1 N0;
    public ofb O0;
    public final kfb P0;
    public tfb Q0;
    public qni R0;
    public boolean S0;
    public nqe T0;
    public final ivh<nqe> U0;
    
    static {
        Companion = new dfb.dfb$b();
        dfb.V0 = dfb$a.F0;
    }
    
    public dfb() {
        final vfb k0 = vfb.K0;
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        e0e.f((Object)a2, "inspectorInfo");
        super((stb)a2);
        this.H0 = (ivh<dfb>)new ivh((Object[])new dfb[16]);
        this.I0 = k0;
        this.P0 = new kfb();
        this.U0 = (ivh<nqe>)new ivh((Object[])new nqe[16]);
    }
    
    public final void A(final jlh m0) {
        e0e.f((Object)m0, "scope");
        this.M0 = m0;
        final dfb g0 = m0.g((elh<dfb>)efb.a);
        if (!e0e.a((Object)g0, (Object)this.G0)) {
            if (g0 == null) {
                final int ordinal = ((Enum)this.I0).ordinal();
                if (ordinal == 0 || ordinal == 2) {
                    final qni r0 = this.R0;
                    if (r0 != null) {
                        final swe l0 = r0.L0;
                        if (l0 != null) {
                            final orj m2 = l0.M0;
                            if (m2 != null) {
                                final bfb focusManager = m2.getFocusManager();
                                if (focusManager != null) {
                                    focusManager.b(true);
                                }
                            }
                        }
                    }
                }
            }
            final dfb g2 = this.G0;
            if (g2 != null) {
                final ivh<dfb> h0 = g2.H0;
                if (h0 != null) {
                    h0.n((Object)this);
                }
            }
            if (g0 != null) {
                final ivh<dfb> h2 = g0.H0;
                if (h2 != null) {
                    h2.b((Object)this);
                }
            }
        }
        this.G0 = g0;
        final xeb k0 = m0.g((elh<xeb>)ueb.a);
        if (!e0e.a((Object)k0, (Object)this.K0)) {
            final xeb k2 = this.K0;
            if (k2 != null) {
                k2.I0.n((Object)this);
                final xeb g3 = k2.G0;
                if (g3 != null) {
                    g3.f(this);
                }
            }
            if (k0 != null) {
                k0.I0.b((Object)this);
                final xeb g4 = k0.G0;
                if (g4 != null) {
                    g4.a(this);
                }
            }
        }
        this.K0 = k0;
        final tfb q0 = m0.g((elh<tfb>)sfb.a);
        if (!e0e.a((Object)q0, (Object)this.Q0)) {
            final tfb q2 = this.Q0;
            if (q2 != null) {
                q2.G0.n((Object)this);
                final tfb f0 = q2.F0;
                if (f0 != null) {
                    f0.f(this);
                }
            }
            if (q0 != null) {
                q0.G0.b((Object)this);
                final tfb f2 = q0.F0;
                if (f2 != null) {
                    f2.a(this);
                }
            }
        }
        this.Q0 = q0;
        this.L0 = (oeb<jlo>)m0.g((elh<oeb>)hlo.a);
        this.N0 = m0.g((elh<dw1>)ew1.a);
        this.T0 = m0.g((elh<nqe>)oqe.a);
        this.O0 = m0.g((elh<ofb>)lfb.a);
        lfb.b(this);
    }
    
    public final dlh E(final dlh dlh) {
        return z9a.i((dlh)this, dlh);
    }
    
    public final boolean H(final stb stb) {
        return k5b.a((b)this, stb);
    }
    
    public final Object X(final Object o, final hub hub) {
        e0e.f((Object)hub, "operation");
        return hub.invoke(o, (Object)this);
    }
    
    public final void b(final vfb i0) {
        this.I0 = i0;
        xfb.i(this);
    }
    
    public final mml<dfb> getKey() {
        return (mml<dfb>)efb.a;
    }
    
    public final Object getValue() {
        return this;
    }
    
    public final boolean isValid() {
        return this.G0 != null;
    }
    
    public final void q(final bwe bwe) {
        e0e.f((Object)bwe, "coordinates");
        final boolean b = this.R0 == null;
        this.R0 = (qni)bwe;
        if (b) {
            lfb.b(this);
        }
        if (this.S0) {
            this.S0 = false;
            xfb.f(this);
        }
    }
}
