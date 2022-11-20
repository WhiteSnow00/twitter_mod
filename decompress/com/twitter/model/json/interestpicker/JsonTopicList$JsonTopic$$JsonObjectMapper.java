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
    public static JsonTopicList.JsonTopic _parse(final tge tge) throws IOException {
        final JsonTopicList.JsonTopic jsonTopic = new JsonTopicList.JsonTopic();
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
            parseField(jsonTopic, d, tge);
            tge.l0();
        }
        return jsonTopic;
    }
    
    public static void _serialize(final JsonTopicList.JsonTopic jsonTopic, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final long[] d = jsonTopic.d;
        if (d != null) {
            afe.i("child_ids");
            afe.p0();
            for (int length = d.length, i = 0; i < length; ++i) {
                afe.q(d[i]);
            }
            afe.f();
        }
        afe.t0("icon_url", jsonTopic.c);
        afe.V("id", jsonTopic.b);
        afe.t0("interest_context_token", jsonTopic.e);
        afe.t0("name", jsonTopic.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTopicList.JsonTopic jsonTopic, final String s, final tge tge) throws IOException {
        if ("child_ids".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList list = new ArrayList();
                while (tge.h0() != vie.O0) {
                    list.add(tge.K());
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
            jsonTopic.c = tge.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonTopic.b = tge.K();
        }
        else if ("interest_context_token".equals(s)) {
            jsonTopic.e = tge.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonTopic.a = tge.T((String)null);
        }
    }
    
    public JsonTopicList.JsonTopic parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTopicList.JsonTopic jsonTopic, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTopic, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTopicList.JsonTopic)o, afe, b);
    }
}
