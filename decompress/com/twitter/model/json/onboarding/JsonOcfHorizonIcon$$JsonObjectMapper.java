// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfHorizonIcon$$JsonObjectMapper extends JsonMapper<JsonOcfHorizonIcon>
{
    public static final ndj OCF_HORIZON_ICON_TYPE_CONVERTER;
    
    static {
        OCF_HORIZON_ICON_TYPE_CONVERTER = new ndj();
    }
    
    public static JsonOcfHorizonIcon _parse(final tge tge) throws IOException {
        final JsonOcfHorizonIcon jsonOcfHorizonIcon = new JsonOcfHorizonIcon();
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
            parseField(jsonOcfHorizonIcon, d, tge);
            tge.l0();
        }
        return jsonOcfHorizonIcon;
    }
    
    public static void _serialize(final JsonOcfHorizonIcon jsonOcfHorizonIcon, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final mdj a = jsonOcfHorizonIcon.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonOcfHorizonIcon$$JsonObjectMapper.OCF_HORIZON_ICON_TYPE_CONVERTER).serialize((Object)a, "icon", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfHorizonIcon jsonOcfHorizonIcon, final String s, final tge tge) throws IOException {
        if ("icon".equals(s)) {
            jsonOcfHorizonIcon.a = (mdj)((StringBasedTypeConverter)JsonOcfHorizonIcon$$JsonObjectMapper.OCF_HORIZON_ICON_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonOcfHorizonIcon parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfHorizonIcon jsonOcfHorizonIcon, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfHorizonIcon, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfHorizonIcon)o, afe, b);
    }
}
