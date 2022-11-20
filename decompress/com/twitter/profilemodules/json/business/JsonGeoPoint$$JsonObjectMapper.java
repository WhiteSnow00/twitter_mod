// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGeoPoint$$JsonObjectMapper extends JsonMapper<JsonGeoPoint>
{
    public static JsonGeoPoint _parse(final tge tge) throws IOException {
        final JsonGeoPoint jsonGeoPoint = new JsonGeoPoint();
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
            parseField(jsonGeoPoint, d, tge);
            tge.l0();
        }
        return jsonGeoPoint;
    }
    
    public static void _serialize(final JsonGeoPoint jsonGeoPoint, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.N("latitude", (double)jsonGeoPoint.a);
        afe.N("longitude", (double)jsonGeoPoint.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGeoPoint jsonGeoPoint, final String s, final tge tge) throws IOException {
        final boolean equals = "latitude".equals(s);
        final Double n = null;
        final Double n2 = null;
        if (equals) {
            Double value;
            if (tge.e() == vie.V0) {
                value = n2;
            }
            else {
                value = tge.p();
            }
            jsonGeoPoint.a = value;
        }
        else if ("longitude".equals(s)) {
            Double value2;
            if (tge.e() == vie.V0) {
                value2 = n;
            }
            else {
                value2 = tge.p();
            }
            jsonGeoPoint.b = value2;
        }
    }
    
    public JsonGeoPoint parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGeoPoint jsonGeoPoint, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGeoPoint, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGeoPoint)o, afe, b);
    }
}
