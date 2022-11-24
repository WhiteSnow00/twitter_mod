// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.safety;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMutedKeyword$$JsonObjectMapper extends JsonMapper<JsonMutedKeyword>
{
    public static JsonMutedKeyword _parse(final qhe qhe) throws IOException {
        final JsonMutedKeyword jsonMutedKeyword = new JsonMutedKeyword();
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
            parseField(jsonMutedKeyword, d, qhe);
            qhe.m0();
        }
        return jsonMutedKeyword;
    }
    
    public static void _serialize(final JsonMutedKeyword jsonMutedKeyword, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("created_at", jsonMutedKeyword.a);
        yfe.u0("id", jsonMutedKeyword.b);
        yfe.u0("keyword", jsonMutedKeyword.c);
        final ArrayList g = jsonMutedKeyword.g;
        if (g != null) {
            final Iterator e = d10.E(yfe, "mute_options", g);
            while (e.hasNext()) {
                final gwh gwh = e.next();
                if (gwh != null) {
                    LoganSquare.typeConverterFor((Class)gwh.class).serialize((Object)gwh, "lslocalmute_optionsElement", false, yfe);
                }
            }
            yfe.f();
        }
        final ArrayList f = jsonMutedKeyword.f;
        if (f != null) {
            final Iterator e2 = d10.E(yfe, "mute_surfaces", f);
            while (e2.hasNext()) {
                final jwh jwh = e2.next();
                if (jwh != null) {
                    LoganSquare.typeConverterFor((Class)jwh.class).serialize((Object)jwh, "lslocalmute_surfacesElement", false, yfe);
                }
            }
            yfe.f();
        }
        yfe.W("valid_from", jsonMutedKeyword.d);
        yfe.W("valid_until", jsonMutedKeyword.e);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMutedKeyword jsonMutedKeyword, final String s, final qhe qhe) throws IOException {
        if ("created_at".equals(s)) {
            jsonMutedKeyword.a = qhe.L();
        }
        else if ("id".equals(s)) {
            jsonMutedKeyword.b = qhe.T((String)null);
        }
        else if ("keyword".equals(s)) {
            jsonMutedKeyword.c = qhe.T((String)null);
        }
        else if ("mute_options".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList g = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final gwh gwh = (gwh)LoganSquare.typeConverterFor((Class)gwh.class).parse(qhe);
                    if (gwh != null) {
                        g.add(gwh);
                    }
                }
                jsonMutedKeyword.g = g;
            }
            else {
                jsonMutedKeyword.g = null;
            }
        }
        else if ("mute_surfaces".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList f = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final jwh jwh = (jwh)LoganSquare.typeConverterFor((Class)jwh.class).parse(qhe);
                    if (jwh != null) {
                        f.add(jwh);
                    }
                }
                jsonMutedKeyword.f = f;
            }
            else {
                jsonMutedKeyword.f = null;
            }
        }
        else if ("valid_from".equals(s)) {
            jsonMutedKeyword.d = qhe.L();
        }
        else if ("valid_until".equals(s)) {
            jsonMutedKeyword.e = qhe.L();
        }
    }
    
    public JsonMutedKeyword parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMutedKeyword jsonMutedKeyword, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMutedKeyword, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMutedKeyword)o, yfe, b);
    }
}
