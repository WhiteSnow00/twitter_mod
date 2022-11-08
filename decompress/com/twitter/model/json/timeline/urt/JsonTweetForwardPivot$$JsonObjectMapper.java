// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetForwardPivot$$JsonObjectMapper extends JsonMapper<JsonTweetForwardPivot>
{
    public static JsonTweetForwardPivot _parse(final khe khe) throws IOException {
        final JsonTweetForwardPivot jsonTweetForwardPivot = new JsonTweetForwardPivot();
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
            parseField(jsonTweetForwardPivot, d, khe);
            khe.m0();
        }
        return jsonTweetForwardPivot;
    }
    
    public static void _serialize(final JsonTweetForwardPivot jsonTweetForwardPivot, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTweetForwardPivot.e != null) {
            LoganSquare.typeConverterFor((Class)glu.class).serialize((Object)jsonTweetForwardPivot.e, "displayType", true, tfe);
        }
        tfe.e("engagement_nudge", jsonTweetForwardPivot.g);
        if (jsonTweetForwardPivot.b != null) {
            LoganSquare.typeConverterFor((Class)szg.class).serialize((Object)jsonTweetForwardPivot.b, "iconImageVariant", true, tfe);
        }
        if (jsonTweetForwardPivot.c != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonTweetForwardPivot.c, "landingUrl", true, tfe);
        }
        if (jsonTweetForwardPivot.f != null) {
            LoganSquare.typeConverterFor((Class)ijq.class).serialize((Object)jsonTweetForwardPivot.f, "soft_intervention_display_type", true, tfe);
        }
        if (jsonTweetForwardPivot.d != null) {
            LoganSquare.typeConverterFor((Class)wg1.class).serialize((Object)jsonTweetForwardPivot.d, "stateBadge", true, tfe);
        }
        if (jsonTweetForwardPivot.a != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonTweetForwardPivot.a, "text", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTweetForwardPivot jsonTweetForwardPivot, final String s, final khe khe) throws IOException {
        if ("displayType".equals(s)) {
            jsonTweetForwardPivot.e = (glu)LoganSquare.typeConverterFor((Class)glu.class).parse(khe);
        }
        else if (!"engagement_nudge".equals(s) && !"engagementNudge".equals(s)) {
            if ("iconImageVariant".equals(s)) {
                jsonTweetForwardPivot.b = (szg)LoganSquare.typeConverterFor((Class)szg.class).parse(khe);
            }
            else if (!"landingUrl".equals(s) && !"landing_url".equals(s) && !"url".equals(s)) {
                if (!"soft_intervention_display_type".equals(s) && !"softInterventionDisplayType".equals(s)) {
                    if ("stateBadge".equals(s)) {
                        jsonTweetForwardPivot.d = (wg1)LoganSquare.typeConverterFor((Class)wg1.class).parse(khe);
                    }
                    else if ("text".equals(s)) {
                        jsonTweetForwardPivot.a = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
                    }
                }
                else {
                    jsonTweetForwardPivot.f = (ijq)LoganSquare.typeConverterFor((Class)ijq.class).parse(khe);
                }
            }
            else {
                jsonTweetForwardPivot.c = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
            }
        }
        else {
            jsonTweetForwardPivot.g = khe.k();
        }
    }
    
    public JsonTweetForwardPivot parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTweetForwardPivot jsonTweetForwardPivot, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTweetForwardPivot, tfe, b);
    }
}
