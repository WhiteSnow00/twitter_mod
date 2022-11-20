import java.util.concurrent.TimeUnit;
import java.util.Objects;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wi4 implements a94
{
    public static final wi4.wi4$a Companion;
    public final dmv<String, Boolean> D0;
    public final mg3 E0;
    public final z6q F0;
    public String G0;
    public final wc6 H0;
    public fj4 I0;
    public boolean J0;
    public final mv1<Boolean> K0;
    public boolean L0;
    public final m71 M0;
    public final rbx<fj4> N0;
    
    static {
        Companion = new wi4.wi4$a();
    }
    
    public wi4(final ViewGroup viewGroup, final dmv<String, Boolean> d0, final mg3 e0, z6q e2) {
        e2 = z6q.E0;
        czd.f((Object)viewGroup, "viewGroup");
        czd.f((Object)d0, "closedCaptionsToggleStateRepo");
        czd.f((Object)e0, "captionManager");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = e2;
        this.G0 = "";
        this.H0 = new wc6();
        this.K0 = (mv1<Boolean>)mv1.e((Object)Boolean.FALSE);
        this.M0 = m71.a;
        this.N0 = (rbx<fj4>)new rbx((View)viewGroup, 2131428146, 2131428146, (ypa)si4.b);
    }
    
    public static final void a(final wi4 wi4, final fj4 i0, final String s) {
        wi4.I0 = i0;
        if (wi4.L0 && !z6q.i()) {
            i0.a();
        }
        else {
            i0.a.setVisibility(0);
            i0.b.setVisibility(0);
        }
        final t19 g = wi4.M0.a().get((Object)s).G((lj6)new tg((qsb)new xi4(wi4), 2), (lj6)new ri4((qsb)yi4.D0, 0));
        final wc6 h0 = wi4.H0;
        czd.g((Object)h0, "compositeDisposable");
        h0.a(g);
    }
    
    public static final void b(final wi4 wi4, final ynj ynj) {
        Objects.requireNonNull(wi4);
        if (ynj.e()) {
            final boolean b = asa.c().b("android_cc_toggle_is_enabled_default", true);
            wi4.J0 = b;
            rpb.e(wi4.D0.e((Object)wi4.G0, (Object)b).D(), wi4.H0);
        }
        else {
            final Object c = ynj.c();
            czd.e(c, "isEnabled.get()");
            wi4.J0 = (boolean)c;
        }
        final fj4 i0 = wi4.I0;
        if (i0 != null) {
            if (wi4.J0) {
                i0.a.setImageResource(2131231452);
            }
            else {
                i0.a.setImageResource(2131231451);
            }
        }
        wi4.K0.onNext((Object)wi4.J0);
        final fj4 i2 = wi4.I0;
        if (i2 != null) {
            final h5j doOnNext = max.h(i2.b).doOnNext((lj6)new st1((qsb)new zi4(wi4), 1));
            if (doOnNext != null) {
                final h5j debounce = doOnNext.debounce(200L, TimeUnit.MILLISECONDS);
                if (debounce != null) {
                    final h5j flatMapSingle = debounce.flatMapSingle((psb)new ti4((qsb)new aj4(wi4), 0));
                    if (flatMapSingle != null) {
                        final t19 subscribe = flatMapSingle.subscribe((lj6)new sma((qsb)bj4.D0, 1), (lj6)new tma((qsb)cj4.D0, 2));
                        if (subscribe != null) {
                            rpb.e(subscribe, wi4.H0);
                        }
                    }
                }
            }
        }
    }
    
    public final void c(final w4 w4) {
        final lg3$a companion = lg3.Companion;
        final String g0 = this.G0;
        Objects.requireNonNull(companion);
        czd.f((Object)g0, "mediaId");
        final Boolean b = (Boolean)lg3.J0.get((Object)g0);
        if (b != null && b && w2.c()) {
            this.N0.h();
            final haq d = this.N0.d;
            czd.e((Object)d, "viewStub.onViewInflatedSingle()");
            final t19 g2 = ((eaq)new kbq((lcq)new fbq((lcq)d, (lj6)new q9a((qsb)new qsb<fj4, fzv>(this, w4) {
                public final wi4 D0;
                public final w4 E0;
                
                public final Object invoke(final Object o) {
                    final fj4 fj4 = (fj4)o;
                    final wi4 d0 = this.D0;
                    czd.e((Object)fj4, "it");
                    final g3 a = this.E0.a();
                    String d2 = null;
                    Label_0054: {
                        if (a != null) {
                            final e4 b2 = a.B2();
                            if (b2 != null && (d2 = b2.D0) != null) {
                                break Label_0054;
                            }
                        }
                        d2 = "";
                    }
                    wi4.a(d0, fj4, d2);
                    return fzv.a;
                }
            }, 2)), (psb)new ut1((qsb)new qsb<fj4, lcq<? extends ynj<Boolean>>>(this) {
                public final wi4 D0;
                
                public final Object invoke(final Object o) {
                    czd.f((Object)o, "it");
                    final wi4 d0 = this.D0;
                    return d0.D0.get((Object)d0.G0);
                }
            }, 1))).G((lj6)new ft1((qsb)new qsb<ynj<Boolean>, fzv>(this) {
                public final wi4 D0;
                
                public final Object invoke(final Object o) {
                    final ynj ynj = (ynj)o;
                    final wi4 d0 = this.D0;
                    czd.e((Object)ynj, "isEnabled");
                    wi4.b(d0, ynj);
                    return fzv.a;
                }
            }, 3), (lj6)new ebk((qsb)wi4$e.D0, 1));
            final wc6 h0 = this.H0;
            czd.g((Object)h0, "compositeDisposable");
            h0.a(g2);
        }
        else {
            this.d(w4);
        }
    }
    
    public final void d(final w4 w4) {
        final lg3 lg3 = new lg3();
        final xx0 e = w4.e;
        e.g((f2)lg3);
        this.H0.a(as2.s((oj)new et1((Object)e, (Object)lg3, 1)));
        final h5j filter = this.E0.b().filter((ytk)new vi4((qsb)new qsb<Boolean, Boolean>(this, w4) {
            public final wi4 D0;
            public final w4 E0;
            
            public final Object invoke(final Object o) {
                final Boolean b = (Boolean)o;
                czd.f((Object)b, "enabledInSettings");
                return this.D0.F0.c(this.E0.b.m1, (boolean)b, false);
            }
        }, 0));
        final h5j hide = ((h5j)lg3.I0).hide();
        czd.e((Object)hide, "isAvailableSubject.hide()");
        final h5j combineLatest = h5j.combineLatest((taj)hide.filter((ytk)new di((qsb)new qsb<vg3, Boolean>(this) {
            public final wi4 D0;
            
            public final Object invoke(final Object o) {
                final vg3 vg3 = (vg3)o;
                czd.f((Object)vg3, "it");
                return czd.a((Object)this.D0.G0, (Object)vg3.d);
            }
        }, 0)).map((psb)new ui4((qsb)wi4$o.D0, 0)).startWith((Object)Boolean.FALSE), (taj)this.D0.get((Object)this.G0).P(), (zv1)new qi4((ftb)wi4$p.D0, 0));
        czd.e((Object)combineLatest, "combineLatest(\n         \u2026CaptionState.isPresent) }");
        final t19 subscribe = filter.filter((ytk)new ht1((qsb)wi4$f.D0, 1)).flatMap((psb)new di((qsb)new qsb<Boolean, taj<? extends Boolean>>(combineLatest) {
            public final h5j<Boolean> D0;
            
            public final Object invoke(final Object o) {
                czd.f((Object)o, "it");
                return this.D0;
            }
        }, 2)).filter((ytk)new vt1((qsb)wi4$h.D0, 1)).observeOn(gmw.H()).flatMapSingle((psb)new ut1((qsb)new qsb<Boolean, lcq<? extends fj4>>(this) {
            public final wi4 D0;
            
            public final Object invoke(final Object o) {
                czd.f((Object)o, "it");
                final wi4 d0 = this.D0;
                d0.N0.h();
                final haq d2 = d0.N0.d;
                czd.e((Object)d2, "viewStub.onViewInflatedSingle()");
                return d2;
            }
        }, 3)).doOnNext((lj6)new ft1((qsb)new qsb<fj4, fzv>(this, w4) {
            public final wi4 D0;
            public final w4 E0;
            
            public final Object invoke(final Object o) {
                final fj4 fj4 = (fj4)o;
                final wi4 d0 = this.D0;
                czd.e((Object)fj4, "it");
                final g3 a = this.E0.a();
                String d2 = null;
                Label_0055: {
                    if (a != null) {
                        final e4 b2 = a.B2();
                        if (b2 != null && (d2 = b2.D0) != null) {
                            break Label_0055;
                        }
                    }
                    d2 = "";
                }
                wi4.a(d0, fj4, d2);
                return fzv.a;
            }
        }, 5)).flatMapSingle((psb)new ut1((qsb)new qsb<fj4, lcq<? extends ynj<Boolean>>>(this) {
            public final wi4 D0;
            
            public final Object invoke(final Object o) {
                czd.f((Object)o, "it");
                final wi4 d0 = this.D0;
                return d0.D0.get((Object)d0.G0);
            }
        }, 2)).subscribe((lj6)new ft1((qsb)new qsb<ynj<Boolean>, fzv>(this) {
            public final wi4 D0;
            
            public final Object invoke(final Object o) {
                final ynj ynj = (ynj)o;
                final wi4 d0 = this.D0;
                czd.e((Object)ynj, "isEnabled");
                wi4.b(d0, ynj);
                return fzv.a;
            }
        }, 4), (lj6)new ebk((qsb)wi4$m.D0, 2));
        czd.e((Object)subscribe, "private fun observeClose\u2026.addTo(disposables)\n    }");
        rpb.e(subscribe, this.H0);
    }
    
    public final void g(final w4 w4) {
        czd.f((Object)w4, "attachment");
        final g3 a = w4.a();
        final etg etg = null;
        String d0 = null;
        Label_0048: {
            if (a != null) {
                final e4 b2 = a.B2();
                if (b2 != null) {
                    d0 = b2.D0;
                    break Label_0048;
                }
            }
            d0 = null;
        }
        String g0 = d0;
        if (d0 == null) {
            g0 = "";
        }
        this.G0 = g0;
        final i1 c1 = w4.b.c1;
        etg etg2 = etg;
        if (c1 instanceof etg) {
            etg2 = (etg)c1;
        }
        boolean n2 = false;
        Label_0123: {
            if (etg2 != null) {
                final bo6 e0 = etg2.E0;
                if (e0 != null) {
                    n2 = e0.N2();
                    break Label_0123;
                }
            }
            n2 = false;
        }
        final boolean b3 = w4.b.c1.getType() == 3;
        if (!g63.I(w4.a()) && !n2 && !b3) {
            final sx0 sx0 = new sx0(w4, (sx0$a)new dj4(this, w4));
            final xx0 e2 = w4.e;
            e2.g((f2)sx0);
            this.H0.a(as2.s((oj)new wg((Object)e2, (Object)sx0, 1)));
            if (czd.a((Object)this.G0, (Object)"")) {
                final swk swk = new swk((swk$a)new ge8((Object)this, (Object)w4, 4));
                final xx0 e3 = w4.e;
                e3.g((f2)swk);
                this.H0.a(as2.s((oj)new pi4((Object)e3, (Object)swk, 0)));
            }
            else {
                this.c(w4);
            }
            return;
        }
        final fj4 i0 = this.I0;
        if (i0 != null) {
            i0.a();
        }
    }
    
    public final void h() {
        final fj4 i0 = this.I0;
        if (i0 != null) {
            i0.b.setVisibility(8);
            i0.a.setVisibility(8);
            i0.a.setImageResource(17170445);
        }
    }
    
    public final void unbind() {
        this.H0.e();
    }
}
