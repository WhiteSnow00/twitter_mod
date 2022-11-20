// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.interestpicker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicList$$JsonObjectMapper extends JsonMapper<JsonTopicList>
{
    public static JsonTopicList _parse(final tge tge) throws IOException {
        final JsonTopicList list = new JsonTopicList();
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
            parseField(list, d, tge);
            tge.l0();
        }
        return list;
    }
    
    public static void _serialize(final JsonTopicList list, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("data_version", list.a);
        final long[] b2 = list.b;
        if (b2 != null) {
            afe.i("root_ids");
            afe.p0();
            for (int length = b2.length, i = 0; i < length; ++i) {
                afe.q(b2[i]);
            }
            afe.f();
        }
        final HashMap c = list.c;
        if (c != null) {
            final Iterator z = mw.z(afe, "topics", c);
            while (z.hasNext()) {
                final Map.Entry<String, JsonTopicList.JsonTopic> entry = z.next();
                if (sde.e((String)entry.getKey(), afe, (Map.Entry)entry) == null) {
                    afe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonTopicList$JsonTopic$$JsonObjectMapper._serialize(entry.getValue(), afe, true);
                }
            }
            afe.h();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTopicList list, final String s, final tge tge) throws IOException {
        if ("data_version".equals(s)) {
            list.a = tge.y();
        }
        else if ("root_ids".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList list2 = new ArrayList();
                while (tge.h0() != vie.O0) {
                    list2.add(tge.K());
                }
                final long[] b = new long[list2.size()];
                int n = 0;
                final Iterator iterator = list2.iterator();
                while (iterator.hasNext()) {
                    b[n] = (long)iterator.next();
                    ++n;
                }
                list.b = b;
            }
            else {
                list.b = null;
            }
        }
        else if ("topics".equals(s)) {
            if (tge.e() == vie.L0) {
                final HashMap c = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String j = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        c.put(j, null);
                    }
                    else {
                        c.put(j, JsonTopicList$JsonTopic$$JsonObjectMapper._parse(tge));
                    }
                }
                list.c = c;
            }
            else {
                list.c = null;
            }
        }
    }
    
    public JsonTopicList parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTopicList list, final afe afe, final boolean b) throws IOException {
        _serialize(list, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTopicList)o, afe, b);
    }
}
