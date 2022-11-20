// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.link;

import com.twitter.business.features.linkmodule.model.CallToActionDisplay;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLinkModuleData$$JsonObjectMapper extends JsonMapper<JsonLinkModuleData>
{
    public static JsonLinkModuleData _parse(final tge tge) throws IOException {
        final JsonLinkModuleData jsonLinkModuleData = new JsonLinkModuleData();
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
            parseField(jsonLinkModuleData, d, tge);
            tge.l0();
        }
        return jsonLinkModuleData;
    }
    
    public static void _serialize(final JsonLinkModuleData jsonLinkModuleData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonLinkModuleData.a != null) {
            LoganSquare.typeConverterFor((Class)h6w.class).serialize((Object)jsonLinkModuleData.a, "api_shortened_url", true, afe);
        }
        if (jsonLinkModuleData.b != null) {
            LoganSquare.typeConverterFor((Class)CallToActionDisplay.class).serialize((Object)jsonLinkModuleData.b, "call_to_action_display", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLinkModuleData jsonLinkModuleData, final String s, final tge tge) throws IOException {
        if ("api_shortened_url".equals(s)) {
            jsonLinkModuleData.a = (h6w)LoganSquare.typeConverterFor((Class)h6w.class).parse(tge);
        }
        else if ("call_to_action_display".equals(s)) {
            jsonLinkModuleData.b = (CallToActionDisplay)LoganSquare.typeConverterFor((Class)CallToActionDisplay.class).parse(tge);
        }
    }
    
    public JsonLinkModuleData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLinkModuleData jsonLinkModuleData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLinkModuleData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLinkModuleData)o, afe, b);
    }
}
