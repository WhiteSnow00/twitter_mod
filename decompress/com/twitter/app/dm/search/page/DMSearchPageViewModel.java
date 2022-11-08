// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.search.page;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import com.twitter.async.http.HttpRequestResultException;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003\u0005\u0006\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/app/dm/search/page/DMSearchPageViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lm08;", "Lwz7;", "Ltz7;", "g", "h", "i", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class DMSearchPageViewModel extends MviViewModel<m08, wz7, tz7>
{
    public static final /* synthetic */ soe<Object>[] Z0;
    public final h28 N0;
    public final UserIdentifier O0;
    public final gs7 P0;
    public final kz7 Q0;
    public final boolean R0;
    public final boolean S0;
    public final boolean T0;
    public final boolean U0;
    public final ww7<ls7, xr7, fs7> V0;
    public final zml<i> W0;
    public final zml<h> X0;
    public final gyh Y0;
    
    static {
        Z0 = new soe[] { (soe)hi.m(DMSearchPageViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public DMSearchPageViewModel(final h28 n0, final ibm ibm, final UserIdentifier o0, final gs7 p10, final kz7 q0, final boolean r0, final boolean s0, final boolean t0, final boolean u0, final ww7<ls7, xr7, fs7> v0) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)o0, "owner");
        zzd.f((Object)p10, "searchRepository");
        zzd.f((Object)q0, "itemTextFormatter");
        zzd.f((Object)v0, "searchController");
        super((fae)ibm, (oax)new m08.b(false, "", n0));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p10;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = v0;
        final zml w0 = new zml();
        this.W0 = (zml<i>)w0;
        final zml x0 = new zml();
        this.X0 = (zml<h>)x0;
        final b5j switchMapSingle = ((b5j)w0).distinctUntilChanged((fw1)new l08((gub)DMSearchPageViewModel$a.C0, 0)).switchMapSingle((qtb)new d9v((rtb)new rtb<i, ubq<? extends m08>>() {
            public final /* synthetic */ DMSearchPageViewModel C0;
            
            public final Object invoke(final Object o) {
                final i i = (i)o;
                zzd.f((Object)i, "request");
                final String a = i.a();
                final DMSearchPageViewModel c0 = this.C0;
                final a a2 = new a(i, c0, a);
                final soe<Object>[] z0 = DMSearchPageViewModel.Z0;
                c0.Q((rtb)a2);
                n9q n9q;
                if (ckr.h1((CharSequence)a)) {
                    n9q = n9q.v((Object)new m08.b(false, a, this.C0.N0));
                }
                else {
                    final DMSearchPageViewModel c2 = this.C0;
                    n9q = c2.P0.a(c2.N0, a, c2.R0, c2.S0, c2.T0, c2.U0, (String)null).w((qtb)new kla((rtb)new b(this.C0, a), 8)).A((qtb)new jl2((Object)this.C0, (Object)a, 1));
                }
                return n9q;
            }
        }, 4));
        zzd.e((Object)switchMapSingle, "searchRequests.distinctU\u2026}\n            }\n        }");
        this.B(switchMapSingle, (rtb)new rtb<oyh<m08, m08>, oyv>() {
            public final /* synthetic */ DMSearchPageViewModel C0;
            
            public final Object invoke(final Object o) {
                final oyh oyh = (oyh)o;
                zzd.f((Object)oyh, "$this$intoWeaver");
                oyh.e((gub)new c(this.C0, (ap6)null));
                oyh.c((gub)new d(this.C0, (ap6)null));
                return oyv.a;
            }
        });
        this.B(v0.b(), (rtb)new rtb<oyh<m08, ls7>, oyv>() {
            public final /* synthetic */ DMSearchPageViewModel C0;
            
            public final Object invoke(final Object o) {
                final oyh oyh = (oyh)o;
                zzd.f((Object)oyh, "$this$intoWeaver");
                oyh.e((gub)new f(this.C0, (ap6)null));
                oyh.c((gub)new com.twitter.app.dm.search.page.g(this.C0, (ap6)null));
                return oyv.a;
            }
        });
        final b5j switchMapSingle2 = ((b5j)x0).distinctUntilChanged().switchMapSingle((qtb)new di((rtb)new rtb<h, ubq<? extends ks7>>() {
            public final /* synthetic */ DMSearchPageViewModel C0;
            
            public final Object invoke(final Object o) {
                final h h = (h)o;
                zzd.f((Object)h, "page");
                Object c2;
                if (h instanceof DMSearchPageViewModel$h$b) {
                    final DMSearchPageViewModel c0 = this.C0;
                    final gs7 p = c0.P0;
                    final h28 n0 = c0.N0;
                    final DMSearchPageViewModel$h$b dmSearchPageViewModel$h$b = (DMSearchPageViewModel$h$b)h;
                    final n9q a = p.a(n0, dmSearchPageViewModel$h$b.a, c0.R0, c0.S0, c0.T0, c0.U0, dmSearchPageViewModel$h$b.b);
                    final m5 m5 = new m5(this.C0, 0);
                    Objects.requireNonNull(a);
                    c2 = new obq((ubq)a, (qtb)m5, (Object)null);
                }
                else {
                    if (!zzd.a((Object)h, (Object)DMSearchPageViewModel$h$a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2 = lbq.C0;
                }
                return c2;
            }
        }, 7));
        zzd.e((Object)switchMapSingle2, "pageRequests.distinctUnt\u2026)\n            }\n        }");
        this.B(switchMapSingle2, (rtb)new rtb<oyh<m08, ks7>, oyv>() {
            public final /* synthetic */ DMSearchPageViewModel C0;
            
            public final Object invoke(final Object o) {
                final oyh oyh = (oyh)o;
                zzd.f((Object)oyh, "$this$intoWeaver");
                oyh.e((gub)new com.twitter.app.dm.search.page.h(this.C0, (ap6)null));
                oyh.c((gub)new com.twitter.app.dm.search.page.i(this.C0, (ap6)null));
                return oyv.a;
            }
        });
        this.Y0 = oyz.f0(this, (rtb)new rtb<iyh<wz7>, oyv>() {
            public final /* synthetic */ DMSearchPageViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)wz7$h.class), (gub)new j(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wz7$i.class), (gub)new l(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wz7$g.class), (gub)new m(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wz7$c.class), (gub)new n(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wz7$f.class), (gub)new o(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wz7$j.class), (gub)new p(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wz7$d.class), (gub)new q(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wz7$b.class), (gub)new r(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wz7$a.class), (gub)new s(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)wz7$e.class), (gub)new k(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public static final m08 W(final DMSearchPageViewModel dmSearchPageViewModel, final Throwable t, final String s) {
        Objects.requireNonNull(dmSearchPageViewModel);
        Object o;
        if (t instanceof HttpRequestResultException && ((HttpRequestResultException)t).D0 == 0) {
            o = new m08$c$a(false, s);
        }
        else {
            o = new m08$c$c(false, s);
        }
        return (m08)o;
    }
    
    public final String X() {
        final int ordinal = ((Enum)this.N0).ordinal();
        String s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s = "messages";
                }
                else {
                    s = "groups";
                }
            }
            else {
                s = "people";
            }
        }
        else {
            s = "all";
        }
        return s;
    }
    
    public final m08 Y(final beq<? extends iz7> beq, final String s, final List<? extends wx7> list) {
        String b = beq.a.b;
        boolean b2 = true;
        if (b == null || (!list.isEmpty() && !(beq.b.isEmpty() ^ true))) {
            b = null;
        }
        final List w1 = or4.W1((Collection)list, (gjp)new pyt(or4.w1((Iterable)beq.b), (gub)new DMSearchPageViewModel$k((List)list, this)));
        if (b == null) {
            b2 = false;
        }
        return new m08.a(false, s, this.Z(w1, false, b2), b);
    }
    
    public final List<wx7> Z(List<? extends wx7> list, final boolean b, final boolean b2) {
        if (this.N0 == h28.C0) {
            return list;
        }
        final Iterator iterator = list.iterator();
        while (true) {
            Object next;
            do {
                final boolean hasNext = iterator.hasNext();
                wx7$f wx7$f = null;
                if (!hasNext) {
                    next = null;
                    if (next instanceof wx7$f) {
                        wx7$f = (wx7$f)next;
                    }
                    if (wx7$f == null) {
                        list = or4.Y1((Collection)list, (Object)new wx7$f(b, b2, this.N0));
                    }
                    else if (list.indexOf(wx7$f) != tdy.S(list) || wx7$f.a != b) {
                        list = or4.Y1((Collection)or4.T1((Iterable)list, (Object)wx7$f), (Object)new wx7$f(b, b2, this.N0));
                    }
                    return list;
                }
                next = iterator.next();
            } while (!(((wx7)next) instanceof wx7$f));
            continue;
        }
    }
    
    public final iyh<wz7> v() {
        return (iyh<wz7>)this.Y0.a((soe)DMSearchPageViewModel.Z0[0]);
    }
    
    public interface g
    {
        DMSearchPageViewModel a(final h28 p0);
    }
    
    public abstract static class h
    {
    }
    
    public abstract static class i
    {
        public final String a;
        
        public i(final String a) {
            this.a = a;
        }
        
        public String a() {
            return this.a;
        }
    }
}
