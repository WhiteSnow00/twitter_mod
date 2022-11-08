// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineScribeConfig$$JsonObjectMapper extends JsonMapper<JsonTimelineScribeConfig>
{
    public static JsonTimelineScribeConfig _parse(final khe khe) throws IOException {
        final JsonTimelineScribeConfig jsonTimelineScribeConfig = new JsonTimelineScribeConfig();
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
            parseField(jsonTimelineScribeConfig, d, khe);
            khe.m0();
        }
        return jsonTimelineScribeConfig;
    }
    
    public static void _serialize(final JsonTimelineScribeConfig jsonTimelineScribeConfig, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("page", jsonTimelineScribeConfig.a);
        tfe.u0("section", jsonTimelineScribeConfig.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineScribeConfig jsonTimelineScribeConfig, final String s, final khe khe) throws IOException {
        if ("page".equals(s)) {
            jsonTimelineScribeConfig.a = khe.T((String)null);
        }
        else if ("section".equals(s)) {
            jsonTimelineScribeConfig.b = khe.T((String)null);
        }
    }
    
    public JsonTimelineScribeConfig parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineScribeConfig jsonTimelineScribeConfig, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineScribeConfig, tfe, b);
    }
}
