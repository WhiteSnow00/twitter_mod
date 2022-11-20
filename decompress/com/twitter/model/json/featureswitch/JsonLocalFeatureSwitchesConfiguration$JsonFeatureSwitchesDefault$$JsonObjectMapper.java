// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.Iterator;
import java.util.HashSet;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault$$JsonObjectMapper extends JsonMapper<JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDefault>
{
    public static JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDefault _parse(final tge tge) throws IOException {
        final JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDefault jsonFeatureSwitchesDefault = new JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDefault();
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
            parseField(jsonFeatureSwitchesDefault, d, tge);
            tge.l0();
        }
        return jsonFeatureSwitchesDefault;
    }
    
    public static void _serialize(final JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDefault jsonFeatureSwitchesDefault, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("ceol_allowlist", jsonFeatureSwitchesDefault.d);
        if (jsonFeatureSwitchesDefault.a != null) {
            LoganSquare.typeConverterFor((Class)dta.class).serialize((Object)jsonFeatureSwitchesDefault.a, "config", true, afe);
        }
        afe.t0("feature_set_token", jsonFeatureSwitchesDefault.c);
        final HashSet b2 = jsonFeatureSwitchesDefault.b;
        if (b2 != null) {
            afe.i("impressions");
            afe.p0();
            for (final ysa ysa : b2) {
                if (ysa != null) {
                    LoganSquare.typeConverterFor((Class)ysa.class).serialize((Object)ysa, "lslocalimpressionsElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDefault jsonFeatureSwitchesDefault, final String s, final tge tge) throws IOException {
        if ("ceol_allowlist".equals(s)) {
            jsonFeatureSwitchesDefault.d = tge.T((String)null);
        }
        else if ("config".equals(s)) {
            jsonFeatureSwitchesDefault.a = (dta)LoganSquare.typeConverterFor((Class)dta.class).parse(tge);
        }
        else if ("feature_set_token".equals(s)) {
            jsonFeatureSwitchesDefault.c = tge.T((String)null);
        }
        else if ("impressions".equals(s)) {
            if (tge.e() == vie.N0) {
                final HashSet b = new HashSet();
                while (tge.h0() != vie.O0) {
                    final ysa ysa = (ysa)LoganSquare.typeConverterFor((Class)ysa.class).parse(tge);
                    if (ysa != null) {
                        b.add(ysa);
                    }
                }
                jsonFeatureSwitchesDefault.b = b;
            }
            else {
                jsonFeatureSwitchesDefault.b = null;
            }
        }
    }
    
    public JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDefault parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDefault jsonFeatureSwitchesDefault, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFeatureSwitchesDefault, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLocalFeatureSwitchesConfiguration.JsonFeatureSwitchesDefault)o, afe, b);
    }
}
