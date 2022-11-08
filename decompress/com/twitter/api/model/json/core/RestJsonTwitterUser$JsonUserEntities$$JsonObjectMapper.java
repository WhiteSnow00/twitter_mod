// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class RestJsonTwitterUser$JsonUserEntities$$JsonObjectMapper extends JsonMapper<RestJsonTwitterUser.JsonUserEntities>
{
    public static RestJsonTwitterUser.JsonUserEntities _parse(final khe khe) throws IOException {
        final RestJsonTwitterUser.JsonUserEntities jsonUserEntities = new RestJsonTwitterUser.JsonUserEntities();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonUserEntities, d, khe);
            khe.m0();
        }
        return jsonUserEntities;
    }
    
    public static void _serialize(final RestJsonTwitterUser.JsonUserEntities jsonUserEntities, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonUserEntities.a != null) {
            LoganSquare.typeConverterFor((Class)kju.class).serialize((Object)jsonUserEntities.a, "description", true, tfe);
        }
        if (jsonUserEntities.b != null) {
            LoganSquare.typeConverterFor((Class)kju.class).serialize((Object)jsonUserEntities.b, "url", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final RestJsonTwitterUser.JsonUserEntities jsonUserEntities, final String s, final khe khe) throws IOException {
        if ("description".equals(s)) {
            jsonUserEntities.a = (kju)LoganSquare.typeConverterFor((Class)kju.class).parse(khe);
        }
        else if ("url".equals(s)) {
            jsonUserEntities.b = (kju)LoganSquare.typeConverterFor((Class)kju.class).parse(khe);
        }
    }
    
    public RestJsonTwitterUser.JsonUserEntities parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final RestJsonTwitterUser.JsonUserEntities jsonUserEntities, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUserEntities, tfe, b);
    }
}
