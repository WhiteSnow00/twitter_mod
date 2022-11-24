// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadChannel$$JsonObjectMapper extends JsonMapper<JsonTypeaheadChannel>
{
    public static JsonTypeaheadChannel _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadChannel jsonTypeaheadChannel = new JsonTypeaheadChannel();
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
            parseField(jsonTypeaheadChannel, d, qhe);
            qhe.m0();
        }
        return jsonTypeaheadChannel;
    }
    
    public static void _serialize(final JsonTypeaheadChannel jsonTypeaheadChannel, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("object_id", jsonTypeaheadChannel.b);
        if (jsonTypeaheadChannel.e != null) {
            yfe.i("primary_image");
            JsonTypeaheadPrimaryImage$$JsonObjectMapper._serialize(jsonTypeaheadChannel.e, yfe, true);
        }
        yfe.u0("supporting_text", jsonTypeaheadChannel.f);
        final ArrayList a = jsonTypeaheadChannel.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "tokens", a);
            while (e.hasNext()) {
                yfe.s0((String)e.next());
            }
            yfe.f();
        }
        yfe.u0("topic", jsonTypeaheadChannel.c);
        yfe.u0("url", jsonTypeaheadChannel.d);
        if (jsonTypeaheadChannel.g != null) {
            yfe.i("user");
            JsonTypeaheadChannelUser$$JsonObjectMapper._serialize(jsonTypeaheadChannel.g, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadChannel jsonTypeaheadChannel, final String s, final qhe qhe) throws IOException {
        if ("object_id".equals(s)) {
            jsonTypeaheadChannel.b = qhe.L();
        }
        else if ("primary_image".equals(s)) {
            jsonTypeaheadChannel.e = JsonTypeaheadPrimaryImage$$JsonObjectMapper._parse(qhe);
        }
        else if ("supporting_text".equals(s)) {
            jsonTypeaheadChannel.f = qhe.T((String)null);
        }
        else if ("tokens".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        a.add(t);
                    }
                }
                jsonTypeaheadChannel.a = a;
            }
            else {
                jsonTypeaheadChannel.a = null;
            }
        }
        else if ("topic".equals(s)) {
            jsonTypeaheadChannel.c = qhe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonTypeaheadChannel.d = qhe.T((String)null);
        }
        else if ("user".equals(s)) {
            jsonTypeaheadChannel.g = JsonTypeaheadChannelUser$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonTypeaheadChannel parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadChannel jsonTypeaheadChannel, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTypeaheadChannel, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadChannel)o, yfe, b);
    }
}
