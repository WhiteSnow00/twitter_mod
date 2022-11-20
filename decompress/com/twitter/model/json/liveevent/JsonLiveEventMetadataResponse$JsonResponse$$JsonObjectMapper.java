// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventMetadataResponse$JsonResponse$$JsonObjectMapper extends JsonMapper<JsonLiveEventMetadataResponse.JsonResponse>
{
    public static JsonLiveEventMetadataResponse.JsonResponse _parse(final tge tge) throws IOException {
        final JsonLiveEventMetadataResponse.JsonResponse jsonResponse = new JsonLiveEventMetadataResponse.JsonResponse();
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
            parseField(jsonResponse, d, tge);
            tge.l0();
        }
        return jsonResponse;
    }
    
    public static void _serialize(final JsonLiveEventMetadataResponse.JsonResponse jsonResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonResponse.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "carousel", a);
            while (a2.hasNext()) {
                final ll3 ll3 = a2.next();
                if (ll3 != null) {
                    LoganSquare.typeConverterFor((Class)ll3.class).serialize((Object)ll3, "lslocalcarouselElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonResponse.b != null) {
            LoganSquare.typeConverterFor((Class)cof.class).serialize((Object)jsonResponse.b, "live_event", true, afe);
        }
        afe.T("polling_interval_seconds", jsonResponse.d);
        if (jsonResponse.c != null) {
            LoganSquare.typeConverterFor((Class)z0g.class).serialize((Object)jsonResponse.c, "score", true, afe);
        }
        afe.t0("timeline_id", jsonResponse.e);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventMetadataResponse.JsonResponse jsonResponse, final String s, final tge tge) throws IOException {
        if ("carousel".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final ll3 ll3 = (ll3)LoganSquare.typeConverterFor((Class)ll3.class).parse(tge);
                    if (ll3 != null) {
                        a.add(ll3);
                    }
                }
                jsonResponse.a = a;
            }
            else {
                jsonResponse.a = null;
            }
        }
        else if ("live_event".equals(s)) {
            jsonResponse.b = (cof)LoganSquare.typeConverterFor((Class)cof.class).parse(tge);
        }
        else if ("polling_interval_seconds".equals(s)) {
            jsonResponse.d = tge.y();
        }
        else if ("score".equals(s)) {
            jsonResponse.c = (z0g)LoganSquare.typeConverterFor((Class)z0g.class).parse(tge);
        }
        else if ("timeline_id".equals(s)) {
            jsonResponse.e = tge.T((String)null);
        }
    }
    
    public JsonLiveEventMetadataResponse.JsonResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventMetadataResponse.JsonResponse jsonResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventMetadataResponse.JsonResponse)o, afe, b);
    }
}
