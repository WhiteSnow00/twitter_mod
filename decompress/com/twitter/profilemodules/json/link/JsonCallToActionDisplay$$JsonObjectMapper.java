// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.link;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCallToActionDisplay$$JsonObjectMapper extends JsonMapper<JsonCallToActionDisplay>
{
    public static final pce JSON_CALL_TO_ACTION_TYPE_CONVERTER;
    
    static {
        JSON_CALL_TO_ACTION_TYPE_CONVERTER = new pce();
    }
    
    public static JsonCallToActionDisplay _parse(final tge tge) throws IOException {
        final JsonCallToActionDisplay jsonCallToActionDisplay = new JsonCallToActionDisplay();
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
            parseField(jsonCallToActionDisplay, d, tge);
            tge.l0();
        }
        return jsonCallToActionDisplay;
    }
    
    public static void _serialize(final JsonCallToActionDisplay jsonCallToActionDisplay, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        jsonCallToActionDisplay.t();
        ((StringBasedTypeConverter)JsonCallToActionDisplay$$JsonObjectMapper.JSON_CALL_TO_ACTION_TYPE_CONVERTER).serialize((Object)jsonCallToActionDisplay.t(), "cta", true, afe);
        afe.t0("localized_cta_display", jsonCallToActionDisplay.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCallToActionDisplay jsonCallToActionDisplay, final String s, final tge tge) throws IOException {
        if ("cta".equals(s)) {
            final d93 a = (d93)((StringBasedTypeConverter)JsonCallToActionDisplay$$JsonObjectMapper.JSON_CALL_TO_ACTION_TYPE_CONVERTER).parse(tge);
            Objects.requireNonNull(jsonCallToActionDisplay);
            czd.f((Object)a, "<set-?>");
            jsonCallToActionDisplay.a = a;
        }
        else if ("localized_cta_display".equals(s)) {
            jsonCallToActionDisplay.b = tge.T((String)null);
        }
    }
    
    public JsonCallToActionDisplay parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCallToActionDisplay jsonCallToActionDisplay, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCallToActionDisplay, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCallToActionDisplay)o, afe, b);
    }
}
