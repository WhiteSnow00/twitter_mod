// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineRtbImageAd$$JsonObjectMapper extends JsonMapper<JsonTimelineRtbImageAd>
{
    public static JsonTimelineRtbImageAd _parse(final khe khe) throws IOException {
        final JsonTimelineRtbImageAd jsonTimelineRtbImageAd = new JsonTimelineRtbImageAd();
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
            parseField(jsonTimelineRtbImageAd, d, khe);
            khe.m0();
        }
        return jsonTimelineRtbImageAd;
    }
    
    public static void _serialize(final JsonTimelineRtbImageAd jsonTimelineRtbImageAd, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("creativeId", jsonTimelineRtbImageAd.a);
        if (jsonTimelineRtbImageAd.f != null) {
            LoganSquare.typeConverterFor((Class)v7d.class).serialize((Object)jsonTimelineRtbImageAd.f, "image", true, tfe);
        }
        if (jsonTimelineRtbImageAd.d != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonTimelineRtbImageAd.d, "landingUrl", true, tfe);
        }
        if (jsonTimelineRtbImageAd.g != null) {
            tfe.i("promotedMetadata");
            JsonPromotedContentUrt$$JsonObjectMapper._serialize(jsonTimelineRtbImageAd.g, tfe, true);
        }
        tfe.u0("text", jsonTimelineRtbImageAd.c);
        tfe.u0("title", jsonTimelineRtbImageAd.b);
        tfe.u0("vanityUrl", jsonTimelineRtbImageAd.e);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineRtbImageAd jsonTimelineRtbImageAd, final String s, final khe khe) throws IOException {
        if ("creativeId".equals(s)) {
            jsonTimelineRtbImageAd.a = khe.T((String)null);
        }
        else if ("image".equals(s)) {
            jsonTimelineRtbImageAd.f = (v7d)LoganSquare.typeConverterFor((Class)v7d.class).parse(khe);
        }
        else if ("landingUrl".equals(s)) {
            jsonTimelineRtbImageAd.d = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
        else if ("promotedMetadata".equals(s)) {
            jsonTimelineRtbImageAd.g = JsonPromotedContentUrt$$JsonObjectMapper._parse(khe);
        }
        else if ("text".equals(s)) {
            jsonTimelineRtbImageAd.c = khe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonTimelineRtbImageAd.b = khe.T((String)null);
        }
        else if ("vanityUrl".equals(s)) {
            jsonTimelineRtbImageAd.e = khe.T((String)null);
        }
    }
    
    public JsonTimelineRtbImageAd parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineRtbImageAd jsonTimelineRtbImageAd, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineRtbImageAd, tfe, b);
    }
}
