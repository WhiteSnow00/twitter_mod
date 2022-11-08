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
    public static JsonTweetHighlights _parse(final khe khe) throws IOException {
        final JsonTweetHighlights jsonTweetHighlights = new JsonTweetHighlights();
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
            parseField(jsonTweetHighlights, d, khe);
            khe.m0();
        }
        return jsonTweetHighlights;
    }
    
    public static void _serialize(final JsonTweetHighlights jsonTweetHighlights, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final AbstractCollection a = jsonTweetHighlights.a;
        if (a != null) {
            tfe.i("textHighlights");
            tfe.q0();
            for (final olc olc : a) {
                if (olc != null) {
                    LoganSquare.typeConverterFor((Class)olc.class).serialize((Object)olc, "lslocaltextHighlightsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTweetHighlights jsonTweetHighlights, final String s, final khe khe) throws IOException {
        if ("textHighlights".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final olc olc = (olc)LoganSquare.typeConverterFor((Class)olc.class).parse(khe);
                    if (olc != null) {
                        a.add(olc);
                    }
                }
                jsonTweetHighlights.a = a;
            }
            else {
                jsonTweetHighlights.a = null;
            }
        }
    }
    
    public JsonTweetHighlights parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTweetHighlights jsonTweetHighlights, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTweetHighlights, tfe, b);
    }
}
