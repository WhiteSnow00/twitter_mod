// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestSelections$$JsonObjectMapper extends JsonMapper<JsonInterestSelections>
{
    public static JsonInterestSelections _parse(final qhe qhe) throws IOException {
        final JsonInterestSelections jsonInterestSelections = new JsonInterestSelections();
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
            parseField(jsonInterestSelections, d, qhe);
            qhe.m0();
        }
        return jsonInterestSelections;
    }
    
    public static void _serialize(final JsonInterestSelections jsonInterestSelections, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonInterestSelections.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "interestSelections", a);
            while (e.hasNext()) {
                final JsonInterestSelections.JsonInterestSelection jsonInterestSelection = e.next();
                if (jsonInterestSelection != null) {
                    JsonInterestSelections$JsonInterestSelection$$JsonObjectMapper._serialize(jsonInterestSelection, yfe, true);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonInterestSelections jsonInterestSelections, final String s, final qhe qhe) throws IOException {
        if ("interestSelections".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonInterestSelections.JsonInterestSelection parse = JsonInterestSelections$JsonInterestSelection$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        a.add(parse);
                    }
                }
                jsonInterestSelections.a = a;
            }
            else {
                jsonInterestSelections.a = null;
            }
        }
    }
    
    public JsonInterestSelections parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonInterestSelections jsonInterestSelections, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonInterestSelections, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonInterestSelections)o, yfe, b);
    }
}
