// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import com.twitter.model.json.common.InvalidJsonFormatException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonServerFeatureSwitchesConfiguration extends qhh<bmp>
{
    @JsonField
    public dta a;
    @JsonField
    public String b;
    @JsonField
    public Set<ysa> c;
    @JsonField
    public Set<String> d;
    @JsonField
    public vnp e;
    @JsonField
    public Map<String, List<String>> f;
    
    public final n4j t() {
        final dta a = this.a;
        bmp.a a2;
        if (a == null) {
            m8a.d((Throwable)new InvalidJsonFormatException("Invalid feature switch Configs"));
            a2 = new bmp.a();
        }
        else {
            final zta$a zta$a = new zta$a();
            zta$a.a = a.a;
            final vnp e = this.e;
            if (e != null) {
                zta$a.b = e.a;
                zta$a.c = e.b;
                zta$a.d = e.c;
            }
            final bmp.a a3 = new bmp.a();
            a3.b = (zta)((n4j)zta$a).e();
            a3.d = dnp.u((Set)this.d);
            final HashSet c = this.c;
            Map<String, ysa> map;
            if (c != null) {
                int o;
                if ((o = rpb.O(iq4.H((Iterable)c, 10))) < 16) {
                    o = 16;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(o);
                final Iterator iterator = c.iterator();
                while (true) {
                    map = (Map<String, ysa>)linkedHashMap;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final Object next = iterator.next();
                    linkedHashMap.put((Object)((ysa)next).a, next);
                }
            }
            else {
                map = null;
            }
            Object d0;
            if ((d0 = map) == null) {
                d0 = k2a.D0;
            }
            a3.e = (Map<String, ysa>)d0;
            final HashMap f = this.f;
            if (f != null && !f.isEmpty()) {
                final HashMap f2 = this.f;
                if (a3.g != null) {
                    throw new IllegalStateException("On the builder, you can either set impression pointers map or the impression pointer to impressions map, but not both.".toString());
                }
                a3.f = f2;
            }
            a3.c = this.b;
            a2 = a3;
        }
        return a2;
    }
}
