// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.Iterator;
import java.util.HashSet;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault$$JsonObjectMapper extends JsonMapper<JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault>
{
    public static JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault _parse(final khe khe) throws IOException {
        final JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault = new JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault();
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
            parseField(jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault, d, khe);
            khe.m0();
        }
        return jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault;
    }
    
    public static void _serialize(final JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("ceol_allowlist", jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.d);
        if (jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.a != null) {
            LoganSquare.typeConverterFor((Class)hua.class).serialize((Object)jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.a, "config", true, tfe);
        }
        tfe.u0("feature_set_token", jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.c);
        final HashSet b2 = jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.b;
        if (b2 != null) {
            tfe.i("impressions");
            tfe.q0();
            for (final cua cua : b2) {
                if (cua != null) {
                    LoganSquare.typeConverterFor((Class)cua.class).serialize((Object)cua, "lslocalimpressionsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault, final String s, final khe khe) throws IOException {
        if ("ceol_allowlist".equals(s)) {
            jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.d = khe.T((String)null);
        }
        else if ("config".equals(s)) {
            jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.a = (hua)LoganSquare.typeConverterFor((Class)hua.class).parse(khe);
        }
        else if ("feature_set_token".equals(s)) {
            jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.c = khe.T((String)null);
        }
        else if ("impressions".equals(s)) {
            if (khe.e() == lje.M0) {
                final HashSet b = new HashSet();
                while (khe.i0() != lje.N0) {
                    final cua cua = (cua)LoganSquare.typeConverterFor((Class)cua.class).parse(khe);
                    if (cua != null) {
                        b.add(cua);
                    }
                }
                jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.b = b;
            }
            else {
                jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault.b = null;
            }
        }
    }
    
    public JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDefault, tfe, b);
    }
}
