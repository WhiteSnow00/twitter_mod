// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVerticalGridItemTopicTile$$JsonObjectMapper extends JsonMapper<JsonVerticalGridItemTopicTile>
{
    public static final gsw VERTICAL_GRID_ITEM_TILE_STYLE_CONVERTER;
    public static final hsw VERTICAL_GRID_ITEM_TOPIC_FUNCTIONALITY_TYPE_CONVERTER;
    
    static {
        VERTICAL_GRID_ITEM_TILE_STYLE_CONVERTER = new gsw();
        VERTICAL_GRID_ITEM_TOPIC_FUNCTIONALITY_TYPE_CONVERTER = new hsw();
    }
    
    public static JsonVerticalGridItemTopicTile _parse(final khe khe) throws IOException {
        final JsonVerticalGridItemTopicTile jsonVerticalGridItemTopicTile = new JsonVerticalGridItemTopicTile();
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
            parseField(jsonVerticalGridItemTopicTile, d, khe);
            khe.m0();
        }
        return jsonVerticalGridItemTopicTile;
    }
    
    public static void _serialize(final JsonVerticalGridItemTopicTile jsonVerticalGridItemTopicTile, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        ((StringBasedTypeConverter)JsonVerticalGridItemTopicTile$$JsonObjectMapper.VERTICAL_GRID_ITEM_TOPIC_FUNCTIONALITY_TYPE_CONVERTER).serialize((Object)jsonVerticalGridItemTopicTile.d, "functionalityType", true, tfe);
        ((StringBasedTypeConverter)JsonVerticalGridItemTopicTile$$JsonObjectMapper.VERTICAL_GRID_ITEM_TILE_STYLE_CONVERTER).serialize((Object)jsonVerticalGridItemTopicTile.c, "style", true, tfe);
        if (jsonVerticalGridItemTopicTile.b != null) {
            LoganSquare.typeConverterFor((Class)gxd.class).serialize((Object)jsonVerticalGridItemTopicTile.b, "topic", true, tfe);
        }
        tfe.u0("topicId", jsonVerticalGridItemTopicTile.a);
        if (jsonVerticalGridItemTopicTile.e != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonVerticalGridItemTopicTile.e, "url", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonVerticalGridItemTopicTile jsonVerticalGridItemTopicTile, final String s, final khe khe) throws IOException {
        if ("functionalityType".equals(s)) {
            jsonVerticalGridItemTopicTile.d = (int)((StringBasedTypeConverter)JsonVerticalGridItemTopicTile$$JsonObjectMapper.VERTICAL_GRID_ITEM_TOPIC_FUNCTIONALITY_TYPE_CONVERTER).parse(khe);
        }
        else if ("style".equals(s)) {
            jsonVerticalGridItemTopicTile.c = (int)((StringBasedTypeConverter)JsonVerticalGridItemTopicTile$$JsonObjectMapper.VERTICAL_GRID_ITEM_TILE_STYLE_CONVERTER).parse(khe);
        }
        else if ("topic".equals(s)) {
            jsonVerticalGridItemTopicTile.b = (gxd)LoganSquare.typeConverterFor((Class)gxd.class).parse(khe);
        }
        else if ("topicId".equals(s)) {
            jsonVerticalGridItemTopicTile.a = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonVerticalGridItemTopicTile.e = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
    }
    
    public JsonVerticalGridItemTopicTile parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonVerticalGridItemTopicTile jsonVerticalGridItemTopicTile, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonVerticalGridItemTopicTile, tfe, b);
    }
}
