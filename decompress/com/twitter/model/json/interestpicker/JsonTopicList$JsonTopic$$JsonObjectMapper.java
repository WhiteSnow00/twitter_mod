// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.interestpicker;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicList$JsonTopic$$JsonObjectMapper extends JsonMapper<JsonTopicList.JsonTopic>
{
    public static JsonTopicList.JsonTopic _parse(final khe khe) throws IOException {
        final JsonTopicList.JsonTopic jsonTopic = new JsonTopicList.JsonTopic();
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
            parseField(jsonTopic, d, khe);
            khe.m0();
        }
        return jsonTopic;
    }
    
    public static void _serialize(final JsonTopicList.JsonTopic jsonTopic, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final long[] d = jsonTopic.d;
        if (d != null) {
            tfe.i("child_ids");
            tfe.q0();
            for (int length = d.length, i = 0; i < length; ++i) {
                tfe.q(d[i]);
            }
            tfe.f();
        }
        tfe.u0("icon_url", jsonTopic.c);
        tfe.W("id", jsonTopic.b);
        tfe.u0("interest_context_token", jsonTopic.e);
        tfe.u0("name", jsonTopic.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTopicList.JsonTopic jsonTopic, final String s, final khe khe) throws IOException {
        if ("child_ids".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList list = new ArrayList();
                while (khe.i0() != lje.N0) {
                    list.add(khe.L());
                }
                final long[] d = new long[list.size()];
                int n = 0;
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    d[n] = (long)iterator.next();
                    ++n;
                }
                jsonTopic.d = d;
            }
            else {
                jsonTopic.d = null;
            }
        }
        else if ("icon_url".equals(s)) {
            jsonTopic.c = khe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonTopic.b = khe.L();
        }
        else if ("interest_context_token".equals(s)) {
            jsonTopic.e = khe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonTopic.a = khe.T((String)null);
        }
    }
    
    public JsonTopicList.JsonTopic parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTopicList.JsonTopic jsonTopic, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTopic, tfe, b);
    }
}
