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
    public static JsonGiphyCategories _parse(final khe khe) throws IOException {
        final JsonGiphyCategories jsonGiphyCategories = new JsonGiphyCategories();
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
            parseField(jsonGiphyCategories, d, khe);
            khe.m0();
        }
        return jsonGiphyCategories;
    }
    
    public static void _serialize(final JsonGiphyCategories jsonGiphyCategories, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonGiphyCategories.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "data", a);
            while (g.hasNext()) {
                final u3c u3c = g.next();
                if (u3c != null) {
                    LoganSquare.typeConverterFor((Class)u3c.class).serialize((Object)u3c, "lslocaldataElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonGiphyCategories.b != null) {
            LoganSquare.typeConverterFor((Class)x3c.class).serialize((Object)jsonGiphyCategories.b, "pagination", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGiphyCategories jsonGiphyCategories, final String s, final khe khe) throws IOException {
        if ("data".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final u3c u3c = (u3c)LoganSquare.typeConverterFor((Class)u3c.class).parse(khe);
                    if (u3c != null) {
                        a.add(u3c);
                    }
                }
                jsonGiphyCategories.a = a;
            }
            else {
                jsonGiphyCategories.a = null;
            }
        }
        else if ("pagination".equals(s)) {
            jsonGiphyCategories.b = (x3c)LoganSquare.typeConverterFor((Class)x3c.class).parse(khe);
        }
    }
    
    public JsonGiphyCategories parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGiphyCategories jsonGiphyCategories, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGiphyCategories, tfe, b);
    }
}
