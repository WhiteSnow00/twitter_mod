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
    public static JsonGiphyImage _parse(final tge tge) throws IOException {
        final JsonGiphyImage jsonGiphyImage = new JsonGiphyImage();
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
            parseField(jsonGiphyImage, d, tge);
            tge.l0();
        }
        return jsonGiphyImage;
    }
    
    public static void _serialize(final JsonGiphyImage jsonGiphyImage, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("id", jsonGiphyImage.a);
        final HashMap c = jsonGiphyImage.c;
        if (c != null) {
            final Iterator z = mw.z(afe, "images", c);
            while (z.hasNext()) {
                final Map.Entry<String, JsonMediaSizeVariant> entry = z.next();
                if (sde.e((String)entry.getKey(), afe, (Map.Entry)entry) == null) {
                    afe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonMediaSizeVariant$$JsonObjectMapper._serialize((JsonMediaSizeVariant)entry.getValue(), afe, true);
                }
            }
            afe.h();
        }
        afe.t0("url", jsonGiphyImage.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGiphyImage jsonGiphyImage, final String s, final tge tge) throws IOException {
        if ("id".equals(s)) {
            jsonGiphyImage.a = tge.T((String)null);
        }
        else if ("images".equals(s)) {
            if (tge.e() == vie.L0) {
                final HashMap c = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String j = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        c.put(j, null);
                    }
                    else {
                        c.put(j, JsonMediaSizeVariant$$JsonObjectMapper._parse(tge));
                    }
                }
                jsonGiphyImage.c = c;
            }
            else {
                jsonGiphyImage.c = null;
            }
        }
        else if ("url".equals(s)) {
            jsonGiphyImage.b = tge.T((String)null);
        }
    }
    
    public JsonGiphyImage parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGiphyImage jsonGiphyImage, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGiphyImage, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGiphyImage)o, afe, b);
    }
}
