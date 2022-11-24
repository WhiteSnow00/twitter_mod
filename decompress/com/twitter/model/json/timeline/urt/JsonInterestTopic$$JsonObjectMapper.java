// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestTopic$$JsonObjectMapper extends JsonMapper<JsonInterestTopic>
{
    public static JsonInterestTopic _parse(final qhe qhe) throws IOException {
        final JsonInterestTopic jsonInterestTopic = new JsonInterestTopic();
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
            parseField(jsonInterestTopic, d, qhe);
            qhe.m0();
        }
        return jsonInterestTopic;
    }
    
    public static void _serialize(final JsonInterestTopic jsonInterestTopic, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("description", jsonInterestTopic.d);
        yfe.e("following", jsonInterestTopic.c);
        yfe.u0("icon_url", jsonInterestTopic.f);
        yfe.u0("id", jsonInterestTopic.a);
        yfe.u0("name", jsonInterestTopic.b);
        yfe.e("not_interested", jsonInterestTopic.e);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonInterestTopic jsonInterestTopic, final String s, final qhe qhe) throws IOException {
        if ("description".equals(s)) {
            jsonInterestTopic.d = qhe.T((String)null);
        }
        else if ("following".equals(s)) {
            jsonInterestTopic.c = qhe.l();
        }
        else if ("icon_url".equals(s)) {
            jsonInterestTopic.f = qhe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonInterestTopic.a = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonInterestTopic.b = qhe.T((String)null);
        }
        else if ("not_interested".equals(s)) {
            jsonInterestTopic.e = qhe.l();
        }
    }
    
    public JsonInterestTopic parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonInterestTopic jsonInterestTopic, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonInterestTopic, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonInterestTopic)o, yfe, b);
    }
}
