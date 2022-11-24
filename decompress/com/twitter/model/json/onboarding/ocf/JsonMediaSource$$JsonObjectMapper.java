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
    public static final l1h MEDIA_STYLE_TYPE_CONVERTER;
    
    static {
        MEDIA_STYLE_TYPE_CONVERTER = new l1h();
    }
    
    public static JsonMediaSource _parse(final qhe qhe) throws IOException {
        final JsonMediaSource jsonMediaSource = new JsonMediaSource();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonMediaSource, d, qhe);
            qhe.m0();
        }
        return jsonMediaSource;
    }
    
    public static void _serialize(final JsonMediaSource jsonMediaSource, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonMediaSource.a != null) {
            LoganSquare.typeConverterFor((Class)ttr.class).serialize((Object)jsonMediaSource.a, "media_data_reference", true, yfe);
        }
        ((StringBasedTypeConverter)JsonMediaSource$$JsonObjectMapper.MEDIA_STYLE_TYPE_CONVERTER).serialize((Object)jsonMediaSource.b, "style", true, yfe);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMediaSource jsonMediaSource, final String s, final qhe qhe) throws IOException {
        if ("media_data_reference".equals(s)) {
            jsonMediaSource.a = (ttr)LoganSquare.typeConverterFor((Class)ttr.class).parse(qhe);
        }
        else if ("style".equals(s)) {
            jsonMediaSource.b = (int)((StringBasedTypeConverter)JsonMediaSource$$JsonObjectMapper.MEDIA_STYLE_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonMediaSource parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMediaSource jsonMediaSource, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMediaSource, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMediaSource)o, yfe, b);
    }
}
