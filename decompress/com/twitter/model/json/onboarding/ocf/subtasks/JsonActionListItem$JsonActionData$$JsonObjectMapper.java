// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonActionListItem$JsonActionData$$JsonObjectMapper extends JsonMapper<JsonActionListItem.JsonActionData>
{
    public static JsonActionListItem.JsonActionData _parse(final khe khe) throws IOException {
        final JsonActionListItem.JsonActionData jsonActionData = new JsonActionListItem.JsonActionData();
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
            parseField(jsonActionData, d, khe);
            khe.m0();
        }
        return jsonActionData;
    }
    
    public static void _serialize(final JsonActionListItem.JsonActionData jsonActionData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonActionData.b != null) {
            tfe.i("link_data");
            JsonActionListItem$JsonActionListLinkData$$JsonObjectMapper._serialize(jsonActionData.b, tfe, true);
        }
        if (jsonActionData.a != null) {
            tfe.i("text_data");
            JsonActionListItem$JsonActionListTextData$$JsonObjectMapper._serialize(jsonActionData.a, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonActionListItem.JsonActionData jsonActionData, final String s, final khe khe) throws IOException {
        if ("link_data".equals(s)) {
            jsonActionData.b = JsonActionListItem$JsonActionListLinkData$$JsonObjectMapper._parse(khe);
        }
        else if ("text_data".equals(s)) {
            jsonActionData.a = JsonActionListItem$JsonActionListTextData$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonActionListItem.JsonActionData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonActionListItem.JsonActionData jsonActionData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonActionData, tfe, b);
    }
}
