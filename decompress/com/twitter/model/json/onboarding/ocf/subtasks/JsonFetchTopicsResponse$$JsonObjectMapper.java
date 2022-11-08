// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFetchTopicsResponse$$JsonObjectMapper extends JsonMapper<JsonFetchTopicsResponse>
{
    public static JsonFetchTopicsResponse _parse(final khe khe) throws IOException {
        final JsonFetchTopicsResponse jsonFetchTopicsResponse = new JsonFetchTopicsResponse();
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
            parseField(jsonFetchTopicsResponse, d, khe);
            khe.m0();
        }
        return jsonFetchTopicsResponse;
    }
    
    public static void _serialize(final JsonFetchTopicsResponse jsonFetchTopicsResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final HashMap b2 = jsonFetchTopicsResponse.b;
        if (b2 != null) {
            final Iterator h = q1a.h(tfe, "topic_by_id_list", b2);
            while (h.hasNext()) {
                final Map.Entry<String, akt> entry = h.next();
                if (o1a.g((String)entry.getKey(), tfe, (Map.Entry)entry) == null) {
                    tfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)akt.class).serialize((Object)entry.getValue(), "lslocaltopic_by_id_listElement", false, tfe);
                }
            }
            tfe.h();
        }
        final ArrayList a = jsonFetchTopicsResponse.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "topic_ids", a);
            while (g.hasNext()) {
                tfe.s0((String)g.next());
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFetchTopicsResponse jsonFetchTopicsResponse, String j, final khe khe) throws IOException {
        if ("topic_by_id_list".equals(j)) {
            if (khe.e() == lje.K0) {
                final HashMap b = new HashMap();
                while (khe.i0() != lje.L0) {
                    j = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        b.put(j, null);
                    }
                    else {
                        b.put(j, LoganSquare.typeConverterFor((Class)akt.class).parse(khe));
                    }
                }
                jsonFetchTopicsResponse.b = b;
            }
            else {
                jsonFetchTopicsResponse.b = null;
            }
        }
        else if ("topic_ids".equals(j)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final String t = khe.T((String)null);
                    if (t != null) {
                        a.add(t);
                    }
                }
                jsonFetchTopicsResponse.a = a;
            }
            else {
                jsonFetchTopicsResponse.a = null;
            }
        }
    }
    
    public JsonFetchTopicsResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFetchTopicsResponse jsonFetchTopicsResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFetchTopicsResponse, tfe, b);
    }
}
