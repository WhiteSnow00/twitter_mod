// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadTopic$$JsonObjectMapper extends JsonMapper<JsonTypeaheadTopic>
{
    public static JsonTypeaheadTopic _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadTopic jsonTypeaheadTopic = new JsonTypeaheadTopic();
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
            parseField(jsonTypeaheadTopic, d, qhe);
            qhe.m0();
        }
        return jsonTypeaheadTopic;
    }
    
    public static void _serialize(final JsonTypeaheadTopic jsonTypeaheadTopic, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("filter", jsonTypeaheadTopic.c);
        yfe.e("follow", jsonTypeaheadTopic.f);
        yfe.u0("location", jsonTypeaheadTopic.d);
        if (jsonTypeaheadTopic.g != null) {
            LoganSquare.typeConverterFor((Class)dmv.class).serialize((Object)jsonTypeaheadTopic.g, "result_context", true, yfe);
        }
        final ArrayList a = jsonTypeaheadTopic.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "tokens", a);
            while (e.hasNext()) {
                final JsonTypeaheadResponse.JsonToken jsonToken = e.next();
                if (jsonToken != null) {
                    JsonTypeaheadResponse$JsonToken$$JsonObjectMapper._serialize(jsonToken, yfe, true);
                }
            }
            yfe.f();
        }
        yfe.u0("topic", jsonTypeaheadTopic.b);
        yfe.u0("ttt_context", jsonTypeaheadTopic.e);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadTopic jsonTypeaheadTopic, final String s, final qhe qhe) throws IOException {
        if ("filter".equals(s)) {
            jsonTypeaheadTopic.c = qhe.T((String)null);
        }
        else if ("follow".equals(s)) {
            jsonTypeaheadTopic.f = qhe.l();
        }
        else if ("location".equals(s)) {
            jsonTypeaheadTopic.d = qhe.T((String)null);
        }
        else if ("result_context".equals(s)) {
            jsonTypeaheadTopic.g = (dmv)LoganSquare.typeConverterFor((Class)dmv.class).parse(qhe);
        }
        else if ("tokens".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonTypeaheadResponse.JsonToken parse = JsonTypeaheadResponse$JsonToken$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        a.add(parse);
                    }
                }
                jsonTypeaheadTopic.a = a;
            }
            else {
                jsonTypeaheadTopic.a = null;
            }
        }
        else if ("topic".equals(s)) {
            jsonTypeaheadTopic.b = qhe.T((String)null);
        }
        else if ("ttt_context".equals(s)) {
            jsonTypeaheadTopic.e = qhe.T((String)null);
        }
    }
    
    public JsonTypeaheadTopic parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadTopic jsonTypeaheadTopic, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTypeaheadTopic, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadTopic)o, yfe, b);
    }
}
