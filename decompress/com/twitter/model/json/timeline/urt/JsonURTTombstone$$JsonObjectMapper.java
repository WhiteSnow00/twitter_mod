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
    
    public static JsonURTTombstone _parse(final khe khe) throws IOException {
        final JsonURTTombstone jsonURTTombstone = new JsonURTTombstone();
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
            parseField(jsonURTTombstone, d, khe);
            khe.m0();
        }
        return jsonURTTombstone;
    }
    
    public static void _serialize(final JsonURTTombstone jsonURTTombstone, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final String a = jsonURTTombstone.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonURTTombstone$$JsonObjectMapper.TOMBSTONE_DISPLAY_TYPE_TYPE_CONVERTER).serialize((Object)a, "displayType", true, tfe);
        }
        if (jsonURTTombstone.b != null) {
            LoganSquare.typeConverterFor((Class)brv.class).serialize((Object)jsonURTTombstone.b, "tombstoneInfo", true, tfe);
        }
        if (jsonURTTombstone.c != null) {
            LoganSquare.typeConverterFor((Class)c6t.class).serialize((Object)jsonURTTombstone.c, "tweet", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTTombstone jsonURTTombstone, final String s, final khe khe) throws IOException {
        if ("displayType".equals(s)) {
            jsonURTTombstone.a = (String)((StringBasedTypeConverter)JsonURTTombstone$$JsonObjectMapper.TOMBSTONE_DISPLAY_TYPE_TYPE_CONVERTER).parse(khe);
        }
        else if ("tombstoneInfo".equals(s)) {
            jsonURTTombstone.b = (brv)LoganSquare.typeConverterFor((Class)brv.class).parse(khe);
        }
        else if ("tweet".equals(s) || "tombstoneTweet".equals(s)) {
            jsonURTTombstone.c = (c6t)LoganSquare.typeConverterFor((Class)c6t.class).parse(khe);
        }
    }
    
    public JsonURTTombstone parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTTombstone jsonURTTombstone, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTTombstone, tfe, b);
    }
}
