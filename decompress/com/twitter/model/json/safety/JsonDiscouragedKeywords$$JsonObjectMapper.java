// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.safety;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDiscouragedKeywords$$JsonObjectMapper extends JsonMapper<JsonDiscouragedKeywords>
{
    public static JsonDiscouragedKeywords _parse(final qhe qhe) throws IOException {
        final JsonDiscouragedKeywords jsonDiscouragedKeywords = new JsonDiscouragedKeywords();
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
            parseField(jsonDiscouragedKeywords, d, qhe);
            qhe.m0();
        }
        return jsonDiscouragedKeywords;
    }
    
    public static void _serialize(final JsonDiscouragedKeywords jsonDiscouragedKeywords, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList b2 = jsonDiscouragedKeywords.b;
        if (b2 != null) {
            final Iterator e = d10.E(yfe, "discouraged_keywords", b2);
            while (e.hasNext()) {
                yfe.s0((String)e.next());
            }
            yfe.f();
        }
        yfe.u0("lang", jsonDiscouragedKeywords.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonDiscouragedKeywords jsonDiscouragedKeywords, String t, final qhe qhe) throws IOException {
        if ("discouraged_keywords".equals(t)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    t = qhe.T((String)null);
                    if (t != null) {
                        b.add(t);
                    }
                }
                jsonDiscouragedKeywords.b = b;
            }
            else {
                jsonDiscouragedKeywords.b = null;
            }
        }
        else if ("lang".equals(t)) {
            jsonDiscouragedKeywords.a = qhe.T((String)null);
        }
    }
    
    public JsonDiscouragedKeywords parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonDiscouragedKeywords jsonDiscouragedKeywords, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonDiscouragedKeywords, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonDiscouragedKeywords)o, yfe, b);
    }
}
