// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCreateNudgeOptions$$JsonObjectMapper extends JsonMapper<JsonCreateNudgeOptions>
{
    public static JsonCreateNudgeOptions _parse(final qhe qhe) throws IOException {
        final JsonCreateNudgeOptions jsonCreateNudgeOptions = new JsonCreateNudgeOptions();
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
            parseField(jsonCreateNudgeOptions, d, qhe);
            qhe.m0();
        }
        return jsonCreateNudgeOptions;
    }
    
    public static void _serialize(final JsonCreateNudgeOptions jsonCreateNudgeOptions, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("enable_experimental_toxicity_model", jsonCreateNudgeOptions.c);
        yfe.e("enable_nudge_testing_keyword", jsonCreateNudgeOptions.a);
        final List<String> b2 = jsonCreateNudgeOptions.b;
        if (b2 != null) {
            final Iterator o = ffe.o(yfe, "requested_nudge_types", b2);
            while (o.hasNext()) {
                yfe.s0((String)o.next());
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonCreateNudgeOptions jsonCreateNudgeOptions, final String s, final qhe qhe) throws IOException {
        if ("enable_experimental_toxicity_model".equals(s)) {
            jsonCreateNudgeOptions.c = qhe.l();
        }
        else if ("enable_nudge_testing_keyword".equals(s)) {
            jsonCreateNudgeOptions.a = qhe.l();
        }
        else if ("requested_nudge_types".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        b.add(t);
                    }
                }
                jsonCreateNudgeOptions.b = b;
            }
            else {
                jsonCreateNudgeOptions.b = null;
            }
        }
    }
    
    public JsonCreateNudgeOptions parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonCreateNudgeOptions jsonCreateNudgeOptions, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonCreateNudgeOptions, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonCreateNudgeOptions)o, yfe, b);
    }
}
