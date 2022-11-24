// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetCompositionNudgePayload$$JsonObjectMapper extends JsonMapper<JsonTweetCompositionNudgePayload>
{
    public static JsonTweetCompositionNudgePayload _parse(final qhe qhe) throws IOException {
        final JsonTweetCompositionNudgePayload jsonTweetCompositionNudgePayload = new JsonTweetCompositionNudgePayload();
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
            parseField(jsonTweetCompositionNudgePayload, d, qhe);
            qhe.m0();
        }
        return jsonTweetCompositionNudgePayload;
    }
    
    public static void _serialize(final JsonTweetCompositionNudgePayload jsonTweetCompositionNudgePayload, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("heading", jsonTweetCompositionNudgePayload.a);
        yfe.u0("icon_name", jsonTweetCompositionNudgePayload.c);
        if (jsonTweetCompositionNudgePayload.d != null) {
            LoganSquare.typeConverterFor((Class)s0j.class).serialize((Object)jsonTweetCompositionNudgePayload.d, "nudge_feedback_payload", true, yfe);
        }
        yfe.u0("subheading", jsonTweetCompositionNudgePayload.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTweetCompositionNudgePayload jsonTweetCompositionNudgePayload, final String s, final qhe qhe) throws IOException {
        if ("heading".equals(s)) {
            jsonTweetCompositionNudgePayload.a = qhe.T((String)null);
        }
        else if ("icon_name".equals(s)) {
            jsonTweetCompositionNudgePayload.c = qhe.T((String)null);
        }
        else if ("nudge_feedback_payload".equals(s)) {
            jsonTweetCompositionNudgePayload.d = (s0j)LoganSquare.typeConverterFor((Class)s0j.class).parse(qhe);
        }
        else if ("subheading".equals(s)) {
            jsonTweetCompositionNudgePayload.b = qhe.T((String)null);
        }
    }
    
    public JsonTweetCompositionNudgePayload parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTweetCompositionNudgePayload jsonTweetCompositionNudgePayload, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTweetCompositionNudgePayload, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTweetCompositionNudgePayload)o, yfe, b);
    }
}
