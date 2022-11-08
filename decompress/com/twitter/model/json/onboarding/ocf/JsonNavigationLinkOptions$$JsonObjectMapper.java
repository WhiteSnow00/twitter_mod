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
    public static JsonNavigationLinkOptions _parse(final khe khe) throws IOException {
        final JsonNavigationLinkOptions jsonNavigationLinkOptions = new JsonNavigationLinkOptions();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonNavigationLinkOptions, d, khe);
            khe.m0();
        }
        return jsonNavigationLinkOptions;
    }
    
    public static void _serialize(final JsonNavigationLinkOptions jsonNavigationLinkOptions, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonNavigationLinkOptions.d != null) {
            LoganSquare.typeConverterFor((Class)dsr.class).serialize((Object)jsonNavigationLinkOptions.d, "count_subtask_data_reference", true, tfe);
        }
        final ArrayList a = jsonNavigationLinkOptions.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "label_conditional_text", a);
            while (g.hasNext()) {
                final mxm mxm = g.next();
                if (mxm != null) {
                    LoganSquare.typeConverterFor((Class)mxm.class).serialize((Object)mxm, "lslocallabel_conditional_textElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.T("max_enable_count", jsonNavigationLinkOptions.c);
        tfe.T("min_enable_count", jsonNavigationLinkOptions.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonNavigationLinkOptions jsonNavigationLinkOptions, final String s, final khe khe) throws IOException {
        if ("count_subtask_data_reference".equals(s)) {
            jsonNavigationLinkOptions.d = (dsr)LoganSquare.typeConverterFor((Class)dsr.class).parse(khe);
        }
        else {
            final boolean equals = "label_conditional_text".equals(s);
            final Integer n = null;
            final Integer n2 = null;
            if (equals) {
                if (khe.e() == lje.M0) {
                    final ArrayList a = new ArrayList();
                    while (khe.i0() != lje.N0) {
                        final mxm mxm = (mxm)LoganSquare.typeConverterFor((Class)mxm.class).parse(khe);
                        if (mxm != null) {
                            a.add(mxm);
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
                if (khe.e() == lje.U0) {
                    value = n2;
                }
                else {
                    value = khe.z();
                }
                jsonNavigationLinkOptions.c = value;
            }
            else if ("min_enable_count".equals(s)) {
                Integer value2;
                if (khe.e() == lje.U0) {
                    value2 = n;
                }
                else {
                    value2 = khe.z();
                }
                jsonNavigationLinkOptions.b = value2;
            }
        }
    }
    
    public JsonNavigationLinkOptions parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonNavigationLinkOptions jsonNavigationLinkOptions, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonNavigationLinkOptions, tfe, b);
    }
}
