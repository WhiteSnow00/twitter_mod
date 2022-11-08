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
    public static final fqa FACEPILE_ACTION_TYPE_CONVERTER;
    public static final mqa FACEPILE_DISPLAY_TYPE_CONVERTER;
    
    static {
        FACEPILE_DISPLAY_TYPE_CONVERTER = new mqa();
        FACEPILE_ACTION_TYPE_CONVERTER = new fqa();
    }
    
    public static JsonTimelineUserFacepile _parse(final khe khe) throws IOException {
        final JsonTimelineUserFacepile jsonTimelineUserFacepile = new JsonTimelineUserFacepile();
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
            parseField(jsonTimelineUserFacepile, d, khe);
            khe.m0();
        }
        return jsonTimelineUserFacepile;
    }
    
    public static void _serialize(final JsonTimelineUserFacepile jsonTimelineUserFacepile, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTimelineUserFacepile.e != null) {
            LoganSquare.typeConverterFor((Class)fpv.class).serialize((Object)jsonTimelineUserFacepile.e, "action", true, tfe);
        }
        final eqa f = jsonTimelineUserFacepile.f;
        if (f != null) {
            ((StringBasedTypeConverter)JsonTimelineUserFacepile$$JsonObjectMapper.FACEPILE_ACTION_TYPE_CONVERTER).serialize((Object)f, "actionType", true, tfe);
        }
        final lqa h = jsonTimelineUserFacepile.h;
        if (h != null) {
            ((StringBasedTypeConverter)JsonTimelineUserFacepile$$JsonObjectMapper.FACEPILE_DISPLAY_TYPE_CONVERTER).serialize((Object)h, "displayType", true, tfe);
        }
        tfe.e("displaysFeaturingText", jsonTimelineUserFacepile.g);
        final List<String> c = jsonTimelineUserFacepile.c;
        if (c != null) {
            final Iterator f2 = x30.F(tfe, "featuredUserIds", (List)c);
            while (f2.hasNext()) {
                tfe.s0((String)f2.next());
            }
            tfe.f();
        }
        final ArrayList d = jsonTimelineUserFacepile.d;
        if (d != null) {
            final Iterator g = q1a.g(tfe, "featuredUsersResults", d);
            while (g.hasNext()) {
                final rhw rhw = g.next();
                if (rhw != null) {
                    LoganSquare.typeConverterFor((Class)rhw.class).serialize((Object)rhw, "lslocalfeaturedUsersResultsElement", false, tfe);
                }
            }
            tfe.f();
        }
        final List<String> a = jsonTimelineUserFacepile.a;
        if (a != null) {
            final Iterator f3 = x30.F(tfe, "userIds", (List)a);
            while (f3.hasNext()) {
                tfe.s0((String)f3.next());
            }
            tfe.f();
        }
        final ArrayList b2 = jsonTimelineUserFacepile.b;
        if (b2 != null) {
            final Iterator g2 = q1a.g(tfe, "usersResults", b2);
            while (g2.hasNext()) {
                final rhw rhw2 = g2.next();
                if (rhw2 != null) {
                    LoganSquare.typeConverterFor((Class)rhw.class).serialize((Object)rhw2, "lslocalusersResultsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineUserFacepile jsonTimelineUserFacepile, String s, final khe khe) throws IOException {
        if (!"action".equals(s) && !"facepileButtonAction".equals(s)) {
            if (!"actionType".equals(s) && !"facepileActionType".equals(s)) {
                if (!"displayType".equals(s) && !"facepileDisplayType".equals(s)) {
                    if (!"displaysFeaturingText".equals(s) && !"facepileDisplaysFeaturingText".equals(s)) {
                        if ("featuredUserIds".equals(s)) {
                            if (khe.e() == lje.M0) {
                                final ArrayList c = new ArrayList();
                                while (khe.i0() != lje.N0) {
                                    s = khe.T((String)null);
                                    if (s != null) {
                                        c.add(s);
                                    }
                                }
                                jsonTimelineUserFacepile.c = c;
                            }
                            else {
                                jsonTimelineUserFacepile.c = null;
                            }
                        }
                        else if (!"featuredUsersResults".equals(s) && !"facepileFeaturedUserResults".equals(s)) {
                            if ("userIds".equals(s)) {
                                if (khe.e() == lje.M0) {
                                    final ArrayList a = new ArrayList();
                                    while (khe.i0() != lje.N0) {
                                        s = khe.T((String)null);
                                        if (s != null) {
                                            a.add(s);
                                        }
                                    }
                                    jsonTimelineUserFacepile.a = a;
                                }
                                else {
                                    jsonTimelineUserFacepile.a = null;
                                }
                            }
                            else if ("usersResults".equals(s) || "facepileUserResults".equals(s)) {
                                if (khe.e() == lje.M0) {
                                    final ArrayList b = new ArrayList();
                                    while (khe.i0() != lje.N0) {
                                        final rhw rhw = (rhw)LoganSquare.typeConverterFor((Class)rhw.class).parse(khe);
                                        if (rhw != null) {
                                            b.add(rhw);
                                        }
                                    }
                                    jsonTimelineUserFacepile.b = b;
                                }
                                else {
                                    jsonTimelineUserFacepile.b = null;
                                }
                            }
                        }
                        else if (khe.e() == lje.M0) {
                            final ArrayList d = new ArrayList();
                            while (khe.i0() != lje.N0) {
                                final rhw rhw2 = (rhw)LoganSquare.typeConverterFor((Class)rhw.class).parse(khe);
                                if (rhw2 != null) {
                                    d.add(rhw2);
                                }
                            }
                            jsonTimelineUserFacepile.d = d;
                        }
                        else {
                            jsonTimelineUserFacepile.d = null;
                        }
                    }
                    else {
                        jsonTimelineUserFacepile.g = khe.k();
                    }
                }
                else {
                    jsonTimelineUserFacepile.h = (lqa)((StringBasedTypeConverter)JsonTimelineUserFacepile$$JsonObjectMapper.FACEPILE_DISPLAY_TYPE_CONVERTER).parse(khe);
                }
            }
            else {
                jsonTimelineUserFacepile.f = (eqa)((StringBasedTypeConverter)JsonTimelineUserFacepile$$JsonObjectMapper.FACEPILE_ACTION_TYPE_CONVERTER).parse(khe);
            }
        }
        else {
            jsonTimelineUserFacepile.e = (fpv)LoganSquare.typeConverterFor((Class)fpv.class).parse(khe);
        }
    }
    
    public JsonTimelineUserFacepile parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineUserFacepile jsonTimelineUserFacepile, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineUserFacepile, tfe, b);
    }
}
