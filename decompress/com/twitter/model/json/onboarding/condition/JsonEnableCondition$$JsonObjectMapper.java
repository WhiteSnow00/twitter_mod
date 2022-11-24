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
    public static final uf6 CONDITION_TYPE_CONVERTER;
    
    static {
        CONDITION_TYPE_CONVERTER = new uf6();
    }
    
    public static JsonEnableCondition _parse(final qhe qhe) throws IOException {
        final JsonEnableCondition jsonEnableCondition = new JsonEnableCondition();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonEnableCondition, d, qhe);
            qhe.m0();
        }
        return jsonEnableCondition;
    }
    
    public static void _serialize(final JsonEnableCondition jsonEnableCondition, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final tf6 a = jsonEnableCondition.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonEnableCondition$$JsonObjectMapper.CONDITION_TYPE_CONVERTER).serialize((Object)a, "condition_type", true, yfe);
        }
        if (jsonEnableCondition.c != null) {
            yfe.i("data");
            JsonEnableConditionData$$JsonObjectMapper._serialize(jsonEnableCondition.c, yfe, true);
        }
        yfe.u0("identifier", jsonEnableCondition.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonEnableCondition jsonEnableCondition, final String s, final qhe qhe) throws IOException {
        if ("condition_type".equals(s)) {
            final tf6 a = (tf6)((StringBasedTypeConverter)JsonEnableCondition$$JsonObjectMapper.CONDITION_TYPE_CONVERTER).parse(qhe);
            Objects.requireNonNull(jsonEnableCondition);
            e0e.f((Object)a, "<set-?>");
            jsonEnableCondition.a = a;
        }
        else if ("data".equals(s)) {
            jsonEnableCondition.c = JsonEnableConditionData$$JsonObjectMapper._parse(qhe);
        }
        else if ("identifier".equals(s)) {
            jsonEnableCondition.b = qhe.T((String)null);
        }
    }
    
    public JsonEnableCondition parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonEnableCondition jsonEnableCondition, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonEnableCondition, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonEnableCondition)o, yfe, b);
    }
}
