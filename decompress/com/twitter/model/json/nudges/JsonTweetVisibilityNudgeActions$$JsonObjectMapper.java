// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.util.ArrayList;
import java.util.Iterator;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetVisibilityNudgeActions$$JsonObjectMapper extends JsonMapper<JsonTweetVisibilityNudgeActions>
{
    public static JsonTweetVisibilityNudgeActions _parse(final qhe qhe) throws IOException {
        final JsonTweetVisibilityNudgeActions jsonTweetVisibilityNudgeActions = new JsonTweetVisibilityNudgeActions();
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
            parseField(jsonTweetVisibilityNudgeActions, d, qhe);
            qhe.m0();
        }
        return jsonTweetVisibilityNudgeActions;
    }
    
    public static void _serialize(final JsonTweetVisibilityNudgeActions jsonTweetVisibilityNudgeActions, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final List<m0j> a = jsonTweetVisibilityNudgeActions.a;
        if (a != null) {
            final Iterator o = ffe.o(yfe, "tweet_visibility_nudge_actions", a);
            while (o.hasNext()) {
                final m0j m0j = o.next();
                if (m0j != null) {
                    LoganSquare.typeConverterFor((Class)m0j.class).serialize((Object)m0j, "lslocaltweet_visibility_nudge_actionsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTweetVisibilityNudgeActions jsonTweetVisibilityNudgeActions, final String s, final qhe qhe) throws IOException {
        if ("tweet_visibility_nudge_actions".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final m0j m0j = (m0j)LoganSquare.typeConverterFor((Class)m0j.class).parse(qhe);
                    if (m0j != null) {
                        a.add(m0j);
                    }
                }
                jsonTweetVisibilityNudgeActions.a = a;
            }
            else {
                jsonTweetVisibilityNudgeActions.a = null;
            }
        }
    }
    
    public JsonTweetVisibilityNudgeActions parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTweetVisibilityNudgeActions jsonTweetVisibilityNudgeActions, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTweetVisibilityNudgeActions, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTweetVisibilityNudgeActions)o, yfe, b);
    }
}
