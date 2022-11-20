// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonActionListItem$JsonActionData$$JsonObjectMapper extends JsonMapper<JsonActionListItem.JsonActionData>
{
    public static JsonActionListItem.JsonActionData _parse(final tge tge) throws IOException {
        final JsonActionListItem.JsonActionData jsonActionData = new JsonActionListItem.JsonActionData();
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
            parseField(jsonActionData, d, tge);
            tge.l0();
        }
        return jsonActionData;
    }
    
    public static void _serialize(final JsonActionListItem.JsonActionData jsonActionData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonActionData.b != null) {
            afe.i("link_data");
            JsonActionListItem$JsonActionListLinkData$$JsonObjectMapper._serialize(jsonActionData.b, afe, true);
        }
        if (jsonActionData.a != null) {
            afe.i("text_data");
            JsonActionListItem$JsonActionListTextData$$JsonObjectMapper._serialize(jsonActionData.a, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonActionListItem.JsonActionData jsonActionData, final String s, final tge tge) throws IOException {
        if ("link_data".equals(s)) {
            jsonActionData.b = JsonActionListItem$JsonActionListLinkData$$JsonObjectMapper._parse(tge);
        }
        else if ("text_data".equals(s)) {
            jsonActionData.a = JsonActionListItem$JsonActionListTextData$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonActionListItem.JsonActionData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonActionListItem.JsonActionData jsonActionData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonActionData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonActionListItem.JsonActionData)o, afe, b);
    }
}
