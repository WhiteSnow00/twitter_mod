// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.carousel;

import android.view.ViewStub$OnInflateListener;
import android.view.ViewStub;
import com.twitter.android.liveevent.landing.LiveEventAppBarLayoutBehavior;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.util.List;
import com.twitter.android.liveevent.landing.scribe.a;

public final class d extends e7x implements b.a, puf
{
    public final a H0;
    public final b I0;
    public final gkp J0;
    public final fxe<l4e<dm3>> K0;
    public final fxe<c4e<dm3>> L0;
    public final om M0;
    public final com.twitter.android.liveevent.landing.scribe.a N0;
    public int O0;
    
    public d(final z7x z7x, final a h0, final b i0, final om m0, final com.twitter.android.liveevent.landing.scribe.a n0, final fxe<l4e<dm3>> k0, final fxe<c4e<dm3>> l0, final ibm ibm) {
        super(z7x);
        this.J0 = new gkp();
        this.H0 = h0;
        this.K0 = k0;
        this.I0 = i0;
        i0.c = (b.a)this;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        ibm.i((rj)new xak((Object)this, 2));
    }
    
    @Override
    public final void D() {
        this.H0.D0.k(8);
    }
    
    @Override
    public final void O(final List<dm3> list) {
        this.H0.D0.k(0);
        ((l4e)this.K0.get()).d((i4e)new skf((Iterable)list));
        this.J0.b(((b5j)this.M0.C0).doOnNext((fk6)new i0p((Object)this, 7)).filter((ptk)h71.L0).filter((ptk)new l71((Object)this, 15)).map((qtb)psf.D0).map((qtb)new yga((Object)this, 0)).subscribe((fk6)new shd((Object)this, 3), (fk6)thd.G0));
    }
    
    public final void e1(final ouf ouf) {
        final b i0 = this.I0;
        final bwf a = ouf.a;
        Objects.requireNonNull(i0);
        final mna o1 = c6e.j((Iterable)a.d).O1((otk)msf.d);
        if (o1.getSize() > 1) {
            Objects.requireNonNull(i0.a);
            if (dta.b().b("live_event_multi_video_enabled", false)) {
                i0.b.c = true;
                i0.c.O(o1.t3());
                return;
            }
        }
        i0.b.c = false;
        i0.c.D();
    }
    
    public static final class a extends el8
    {
        public final v53 D0;
        public RecyclerView E0;
        public LinearLayoutManager F0;
        
        public a(View viewById, final fxe<c4e<dm3>> fxe, final fxe<com.twitter.android.liveevent.landing.carousel.a> fxe2, final LiveEventAppBarLayoutBehavior liveEventAppBarLayoutBehavior) {
            viewById = viewById.findViewById(2131427527);
            super(viewById);
            final int a = w4j.a;
            final ViewStub viewStub = (ViewStub)viewById;
            this.D0 = new v53(viewStub);
            viewStub.setOnInflateListener((ViewStub$OnInflateListener)new qsf(this, liveEventAppBarLayoutBehavior, fxe, fxe2));
        }
    }
}
