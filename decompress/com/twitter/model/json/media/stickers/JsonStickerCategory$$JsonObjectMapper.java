// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import com.bluelinelabs.logansquare.typeconverters.DateTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Date;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonStickerCategory$$JsonObjectMapper extends JsonMapper<JsonStickerCategory>
{
    public static final xie JSON_STICKER_DATE_TYPE_CONVERTER;
    
    static {
        JSON_STICKER_DATE_TYPE_CONVERTER = new xie();
    }
    
    public static JsonStickerCategory _parse(final khe khe) throws IOException {
        final JsonStickerCategory jsonStickerCategory = new JsonStickerCategory();
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
            parseField(jsonStickerCategory, d, khe);
            khe.m0();
        }
        return jsonStickerCategory;
    }
    
    public static void _serialize(final JsonStickerCategory jsonStickerCategory, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("annotation_id", jsonStickerCategory.a);
        tfe.u0("display_name", jsonStickerCategory.b);
        final Date i = jsonStickerCategory.i;
        if (i != null) {
            ((DateTypeConverter)JsonStickerCategory$$JsonObjectMapper.JSON_STICKER_DATE_TYPE_CONVERTER).serialize(i, "end_time", true, tfe);
        }
        if (jsonStickerCategory.c != null) {
            LoganSquare.typeConverterFor((Class)ggr.class).serialize((Object)jsonStickerCategory.c, "icon_image", true, tfe);
        }
        tfe.W("id", jsonStickerCategory.d);
        final ArrayList e = jsonStickerCategory.e;
        if (e != null) {
            final Iterator g = q1a.g(tfe, "items", e);
            while (g.hasNext()) {
                final khr khr = g.next();
                if (khr != null) {
                    LoganSquare.typeConverterFor((Class)khr.class).serialize((Object)khr, "lslocalitemsElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("promoted_by", jsonStickerCategory.g);
        final Date h = jsonStickerCategory.h;
        if (h != null) {
            ((DateTypeConverter)JsonStickerCategory$$JsonObjectMapper.JSON_STICKER_DATE_TYPE_CONVERTER).serialize(h, "start_time", true, tfe);
        }
        tfe.u0("type", jsonStickerCategory.f);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonStickerCategory jsonStickerCategory, final String s, final khe khe) throws IOException {
        if ("annotation_id".equals(s)) {
            jsonStickerCategory.a = khe.L();
        }
        else if ("display_name".equals(s)) {
            jsonStickerCategory.b = khe.T((String)null);
        }
        else if ("end_time".equals(s)) {
            jsonStickerCategory.i = ((DateTypeConverter)JsonStickerCategory$$JsonObjectMapper.JSON_STICKER_DATE_TYPE_CONVERTER).parse(khe);
        }
        else if ("icon_image".equals(s)) {
            jsonStickerCategory.c = (ggr)LoganSquare.typeConverterFor((Class)ggr.class).parse(khe);
        }
        else if ("id".equals(s)) {
            jsonStickerCategory.d = khe.L();
        }
        else if ("items".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList e = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final khr khr = (khr)LoganSquare.typeConverterFor((Class)khr.class).parse(khe);
                    if (khr != null) {
                        e.add(khr);
                    }
                }
                jsonStickerCategory.e = e;
            }
            else {
                jsonStickerCategory.e = null;
            }
        }
        else if ("promoted_by".equals(s)) {
            jsonStickerCategory.g = khe.T((String)null);
        }
        else if ("start_time".equals(s)) {
            jsonStickerCategory.h = ((DateTypeConverter)JsonStickerCategory$$JsonObjectMapper.JSON_STICKER_DATE_TYPE_CONVERTER).parse(khe);
        }
        else if ("type".equals(s)) {
            jsonStickerCategory.f = khe.T((String)null);
        }
    }
    
    public JsonStickerCategory parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonStickerCategory jsonStickerCategory, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonStickerCategory, tfe, b);
    }
}
