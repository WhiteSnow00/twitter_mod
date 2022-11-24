// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOnboardingLikesStartPrompt$$JsonObjectMapper extends JsonMapper<JsonOnboardingLikesStartPrompt>
{
    public static JsonOnboardingLikesStartPrompt _parse(final qhe qhe) throws IOException {
        final JsonOnboardingLikesStartPrompt jsonOnboardingLikesStartPrompt = new JsonOnboardingLikesStartPrompt();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonOnboardingLikesStartPrompt, d, qhe);
            qhe.m0();
        }
        return jsonOnboardingLikesStartPrompt;
    }
    
    public static void _serialize(final JsonOnboardingLikesStartPrompt jsonOnboardingLikesStartPrompt, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonOnboardingLikesStartPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)fym.class).serialize((Object)jsonOnboardingLikesStartPrompt.d, "bodyRichText", true, yfe);
        }
        yfe.u0("headerIconUrl", jsonOnboardingLikesStartPrompt.b);
        if (jsonOnboardingLikesStartPrompt.c != null) {
            LoganSquare.typeConverterFor((Class)fym.class).serialize((Object)jsonOnboardingLikesStartPrompt.c, "headerRichText", true, yfe);
        }
        yfe.T("likesNeededToCompleteOnboarding", jsonOnboardingLikesStartPrompt.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOnboardingLikesStartPrompt jsonOnboardingLikesStartPrompt, final String s, final qhe qhe) throws IOException {
        if ("bodyRichText".equals(s)) {
            jsonOnboardingLikesStartPrompt.d = (fym)LoganSquare.typeConverterFor((Class)fym.class).parse(qhe);
        }
        else if ("headerIconUrl".equals(s)) {
            jsonOnboardingLikesStartPrompt.b = qhe.T((String)null);
        }
        else if ("headerRichText".equals(s)) {
            jsonOnboardingLikesStartPrompt.c = (fym)LoganSquare.typeConverterFor((Class)fym.class).parse(qhe);
        }
        else if ("likesNeededToCompleteOnboarding".equals(s)) {
            jsonOnboardingLikesStartPrompt.a = qhe.z();
        }
    }
    
    public JsonOnboardingLikesStartPrompt parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOnboardingLikesStartPrompt jsonOnboardingLikesStartPrompt, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOnboardingLikesStartPrompt, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOnboardingLikesStartPrompt)o, yfe, b);
    }
}
