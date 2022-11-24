// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadResultContext$$JsonObjectMapper extends JsonMapper<JsonTypeaheadResultContext>
{
    public static JsonTypeaheadResultContext _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadResultContext jsonTypeaheadResultContext = new JsonTypeaheadResultContext();
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
            parseField(jsonTypeaheadResultContext, d, qhe);
            qhe.m0();
        }
        return jsonTypeaheadResultContext;
    }
    
    public static void _serialize(final JsonTypeaheadResultContext jsonTypeaheadResultContext, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("display_string", jsonTypeaheadResultContext.a);
        yfe.u0("icon_url", jsonTypeaheadResultContext.b);
        final ArrayList c = jsonTypeaheadResultContext.c;
        if (c != null) {
            final Iterator e = d10.E(yfe, "types", c);
            while (e.hasNext()) {
                final JsonTypeaheadContextType jsonTypeaheadContextType = e.next();
                if (jsonTypeaheadContextType != null) {
                    JsonTypeaheadContextType$$JsonObjectMapper._serialize(jsonTypeaheadContextType, yfe, true);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadResultContext jsonTypeaheadResultContext, final String s, final qhe qhe) throws IOException {
        if ("display_string".equals(s)) {
            jsonTypeaheadResultContext.a = qhe.T((String)null);
        }
        else if ("icon_url".equals(s)) {
            jsonTypeaheadResultContext.b = qhe.T((String)null);
        }
        else if ("types".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonTypeaheadContextType parse = JsonTypeaheadContextType$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        c.add(parse);
                    }
                }
                jsonTypeaheadResultContext.c = c;
            }
            else {
                jsonTypeaheadResultContext.c = null;
            }
        }
    }
    
    public JsonTypeaheadResultContext parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadResultContext jsonTypeaheadResultContext, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTypeaheadResultContext, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadResultContext)o, yfe, b);
    }
}
