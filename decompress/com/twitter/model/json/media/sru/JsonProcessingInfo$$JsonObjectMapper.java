// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.sru;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonProcessingInfo$$JsonObjectMapper extends JsonMapper<JsonProcessingInfo>
{
    public static final h4r SRU_STATE_CONVERTER;
    
    static {
        SRU_STATE_CONVERTER = new h4r();
    }
    
    public static JsonProcessingInfo _parse(final khe khe) throws IOException {
        final JsonProcessingInfo jsonProcessingInfo = new JsonProcessingInfo();
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
            parseField(jsonProcessingInfo, d, khe);
            khe.m0();
        }
        return jsonProcessingInfo;
    }
    
    public static void _serialize(final JsonProcessingInfo jsonProcessingInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("check_after_secs", jsonProcessingInfo.b);
        if (jsonProcessingInfo.d != null) {
            LoganSquare.typeConverterFor((Class)c4r.class).serialize((Object)jsonProcessingInfo.d, "error", true, tfe);
        }
        tfe.T("progress_percent", jsonProcessingInfo.c);
        ((StringBasedTypeConverter)JsonProcessingInfo$$JsonObjectMapper.SRU_STATE_CONVERTER).serialize((Object)jsonProcessingInfo.a, "state", true, tfe);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonProcessingInfo jsonProcessingInfo, final String s, final khe khe) throws IOException {
        if ("check_after_secs".equals(s)) {
            jsonProcessingInfo.b = khe.z();
        }
        else if ("error".equals(s)) {
            jsonProcessingInfo.d = (c4r)LoganSquare.typeConverterFor((Class)c4r.class).parse(khe);
        }
        else if ("progress_percent".equals(s)) {
            jsonProcessingInfo.c = khe.z();
        }
        else if ("state".equals(s)) {
            jsonProcessingInfo.a = (int)((StringBasedTypeConverter)JsonProcessingInfo$$JsonObjectMapper.SRU_STATE_CONVERTER).parse(khe);
        }
    }
    
    public JsonProcessingInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonProcessingInfo jsonProcessingInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonProcessingInfo, tfe, b);
    }
}
