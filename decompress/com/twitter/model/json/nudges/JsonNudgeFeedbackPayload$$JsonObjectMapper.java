// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNudgeFeedbackPayload$$JsonObjectMapper extends JsonMapper<JsonNudgeFeedbackPayload>
{
    public static JsonNudgeFeedbackPayload _parse(final qhe qhe) throws IOException {
        final JsonNudgeFeedbackPayload jsonNudgeFeedbackPayload = new JsonNudgeFeedbackPayload();
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
            parseField(jsonNudgeFeedbackPayload, d, qhe);
            qhe.m0();
        }
        return jsonNudgeFeedbackPayload;
    }
    
    public static void _serialize(final JsonNudgeFeedbackPayload jsonNudgeFeedbackPayload, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("heading", jsonNudgeFeedbackPayload.b);
        yfe.u0("icon_name", jsonNudgeFeedbackPayload.g);
        yfe.u0("link_text", jsonNudgeFeedbackPayload.a);
        yfe.u0("cta_option2", jsonNudgeFeedbackPayload.f);
        yfe.u0("cta_option1", jsonNudgeFeedbackPayload.e);
        yfe.u0("post_feedback_text", jsonNudgeFeedbackPayload.h);
        yfe.u0("subheading", jsonNudgeFeedbackPayload.d);
        yfe.u0("text", jsonNudgeFeedbackPayload.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNudgeFeedbackPayload jsonNudgeFeedbackPayload, final String s, final qhe qhe) throws IOException {
        if ("heading".equals(s)) {
            jsonNudgeFeedbackPayload.b = qhe.T((String)null);
        }
        else if ("icon_name".equals(s)) {
            jsonNudgeFeedbackPayload.g = qhe.T((String)null);
        }
        else if ("link_text".equals(s)) {
            jsonNudgeFeedbackPayload.a = qhe.T((String)null);
        }
        else if ("cta_option2".equals(s)) {
            jsonNudgeFeedbackPayload.f = qhe.T((String)null);
        }
        else if ("cta_option1".equals(s)) {
            jsonNudgeFeedbackPayload.e = qhe.T((String)null);
        }
        else if ("post_feedback_text".equals(s)) {
            jsonNudgeFeedbackPayload.h = qhe.T((String)null);
        }
        else if ("subheading".equals(s)) {
            jsonNudgeFeedbackPayload.d = qhe.T((String)null);
        }
        else if ("text".equals(s)) {
            jsonNudgeFeedbackPayload.c = qhe.T((String)null);
        }
    }
    
    public JsonNudgeFeedbackPayload parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNudgeFeedbackPayload jsonNudgeFeedbackPayload, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNudgeFeedbackPayload, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNudgeFeedbackPayload)o, yfe, b);
    }
}
