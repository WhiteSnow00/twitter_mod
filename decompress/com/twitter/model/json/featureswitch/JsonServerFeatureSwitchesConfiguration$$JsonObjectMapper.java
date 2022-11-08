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
    public static JsonServerFeatureSwitchesConfiguration _parse(final khe khe) throws IOException {
        final JsonServerFeatureSwitchesConfiguration jsonServerFeatureSwitchesConfiguration = new JsonServerFeatureSwitchesConfiguration();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonServerFeatureSwitchesConfiguration, d, khe);
            khe.m0();
        }
        return jsonServerFeatureSwitchesConfiguration;
    }
    
    public static void _serialize(final JsonServerFeatureSwitchesConfiguration jsonServerFeatureSwitchesConfiguration, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("ceol_allowlist", jsonServerFeatureSwitchesConfiguration.b);
        if (jsonServerFeatureSwitchesConfiguration.a != null) {
            LoganSquare.typeConverterFor((Class)hua.class).serialize((Object)jsonServerFeatureSwitchesConfiguration.a, "config", true, tfe);
        }
        final HashSet d = jsonServerFeatureSwitchesConfiguration.d;
        if (d != null) {
            tfe.i("embedded_darkmoded");
            tfe.q0();
            final Iterator iterator = d.iterator();
            while (iterator.hasNext()) {
                tfe.s0((String)iterator.next());
            }
            tfe.f();
        }
        final HashMap f = jsonServerFeatureSwitchesConfiguration.f;
        if (f != null) {
            final Iterator h = q1a.h(tfe, "impression_pointers", f);
            while (h.hasNext()) {
                final Map.Entry entry = h.next();
                if (o1a.g((String)entry.getKey(), tfe, (Map.Entry)entry) == null) {
                    tfe.j();
                }
                else {
                    final List list = (List)entry.getValue();
                    if (list == null) {
                        continue;
                    }
                    tfe.q0();
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        tfe.s0((String)iterator2.next());
                    }
                    tfe.f();
                }
            }
            tfe.h();
        }
        final HashSet c = jsonServerFeatureSwitchesConfiguration.c;
        if (c != null) {
            tfe.i("impressions");
            tfe.q0();
            for (final cua cua : c) {
                if (cua != null) {
                    LoganSquare.typeConverterFor((Class)cua.class).serialize((Object)cua, "lslocalimpressionsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonServerFeatureSwitchesConfiguration.e != null) {
            LoganSquare.typeConverterFor((Class)fnp.class).serialize((Object)jsonServerFeatureSwitchesConfiguration.e, "versions", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonServerFeatureSwitchesConfiguration jsonServerFeatureSwitchesConfiguration, final String s, final khe khe) throws IOException {
        if ("ceol_allowlist".equals(s)) {
            jsonServerFeatureSwitchesConfiguration.b = khe.T((String)null);
        }
        else if ("config".equals(s)) {
            jsonServerFeatureSwitchesConfiguration.a = (hua)LoganSquare.typeConverterFor((Class)hua.class).parse(khe);
        }
        else if ("embedded_darkmoded".equals(s)) {
            if (khe.e() == lje.M0) {
                final HashSet d = new HashSet();
                while (khe.i0() != lje.N0) {
                    final String t = khe.T((String)null);
                    if (t != null) {
                        d.add(t);
                    }
                }
                jsonServerFeatureSwitchesConfiguration.d = d;
            }
            else {
                jsonServerFeatureSwitchesConfiguration.d = null;
            }
        }
        else if ("impression_pointers".equals(s)) {
            if (khe.e() == lje.K0) {
                final HashMap f = new HashMap();
                while (khe.i0() != lje.L0) {
                    final String j = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        f.put(j, null);
                    }
                    else if (khe.e() == lje.M0) {
                        final ArrayList<String> list = new ArrayList<String>();
                        while (khe.i0() != lje.N0) {
                            final String t2 = khe.T((String)null);
                            if (t2 != null) {
                                list.add(t2);
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
        else if ("impressions".equals(s)) {
            if (khe.e() == lje.M0) {
                final HashSet c = new HashSet();
                while (khe.i0() != lje.N0) {
                    final cua cua = (cua)LoganSquare.typeConverterFor((Class)cua.class).parse(khe);
                    if (cua != null) {
                        c.add(cua);
                    }
                }
                jsonServerFeatureSwitchesConfiguration.c = c;
            }
            else {
                jsonServerFeatureSwitchesConfiguration.c = null;
            }
        }
        else if ("versions".equals(s)) {
            jsonServerFeatureSwitchesConfiguration.e = (fnp)LoganSquare.typeConverterFor((Class)fnp.class).parse(khe);
        }
    }
    
    public JsonServerFeatureSwitchesConfiguration parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonServerFeatureSwitchesConfiguration jsonServerFeatureSwitchesConfiguration, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonServerFeatureSwitchesConfiguration, tfe, b);
    }
}
