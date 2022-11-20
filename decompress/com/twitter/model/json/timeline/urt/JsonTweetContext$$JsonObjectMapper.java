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
    public static JsonTweetContext _parse(final tge tge) throws IOException {
        final JsonTweetContext jsonTweetContext = new JsonTweetContext();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonTweetContext, d, tge);
            tge.l0();
        }
        return jsonTweetContext;
    }
    
    public static void _serialize(final JsonTweetContext jsonTweetContext, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList c = jsonTweetContext.c;
        if (c != null) {
            final Iterator a = br.A(afe, "contextImageUrls", c);
            while (a.hasNext()) {
                afe.r0((String)a.next());
            }
            afe.f();
        }
        if (jsonTweetContext.a != null) {
            LoganSquare.typeConverterFor((Class)ede.class).serialize((Object)jsonTweetContext.a, "contextType", true, afe);
        }
        if (jsonTweetContext.d != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonTweetContext.d, "landingUrl", true, afe);
        }
        afe.t0("text", jsonTweetContext.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTweetContext jsonTweetContext, final String s, final tge tge) throws IOException {
        if ("contextImageUrls".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t = tge.T((String)null);
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
            jsonTweetContext.a = (ede)LoganSquare.typeConverterFor((Class)ede.class).parse(tge);
        }
        else if ("landingUrl".equals(s)) {
            jsonTweetContext.d = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
        else if ("text".equals(s)) {
            jsonTweetContext.b = tge.T((String)null);
        }
    }
    
    public JsonTweetContext parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTweetContext jsonTweetContext, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTweetContext, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTweetContext)o, afe, b);
    }
}
