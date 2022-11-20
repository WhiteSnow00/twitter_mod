// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tv.periscope.model.b;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveEventMetadataResponse extends fih<yvf>
{
    @JsonField
    public gwf$a a;
    @JsonField
    public gwf$b b;
    
    public final Object s() {
        final gwf$a a = this.a;
        jee.l((Object)a);
        final gwf$b b = this.b;
        jee.l((Object)b);
        final qjg t = qjg.t();
        t.x(b.e);
        final Iterator iterator = b.d.entrySet().iterator();
        while (iterator.hasNext()) {
            final String f = ((Map.Entry<K, deq>)iterator.next()).getValue().f;
            if (b.e.containsKey(f)) {
                final nh0 nh0 = b.e.get(f);
                final Map f2 = b.f;
                jee.l((Object)nh0);
                nh0 nh2 = nh0;
                if (f2.containsKey(nh0.E0.e())) {
                    final nh0$a nh0$a = new nh0$a(nh0);
                    nh0$a.r((cgv)b.f.get(nh0.E0.e()));
                    nh2 = (nh0)((n4j)nh0$a).e();
                }
                t.w((Object)f, (Object)nh2);
            }
        }
        final Map a2 = b.a;
        final Map b2 = b.b;
        final Map c = b.c;
        final Map d = b.d;
        final Map map = (Map)((n4j)t).e();
        final Map f3 = b.f;
        Object d2;
        if ((d2 = a2) == null) {
            d2 = k2a.D0;
        }
        Object d3;
        if ((d3 = b2) == null) {
            d3 = k2a.D0;
        }
        Object d4;
        if ((d4 = c) == null) {
            d4 = k2a.D0;
        }
        Object d5;
        if ((d5 = d) == null) {
            d5 = k2a.D0;
        }
        Object d6;
        if ((d6 = f3) == null) {
            d6 = k2a.D0;
        }
        final cof cof = (cof)((Map)d4).get(a.a);
        cof a3;
        if (cof == null) {
            a3 = null;
        }
        else {
            a3 = cof;
            if (cof.g != null) {
                final cof$a cof$a = new cof$a(cof.a);
                cof$a.b = cof.b;
                cof$a.c = cof.c;
                cof$a.d = cof.d;
                cof$a.e = cof.e;
                cof$a.f = cof.f;
                cof$a.g = cof.g;
                cof$a.h = cof.h;
                cof$a.i = cof.i;
                cof$a.j = cof.j;
                cof$a.m = cof.l;
                cof$a.k = cof.k;
                cof$a.o(cof.m);
                cof$a.g = ((Map<K, cgv>)d6).get(cof.g.f().getStringId());
                a3 = (cof)((n4j)cof$a).e();
            }
        }
        final rif h = rif.H();
        for (final ll3 ll3 : a.d) {
            final ll3$a ll3$a = new ll3$a(ll3.a);
            final b b3 = ll3.b;
            ll3$a.b = b3;
            ll3$a.c = ll3.c;
            ll3$a.d = ll3.e;
            ll3$a.e = ll3.f;
            ll3$a.f = ll3.g;
            ll3$a.g = ll3.d;
            ll3$a.i = ll3.i;
            ll3$a.h = ll3.h;
            if (b3 != null) {
                ll3$a.b = ((Map<K, b>)d2).get(b3.w());
            }
            final rof c2 = ll3.c;
            if (c2 != null) {
                final rof rof = ((Map<K, rof>)d3).get(c2.a);
                final String e = rof.e;
                Objects.requireNonNull(e);
                final cgv j = ((Map<K, cgv>)d6).get(e);
                rof c3 = rof;
                if (j != null) {
                    final rof$a rof$a = new rof$a(rof.a);
                    rof$a.b = rof.b;
                    rof$a.c = rof.c;
                    rof$a.d = rof.d;
                    rof$a.e = rof.e;
                    rof$a.f = rof.f;
                    rof$a.g = rof.g;
                    rof$a.h = rof.h;
                    rof$a.i = rof.i;
                    rof$a.j = j;
                    c3 = new rof(rof$a);
                }
                ll3$a.c = c3;
            }
            final deq e2 = ll3.e;
            if (e2 != null) {
                ll3$a.d = ((Map<K, deq>)d5).get(e2.a);
            }
            final deq d7 = ll3.d;
            if (d7 != null) {
                ll3$a.g = ((Map<K, deq>)d5).get(d7.a);
            }
            final ll3 ll4 = (ll3)((n4j)ll3$a).e();
            final int i = ll4.j;
            final boolean b4 = false;
            boolean b5 = false;
            Label_1044: {
                Label_1042: {
                    Label_1037: {
                        if (i == 3) {
                            final lnu g = ll4.g;
                            if (g != null) {
                                final nh0 nh3 = map.get(g.a);
                                if (nh3 == null) {
                                    break Label_1042;
                                }
                                if ((nh3.I0.S0 & 0xC600) != 0x0) {
                                    break Label_1037;
                                }
                                break Label_1042;
                            }
                        }
                        if (i == -1) {
                            break Label_1042;
                        }
                    }
                    b5 = true;
                    break Label_1044;
                }
                b5 = false;
            }
            if (b5) {
                final int k = ll4.j;
                int n = 0;
                Label_1356: {
                    if (k != 0) {
                        String s = "";
                        if (k != 1) {
                            if (k != 2) {
                                if (k != 3) {
                                    if (k != 5) {
                                        n = (b4 ? 1 : 0);
                                        break Label_1356;
                                    }
                                    final rof c4 = ll4.c;
                                    n = (b4 ? 1 : 0);
                                    if (c4 == null) {
                                        break Label_1356;
                                    }
                                    if (ikr.e((CharSequence)c4.e)) {
                                        n = (b4 ? 1 : 0);
                                        break Label_1356;
                                    }
                                    final String e3 = c4.e;
                                    if (e3 != null) {
                                        s = e3;
                                    }
                                    n = (gwf.a((cgv)((Map<K, cgv>)d6).get(s)) ? 1 : 0);
                                    break Label_1356;
                                }
                                else {
                                    final lnu g2 = ll4.g;
                                    if (g2 == null) {
                                        n = (b4 ? 1 : 0);
                                        break Label_1356;
                                    }
                                    final nh0 nh4 = map.get(g2.a);
                                    cgv e4;
                                    if (nh4 != null) {
                                        e4 = nh4.E0;
                                    }
                                    else {
                                        e4 = null;
                                    }
                                    n = (gwf.a(e4) ? 1 : 0);
                                    break Label_1356;
                                }
                            }
                        }
                        else {
                            final b b6 = ll4.b;
                            n = (b4 ? 1 : 0);
                            if (b6 == null) {
                                break Label_1356;
                            }
                            if (ikr.e((CharSequence)b6.e0())) {
                                n = (b4 ? 1 : 0);
                                break Label_1356;
                            }
                            final String e5 = b6.e0();
                            if (e5 != null) {
                                s = e5;
                            }
                            n = (gwf.a((cgv)((Map<K, cgv>)d6).get(s)) ? 1 : 0);
                            break Label_1356;
                        }
                    }
                    final deq e6 = ll4.e;
                    n = (b4 ? 1 : 0);
                    if (e6 != null) {
                        if (ikr.e((CharSequence)e6.f)) {
                            n = (b4 ? 1 : 0);
                        }
                        else {
                            final nh0 nh5 = map.get(e6.f);
                            cgv e7;
                            if (nh5 != null) {
                                e7 = nh5.E0;
                            }
                            else {
                                e7 = null;
                            }
                            n = (gwf.a(e7) ? 1 : 0);
                        }
                    }
                }
                if (n != 0) {
                    continue;
                }
                h.p((Object)ll4);
            }
        }
        final List list = (List)((n4j)h).e();
        final mvf$a mvf$a = new mvf$a();
        mvf$a.a = a3;
        mvf$a.o(list);
        mvf$a.e = new ArrayList(((Map<K, cgv>)d6).values());
        mvf$a.f = a.e;
        mvf$a.b = a.c;
        mvf$a.c = a.b;
        return new yvf((mvf)((n4j)mvf$a).e(), map);
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static final class JsonResponse extends fih<gwf$a>
    {
        @JsonField
        public List<ll3> a;
        @JsonField
        public cof b;
        @JsonField
        public z0g c;
        @JsonField(name = { "polling_interval_seconds" })
        public int d;
        @JsonField
        public String e;
        
        public final Object s() {
            final cof b = this.b;
            String a;
            if (b != null) {
                jee.l((Object)b);
                a = b.a;
            }
            else {
                a = "";
            }
            final String e = this.e;
            final int d = this.d;
            final z0g c = this.c;
            Object o;
            if ((o = this.a) == null) {
                o = f2a.D0;
            }
            return new gwf$a(a, e, d, c, (List)o);
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static final class JsonTwitterObjects extends fih<gwf$b>
    {
        @JsonField
        public Map<String, b> a;
        @JsonField
        public Map<String, rof> b;
        @JsonField
        public Map<String, cof> c;
        @JsonField
        public Map<String, deq> d;
        @JsonField
        public Map<String, nh0> e;
        @JsonField
        public Map<String, cgv> f;
        
        public final Object s() {
            return new gwf$b((Map)this.a, (Map)this.b, (Map)this.c, (Map)this.d, (Map)this.e, (Map)this.f);
        }
    }
}
