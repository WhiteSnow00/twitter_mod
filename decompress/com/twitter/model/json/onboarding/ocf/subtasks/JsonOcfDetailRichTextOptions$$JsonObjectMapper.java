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
    public static JsonOcfDetailRichTextOptions _parse(final tge tge) throws IOException {
        final JsonOcfDetailRichTextOptions jsonOcfDetailRichTextOptions = new JsonOcfDetailRichTextOptions();
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
            parseField(jsonOcfDetailRichTextOptions, d, tge);
            tge.l0();
        }
        return jsonOcfDetailRichTextOptions;
    }
    
    public static void _serialize(final JsonOcfDetailRichTextOptions jsonOcfDetailRichTextOptions, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOcfDetailRichTextOptions.a != null) {
            LoganSquare.typeConverterFor((Class)vsr.class).serialize((Object)jsonOcfDetailRichTextOptions.a, "count_subtask_data_reference", true, afe);
        }
        final ArrayList b2 = jsonOcfDetailRichTextOptions.b;
        if (b2 != null) {
            final Iterator a = br.A(afe, "label_conditional_text", b2);
            while (a.hasNext()) {
                final dym dym = a.next();
                if (dym != null) {
                    LoganSquare.typeConverterFor((Class)dym.class).serialize((Object)dym, "lslocallabel_conditional_textElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfDetailRichTextOptions jsonOcfDetailRichTextOptions, final String s, final tge tge) throws IOException {
        if ("count_subtask_data_reference".equals(s)) {
            jsonOcfDetailRichTextOptions.a = (vsr)LoganSquare.typeConverterFor((Class)vsr.class).parse(tge);
        }
        else if ("label_conditional_text".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final dym dym = (dym)LoganSquare.typeConverterFor((Class)dym.class).parse(tge);
                    if (dym != null) {
                        b.add(dym);
                    }
                }
                jsonOcfDetailRichTextOptions.b = b;
            }
            else {
                jsonOcfDetailRichTextOptions.b = null;
            }
        }
    }
    
    public JsonOcfDetailRichTextOptions parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfDetailRichTextOptions jsonOcfDetailRichTextOptions, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfDetailRichTextOptions, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfDetailRichTextOptions)o, afe, b);
    }
}
