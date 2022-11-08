// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.richtext;

import com.twitter.model.json.timeline.urt.JsonGraphQlRestId$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrtRichText$JsonRichTextUserEntity$$JsonObjectMapper extends JsonMapper<JsonUrtRichText.JsonRichTextUserEntity>
{
    public static JsonUrtRichText.JsonRichTextUserEntity _parse(final khe khe) throws IOException {
        final JsonUrtRichText.JsonRichTextUserEntity jsonRichTextUserEntity = new JsonUrtRichText.JsonRichTextUserEntity();
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
            parseField(jsonRichTextUserEntity, d, khe);
            khe.m0();
        }
        return jsonRichTextUserEntity;
    }
    
    public static void _serialize(final JsonUrtRichText.JsonRichTextUserEntity jsonRichTextUserEntity, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("id", jsonRichTextUserEntity.a);
        if (jsonRichTextUserEntity.b != null) {
            tfe.i("user");
            JsonGraphQlRestId$$JsonObjectMapper._serialize(jsonRichTextUserEntity.b, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUrtRichText.JsonRichTextUserEntity jsonRichTextUserEntity, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonRichTextUserEntity.a = khe.z();
        }
        else if ("user".equals(s)) {
            jsonRichTextUserEntity.b = JsonGraphQlRestId$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonUrtRichText.JsonRichTextUserEntity parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUrtRichText.JsonRichTextUserEntity jsonRichTextUserEntity, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonRichTextUserEntity, tfe, b);
    }
}
