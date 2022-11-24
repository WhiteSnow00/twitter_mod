// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetViewCountData$$JsonObjectMapper extends JsonMapper<JsonTweetViewCountData>
{
    public static JsonTweetViewCountData _parse(final qhe qhe) throws IOException {
        final JsonTweetViewCountData jsonTweetViewCountData = new JsonTweetViewCountData();
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
            parseField(jsonTweetViewCountData, d, qhe);
            qhe.m0();
        }
        return jsonTweetViewCountData;
    }
    
    public static void _serialize(final JsonTweetViewCountData jsonTweetViewCountData, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("impressions", jsonTweetViewCountData.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTweetViewCountData jsonTweetViewCountData, final String s, final qhe qhe) throws IOException {
        if ("impressions".equals(s)) {
            jsonTweetViewCountData.a = qhe.L();
        }
    }
    
    public JsonTweetViewCountData parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTweetViewCountData jsonTweetViewCountData, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTweetViewCountData, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTweetViewCountData)o, yfe, b);
    }
}
