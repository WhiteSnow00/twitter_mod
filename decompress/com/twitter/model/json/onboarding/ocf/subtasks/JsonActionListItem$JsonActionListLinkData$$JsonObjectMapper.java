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
    public static JsonActionListItem.JsonActionListLinkData _parse(final khe khe) throws IOException {
        final JsonActionListItem.JsonActionListLinkData jsonActionListLinkData = new JsonActionListItem.JsonActionListLinkData();
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
            parseField(jsonActionListLinkData, d, khe);
            khe.m0();
        }
        return jsonActionListLinkData;
    }
    
    public static void _serialize(final JsonActionListItem.JsonActionListLinkData jsonActionListLinkData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.e("completed", jsonActionListLinkData.a);
        if (jsonActionListLinkData.e != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonActionListLinkData.e, tfe, true);
        }
        if (jsonActionListLinkData.c != null) {
            LoganSquare.typeConverterFor((Class)hdj.class).serialize((Object)jsonActionListLinkData.c, "icon", true, tfe);
        }
        if (jsonActionListLinkData.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonActionListLinkData.b, "link", true, tfe);
        }
        if (jsonActionListLinkData.d != null) {
            tfe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonActionListLinkData.d, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonActionListItem.JsonActionListLinkData jsonActionListLinkData, final String s, final khe khe) throws IOException {
        if ("completed".equals(s)) {
            Boolean value;
            if (khe.e() == lje.U0) {
                value = null;
            }
            else {
                value = khe.k();
            }
            jsonActionListLinkData.a = value;
        }
        else if ("detail_text".equals(s)) {
            jsonActionListLinkData.e = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("icon".equals(s)) {
            jsonActionListLinkData.c = (hdj)LoganSquare.typeConverterFor((Class)hdj.class).parse(khe);
        }
        else if ("link".equals(s)) {
            jsonActionListLinkData.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonActionListLinkData.d = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonActionListItem.JsonActionListLinkData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonActionListItem.JsonActionListLinkData jsonActionListLinkData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonActionListLinkData, tfe, b);
    }
}
