import com.twitter.app.common.inject.view.ViewObjectGraph;
import com.twitter.app.common.inject.retained.RetainedObjectGraph;
import com.twitter.fleets.di.retained.FleetsLegacyRetainedObjectGraph;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.twitter.fleets.di.view.FleetsLegacyViewObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x3b implements n6t
{
    public final yrq a;
    public final FleetsLegacyViewObjectGraph b;
    public final a5b c;
    public final wc6 d;
    public boolean e;
    
    public x3b(final yrq a, final r8x r8x, final umd umd, final cnb cnb, final qn qn, final wjf wjf, final epi<cxs> epi) {
        czd.f((Object)a, "spacesHomeConfiguration");
        czd.f((Object)r8x, "viewLifecycle");
        czd.f((Object)qn, "globalLifeCycle");
        czd.f((Object)wjf, "listFetcher");
        czd.f((Object)epi, "listNotifier");
        this.a = a;
        final wc6 d = new wc6();
        this.d = d;
        final t19 subscribe = r8x.b().subscribe((lj6)new ri4((qsb)new x3b$a(this), 10));
        czd.e((Object)subscribe, "viewLifecycle\n          \u2026iteDisposable.dispose() }");
        rpb.T(d, subscribe);
        final FleetsLegacyRetainedObjectGraph e7 = ((p4b)umd.o()).e7();
        final FleetsLegacyViewObjectGraph b = (FleetsLegacyViewObjectGraph)((RetainedObjectGraph)e7).h1().e((Activity)cnb).d((Fragment)umd).a(r8x).b();
        this.b = b;
        ((d8x)((co1)b).B((Class)d8x.class)).a();
        this.c = b.A8();
        final h5j b2 = qn.w((Activity)cnb).b();
        final w19 w19 = new w19();
        w19.c(b2.subscribe((lj6)new f$e1((qsb)new x3b$d(w19, this, e7))));
        wjf.F0((qsb)new x3b$b((epi)epi, this));
        final t19 subscribe2 = ((h5j)b.U()).doOnNext((lj6)new q9a((qsb)new x3b$c(this), 9)).subscribe();
        czd.e((Object)subscribe2, "getRefreshObservable()\n \u2026\n            .subscribe()");
        rpb.T(d, subscribe2);
    }
    
    public final nnl<tmi> J() {
        return (nnl<tmi>)this.b.J();
    }
    
    public final nnl<Boolean> K() {
        return (nnl<Boolean>)this.b.K();
    }
    
    public final nnl<tmi> U() {
        return (nnl<tmi>)this.b.U();
    }
    
    public final pm6 getView() {
        final pm6 c = ((ViewObjectGraph)this.b).c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("FleetsViewObjectGraph.contentView was null".toString());
    }
    
    public final boolean isEnabled() {
        return this.a.a();
    }
}
