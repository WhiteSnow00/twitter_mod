// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadResponse$$JsonObjectMapper extends JsonMapper<JsonTypeaheadResponse>
{
    public static JsonTypeaheadResponse _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadResponse jsonTypeaheadResponse = new JsonTypeaheadResponse();
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
            parseField(jsonTypeaheadResponse, d, qhe);
            qhe.m0();
        }
        return jsonTypeaheadResponse;
    }
    
    public static void _serialize(final JsonTypeaheadResponse jsonTypeaheadResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList d = jsonTypeaheadResponse.d;
        if (d != null) {
            final Iterator e = d10.E(yfe, "lists", d);
            while (e.hasNext()) {
                final JsonTypeaheadChannel jsonTypeaheadChannel = e.next();
                if (jsonTypeaheadChannel != null) {
                    JsonTypeaheadChannel$$JsonObjectMapper._serialize(jsonTypeaheadChannel, yfe, true);
                }
            }
            yfe.f();
        }
        final ArrayList c = jsonTypeaheadResponse.c;
        if (c != null) {
            final Iterator e2 = d10.E(yfe, "events", c);
            while (e2.hasNext()) {
                final JsonTypeaheadEvent jsonTypeaheadEvent = e2.next();
                if (jsonTypeaheadEvent != null) {
                    JsonTypeaheadEvent$$JsonObjectMapper._serialize(jsonTypeaheadEvent, yfe, true);
                }
            }
            yfe.f();
        }
        final ArrayList e3 = jsonTypeaheadResponse.e;
        if (e3 != null) {
            final Iterator e4 = d10.E(yfe, "ordered_sections", e3);
            while (e4.hasNext()) {
                yfe.s0((String)e4.next());
            }
            yfe.f();
        }
        final ArrayList b2 = jsonTypeaheadResponse.b;
        if (b2 != null) {
            final Iterator e5 = d10.E(yfe, "topics", b2);
            while (e5.hasNext()) {
                final JsonTypeaheadTopic jsonTypeaheadTopic = e5.next();
                if (jsonTypeaheadTopic != null) {
                    JsonTypeaheadTopic$$JsonObjectMapper._serialize(jsonTypeaheadTopic, yfe, true);
                }
            }
            yfe.f();
        }
        final ArrayList a = jsonTypeaheadResponse.a;
        if (a != null) {
            final Iterator e6 = d10.E(yfe, "users", a);
            while (e6.hasNext()) {
                final JsonTypeaheadUser jsonTypeaheadUser = e6.next();
                if (jsonTypeaheadUser != null) {
                    JsonTypeaheadUser$$JsonObjectMapper._serialize(jsonTypeaheadUser, yfe, true);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadResponse jsonTypeaheadResponse, String t, final qhe qhe) throws IOException {
        if ("lists".equals(t)) {
            if (qhe.e() == rje.P0) {
                final ArrayList d = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonTypeaheadChannel parse = JsonTypeaheadChannel$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        d.add(parse);
                    }
                }
                jsonTypeaheadResponse.d = d;
            }
            else {
                jsonTypeaheadResponse.d = null;
            }
        }
        else if ("events".equals(t)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonTypeaheadEvent parse2 = JsonTypeaheadEvent$$JsonObjectMapper._parse(qhe);
                    if (parse2 != null) {
                        c.add(parse2);
                    }
                }
                jsonTypeaheadResponse.c = c;
            }
            else {
                jsonTypeaheadResponse.c = null;
            }
        }
        else if ("ordered_sections".equals(t)) {
            if (qhe.e() == rje.P0) {
                final ArrayList e = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    t = qhe.T((String)null);
                    if (t != null) {
                        e.add(t);
                    }
                }
                jsonTypeaheadResponse.e = e;
            }
            else {
                jsonTypeaheadResponse.e = null;
            }
        }
        else if ("topics".equals(t)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonTypeaheadTopic parse3 = JsonTypeaheadTopic$$JsonObjectMapper._parse(qhe);
                    if (parse3 != null) {
                        b.add(parse3);
                    }
                }
                jsonTypeaheadResponse.b = b;
            }
            else {
                jsonTypeaheadResponse.b = null;
            }
        }
        else if ("users".equals(t)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonTypeaheadUser parse4 = JsonTypeaheadUser$$JsonObjectMapper._parse(qhe);
                    if (parse4 != null) {
                        a.add(parse4);
                    }
                }
                jsonTypeaheadResponse.a = a;
            }
            else {
                jsonTypeaheadResponse.a = null;
            }
        }
    }
    
    public JsonTypeaheadResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadResponse jsonTypeaheadResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTypeaheadResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadResponse)o, yfe, b);
    }
}
