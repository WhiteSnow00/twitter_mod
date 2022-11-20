// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineUrlButton$$JsonObjectMapper extends JsonMapper<JsonTimelineUrlButton>
{
    public static JsonTimelineUrlButton _parse(final tge tge) throws IOException {
        final JsonTimelineUrlButton jsonTimelineUrlButton = new JsonTimelineUrlButton();
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
            parseField(jsonTimelineUrlButton, d, tge);
            tge.l0();
        }
        return jsonTimelineUrlButton;
    }
    
    public static void _serialize(final JsonTimelineUrlButton jsonTimelineUrlButton, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("text", jsonTimelineUrlButton.a);
        if (jsonTimelineUrlButton.b != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonTimelineUrlButton.b, "url", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineUrlButton jsonTimelineUrlButton, final String s, final tge tge) throws IOException {
        if ("text".equals(s)) {
            jsonTimelineUrlButton.a = tge.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonTimelineUrlButton.b = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
    }
    
    public JsonTimelineUrlButton parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineUrlButton jsonTimelineUrlButton, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineUrlButton, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineUrlButton)o, afe, b);
    }
}
