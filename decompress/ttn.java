import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ttn implements gok
{
    public static final /* synthetic */ soe<Object>[] V0;
    public final Context C0;
    public final f4 D0;
    public final zml<x1> E0;
    public final zml<x1> F0;
    public final ibm G0;
    public final bra<u4, gok> H0;
    public final m6n I0;
    public final otn J0;
    public final peo K0;
    public final zps L0;
    public long M0;
    public long N0;
    public boolean O0;
    public final ttn$f P0;
    public rtb<? super v21, oyv> Q0;
    public float R0;
    public Long S0;
    public final zml<slk> T0;
    public final b5j<ntn> U0;
    
    static {
        V0 = new soe[] { (soe)aob.f(ttn.class, "playbackState", "getPlaybackState$subsystem_tfa_rooms_core_release()Lcom/twitter/rooms/playback/RoomPlaybackManager$AudioSpacePlaybackState;", 0) };
    }
    
    public ttn(final Context c0, final f4 d0, final zml<x1> e0, final zml<x1> f0, final ibm g0, final bra<u4, gok> h0, final b1o b1o, final m6n i0, final otn j0, final peo k0, final zps l0) {
        zzd.f((Object)c0, "context");
        zzd.f((Object)d0, "avPlaybackManager");
        zzd.f((Object)e0, "hydraAVEventPublishSubject");
        zzd.f((Object)f0, "replayEventPublishSubject");
        zzd.f((Object)g0, "releaseCompletable");
        zzd.f((Object)h0, "playtimeProviderFactory");
        zzd.f((Object)b1o, "roomPlaybackEventDispatcher");
        zzd.f((Object)i0, "roomAutoplayManager");
        zzd.f((Object)j0, "errorReporter");
        zzd.f((Object)k0, "roomTimestampRepository");
        zzd.f((Object)l0, "timeProvider");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = -1L;
        this.N0 = -1L;
        this.P0 = new ttn$f(this);
        this.Q0 = (rtb<? super v21, oyv>)ttn$e.C0;
        this.R0 = 1.0f;
        final zml t0 = new zml();
        this.T0 = (zml<slk>)t0;
        final zml zml = new zml();
        final b5j share = ((b5j)zml).share();
        zzd.e((Object)share, "publicErrorEventSubject.share()");
        this.U0 = (b5j<ntn>)share;
        g0.i((rj)new psn((Object)this, 1));
        final zml a = b1o.a;
        final m29 m29 = new m29();
        ((iz5)g0.D0).q((rj)new rj() {
            public final void run() {
                m29.a();
            }
        });
        m29.c(((b5j)a).subscribe((fk6)new f$d3((rtb)new ttn$h(this))));
        final b5j map = ((b5j)t0).doOnNext((fk6)new c5l((rtb)new ttn$a(this), 7)).map((qtb)new naf((rtb)ttn$b.C0, 9));
        zzd.e((Object)map, "internalErrorEventSubjec\u2026toRoomPlaybackErrorEvent)");
        final m29 m30 = new m29();
        ((iz5)g0.D0).q((rj)new rj() {
            public final void run() {
                m30.a();
            }
        });
        m30.c(map.subscribe((fk6)new f$d3((rtb)new ttn$j(zml))));
        if (oio.G()) {
            final b5j map2 = ((b5j)f0).throttleFirst(ytn.a, TimeUnit.SECONDS).ofType((Class)zgl.class).map((qtb)new i4i((rtb)ttn$c.C0, 23));
            zzd.e((Object)map2, "replayEventPublishSubjec\u2026.avProgress.isComplete) }");
            final m29 m31 = new m29();
            ((iz5)g0.D0).q((rj)new rj() {
                public final void run() {
                    m31.a();
                }
            });
            m31.c(map2.subscribe((fk6)new f$d3((rtb)new ttn$l(this))));
        }
    }
    
    public static final void a(final ttn ttn, final v21 v21, final emk emk) {
        ttn.h();
        final Context c0 = ttn.C0;
        zzd.f((Object)c0, "context");
        final u4 a = ttn.D0.a(rtn.d(c0, (i1)((h4j)rtn.b(v21, (String)null)).e(), (zkk)new ptn(), false));
        final List c2 = rtn.c(a, (otb)new xtn((Object)ttn), (zml)ttn.E0, (zml)ttn.F0, (zml)ttn.T0, emk);
        final Object a2 = ttn.H0.a((Object)a);
        zzd.e(a2, "playtimeProviderFactory.create(newAttachment)");
        ttn.g(new ttn.ttn$d(a, v21, c2, (gok)a2, rp2.o0(emk)));
        ttn.S0 = r9i.e();
        ttn.f();
    }
    
    public final long b() {
        final ttn.ttn$d c = this.c();
        Long value = null;
        Label_0033: {
            if (c != null) {
                final gok d = c.d;
                if (d != null) {
                    value = d.b();
                    break Label_0033;
                }
            }
            value = null;
        }
        if (value != null && value != 0L) {
            return value;
        }
        return r9i.e();
    }
    
    public final ttn.ttn$d c() {
        return (ttn.ttn$d)((e9j)this.P0).c((Object)this, (soe)ttn.V0[0]);
    }
    
    public final long d() {
        final ttn.ttn$d c = this.c();
        if (c != null) {
            final gok d = c.d;
            if (d != null) {
                return d.d();
            }
        }
        return 0L;
    }
    
    public final void e() {
        final ttn.ttn$d c = this.c();
        if (c == null) {
            return;
        }
        final u4 a = c.a;
        int n;
        if (c.e) {
            n = 1;
        }
        else {
            n = 2;
        }
        a.j(n);
    }
    
    public final void f() {
        final ttn.ttn$d c = this.c();
        if (c == null) {
            return;
        }
        c.a.q();
        c.a.p(false);
    }
    
    public final void g(final ttn.ttn$d ttn$d) {
        ((e9j)this.P0).d((Object)this, (soe)ttn.V0[0], (Object)ttn$d);
    }
    
    public final void h() {
        final ttn.ttn$d c = this.c();
        if (c == null) {
            return;
        }
        c.a.e.Z((Collection)c.c);
        this.D0.b(c.a, false);
        this.Q0.invoke((Object)c.b);
        final m6n i0 = this.I0;
        i0.f = null;
        i0.e = null;
        this.g(null);
        this.S0 = null;
        this.R0 = 1.0f;
    }
    
    public final boolean k(final h54 h54) {
        final ttn.ttn$d c = this.c();
        if (c != null) {
            final gok d = c.d;
            if (d != null) {
                return d.k(h54);
            }
        }
        return true;
    }
    
    public final long l() {
        final ttn.ttn$d c = this.c();
        if (c != null) {
            final gok d = c.d;
            if (d != null) {
                return d.l();
            }
        }
        return r9i.e();
    }
    
    public final long p() {
        final ttn.ttn$d c = this.c();
        if (c != null) {
            final gok d = c.d;
            if (d != null) {
                return d.p();
            }
        }
        return 0L;
    }
    
    public final String z() {
        final ttn.ttn$d c = this.c();
        if (c != null) {
            final gok d = c.d;
            if (d != null) {
                return d.z();
            }
        }
        return null;
    }
}
