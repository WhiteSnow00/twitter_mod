// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.safety;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMutedKeywords$$JsonObjectMapper extends JsonMapper<JsonMutedKeywords>
{
    public static JsonMutedKeywords _parse(final qhe qhe) throws IOException {
        final JsonMutedKeywords jsonMutedKeywords = new JsonMutedKeywords();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonMutedKeywords, d, qhe);
            qhe.m0();
        }
        return jsonMutedKeywords;
    }
    
    public static void _serialize(final JsonMutedKeywords jsonMutedKeywords, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonMutedKeywords.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "muted_keywords", a);
            while (e.hasNext()) {
                final cxh cxh = e.next();
                if (cxh != null) {
                    LoganSquare.typeConverterFor((Class)cxh.class).serialize((Object)cxh, "lslocalmuted_keywordsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMutedKeywords jsonMutedKeywords, final String s, final qhe qhe) throws IOException {
        if ("muted_keywords".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final cxh cxh = (cxh)LoganSquare.typeConverterFor((Class)cxh.class).parse(qhe);
                    if (cxh != null) {
                        a.add(cxh);
                    }
                }
                jsonMutedKeywords.a = a;
            }
            else {
                jsonMutedKeywords.a = null;
            }
        }
    }
    
    public JsonMutedKeywords parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMutedKeywords jsonMutedKeywords, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMutedKeywords, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMutedKeywords)o, yfe, b);
    }
}
