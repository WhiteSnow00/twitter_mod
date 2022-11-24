// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetVisibilityNudgeActionPayload$$JsonObjectMapper extends JsonMapper<JsonTweetVisibilityNudgeActionPayload>
{
    public static JsonTweetVisibilityNudgeActionPayload _parse(final qhe qhe) throws IOException {
        final JsonTweetVisibilityNudgeActionPayload jsonTweetVisibilityNudgeActionPayload = new JsonTweetVisibilityNudgeActionPayload();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonTweetVisibilityNudgeActionPayload, d, qhe);
            qhe.m0();
        }
        return jsonTweetVisibilityNudgeActionPayload;
    }
    
    public static void _serialize(final JsonTweetVisibilityNudgeActionPayload jsonTweetVisibilityNudgeActionPayload, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("cta_title", jsonTweetVisibilityNudgeActionPayload.d);
        if (jsonTweetVisibilityNudgeActionPayload.e != null) {
            LoganSquare.typeConverterFor((Class)c9t.class).serialize((Object)jsonTweetVisibilityNudgeActionPayload.e, "cta_url", true, yfe);
        }
        yfe.u0("heading", jsonTweetVisibilityNudgeActionPayload.a);
        yfe.u0("icon_name", jsonTweetVisibilityNudgeActionPayload.c);
        if (jsonTweetVisibilityNudgeActionPayload.f != null) {
            LoganSquare.typeConverterFor((Class)fym.class).serialize((Object)jsonTweetVisibilityNudgeActionPayload.f, "post_cta_text", true, yfe);
        }
        if (jsonTweetVisibilityNudgeActionPayload.b != null) {
            LoganSquare.typeConverterFor((Class)fym.class).serialize((Object)jsonTweetVisibilityNudgeActionPayload.b, "subheading", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTweetVisibilityNudgeActionPayload jsonTweetVisibilityNudgeActionPayload, final String s, final qhe qhe) throws IOException {
        if ("cta_title".equals(s)) {
            jsonTweetVisibilityNudgeActionPayload.d = qhe.T((String)null);
        }
        else if ("cta_url".equals(s)) {
            jsonTweetVisibilityNudgeActionPayload.e = (c9t)LoganSquare.typeConverterFor((Class)c9t.class).parse(qhe);
        }
        else if ("heading".equals(s)) {
            jsonTweetVisibilityNudgeActionPayload.a = qhe.T((String)null);
        }
        else if ("icon_name".equals(s)) {
            jsonTweetVisibilityNudgeActionPayload.c = qhe.T((String)null);
        }
        else if ("post_cta_text".equals(s)) {
            jsonTweetVisibilityNudgeActionPayload.f = (fym)LoganSquare.typeConverterFor((Class)fym.class).parse(qhe);
        }
        else if ("subheading".equals(s)) {
            jsonTweetVisibilityNudgeActionPayload.b = (fym)LoganSquare.typeConverterFor((Class)fym.class).parse(qhe);
        }
    }
    
    public JsonTweetVisibilityNudgeActionPayload parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTweetVisibilityNudgeActionPayload jsonTweetVisibilityNudgeActionPayload, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTweetVisibilityNudgeActionPayload, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTweetVisibilityNudgeActionPayload)o, yfe, b);
    }
}
