// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.richtext;

import com.twitter.model.json.timeline.urt.JsonGraphQlRestId$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrtRichText$JsonRichTextMentionEntity$$JsonObjectMapper extends JsonMapper<JsonUrtRichText.JsonRichTextMentionEntity>
{
    public static JsonUrtRichText.JsonRichTextMentionEntity _parse(final khe khe) throws IOException {
        final JsonUrtRichText.JsonRichTextMentionEntity jsonRichTextMentionEntity = new JsonUrtRichText.JsonRichTextMentionEntity();
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
            parseField(jsonRichTextMentionEntity, d, khe);
            khe.m0();
        }
        return jsonRichTextMentionEntity;
    }
    
    public static void _serialize(final JsonUrtRichText.JsonRichTextMentionEntity jsonRichTextMentionEntity, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("id", jsonRichTextMentionEntity.b);
        tfe.u0("screenName", jsonRichTextMentionEntity.a);
        if (jsonRichTextMentionEntity.c != null) {
            tfe.i("user");
            JsonGraphQlRestId$$JsonObjectMapper._serialize(jsonRichTextMentionEntity.c, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUrtRichText.JsonRichTextMentionEntity jsonRichTextMentionEntity, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonRichTextMentionEntity.b = khe.L();
        }
        else if ("screenName".equals(s)) {
            jsonRichTextMentionEntity.a = khe.T((String)null);
        }
        else if ("user".equals(s)) {
            jsonRichTextMentionEntity.c = JsonGraphQlRestId$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonUrtRichText.JsonRichTextMentionEntity parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUrtRichText.JsonRichTextMentionEntity jsonRichTextMentionEntity, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonRichTextMentionEntity, tfe, b);
    }
}
