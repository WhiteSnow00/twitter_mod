// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonGuideDetails$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo$JsonGuideDetails>
{
    public static JsonClientEventInfo$JsonGuideDetails _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo$JsonGuideDetails jsonClientEventInfo$JsonGuideDetails = new JsonClientEventInfo$JsonGuideDetails();
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
            parseField(jsonClientEventInfo$JsonGuideDetails, d, qhe);
            qhe.m0();
        }
        return jsonClientEventInfo$JsonGuideDetails;
    }
    
    public static void _serialize(final JsonClientEventInfo$JsonGuideDetails jsonClientEventInfo$JsonGuideDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("identifier", jsonClientEventInfo$JsonGuideDetails.a);
        yfe.u0("token", jsonClientEventInfo$JsonGuideDetails.b);
        if (jsonClientEventInfo$JsonGuideDetails.c != null) {
            LoganSquare.typeConverterFor((Class)wxl.class).serialize((Object)jsonClientEventInfo$JsonGuideDetails.c, "transparentGuideDetails", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo$JsonGuideDetails jsonClientEventInfo$JsonGuideDetails, final String s, final qhe qhe) throws IOException {
        if ("identifier".equals(s)) {
            jsonClientEventInfo$JsonGuideDetails.a = qhe.T((String)null);
        }
        else if ("token".equals(s)) {
            jsonClientEventInfo$JsonGuideDetails.b = qhe.T((String)null);
        }
        else if ("transparentGuideDetails".equals(s)) {
            jsonClientEventInfo$JsonGuideDetails.c = (wxl)LoganSquare.typeConverterFor((Class)wxl.class).parse(qhe);
        }
    }
    
    public JsonClientEventInfo$JsonGuideDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo$JsonGuideDetails jsonClientEventInfo$JsonGuideDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonClientEventInfo$JsonGuideDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo$JsonGuideDetails)o, yfe, b);
    }
}
