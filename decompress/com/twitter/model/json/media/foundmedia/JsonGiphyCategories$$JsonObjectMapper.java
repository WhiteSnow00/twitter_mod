// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGiphyCategories$$JsonObjectMapper extends JsonMapper<JsonGiphyCategories>
{
    public static JsonGiphyCategories _parse(final tge tge) throws IOException {
        final JsonGiphyCategories jsonGiphyCategories = new JsonGiphyCategories();
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
            parseField(jsonGiphyCategories, d, tge);
            tge.l0();
        }
        return jsonGiphyCategories;
    }
    
    public static void _serialize(final JsonGiphyCategories jsonGiphyCategories, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonGiphyCategories.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "data", a);
            while (a2.hasNext()) {
                final w2c w2c = a2.next();
                if (w2c != null) {
                    LoganSquare.typeConverterFor((Class)w2c.class).serialize((Object)w2c, "lslocaldataElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonGiphyCategories.b != null) {
            LoganSquare.typeConverterFor((Class)z2c.class).serialize((Object)jsonGiphyCategories.b, "pagination", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGiphyCategories jsonGiphyCategories, final String s, final tge tge) throws IOException {
        if ("data".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final w2c w2c = (w2c)LoganSquare.typeConverterFor((Class)w2c.class).parse(tge);
                    if (w2c != null) {
                        a.add(w2c);
                    }
                }
                jsonGiphyCategories.a = a;
            }
            else {
                jsonGiphyCategories.a = null;
            }
        }
        else if ("pagination".equals(s)) {
            jsonGiphyCategories.b = (z2c)LoganSquare.typeConverterFor((Class)z2c.class).parse(tge);
        }
    }
    
    public JsonGiphyCategories parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGiphyCategories jsonGiphyCategories, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGiphyCategories, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGiphyCategories)o, afe, b);
    }
}
