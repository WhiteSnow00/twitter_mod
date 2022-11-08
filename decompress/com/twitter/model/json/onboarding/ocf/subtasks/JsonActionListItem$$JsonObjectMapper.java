// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonActionListItem$$JsonObjectMapper extends JsonMapper<JsonActionListItem>
{
    public static final lk ACTION_LIST_ITEM_TYPE_TYPE_CONVERTER;
    
    static {
        ACTION_LIST_ITEM_TYPE_TYPE_CONVERTER = new lk();
    }
    
    public static JsonActionListItem _parse(final khe khe) throws IOException {
        final JsonActionListItem jsonActionListItem = new JsonActionListItem();
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
            parseField(jsonActionListItem, d, khe);
            khe.m0();
        }
        return jsonActionListItem;
    }
    
    public static void _serialize(final JsonActionListItem jsonActionListItem, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonActionListItem.b != null) {
            tfe.i("action_data");
            JsonActionListItem$JsonActionData$$JsonObjectMapper._serialize(jsonActionListItem.b, tfe, true);
        }
        final kk a = jsonActionListItem.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonActionListItem$$JsonObjectMapper.ACTION_LIST_ITEM_TYPE_TYPE_CONVERTER).serialize((Object)a, "action_type", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonActionListItem jsonActionListItem, final String s, final khe khe) throws IOException {
        if ("action_data".equals(s)) {
            jsonActionListItem.b = JsonActionListItem$JsonActionData$$JsonObjectMapper._parse(khe);
        }
        else if ("action_type".equals(s)) {
            jsonActionListItem.a = (kk)((StringBasedTypeConverter)JsonActionListItem$$JsonObjectMapper.ACTION_LIST_ITEM_TYPE_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonActionListItem parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonActionListItem jsonActionListItem, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonActionListItem, tfe, b);
    }
}
