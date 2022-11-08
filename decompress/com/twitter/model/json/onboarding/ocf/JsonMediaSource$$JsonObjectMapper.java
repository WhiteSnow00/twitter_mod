// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaSource$$JsonObjectMapper extends JsonMapper<JsonMediaSource>
{
    public static final r0h MEDIA_STYLE_TYPE_CONVERTER;
    
    static {
        MEDIA_STYLE_TYPE_CONVERTER = new r0h();
    }
    
    public static JsonMediaSource _parse(final khe khe) throws IOException {
        final JsonMediaSource jsonMediaSource = new JsonMediaSource();
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
            parseField(jsonMediaSource, d, khe);
            khe.m0();
        }
        return jsonMediaSource;
    }
    
    public static void _serialize(final JsonMediaSource jsonMediaSource, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonMediaSource.a != null) {
            LoganSquare.typeConverterFor((Class)dsr.class).serialize((Object)jsonMediaSource.a, "media_data_reference", true, tfe);
        }
        ((StringBasedTypeConverter)JsonMediaSource$$JsonObjectMapper.MEDIA_STYLE_TYPE_CONVERTER).serialize((Object)jsonMediaSource.b, "style", true, tfe);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonMediaSource jsonMediaSource, final String s, final khe khe) throws IOException {
        if ("media_data_reference".equals(s)) {
            jsonMediaSource.a = (dsr)LoganSquare.typeConverterFor((Class)dsr.class).parse(khe);
        }
        else if ("style".equals(s)) {
            jsonMediaSource.b = (int)((StringBasedTypeConverter)JsonMediaSource$$JsonObjectMapper.MEDIA_STYLE_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonMediaSource parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonMediaSource jsonMediaSource, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonMediaSource, tfe, b);
    }
}
