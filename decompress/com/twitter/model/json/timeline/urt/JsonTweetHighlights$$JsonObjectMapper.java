// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.AbstractCollection;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetHighlights$$JsonObjectMapper extends JsonMapper<JsonTweetHighlights>
{
    public static JsonTweetHighlights _parse(final tge tge) throws IOException {
        final JsonTweetHighlights jsonTweetHighlights = new JsonTweetHighlights();
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
            parseField(jsonTweetHighlights, d, tge);
            tge.l0();
        }
        return jsonTweetHighlights;
    }
    
    public static void _serialize(final JsonTweetHighlights jsonTweetHighlights, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final AbstractCollection a = jsonTweetHighlights.a;
        if (a != null) {
            afe.i("textHighlights");
            afe.p0();
            for (final okc okc : a) {
                if (okc != null) {
                    LoganSquare.typeConverterFor((Class)okc.class).serialize((Object)okc, "lslocaltextHighlightsElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTweetHighlights jsonTweetHighlights, final String s, final tge tge) throws IOException {
        if ("textHighlights".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final okc okc = (okc)LoganSquare.typeConverterFor((Class)okc.class).parse(tge);
                    if (okc != null) {
                        a.add(okc);
                    }
                }
                jsonTweetHighlights.a = a;
            }
            else {
                jsonTweetHighlights.a = null;
            }
        }
    }
    
    public JsonTweetHighlights parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTweetHighlights jsonTweetHighlights, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTweetHighlights, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTweetHighlights)o, afe, b);
    }
}
