// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineScribeConfig$$JsonObjectMapper extends JsonMapper<JsonTimelineScribeConfig>
{
    public static JsonTimelineScribeConfig _parse(final tge tge) throws IOException {
        final JsonTimelineScribeConfig jsonTimelineScribeConfig = new JsonTimelineScribeConfig();
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
            parseField(jsonTimelineScribeConfig, d, tge);
            tge.l0();
        }
        return jsonTimelineScribeConfig;
    }
    
    public static void _serialize(final JsonTimelineScribeConfig jsonTimelineScribeConfig, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("page", jsonTimelineScribeConfig.a);
        afe.t0("section", jsonTimelineScribeConfig.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineScribeConfig jsonTimelineScribeConfig, final String s, final tge tge) throws IOException {
        if ("page".equals(s)) {
            jsonTimelineScribeConfig.a = tge.T((String)null);
        }
        else if ("section".equals(s)) {
            jsonTimelineScribeConfig.b = tge.T((String)null);
        }
    }
    
    public JsonTimelineScribeConfig parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineScribeConfig jsonTimelineScribeConfig, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineScribeConfig, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineScribeConfig)o, afe, b);
    }
}
