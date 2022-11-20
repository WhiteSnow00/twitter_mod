// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineUser$$JsonObjectMapper extends JsonMapper<JsonTimelineUser>
{
    public static final JsonTimelineUser$a JSON_USER_DISPLAY_TYPE_CONVERTER;
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    
    static {
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
        JSON_USER_DISPLAY_TYPE_CONVERTER = new JsonTimelineUser$a();
    }
    
    public static JsonTimelineUser _parse(final tge tge) throws IOException {
        final JsonTimelineUser jsonTimelineUser = new JsonTimelineUser();
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
            parseField(jsonTimelineUser, d, tge);
            tge.l0();
        }
        return jsonTimelineUser;
    }
    
    public static void _serialize(final JsonTimelineUser jsonTimelineUser, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final String c = jsonTimelineUser.c;
        if (c != null) {
            ((StringBasedTypeConverter)JsonTimelineUser$$JsonObjectMapper.JSON_USER_DISPLAY_TYPE_CONVERTER).serialize((Object)c, "displayType", true, afe);
        }
        afe.e("enableReactiveBlending", jsonTimelineUser.f);
        afe.t0("id", jsonTimelineUser.a);
        final u4t e = jsonTimelineUser.e;
        if (e == null) {
            if (jsonTimelineUser.d != null) {
                afe.i("promotedMetadata");
                JsonPromotedContentUrt$$JsonObjectMapper._serialize(jsonTimelineUser.d, afe, true);
            }
            if (jsonTimelineUser.g != null) {
                LoganSquare.typeConverterFor((Class)d0m$c.class).serialize((Object)jsonTimelineUser.g, "reactiveTriggers", true, afe);
            }
            if (jsonTimelineUser.b != null) {
                LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)jsonTimelineUser.b, "userResult", true, afe);
            }
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<u4t>)JsonTimelineUser$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(e, "socialContext", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonTimelineUser jsonTimelineUser, final String s, final tge tge) throws IOException {
        if (!"displayType".equals(s) && !"userDisplayType".equals(s)) {
            if ("enableReactiveBlending".equals(s)) {
                jsonTimelineUser.f = tge.k();
            }
            else if ("id".equals(s)) {
                jsonTimelineUser.a = tge.T((String)null);
            }
            else if ("socialContext".equals(s)) {
                jsonTimelineUser.e = ((hfe<u4t>)JsonTimelineUser$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(tge);
            }
            else if (!"promotedMetadata".equals(s) && !"userPromotedMetadata".equals(s)) {
                if (!"reactiveTriggers".equals(s) && !"userReactiveTriggers".equals(s)) {
                    if ("userResult".equals(s)) {
                        jsonTimelineUser.b = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
                    }
                }
                else {
                    jsonTimelineUser.g = (d0m$c)LoganSquare.typeConverterFor((Class)d0m$c.class).parse(tge);
                }
            }
            else {
                jsonTimelineUser.d = JsonPromotedContentUrt$$JsonObjectMapper._parse(tge);
            }
        }
        else {
            jsonTimelineUser.c = (String)((StringBasedTypeConverter)JsonTimelineUser$$JsonObjectMapper.JSON_USER_DISPLAY_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonTimelineUser parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineUser jsonTimelineUser, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineUser, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineUser)o, afe, b);
    }
}
