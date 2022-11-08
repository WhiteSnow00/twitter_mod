// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfDetailRichTextOptions$$JsonObjectMapper extends JsonMapper<JsonOcfDetailRichTextOptions>
{
    public static JsonOcfDetailRichTextOptions _parse(final khe khe) throws IOException {
        final JsonOcfDetailRichTextOptions jsonOcfDetailRichTextOptions = new JsonOcfDetailRichTextOptions();
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
            parseField(jsonOcfDetailRichTextOptions, d, khe);
            khe.m0();
        }
        return jsonOcfDetailRichTextOptions;
    }
    
    public static void _serialize(final JsonOcfDetailRichTextOptions jsonOcfDetailRichTextOptions, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonOcfDetailRichTextOptions.a != null) {
            LoganSquare.typeConverterFor((Class)dsr.class).serialize((Object)jsonOcfDetailRichTextOptions.a, "count_subtask_data_reference", true, tfe);
        }
        final ArrayList b2 = jsonOcfDetailRichTextOptions.b;
        if (b2 != null) {
            final Iterator g = q1a.g(tfe, "label_conditional_text", b2);
            while (g.hasNext()) {
                final mxm mxm = g.next();
                if (mxm != null) {
                    LoganSquare.typeConverterFor((Class)mxm.class).serialize((Object)mxm, "lslocallabel_conditional_textElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOcfDetailRichTextOptions jsonOcfDetailRichTextOptions, final String s, final khe khe) throws IOException {
        if ("count_subtask_data_reference".equals(s)) {
            jsonOcfDetailRichTextOptions.a = (dsr)LoganSquare.typeConverterFor((Class)dsr.class).parse(khe);
        }
        else if ("label_conditional_text".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final mxm mxm = (mxm)LoganSquare.typeConverterFor((Class)mxm.class).parse(khe);
                    if (mxm != null) {
                        b.add(mxm);
                    }
                }
                jsonOcfDetailRichTextOptions.b = b;
            }
            else {
                jsonOcfDetailRichTextOptions.b = null;
            }
        }
    }
    
    public JsonOcfDetailRichTextOptions parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOcfDetailRichTextOptions jsonOcfDetailRichTextOptions, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOcfDetailRichTextOptions, tfe, b);
    }
}
