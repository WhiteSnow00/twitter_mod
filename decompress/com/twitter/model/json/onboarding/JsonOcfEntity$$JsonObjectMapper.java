// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfEntity$$JsonObjectMapper extends JsonMapper<JsonOcfEntity>
{
    public static JsonOcfEntity _parse(final qhe qhe) throws IOException {
        final JsonOcfEntity jsonOcfEntity = new JsonOcfEntity();
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
            parseField(jsonOcfEntity, d, qhe);
            qhe.m0();
        }
        return jsonOcfEntity;
    }
    
    public static void _serialize(final JsonOcfEntity jsonOcfEntity, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("from_index", jsonOcfEntity.a);
        if (jsonOcfEntity.d != null) {
            LoganSquare.typeConverterFor((Class)ttr.class).serialize((Object)jsonOcfEntity.d, "subtask_data_reference", true, yfe);
        }
        yfe.T("to_index", jsonOcfEntity.b);
        if (jsonOcfEntity.c != null) {
            LoganSquare.typeConverterFor((Class)dtv.class).serialize((Object)jsonOcfEntity.c, "navigation_link", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfEntity jsonOcfEntity, final String s, final qhe qhe) throws IOException {
        if ("from_index".equals(s)) {
            jsonOcfEntity.a = qhe.z();
        }
        else if ("subtask_data_reference".equals(s)) {
            jsonOcfEntity.d = (ttr)LoganSquare.typeConverterFor((Class)ttr.class).parse(qhe);
        }
        else if ("to_index".equals(s)) {
            jsonOcfEntity.b = qhe.z();
        }
        else if ("navigation_link".equals(s)) {
            jsonOcfEntity.c = (dtv)LoganSquare.typeConverterFor((Class)dtv.class).parse(qhe);
        }
    }
    
    public JsonOcfEntity parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfEntity jsonOcfEntity, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfEntity, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfEntity)o, yfe, b);
    }
}
