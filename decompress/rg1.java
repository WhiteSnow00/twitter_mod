import java.util.Objects;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rg1 extends c implements owe, fyd, sd9, qhp, aqk, hlh, jlh, axj, xve, z4c, prj, rs2
{
    public dlh.b M0;
    public boolean N0;
    public ofb O0;
    public qg1 P0;
    public HashSet<elh<?>> Q0;
    public bwe R0;
    
    public rg1(final dlh.b m0) {
        e0e.f((Object)m0, "element");
        super.G0 = w9y.g(m0);
        this.M0 = m0;
        this.N0 = true;
        this.Q0 = new HashSet<elh<?>>();
    }
    
    public final void A(final boolean b) {
        if (super.L0) {
            final dlh.b m0 = this.M0;
            final int g0 = super.G0;
            final int n = 0;
            if ((g0 & 0x20) != 0x0) {
                if (m0 instanceof ilh) {
                    this.E((ilh<?>)m0);
                }
                if (m0 instanceof flh) {
                    if (b) {
                        this.D();
                    }
                    else {
                        kqe.n0((en8)this).t((ptb)new rg1$a(this));
                    }
                }
                if (m0 instanceof hfb) {
                    final ifb ifb = new ifb((hfb)m0);
                    final ysd$a a = ysd.a;
                    final ysd$a a2 = ysd.a;
                    this.E((ilh<?>)(this.O0 = new ofb((stb)ifb)));
                    if (b) {
                        this.C();
                    }
                    else {
                        kqe.n0((en8)this).t((ptb)new ptb<vzv>(this) {
                            public final rg1 F0;
                            
                            public final Object invoke() {
                                this.F0.C();
                                return vzv.a;
                            }
                        });
                    }
                }
            }
            if ((super.G0 & 0x4) != 0x0) {
                if (m0 instanceof md9) {
                    this.N0 = true;
                }
                kqe.l0((en8)this, 2).m1();
            }
            if ((super.G0 & 0x2) != 0x0) {
                if (kqe.m0((en8)this).g1.d.L0) {
                    final qni k0 = super.K0;
                    e0e.c((Object)k0);
                    ((pwe)k0).j1 = (owe)this;
                    k0.p1();
                }
                kqe.l0((en8)this, 2).m1();
                kqe.m0((en8)this).F();
            }
            if (m0 instanceof adm) {
                ((adm)m0).W((zcm)this);
            }
            if ((super.G0 & 0x80) != 0x0) {
                if (m0 instanceof ekj && kqe.m0((en8)this).g1.d.L0) {
                    kqe.m0((en8)this).F();
                }
                if (m0 instanceof wjj) {
                    this.R0 = null;
                    if (kqe.m0((en8)this).g1.d.L0) {
                        kqe.n0((en8)this).g((orj$b)new rg1$c(this));
                    }
                }
            }
            if ((super.G0 & 0x100) != 0x0 && m0 instanceof ljj && kqe.m0((en8)this).g1.d.L0) {
                kqe.m0((en8)this).F();
            }
            if ((super.G0 & 0x10) != 0x0 && m0 instanceof zpk) {
                ((zpk)m0).l0().F0 = (bwe)super.K0;
            }
            int n2 = n;
            if ((super.G0 & 0x8) != 0x0) {
                n2 = 1;
            }
            if (n2 != 0) {
                kqe.n0((en8)this).x();
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void B() {
        if (super.L0) {
            final dlh.b m0 = this.M0;
            final int g0 = super.G0;
            final int n = 1;
            if ((g0 & 0x20) != 0x0) {
                if (m0 instanceof ilh) {
                    kqe.n0((en8)this).getModifierLocalManager().c(this, (elh)((ilh)m0).getKey());
                }
                if (m0 instanceof flh) {
                    final flh flh = (flh)m0;
                    final jlh a = tg1.a;
                    flh.A(tg1.a);
                }
                if (m0 instanceof hfb) {
                    final ofb o0 = this.O0;
                    if (o0 != null) {
                        kqe.n0((en8)this).getModifierLocalManager().c(this, (elh)o0.I0);
                    }
                }
            }
            int n2;
            if ((super.G0 & 0x8) != 0x0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                kqe.n0((en8)this).x();
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void C() {
        if (super.L0) {
            final rrj snapshotObserver = kqe.n0((en8)this).getSnapshotObserver();
            final jlh a = tg1.a;
            snapshotObserver.d((prj)this, (stb)tg1.d, (ptb)new ptb<vzv>(this) {
                public final rg1 F0;
                
                public final Object invoke() {
                    final ofb o0 = this.F0.O0;
                    e0e.c((Object)o0);
                    o0.A((jlh)this.F0);
                    return vzv.a;
                }
            });
        }
    }
    
    public final void D() {
        if (super.L0) {
            this.Q0.clear();
            final rrj snapshotObserver = kqe.n0((en8)this).getSnapshotObserver();
            final jlh a = tg1.a;
            snapshotObserver.d((prj)this, (stb)tg1.c, (ptb)new ptb<vzv>(this) {
                public final rg1 F0;
                
                public final Object invoke() {
                    final dlh.b m0 = this.F0.M0;
                    e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((flh)m0).A(this.F0);
                    return vzv.a;
                }
            });
        }
    }
    
    public final void E(final ilh<?> a) {
        e0e.f((Object)a, "element");
        final qg1 p = this.P0;
        if (p != null && p.H((elh<?>)a.getKey())) {
            p.a = a;
            final glh modifierLocalManager = kqe.n0((en8)this).getModifierLocalManager();
            final mml key = a.getKey();
            Objects.requireNonNull(modifierLocalManager);
            e0e.f((Object)key, "key");
            modifierLocalManager.c.b((Object)new awj((Object)this, (Object)key));
            modifierLocalManager.a();
        }
        else {
            this.P0 = new qg1(a);
            if (kqe.m0((en8)this).g1.d.L0) {
                final glh modifierLocalManager2 = kqe.n0((en8)this).getModifierLocalManager();
                final mml key2 = a.getKey();
                Objects.requireNonNull(modifierLocalManager2);
                e0e.f((Object)key2, "key");
                modifierLocalManager2.b.b((Object)new awj((Object)this, (Object)key2));
                modifierLocalManager2.a();
            }
        }
    }
    
    public final void a(final mpk mpk, final npk npk, final long n) {
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((zpk)m0).l0().g(mpk, npk, n);
    }
    
    public final void b() {
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        Objects.requireNonNull(((zpk)m0).l0());
    }
    
    public final long c() {
        return shw.Z0(((khk)kqe.l0((en8)this, 128)).H0);
    }
    
    public final void d(final long n) {
        final dlh.b m0 = this.M0;
        if (m0 instanceof ekj) {
            ((ekj)m0).d(n);
        }
    }
    
    public final int e(final b0e b0e, final jzd jzd, final int n) {
        e0e.f((Object)b0e, "<this>");
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((mwe)m0).e(b0e, jzd, n);
    }
    
    public final ob f() {
        ob ob = this.P0;
        if (ob == null) {
            ob = n3a.a;
        }
        return ob;
    }
    
    public final <T> T g(final elh<T> elh) {
        e0e.f((Object)elh, "<this>");
        this.Q0.add(elh);
        final dlh.c f0 = super.F0;
        if (f0.L0) {
            Object o = f0.I0;
            swe swe = kqe.m0((en8)this);
            while (swe != null) {
                if ((swe.g1.e.H0 & 0x20) != 0x0) {
                    while (o != null) {
                        if ((((c)o).G0 & 0x20) != 0x0 && o instanceof hlh) {
                            final hlh hlh = (hlh)o;
                            if (hlh.f().H((elh)elh)) {
                                return (T)hlh.f().J((elh)elh);
                            }
                        }
                        o = ((c)o).I0;
                    }
                }
                swe = swe.x();
                if (swe != null) {
                    final nni g1 = swe.g1;
                    if (g1 != null) {
                        o = g1.d;
                        continue;
                    }
                }
                o = null;
            }
            return (T)elh.a.invoke();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final rp8 getDensity() {
        return kqe.m0((en8)this).T0;
    }
    
    public final cwe getLayoutDirection() {
        return kqe.m0((en8)this).V0;
    }
    
    public final void h() {
        kqe.m0((en8)this).h();
    }
    
    public final Object i(final rp8 rp8, final Object o) {
        e0e.f((Object)rp8, "<this>");
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((zwj)m0).i(rp8, o);
    }
    
    public final boolean isValid() {
        return super.L0;
    }
    
    public final void j(final bwe bwe) {
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((ljj)m0).j(bwe);
    }
    
    public final int k(final b0e b0e, final jzd jzd, final int n) {
        e0e.f((Object)b0e, "<this>");
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((mwe)m0).k(b0e, jzd, n);
    }
    
    public final int m(final b0e b0e, final jzd jzd, final int n) {
        e0e.f((Object)b0e, "<this>");
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((mwe)m0).m(b0e, jzd, n);
    }
    
    public final void n() {
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((zpk)m0).l0().f();
    }
    
    public final void o() {
        this.N0 = true;
        kqe.m0((en8)this).D();
    }
    
    public final boolean p() {
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        final ypk l0 = ((zpk)m0).l0();
        Objects.requireNonNull(l0);
        return l0 instanceof cqk.cqk$a;
    }
    
    public final void q(final bwe r0) {
        e0e.f((Object)r0, "coordinates");
        this.R0 = r0;
        final dlh.b m0 = this.M0;
        if (m0 instanceof wjj) {
            ((wjj)m0).q(r0);
        }
    }
    
    public final void r(final ddg ddg) {
        e0e.f((Object)ddg, "coordinates");
        final dlh.b m0 = this.M0;
        if (!(m0 instanceof fdg)) {
            return;
        }
        Objects.requireNonNull(m0);
        throw null;
    }
    
    @Override
    public final void t() {
        this.A(true);
    }
    
    public final String toString() {
        return this.M0.toString();
    }
    
    public final arg u(final crg crg, final wqg wqg, final long n) {
        e0e.f((Object)crg, "$this$measure");
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((mwe)m0).u(crg, wqg, n);
    }
    
    public final void v(final long n) {
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((eyd)m0).v(n);
    }
    
    public final int w(final b0e b0e, final jzd jzd, final int n) {
        e0e.f((Object)b0e, "<this>");
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((mwe)m0).w(b0e, jzd, n);
    }
    
    public final void x(final em6 em6) {
        e0e.f((Object)em6, "<this>");
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        final qd9 qd9 = (qd9)m0;
        if (this.N0 && m0 instanceof md9) {
            final dlh.b m2 = this.M0;
            if (m2 instanceof md9) {
                final rrj snapshotObserver = kqe.n0((en8)this).getSnapshotObserver();
                final jlh a = tg1.a;
                snapshotObserver.d((prj)this, (stb)tg1.b, (ptb)new sg1(m2, this));
            }
            this.N0 = false;
        }
        qd9.x(em6);
    }
    
    @Override
    public final void y() {
        this.B();
    }
    
    public final mhp z() {
        final dlh.b m0 = this.M0;
        e0e.d((Object)m0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((ohp)m0).z();
    }
}
