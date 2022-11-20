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
    public static final ne6 CONDITION_TYPE_CONVERTER;
    
    static {
        CONDITION_TYPE_CONVERTER = new ne6();
    }
    
    public static JsonEnableCondition _parse(final tge tge) throws IOException {
        final JsonEnableCondition jsonEnableCondition = new JsonEnableCondition();
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
            parseField(jsonEnableCondition, d, tge);
            tge.l0();
        }
        return jsonEnableCondition;
    }
    
    public static void _serialize(final JsonEnableCondition jsonEnableCondition, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final me6 a = jsonEnableCondition.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonEnableCondition$$JsonObjectMapper.CONDITION_TYPE_CONVERTER).serialize((Object)a, "condition_type", true, afe);
        }
        if (jsonEnableCondition.c != null) {
            afe.i("data");
            JsonEnableConditionData$$JsonObjectMapper._serialize(jsonEnableCondition.c, afe, true);
        }
        afe.t0("identifier", jsonEnableCondition.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonEnableCondition jsonEnableCondition, final String s, final tge tge) throws IOException {
        if ("condition_type".equals(s)) {
            final me6 a = (me6)((StringBasedTypeConverter)JsonEnableCondition$$JsonObjectMapper.CONDITION_TYPE_CONVERTER).parse(tge);
            Objects.requireNonNull(jsonEnableCondition);
            czd.f((Object)a, "<set-?>");
            jsonEnableCondition.a = a;
        }
        else if ("data".equals(s)) {
            jsonEnableCondition.c = JsonEnableConditionData$$JsonObjectMapper._parse(tge);
        }
        else if ("identifier".equals(s)) {
            jsonEnableCondition.b = tge.T((String)null);
        }
    }
    
    public JsonEnableCondition parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonEnableCondition jsonEnableCondition, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEnableCondition, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonEnableCondition)o, afe, b);
    }
}
