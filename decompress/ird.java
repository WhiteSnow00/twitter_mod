import java.util.HashMap;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ird extends vmi
{
    public static final ird.ird$a Companion;
    public static final d50 h1;
    public final ird$c g1;
    
    static {
        Companion = new ird.ird$a();
        final d50 h2 = new d50();
        Objects.requireNonNull(pr4.Companion);
        h2.k(pr4.d);
        h2.v(1.0f);
        Objects.requireNonNull(evj.Companion);
        h2.x(1);
        h1 = h2;
    }
    
    public ird(final jwe jwe) {
        zzd.f((Object)jwe, "layoutNode");
        super(jwe);
        final jkh.c g1 = new jkh.c() {
            @Override
            public final String toString() {
                return "<tail>";
            }
        };
        this.g1 = g1;
        g1.H0 = this;
    }
    
    public final void G0(final long n, float u0, final rtb<? super n8c, oyv> rtb) {
        super.G0(n, u0, (rtb)rtb);
        if (((rcg)this).G0) {
            return;
        }
        this.r1();
        final jwe i0 = super.I0;
        final jwe x = i0.x();
        final smi d1 = i0.d1;
        final ird b = d1.b;
        u0 = b.U0;
        gwe gwe;
        for (vmi vmi = d1.c; vmi != b; vmi = gwe.J0) {
            zzd.d((Object)vmi, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            gwe = (gwe)vmi;
            u0 += gwe.U0;
        }
        final float f1 = i0.f1;
        final int n2 = 0;
        if (u0 != f1) {
            i0.f1 = u0;
            if (x != null) {
                x.Q();
            }
            if (x != null) {
                x.D();
            }
        }
        if (!i0.U0) {
            if (x != null) {
                x.D();
            }
            i0.M();
        }
        if (x != null) {
            if (!i0.n1 && x.e1.b == 3) {
                int n3 = n2;
                if (i0.V0 == Integer.MAX_VALUE) {
                    n3 = 1;
                }
                if (n3 == 0) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                final int x2 = x.X0;
                i0.V0 = x2;
                x.X0 = x2 + 1;
            }
        }
        else {
            i0.V0 = 0;
        }
        i0.e1.k.q();
    }
    
    public final int H(final int n) {
        final f0e p = super.I0.P0;
        final gqg a = p.a();
        final jwe a2 = p.a;
        return a.c((wzd)a2.d1.c, a2.r(), n);
    }
    
    public final int K(final int n) {
        final f0e p = super.I0.P0;
        final gqg a = p.a();
        final jwe a2 = p.a;
        return a.a((wzd)a2.d1.c, a2.r(), n);
    }
    
    public final int K0(final ex ex) {
        zzd.f((Object)ex, "alignmentLine");
        final scg r0 = super.R0;
        int n;
        if (r0 != null) {
            n = ((rcg)r0).K0(ex);
        }
        else {
            final Integer n2 = ((rwe$b)this.e1()).K0().get(ex);
            if (n2 != null) {
                n = n2;
            }
            else {
                n = Integer.MIN_VALUE;
            }
        }
        return n;
    }
    
    public final qgk W(final long n) {
        ((qgk)this).J0(n);
        final ouh z = super.I0.z();
        final int e0 = z.E0;
        if (e0 > 0) {
            int n2 = 0;
            final Object[] c0 = z.C0;
            zzd.d((Object)c0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final jwe jwe = (jwe)c0[n2];
                Objects.requireNonNull(jwe);
                jwe.Y0 = 3;
            } while (++n2 < e0);
        }
        final jwe i0 = super.I0;
        this.u1(i0.O0.b((jqg)this, i0.r(), n));
        this.q1();
        return (qgk)this;
    }
    
    public final scg X0(final wcg wcg) {
        zzd.f((Object)wcg, "scope");
        return new b(wcg);
    }
    
    public final int e(final int n) {
        final f0e p = super.I0.P0;
        final gqg a = p.a();
        final jwe a2 = p.a;
        return a.d((wzd)a2.d1.c, a2.r(), n);
    }
    
    public final jkh.c g1() {
        return this.g1;
    }
    
    public final <T extends pm8> void l1(final vmi$f<T> vmi$f, final long n, final plc<T> plc, final boolean b, boolean b2) {
        zzd.f((Object)vmi$f, "hitTestSource");
        zzd.f((Object)plc, "hitTestResult");
        boolean b3 = false;
        Label_0100: {
            if (vmi$f.c(super.I0)) {
                if (this.A1(n)) {
                    b3 = true;
                    break Label_0100;
                }
                if (b) {
                    final float y0 = this.Y0(n, this.f1());
                    if (!Float.isInfinite(y0) && !Float.isNaN(y0)) {
                        b3 = true;
                        b2 = false;
                        break Label_0100;
                    }
                }
            }
            b3 = false;
        }
        if (b3) {
            final int e0 = plc.E0;
            final ouh y2 = super.I0.y();
            int e2 = y2.E0;
            if (e2 > 0) {
                final Object[] c0 = y2.C0;
                zzd.d((Object)c0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                --e2;
                do {
                    final jwe jwe = (jwe)c0[e2];
                    boolean b6 = false;
                    Label_0398: {
                        if (jwe.U0) {
                            vmi$f.b(jwe, n, (plc)plc, b, b2);
                            final long e3 = plc.e();
                            boolean b5 = false;
                            Label_0370: {
                                if (h6q.u(e3) < 0.0f && h6q.G(e3)) {
                                    final jkh.c h1 = jwe.d1.c.h1(m8y.p(16));
                                    boolean b4 = false;
                                    Label_0347: {
                                        if (h1 != null) {
                                            if (!h1.l().I0) {
                                                throw new IllegalStateException("Check failed.".toString());
                                            }
                                            final jkh.c l = h1.l();
                                            if ((l.E0 & 0x10) != 0x0) {
                                                for (jkh.c c2 = l.G0; c2 != null; c2 = c2.G0) {
                                                    if ((c2.D0 & 0x10) != 0x0 && c2 instanceof gpk && ((gpk)c2).p()) {
                                                        b4 = true;
                                                        break Label_0347;
                                                    }
                                                }
                                            }
                                        }
                                        b4 = false;
                                    }
                                    if (!b4) {
                                        b5 = false;
                                        break Label_0370;
                                    }
                                    plc.E0 = plc.F0 - 1;
                                }
                                b5 = true;
                            }
                            if (!b5) {
                                b6 = true;
                                break Label_0398;
                            }
                        }
                        b6 = false;
                    }
                    if (b6) {
                        break;
                    }
                } while (--e2 >= 0);
            }
            plc.E0 = e0;
        }
    }
    
    public final void s1(final rg3 rg3) {
        zzd.f((Object)rg3, "canvas");
        final uqj u = r9x.u(super.I0);
        final ouh y = super.I0.y();
        final int e0 = y.E0;
        if (e0 > 0) {
            int n = 0;
            final Object[] c0 = y.C0;
            zzd.d((Object)c0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                final jwe jwe = (jwe)c0[n];
                if (jwe.U0) {
                    jwe.p(rg3);
                }
            } while (++n < e0);
        }
        if (u.getShowLayoutBounds()) {
            this.a1(rg3, (avj)ird.h1);
        }
    }
    
    public final int x(final int n) {
        final f0e p = super.I0.P0;
        final gqg a = p.a();
        final jwe a2 = p.a;
        return a.e((wzd)a2.d1.c, a2.r(), n);
    }
    
    public final class b extends scg
    {
        public b(final ird ird, final wcg wcg) {
            zzd.f((Object)wcg, "scope");
            super((vmi)ird, wcg);
        }
        
        public final int H(final int n) {
            final f0e p = super.I0.I0.P0;
            final gqg a = p.a();
            final jwe a2 = p.a;
            return a.c((wzd)a2.d1.c, a2.q(), n);
        }
        
        public final int K(final int n) {
            final f0e p = super.I0.I0.P0;
            final gqg a = p.a();
            final jwe a2 = p.a;
            return a.a((wzd)a2.d1.c, a2.q(), n);
        }
        
        public final int K0(final ex ex) {
            zzd.f((Object)ex, "alignmentLine");
            final Integer n = ((HashMap)((rwe$a)this.V0()).K0()).get(ex);
            int intValue;
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = Integer.MIN_VALUE;
            }
            super.O0.put(ex, intValue);
            return intValue;
        }
        
        public final qgk W(final long n) {
            ((qgk)this).J0(n);
            final ouh z = super.I0.I0.z();
            final int e0 = z.E0;
            if (e0 > 0) {
                int n2 = 0;
                final Object[] c0 = z.C0;
                zzd.d((Object)c0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    final jwe jwe = (jwe)c0[n2];
                    Objects.requireNonNull(jwe);
                    jwe.Z0 = 3;
                } while (++n2 < e0);
            }
            final jwe i0 = super.I0.I0;
            scg.U0((scg)this, i0.O0.b((jqg)this, i0.q(), n));
            return (qgk)this;
        }
        
        public final void W0() {
            final rwe$a l = super.I0.I0.e1.l;
            zzd.c((Object)l);
            if (!l.K0) {
                l.K0 = true;
                if (!l.L0) {
                    l.P0();
                }
            }
            ((rwe$a)this.V0()).q();
        }
        
        public final int e(final int n) {
            final f0e p = super.I0.I0.P0;
            final gqg a = p.a();
            final jwe a2 = p.a;
            return a.d((wzd)a2.d1.c, a2.q(), n);
        }
        
        public final int x(final int n) {
            final f0e p = super.I0.I0.P0;
            final gqg a = p.a();
            final jwe a2 = p.a;
            return a.e((wzd)a2.d1.c, a2.q(), n);
        }
    }
}
