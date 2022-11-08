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
    public static final rwa FETCH_PERSISTED_DATA_TYPE_CONVERTER;
    
    static {
        FETCH_PERSISTED_DATA_TYPE_CONVERTER = new rwa();
    }
    
    public static JsonFetchPersistedData _parse(final khe khe) throws IOException {
        final JsonFetchPersistedData jsonFetchPersistedData = new JsonFetchPersistedData();
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
            parseField(jsonFetchPersistedData, d, khe);
            khe.m0();
        }
        return jsonFetchPersistedData;
    }
    
    public static void _serialize(final JsonFetchPersistedData jsonFetchPersistedData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final qwa.b a = jsonFetchPersistedData.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonFetchPersistedData$$JsonObjectMapper.FETCH_PERSISTED_DATA_TYPE_CONVERTER).serialize((Object)a, "data_type", true, tfe);
        }
        if (jsonFetchPersistedData.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonFetchPersistedData.c, "fail_link", true, tfe);
        }
        if (jsonFetchPersistedData.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonFetchPersistedData.b, "next_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFetchPersistedData jsonFetchPersistedData, final String s, final khe khe) throws IOException {
        if ("data_type".equals(s)) {
            jsonFetchPersistedData.a = (qwa.b)((StringBasedTypeConverter)JsonFetchPersistedData$$JsonObjectMapper.FETCH_PERSISTED_DATA_TYPE_CONVERTER).parse(khe);
        }
        else if ("fail_link".equals(s)) {
            jsonFetchPersistedData.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonFetchPersistedData.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonFetchPersistedData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFetchPersistedData jsonFetchPersistedData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFetchPersistedData, tfe, b);
    }
}
