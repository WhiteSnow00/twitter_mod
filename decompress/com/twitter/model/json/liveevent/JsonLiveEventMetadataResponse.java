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
public class JsonLiveEventMetadataResponse extends tih<twf>
{
    @JsonField
    public bxf$a a;
    @JsonField
    public bxf$b b;
    
    @Override
    public final Object s() {
        final bxf$a a = this.a;
        vmw.g((Object)a);
        final bxf$b b = this.b;
        vmw.g((Object)b);
        final kkg t = kkg.t();
        t.x(b.e);
        final Iterator iterator = b.d.entrySet().iterator();
        while (iterator.hasNext()) {
            final String f = ((Map.Entry<K, afq>)iterator.next()).getValue().f;
            if (b.e.containsKey(f)) {
                final oh0 oh0 = b.e.get(f);
                final Map f2 = b.f;
                vmw.g((Object)oh0);
                oh0 oh2 = oh0;
                if (f2.containsKey(oh0.G0.e())) {
                    final oh0$a oh0$a = new oh0$a(oh0);
                    oh0$a.r((qgv)b.f.get(oh0.G0.e()));
                    oh2 = (oh0)((z4j)oh0$a).e();
                }
                t.w((Object)f, (Object)oh2);
            }
        }
        final Map a2 = b.a;
        final Map b2 = b.b;
        final Map c = b.c;
        final Map d = b.d;
        final Map map = (Map)((z4j)t).e();
        final Map f3 = b.f;
        Object f4;
        if ((f4 = a2) == null) {
            f4 = m3a.F0;
        }
        Object f5;
        if ((f5 = b2) == null) {
            f5 = m3a.F0;
        }
        Object f6;
        if ((f6 = c) == null) {
            f6 = m3a.F0;
        }
        Object f7;
        if ((f7 = d) == null) {
            f7 = m3a.F0;
        }
        Object f8;
        if ((f8 = f3) == null) {
            f8 = m3a.F0;
        }
        final zof zof = (zof)((Map)f6).get(a.a);
        zof a3;
        if (zof == null) {
            a3 = null;
        }
        else {
            a3 = zof;
            if (zof.g != null) {
                final zof$a zof$a = new zof$a(zof.a);
                zof$a.b = zof.b;
                zof$a.c = zof.c;
                zof$a.d = zof.d;
                zof$a.e = zof.e;
                zof$a.f = zof.f;
                zof$a.g = zof.g;
                zof$a.h = zof.h;
                zof$a.i = zof.i;
                zof$a.j = zof.j;
                zof$a.m = zof.l;
                zof$a.k = zof.k;
                zof$a.o(zof.m);
                zof$a.g = ((Map<K, qgv>)f8).get(zof.g.f().getStringId());
                a3 = (zof)((z4j)zof$a).e();
            }
        }
        final ojf h = ojf.H();
        for (final mm3 mm3 : a.d) {
            final mm3$a mm3$a = new mm3$a(mm3.a);
            final b b3 = mm3.b;
            mm3$a.b = b3;
            mm3$a.c = mm3.c;
            mm3$a.d = mm3.e;
            mm3$a.e = mm3.f;
            mm3$a.f = mm3.g;
            mm3$a.g = mm3.d;
            mm3$a.i = mm3.i;
            mm3$a.h = mm3.h;
            if (b3 != null) {
                mm3$a.b = ((Map<K, b>)f4).get(b3.w());
            }
            final opf c2 = mm3.c;
            if (c2 != null) {
                final opf opf = ((Map<K, opf>)f5).get(c2.a);
                final String e = opf.e;
                Objects.requireNonNull(e);
                final qgv j = ((Map<K, qgv>)f8).get(e);
                opf c3 = opf;
                if (j != null) {
                    final opf$a opf$a = new opf$a(opf.a);
                    opf$a.b = opf.b;
                    opf$a.c = opf.c;
                    opf$a.d = opf.d;
                    opf$a.e = opf.e;
                    opf$a.f = opf.f;
                    opf$a.g = opf.g;
                    opf$a.h = opf.h;
                    opf$a.i = opf.i;
                    opf$a.j = j;
                    c3 = new opf(opf$a);
                }
                mm3$a.c = c3;
            }
            final afq e2 = mm3.e;
            if (e2 != null) {
                mm3$a.d = ((Map<K, afq>)f7).get(e2.a);
            }
            final afq d2 = mm3.d;
            if (d2 != null) {
                mm3$a.g = ((Map<K, afq>)f7).get(d2.a);
            }
            final mm3 mm4 = (mm3)((z4j)mm3$a).e();
            final int i = mm4.j;
            final boolean b4 = false;
            boolean b5 = false;
            Label_1044: {
                Label_1042: {
                    Label_1037: {
                        if (i == 3) {
                            final xnu g = mm4.g;
                            if (g != null) {
                                final oh0 oh3 = map.get(g.a);
                                if (oh3 == null) {
                                    break Label_1042;
                                }
                                if ((oh3.K0.U0 & 0xC600) != 0x0) {
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
                final int k = mm4.j;
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
                                    final opf c4 = mm4.c;
                                    n = (b4 ? 1 : 0);
                                    if (c4 == null) {
                                        break Label_1356;
                                    }
                                    if (flr.e((CharSequence)c4.e)) {
                                        n = (b4 ? 1 : 0);
                                        break Label_1356;
                                    }
                                    final String e3 = c4.e;
                                    if (e3 != null) {
                                        s = e3;
                                    }
                                    n = (bxf.a((qgv)((Map<K, qgv>)f8).get(s)) ? 1 : 0);
                                    break Label_1356;
                                }
                                else {
                                    final xnu g2 = mm4.g;
                                    if (g2 == null) {
                                        n = (b4 ? 1 : 0);
                                        break Label_1356;
                                    }
                                    final oh0 oh4 = map.get(g2.a);
                                    qgv g3;
                                    if (oh4 != null) {
                                        g3 = oh4.G0;
                                    }
                                    else {
                                        g3 = null;
                                    }
                                    n = (bxf.a(g3) ? 1 : 0);
                                    break Label_1356;
                                }
                            }
                        }
                        else {
                            final b b6 = mm4.b;
                            n = (b4 ? 1 : 0);
                            if (b6 == null) {
                                break Label_1356;
                            }
                            if (flr.e((CharSequence)b6.e0())) {
                                n = (b4 ? 1 : 0);
                                break Label_1356;
                            }
                            final String e4 = b6.e0();
                            if (e4 != null) {
                                s = e4;
                            }
                            n = (bxf.a((qgv)((Map<K, qgv>)f8).get(s)) ? 1 : 0);
                            break Label_1356;
                        }
                    }
                    final afq e5 = mm4.e;
                    n = (b4 ? 1 : 0);
                    if (e5 != null) {
                        if (flr.e((CharSequence)e5.f)) {
                            n = (b4 ? 1 : 0);
                        }
                        else {
                            final oh0 oh5 = map.get(e5.f);
                            qgv g4;
                            if (oh5 != null) {
                                g4 = oh5.G0;
                            }
                            else {
                                g4 = null;
                            }
                            n = (bxf.a(g4) ? 1 : 0);
                        }
                    }
                }
                if (n != 0) {
                    continue;
                }
                h.p((Object)mm4);
            }
        }
        final List list = (List)((z4j)h).e();
        final hwf$a hwf$a = new hwf$a();
        hwf$a.a = a3;
        hwf$a.o(list);
        hwf$a.e = new ArrayList(((Map<K, qgv>)f8).values());
        hwf$a.f = a.e;
        hwf$a.b = a.c;
        hwf$a.c = a.b;
        return new twf((hwf)((z4j)hwf$a).e(), map);
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static final class JsonResponse extends tih<bxf$a>
    {
        @JsonField
        public List<mm3> a;
        @JsonField
        public zof b;
        @JsonField
        public x1g c;
        @JsonField(name = { "polling_interval_seconds" })
        public int d;
        @JsonField
        public String e;
        
        @Override
        public final Object s() {
            final zof b = this.b;
            String a;
            if (b != null) {
                vmw.g((Object)b);
                a = b.a;
            }
            else {
                a = "";
            }
            final String e = this.e;
            final int d = this.d;
            final x1g c = this.c;
            Object o;
            if ((o = this.a) == null) {
                o = h3a.F0;
            }
            return new bxf$a(a, e, d, c, (List)o);
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static final class JsonTwitterObjects extends tih<bxf$b>
    {
        @JsonField
        public Map<String, b> a;
        @JsonField
        public Map<String, opf> b;
        @JsonField
        public Map<String, zof> c;
        @JsonField
        public Map<String, afq> d;
        @JsonField
        public Map<String, oh0> e;
        @JsonField
        public Map<String, qgv> f;
        
        @Override
        public final Object s() {
            return new bxf$b((Map)this.a, (Map)this.b, (Map)this.c, (Map)this.d, (Map)this.e, (Map)this.f);
        }
    }
}
