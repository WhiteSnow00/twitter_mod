// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadEvent$$JsonObjectMapper extends JsonMapper<JsonTypeaheadEvent>
{
    public static JsonTypeaheadEvent _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadEvent jsonTypeaheadEvent = new JsonTypeaheadEvent();
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
            parseField(jsonTypeaheadEvent, d, qhe);
            qhe.m0();
        }
        return jsonTypeaheadEvent;
    }
    
    public static void _serialize(final JsonTypeaheadEvent jsonTypeaheadEvent, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("filter", jsonTypeaheadEvent.c);
        yfe.e("follow", jsonTypeaheadEvent.f);
        yfe.u0("hashtag", jsonTypeaheadEvent.k);
        yfe.u0("location", jsonTypeaheadEvent.d);
        final HashMap j = jsonTypeaheadEvent.j;
        if (j != null) {
            final Iterator a = af.A(yfe, "primary_image", j);
            while (a.hasNext()) {
                final Map.Entry<String, hpj> entry = a.next();
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)hpj.class).serialize((Object)entry.getValue(), "lslocalprimary_imageElement", false, yfe);
                }
            }
            yfe.h();
        }
        if (jsonTypeaheadEvent.g != null) {
            LoganSquare.typeConverterFor((Class)dmv.class).serialize((Object)jsonTypeaheadEvent.g, "result_context", true, yfe);
        }
        yfe.W("sc_entity_id", jsonTypeaheadEvent.l);
        yfe.u0("supporting_text", jsonTypeaheadEvent.i);
        final ArrayList a2 = jsonTypeaheadEvent.a;
        if (a2 != null) {
            final Iterator e = d10.E(yfe, "tokens", a2);
            while (e.hasNext()) {
                final JsonTypeaheadResponse.JsonToken jsonToken = e.next();
                if (jsonToken != null) {
                    JsonTypeaheadResponse$JsonToken$$JsonObjectMapper._serialize(jsonToken, yfe, true);
                }
            }
            yfe.f();
        }
        yfe.u0("topic", jsonTypeaheadEvent.b);
        yfe.u0("ttt_context", jsonTypeaheadEvent.e);
        yfe.u0("url", jsonTypeaheadEvent.h);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadEvent jsonTypeaheadEvent, String j, final qhe qhe) throws IOException {
        if ("filter".equals(j)) {
            jsonTypeaheadEvent.c = qhe.T((String)null);
        }
        else if ("follow".equals(j)) {
            jsonTypeaheadEvent.f = qhe.l();
        }
        else if ("hashtag".equals(j)) {
            jsonTypeaheadEvent.k = qhe.T((String)null);
        }
        else if ("location".equals(j)) {
            jsonTypeaheadEvent.d = qhe.T((String)null);
        }
        else if ("primary_image".equals(j)) {
            if (qhe.e() == rje.N0) {
                final HashMap i = new HashMap();
                while (qhe.i0() != rje.O0) {
                    j = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        i.put(j, null);
                    }
                    else {
                        i.put(j, LoganSquare.typeConverterFor((Class)hpj.class).parse(qhe));
                    }
                }
                jsonTypeaheadEvent.j = i;
            }
            else {
                jsonTypeaheadEvent.j = null;
            }
        }
        else if ("result_context".equals(j)) {
            jsonTypeaheadEvent.g = (dmv)LoganSquare.typeConverterFor((Class)dmv.class).parse(qhe);
        }
        else if ("sc_entity_id".equals(j)) {
            jsonTypeaheadEvent.l = qhe.L();
        }
        else if ("supporting_text".equals(j)) {
            jsonTypeaheadEvent.i = qhe.T((String)null);
        }
        else if ("tokens".equals(j)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonTypeaheadResponse.JsonToken parse = JsonTypeaheadResponse$JsonToken$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        a.add(parse);
                    }
                }
                jsonTypeaheadEvent.a = a;
            }
            else {
                jsonTypeaheadEvent.a = null;
            }
        }
        else if ("topic".equals(j)) {
            jsonTypeaheadEvent.b = qhe.T((String)null);
        }
        else if ("ttt_context".equals(j)) {
            jsonTypeaheadEvent.e = qhe.T((String)null);
        }
        else if ("url".equals(j)) {
            jsonTypeaheadEvent.h = qhe.T((String)null);
        }
    }
    
    public JsonTypeaheadEvent parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadEvent jsonTypeaheadEvent, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTypeaheadEvent, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadEvent)o, yfe, b);
    }
}
