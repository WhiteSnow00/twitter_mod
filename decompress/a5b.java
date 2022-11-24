import com.twitter.app.common.inject.view.ViewObjectGraph;
import com.twitter.app.common.inject.retained.RetainedObjectGraph;
import com.twitter.fleets.di.retained.FleetsLegacyRetainedObjectGraph;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.twitter.fleets.di.view.FleetsLegacyViewObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5b implements h7t
{
    public final wsq a;
    public final FleetsLegacyViewObjectGraph b;
    public final d6b c;
    public final de6 d;
    public boolean e;
    
    public a5b(final wsq a, final k9x k9x, final und und, final dob dob, final un un, final ukf ukf, final vpi<vxs> vpi) {
        e0e.f((Object)a, "spacesHomeConfiguration");
        e0e.f((Object)k9x, "viewLifecycle");
        e0e.f((Object)un, "globalLifeCycle");
        e0e.f((Object)ukf, "listFetcher");
        e0e.f((Object)vpi, "listNotifier");
        this.a = a;
        final de6 d = new de6();
        this.d = d;
        final b39 subscribe = k9x.b().subscribe((rk6)new au1((stb)new stb<kni, vzv>(this) {
            public final a5b F0;
            
            public final Object invoke(final Object o) {
                final kni kni = (kni)o;
                this.F0.d.dispose();
                return vzv.a;
            }
        }, 6));
        e0e.e((Object)subscribe, "viewLifecycle\n          \u2026iteDisposable.dispose() }");
        p0b.J(d, subscribe);
        final FleetsLegacyRetainedObjectGraph e7 = ((t5b)und.o()).e7();
        final FleetsLegacyViewObjectGraph b = (FleetsLegacyViewObjectGraph)((RetainedObjectGraph)e7).h1().e((Activity)dob).d((Fragment)und).a(k9x).b();
        this.b = b;
        ((w8x)((io1)b).B((Class)w8x.class)).a();
        this.c = b.A8();
        final t5j b2 = un.w((Activity)dob).b();
        final e39 e8 = new e39();
        e8.c(b2.subscribe((rk6)new f$e1((stb)new stb<chj, vzv>(e8, this, e7) {
            public final e39 F0;
            public final a5b G0;
            public final FleetsLegacyRetainedObjectGraph H0;
            
            public final Object invoke(final Object o) {
                final chj chj = (chj)o;
                omi.B((io1)this.G0.b);
                if (chj.G0 && !chj.F0.isChangingConfigurations()) {
                    omi.B((io1)this.H0);
                }
                this.F0.a();
                return vzv.a;
            }
        })));
        ukf.F0((stb)new stb<nkf$b, vzv>(vpi, this) {
            public final vpi<vxs> F0;
            public final a5b G0;
            
            public final Object invoke(final Object o) {
                e0e.f((Object)o, "it");
                if (((fj8)this.F0).c()) {
                    final p4e f = ((fj8)this.F0).f();
                    e0e.e((Object)f, "listNotifier.items");
                    if (qjy.u() && f instanceof fld) {
                        final a5b g0 = this.G0;
                        g0.c.a((fld)f, g0.e);
                        this.G0.e = false;
                    }
                }
                return vzv.a;
            }
        });
        final b39 subscribe2 = ((t5j)b.U()).doOnNext((rk6)new bu1((stb)new stb<kni, vzv>(this) {
            public final a5b F0;
            
            public final Object invoke(final Object o) {
                final kni kni = (kni)o;
                this.F0.e = true;
                return vzv.a;
            }
        }, 4)).subscribe();
        e0e.e((Object)subscribe2, "getRefreshObservable()\n \u2026\n            .subscribe()");
        p0b.J(d, subscribe2);
    }
    
    public final znl<kni> J() {
        return (znl<kni>)this.b.J();
    }
    
    public final znl<Boolean> K() {
        return (znl<Boolean>)this.b.K();
    }
    
    public final znl<kni> U() {
        return (znl<kni>)this.b.U();
    }
    
    public final vn6 getView() {
        final vn6 c = ((ViewObjectGraph)this.b).c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("FleetsViewObjectGraph.contentView was null".toString());
    }
    
    public final boolean isEnabled() {
        return this.a.a();
    }
}
