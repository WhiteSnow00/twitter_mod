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
    public static JsonNavigationLinkOptions _parse(final tge tge) throws IOException {
        final JsonNavigationLinkOptions jsonNavigationLinkOptions = new JsonNavigationLinkOptions();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonNavigationLinkOptions, d, tge);
            tge.l0();
        }
        return jsonNavigationLinkOptions;
    }
    
    public static void _serialize(final JsonNavigationLinkOptions jsonNavigationLinkOptions, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonNavigationLinkOptions.d != null) {
            LoganSquare.typeConverterFor((Class)vsr.class).serialize((Object)jsonNavigationLinkOptions.d, "count_subtask_data_reference", true, afe);
        }
        final ArrayList a = jsonNavigationLinkOptions.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "label_conditional_text", a);
            while (a2.hasNext()) {
                final dym dym = a2.next();
                if (dym != null) {
                    LoganSquare.typeConverterFor((Class)dym.class).serialize((Object)dym, "lslocallabel_conditional_textElement", false, afe);
                }
            }
            afe.f();
        }
        afe.T("max_enable_count", (int)jsonNavigationLinkOptions.c);
        afe.T("min_enable_count", (int)jsonNavigationLinkOptions.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonNavigationLinkOptions jsonNavigationLinkOptions, final String s, final tge tge) throws IOException {
        if ("count_subtask_data_reference".equals(s)) {
            jsonNavigationLinkOptions.d = (vsr)LoganSquare.typeConverterFor((Class)vsr.class).parse(tge);
        }
        else {
            final boolean equals = "label_conditional_text".equals(s);
            final Integer n = null;
            final Integer n2 = null;
            if (equals) {
                if (tge.e() == vie.N0) {
                    final ArrayList a = new ArrayList();
                    while (tge.h0() != vie.O0) {
                        final dym dym = (dym)LoganSquare.typeConverterFor((Class)dym.class).parse(tge);
                        if (dym != null) {
                            a.add(dym);
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
                if (tge.e() == vie.V0) {
                    value = n2;
                }
                else {
                    value = tge.y();
                }
                jsonNavigationLinkOptions.c = value;
            }
            else if ("min_enable_count".equals(s)) {
                Integer value2;
                if (tge.e() == vie.V0) {
                    value2 = n;
                }
                else {
                    value2 = tge.y();
                }
                jsonNavigationLinkOptions.b = value2;
            }
        }
    }
    
    public JsonNavigationLinkOptions parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonNavigationLinkOptions jsonNavigationLinkOptions, final afe afe, final boolean b) throws IOException {
        _serialize(jsonNavigationLinkOptions, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonNavigationLinkOptions)o, afe, b);
    }
}
