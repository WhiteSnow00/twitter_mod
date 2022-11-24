// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNavigationLinkOptions$$JsonObjectMapper extends JsonMapper<JsonNavigationLinkOptions>
{
    public static JsonNavigationLinkOptions _parse(final qhe qhe) throws IOException {
        final JsonNavigationLinkOptions jsonNavigationLinkOptions = new JsonNavigationLinkOptions();
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
            parseField(jsonNavigationLinkOptions, d, qhe);
            qhe.m0();
        }
        return jsonNavigationLinkOptions;
    }
    
    public static void _serialize(final JsonNavigationLinkOptions jsonNavigationLinkOptions, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNavigationLinkOptions.d != null) {
            LoganSquare.typeConverterFor((Class)ttr.class).serialize((Object)jsonNavigationLinkOptions.d, "count_subtask_data_reference", true, yfe);
        }
        final ArrayList a = jsonNavigationLinkOptions.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "label_conditional_text", a);
            while (e.hasNext()) {
                final uym uym = e.next();
                if (uym != null) {
                    LoganSquare.typeConverterFor((Class)uym.class).serialize((Object)uym, "lslocallabel_conditional_textElement", false, yfe);
                }
            }
            yfe.f();
        }
        yfe.T("max_enable_count", (int)jsonNavigationLinkOptions.c);
        yfe.T("min_enable_count", (int)jsonNavigationLinkOptions.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNavigationLinkOptions jsonNavigationLinkOptions, final String s, final qhe qhe) throws IOException {
        if ("count_subtask_data_reference".equals(s)) {
            jsonNavigationLinkOptions.d = (ttr)LoganSquare.typeConverterFor((Class)ttr.class).parse(qhe);
        }
        else {
            final boolean equals = "label_conditional_text".equals(s);
            final Integer n = null;
            final Integer n2 = null;
            if (equals) {
                if (qhe.e() == rje.P0) {
                    final ArrayList a = new ArrayList();
                    while (qhe.i0() != rje.Q0) {
                        final uym uym = (uym)LoganSquare.typeConverterFor((Class)uym.class).parse(qhe);
                        if (uym != null) {
                            a.add(uym);
                        }
                    }
                    jsonNavigationLinkOptions.a = a;
                }
                else {
                    jsonNavigationLinkOptions.a = null;
                }
            }
            else if ("max_enable_count".equals(s)) {
                Integer value;
                if (qhe.e() == rje.X0) {
                    value = n2;
                }
                else {
                    value = qhe.z();
                }
                jsonNavigationLinkOptions.c = value;
            }
            else if ("min_enable_count".equals(s)) {
                Integer value2;
                if (qhe.e() == rje.X0) {
                    value2 = n;
                }
                else {
                    value2 = qhe.z();
                }
                jsonNavigationLinkOptions.b = value2;
            }
        }
    }
    
    public JsonNavigationLinkOptions parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNavigationLinkOptions jsonNavigationLinkOptions, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNavigationLinkOptions, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNavigationLinkOptions)o, yfe, b);
    }
}
