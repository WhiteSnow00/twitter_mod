// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserRecommendationsGroup$$JsonObjectMapper extends JsonMapper<JsonUserRecommendationsGroup>
{
    public static JsonUserRecommendationsGroup _parse(final khe khe) throws IOException {
        final JsonUserRecommendationsGroup jsonUserRecommendationsGroup = new JsonUserRecommendationsGroup();
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
            parseField(jsonUserRecommendationsGroup, d, khe);
            khe.m0();
        }
        return jsonUserRecommendationsGroup;
    }
    
    public static void _serialize(final JsonUserRecommendationsGroup jsonUserRecommendationsGroup, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("header", jsonUserRecommendationsGroup.a);
        final ArrayList b2 = jsonUserRecommendationsGroup.b;
        if (b2 != null) {
            final Iterator g = q1a.g(tfe, "items", b2);
            while (g.hasNext()) {
                final cgw cgw = g.next();
                if (cgw != null) {
                    LoganSquare.typeConverterFor((Class)cgw.class).serialize((Object)cgw, "lslocalitemsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonUserRecommendationsGroup.c != null) {
            LoganSquare.typeConverterFor((Class)ioh.class).serialize((Object)jsonUserRecommendationsGroup.c, "show_more", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUserRecommendationsGroup jsonUserRecommendationsGroup, final String s, final khe khe) throws IOException {
        if ("header".equals(s)) {
            jsonUserRecommendationsGroup.a = khe.T((String)null);
        }
        else if ("items".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final cgw cgw = (cgw)LoganSquare.typeConverterFor((Class)cgw.class).parse(khe);
                    if (cgw != null) {
                        b.add(cgw);
                    }
                }
                jsonUserRecommendationsGroup.b = b;
            }
            else {
                jsonUserRecommendationsGroup.b = null;
            }
        }
        else if ("show_more".equals(s)) {
            jsonUserRecommendationsGroup.c = (ioh)LoganSquare.typeConverterFor((Class)ioh.class).parse(khe);
        }
    }
    
    public JsonUserRecommendationsGroup parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUserRecommendationsGroup jsonUserRecommendationsGroup, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUserRecommendationsGroup, tfe, b);
    }
}
