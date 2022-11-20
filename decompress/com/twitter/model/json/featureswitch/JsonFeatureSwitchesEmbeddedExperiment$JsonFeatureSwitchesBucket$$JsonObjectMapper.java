// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeatureSwitchesEmbeddedExperiment$JsonFeatureSwitchesBucket$$JsonObjectMapper extends JsonMapper<JsonFeatureSwitchesEmbeddedExperiment.JsonFeatureSwitchesBucket>
{
    public static JsonFeatureSwitchesEmbeddedExperiment.JsonFeatureSwitchesBucket _parse(final tge tge) throws IOException {
        final JsonFeatureSwitchesEmbeddedExperiment.JsonFeatureSwitchesBucket jsonFeatureSwitchesBucket = new JsonFeatureSwitchesEmbeddedExperiment.JsonFeatureSwitchesBucket();
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
            parseField(jsonFeatureSwitchesBucket, d, tge);
            tge.l0();
        }
        return jsonFeatureSwitchesBucket;
    }
    
    public static void _serialize(final JsonFeatureSwitchesEmbeddedExperiment.JsonFeatureSwitchesBucket jsonFeatureSwitchesBucket, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("name", jsonFeatureSwitchesBucket.a);
        afe.T("offset", jsonFeatureSwitchesBucket.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFeatureSwitchesEmbeddedExperiment.JsonFeatureSwitchesBucket jsonFeatureSwitchesBucket, final String s, final tge tge) throws IOException {
        if ("name".equals(s)) {
            jsonFeatureSwitchesBucket.a = tge.T((String)null);
        }
        else if ("offset".equals(s)) {
            jsonFeatureSwitchesBucket.b = tge.y();
        }
    }
    
    public JsonFeatureSwitchesEmbeddedExperiment.JsonFeatureSwitchesBucket parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFeatureSwitchesEmbeddedExperiment.JsonFeatureSwitchesBucket jsonFeatureSwitchesBucket, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFeatureSwitchesBucket, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFeatureSwitchesEmbeddedExperiment.JsonFeatureSwitchesBucket)o, afe, b);
    }
}
