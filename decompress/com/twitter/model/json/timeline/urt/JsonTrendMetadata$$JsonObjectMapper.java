// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTrendMetadata$$JsonObjectMapper extends JsonMapper<JsonTrendMetadata>
{
    public static JsonTrendMetadata _parse(final khe khe) throws IOException {
        final JsonTrendMetadata jsonTrendMetadata = new JsonTrendMetadata();
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
            parseField(jsonTrendMetadata, d, khe);
            khe.m0();
        }
        return jsonTrendMetadata;
    }
    
    public static void _serialize(final JsonTrendMetadata jsonTrendMetadata, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("domainContext", jsonTrendMetadata.c);
        tfe.u0("metaDescription", jsonTrendMetadata.b);
        if (jsonTrendMetadata.a != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonTrendMetadata.a, "url", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTrendMetadata jsonTrendMetadata, final String s, final khe khe) throws IOException {
        if ("domainContext".equals(s)) {
            jsonTrendMetadata.c = khe.T((String)null);
        }
        else if ("metaDescription".equals(s)) {
            jsonTrendMetadata.b = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonTrendMetadata.a = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
    }
    
    public JsonTrendMetadata parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTrendMetadata jsonTrendMetadata, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTrendMetadata, tfe, b);
    }
}
