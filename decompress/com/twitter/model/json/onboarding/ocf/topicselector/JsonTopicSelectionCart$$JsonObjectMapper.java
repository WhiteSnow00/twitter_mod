// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicSelectionCart$$JsonObjectMapper extends JsonMapper<JsonTopicSelectionCart>
{
    public static JsonTopicSelectionCart _parse(final qhe qhe) throws IOException {
        final JsonTopicSelectionCart jsonTopicSelectionCart = new JsonTopicSelectionCart();
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
            parseField(jsonTopicSelectionCart, d, qhe);
            qhe.m0();
        }
        return jsonTopicSelectionCart;
    }
    
    public static void _serialize(final JsonTopicSelectionCart jsonTopicSelectionCart, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTopicSelectionCart.c != null) {
            yfe.i("done_label");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicSelectionCart.c, yfe, true);
        }
        final ArrayList a = jsonTopicSelectionCart.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "selected_topic_ids", a);
            while (e.hasNext()) {
                yfe.s0((String)e.next());
            }
            yfe.f();
        }
        if (jsonTopicSelectionCart.b != null) {
            yfe.i("title");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicSelectionCart.b, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopicSelectionCart jsonTopicSelectionCart, final String s, final qhe qhe) throws IOException {
        if ("done_label".equals(s)) {
            jsonTopicSelectionCart.c = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("selected_topic_ids".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        a.add(t);
                    }
                }
                jsonTopicSelectionCart.a = a;
            }
            else {
                jsonTopicSelectionCart.a = null;
            }
        }
        else if ("title".equals(s)) {
            jsonTopicSelectionCart.b = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonTopicSelectionCart parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopicSelectionCart jsonTopicSelectionCart, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopicSelectionCart, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopicSelectionCart)o, yfe, b);
    }
}
