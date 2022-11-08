// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero;

import android.view.View;
import com.twitter.media.ui.image.AspectRatioFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.twitter.android.liveevent.landing.hero.di.HeroObjectGraph;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import java.util.Objects;
import android.view.View$OnClickListener;

public final class c extends e7x implements b, szw$b, puf
{
    public final a H0;
    public final com.twitter.android.liveevent.landing.hero.a I0;
    public final com.twitter.android.liveevent.landing.scribe.a J0;
    public final vxf K0;
    public final avf L0;
    public final nvf M0;
    public final z59 N0;
    public final cn3 O0;
    public final d P0;
    public snj<bkc> Q0;
    public final ncq R0;
    public boolean S0;
    
    public c(final z7x z7x, final sso sso, final a h0, final com.twitter.android.liveevent.landing.hero.a a, final com.twitter.android.liveevent.landing.scribe.a j0, final vxf k0, final nvf m0, final d p12, final z59 n0, final avf l0, final cn3 o0, final ncq r0) {
        super(z7x);
        final snj b = snj.b;
        final int a2 = w4j.a;
        this.Q0 = (snj<bkc>)b;
        this.S0 = false;
        this.H0 = h0;
        this.I0 = a;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.P0 = p12;
        p12.a = (d.a)a;
        this.N0 = n0;
        this.O0 = o0;
        a.j = (b)this;
        this.R0 = r0;
        sso.a((vro)new com.twitter.android.liveevent.landing.hero.b(this));
        ((View)h0.b).setOnClickListener((View$OnClickListener)new ry((Object)this, 4));
    }
    
    @Override
    public final void E0() {
        ((View)this.H0.b).setVisibility(8);
    }
    
    public final void E1() {
        if (this.Q0.f()) {
            ((bkc)this.Q0.c()).a();
            ((ViewGroup)this.H0.a).removeAllViews();
        }
    }
    
    public final void F1(final bkc bkc) {
        final snj q0 = new snj((Object)bkc);
        this.Q0 = (snj<bkc>)q0;
        ((bkc)q0.c()).c();
    }
    
    @Override
    public final void G2() {
        this.S0 = this.K0.c();
    }
    
    @Override
    public final void U(final dm3 dm3) {
        if (this.Q0.f()) {
            ((bkc)this.Q0.c()).p(dm3);
        }
    }
    
    @Override
    public final void Z(final dm3 dm3) {
        this.E1();
        final int j = dm3.j;
        Label_0273: {
            Label_0194: {
                if (j != 0) {
                    if (j != 1) {
                        if (j == 2) {
                            break Label_0194;
                        }
                        if (j != 3) {
                            if (j != 5) {
                                this.E0();
                                return;
                            }
                            final avf l0 = this.L0;
                            final FrameLayout a = this.H0.a;
                            Objects.requireNonNull(l0);
                            zzd.f((Object)a, "heroContainerView");
                            l0.a();
                            final HeroObjectGraph b = l0.c.a(dm3).c((ViewGroup)a).b();
                            b.a();
                            this.F1(b.u5());
                            break Label_0273;
                        }
                    }
                    final avf l2 = this.L0;
                    final FrameLayout a2 = this.H0.a;
                    Objects.requireNonNull(l2);
                    zzd.f((Object)a2, "heroContainerView");
                    l2.a();
                    final HeroObjectGraph b2 = ((HeroObjectGraph.b)l2.b.a(dm3)).c((ViewGroup)a2).b();
                    b2.a();
                    final szw szw = (szw)b2.u5();
                    ((c)(szw.Y0 = (szw$b)this)).F1((bkc)szw);
                    break Label_0273;
                }
            }
            final avf l3 = this.L0;
            final FrameLayout a3 = this.H0.a;
            Objects.requireNonNull(l3);
            zzd.f((Object)a3, "heroContainerView");
            l3.a();
            final HeroObjectGraph b3 = ((HeroObjectGraph.b)l3.a).c((ViewGroup)a3).b();
            zzd.c((Object)(l3.d = b3));
            b3.a();
            final HeroObjectGraph d = l3.d;
            zzd.c((Object)d);
            this.F1(d.u5());
        }
        ((View)this.H0.b).setVisibility(0);
    }
    
    @Override
    public final boolean d1(final dm3 dm3) {
        return this.Q0.f() && ((bkc)this.Q0.c()).g(dm3.j);
    }
    
    public final void e1(final ouf ouf) {
        final cn3 o0 = this.O0;
        Object o2;
        if ((o2 = ouf.b) == null) {
            o2 = v2a.C0;
        }
        Objects.requireNonNull(o0);
        o0.a = c6e.j((Iterable)o2);
        final com.twitter.android.liveevent.landing.hero.a i0 = this.I0;
        final bwf a = ouf.a;
        String a2;
        if (i0.k.f()) {
            a2 = ((dm3)i0.k.c()).a;
        }
        else {
            a2 = null;
        }
        final qof a3 = a.a;
        i0.l = (a3 != null && a3.l);
        i0.f(a.d, a2);
    }
    
    public final void i1() {
        this.E0();
    }
    
    @Override
    public final void o2() {
        this.H0.b.setMaxHeight(this.R0.b / 2);
    }
    
    @Override
    public final void w1() {
        this.E1();
        final snj b = snj.b;
        final int a = w4j.a;
        this.Q0 = (snj<bkc>)b;
        this.L0.a();
        final com.twitter.android.liveevent.landing.hero.a i0 = this.I0;
        i0.j = com.twitter.android.liveevent.landing.hero.a.b.r0;
        final hsf d = i0.d;
        Objects.requireNonNull(d);
        d.C0 = (hsf.a)hfe.c;
        final tuf e = i0.e;
        Objects.requireNonNull(e);
        e.E0 = (tuf$a)eta.c;
        i0.k = (snj<dm3>)b;
        i0.h.a();
        final vxf k0 = this.K0;
        k0.b.dispose();
        k0.c.a.e((AppBarLayout.OnOffsetChangedListener)k0);
    }
    
    @Override
    public final void x1() {
        this.N0.c((c69)this.M0);
        this.N0.c((c69)this.P0);
    }
    
    @Override
    public final void y1() {
        this.N0.b((c69)this.M0);
        this.N0.b((c69)this.P0);
    }
    
    public static final class a
    {
        public final FrameLayout a;
        public final AspectRatioFrameLayout b;
        
        public a(final View view) {
            this.b = (AspectRatioFrameLayout)view.findViewById(2131427543);
            this.a = (FrameLayout)view.findViewById(2131427540);
        }
    }
}
