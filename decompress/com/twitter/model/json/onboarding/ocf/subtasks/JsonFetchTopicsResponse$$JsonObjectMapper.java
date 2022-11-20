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
    public static JsonFetchTopicsResponse _parse(final tge tge) throws IOException {
        final JsonFetchTopicsResponse jsonFetchTopicsResponse = new JsonFetchTopicsResponse();
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
            parseField(jsonFetchTopicsResponse, d, tge);
            tge.l0();
        }
        return jsonFetchTopicsResponse;
    }
    
    public static void _serialize(final JsonFetchTopicsResponse jsonFetchTopicsResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final HashMap b2 = jsonFetchTopicsResponse.b;
        if (b2 != null) {
            final Iterator z = mw.z(afe, "topic_by_id_list", b2);
            while (z.hasNext()) {
                final Map.Entry<String, rkt> entry = z.next();
                if (sde.e((String)entry.getKey(), afe, (Map.Entry)entry) == null) {
                    afe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)rkt.class).serialize((Object)entry.getValue(), "lslocaltopic_by_id_listElement", false, afe);
                }
            }
            afe.h();
        }
        final ArrayList a = jsonFetchTopicsResponse.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "topic_ids", a);
            while (a2.hasNext()) {
                afe.r0((String)a2.next());
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFetchTopicsResponse jsonFetchTopicsResponse, String t, final tge tge) throws IOException {
        if ("topic_by_id_list".equals(t)) {
            if (tge.e() == vie.L0) {
                final HashMap b = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String j = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        b.put(j, null);
                    }
                    else {
                        b.put(j, LoganSquare.typeConverterFor((Class)rkt.class).parse(tge));
                    }
                }
                jsonFetchTopicsResponse.b = b;
            }
            else {
                jsonFetchTopicsResponse.b = null;
            }
        }
        else if ("topic_ids".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    t = tge.T((String)null);
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
    
    public JsonFetchTopicsResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFetchTopicsResponse jsonFetchTopicsResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFetchTopicsResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFetchTopicsResponse)o, afe, b);
    }
}
