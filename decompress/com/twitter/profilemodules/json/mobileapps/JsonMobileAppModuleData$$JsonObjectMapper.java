// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.mobileapps;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMobileAppModuleData$$JsonObjectMapper extends JsonMapper<JsonMobileAppModuleData>
{
    public static JsonMobileAppModuleData _parse(final tge tge) throws IOException {
        final JsonMobileAppModuleData jsonMobileAppModuleData = new JsonMobileAppModuleData();
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
            parseField(jsonMobileAppModuleData, d, tge);
            tge.l0();
        }
        return jsonMobileAppModuleData;
    }
    
    public static void _serialize(final JsonMobileAppModuleData jsonMobileAppModuleData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        jsonMobileAppModuleData.t();
        LoganSquare.typeConverterFor((Class)sch.class).serialize((Object)jsonMobileAppModuleData.t(), "app_metadata_by_store", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonMobileAppModuleData jsonMobileAppModuleData, final String s, final tge tge) throws IOException {
        if ("app_metadata_by_store".equals(s)) {
            final sch a = (sch)LoganSquare.typeConverterFor((Class)sch.class).parse(tge);
            Objects.requireNonNull(jsonMobileAppModuleData);
            czd.f((Object)a, "<set-?>");
            jsonMobileAppModuleData.a = a;
        }
    }
    
    public JsonMobileAppModuleData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMobileAppModuleData jsonMobileAppModuleData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMobileAppModuleData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMobileAppModuleData)o, afe, b);
    }
}
