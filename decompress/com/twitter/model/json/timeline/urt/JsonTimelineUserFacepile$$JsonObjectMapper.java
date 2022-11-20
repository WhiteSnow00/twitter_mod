// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineUserFacepile$$JsonObjectMapper extends JsonMapper<JsonTimelineUserFacepile>
{
    public static final cpa FACEPILE_ACTION_TYPE_CONVERTER;
    public static final jpa FACEPILE_DISPLAY_TYPE_CONVERTER;
    
    static {
        FACEPILE_DISPLAY_TYPE_CONVERTER = new jpa();
        FACEPILE_ACTION_TYPE_CONVERTER = new cpa();
    }
    
    public static JsonTimelineUserFacepile _parse(final tge tge) throws IOException {
        final JsonTimelineUserFacepile jsonTimelineUserFacepile = new JsonTimelineUserFacepile();
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
            parseField(jsonTimelineUserFacepile, d, tge);
            tge.l0();
        }
        return jsonTimelineUserFacepile;
    }
    
    public static void _serialize(final JsonTimelineUserFacepile jsonTimelineUserFacepile, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineUserFacepile.e != null) {
            LoganSquare.typeConverterFor((Class)cqv.class).serialize((Object)jsonTimelineUserFacepile.e, "action", true, afe);
        }
        final bpa f = jsonTimelineUserFacepile.f;
        if (f != null) {
            ((StringBasedTypeConverter)JsonTimelineUserFacepile$$JsonObjectMapper.FACEPILE_ACTION_TYPE_CONVERTER).serialize((Object)f, "actionType", true, afe);
        }
        final ipa h = jsonTimelineUserFacepile.h;
        if (h != null) {
            ((StringBasedTypeConverter)JsonTimelineUserFacepile$$JsonObjectMapper.FACEPILE_DISPLAY_TYPE_CONVERTER).serialize((Object)h, "displayType", true, afe);
        }
        afe.e("displaysFeaturingText", jsonTimelineUserFacepile.g);
        final List c = jsonTimelineUserFacepile.c;
        if (c != null) {
            final Iterator g = hee.g(afe, "featuredUserIds", c);
            while (g.hasNext()) {
                afe.r0((String)g.next());
            }
            afe.f();
        }
        final ArrayList d = jsonTimelineUserFacepile.d;
        if (d != null) {
            final Iterator a = br.A(afe, "featuredUsersResults", d);
            while (a.hasNext()) {
                final kiw kiw = a.next();
                if (kiw != null) {
                    LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)kiw, "lslocalfeaturedUsersResultsElement", false, afe);
                }
            }
            afe.f();
        }
        final List a2 = jsonTimelineUserFacepile.a;
        if (a2 != null) {
            final Iterator g2 = hee.g(afe, "userIds", a2);
            while (g2.hasNext()) {
                afe.r0((String)g2.next());
            }
            afe.f();
        }
        final ArrayList b2 = jsonTimelineUserFacepile.b;
        if (b2 != null) {
            final Iterator a3 = br.A(afe, "usersResults", b2);
            while (a3.hasNext()) {
                final kiw kiw2 = a3.next();
                if (kiw2 != null) {
                    LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)kiw2, "lslocalusersResultsElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineUserFacepile jsonTimelineUserFacepile, String t, final tge tge) throws IOException {
        if (!"action".equals(t) && !"facepileButtonAction".equals(t)) {
            if (!"actionType".equals(t) && !"facepileActionType".equals(t)) {
                if (!"displayType".equals(t) && !"facepileDisplayType".equals(t)) {
                    if (!"displaysFeaturingText".equals(t) && !"facepileDisplaysFeaturingText".equals(t)) {
                        if ("featuredUserIds".equals(t)) {
                            if (tge.e() == vie.N0) {
                                final ArrayList c = new ArrayList();
                                while (tge.h0() != vie.O0) {
                                    final String t2 = tge.T((String)null);
                                    if (t2 != null) {
                                        c.add(t2);
                                    }
                                }
                                jsonTimelineUserFacepile.c = c;
                            }
                            else {
                                jsonTimelineUserFacepile.c = null;
                            }
                        }
                        else if (!"featuredUsersResults".equals(t) && !"facepileFeaturedUserResults".equals(t)) {
                            if ("userIds".equals(t)) {
                                if (tge.e() == vie.N0) {
                                    final ArrayList a = new ArrayList();
                                    while (tge.h0() != vie.O0) {
                                        t = tge.T((String)null);
                                        if (t != null) {
                                            a.add(t);
                                        }
                                    }
                                    jsonTimelineUserFacepile.a = a;
                                }
                                else {
                                    jsonTimelineUserFacepile.a = null;
                                }
                            }
                            else if ("usersResults".equals(t) || "facepileUserResults".equals(t)) {
                                if (tge.e() == vie.N0) {
                                    final ArrayList b = new ArrayList();
                                    while (tge.h0() != vie.O0) {
                                        final kiw kiw = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
                                        if (kiw != null) {
                                            b.add(kiw);
                                        }
                                    }
                                    jsonTimelineUserFacepile.b = b;
                                }
                                else {
                                    jsonTimelineUserFacepile.b = null;
                                }
                            }
                        }
                        else if (tge.e() == vie.N0) {
                            final ArrayList d = new ArrayList();
                            while (tge.h0() != vie.O0) {
                                final kiw kiw2 = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
                                if (kiw2 != null) {
                                    d.add(kiw2);
                                }
                            }
                            jsonTimelineUserFacepile.d = d;
                        }
                        else {
                            jsonTimelineUserFacepile.d = null;
                        }
                    }
                    else {
                        jsonTimelineUserFacepile.g = tge.k();
                    }
                }
                else {
                    jsonTimelineUserFacepile.h = (ipa)((StringBasedTypeConverter)JsonTimelineUserFacepile$$JsonObjectMapper.FACEPILE_DISPLAY_TYPE_CONVERTER).parse(tge);
                }
            }
            else {
                jsonTimelineUserFacepile.f = (bpa)((StringBasedTypeConverter)JsonTimelineUserFacepile$$JsonObjectMapper.FACEPILE_ACTION_TYPE_CONVERTER).parse(tge);
            }
        }
        else {
            jsonTimelineUserFacepile.e = (cqv)LoganSquare.typeConverterFor((Class)cqv.class).parse(tge);
        }
    }
    
    public JsonTimelineUserFacepile parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineUserFacepile jsonTimelineUserFacepile, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineUserFacepile, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineUserFacepile)o, afe, b);
    }
}
