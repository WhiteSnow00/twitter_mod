// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeatureSwitchesValueObject$$JsonObjectMapper extends JsonMapper<JsonFeatureSwitchesValueObject>
{
    public static JsonFeatureSwitchesValueObject _parse(final tge tge) throws IOException {
        final JsonFeatureSwitchesValueObject jsonFeatureSwitchesValueObject = new JsonFeatureSwitchesValueObject();
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
            parseField(jsonFeatureSwitchesValueObject, d, tge);
            tge.l0();
        }
        return jsonFeatureSwitchesValueObject;
    }
    
    public static void _serialize(final JsonFeatureSwitchesValueObject jsonFeatureSwitchesValueObject, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonFeatureSwitchesValueObject.a != null) {
            LoganSquare.typeConverterFor((Class)aua.class).serialize((Object)jsonFeatureSwitchesValueObject.a, "value", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFeatureSwitchesValueObject jsonFeatureSwitchesValueObject, final String s, final tge tge) throws IOException {
        if ("value".equals(s)) {
            jsonFeatureSwitchesValueObject.a = (aua)LoganSquare.typeConverterFor((Class)aua.class).parse(tge);
        }
    }
    
    public JsonFeatureSwitchesValueObject parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFeatureSwitchesValueObject jsonFeatureSwitchesValueObject, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFeatureSwitchesValueObject, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFeatureSwitchesValueObject)o, afe, b);
    }
}
