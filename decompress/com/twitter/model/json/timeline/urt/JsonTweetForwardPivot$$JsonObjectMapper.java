// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetForwardPivot$$JsonObjectMapper extends JsonMapper<JsonTweetForwardPivot>
{
    public static JsonTweetForwardPivot _parse(final tge tge) throws IOException {
        final JsonTweetForwardPivot jsonTweetForwardPivot = new JsonTweetForwardPivot();
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
            parseField(jsonTweetForwardPivot, d, tge);
            tge.l0();
        }
        return jsonTweetForwardPivot;
    }
    
    public static void _serialize(final JsonTweetForwardPivot jsonTweetForwardPivot, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTweetForwardPivot.e != null) {
            LoganSquare.typeConverterFor((Class)amu.class).serialize((Object)jsonTweetForwardPivot.e, "displayType", true, afe);
        }
        afe.e("engagement_nudge", jsonTweetForwardPivot.g);
        if (jsonTweetForwardPivot.b != null) {
            LoganSquare.typeConverterFor((Class)tzg.class).serialize((Object)jsonTweetForwardPivot.b, "iconImageVariant", true, afe);
        }
        if (jsonTweetForwardPivot.c != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonTweetForwardPivot.c, "landingUrl", true, afe);
        }
        if (jsonTweetForwardPivot.f != null) {
            LoganSquare.typeConverterFor((Class)akq.class).serialize((Object)jsonTweetForwardPivot.f, "soft_intervention_display_type", true, afe);
        }
        if (jsonTweetForwardPivot.d != null) {
            LoganSquare.typeConverterFor((Class)sg1.class).serialize((Object)jsonTweetForwardPivot.d, "stateBadge", true, afe);
        }
        if (jsonTweetForwardPivot.a != null) {
            LoganSquare.typeConverterFor((Class)oxm.class).serialize((Object)jsonTweetForwardPivot.a, "text", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTweetForwardPivot jsonTweetForwardPivot, final String s, final tge tge) throws IOException {
        if ("displayType".equals(s)) {
            jsonTweetForwardPivot.e = (amu)LoganSquare.typeConverterFor((Class)amu.class).parse(tge);
        }
        else if (!"engagement_nudge".equals(s) && !"engagementNudge".equals(s)) {
            if ("iconImageVariant".equals(s)) {
                jsonTweetForwardPivot.b = (tzg)LoganSquare.typeConverterFor((Class)tzg.class).parse(tge);
            }
            else if (!"landingUrl".equals(s) && !"landing_url".equals(s) && !"url".equals(s)) {
                if (!"soft_intervention_display_type".equals(s) && !"softInterventionDisplayType".equals(s)) {
                    if ("stateBadge".equals(s)) {
                        jsonTweetForwardPivot.d = (sg1)LoganSquare.typeConverterFor((Class)sg1.class).parse(tge);
                    }
                    else if ("text".equals(s)) {
                        jsonTweetForwardPivot.a = (oxm)LoganSquare.typeConverterFor((Class)oxm.class).parse(tge);
                    }
                }
                else {
                    jsonTweetForwardPivot.f = (akq)LoganSquare.typeConverterFor((Class)akq.class).parse(tge);
                }
            }
            else {
                jsonTweetForwardPivot.c = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
            }
        }
        else {
            jsonTweetForwardPivot.g = tge.k();
        }
    }
    
    public JsonTweetForwardPivot parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTweetForwardPivot jsonTweetForwardPivot, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTweetForwardPivot, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTweetForwardPivot)o, afe, b);
    }
}
