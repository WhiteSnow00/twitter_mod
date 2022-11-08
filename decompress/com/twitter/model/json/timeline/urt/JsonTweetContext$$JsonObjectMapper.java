// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetContext$$JsonObjectMapper extends JsonMapper<JsonTweetContext>
{
    public static JsonTweetContext _parse(final khe khe) throws IOException {
        final JsonTweetContext jsonTweetContext = new JsonTweetContext();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonTweetContext, d, khe);
            khe.m0();
        }
        return jsonTweetContext;
    }
    
    public static void _serialize(final JsonTweetContext jsonTweetContext, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList c = jsonTweetContext.c;
        if (c != null) {
            final Iterator g = q1a.g(tfe, "contextImageUrls", c);
            while (g.hasNext()) {
                tfe.s0((String)g.next());
            }
            tfe.f();
        }
        if (jsonTweetContext.a != null) {
            LoganSquare.typeConverterFor((Class)yde.class).serialize((Object)jsonTweetContext.a, "contextType", true, tfe);
        }
        if (jsonTweetContext.d != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonTweetContext.d, "landingUrl", true, tfe);
        }
        tfe.u0("text", jsonTweetContext.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTweetContext jsonTweetContext, final String s, final khe khe) throws IOException {
        if ("contextImageUrls".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final String t = khe.T((String)null);
                    if (t != null) {
                        c.add(t);
                    }
                }
                jsonTweetContext.c = c;
            }
            else {
                jsonTweetContext.c = null;
            }
        }
        else if ("contextType".equals(s)) {
            jsonTweetContext.a = (yde)LoganSquare.typeConverterFor((Class)yde.class).parse(khe);
        }
        else if ("landingUrl".equals(s)) {
            jsonTweetContext.d = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonTweetContext.b = khe.T((String)null);
        }
    }
    
    public JsonTweetContext parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTweetContext jsonTweetContext, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTweetContext, tfe, b);
    }
}
