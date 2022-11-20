// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.AbstractCollection;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeatureSwitchesParameter$$JsonObjectMapper extends JsonMapper<JsonFeatureSwitchesParameter>
{
    public static JsonFeatureSwitchesParameter _parse(final tge tge) throws IOException {
        final JsonFeatureSwitchesParameter jsonFeatureSwitchesParameter = new JsonFeatureSwitchesParameter();
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
            parseField(jsonFeatureSwitchesParameter, d, tge);
            tge.l0();
        }
        return jsonFeatureSwitchesParameter;
    }
    
    public static void _serialize(final JsonFeatureSwitchesParameter jsonFeatureSwitchesParameter, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonFeatureSwitchesParameter.b != null) {
            afe.i("default");
            JsonFeatureSwitchesValueObject$$JsonObjectMapper._serialize(jsonFeatureSwitchesParameter.b, afe, true);
        }
        final AbstractCollection c = jsonFeatureSwitchesParameter.c;
        if (c != null) {
            afe.i("enumeration_values");
            afe.p0();
            for (final aua aua : c) {
                if (aua != null) {
                    LoganSquare.typeConverterFor((Class)aua.class).serialize((Object)aua, "lslocalenumeration_valuesElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("name", jsonFeatureSwitchesParameter.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFeatureSwitchesParameter jsonFeatureSwitchesParameter, final String s, final tge tge) throws IOException {
        if ("default".equals(s)) {
            jsonFeatureSwitchesParameter.b = JsonFeatureSwitchesValueObject$$JsonObjectMapper._parse(tge);
        }
        else if ("enumeration_values".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final aua aua = (aua)LoganSquare.typeConverterFor((Class)aua.class).parse(tge);
                    if (aua != null) {
                        c.add(aua);
                    }
                }
                jsonFeatureSwitchesParameter.c = c;
            }
            else {
                jsonFeatureSwitchesParameter.c = null;
            }
        }
        else if ("name".equals(s)) {
            jsonFeatureSwitchesParameter.a = tge.T((String)null);
        }
    }
    
    public JsonFeatureSwitchesParameter parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFeatureSwitchesParameter jsonFeatureSwitchesParameter, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFeatureSwitchesParameter, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFeatureSwitchesParameter)o, afe, b);
    }
}
