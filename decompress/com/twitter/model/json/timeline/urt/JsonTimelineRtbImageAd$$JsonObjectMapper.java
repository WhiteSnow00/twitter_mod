// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineRtbImageAd$$JsonObjectMapper extends JsonMapper<JsonTimelineRtbImageAd>
{
    public static JsonTimelineRtbImageAd _parse(final tge tge) throws IOException {
        final JsonTimelineRtbImageAd jsonTimelineRtbImageAd = new JsonTimelineRtbImageAd();
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
            parseField(jsonTimelineRtbImageAd, d, tge);
            tge.l0();
        }
        return jsonTimelineRtbImageAd;
    }
    
    public static void _serialize(final JsonTimelineRtbImageAd jsonTimelineRtbImageAd, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("creativeId", jsonTimelineRtbImageAd.a);
        if (jsonTimelineRtbImageAd.f != null) {
            LoganSquare.typeConverterFor((Class)z6d.class).serialize((Object)jsonTimelineRtbImageAd.f, "image", true, afe);
        }
        if (jsonTimelineRtbImageAd.d != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonTimelineRtbImageAd.d, "landingUrl", true, afe);
        }
        if (jsonTimelineRtbImageAd.g != null) {
            afe.i("promotedMetadata");
            JsonPromotedContentUrt$$JsonObjectMapper._serialize(jsonTimelineRtbImageAd.g, afe, true);
        }
        afe.t0("text", jsonTimelineRtbImageAd.c);
        afe.t0("title", jsonTimelineRtbImageAd.b);
        afe.t0("vanityUrl", jsonTimelineRtbImageAd.e);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineRtbImageAd jsonTimelineRtbImageAd, final String s, final tge tge) throws IOException {
        if ("creativeId".equals(s)) {
            jsonTimelineRtbImageAd.a = tge.T((String)null);
        }
        else if ("image".equals(s)) {
            jsonTimelineRtbImageAd.f = (z6d)LoganSquare.typeConverterFor((Class)z6d.class).parse(tge);
        }
        else if ("landingUrl".equals(s)) {
            jsonTimelineRtbImageAd.d = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
        else if ("promotedMetadata".equals(s)) {
            jsonTimelineRtbImageAd.g = JsonPromotedContentUrt$$JsonObjectMapper._parse(tge);
        }
        else if ("text".equals(s)) {
            jsonTimelineRtbImageAd.c = tge.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonTimelineRtbImageAd.b = tge.T((String)null);
        }
        else if ("vanityUrl".equals(s)) {
            jsonTimelineRtbImageAd.e = tge.T((String)null);
        }
    }
    
    public JsonTimelineRtbImageAd parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineRtbImageAd jsonTimelineRtbImageAd, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineRtbImageAd, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineRtbImageAd)o, afe, b);
    }
}
