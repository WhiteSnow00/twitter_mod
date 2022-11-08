// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonConversationControl$$JsonObjectMapper extends JsonMapper<JsonConversationControl>
{
    public static final a JSON_CONVERSATION_CONTROL_POLICY_TYPE_CONVERTER;
    
    static {
        JSON_CONVERSATION_CONTROL_POLICY_TYPE_CONVERTER = new a();
    }
    
    public static JsonConversationControl _parse(final khe khe) throws IOException {
        final JsonConversationControl jsonConversationControl = new JsonConversationControl();
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
            parseField(jsonConversationControl, d, khe);
            khe.m0();
        }
        return jsonConversationControl;
    }
    
    public static void _serialize(final JsonConversationControl jsonConversationControl, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonConversationControl.b != null) {
            tfe.i("conversation_owner");
            GraphqlJsonTwitterUser$$JsonObjectMapper._serialize(jsonConversationControl.b, tfe, true);
        }
        final JsonConversationControl.JsonConversationControl$a a = jsonConversationControl.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonConversationControl$$JsonObjectMapper.JSON_CONVERSATION_CONTROL_POLICY_TYPE_CONVERTER).serialize((Object)a, "policy", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonConversationControl jsonConversationControl, final String s, final khe khe) throws IOException {
        if ("conversation_owner".equals(s)) {
            jsonConversationControl.b = GraphqlJsonTwitterUser$$JsonObjectMapper._parse(khe);
        }
        else if ("policy".equals(s)) {
            jsonConversationControl.a = (JsonConversationControl$a)((StringBasedTypeConverter)JsonConversationControl$$JsonObjectMapper.JSON_CONVERSATION_CONTROL_POLICY_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonConversationControl parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonConversationControl jsonConversationControl, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonConversationControl, tfe, b);
    }
}
