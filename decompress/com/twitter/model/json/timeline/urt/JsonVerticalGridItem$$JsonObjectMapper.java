// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVerticalGridItem$$JsonObjectMapper extends JsonMapper<JsonVerticalGridItem>
{
    public static final t8t TIMELINE_VERTICAL_GRID_ITEM_CONTENT_UNION_CONVERTER;
    
    static {
        TIMELINE_VERTICAL_GRID_ITEM_CONTENT_UNION_CONVERTER = new t8t();
    }
    
    public static JsonVerticalGridItem _parse(final khe khe) throws IOException {
        final JsonVerticalGridItem jsonVerticalGridItem = new JsonVerticalGridItem();
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
            parseField(jsonVerticalGridItem, d, khe);
            khe.m0();
        }
        return jsonVerticalGridItem;
    }
    
    public static void _serialize(final JsonVerticalGridItem jsonVerticalGridItem, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final csw a = jsonVerticalGridItem.a;
        if (a == null) {
            if (b) {
                tfe.h();
            }
            return;
        }
        ((twj<csw>)JsonVerticalGridItem$$JsonObjectMapper.TIMELINE_VERTICAL_GRID_ITEM_CONTENT_UNION_CONVERTER).serialize(a, "content", true, tfe);
        throw null;
    }
    
    public static void parseField(final JsonVerticalGridItem jsonVerticalGridItem, final String s, final khe khe) throws IOException {
        if ("content".equals(s)) {
            jsonVerticalGridItem.a = (csw)((age)JsonVerticalGridItem$$JsonObjectMapper.TIMELINE_VERTICAL_GRID_ITEM_CONTENT_UNION_CONVERTER).parse(khe);
        }
    }
    
    public JsonVerticalGridItem parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonVerticalGridItem jsonVerticalGridItem, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonVerticalGridItem, tfe, b);
    }
}
