// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonActionListItem$JsonActionListTextData$$JsonObjectMapper extends JsonMapper<JsonActionListItem.JsonActionListTextData>
{
    public static JsonActionListItem.JsonActionListTextData _parse(final khe khe) throws IOException {
        final JsonActionListItem.JsonActionListTextData jsonActionListTextData = new JsonActionListItem.JsonActionListTextData();
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
            parseField(jsonActionListTextData, d, khe);
            khe.m0();
        }
        return jsonActionListTextData;
    }
    
    public static void _serialize(final JsonActionListItem.JsonActionListTextData jsonActionListTextData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonActionListTextData.b != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonActionListTextData.b, tfe, true);
        }
        if (jsonActionListTextData.c != null) {
            LoganSquare.typeConverterFor((Class)hdj.class).serialize((Object)jsonActionListTextData.c, "icon", true, tfe);
        }
        if (jsonActionListTextData.a != null) {
            tfe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonActionListTextData.a, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonActionListItem.JsonActionListTextData jsonActionListTextData, final String s, final khe khe) throws IOException {
        if ("detail_text".equals(s)) {
            jsonActionListTextData.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("icon".equals(s)) {
            jsonActionListTextData.c = (hdj)LoganSquare.typeConverterFor((Class)hdj.class).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonActionListTextData.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonActionListItem.JsonActionListTextData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonActionListItem.JsonActionListTextData jsonActionListTextData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonActionListTextData, tfe, b);
    }
}
