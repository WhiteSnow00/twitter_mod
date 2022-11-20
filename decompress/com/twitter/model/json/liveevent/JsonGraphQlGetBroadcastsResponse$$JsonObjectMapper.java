// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import tv.periscope.model.b;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGraphQlGetBroadcastsResponse$$JsonObjectMapper extends JsonMapper<JsonGraphQlGetBroadcastsResponse>
{
    public static JsonGraphQlGetBroadcastsResponse _parse(final tge tge) throws IOException {
        final JsonGraphQlGetBroadcastsResponse jsonGraphQlGetBroadcastsResponse = new JsonGraphQlGetBroadcastsResponse();
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
            parseField(jsonGraphQlGetBroadcastsResponse, d, tge);
            tge.l0();
        }
        return jsonGraphQlGetBroadcastsResponse;
    }
    
    public static void _serialize(final JsonGraphQlGetBroadcastsResponse jsonGraphQlGetBroadcastsResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonGraphQlGetBroadcastsResponse.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "broadcasts", a);
            while (a2.hasNext()) {
                final b b2 = a2.next();
                if (b2 != null) {
                    LoganSquare.typeConverterFor((Class)b.class).serialize((Object)b2, "lslocalbroadcastsElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGraphQlGetBroadcastsResponse jsonGraphQlGetBroadcastsResponse, final String s, final tge tge) throws IOException {
        if ("broadcasts".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final b b = (b)LoganSquare.typeConverterFor((Class)b.class).parse(tge);
                    if (b != null) {
                        a.add(b);
                    }
                }
                jsonGraphQlGetBroadcastsResponse.a = a;
            }
            else {
                jsonGraphQlGetBroadcastsResponse.a = null;
            }
        }
    }
    
    public JsonGraphQlGetBroadcastsResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGraphQlGetBroadcastsResponse jsonGraphQlGetBroadcastsResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGraphQlGetBroadcastsResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGraphQlGetBroadcastsResponse)o, afe, b);
    }
}
