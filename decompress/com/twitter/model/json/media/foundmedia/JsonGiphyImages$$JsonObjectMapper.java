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
    public static JsonGiphyImages _parse(final khe khe) throws IOException {
        final JsonGiphyImages jsonGiphyImages = new JsonGiphyImages();
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
            parseField(jsonGiphyImages, d, khe);
            khe.m0();
        }
        return jsonGiphyImages;
    }
    
    public static void _serialize(final JsonGiphyImages jsonGiphyImages, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonGiphyImages.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "data", a);
            while (g.hasNext()) {
                final v3c v3c = g.next();
                if (v3c != null) {
                    LoganSquare.typeConverterFor((Class)v3c.class).serialize((Object)v3c, "lslocaldataElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonGiphyImages.b != null) {
            LoganSquare.typeConverterFor((Class)x3c.class).serialize((Object)jsonGiphyImages.b, "pagination", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGiphyImages jsonGiphyImages, final String s, final khe khe) throws IOException {
        if ("data".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final v3c v3c = (v3c)LoganSquare.typeConverterFor((Class)v3c.class).parse(khe);
                    if (v3c != null) {
                        a.add(v3c);
                    }
                }
                jsonGiphyImages.a = a;
            }
            else {
                jsonGiphyImages.a = null;
            }
        }
        else if ("pagination".equals(s)) {
            jsonGiphyImages.b = (x3c)LoganSquare.typeConverterFor((Class)x3c.class).parse(khe);
        }
    }
    
    public JsonGiphyImages parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGiphyImages jsonGiphyImages, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGiphyImages, tfe, b);
    }
}
