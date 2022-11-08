// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineUrlButton$$JsonObjectMapper extends JsonMapper<JsonTimelineUrlButton>
{
    public static JsonTimelineUrlButton _parse(final khe khe) throws IOException {
        final JsonTimelineUrlButton jsonTimelineUrlButton = new JsonTimelineUrlButton();
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
            parseField(jsonTimelineUrlButton, d, khe);
            khe.m0();
        }
        return jsonTimelineUrlButton;
    }
    
    public static void _serialize(final JsonTimelineUrlButton jsonTimelineUrlButton, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("text", jsonTimelineUrlButton.a);
        if (jsonTimelineUrlButton.b != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonTimelineUrlButton.b, "url", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineUrlButton jsonTimelineUrlButton, final String s, final khe khe) throws IOException {
        if ("text".equals(s)) {
            jsonTimelineUrlButton.a = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonTimelineUrlButton.b = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
    }
    
    public JsonTimelineUrlButton parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineUrlButton jsonTimelineUrlButton, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineUrlButton, tfe, b);
    }
}
