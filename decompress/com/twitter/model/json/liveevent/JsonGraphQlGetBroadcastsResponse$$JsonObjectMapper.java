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
    public static JsonGraphQlGetBroadcastsResponse _parse(final khe khe) throws IOException {
        final JsonGraphQlGetBroadcastsResponse jsonGraphQlGetBroadcastsResponse = new JsonGraphQlGetBroadcastsResponse();
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
            parseField(jsonGraphQlGetBroadcastsResponse, d, khe);
            khe.m0();
        }
        return jsonGraphQlGetBroadcastsResponse;
    }
    
    public static void _serialize(final JsonGraphQlGetBroadcastsResponse jsonGraphQlGetBroadcastsResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonGraphQlGetBroadcastsResponse.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "broadcasts", a);
            while (g.hasNext()) {
                final b b2 = g.next();
                if (b2 != null) {
                    LoganSquare.typeConverterFor((Class)b.class).serialize((Object)b2, "lslocalbroadcastsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGraphQlGetBroadcastsResponse jsonGraphQlGetBroadcastsResponse, final String s, final khe khe) throws IOException {
        if ("broadcasts".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final b b = (b)LoganSquare.typeConverterFor((Class)b.class).parse(khe);
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
    
    public JsonGraphQlGetBroadcastsResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGraphQlGetBroadcastsResponse jsonGraphQlGetBroadcastsResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGraphQlGetBroadcastsResponse, tfe, b);
    }
}
