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
    public static JsonTopicList _parse(final khe khe) throws IOException {
        final JsonTopicList list = new JsonTopicList();
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
            parseField(list, d, khe);
            khe.m0();
        }
        return list;
    }
    
    public static void _serialize(final JsonTopicList list, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("data_version", list.a);
        final long[] b2 = list.b;
        if (b2 != null) {
            tfe.i("root_ids");
            tfe.q0();
            for (int length = b2.length, i = 0; i < length; ++i) {
                tfe.q(b2[i]);
            }
            tfe.f();
        }
        final HashMap c = list.c;
        if (c != null) {
            final Iterator h = q1a.h(tfe, "topics", c);
            while (h.hasNext()) {
                final Map.Entry<String, JsonTopicList.JsonTopic> entry = h.next();
                if (o1a.g((String)entry.getKey(), tfe, (Map.Entry)entry) == null) {
                    tfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonTopicList$JsonTopic$$JsonObjectMapper._serialize(entry.getValue(), tfe, true);
                }
            }
            tfe.h();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTopicList list, final String s, final khe khe) throws IOException {
        if ("data_version".equals(s)) {
            list.a = khe.z();
        }
        else if ("root_ids".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList list2 = new ArrayList();
                while (khe.i0() != lje.N0) {
                    list2.add(khe.L());
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
            if (khe.e() == lje.K0) {
                final HashMap c = new HashMap();
                while (khe.i0() != lje.L0) {
                    final String j = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        c.put(j, null);
                    }
                    else {
                        c.put(j, JsonTopicList$JsonTopic$$JsonObjectMapper._parse(khe));
                    }
                }
                list.c = c;
            }
            else {
                list.c = null;
            }
        }
    }
    
    public JsonTopicList parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTopicList list, final tfe tfe, final boolean b) throws IOException {
        _serialize(list, tfe, b);
    }
}
