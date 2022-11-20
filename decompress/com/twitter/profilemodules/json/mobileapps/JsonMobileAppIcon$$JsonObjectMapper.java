// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.mobileapps;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMobileAppIcon$$JsonObjectMapper extends JsonMapper<JsonMobileAppIcon>
{
    public static JsonMobileAppIcon _parse(final tge tge) throws IOException {
        final JsonMobileAppIcon jsonMobileAppIcon = new JsonMobileAppIcon();
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
            parseField(jsonMobileAppIcon, d, tge);
            tge.l0();
        }
        return jsonMobileAppIcon;
    }
    
    public static void _serialize(final JsonMobileAppIcon jsonMobileAppIcon, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("media_id", jsonMobileAppIcon.a);
        if (jsonMobileAppIcon.b != null) {
            LoganSquare.typeConverterFor((Class)of0.class).serialize((Object)jsonMobileAppIcon.b, "media_info", true, afe);
        }
        afe.t0("media_key", jsonMobileAppIcon.c);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonMobileAppIcon jsonMobileAppIcon, final String s, final tge tge) throws IOException {
        if ("media_id".equals(s)) {
            jsonMobileAppIcon.a = tge.T((String)null);
        }
        else if ("media_info".equals(s)) {
            jsonMobileAppIcon.b = (of0)LoganSquare.typeConverterFor((Class)of0.class).parse(tge);
        }
        else if ("media_key".equals(s)) {
            jsonMobileAppIcon.c = tge.T((String)null);
        }
    }
    
    public JsonMobileAppIcon parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMobileAppIcon jsonMobileAppIcon, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMobileAppIcon, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMobileAppIcon)o, afe, b);
    }
}
