// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventMetadataResponse$JsonResponse$$JsonObjectMapper extends JsonMapper<JsonLiveEventMetadataResponse$JsonResponse>
{
    public static JsonLiveEventMetadataResponse$JsonResponse _parse(final khe khe) throws IOException {
        final JsonLiveEventMetadataResponse$JsonResponse jsonLiveEventMetadataResponse$JsonResponse = new JsonLiveEventMetadataResponse$JsonResponse();
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
            parseField(jsonLiveEventMetadataResponse$JsonResponse, d, khe);
            khe.m0();
        }
        return jsonLiveEventMetadataResponse$JsonResponse;
    }
    
    public static void _serialize(final JsonLiveEventMetadataResponse$JsonResponse jsonLiveEventMetadataResponse$JsonResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonLiveEventMetadataResponse$JsonResponse.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "carousel", a);
            while (g.hasNext()) {
                final dm3 dm3 = g.next();
                if (dm3 != null) {
                    LoganSquare.typeConverterFor((Class)dm3.class).serialize((Object)dm3, "lslocalcarouselElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonLiveEventMetadataResponse$JsonResponse.b != null) {
            LoganSquare.typeConverterFor((Class)qof.class).serialize((Object)jsonLiveEventMetadataResponse$JsonResponse.b, "live_event", true, tfe);
        }
        tfe.T("polling_interval_seconds", jsonLiveEventMetadataResponse$JsonResponse.d);
        if (jsonLiveEventMetadataResponse$JsonResponse.c != null) {
            LoganSquare.typeConverterFor((Class)o1g.class).serialize((Object)jsonLiveEventMetadataResponse$JsonResponse.c, "score", true, tfe);
        }
        tfe.u0("timeline_id", jsonLiveEventMetadataResponse$JsonResponse.e);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventMetadataResponse$JsonResponse jsonLiveEventMetadataResponse$JsonResponse, final String s, final khe khe) throws IOException {
        if ("carousel".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final dm3 dm3 = (dm3)LoganSquare.typeConverterFor((Class)dm3.class).parse(khe);
                    if (dm3 != null) {
                        a.add(dm3);
                    }
                }
                jsonLiveEventMetadataResponse$JsonResponse.a = a;
            }
            else {
                jsonLiveEventMetadataResponse$JsonResponse.a = null;
            }
        }
        else if ("live_event".equals(s)) {
            jsonLiveEventMetadataResponse$JsonResponse.b = (qof)LoganSquare.typeConverterFor((Class)qof.class).parse(khe);
        }
        else if ("polling_interval_seconds".equals(s)) {
            jsonLiveEventMetadataResponse$JsonResponse.d = khe.z();
        }
        else if ("score".equals(s)) {
            jsonLiveEventMetadataResponse$JsonResponse.c = (o1g)LoganSquare.typeConverterFor((Class)o1g.class).parse(khe);
        }
        else if ("timeline_id".equals(s)) {
            jsonLiveEventMetadataResponse$JsonResponse.e = khe.T((String)null);
        }
    }
    
    public JsonLiveEventMetadataResponse$JsonResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventMetadataResponse$JsonResponse jsonLiveEventMetadataResponse$JsonResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventMetadataResponse$JsonResponse, tfe, b);
    }
}
