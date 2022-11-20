// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonServerFeatureSwitchesConfiguration$$JsonObjectMapper extends JsonMapper<JsonServerFeatureSwitchesConfiguration>
{
    public static JsonServerFeatureSwitchesConfiguration _parse(final tge tge) throws IOException {
        final JsonServerFeatureSwitchesConfiguration jsonServerFeatureSwitchesConfiguration = new JsonServerFeatureSwitchesConfiguration();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonServerFeatureSwitchesConfiguration, d, tge);
            tge.l0();
        }
        return jsonServerFeatureSwitchesConfiguration;
    }
    
    public static void _serialize(final JsonServerFeatureSwitchesConfiguration jsonServerFeatureSwitchesConfiguration, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("ceol_allowlist", jsonServerFeatureSwitchesConfiguration.b);
        if (jsonServerFeatureSwitchesConfiguration.a != null) {
            LoganSquare.typeConverterFor((Class)dta.class).serialize((Object)jsonServerFeatureSwitchesConfiguration.a, "config", true, afe);
        }
        final HashSet d = jsonServerFeatureSwitchesConfiguration.d;
        if (d != null) {
            afe.i("embedded_darkmoded");
            afe.p0();
            final Iterator iterator = d.iterator();
            while (iterator.hasNext()) {
                afe.r0((String)iterator.next());
            }
            afe.f();
        }
        final HashMap f = jsonServerFeatureSwitchesConfiguration.f;
        if (f != null) {
            final Iterator z = mw.z(afe, "impression_pointers", f);
            while (z.hasNext()) {
                final Map.Entry entry = z.next();
                if (sde.e((String)entry.getKey(), afe, (Map.Entry)entry) == null) {
                    afe.j();
                }
                else {
                    final List list = (List)entry.getValue();
                    if (list == null) {
                        continue;
                    }
                    afe.p0();
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        afe.r0((String)iterator2.next());
                    }
                    afe.f();
                }
            }
            afe.h();
        }
        final HashSet c = jsonServerFeatureSwitchesConfiguration.c;
        if (c != null) {
            afe.i("impressions");
            afe.p0();
            for (final ysa ysa : c) {
                if (ysa != null) {
                    LoganSquare.typeConverterFor((Class)ysa.class).serialize((Object)ysa, "lslocalimpressionsElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonServerFeatureSwitchesConfiguration.e != null) {
            LoganSquare.typeConverterFor((Class)vnp.class).serialize((Object)jsonServerFeatureSwitchesConfiguration.e, "versions", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonServerFeatureSwitchesConfiguration jsonServerFeatureSwitchesConfiguration, String t, final tge tge) throws IOException {
        if ("ceol_allowlist".equals(t)) {
            jsonServerFeatureSwitchesConfiguration.b = tge.T((String)null);
        }
        else if ("config".equals(t)) {
            jsonServerFeatureSwitchesConfiguration.a = (dta)LoganSquare.typeConverterFor((Class)dta.class).parse(tge);
        }
        else if ("embedded_darkmoded".equals(t)) {
            if (tge.e() == vie.N0) {
                final HashSet d = new HashSet();
                while (tge.h0() != vie.O0) {
                    final String t2 = tge.T((String)null);
                    if (t2 != null) {
                        d.add(t2);
                    }
                }
                jsonServerFeatureSwitchesConfiguration.d = d;
            }
            else {
                jsonServerFeatureSwitchesConfiguration.d = null;
            }
        }
        else if ("impression_pointers".equals(t)) {
            if (tge.e() == vie.L0) {
                final HashMap f = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String j = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        f.put(j, null);
                    }
                    else if (tge.e() == vie.N0) {
                        final ArrayList<String> list = new ArrayList<String>();
                        while (tge.h0() != vie.O0) {
                            t = tge.T((String)null);
                            if (t != null) {
                                list.add(t);
                            }
                        }
                        f.put(j, list);
                    }
                    else {
                        f.put(j, null);
                    }
                }
                jsonServerFeatureSwitchesConfiguration.f = f;
            }
            else {
                jsonServerFeatureSwitchesConfiguration.f = null;
            }
        }
        else if ("impressions".equals(t)) {
            if (tge.e() == vie.N0) {
                final HashSet c = new HashSet();
                while (tge.h0() != vie.O0) {
                    final ysa ysa = (ysa)LoganSquare.typeConverterFor((Class)ysa.class).parse(tge);
                    if (ysa != null) {
                        c.add(ysa);
                    }
                }
                jsonServerFeatureSwitchesConfiguration.c = c;
            }
            else {
                jsonServerFeatureSwitchesConfiguration.c = null;
            }
        }
        else if ("versions".equals(t)) {
            jsonServerFeatureSwitchesConfiguration.e = (vnp)LoganSquare.typeConverterFor((Class)vnp.class).parse(tge);
        }
    }
    
    public JsonServerFeatureSwitchesConfiguration parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonServerFeatureSwitchesConfiguration jsonServerFeatureSwitchesConfiguration, final afe afe, final boolean b) throws IOException {
        _serialize(jsonServerFeatureSwitchesConfiguration, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonServerFeatureSwitchesConfiguration)o, afe, b);
    }
}
