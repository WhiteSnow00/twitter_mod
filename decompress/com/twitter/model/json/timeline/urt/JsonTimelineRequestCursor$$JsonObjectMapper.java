// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineRequestCursor$$JsonObjectMapper extends JsonMapper<JsonTimelineRequestCursor>
{
    public static final h97 CURSOR_TYPE_TYPE_CONVERTER;
    
    static {
        CURSOR_TYPE_TYPE_CONVERTER = new h97();
    }
    
    public static JsonTimelineRequestCursor _parse(final tge tge) throws IOException {
        final JsonTimelineRequestCursor jsonTimelineRequestCursor = new JsonTimelineRequestCursor();
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
            parseField(jsonTimelineRequestCursor, d, tge);
            tge.l0();
        }
        return jsonTimelineRequestCursor;
    }
    
    public static void _serialize(final JsonTimelineRequestCursor jsonTimelineRequestCursor, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineRequestCursor.c != null) {
            LoganSquare.typeConverterFor((Class)u87.class).serialize((Object)jsonTimelineRequestCursor.c, "displayTreatment", true, afe);
        }
        ((StringBasedTypeConverter)JsonTimelineRequestCursor$$JsonObjectMapper.CURSOR_TYPE_TYPE_CONVERTER).serialize((Object)jsonTimelineRequestCursor.b, "cursorType", true, afe);
        afe.t0("value", jsonTimelineRequestCursor.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineRequestCursor jsonTimelineRequestCursor, final String s, final tge tge) throws IOException {
        if ("displayTreatment".equals(s)) {
            jsonTimelineRequestCursor.c = (u87)LoganSquare.typeConverterFor((Class)u87.class).parse(tge);
        }
        else if ("cursorType".equals(s)) {
            jsonTimelineRequestCursor.b = (int)((StringBasedTypeConverter)JsonTimelineRequestCursor$$JsonObjectMapper.CURSOR_TYPE_TYPE_CONVERTER).parse(tge);
        }
        else if ("value".equals(s)) {
            jsonTimelineRequestCursor.a = tge.T((String)null);
        }
    }
    
    public JsonTimelineRequestCursor parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineRequestCursor jsonTimelineRequestCursor, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineRequestCursor, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineRequestCursor)o, afe, b);
    }
}
