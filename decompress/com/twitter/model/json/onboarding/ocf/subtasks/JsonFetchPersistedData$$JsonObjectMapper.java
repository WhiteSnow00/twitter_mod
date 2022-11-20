// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFetchPersistedData$$JsonObjectMapper extends JsonMapper<JsonFetchPersistedData>
{
    public static final nva FETCH_PERSISTED_DATA_TYPE_CONVERTER;
    
    static {
        FETCH_PERSISTED_DATA_TYPE_CONVERTER = new nva();
    }
    
    public static JsonFetchPersistedData _parse(final tge tge) throws IOException {
        final JsonFetchPersistedData jsonFetchPersistedData = new JsonFetchPersistedData();
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
            parseField(jsonFetchPersistedData, d, tge);
            tge.l0();
        }
        return jsonFetchPersistedData;
    }
    
    public static void _serialize(final JsonFetchPersistedData jsonFetchPersistedData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final mva$b a = jsonFetchPersistedData.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonFetchPersistedData$$JsonObjectMapper.FETCH_PERSISTED_DATA_TYPE_CONVERTER).serialize((Object)a, "data_type", true, afe);
        }
        if (jsonFetchPersistedData.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonFetchPersistedData.c, "fail_link", true, afe);
        }
        if (jsonFetchPersistedData.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonFetchPersistedData.b, "next_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFetchPersistedData jsonFetchPersistedData, final String s, final tge tge) throws IOException {
        if ("data_type".equals(s)) {
            jsonFetchPersistedData.a = (mva$b)((StringBasedTypeConverter)JsonFetchPersistedData$$JsonObjectMapper.FETCH_PERSISTED_DATA_TYPE_CONVERTER).parse(tge);
        }
        else if ("fail_link".equals(s)) {
            jsonFetchPersistedData.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonFetchPersistedData.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonFetchPersistedData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFetchPersistedData jsonFetchPersistedData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFetchPersistedData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFetchPersistedData)o, afe, b);
    }
}
