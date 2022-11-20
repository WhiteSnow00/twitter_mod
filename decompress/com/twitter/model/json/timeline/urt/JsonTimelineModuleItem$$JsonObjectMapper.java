// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineModuleItem$$JsonObjectMapper extends JsonMapper<JsonTimelineModuleItem>
{
    public static JsonTimelineModuleItem _parse(final tge tge) throws IOException {
        final JsonTimelineModuleItem jsonTimelineModuleItem = new JsonTimelineModuleItem();
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
            parseField(jsonTimelineModuleItem, d, tge);
            tge.l0();
        }
        return jsonTimelineModuleItem;
    }
    
    public static void _serialize(final JsonTimelineModuleItem jsonTimelineModuleItem, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("dispensable", jsonTimelineModuleItem.c);
        afe.t0("entryId", jsonTimelineModuleItem.a);
        if (jsonTimelineModuleItem.b != null) {
            afe.i("item");
            JsonTimelineItem$$JsonObjectMapper._serialize(jsonTimelineModuleItem.b, afe, true);
        }
        if (jsonTimelineModuleItem.d != null) {
            LoganSquare.typeConverterFor((Class)amh.class).serialize((Object)jsonTimelineModuleItem.d, "treeDisplay", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineModuleItem jsonTimelineModuleItem, final String s, final tge tge) throws IOException {
        if ("dispensable".equals(s)) {
            jsonTimelineModuleItem.c = tge.k();
        }
        else if ("entryId".equals(s)) {
            jsonTimelineModuleItem.a = tge.T((String)null);
        }
        else if ("item".equals(s)) {
            jsonTimelineModuleItem.b = JsonTimelineItem$$JsonObjectMapper._parse(tge);
        }
        else if ("treeDisplay".equals(s)) {
            jsonTimelineModuleItem.d = (amh)LoganSquare.typeConverterFor((Class)amh.class).parse(tge);
        }
    }
    
    public JsonTimelineModuleItem parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineModuleItem jsonTimelineModuleItem, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineModuleItem, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineModuleItem)o, afe, b);
    }
}
