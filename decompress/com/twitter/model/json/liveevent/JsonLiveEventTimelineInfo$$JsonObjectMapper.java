// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventTimelineInfo$$JsonObjectMapper extends JsonMapper<JsonLiveEventTimelineInfo>
{
    public static JsonLiveEventTimelineInfo _parse(final tge tge) throws IOException {
        final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo = new JsonLiveEventTimelineInfo();
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
            parseField(jsonLiveEventTimelineInfo, d, tge);
            tge.l0();
        }
        return jsonLiveEventTimelineInfo;
    }
    
    public static void _serialize(final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("compose_semantic_core_id", jsonLiveEventTimelineInfo.d);
        afe.t0("compose_timeline_id", jsonLiveEventTimelineInfo.f);
        if (jsonLiveEventTimelineInfo.e != null) {
            LoganSquare.typeConverterFor((Class)hd7.class).serialize((Object)jsonLiveEventTimelineInfo.e, "customization_info", true, afe);
        }
        afe.t0("hashtag", jsonLiveEventTimelineInfo.c);
        afe.t0("timeline_id", jsonLiveEventTimelineInfo.a);
        afe.t0("timeline_source_id", jsonLiveEventTimelineInfo.g);
        afe.t0("timeline_source_type", jsonLiveEventTimelineInfo.h);
        afe.t0("title", jsonLiveEventTimelineInfo.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo, final String s, final tge tge) throws IOException {
        if ("compose_semantic_core_id".equals(s)) {
            jsonLiveEventTimelineInfo.d = tge.T((String)null);
        }
        else if ("compose_timeline_id".equals(s)) {
            jsonLiveEventTimelineInfo.f = tge.T((String)null);
        }
        else if ("customization_info".equals(s)) {
            jsonLiveEventTimelineInfo.e = (hd7)LoganSquare.typeConverterFor((Class)hd7.class).parse(tge);
        }
        else if ("hashtag".equals(s)) {
            jsonLiveEventTimelineInfo.c = tge.T((String)null);
        }
        else if ("timeline_id".equals(s)) {
            jsonLiveEventTimelineInfo.a = tge.T((String)null);
        }
        else if ("timeline_source_id".equals(s)) {
            jsonLiveEventTimelineInfo.g = tge.T((String)null);
        }
        else if ("timeline_source_type".equals(s)) {
            jsonLiveEventTimelineInfo.h = tge.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonLiveEventTimelineInfo.b = tge.T((String)null);
        }
    }
    
    public JsonLiveEventTimelineInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveEventTimelineInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventTimelineInfo)o, afe, b);
    }
}
