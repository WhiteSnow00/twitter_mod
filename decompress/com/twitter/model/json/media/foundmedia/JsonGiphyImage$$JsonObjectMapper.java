// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.Iterator;
import java.util.HashMap;
import com.twitter.model.json.core.JsonMediaSizeVariant$$JsonObjectMapper;
import com.twitter.model.json.core.JsonMediaSizeVariant;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGiphyImage$$JsonObjectMapper extends JsonMapper<JsonGiphyImage>
{
    public static JsonGiphyImage _parse(final khe khe) throws IOException {
        final JsonGiphyImage jsonGiphyImage = new JsonGiphyImage();
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
            parseField(jsonGiphyImage, d, khe);
            khe.m0();
        }
        return jsonGiphyImage;
    }
    
    public static void _serialize(final JsonGiphyImage jsonGiphyImage, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("id", jsonGiphyImage.a);
        final HashMap c = jsonGiphyImage.c;
        if (c != null) {
            final Iterator h = q1a.h(tfe, "images", c);
            while (h.hasNext()) {
                final Map.Entry<String, JsonMediaSizeVariant> entry = h.next();
                if (o1a.g((String)entry.getKey(), tfe, (Map.Entry)entry) == null) {
                    tfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonMediaSizeVariant$$JsonObjectMapper._serialize((JsonMediaSizeVariant)entry.getValue(), tfe, true);
                }
            }
            tfe.h();
        }
        tfe.u0("url", jsonGiphyImage.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGiphyImage jsonGiphyImage, String j, final khe khe) throws IOException {
        if ("id".equals(j)) {
            jsonGiphyImage.a = khe.T((String)null);
        }
        else if ("images".equals(j)) {
            if (khe.e() == lje.K0) {
                final HashMap c = new HashMap();
                while (khe.i0() != lje.L0) {
                    j = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        c.put(j, null);
                    }
                    else {
                        c.put(j, JsonMediaSizeVariant$$JsonObjectMapper._parse(khe));
                    }
                }
                jsonGiphyImage.c = c;
            }
            else {
                jsonGiphyImage.c = null;
            }
        }
        else if ("url".equals(j)) {
            jsonGiphyImage.b = khe.T((String)null);
        }
    }
    
    public JsonGiphyImage parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGiphyImage jsonGiphyImage, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGiphyImage, tfe, b);
    }
}
