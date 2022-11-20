// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTrendMetadata$$JsonObjectMapper extends JsonMapper<JsonTrendMetadata>
{
    public static JsonTrendMetadata _parse(final tge tge) throws IOException {
        final JsonTrendMetadata jsonTrendMetadata = new JsonTrendMetadata();
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
            parseField(jsonTrendMetadata, d, tge);
            tge.l0();
        }
        return jsonTrendMetadata;
    }
    
    public static void _serialize(final JsonTrendMetadata jsonTrendMetadata, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("domainContext", jsonTrendMetadata.c);
        afe.t0("metaDescription", jsonTrendMetadata.b);
        if (jsonTrendMetadata.a != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonTrendMetadata.a, "url", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTrendMetadata jsonTrendMetadata, final String s, final tge tge) throws IOException {
        if ("domainContext".equals(s)) {
            jsonTrendMetadata.c = tge.T((String)null);
        }
        else if ("metaDescription".equals(s)) {
            jsonTrendMetadata.b = tge.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonTrendMetadata.a = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
    }
    
    public JsonTrendMetadata parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTrendMetadata jsonTrendMetadata, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTrendMetadata, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTrendMetadata)o, afe, b);
    }
}
