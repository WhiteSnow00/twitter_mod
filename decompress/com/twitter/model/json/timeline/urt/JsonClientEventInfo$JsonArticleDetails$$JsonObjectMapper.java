// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonArticleDetails$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo$JsonArticleDetails>
{
    public static JsonClientEventInfo$JsonArticleDetails _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo$JsonArticleDetails jsonClientEventInfo$JsonArticleDetails = new JsonClientEventInfo$JsonArticleDetails();
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
            parseField(jsonClientEventInfo$JsonArticleDetails, d, qhe);
            qhe.m0();
        }
        return jsonClientEventInfo$JsonArticleDetails;
    }
    
    public static void _serialize(final JsonClientEventInfo$JsonArticleDetails jsonClientEventInfo$JsonArticleDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("articlePosition", jsonClientEventInfo$JsonArticleDetails.a);
        yfe.T("shareCount", jsonClientEventInfo$JsonArticleDetails.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo$JsonArticleDetails jsonClientEventInfo$JsonArticleDetails, final String s, final qhe qhe) throws IOException {
        if ("articlePosition".equals(s)) {
            jsonClientEventInfo$JsonArticleDetails.a = qhe.z();
        }
        else if ("shareCount".equals(s)) {
            jsonClientEventInfo$JsonArticleDetails.b = qhe.z();
        }
    }
    
    public JsonClientEventInfo$JsonArticleDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo$JsonArticleDetails jsonClientEventInfo$JsonArticleDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonClientEventInfo$JsonArticleDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo$JsonArticleDetails)o, yfe, b);
    }
}
