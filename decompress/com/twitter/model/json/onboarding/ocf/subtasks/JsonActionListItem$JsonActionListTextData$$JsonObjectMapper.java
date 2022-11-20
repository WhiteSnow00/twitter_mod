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
    public static JsonActionListItem.JsonActionListTextData _parse(final tge tge) throws IOException {
        final JsonActionListItem.JsonActionListTextData jsonActionListTextData = new JsonActionListItem.JsonActionListTextData();
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
            parseField(jsonActionListTextData, d, tge);
            tge.l0();
        }
        return jsonActionListTextData;
    }
    
    public static void _serialize(final JsonActionListItem.JsonActionListTextData jsonActionListTextData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonActionListTextData.b != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonActionListTextData.b, afe, true);
        }
        if (jsonActionListTextData.c != null) {
            LoganSquare.typeConverterFor((Class)mdj.class).serialize((Object)jsonActionListTextData.c, "icon", true, afe);
        }
        if (jsonActionListTextData.a != null) {
            afe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonActionListTextData.a, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonActionListItem.JsonActionListTextData jsonActionListTextData, final String s, final tge tge) throws IOException {
        if ("detail_text".equals(s)) {
            jsonActionListTextData.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("icon".equals(s)) {
            jsonActionListTextData.c = (mdj)LoganSquare.typeConverterFor((Class)mdj.class).parse(tge);
        }
        else if ("text".equals(s)) {
            jsonActionListTextData.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonActionListItem.JsonActionListTextData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonActionListItem.JsonActionListTextData jsonActionListTextData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonActionListTextData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonActionListItem.JsonActionListTextData)o, afe, b);
    }
}
