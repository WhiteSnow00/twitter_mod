import java.util.Objects;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class og1 extends okh$c implements rve, dxd, pc9, tgp, opk, skh, ukh, lwj, ave, x3c, arj, yr2
{
    public okh$b K0;
    public boolean L0;
    public neb M0;
    public ng1 N0;
    public HashSet<pkh<?>> O0;
    public eve P0;
    
    public og1(final okh$b k0) {
        czd.f((Object)k0, "element");
        super.E0 = gmw.h(k0);
        this.K0 = k0;
        this.L0 = true;
        this.O0 = new HashSet<pkh<?>>();
    }
    
    public final void A(final boolean b) {
        if (super.J0) {
            final okh$b k0 = this.K0;
            final int e0 = super.E0;
            final int n = 0;
            if ((e0 & 0x20) != 0x0) {
                if (k0 instanceof tkh) {
                    this.E((tkh<?>)k0);
                }
                if (k0 instanceof qkh) {
                    if (b) {
                        this.D();
                    }
                    else {
                        wd.z((yl8)this).t((nsb)new nsb<fzv>(this) {
                            public final og1 D0;
                            
                            public final Object invoke() {
                                this.D0.D();
                                return fzv.a;
                            }
                        });
                    }
                }
                if (k0 instanceof geb) {
                    final heb heb = new heb((geb)k0);
                    final wrd$a a = wrd.a;
                    final wrd$a a2 = wrd.a;
                    this.E((tkh<?>)(this.M0 = new neb((qsb)heb)));
                    if (b) {
                        this.C();
                    }
                    else {
                        wd.z((yl8)this).t((nsb)new nsb<fzv>(this) {
                            public final og1 D0;
                            
                            public final Object invoke() {
                                this.D0.C();
                                return fzv.a;
                            }
                        });
                    }
                }
            }
            if ((super.E0 & 0x4) != 0x0) {
                if (k0 instanceof jc9) {
                    this.L0 = true;
                }
                wd.x((yl8)this, 2).m1();
            }
            if ((super.E0 & 0x2) != 0x0) {
                if (((okh$c)wd.y((yl8)this).e1.d).J0) {
                    final zmi i0 = super.I0;
                    czd.c((Object)i0);
                    ((sve)i0).h1 = this;
                    i0.p1();
                }
                wd.x((yl8)this, 2).m1();
                wd.y((yl8)this).F();
            }
            if (k0 instanceof ocm) {
                ((ocm)k0).W((ncm)this);
            }
            if ((super.E0 & 0x80) != 0x0) {
                if (k0 instanceof qjj && ((okh$c)wd.y((yl8)this).e1.d).J0) {
                    wd.y((yl8)this).F();
                }
                if (k0 instanceof ijj) {
                    this.P0 = null;
                    if (((okh$c)wd.y((yl8)this).e1.d).J0) {
                        wd.z((yl8)this).h((zqj$b)new og1$c(this));
                    }
                }
            }
            if ((super.E0 & 0x100) != 0x0 && k0 instanceof xij && ((okh$c)wd.y((yl8)this).e1.d).J0) {
                wd.y((yl8)this).F();
            }
            if ((super.E0 & 0x10) != 0x0 && k0 instanceof npk) {
                ((npk)k0).l0().D0 = (eve)super.I0;
            }
            int n2 = n;
            if ((super.E0 & 0x8) != 0x0) {
                n2 = 1;
            }
            if (n2 != 0) {
                wd.z((yl8)this).x();
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void B() {
        if (super.J0) {
            final okh$b k0 = this.K0;
            final int e0 = super.E0;
            final int n = 1;
            if ((e0 & 0x20) != 0x0) {
                if (k0 instanceof tkh) {
                    wd.z((yl8)this).getModifierLocalManager().c(this, (pkh<?>)((tkh)k0).getKey());
                }
                if (k0 instanceof qkh) {
                    final qkh qkh = (qkh)k0;
                    final qg1$a a = qg1.a;
                    qkh.A((ukh)qg1.a);
                }
                if (k0 instanceof geb) {
                    final neb m0 = this.M0;
                    if (m0 != null) {
                        wd.z((yl8)this).getModifierLocalManager().c(this, (pkh<?>)m0.G0);
                    }
                }
            }
            int n2;
            if ((super.E0 & 0x8) != 0x0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                wd.z((yl8)this).x();
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void C() {
        if (super.J0) {
            final crj snapshotObserver = wd.z((yl8)this).getSnapshotObserver();
            final qg1$a a = qg1.a;
            snapshotObserver.d((arj)this, (qsb)qg1.d, (nsb)new nsb<fzv>(this) {
                public final og1 D0;
                
                public final Object invoke() {
                    final neb m0 = this.D0.M0;
                    czd.c((Object)m0);
                    m0.A((ukh)this.D0);
                    return fzv.a;
                }
            });
        }
    }
    
    public final void D() {
        if (super.J0) {
            this.O0.clear();
            final crj snapshotObserver = wd.z((yl8)this).getSnapshotObserver();
            final qg1$a a = qg1.a;
            snapshotObserver.d((arj)this, (qsb)qg1.c, (nsb)new nsb<fzv>(this) {
                public final og1 D0;
                
                public final Object invoke() {
                    final okh$b k0 = this.D0.K0;
                    czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((qkh)k0).A((ukh)this.D0);
                    return fzv.a;
                }
            });
        }
    }
    
    public final void E(final tkh<?> a) {
        czd.f((Object)a, "element");
        final ng1 n0 = this.N0;
        if (n0 != null && n0.H((pkh<?>)a.getKey())) {
            n0.a = a;
            final rkh modifierLocalManager = wd.z((yl8)this).getModifierLocalManager();
            final aml key = a.getKey();
            Objects.requireNonNull(modifierLocalManager);
            czd.f((Object)key, "key");
            modifierLocalManager.c.b((Object)new lvj((Object)this, (Object)key));
            modifierLocalManager.a();
        }
        else {
            this.N0 = new ng1(a);
            if (((okh$c)wd.y((yl8)this).e1.d).J0) {
                final rkh modifierLocalManager2 = wd.z((yl8)this).getModifierLocalManager();
                final aml key2 = a.getKey();
                Objects.requireNonNull(modifierLocalManager2);
                czd.f((Object)key2, "key");
                modifierLocalManager2.b.b((Object)new lvj((Object)this, (Object)key2));
                modifierLocalManager2.a();
            }
        }
    }
    
    public final void a(final apk apk, final bpk bpk, final long n) {
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((npk)k0).l0().g(apk, bpk, n);
    }
    
    public final void b() {
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        Objects.requireNonNull(((npk)k0).l0());
    }
    
    public final long c() {
        return rp9.T0(((wgk)wd.x((yl8)this, 128)).F0);
    }
    
    public final void d(final long n) {
        final okh$b k0 = this.K0;
        if (k0 instanceof qjj) {
            ((qjj)k0).d(n);
        }
    }
    
    public final int e(final zyd zyd, final hyd hyd, final int n) {
        czd.f((Object)zyd, "<this>");
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((pve)k0).e(zyd, hyd, n);
    }
    
    public final nb f() {
        Object o = this.N0;
        if (o == null) {
            o = l2a.a;
        }
        return (nb)o;
    }
    
    public final <T> T g(final pkh<T> pkh) {
        czd.f((Object)pkh, "<this>");
        this.O0.add(pkh);
        final okh$c d0 = super.D0;
        if (d0.J0) {
            Object o = d0.G0;
            vve vve = wd.y((yl8)this);
            while (vve != null) {
                if ((vve.e1.e.F0 & 0x20) != 0x0) {
                    while (o != null) {
                        if ((((okh$c)o).E0 & 0x20) != 0x0 && o instanceof skh) {
                            final skh skh = (skh)o;
                            if (skh.f().H((pkh)pkh)) {
                                return (T)skh.f().J((pkh)pkh);
                            }
                        }
                        o = ((okh$c)o).G0;
                    }
                }
                vve = vve.x();
                if (vve != null) {
                    final wmi e1 = vve.e1;
                    if (e1 != null) {
                        o = e1.d;
                        continue;
                    }
                }
                o = null;
            }
            return (T)pkh.a.invoke();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final lo8 getDensity() {
        return wd.y((yl8)this).R0;
    }
    
    public final fve getLayoutDirection() {
        return wd.y((yl8)this).T0;
    }
    
    public final void h() {
        wd.y((yl8)this).h();
    }
    
    public final Object i(final lo8 lo8, final Object o) {
        czd.f((Object)lo8, "<this>");
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((kwj)k0).i(lo8, o);
    }
    
    public final boolean isValid() {
        return super.J0;
    }
    
    public final void j(final eve eve) {
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((xij)k0).j(eve);
    }
    
    public final int k(final zyd zyd, final hyd hyd, final int n) {
        czd.f((Object)zyd, "<this>");
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((pve)k0).k(zyd, hyd, n);
    }
    
    public final int m(final zyd zyd, final hyd hyd, final int n) {
        czd.f((Object)zyd, "<this>");
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((pve)k0).m(zyd, hyd, n);
    }
    
    public final void n() {
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((npk)k0).l0().f();
    }
    
    public final void o() {
        this.L0 = true;
        wd.y((yl8)this).D();
    }
    
    public final boolean p() {
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        final mpk l0 = ((npk)k0).l0();
        Objects.requireNonNull(l0);
        return l0 instanceof qpk$a;
    }
    
    public final void q(final eve p) {
        czd.f((Object)p, "coordinates");
        this.P0 = p;
        final okh$b k0 = this.K0;
        if (k0 instanceof ijj) {
            ((ijj)k0).q(p);
        }
    }
    
    public final void r(final jcg jcg) {
        czd.f((Object)jcg, "coordinates");
        final okh$b k0 = this.K0;
        if (!(k0 instanceof lcg)) {
            return;
        }
        Objects.requireNonNull((lcg)k0);
        throw null;
    }
    
    public final void t() {
        this.A(true);
    }
    
    public final String toString() {
        return this.K0.toString();
    }
    
    public final gqg u(final iqg iqg, final cqg cqg, final long n) {
        czd.f((Object)iqg, "$this$measure");
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((pve)k0).u(iqg, cqg, n);
    }
    
    public final void v(final long n) {
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((cxd)k0).v(n);
    }
    
    public final int w(final zyd zyd, final hyd hyd, final int n) {
        czd.f((Object)zyd, "<this>");
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((pve)k0).w(zyd, hyd, n);
    }
    
    public final void x(final yk6 yk6) {
        czd.f((Object)yk6, "<this>");
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        final nc9 nc9 = (nc9)k0;
        if (this.L0 && k0 instanceof jc9) {
            final okh$b k2 = this.K0;
            if (k2 instanceof jc9) {
                final crj snapshotObserver = wd.z((yl8)this).getSnapshotObserver();
                final qg1$a a = qg1.a;
                snapshotObserver.d((arj)this, (qsb)qg1.b, (nsb)new pg1(k2, this));
            }
            this.L0 = false;
        }
        nc9.x(yk6);
    }
    
    public final void y() {
        this.B();
    }
    
    public final pgp z() {
        final okh$b k0 = this.K0;
        czd.d((Object)k0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((rgp)k0).z();
    }
}
