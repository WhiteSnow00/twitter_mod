// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.richtext;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrtRichText$JsonRichTextTwitterListEntity$$JsonObjectMapper extends JsonMapper<JsonUrtRichText.JsonRichTextTwitterListEntity>
{
    public static JsonUrtRichText.JsonRichTextTwitterListEntity _parse(final khe khe) throws IOException {
        final JsonUrtRichText.JsonRichTextTwitterListEntity jsonRichTextTwitterListEntity = new JsonUrtRichText.JsonRichTextTwitterListEntity();
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
            parseField(jsonRichTextTwitterListEntity, d, khe);
            khe.m0();
        }
        return jsonRichTextTwitterListEntity;
    }
    
    public static void _serialize(final JsonUrtRichText.JsonRichTextTwitterListEntity jsonRichTextTwitterListEntity, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("id", jsonRichTextTwitterListEntity.a);
        tfe.u0("url", jsonRichTextTwitterListEntity.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUrtRichText.JsonRichTextTwitterListEntity jsonRichTextTwitterListEntity, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonRichTextTwitterListEntity.a = khe.L();
        }
        else if ("url".equals(s)) {
            jsonRichTextTwitterListEntity.b = khe.T((String)null);
        }
    }
    
    public JsonUrtRichText.JsonRichTextTwitterListEntity parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUrtRichText.JsonRichTextTwitterListEntity jsonRichTextTwitterListEntity, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonRichTextTwitterListEntity, tfe, b);
    }
}
