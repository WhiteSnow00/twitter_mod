// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicsSelectorSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonTopicsSelectorSubtaskInput>
{
    public static JsonTopicsSelectorSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonTopicsSelectorSubtaskInput jsonTopicsSelectorSubtaskInput = new JsonTopicsSelectorSubtaskInput();
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
            parseField(jsonTopicsSelectorSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonTopicsSelectorSubtaskInput;
    }
    
    public static void _serialize(final JsonTopicsSelectorSubtaskInput jsonTopicsSelectorSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final List c = jsonTopicsSelectorSubtaskInput.c;
        if (c != null) {
            final Iterator o = ffe.o(yfe, "selected_search_topic_ids", c);
            while (o.hasNext()) {
                yfe.s0((String)o.next());
            }
            yfe.f();
        }
        final List b2 = jsonTopicsSelectorSubtaskInput.b;
        if (b2 != null) {
            final Iterator o2 = ffe.o(yfe, "selected_topic_ids", b2);
            while (o2.hasNext()) {
                yfe.s0((String)o2.next());
            }
            yfe.f();
        }
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonTopicsSelectorSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopicsSelectorSubtaskInput jsonTopicsSelectorSubtaskInput, String s, final qhe qhe) throws IOException {
        if ("selected_search_topic_ids".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    s = qhe.T((String)null);
                    if (s != null) {
                        c.add(s);
                    }
                }
                jsonTopicsSelectorSubtaskInput.c = c;
            }
            else {
                jsonTopicsSelectorSubtaskInput.c = null;
            }
        }
        else if ("selected_topic_ids".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    s = qhe.T((String)null);
                    if (s != null) {
                        b.add(s);
                    }
                }
                jsonTopicsSelectorSubtaskInput.b = b;
            }
            else {
                jsonTopicsSelectorSubtaskInput.b = null;
            }
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonTopicsSelectorSubtaskInput, s, qhe);
        }
    }
    
    public JsonTopicsSelectorSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopicsSelectorSubtaskInput jsonTopicsSelectorSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopicsSelectorSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopicsSelectorSubtaskInput)o, yfe, b);
    }
}
