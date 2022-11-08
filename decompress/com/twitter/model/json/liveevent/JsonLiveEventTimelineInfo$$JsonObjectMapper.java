// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventTimelineInfo$$JsonObjectMapper extends JsonMapper<JsonLiveEventTimelineInfo>
{
    public static JsonLiveEventTimelineInfo _parse(final khe khe) throws IOException {
        final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo = new JsonLiveEventTimelineInfo();
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
            parseField(jsonLiveEventTimelineInfo, d, khe);
            khe.m0();
        }
        return jsonLiveEventTimelineInfo;
    }
    
    public static void _serialize(final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("compose_semantic_core_id", jsonLiveEventTimelineInfo.d);
        tfe.u0("compose_timeline_id", jsonLiveEventTimelineInfo.f);
        if (jsonLiveEventTimelineInfo.e != null) {
            LoganSquare.typeConverterFor((Class)ae7.class).serialize((Object)jsonLiveEventTimelineInfo.e, "customization_info", true, tfe);
        }
        tfe.u0("hashtag", jsonLiveEventTimelineInfo.c);
        tfe.u0("timeline_id", jsonLiveEventTimelineInfo.a);
        tfe.u0("timeline_source_id", jsonLiveEventTimelineInfo.g);
        tfe.u0("timeline_source_type", jsonLiveEventTimelineInfo.h);
        tfe.u0("title", jsonLiveEventTimelineInfo.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo, final String s, final khe khe) throws IOException {
        if ("compose_semantic_core_id".equals(s)) {
            jsonLiveEventTimelineInfo.d = khe.T((String)null);
        }
        else if ("compose_timeline_id".equals(s)) {
            jsonLiveEventTimelineInfo.f = khe.T((String)null);
        }
        else if ("customization_info".equals(s)) {
            jsonLiveEventTimelineInfo.e = (ae7)LoganSquare.typeConverterFor((Class)ae7.class).parse(khe);
        }
        else if ("hashtag".equals(s)) {
            jsonLiveEventTimelineInfo.c = khe.T((String)null);
        }
        else if ("timeline_id".equals(s)) {
            jsonLiveEventTimelineInfo.a = khe.T((String)null);
        }
        else if ("timeline_source_id".equals(s)) {
            jsonLiveEventTimelineInfo.g = khe.T((String)null);
        }
        else if ("timeline_source_type".equals(s)) {
            jsonLiveEventTimelineInfo.h = khe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonLiveEventTimelineInfo.b = khe.T((String)null);
        }
    }
    
    public JsonLiveEventTimelineInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventTimelineInfo jsonLiveEventTimelineInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventTimelineInfo, tfe, b);
    }
}
