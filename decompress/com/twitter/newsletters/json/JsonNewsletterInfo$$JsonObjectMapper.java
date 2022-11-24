// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNewsletterInfo$$JsonObjectMapper extends JsonMapper<JsonNewsletterInfo>
{
    public static JsonNewsletterInfo _parse(final qhe qhe) throws IOException {
        final JsonNewsletterInfo jsonNewsletterInfo = new JsonNewsletterInfo();
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
            parseField(jsonNewsletterInfo, d, qhe);
            qhe.m0();
        }
        return jsonNewsletterInfo;
    }
    
    public static void _serialize(final JsonNewsletterInfo jsonNewsletterInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("author", jsonNewsletterInfo.c);
        yfe.u0("description", jsonNewsletterInfo.b);
        yfe.u0("title", jsonNewsletterInfo.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNewsletterInfo jsonNewsletterInfo, final String s, final qhe qhe) throws IOException {
        if ("author".equals(s)) {
            jsonNewsletterInfo.c = qhe.T((String)null);
        }
        else if ("description".equals(s)) {
            jsonNewsletterInfo.b = qhe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonNewsletterInfo.a = qhe.T((String)null);
        }
    }
    
    public JsonNewsletterInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNewsletterInfo jsonNewsletterInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNewsletterInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNewsletterInfo)o, yfe, b);
    }
}
