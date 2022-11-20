// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineNews$$JsonObjectMapper extends JsonMapper<JsonTimelineNews>
{
    public static final hfi NEWS_DISPLAY_TYPE_CONVERTER;
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    
    static {
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
        NEWS_DISPLAY_TYPE_CONVERTER = new hfi();
    }
    
    public static JsonTimelineNews _parse(final tge tge) throws IOException {
        final JsonTimelineNews jsonTimelineNews = new JsonTimelineNews();
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
            parseField(jsonTimelineNews, d, tge);
            tge.l0();
        }
        return jsonTimelineNews;
    }
    
    public static void _serialize(final JsonTimelineNews jsonTimelineNews, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("author", jsonTimelineNews.d);
        afe.t0("description", jsonTimelineNews.e);
        if (jsonTimelineNews.b != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonTimelineNews.b, "landingUrl", true, afe);
        }
        ((StringBasedTypeConverter)JsonTimelineNews$$JsonObjectMapper.NEWS_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonTimelineNews.a, "newsDisplayType", true, afe);
        if (jsonTimelineNews.h != null) {
            LoganSquare.typeConverterFor((Class)soj.class).serialize((Object)jsonTimelineNews.h, "originalImage", true, afe);
        }
        afe.t0("pivotText", jsonTimelineNews.g);
        final u4t f = jsonTimelineNews.f;
        if (f == null) {
            afe.t0("title", jsonTimelineNews.c);
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<u4t>)JsonTimelineNews$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(f, "socialProof", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonTimelineNews jsonTimelineNews, final String s, final tge tge) throws IOException {
        if ("author".equals(s)) {
            jsonTimelineNews.d = tge.T((String)null);
        }
        else if ("description".equals(s)) {
            jsonTimelineNews.e = tge.T((String)null);
        }
        else if ("landingUrl".equals(s)) {
            jsonTimelineNews.b = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
        else if ("newsDisplayType".equals(s)) {
            jsonTimelineNews.a = (int)((StringBasedTypeConverter)JsonTimelineNews$$JsonObjectMapper.NEWS_DISPLAY_TYPE_CONVERTER).parse(tge);
        }
        else if ("originalImage".equals(s)) {
            jsonTimelineNews.h = (soj)LoganSquare.typeConverterFor((Class)soj.class).parse(tge);
        }
        else if ("pivotText".equals(s)) {
            jsonTimelineNews.g = tge.T((String)null);
        }
        else if ("socialProof".equals(s)) {
            jsonTimelineNews.f = ((hfe<u4t>)JsonTimelineNews$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(tge);
        }
        else if ("title".equals(s)) {
            jsonTimelineNews.c = tge.T((String)null);
        }
    }
    
    public JsonTimelineNews parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineNews jsonTimelineNews, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineNews, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineNews)o, afe, b);
    }
}
