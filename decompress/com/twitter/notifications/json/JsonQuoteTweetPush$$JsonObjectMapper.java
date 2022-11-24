// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonQuoteTweetPush$$JsonObjectMapper extends JsonMapper<JsonQuoteTweetPush>
{
    public static JsonQuoteTweetPush _parse(final qhe qhe) throws IOException {
        final JsonQuoteTweetPush jsonQuoteTweetPush = new JsonQuoteTweetPush();
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
            parseField(jsonQuoteTweetPush, d, qhe);
            qhe.m0();
        }
        return jsonQuoteTweetPush;
    }
    
    public static void _serialize(final JsonQuoteTweetPush jsonQuoteTweetPush, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("author_avatar_url", jsonQuoteTweetPush.d);
        yfe.u0("author_handle", jsonQuoteTweetPush.b);
        yfe.u0("author_name", jsonQuoteTweetPush.a);
        yfe.W("created_at", jsonQuoteTweetPush.f);
        yfe.u0("image_url", jsonQuoteTweetPush.e);
        yfe.u0("text", jsonQuoteTweetPush.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonQuoteTweetPush jsonQuoteTweetPush, final String s, final qhe qhe) throws IOException {
        if ("author_avatar_url".equals(s)) {
            jsonQuoteTweetPush.d = qhe.T((String)null);
        }
        else if ("author_handle".equals(s)) {
            jsonQuoteTweetPush.b = qhe.T((String)null);
        }
        else if ("author_name".equals(s)) {
            jsonQuoteTweetPush.a = qhe.T((String)null);
        }
        else if ("created_at".equals(s)) {
            jsonQuoteTweetPush.f = qhe.L();
        }
        else if ("image_url".equals(s)) {
            jsonQuoteTweetPush.e = qhe.T((String)null);
        }
        else if ("text".equals(s)) {
            jsonQuoteTweetPush.c = qhe.T((String)null);
        }
    }
    
    public JsonQuoteTweetPush parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonQuoteTweetPush jsonQuoteTweetPush, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonQuoteTweetPush, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonQuoteTweetPush)o, yfe, b);
    }
}
