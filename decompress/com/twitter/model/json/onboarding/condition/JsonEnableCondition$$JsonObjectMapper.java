// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.condition;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnableCondition$$JsonObjectMapper extends JsonMapper<JsonEnableCondition>
{
    public static final if6 CONDITION_TYPE_CONVERTER;
    
    static {
        CONDITION_TYPE_CONVERTER = new if6();
    }
    
    public static JsonEnableCondition _parse(final khe khe) throws IOException {
        final JsonEnableCondition jsonEnableCondition = new JsonEnableCondition();
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
            parseField(jsonEnableCondition, d, khe);
            khe.m0();
        }
        return jsonEnableCondition;
    }
    
    public static void _serialize(final JsonEnableCondition jsonEnableCondition, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final hf6 a = jsonEnableCondition.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonEnableCondition$$JsonObjectMapper.CONDITION_TYPE_CONVERTER).serialize((Object)a, "condition_type", true, tfe);
        }
        if (jsonEnableCondition.c != null) {
            tfe.i("data");
            JsonEnableConditionData$$JsonObjectMapper._serialize(jsonEnableCondition.c, tfe, true);
        }
        tfe.u0("identifier", jsonEnableCondition.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnableCondition jsonEnableCondition, final String s, final khe khe) throws IOException {
        if ("condition_type".equals(s)) {
            final hf6 a = (hf6)((StringBasedTypeConverter)JsonEnableCondition$$JsonObjectMapper.CONDITION_TYPE_CONVERTER).parse(khe);
            Objects.requireNonNull(jsonEnableCondition);
            zzd.f((Object)a, "<set-?>");
            jsonEnableCondition.a = a;
        }
        else if ("data".equals(s)) {
            jsonEnableCondition.c = JsonEnableConditionData$$JsonObjectMapper._parse(khe);
        }
        else if ("identifier".equals(s)) {
            jsonEnableCondition.b = khe.T((String)null);
        }
    }
    
    public JsonEnableCondition parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnableCondition jsonEnableCondition, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnableCondition, tfe, b);
    }
}
