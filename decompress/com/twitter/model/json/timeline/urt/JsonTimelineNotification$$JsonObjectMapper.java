// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineNotification$$JsonObjectMapper extends JsonMapper<JsonTimelineNotification>
{
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    
    static {
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
    }
    
    public static JsonTimelineNotification _parse(final tge tge) throws IOException {
        final JsonTimelineNotification jsonTimelineNotification = new JsonTimelineNotification();
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
            parseField(jsonTimelineNotification, d, tge);
            tge.l0();
        }
        return jsonTimelineNotification;
    }
    
    public static void _serialize(final JsonTimelineNotification jsonTimelineNotification, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("id", jsonTimelineNotification.a);
        final u4t c = jsonTimelineNotification.c;
        if (c == null) {
            if (jsonTimelineNotification.b != null) {
                LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonTimelineNotification.b, "url", true, afe);
            }
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<u4t>)JsonTimelineNotification$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(c, "socialContext", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonTimelineNotification jsonTimelineNotification, final String s, final tge tge) throws IOException {
        if ("id".equals(s)) {
            jsonTimelineNotification.a = tge.T((String)null);
        }
        else if ("socialContext".equals(s)) {
            jsonTimelineNotification.c = ((hfe<u4t>)JsonTimelineNotification$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(tge);
        }
        else if ("url".equals(s)) {
            jsonTimelineNotification.b = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
    }
    
    public JsonTimelineNotification parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineNotification jsonTimelineNotification, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineNotification, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineNotification)o, afe, b);
    }
}
