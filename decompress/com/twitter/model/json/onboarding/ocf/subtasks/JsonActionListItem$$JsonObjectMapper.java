// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonActionListItem$$JsonObjectMapper extends JsonMapper<JsonActionListItem>
{
    public static final ik ACTION_LIST_ITEM_TYPE_TYPE_CONVERTER;
    
    static {
        ACTION_LIST_ITEM_TYPE_TYPE_CONVERTER = new ik();
    }
    
    public static JsonActionListItem _parse(final tge tge) throws IOException {
        final JsonActionListItem jsonActionListItem = new JsonActionListItem();
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
            parseField(jsonActionListItem, d, tge);
            tge.l0();
        }
        return jsonActionListItem;
    }
    
    public static void _serialize(final JsonActionListItem jsonActionListItem, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonActionListItem.b != null) {
            afe.i("action_data");
            JsonActionListItem$JsonActionData$$JsonObjectMapper._serialize(jsonActionListItem.b, afe, true);
        }
        final hk a = jsonActionListItem.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonActionListItem$$JsonObjectMapper.ACTION_LIST_ITEM_TYPE_TYPE_CONVERTER).serialize((Object)a, "action_type", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonActionListItem jsonActionListItem, final String s, final tge tge) throws IOException {
        if ("action_data".equals(s)) {
            jsonActionListItem.b = JsonActionListItem$JsonActionData$$JsonObjectMapper._parse(tge);
        }
        else if ("action_type".equals(s)) {
            jsonActionListItem.a = (hk)((StringBasedTypeConverter)JsonActionListItem$$JsonObjectMapper.ACTION_LIST_ITEM_TYPE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonActionListItem parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonActionListItem jsonActionListItem, final afe afe, final boolean b) throws IOException {
        _serialize(jsonActionListItem, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonActionListItem)o, afe, b);
    }
}
