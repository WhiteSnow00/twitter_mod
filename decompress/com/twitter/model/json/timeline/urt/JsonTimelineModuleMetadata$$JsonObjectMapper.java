// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineModuleMetadata$$JsonObjectMapper extends JsonMapper<JsonTimelineModuleMetadata>
{
    public static JsonTimelineModuleMetadata _parse(final tge tge) throws IOException {
        final JsonTimelineModuleMetadata jsonTimelineModuleMetadata = new JsonTimelineModuleMetadata();
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
            parseField(jsonTimelineModuleMetadata, d, tge);
            tge.l0();
        }
        return jsonTimelineModuleMetadata;
    }
    
    public static void _serialize(final JsonTimelineModuleMetadata jsonTimelineModuleMetadata, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineModuleMetadata.a != null) {
            LoganSquare.typeConverterFor((Class)xzs.class).serialize((Object)jsonTimelineModuleMetadata.a, "conversationMetadata", true, afe);
        }
        if (jsonTimelineModuleMetadata.b != null) {
            LoganSquare.typeConverterFor((Class)a0t.class).serialize((Object)jsonTimelineModuleMetadata.b, "gridCarouselMetadata", true, afe);
        }
        if (jsonTimelineModuleMetadata.c != null) {
            LoganSquare.typeConverterFor((Class)k9t.class).serialize((Object)jsonTimelineModuleMetadata.c, "verticalMetadata", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineModuleMetadata jsonTimelineModuleMetadata, final String s, final tge tge) throws IOException {
        if ("conversationMetadata".equals(s)) {
            jsonTimelineModuleMetadata.a = (xzs)LoganSquare.typeConverterFor((Class)xzs.class).parse(tge);
        }
        else if ("gridCarouselMetadata".equals(s)) {
            jsonTimelineModuleMetadata.b = (a0t)LoganSquare.typeConverterFor((Class)a0t.class).parse(tge);
        }
        else if ("verticalMetadata".equals(s)) {
            jsonTimelineModuleMetadata.c = (k9t)LoganSquare.typeConverterFor((Class)k9t.class).parse(tge);
        }
    }
    
    public JsonTimelineModuleMetadata parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineModuleMetadata jsonTimelineModuleMetadata, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineModuleMetadata, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineModuleMetadata)o, afe, b);
    }
}
