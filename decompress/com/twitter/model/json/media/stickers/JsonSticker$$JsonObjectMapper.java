// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import com.bluelinelabs.logansquare.typeconverters.DateTypeConverter;
import java.util.Date;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSticker$$JsonObjectMapper extends JsonMapper<JsonSticker>
{
    public static final xie JSON_STICKER_DATE_TYPE_CONVERTER;
    
    static {
        JSON_STICKER_DATE_TYPE_CONVERTER = new xie();
    }
    
    public static JsonSticker _parse(final khe khe) throws IOException {
        final JsonSticker jsonSticker = new JsonSticker();
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
            parseField(jsonSticker, d, khe);
            khe.m0();
        }
        return jsonSticker;
    }
    
    public static void _serialize(final JsonSticker jsonSticker, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("annotation_id", jsonSticker.a);
        tfe.W("author_id", jsonSticker.f);
        tfe.u0("background_color", jsonSticker.d);
        tfe.u0("display_name", jsonSticker.b);
        tfe.u0("dominant_color", jsonSticker.c);
        final Date m = jsonSticker.m;
        if (m != null) {
            ((DateTypeConverter)JsonSticker$$JsonObjectMapper.JSON_STICKER_DATE_TYPE_CONVERTER).serialize(m, "end_time", true, tfe);
        }
        tfe.W("group_annotation_id", jsonSticker.e);
        tfe.W("id", jsonSticker.g);
        if (jsonSticker.i != null) {
            LoganSquare.typeConverterFor((Class)chr.class).serialize((Object)jsonSticker.i, "images", true, tfe);
        }
        final Date l = jsonSticker.l;
        if (l != null) {
            ((DateTypeConverter)JsonSticker$$JsonObjectMapper.JSON_STICKER_DATE_TYPE_CONVERTER).serialize(l, "start_time", true, tfe);
        }
        tfe.W("sticker_set_annotation_id", jsonSticker.j);
        tfe.u0("type", jsonSticker.k);
        tfe.u0("variant_name", jsonSticker.h);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSticker jsonSticker, final String s, final khe khe) throws IOException {
        if ("annotation_id".equals(s)) {
            jsonSticker.a = khe.L();
        }
        else if ("author_id".equals(s)) {
            jsonSticker.f = khe.L();
        }
        else if ("background_color".equals(s)) {
            jsonSticker.d = khe.T((String)null);
        }
        else if ("display_name".equals(s)) {
            jsonSticker.b = khe.T((String)null);
        }
        else if ("dominant_color".equals(s)) {
            jsonSticker.c = khe.T((String)null);
        }
        else if ("end_time".equals(s)) {
            jsonSticker.m = ((DateTypeConverter)JsonSticker$$JsonObjectMapper.JSON_STICKER_DATE_TYPE_CONVERTER).parse(khe);
        }
        else if ("group_annotation_id".equals(s)) {
            jsonSticker.e = khe.L();
        }
        else if ("id".equals(s)) {
            jsonSticker.g = khe.L();
        }
        else if ("images".equals(s)) {
            jsonSticker.i = (chr)LoganSquare.typeConverterFor((Class)chr.class).parse(khe);
        }
        else if ("start_time".equals(s)) {
            jsonSticker.l = ((DateTypeConverter)JsonSticker$$JsonObjectMapper.JSON_STICKER_DATE_TYPE_CONVERTER).parse(khe);
        }
        else if ("sticker_set_annotation_id".equals(s)) {
            jsonSticker.j = khe.L();
        }
        else if ("type".equals(s)) {
            jsonSticker.k = khe.T((String)null);
        }
        else if ("variant_name".equals(s)) {
            jsonSticker.h = khe.T((String)null);
        }
    }
    
    public JsonSticker parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSticker jsonSticker, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSticker, tfe, b);
    }
}
