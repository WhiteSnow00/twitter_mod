// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonMomentsDetails$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo.JsonMomentsDetails>
{
    public static JsonClientEventInfo.JsonMomentsDetails _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo.JsonMomentsDetails jsonMomentsDetails = new JsonClientEventInfo.JsonMomentsDetails();
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
            parseField(jsonMomentsDetails, d, qhe);
            qhe.m0();
        }
        return jsonMomentsDetails;
    }
    
    public static void _serialize(final JsonClientEventInfo.JsonMomentsDetails jsonMomentsDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonMomentsDetails.a != null) {
            yfe.i("contextScribeInfo");
            JsonClientEventInfo$JsonContextScribeInfo$$JsonObjectMapper._serialize(jsonMomentsDetails.a, yfe, true);
        }
        yfe.u0("guideCategoryId", jsonMomentsDetails.d);
        yfe.W("impressionId", jsonMomentsDetails.b);
        yfe.W("momentId", jsonMomentsDetails.c);
        yfe.u0("pivotFromMomentId", jsonMomentsDetails.e);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo.JsonMomentsDetails jsonMomentsDetails, final String s, final qhe qhe) throws IOException {
        if ("contextScribeInfo".equals(s)) {
            jsonMomentsDetails.a = JsonClientEventInfo$JsonContextScribeInfo$$JsonObjectMapper._parse(qhe);
        }
        else if ("guideCategoryId".equals(s)) {
            jsonMomentsDetails.d = qhe.T((String)null);
        }
        else if ("impressionId".equals(s)) {
            jsonMomentsDetails.b = qhe.L();
        }
        else if ("momentId".equals(s)) {
            jsonMomentsDetails.c = qhe.L();
        }
        else if ("pivotFromMomentId".equals(s)) {
            jsonMomentsDetails.e = qhe.T((String)null);
        }
    }
    
    public JsonClientEventInfo.JsonMomentsDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo.JsonMomentsDetails jsonMomentsDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMomentsDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo.JsonMomentsDetails)o, yfe, b);
    }
}
