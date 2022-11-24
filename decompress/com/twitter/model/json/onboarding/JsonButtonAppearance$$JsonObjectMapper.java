// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonButtonAppearance$$JsonObjectMapper extends JsonMapper<JsonButtonAppearance>
{
    public static final q53 BUTTON_PREFERRED_SIZE_TYPE_CONVERTER;
    public static final a63 BUTTON_STYLE_TYPE_CONVERTER;
    
    static {
        BUTTON_PREFERRED_SIZE_TYPE_CONVERTER = new q53();
        BUTTON_STYLE_TYPE_CONVERTER = new a63();
    }
    
    public static JsonButtonAppearance _parse(final qhe qhe) throws IOException {
        final JsonButtonAppearance jsonButtonAppearance = new JsonButtonAppearance();
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
            parseField(jsonButtonAppearance, d, qhe);
            qhe.m0();
        }
        return jsonButtonAppearance;
    }
    
    public static void _serialize(final JsonButtonAppearance jsonButtonAppearance, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonButtonAppearance.d != null) {
            LoganSquare.typeConverterFor((Class)zdj.class).serialize((Object)jsonButtonAppearance.d, "icon", true, yfe);
        }
        final t53 b2 = jsonButtonAppearance.b;
        if (b2 != null) {
            ((StringBasedTypeConverter)JsonButtonAppearance$$JsonObjectMapper.BUTTON_PREFERRED_SIZE_TYPE_CONVERTER).serialize((Object)b2, "preferred_size", true, yfe);
        }
        if (jsonButtonAppearance.c != null) {
            LoganSquare.typeConverterFor((Class)rkp.class).serialize((Object)jsonButtonAppearance.c, "separator", true, yfe);
        }
        ((StringBasedTypeConverter)JsonButtonAppearance$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).serialize((Object)jsonButtonAppearance.a, "style", true, yfe);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonButtonAppearance jsonButtonAppearance, final String s, final qhe qhe) throws IOException {
        if ("icon".equals(s)) {
            jsonButtonAppearance.d = (zdj)LoganSquare.typeConverterFor((Class)zdj.class).parse(qhe);
        }
        else if ("preferred_size".equals(s)) {
            final t53 b = (t53)((StringBasedTypeConverter)JsonButtonAppearance$$JsonObjectMapper.BUTTON_PREFERRED_SIZE_TYPE_CONVERTER).parse(qhe);
            Objects.requireNonNull(jsonButtonAppearance);
            e0e.f((Object)b, "<set-?>");
            jsonButtonAppearance.b = b;
        }
        else if ("separator".equals(s)) {
            jsonButtonAppearance.c = (rkp)LoganSquare.typeConverterFor((Class)rkp.class).parse(qhe);
        }
        else if ("style".equals(s)) {
            jsonButtonAppearance.a = (int)((StringBasedTypeConverter)JsonButtonAppearance$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonButtonAppearance parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonButtonAppearance jsonButtonAppearance, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonButtonAppearance, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonButtonAppearance)o, yfe, b);
    }
}
