// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.inbox;

import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import kotlin.Metadata;

@a91
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/dm/inbox/DMInboxController;", "", "Companion", "a", "b", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class DMInboxController
{
    public static final a Companion;
    public final Context a;
    public final UserIdentifier b;
    public final ocw c;
    public final boolean d;
    public final uom e;
    public final qk7 f;
    public final ibm g;
    public lcv<yp7> h;
    public gid i;
    public boolean j;
    public boolean k;
    public final x5m l;
    public final rd6 m;
    public final t9j<j48> n;
    public final t9j<lid> o;
    public i06 p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    
    static {
        Companion = new a();
    }
    
    public DMInboxController(final Bundle bundle, final gid i, final Context a, final UserIdentifier b, final ocw c, final boolean d, final uom e, final p9s p9s, final qk7 f, final ibm g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.m = new rd6();
        final String o = g9m.a((Class)j48.class).o();
        final String s = "anonymous";
        String s2 = o;
        if (o == null) {
            s2 = "anonymous";
        }
        this.n = (t9j<j48>)p9s.b((Class)j48.class, s2);
        String o2 = g9m.a((Class)lid.class).o();
        if (o2 == null) {
            o2 = s;
        }
        final t9j b2 = p9s.b((Class)lid.class, o2);
        final b5j a2 = b2.a();
        final m29 m29 = new m29();
        ((iz5)g.D0).q((rj)new DMInboxController$d(m29));
        m29.c(a2.subscribe((fk6)new f$q0((rtb)new rtb<lid, oyv>() {
            public final /* synthetic */ DMInboxController C0;
            
            public final Object invoke(final Object o) {
                final lid lid = (lid)o;
                if (!((ksc)lid).T().b && !((cw0)lid).N()) {
                    p88.f().b(2131955065, 1);
                }
                else {
                    this.C0.v = (lid.r1 ^ true);
                }
                return oyv.a;
            }
        })));
        this.o = (t9j<lid>)b2;
        this.p = new i06();
        this.v = true;
        this.i = i;
        this.a();
        n8r.restoreFromBundle(this, bundle);
        this.l = new x5m((Runnable)new iit((Object)this, 7), dta.b().h("dm_event_api_poll_interval_inbox", 60L) * 1000L);
    }
    
    public final void a() {
        this.s = this.c.A().a();
        this.t = this.c.A().b();
    }
    
    public final void b() {
        final i06 p = this.p;
        if (p.C0.get() != i06.G0 || p.E0 != null) {
            this.p.onComplete();
        }
    }
    
    public final void c() {
        final x28 a = x28.Companion.a(this.b);
        this.o.d((kmm)new lid(this.a, this.b, this.i, a.v2(), (qm7)a.M(), a.s7(), a.A(), a.T1()));
    }
    
    public final void d(final boolean b) {
        if (!b || !this.k) {
            if (b) {
                final lcv<yp7> h = this.h;
                if (h == null) {
                    zzd.m("listViewHost");
                    throw null;
                }
                h.d2();
                this.k = true;
            }
            final rd6 m = this.m;
            final uom e = this.e;
            m.a(e.a().w((qtb)new zg3((Object)e, 4)).G((fk6)new wt1((rtb)new rtb<j48, oyv>() {
                public final /* synthetic */ DMInboxController C0;
                
                public final Object invoke(final Object o) {
                    final j48 j48 = (j48)o;
                    final t9j<j48> n = this.C0.n;
                    zzd.e((Object)j48, "dmUpdatesRequest");
                    n.d((kmm)j48);
                    return oyv.a;
                }
            }, 6), (fk6)jvb.e));
            if (this.d) {
                this.f.b();
            }
        }
    }
    
    public static final class a
    {
    }
}
