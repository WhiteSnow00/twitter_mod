// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Map;
import com.twitter.model.json.common.InvalidJsonFormatException;
import java.util.List;
import java.util.Set;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLocalFeatureSwitchesConfiguration extends qhh<u3g>
{
    @JsonField(name = { "default" })
    public lta a;
    @JsonField
    public Set<String> b;
    @JsonField(name = { "experiment_names" })
    public Set<String> c;
    @JsonField
    public jta d;
    @JsonField
    public List<mta> e;
    @JsonField
    public vnp f;
    
    public final n4j t() {
        u3g$a u3g$a;
        if (this.a == null) {
            m8a.d((Throwable)new InvalidJsonFormatException("'default' does not exist in manifest."));
            u3g$a = new u3g$a();
        }
        else {
            final qjg t = qjg.t();
            final ArrayList e = this.e;
            if (e != null) {
                for (final mta mta : e) {
                    t.w((Object)mta.a, (Object)mta);
                }
            }
            final zta$a a = new zta$a();
            final lta a2 = this.a;
            a.a = a2.a.a;
            final vnp f = this.f;
            if (f != null) {
                a.b = f.a;
                a.c = f.b;
            }
            final jta d = this.d;
            Object o;
            if (d != null) {
                o = d.a;
            }
            else {
                o = kdd.D0;
                final int a3 = c5j.a;
            }
            final u3g$a u3g$a2 = new u3g$a();
            u3g$a2.a = a;
            u3g$a2.b = a2.c;
            u3g$a2.c = a2.d;
            u3g$a2.d = (Map)((n4j)t).e();
            u3g$a2.e = qdd.g((Set)this.b);
            final Set g = qdd.g((Set)this.c);
            czd.f(o, "facets");
            czd.f((Object)g, "availableExperiments");
            Objects.requireNonNull(u3g$a.Companion);
            final LinkedHashMap f2 = new LinkedHashMap();
            final Iterator iterator2 = ((Map)o).values().iterator();
            while (iterator2.hasNext()) {
                for (final tta tta : ((nta)iterator2.next()).b.values()) {
                    final String a4 = tta.a;
                    final Object b = tta.b;
                    final List c = tta.c;
                    List<Object> b2 = null;
                    Object b3 = null;
                    Label_0453: {
                        if (b != null) {
                            b2 = c;
                            b3 = b;
                            if (!c.isEmpty()) {
                                break Label_0453;
                            }
                        }
                        b2 = c;
                        b3 = b;
                        if (f2.containsKey(a4)) {
                            final Object value = f2.get(a4);
                            czd.c(value);
                            final usa usa = (usa)value;
                            Object a5;
                            if ((a5 = b) == null) {
                                a5 = usa.a;
                            }
                            b2 = c;
                            b3 = a5;
                            if (c.isEmpty()) {
                                b2 = usa.b;
                                b3 = a5;
                            }
                        }
                    }
                    final usa$a usa$a = new usa$a();
                    usa$a.a = a4;
                    usa$a.b = b3;
                    usa$a.c = b2;
                    usa$a.d = g.contains(a4);
                    f2.put(a4, ((n4j)usa$a).e());
                }
            }
            u3g$a2.f = f2;
            final Set<ysa> b4 = this.a.b;
            Map map;
            if (b4 != null) {
                int o2;
                if ((o2 = rpb.O(iq4.H((Iterable)b4, 10))) < 16) {
                    o2 = 16;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(o2);
                final Iterator<Object> iterator4 = b4.iterator();
                while (true) {
                    map = linkedHashMap;
                    if (!iterator4.hasNext()) {
                        break;
                    }
                    final ysa next = iterator4.next();
                    linkedHashMap.put((Object)next.a, (Object)next);
                }
            }
            else {
                map = null;
            }
            Object d2;
            if ((d2 = map) == null) {
                d2 = k2a.D0;
            }
            u3g$a2.g = (Map)d2;
            u3g$a = u3g$a2;
        }
        return (n4j)u3g$a;
    }
    
    @JsonObject
    public static class JsonFeatureSwitchesDebug extends fih<jta>
    {
        @JsonField
        public List<nta> a;
        
        public final Object s() {
            final qjg t = qjg.t();
            final ArrayList a = this.a;
            if (a != null) {
                for (final nta nta : a) {
                    t.w((Object)nta.a, (Object)nta);
                }
            }
            return new jta((Map)((n4j)t).e());
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonFeatureSwitchesDefault extends fih<lta>
    {
        @JsonField
        public dta a;
        @JsonField
        public Set<ysa> b;
        @JsonField
        public String c;
        @JsonField
        public String d;
        
        public final Object s() {
            final dta a = this.a;
            Object o;
            if (a == null) {
                i48.t("'config' does not exist in the manifest.");
                o = null;
            }
            else {
                o = new lta(a, qdd.g((Set)this.b), this.c, this.d);
            }
            return o;
        }
    }
}
