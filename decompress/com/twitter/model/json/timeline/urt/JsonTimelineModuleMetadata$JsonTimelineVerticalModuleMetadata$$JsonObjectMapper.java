// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata$$JsonObjectMapper extends JsonMapper<JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata>
{
    public static JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata _parse(final tge tge) throws IOException {
        final JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata jsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata = new JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata();
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
            parseField(jsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata, d, tge);
            tge.l0();
        }
        return jsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata;
    }
    
    public static void _serialize(final JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata jsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("suppressDividers", jsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata jsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata, final String s, final tge tge) throws IOException {
        if ("suppressDividers".equals(s)) {
            jsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata.a = tge.k();
        }
    }
    
    public JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata jsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineModuleMetadata$JsonTimelineVerticalModuleMetadata)o, afe, b);
    }
}
