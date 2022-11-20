// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata$$JsonObjectMapper extends JsonMapper<JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata>
{
    public static JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata _parse(final tge tge) throws IOException {
        final JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata jsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata = new JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata();
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
            parseField(jsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata, d, tge);
            tge.l0();
        }
        return jsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata;
    }
    
    public static void _serialize(final JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata jsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("numRows", jsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata jsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata, final String s, final tge tge) throws IOException {
        if ("numRows".equals(s)) {
            jsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata.a = tge.y();
        }
    }
    
    public JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata jsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineModuleMetadata$JsonTimelineModuleGridCarouselMetadata)o, afe, b);
    }
}
