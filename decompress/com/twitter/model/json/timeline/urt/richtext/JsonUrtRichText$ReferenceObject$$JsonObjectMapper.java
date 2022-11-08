// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.richtext;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrtRichText$ReferenceObject$$JsonObjectMapper extends JsonMapper<JsonUrtRichText.ReferenceObject>
{
    public static JsonUrtRichText.ReferenceObject _parse(final khe khe) throws IOException {
        final JsonUrtRichText.ReferenceObject referenceObject = new JsonUrtRichText.ReferenceObject();
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
            parseField(referenceObject, d, khe);
            khe.m0();
        }
        return referenceObject;
    }
    
    public static void _serialize(final JsonUrtRichText.ReferenceObject referenceObject, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (referenceObject.e != null) {
            LoganSquare.typeConverterFor((Class)gn3.class).serialize((Object)referenceObject.e, "cashtag", true, tfe);
        }
        if (referenceObject.d != null) {
            LoganSquare.typeConverterFor((Class)qgc.class).serialize((Object)referenceObject.d, "hashtag", true, tfe);
        }
        if (referenceObject.c != null) {
            tfe.i("mention");
            JsonUrtRichText$JsonRichTextMentionEntity$$JsonObjectMapper._serialize(referenceObject.c, tfe, true);
        }
        if (referenceObject.f != null) {
            tfe.i("twitterList");
            JsonUrtRichText$JsonRichTextTwitterListEntity$$JsonObjectMapper._serialize(referenceObject.f, tfe, true);
        }
        if (referenceObject.a != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)referenceObject.a, "url", true, tfe);
        }
        if (referenceObject.b != null) {
            tfe.i("user");
            JsonUrtRichText$JsonRichTextUserEntity$$JsonObjectMapper._serialize(referenceObject.b, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUrtRichText.ReferenceObject referenceObject, final String s, final khe khe) throws IOException {
        if ("cashtag".equals(s)) {
            referenceObject.e = (gn3)LoganSquare.typeConverterFor((Class)gn3.class).parse(khe);
        }
        else if ("hashtag".equals(s)) {
            referenceObject.d = (qgc)LoganSquare.typeConverterFor((Class)qgc.class).parse(khe);
        }
        else if ("mention".equals(s)) {
            referenceObject.c = JsonUrtRichText$JsonRichTextMentionEntity$$JsonObjectMapper._parse(khe);
        }
        else if ("twitterList".equals(s)) {
            referenceObject.f = JsonUrtRichText$JsonRichTextTwitterListEntity$$JsonObjectMapper._parse(khe);
        }
        else if ("url".equals(s)) {
            referenceObject.a = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
        else if ("user".equals(s)) {
            referenceObject.b = JsonUrtRichText$JsonRichTextUserEntity$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonUrtRichText.ReferenceObject parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUrtRichText.ReferenceObject referenceObject, final tfe tfe, final boolean b) throws IOException {
        _serialize(referenceObject, tfe, b);
    }
}
