// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGiphyImages$$JsonObjectMapper extends JsonMapper<JsonGiphyImages>
{
    public static JsonGiphyImages _parse(final tge tge) throws IOException {
        final JsonGiphyImages jsonGiphyImages = new JsonGiphyImages();
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
            parseField(jsonGiphyImages, d, tge);
            tge.l0();
        }
        return jsonGiphyImages;
    }
    
    public static void _serialize(final JsonGiphyImages jsonGiphyImages, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonGiphyImages.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "data", a);
            while (a2.hasNext()) {
                final x2c x2c = a2.next();
                if (x2c != null) {
                    LoganSquare.typeConverterFor((Class)x2c.class).serialize((Object)x2c, "lslocaldataElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonGiphyImages.b != null) {
            LoganSquare.typeConverterFor((Class)z2c.class).serialize((Object)jsonGiphyImages.b, "pagination", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGiphyImages jsonGiphyImages, final String s, final tge tge) throws IOException {
        if ("data".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final x2c x2c = (x2c)LoganSquare.typeConverterFor((Class)x2c.class).parse(tge);
                    if (x2c != null) {
                        a.add(x2c);
                    }
                }
                jsonGiphyImages.a = a;
            }
            else {
                jsonGiphyImages.a = null;
            }
        }
        else if ("pagination".equals(s)) {
            jsonGiphyImages.b = (z2c)LoganSquare.typeConverterFor((Class)z2c.class).parse(tge);
        }
    }
    
    public JsonGiphyImages parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGiphyImages jsonGiphyImages, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGiphyImages, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGiphyImages)o, afe, b);
    }
}
