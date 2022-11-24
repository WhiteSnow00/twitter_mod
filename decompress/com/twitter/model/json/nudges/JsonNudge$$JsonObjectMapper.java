// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNudge$$JsonObjectMapper extends JsonMapper<JsonNudge>
{
    public static final ehe JSON_NUDGE_TYPE_CONVERTER;
    
    static {
        JSON_NUDGE_TYPE_CONVERTER = new ehe();
    }
    
    public static JsonNudge _parse(final qhe qhe) throws IOException {
        final JsonNudge jsonNudge = new JsonNudge();
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
            parseField(jsonNudge, d, qhe);
            qhe.m0();
        }
        return jsonNudge;
    }
    
    public static void _serialize(final JsonNudge jsonNudge, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonNudge.b);
        if (jsonNudge.a == null) {
            yfe.u0("proposed_tweet_language", jsonNudge.c);
            if (jsonNudge.d != null) {
                LoganSquare.typeConverterFor((Class)qfu.class).serialize((Object)jsonNudge.d, "tweet_nudge", true, yfe);
            }
            if (b) {
                yfe.h();
            }
            return;
        }
        Objects.requireNonNull(JsonNudge$$JsonObjectMapper.JSON_NUDGE_TYPE_CONVERTER);
        throw new UnsupportedOperationException("serialization is not available for this converter.");
    }
    
    public static void parseField(final JsonNudge jsonNudge, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonNudge.b = qhe.T((String)null);
        }
        else if ("nudge_type".equals(s)) {
            jsonNudge.a = JsonNudge$$JsonObjectMapper.JSON_NUDGE_TYPE_CONVERTER.a(qhe);
        }
        else if ("proposed_tweet_language".equals(s)) {
            jsonNudge.c = qhe.T((String)null);
        }
        else if ("tweet_nudge".equals(s)) {
            jsonNudge.d = (qfu)LoganSquare.typeConverterFor((Class)qfu.class).parse(qhe);
        }
    }
    
    public JsonNudge parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNudge jsonNudge, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNudge, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNudge)o, yfe, b);
    }
}
