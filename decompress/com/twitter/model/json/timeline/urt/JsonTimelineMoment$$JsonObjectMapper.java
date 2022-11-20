// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineMoment$$JsonObjectMapper extends JsonMapper<JsonTimelineMoment>
{
    public static final bph MOMENT_DISPLAY_TYPE_CONVERTER;
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    
    static {
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
        MOMENT_DISPLAY_TYPE_CONVERTER = new bph();
    }
    
    public static JsonTimelineMoment _parse(final tge tge) throws IOException {
        final JsonTimelineMoment jsonTimelineMoment = new JsonTimelineMoment();
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
            parseField(jsonTimelineMoment, d, tge);
            tge.l0();
        }
        return jsonTimelineMoment;
    }
    
    public static void _serialize(final JsonTimelineMoment jsonTimelineMoment, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonTimelineMoment$$JsonObjectMapper.MOMENT_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonTimelineMoment.c, "displayType", true, afe);
        afe.t0("impressionId", jsonTimelineMoment.b);
        afe.t0("momentId", jsonTimelineMoment.a);
        final u4t d = jsonTimelineMoment.d;
        if (d == null) {
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<u4t>)JsonTimelineMoment$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(d, "socialContext", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonTimelineMoment jsonTimelineMoment, final String s, final tge tge) throws IOException {
        if ("displayType".equals(s)) {
            jsonTimelineMoment.c = (int)((StringBasedTypeConverter)JsonTimelineMoment$$JsonObjectMapper.MOMENT_DISPLAY_TYPE_CONVERTER).parse(tge);
        }
        else if ("impressionId".equals(s)) {
            jsonTimelineMoment.b = tge.T((String)null);
        }
        else if ("momentId".equals(s)) {
            jsonTimelineMoment.a = tge.T((String)null);
        }
        else if ("socialContext".equals(s)) {
            jsonTimelineMoment.d = ((hfe<u4t>)JsonTimelineMoment$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(tge);
        }
    }
    
    public JsonTimelineMoment parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineMoment jsonTimelineMoment, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineMoment, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineMoment)o, afe, b);
    }
}
