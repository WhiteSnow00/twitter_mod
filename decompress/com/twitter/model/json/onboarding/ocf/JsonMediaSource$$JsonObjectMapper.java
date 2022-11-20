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
    public static final t0h MEDIA_STYLE_TYPE_CONVERTER;
    
    static {
        MEDIA_STYLE_TYPE_CONVERTER = new t0h();
    }
    
    public static JsonMediaSource _parse(final tge tge) throws IOException {
        final JsonMediaSource jsonMediaSource = new JsonMediaSource();
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
            parseField(jsonMediaSource, d, tge);
            tge.l0();
        }
        return jsonMediaSource;
    }
    
    public static void _serialize(final JsonMediaSource jsonMediaSource, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonMediaSource.a != null) {
            LoganSquare.typeConverterFor((Class)vsr.class).serialize((Object)jsonMediaSource.a, "media_data_reference", true, afe);
        }
        ((StringBasedTypeConverter)JsonMediaSource$$JsonObjectMapper.MEDIA_STYLE_TYPE_CONVERTER).serialize((Object)jsonMediaSource.b, "style", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonMediaSource jsonMediaSource, final String s, final tge tge) throws IOException {
        if ("media_data_reference".equals(s)) {
            jsonMediaSource.a = (vsr)LoganSquare.typeConverterFor((Class)vsr.class).parse(tge);
        }
        else if ("style".equals(s)) {
            jsonMediaSource.b = (int)((StringBasedTypeConverter)JsonMediaSource$$JsonObjectMapper.MEDIA_STYLE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonMediaSource parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMediaSource jsonMediaSource, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMediaSource, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMediaSource)o, afe, b);
    }
}
