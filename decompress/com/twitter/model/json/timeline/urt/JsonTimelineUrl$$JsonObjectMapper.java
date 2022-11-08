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
    
    public static JsonTimelineUrl _parse(final khe khe) throws IOException {
        final JsonTimelineUrl jsonTimelineUrl = new JsonTimelineUrl();
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
            parseField(jsonTimelineUrl, d, khe);
            khe.m0();
        }
        return jsonTimelineUrl;
    }
    
    public static void _serialize(final JsonTimelineUrl jsonTimelineUrl, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("url", jsonTimelineUrl.a);
        ((StringBasedTypeConverter)JsonTimelineUrl$$JsonObjectMapper.URL_TYPE_TYPE_CONVERTER).serialize((Object)jsonTimelineUrl.b, "url_type", true, tfe);
        if (jsonTimelineUrl.c != null) {
            LoganSquare.typeConverterFor((Class)fov.class).serialize((Object)jsonTimelineUrl.c, "urtEndpointOptions", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineUrl jsonTimelineUrl, final String s, final khe khe) throws IOException {
        if ("url".equals(s)) {
            jsonTimelineUrl.a = khe.T((String)null);
        }
        else if (!"url_type".equals(s) && !"urlType".equals(s)) {
            if ("urtEndpointOptions".equals(s)) {
                jsonTimelineUrl.c = (fov)LoganSquare.typeConverterFor((Class)fov.class).parse(khe);
            }
        }
        else {
            jsonTimelineUrl.b = (int)((StringBasedTypeConverter)JsonTimelineUrl$$JsonObjectMapper.URL_TYPE_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonTimelineUrl parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineUrl jsonTimelineUrl, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineUrl, tfe, b);
    }
}
