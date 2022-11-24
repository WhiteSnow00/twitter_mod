// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCreateTweetWithUndoResponse$$JsonObjectMapper extends JsonMapper<JsonCreateTweetWithUndoResponse>
{
    public static JsonCreateTweetWithUndoResponse _parse(final qhe qhe) throws IOException {
        final JsonCreateTweetWithUndoResponse jsonCreateTweetWithUndoResponse = new JsonCreateTweetWithUndoResponse();
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
            parseField(jsonCreateTweetWithUndoResponse, d, qhe);
            qhe.m0();
        }
        return jsonCreateTweetWithUndoResponse;
    }
    
    public static void _serialize(final JsonCreateTweetWithUndoResponse jsonCreateTweetWithUndoResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonCreateTweetWithUndoResponse jsonCreateTweetWithUndoResponse, final String s, final qhe qhe) throws IOException {
    }
    
    public JsonCreateTweetWithUndoResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonCreateTweetWithUndoResponse jsonCreateTweetWithUndoResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonCreateTweetWithUndoResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonCreateTweetWithUndoResponse)o, yfe, b);
    }
}
