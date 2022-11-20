// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonActionListItem$JsonActionListLinkData$$JsonObjectMapper extends JsonMapper<JsonActionListItem.JsonActionListLinkData>
{
    public static JsonActionListItem.JsonActionListLinkData _parse(final tge tge) throws IOException {
        final JsonActionListItem.JsonActionListLinkData jsonActionListLinkData = new JsonActionListItem.JsonActionListLinkData();
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
            parseField(jsonActionListLinkData, d, tge);
            tge.l0();
        }
        return jsonActionListLinkData;
    }
    
    public static void _serialize(final JsonActionListItem.JsonActionListLinkData jsonActionListLinkData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("completed", (boolean)jsonActionListLinkData.a);
        if (jsonActionListLinkData.e != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonActionListLinkData.e, afe, true);
        }
        if (jsonActionListLinkData.c != null) {
            LoganSquare.typeConverterFor((Class)mdj.class).serialize((Object)jsonActionListLinkData.c, "icon", true, afe);
        }
        if (jsonActionListLinkData.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonActionListLinkData.b, "link", true, afe);
        }
        if (jsonActionListLinkData.d != null) {
            afe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonActionListLinkData.d, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonActionListItem.JsonActionListLinkData jsonActionListLinkData, final String s, final tge tge) throws IOException {
        if ("completed".equals(s)) {
            Boolean value;
            if (tge.e() == vie.V0) {
                value = null;
            }
            else {
                value = tge.k();
            }
            jsonActionListLinkData.a = value;
        }
        else if ("detail_text".equals(s)) {
            jsonActionListLinkData.e = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("icon".equals(s)) {
            jsonActionListLinkData.c = (mdj)LoganSquare.typeConverterFor((Class)mdj.class).parse(tge);
        }
        else if ("link".equals(s)) {
            jsonActionListLinkData.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("text".equals(s)) {
            jsonActionListLinkData.d = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonActionListItem.JsonActionListLinkData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonActionListItem.JsonActionListLinkData jsonActionListLinkData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonActionListLinkData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonActionListItem.JsonActionListLinkData)o, afe, b);
    }
}
