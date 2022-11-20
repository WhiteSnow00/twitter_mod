// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug$$JsonObjectMapper extends JsonMapper<JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDebug>
{
    public static JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDebug _parse(final tge tge) throws IOException {
        final JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDebug jsonFeatureSwitchesDebug = new JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDebug();
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
            parseField(jsonFeatureSwitchesDebug, d, tge);
            tge.l0();
        }
        return jsonFeatureSwitchesDebug;
    }
    
    public static void _serialize(final JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDebug jsonFeatureSwitchesDebug, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonFeatureSwitchesDebug.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "facets", a);
            while (a2.hasNext()) {
                final nta nta = a2.next();
                if (nta != null) {
                    LoganSquare.typeConverterFor((Class)nta.class).serialize((Object)nta, "lslocalfacetsElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDebug jsonFeatureSwitchesDebug, final String s, final tge tge) throws IOException {
        if ("facets".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final nta nta = (nta)LoganSquare.typeConverterFor((Class)nta.class).parse(tge);
                    if (nta != null) {
                        a.add(nta);
                    }
                }
                jsonFeatureSwitchesDebug.a = a;
            }
            else {
                jsonFeatureSwitchesDebug.a = null;
            }
        }
    }
    
    public JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDebug parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDebug jsonFeatureSwitchesDebug, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFeatureSwitchesDebug, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDebug)o, afe, b);
    }
}
