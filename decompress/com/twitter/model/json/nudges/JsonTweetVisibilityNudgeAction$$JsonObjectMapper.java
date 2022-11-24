// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetVisibilityNudgeAction$$JsonObjectMapper extends JsonMapper<JsonTweetVisibilityNudgeAction>
{
    public static JsonTweetVisibilityNudgeAction _parse(final qhe qhe) throws IOException {
        final JsonTweetVisibilityNudgeAction jsonTweetVisibilityNudgeAction = new JsonTweetVisibilityNudgeAction();
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
            parseField(jsonTweetVisibilityNudgeAction, d, qhe);
            qhe.m0();
        }
        return jsonTweetVisibilityNudgeAction;
    }
    
    public static void _serialize(final JsonTweetVisibilityNudgeAction jsonTweetVisibilityNudgeAction, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTweetVisibilityNudgeAction.b != null) {
            LoganSquare.typeConverterFor((Class)o0j$c.class).serialize((Object)jsonTweetVisibilityNudgeAction.b, "tweet_visibility_nudge_action_payload", true, yfe);
        }
        yfe.u0("tweet_visibility_nudge_action_type", jsonTweetVisibilityNudgeAction.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTweetVisibilityNudgeAction jsonTweetVisibilityNudgeAction, final String s, final qhe qhe) throws IOException {
        if ("tweet_visibility_nudge_action_payload".equals(s)) {
            jsonTweetVisibilityNudgeAction.b = (o0j$c)LoganSquare.typeConverterFor((Class)o0j$c.class).parse(qhe);
        }
        else if ("tweet_visibility_nudge_action_type".equals(s)) {
            jsonTweetVisibilityNudgeAction.a = qhe.T((String)null);
        }
    }
    
    public JsonTweetVisibilityNudgeAction parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTweetVisibilityNudgeAction jsonTweetVisibilityNudgeAction, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTweetVisibilityNudgeAction, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTweetVisibilityNudgeAction)o, yfe, b);
    }
}
