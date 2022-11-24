// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicCategory$$JsonObjectMapper extends JsonMapper<JsonTopicCategory>
{
    public static JsonTopicCategory _parse(final qhe qhe) throws IOException {
        final JsonTopicCategory jsonTopicCategory = new JsonTopicCategory();
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
            parseField(jsonTopicCategory, d, qhe);
            qhe.m0();
        }
        return jsonTopicCategory;
    }
    
    public static void _serialize(final JsonTopicCategory jsonTopicCategory, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList c = jsonTopicCategory.c;
        if (c != null) {
            final Iterator e = d10.E(yfe, "children_items", c);
            while (e.hasNext()) {
                final vlt vlt = e.next();
                if (vlt != null) {
                    LoganSquare.typeConverterFor((Class)vlt.class).serialize((Object)vlt, "lslocalchildren_itemsElement", false, yfe);
                }
            }
            yfe.f();
        }
        yfe.u0("id", jsonTopicCategory.a);
        if (jsonTopicCategory.b != null) {
            yfe.i("title");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicCategory.b, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopicCategory jsonTopicCategory, final String s, final qhe qhe) throws IOException {
        if ("children_items".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final vlt vlt = (vlt)LoganSquare.typeConverterFor((Class)vlt.class).parse(qhe);
                    if (vlt != null) {
                        c.add(vlt);
                    }
                }
                jsonTopicCategory.c = c;
            }
            else {
                jsonTopicCategory.c = null;
            }
        }
        else if ("id".equals(s)) {
            jsonTopicCategory.a = qhe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonTopicCategory.b = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonTopicCategory parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopicCategory jsonTopicCategory, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopicCategory, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopicCategory)o, yfe, b);
    }
}
