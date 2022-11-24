// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.Objects;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonImageInfo$$JsonObjectMapper extends JsonMapper<JsonImageInfo>
{
    public static JsonImageInfo _parse(final qhe qhe) throws IOException {
        final JsonImageInfo jsonImageInfo = new JsonImageInfo();
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
            parseField(jsonImageInfo, d, qhe);
            qhe.m0();
        }
        return jsonImageInfo;
    }
    
    public static void _serialize(final JsonImageInfo jsonImageInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonImageInfo.a == null) {
            e0e.m("imageInfo");
            throw null;
        }
        final TypeConverter typeConverter = LoganSquare.typeConverterFor((Class)b8d.class);
        final b8d a = jsonImageInfo.a;
        if (a != null) {
            typeConverter.serialize((Object)a, "image_info", true, yfe);
            if (b) {
                yfe.h();
            }
            return;
        }
        e0e.m("imageInfo");
        throw null;
    }
    
    public static void parseField(final JsonImageInfo jsonImageInfo, final String s, final qhe qhe) throws IOException {
        if ("image_info".equals(s)) {
            final b8d a = (b8d)LoganSquare.typeConverterFor((Class)b8d.class).parse(qhe);
            Objects.requireNonNull(jsonImageInfo);
            e0e.f((Object)a, "<set-?>");
            jsonImageInfo.a = a;
        }
    }
    
    public JsonImageInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonImageInfo jsonImageInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonImageInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonImageInfo)o, yfe, b);
    }
}
