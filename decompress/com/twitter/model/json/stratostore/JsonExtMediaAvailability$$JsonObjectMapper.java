// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonExtMediaAvailability$$JsonObjectMapper extends JsonMapper<JsonExtMediaAvailability>
{
    public static final h2h MEDIA_UNAVAILABILITY_INFO_UNION_CONVERTER;
    
    static {
        MEDIA_UNAVAILABILITY_INFO_UNION_CONVERTER = new h2h();
    }
    
    public static JsonExtMediaAvailability _parse(final qhe qhe) throws IOException {
        final JsonExtMediaAvailability jsonExtMediaAvailability = new JsonExtMediaAvailability();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonExtMediaAvailability, d, qhe);
            qhe.m0();
        }
        return jsonExtMediaAvailability;
    }
    
    public static void _serialize(final JsonExtMediaAvailability jsonExtMediaAvailability, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("reason", jsonExtMediaAvailability.b);
        yfe.u0("status", jsonExtMediaAvailability.a);
        final g2h c = jsonExtMediaAvailability.c;
        if (c == null) {
            if (b) {
                yfe.h();
            }
            return;
        }
        ((nxj)JsonExtMediaAvailability$$JsonObjectMapper.MEDIA_UNAVAILABILITY_INFO_UNION_CONVERTER).serialize((Object)c, "unavailability_info", true, yfe);
        throw null;
    }
    
    public static void parseField(final JsonExtMediaAvailability jsonExtMediaAvailability, final String s, final qhe qhe) throws IOException {
        if ("reason".equals(s)) {
            jsonExtMediaAvailability.b = qhe.T((String)null);
        }
        else if ("status".equals(s)) {
            jsonExtMediaAvailability.a = qhe.T((String)null);
        }
        else if ("unavailability_info".equals(s)) {
            jsonExtMediaAvailability.c = ((fge<g2h>)JsonExtMediaAvailability$$JsonObjectMapper.MEDIA_UNAVAILABILITY_INFO_UNION_CONVERTER).parse(qhe);
        }
    }
    
    public JsonExtMediaAvailability parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonExtMediaAvailability jsonExtMediaAvailability, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonExtMediaAvailability, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonExtMediaAvailability)o, yfe, b);
    }
}
