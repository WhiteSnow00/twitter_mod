// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.model.json.unifiedcard.JsonGraphQlUnifiedCard$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAdMetadataContainerUrt$$JsonObjectMapper extends JsonMapper<JsonAdMetadataContainerUrt>
{
    public static JsonAdMetadataContainerUrt _parse(final qhe qhe) throws IOException {
        final JsonAdMetadataContainerUrt jsonAdMetadataContainerUrt = new JsonAdMetadataContainerUrt();
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
            parseField(jsonAdMetadataContainerUrt, d, qhe);
            qhe.m0();
        }
        return jsonAdMetadataContainerUrt;
    }
    
    public static void _serialize(final JsonAdMetadataContainerUrt jsonAdMetadataContainerUrt, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonAdMetadataContainerUrt.c != null) {
            yfe.i("dynamic_card_content");
            JsonGraphQlUnifiedCard$$JsonObjectMapper._serialize(jsonAdMetadataContainerUrt.c, yfe, true);
        }
        yfe.e("removePromotedAttributionForPreroll", jsonAdMetadataContainerUrt.a);
        yfe.u0("unifiedCardOverride", jsonAdMetadataContainerUrt.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonAdMetadataContainerUrt jsonAdMetadataContainerUrt, final String s, final qhe qhe) throws IOException {
        if ("dynamic_card_content".equals(s)) {
            jsonAdMetadataContainerUrt.c = JsonGraphQlUnifiedCard$$JsonObjectMapper._parse(qhe);
        }
        else if ("removePromotedAttributionForPreroll".equals(s)) {
            jsonAdMetadataContainerUrt.a = qhe.l();
        }
        else if ("unifiedCardOverride".equals(s)) {
            jsonAdMetadataContainerUrt.b = qhe.T((String)null);
        }
    }
    
    public JsonAdMetadataContainerUrt parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonAdMetadataContainerUrt jsonAdMetadataContainerUrt, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonAdMetadataContainerUrt, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonAdMetadataContainerUrt)o, yfe, b);
    }
}
