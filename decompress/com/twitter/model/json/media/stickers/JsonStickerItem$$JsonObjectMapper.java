// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.AbstractCollection;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonStickerItem$$JsonObjectMapper extends JsonMapper<JsonStickerItem>
{
    public static JsonStickerItem _parse(final khe khe) throws IOException {
        final JsonStickerItem jsonStickerItem = new JsonStickerItem();
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
            parseField(jsonStickerItem, d, khe);
            khe.m0();
        }
        return jsonStickerItem;
    }
    
    public static void _serialize(final JsonStickerItem jsonStickerItem, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonStickerItem.a != null) {
            LoganSquare.typeConverterFor((Class)rfr.class).serialize((Object)jsonStickerItem.a, "sticker", true, tfe);
        }
        final AbstractCollection b2 = jsonStickerItem.b;
        if (b2 != null) {
            tfe.i("variant_stickers");
            tfe.q0();
            for (final rfr rfr : b2) {
                if (rfr != null) {
                    LoganSquare.typeConverterFor((Class)rfr.class).serialize((Object)rfr, "lslocalvariant_stickersElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonStickerItem jsonStickerItem, final String s, final khe khe) throws IOException {
        if ("sticker".equals(s)) {
            jsonStickerItem.a = (rfr)LoganSquare.typeConverterFor((Class)rfr.class).parse(khe);
        }
        else if ("variant_stickers".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final rfr rfr = (rfr)LoganSquare.typeConverterFor((Class)rfr.class).parse(khe);
                    if (rfr != null) {
                        b.add(rfr);
                    }
                }
                jsonStickerItem.b = b;
            }
            else {
                jsonStickerItem.b = null;
            }
        }
    }
    
    public JsonStickerItem parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonStickerItem jsonStickerItem, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonStickerItem, tfe, b);
    }
}
