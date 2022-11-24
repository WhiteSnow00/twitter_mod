import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;
import com.twitter.app.dm.DMConversationContentViewProvider;
import com.twitter.onboarding.ocf.d$g;
import com.twitter.onboarding.ocf.d$a;
import com.twitter.onboarding.ocf.d$h;
import com.twitter.onboarding.ocf.d$e;
import com.twitter.onboarding.ocf.d$i;
import com.twitter.onboarding.ocf.d$c;
import com.twitter.onboarding.ocf.d$d;
import j$.util.stream.Collectors;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Objects;
import com.twitter.onboarding.ocf.c;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ro9 implements rtb
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public ro9(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final Object apply(final Object o) {
        switch (this.F0) {
            default: {
                final List list = (List)this.G0;
                final Map map = (Map)this.H0;
                final Map map2 = (Map)o;
                final ojf$a ojf$a = new ojf$a(list.size());
                ((ojf)ojf$a).q((Iterable)map.values());
                ((ojf)ojf$a).q((Iterable)map2.values());
                return ((z4j)ojf$a).e();
            }
            case 2: {
                final c c = (c)this.G0;
                final fds fds = (fds)this.H0;
                final btm btm = (btm)o;
                Objects.requireNonNull(c);
                btm btm2;
                if (btm.d()) {
                    final List list2 = (List)Collection$_EL.stream((Collection)((ids)btm.c()).a.b).map((Function)jem.a).collect(Collectors.toList());
                    final tx6 i = bur.i;
                    final ojf h = ojf.H();
                    for (final bur bur : list2) {
                        Objects.requireNonNull(bur);
                        if (bur instanceof ppp) {
                            h.q((Iterable)bur.a());
                        }
                    }
                    final List list3 = (List)((z4j)h).e();
                    if (!list3.isEmpty()) {
                        c.b.a(list3);
                    }
                    btm2 = btm.e((Object)((ids)btm.c()).a);
                }
                else {
                    final zbv zbv = (zbv)btm.b();
                    if (kr4.s((Iterable)zbv)) {
                        btm2 = btm.a((Object)d$d.a);
                    }
                    else {
                        final wbv wbv = (wbv)kr4.p((Iterable)zbv);
                        vmw.g((Object)wbv);
                        final int a = wbv.a;
                        if (a == -2) {
                            final m9a m9a = new m9a((Throwable)new IllegalStateException("Got invalid response in OCF TaskRepository"));
                            ((HashMap<String, String>)m9a.a).put("flowToken", String.valueOf(fds.b));
                            ((HashMap<String, String>)m9a.a).put("flowName", String.valueOf(fds.e));
                            r9a.c(m9a);
                            btm2 = btm.a((Object)d$c.a);
                        }
                        else if (a == 85) {
                            btm2 = btm.a((Object)new d$i(wbv.b));
                        }
                        else if (a == 399) {
                            btm2 = btm.a((Object)new d$e(wbv.b));
                        }
                        else if (a == 398) {
                            btm2 = btm.a((Object)new d$h(wbv.b));
                        }
                        else if (kr4.s(n2v.h(zbv, 326)) ^ true) {
                            btm2 = btm.a((Object)d$a.a);
                        }
                        else {
                            btm2 = btm.a((Object)new d$g());
                        }
                    }
                }
                return btm2;
            }
            case 1: {
                final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)this.G0;
                final ex9 ex9 = (ex9)this.H0;
                final tjs$a tjs$a = (tjs$a)o;
                final sda d3 = DMConversationContentViewProvider.D3;
                Objects.requireNonNull(dmConversationContentViewProvider);
                Object o2;
                if (tjs$a instanceof tjs$a$b) {
                    final String a2 = dmConversationContentViewProvider.J2.a(((tjs$a$b)tjs$a).a);
                    if (a2.equals(ex9.R0)) {
                        o2 = rpg.F0;
                    }
                    else {
                        final ex9$b ex9$b = new ex9$b(ex9);
                        ex9$b.g = a2;
                        ex9$b.h = a2;
                        ex9$b.k = false;
                        final x99 x99 = new x99((jx9)new ex9(ex9$b));
                        dmConversationContentViewProvider.T1(new prg(x99));
                        if (tpz.R(Collections.singletonList(x99))) {
                            dmConversationContentViewProvider.C2.H0.V0.setVisibility(0);
                        }
                        o2 = dmConversationContentViewProvider.r3.a(x99, dmConversationContentViewProvider.i1).O();
                    }
                }
                else {
                    o2 = rpg.F0;
                }
                return o2;
            }
            case 0: {
                final nsm nsm = (nsm)this.G0;
                final po9 po9 = (po9)this.H0;
                final noj noj = (noj)o;
                Object o3 = po9;
                if (noj.f()) {
                    o3 = po9;
                    if (!((tsj)noj.c()).b.a.isEmpty()) {
                        o3 = new po9.a((tsj)noj.c(), nsm);
                    }
                }
                return o3;
            }
        }
    }
}
