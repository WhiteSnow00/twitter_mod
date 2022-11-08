// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.promoted;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.ads.api.JsonPreroll$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPrerollMetadata$$JsonObjectMapper extends JsonMapper<JsonPrerollMetadata>
{
    public static JsonPrerollMetadata _parse(final khe khe) throws IOException {
        final JsonPrerollMetadata jsonPrerollMetadata = new JsonPrerollMetadata();
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
            parseField(jsonPrerollMetadata, d, khe);
            khe.m0();
        }
        return jsonPrerollMetadata;
    }
    
    public static void _serialize(final JsonPrerollMetadata jsonPrerollMetadata, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonPrerollMetadata.a != null) {
            tfe.i("preroll");
            JsonPreroll$$JsonObjectMapper._serialize(jsonPrerollMetadata.a, tfe, true);
        }
        if (jsonPrerollMetadata.c != null) {
            LoganSquare.typeConverterFor((Class)hn9.class).serialize((Object)jsonPrerollMetadata.c, "promotedContent", true, tfe);
        }
        tfe.u0("videoAnalyticsScribePassthrough", jsonPrerollMetadata.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonPrerollMetadata jsonPrerollMetadata, final String s, final khe khe) throws IOException {
        if ("preroll".equals(s)) {
            jsonPrerollMetadata.a = JsonPreroll$$JsonObjectMapper._parse(khe);
        }
        else if ("promotedContent".equals(s)) {
            jsonPrerollMetadata.c = (hn9)LoganSquare.typeConverterFor((Class)hn9.class).parse(khe);
        }
        else if ("videoAnalyticsScribePassthrough".equals(s)) {
            jsonPrerollMetadata.b = khe.T((String)null);
        }
    }
    
    public JsonPrerollMetadata parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonPrerollMetadata jsonPrerollMetadata, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonPrerollMetadata, tfe, b);
    }
}
