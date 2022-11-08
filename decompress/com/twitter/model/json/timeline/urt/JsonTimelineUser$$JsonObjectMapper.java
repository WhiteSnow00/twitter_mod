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
    
    public static JsonTimelineUser _parse(final khe khe) throws IOException {
        final JsonTimelineUser jsonTimelineUser = new JsonTimelineUser();
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
            parseField(jsonTimelineUser, d, khe);
            khe.m0();
        }
        return jsonTimelineUser;
    }
    
    public static void _serialize(final JsonTimelineUser jsonTimelineUser, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final String c = jsonTimelineUser.c;
        if (c != null) {
            ((StringBasedTypeConverter)JsonTimelineUser$$JsonObjectMapper.JSON_USER_DISPLAY_TYPE_CONVERTER).serialize((Object)c, "displayType", true, tfe);
        }
        tfe.e("enableReactiveBlending", jsonTimelineUser.f);
        tfe.u0("id", jsonTimelineUser.a);
        final d4t e = jsonTimelineUser.e;
        if (e == null) {
            if (jsonTimelineUser.d != null) {
                tfe.i("promotedMetadata");
                JsonPromotedContentUrt$$JsonObjectMapper._serialize(jsonTimelineUser.d, tfe, true);
            }
            if (jsonTimelineUser.g != null) {
                LoganSquare.typeConverterFor((Class)ozl.c.class).serialize((Object)jsonTimelineUser.g, "reactiveTriggers", true, tfe);
            }
            if (jsonTimelineUser.b != null) {
                LoganSquare.typeConverterFor((Class)rhw.class).serialize((Object)jsonTimelineUser.b, "userResult", true, tfe);
            }
            if (b) {
                tfe.h();
            }
            return;
        }
        ((twj<d4t>)JsonTimelineUser$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(e, "socialContext", true, tfe);
        throw null;
    }
    
    public static void parseField(final JsonTimelineUser jsonTimelineUser, final String s, final khe khe) throws IOException {
        if (!"displayType".equals(s) && !"userDisplayType".equals(s)) {
            if ("enableReactiveBlending".equals(s)) {
                jsonTimelineUser.f = khe.k();
            }
            else if ("id".equals(s)) {
                jsonTimelineUser.a = khe.T((String)null);
            }
            else if ("socialContext".equals(s)) {
                jsonTimelineUser.e = (d4t)((age)JsonTimelineUser$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(khe);
            }
            else if (!"promotedMetadata".equals(s) && !"userPromotedMetadata".equals(s)) {
                if (!"reactiveTriggers".equals(s) && !"userReactiveTriggers".equals(s)) {
                    if ("userResult".equals(s)) {
                        jsonTimelineUser.b = (rhw)LoganSquare.typeConverterFor((Class)rhw.class).parse(khe);
                    }
                }
                else {
                    jsonTimelineUser.g = (ozl.c)LoganSquare.typeConverterFor((Class)ozl.c.class).parse(khe);
                }
            }
            else {
                jsonTimelineUser.d = JsonPromotedContentUrt$$JsonObjectMapper._parse(khe);
            }
        }
        else {
            jsonTimelineUser.c = (String)((StringBasedTypeConverter)JsonTimelineUser$$JsonObjectMapper.JSON_USER_DISPLAY_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonTimelineUser parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineUser jsonTimelineUser, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineUser, tfe, b);
    }
}
