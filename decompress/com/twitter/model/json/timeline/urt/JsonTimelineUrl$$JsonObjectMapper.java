// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineUrl$$JsonObjectMapper extends JsonMapper<JsonTimelineUrl>
{
    public static final JsonTimelineUrl$a URL_TYPE_TYPE_CONVERTER;
    
    static {
        URL_TYPE_TYPE_CONVERTER = new JsonTimelineUrl$a();
    }
    
    public static JsonTimelineUrl _parse(final tge tge) throws IOException {
        final JsonTimelineUrl jsonTimelineUrl = new JsonTimelineUrl();
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
            parseField(jsonTimelineUrl, d, tge);
            tge.l0();
        }
        return jsonTimelineUrl;
    }
    
    public static void _serialize(final JsonTimelineUrl jsonTimelineUrl, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("url", jsonTimelineUrl.a);
        ((StringBasedTypeConverter)JsonTimelineUrl$$JsonObjectMapper.URL_TYPE_TYPE_CONVERTER).serialize((Object)jsonTimelineUrl.b, "url_type", true, afe);
        if (jsonTimelineUrl.c != null) {
            LoganSquare.typeConverterFor((Class)epv.class).serialize((Object)jsonTimelineUrl.c, "urtEndpointOptions", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineUrl jsonTimelineUrl, final String s, final tge tge) throws IOException {
        if ("url".equals(s)) {
            jsonTimelineUrl.a = tge.T((String)null);
        }
        else if (!"url_type".equals(s) && !"urlType".equals(s)) {
            if ("urtEndpointOptions".equals(s)) {
                jsonTimelineUrl.c = (epv)LoganSquare.typeConverterFor((Class)epv.class).parse(tge);
            }
        }
        else {
            jsonTimelineUrl.b = (int)((StringBasedTypeConverter)JsonTimelineUrl$$JsonObjectMapper.URL_TYPE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonTimelineUrl parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineUrl jsonTimelineUrl, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineUrl, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineUrl)o, afe, b);
    }
}
