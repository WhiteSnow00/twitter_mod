// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVerticalGridItem$$JsonObjectMapper extends JsonMapper<JsonVerticalGridItem>
{
    public static final j9t TIMELINE_VERTICAL_GRID_ITEM_CONTENT_UNION_CONVERTER;
    
    static {
        TIMELINE_VERTICAL_GRID_ITEM_CONTENT_UNION_CONVERTER = new j9t();
    }
    
    public static JsonVerticalGridItem _parse(final tge tge) throws IOException {
        final JsonVerticalGridItem jsonVerticalGridItem = new JsonVerticalGridItem();
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
            parseField(jsonVerticalGridItem, d, tge);
            tge.l0();
        }
        return jsonVerticalGridItem;
    }
    
    public static void _serialize(final JsonVerticalGridItem jsonVerticalGridItem, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final vsw a = jsonVerticalGridItem.a;
        if (a == null) {
            if (b) {
                afe.h();
            }
            return;
        }
        JsonVerticalGridItem$$JsonObjectMapper.TIMELINE_VERTICAL_GRID_ITEM_CONTENT_UNION_CONVERTER.serialize(a, "content", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonVerticalGridItem jsonVerticalGridItem, final String s, final tge tge) throws IOException {
        if ("content".equals(s)) {
            jsonVerticalGridItem.a = JsonVerticalGridItem$$JsonObjectMapper.TIMELINE_VERTICAL_GRID_ITEM_CONTENT_UNION_CONVERTER.parse(tge);
        }
    }
    
    public JsonVerticalGridItem parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonVerticalGridItem jsonVerticalGridItem, final afe afe, final boolean b) throws IOException {
        _serialize(jsonVerticalGridItem, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonVerticalGridItem)o, afe, b);
    }
}
