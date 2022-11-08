// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMomentCoverMedia$$JsonObjectMapper extends JsonMapper<JsonMomentCoverMedia>
{
    public static JsonMomentCoverMedia _parse(final khe khe) throws IOException {
        final JsonMomentCoverMedia jsonMomentCoverMedia = new JsonMomentCoverMedia();
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
            parseField(jsonMomentCoverMedia, d, khe);
            khe.m0();
        }
        return jsonMomentCoverMedia;
    }
    
    public static void _serialize(final JsonMomentCoverMedia jsonMomentCoverMedia, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonMomentCoverMedia.b != null) {
            LoganSquare.typeConverterFor((Class)eph.class).serialize((Object)jsonMomentCoverMedia.b, "media", true, tfe);
        }
        if (jsonMomentCoverMedia.c != null) {
            tfe.i("render");
            JsonRenderData$$JsonObjectMapper._serialize(jsonMomentCoverMedia.c, tfe, true);
        }
        tfe.W("tweet_id", jsonMomentCoverMedia.a);
        if (jsonMomentCoverMedia.d != null) {
            LoganSquare.typeConverterFor((Class)fph.class).serialize((Object)jsonMomentCoverMedia.d, "type", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonMomentCoverMedia jsonMomentCoverMedia, final String s, final khe khe) throws IOException {
        if ("media".equals(s)) {
            jsonMomentCoverMedia.b = (eph)LoganSquare.typeConverterFor((Class)eph.class).parse(khe);
        }
        else if ("render".equals(s)) {
            jsonMomentCoverMedia.c = JsonRenderData$$JsonObjectMapper._parse(khe);
        }
        else if ("tweet_id".equals(s)) {
            jsonMomentCoverMedia.a = khe.L();
        }
        else if ("type".equals(s)) {
            jsonMomentCoverMedia.d = (fph)LoganSquare.typeConverterFor((Class)fph.class).parse(khe);
        }
    }
    
    public JsonMomentCoverMedia parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonMomentCoverMedia jsonMomentCoverMedia, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonMomentCoverMedia, tfe, b);
    }
}
