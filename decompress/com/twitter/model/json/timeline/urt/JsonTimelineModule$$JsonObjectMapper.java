// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineModule$$JsonObjectMapper extends JsonMapper<JsonTimelineModule>
{
    public static final c TIMELINE_MODULE_SHOW_MORE_BEHAVIOR_UNION_CONVERTER;
    
    static {
        TIMELINE_MODULE_SHOW_MORE_BEHAVIOR_UNION_CONVERTER = new c();
    }
    
    public static JsonTimelineModule _parse(final tge tge) throws IOException {
        final JsonTimelineModule jsonTimelineModule = new JsonTimelineModule();
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
            parseField(jsonTimelineModule, d, tge);
            tge.l0();
        }
        return jsonTimelineModule;
    }
    
    public static void _serialize(final JsonTimelineModule jsonTimelineModule, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineModule.e != null) {
            afe.i("clientEventInfo");
            JsonClientEventInfo$$JsonObjectMapper._serialize(jsonTimelineModule.e, afe, true);
        }
        afe.t0("displayType", jsonTimelineModule.d);
        if (jsonTimelineModule.f != null) {
            LoganSquare.typeConverterFor((Class)qvs.class).serialize((Object)jsonTimelineModule.f, "feedbackInfo", true, afe);
        }
        if (jsonTimelineModule.c != null) {
            LoganSquare.typeConverterFor((Class)ilh.class).serialize((Object)jsonTimelineModule.c, "footer", true, afe);
        }
        if (jsonTimelineModule.b != null) {
            LoganSquare.typeConverterFor((Class)rlh.class).serialize((Object)jsonTimelineModule.b, "header", true, afe);
        }
        final ArrayList a = jsonTimelineModule.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "items", a);
            while (a2.hasNext()) {
                final JsonTimelineModuleItem jsonTimelineModuleItem = a2.next();
                if (jsonTimelineModuleItem != null) {
                    JsonTimelineModuleItem$$JsonObjectMapper._serialize(jsonTimelineModuleItem, afe, true);
                }
            }
            afe.f();
        }
        if (jsonTimelineModule.g != null) {
            LoganSquare.typeConverterFor((Class)c0t.class).serialize((Object)jsonTimelineModule.g, "metadata", true, afe);
        }
        final d0t h = jsonTimelineModule.h;
        if (h == null) {
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<d0t>)JsonTimelineModule$$JsonObjectMapper.TIMELINE_MODULE_SHOW_MORE_BEHAVIOR_UNION_CONVERTER).serialize(h, "showMoreBehavior", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonTimelineModule jsonTimelineModule, final String s, final tge tge) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonTimelineModule.e = JsonClientEventInfo$$JsonObjectMapper._parse(tge);
        }
        else if (!"displayType".equals(s) && !"moduleDisplayType".equals(s)) {
            if ("feedbackInfo".equals(s)) {
                jsonTimelineModule.f = (qvs)LoganSquare.typeConverterFor((Class)qvs.class).parse(tge);
            }
            else if ("footer".equals(s)) {
                jsonTimelineModule.c = (ilh)LoganSquare.typeConverterFor((Class)ilh.class).parse(tge);
            }
            else if ("header".equals(s)) {
                jsonTimelineModule.b = (rlh)LoganSquare.typeConverterFor((Class)rlh.class).parse(tge);
            }
            else if ("items".equals(s)) {
                if (tge.e() == vie.N0) {
                    final ArrayList a = new ArrayList();
                    while (tge.h0() != vie.O0) {
                        final JsonTimelineModuleItem parse = JsonTimelineModuleItem$$JsonObjectMapper._parse(tge);
                        if (parse != null) {
                            a.add(parse);
                        }
                    }
                    jsonTimelineModule.a = a;
                }
                else {
                    jsonTimelineModule.a = null;
                }
            }
            else if ("metadata".equals(s)) {
                jsonTimelineModule.g = (c0t)LoganSquare.typeConverterFor((Class)c0t.class).parse(tge);
            }
            else if ("showMoreBehavior".equals(s)) {
                jsonTimelineModule.h = ((hfe<d0t>)JsonTimelineModule$$JsonObjectMapper.TIMELINE_MODULE_SHOW_MORE_BEHAVIOR_UNION_CONVERTER).parse(tge);
            }
        }
        else {
            jsonTimelineModule.d = tge.T((String)null);
        }
    }
    
    public JsonTimelineModule parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineModule jsonTimelineModule, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineModule, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineModule)o, afe, b);
    }
}
