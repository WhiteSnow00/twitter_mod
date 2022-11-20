// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelinePrompt$JsonTimelinePromptContent$$JsonObjectMapper extends JsonMapper<JsonTimelinePrompt$JsonTimelinePromptContent>
{
    public static JsonTimelinePrompt$JsonTimelinePromptContent _parse(final tge tge) throws IOException {
        final JsonTimelinePrompt$JsonTimelinePromptContent jsonTimelinePrompt$JsonTimelinePromptContent = new JsonTimelinePrompt$JsonTimelinePromptContent();
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
            parseField(jsonTimelinePrompt$JsonTimelinePromptContent, d, tge);
            tge.l0();
        }
        return jsonTimelinePrompt$JsonTimelinePromptContent;
    }
    
    public static void _serialize(final JsonTimelinePrompt$JsonTimelinePromptContent jsonTimelinePrompt$JsonTimelinePromptContent, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelinePrompt$JsonTimelinePromptContent.b != null) {
            LoganSquare.typeConverterFor((Class)rkj.class).serialize((Object)jsonTimelinePrompt$JsonTimelinePromptContent.b, "onboardingLikesStartPrompt", true, afe);
        }
        if (jsonTimelinePrompt$JsonTimelinePromptContent.a != null) {
            LoganSquare.typeConverterFor((Class)i2t.class).serialize((Object)jsonTimelinePrompt$JsonTimelinePromptContent.a, "relevancePrompt", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelinePrompt$JsonTimelinePromptContent jsonTimelinePrompt$JsonTimelinePromptContent, final String s, final tge tge) throws IOException {
        if ("onboardingLikesStartPrompt".equals(s)) {
            jsonTimelinePrompt$JsonTimelinePromptContent.b = (rkj)LoganSquare.typeConverterFor((Class)rkj.class).parse(tge);
        }
        else if ("relevancePrompt".equals(s)) {
            jsonTimelinePrompt$JsonTimelinePromptContent.a = (i2t)LoganSquare.typeConverterFor((Class)i2t.class).parse(tge);
        }
    }
    
    public JsonTimelinePrompt$JsonTimelinePromptContent parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelinePrompt$JsonTimelinePromptContent jsonTimelinePrompt$JsonTimelinePromptContent, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelinePrompt$JsonTimelinePromptContent, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelinePrompt$JsonTimelinePromptContent)o, afe, b);
    }
}
