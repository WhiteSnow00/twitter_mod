// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfEntity$$JsonObjectMapper extends JsonMapper<JsonOcfEntity>
{
    public static JsonOcfEntity _parse(final tge tge) throws IOException {
        final JsonOcfEntity jsonOcfEntity = new JsonOcfEntity();
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
            parseField(jsonOcfEntity, d, tge);
            tge.l0();
        }
        return jsonOcfEntity;
    }
    
    public static void _serialize(final JsonOcfEntity jsonOcfEntity, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("from_index", jsonOcfEntity.a);
        if (jsonOcfEntity.d != null) {
            LoganSquare.typeConverterFor((Class)vsr.class).serialize((Object)jsonOcfEntity.d, "subtask_data_reference", true, afe);
        }
        afe.T("to_index", jsonOcfEntity.b);
        if (jsonOcfEntity.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonOcfEntity.c, "navigation_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfEntity jsonOcfEntity, final String s, final tge tge) throws IOException {
        if ("from_index".equals(s)) {
            jsonOcfEntity.a = tge.y();
        }
        else if ("subtask_data_reference".equals(s)) {
            jsonOcfEntity.d = (vsr)LoganSquare.typeConverterFor((Class)vsr.class).parse(tge);
        }
        else if ("to_index".equals(s)) {
            jsonOcfEntity.b = tge.y();
        }
        else if ("navigation_link".equals(s)) {
            jsonOcfEntity.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonOcfEntity parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfEntity jsonOcfEntity, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfEntity, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfEntity)o, afe, b);
    }
}
