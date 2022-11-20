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
    public static final zsw VERTICAL_GRID_ITEM_TILE_STYLE_CONVERTER;
    public static final atw VERTICAL_GRID_ITEM_TOPIC_FUNCTIONALITY_TYPE_CONVERTER;
    
    static {
        VERTICAL_GRID_ITEM_TILE_STYLE_CONVERTER = new zsw();
        VERTICAL_GRID_ITEM_TOPIC_FUNCTIONALITY_TYPE_CONVERTER = new atw();
    }
    
    public static JsonVerticalGridItemTopicTile _parse(final tge tge) throws IOException {
        final JsonVerticalGridItemTopicTile jsonVerticalGridItemTopicTile = new JsonVerticalGridItemTopicTile();
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
            parseField(jsonVerticalGridItemTopicTile, d, tge);
            tge.l0();
        }
        return jsonVerticalGridItemTopicTile;
    }
    
    public static void _serialize(final JsonVerticalGridItemTopicTile jsonVerticalGridItemTopicTile, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonVerticalGridItemTopicTile$$JsonObjectMapper.VERTICAL_GRID_ITEM_TOPIC_FUNCTIONALITY_TYPE_CONVERTER).serialize((Object)jsonVerticalGridItemTopicTile.d, "functionalityType", true, afe);
        ((StringBasedTypeConverter)JsonVerticalGridItemTopicTile$$JsonObjectMapper.VERTICAL_GRID_ITEM_TILE_STYLE_CONVERTER).serialize((Object)jsonVerticalGridItemTopicTile.c, "style", true, afe);
        if (jsonVerticalGridItemTopicTile.b != null) {
            LoganSquare.typeConverterFor((Class)jwd.class).serialize((Object)jsonVerticalGridItemTopicTile.b, "topic", true, afe);
        }
        afe.t0("topicId", jsonVerticalGridItemTopicTile.a);
        if (jsonVerticalGridItemTopicTile.e != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonVerticalGridItemTopicTile.e, "url", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonVerticalGridItemTopicTile jsonVerticalGridItemTopicTile, final String s, final tge tge) throws IOException {
        if ("functionalityType".equals(s)) {
            jsonVerticalGridItemTopicTile.d = (int)((StringBasedTypeConverter)JsonVerticalGridItemTopicTile$$JsonObjectMapper.VERTICAL_GRID_ITEM_TOPIC_FUNCTIONALITY_TYPE_CONVERTER).parse(tge);
        }
        else if ("style".equals(s)) {
            jsonVerticalGridItemTopicTile.c = (int)((StringBasedTypeConverter)JsonVerticalGridItemTopicTile$$JsonObjectMapper.VERTICAL_GRID_ITEM_TILE_STYLE_CONVERTER).parse(tge);
        }
        else if ("topic".equals(s)) {
            jsonVerticalGridItemTopicTile.b = (jwd)LoganSquare.typeConverterFor((Class)jwd.class).parse(tge);
        }
        else if ("topicId".equals(s)) {
            jsonVerticalGridItemTopicTile.a = tge.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonVerticalGridItemTopicTile.e = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
    }
    
    public JsonVerticalGridItemTopicTile parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonVerticalGridItemTopicTile jsonVerticalGridItemTopicTile, final afe afe, final boolean b) throws IOException {
        _serialize(jsonVerticalGridItemTopicTile, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonVerticalGridItemTopicTile)o, afe, b);
    }
}
