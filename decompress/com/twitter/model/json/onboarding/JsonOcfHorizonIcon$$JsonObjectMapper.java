// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfHorizonIcon$$JsonObjectMapper extends JsonMapper<JsonOcfHorizonIcon>
{
    public static final aej OCF_HORIZON_ICON_TYPE_CONVERTER;
    
    static {
        OCF_HORIZON_ICON_TYPE_CONVERTER = new aej();
    }
    
    public static JsonOcfHorizonIcon _parse(final qhe qhe) throws IOException {
        final JsonOcfHorizonIcon jsonOcfHorizonIcon = new JsonOcfHorizonIcon();
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
            parseField(jsonOcfHorizonIcon, d, qhe);
            qhe.m0();
        }
        return jsonOcfHorizonIcon;
    }
    
    public static void _serialize(final JsonOcfHorizonIcon jsonOcfHorizonIcon, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final zdj a = jsonOcfHorizonIcon.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonOcfHorizonIcon$$JsonObjectMapper.OCF_HORIZON_ICON_TYPE_CONVERTER).serialize((Object)a, "icon", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfHorizonIcon jsonOcfHorizonIcon, final String s, final qhe qhe) throws IOException {
        if ("icon".equals(s)) {
            jsonOcfHorizonIcon.a = (zdj)((StringBasedTypeConverter)JsonOcfHorizonIcon$$JsonObjectMapper.OCF_HORIZON_ICON_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonOcfHorizonIcon parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfHorizonIcon jsonOcfHorizonIcon, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfHorizonIcon, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfHorizonIcon)o, yfe, b);
    }
}
