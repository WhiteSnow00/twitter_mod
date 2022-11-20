// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTTombstone$$JsonObjectMapper extends JsonMapper<JsonURTTombstone>
{
    public static final JsonURTTombstone$a TOMBSTONE_DISPLAY_TYPE_TYPE_CONVERTER;
    
    static {
        TOMBSTONE_DISPLAY_TYPE_TYPE_CONVERTER = new JsonURTTombstone$a();
    }
    
    public static JsonURTTombstone _parse(final tge tge) throws IOException {
        final JsonURTTombstone jsonURTTombstone = new JsonURTTombstone();
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
            parseField(jsonURTTombstone, d, tge);
            tge.l0();
        }
        return jsonURTTombstone;
    }
    
    public static void _serialize(final JsonURTTombstone jsonURTTombstone, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final String a = jsonURTTombstone.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonURTTombstone$$JsonObjectMapper.TOMBSTONE_DISPLAY_TYPE_TYPE_CONVERTER).serialize((Object)a, "displayType", true, afe);
        }
        if (jsonURTTombstone.b != null) {
            LoganSquare.typeConverterFor((Class)wrv.class).serialize((Object)jsonURTTombstone.b, "tombstoneInfo", true, afe);
        }
        if (jsonURTTombstone.c != null) {
            LoganSquare.typeConverterFor((Class)u6t.class).serialize((Object)jsonURTTombstone.c, "tweet", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonURTTombstone jsonURTTombstone, final String s, final tge tge) throws IOException {
        if ("displayType".equals(s)) {
            jsonURTTombstone.a = (String)((StringBasedTypeConverter)JsonURTTombstone$$JsonObjectMapper.TOMBSTONE_DISPLAY_TYPE_TYPE_CONVERTER).parse(tge);
        }
        else if ("tombstoneInfo".equals(s)) {
            jsonURTTombstone.b = (wrv)LoganSquare.typeConverterFor((Class)wrv.class).parse(tge);
        }
        else if ("tweet".equals(s) || "tombstoneTweet".equals(s)) {
            jsonURTTombstone.c = (u6t)LoganSquare.typeConverterFor((Class)u6t.class).parse(tge);
        }
    }
    
    public JsonURTTombstone parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTTombstone jsonURTTombstone, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTTombstone, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTTombstone)o, afe, b);
    }
}
