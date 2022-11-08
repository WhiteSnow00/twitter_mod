// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.twitter.model.json.core.JsonMediaSize$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMomentMedia$$JsonObjectMapper extends JsonMapper<JsonMomentMedia>
{
    public static JsonMomentMedia _parse(final khe khe) throws IOException {
        final JsonMomentMedia jsonMomentMedia = new JsonMomentMedia();
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
            parseField(jsonMomentMedia, d, khe);
            khe.m0();
        }
        return jsonMomentMedia;
    }
    
    public static void _serialize(final JsonMomentMedia jsonMomentMedia, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("media_id", jsonMomentMedia.a);
        if (jsonMomentMedia.b != null) {
            tfe.i("size");
            JsonMediaSize$$JsonObjectMapper._serialize(jsonMomentMedia.b, tfe, true);
        }
        tfe.u0("url", jsonMomentMedia.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonMomentMedia jsonMomentMedia, final String s, final khe khe) throws IOException {
        if ("media_id".equals(s)) {
            jsonMomentMedia.a = khe.L();
        }
        else if ("size".equals(s)) {
            jsonMomentMedia.b = JsonMediaSize$$JsonObjectMapper._parse(khe);
        }
        else if ("url".equals(s)) {
            jsonMomentMedia.c = khe.T((String)null);
        }
    }
    
    public JsonMomentMedia parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonMomentMedia jsonMomentMedia, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonMomentMedia, tfe, b);
    }
}
