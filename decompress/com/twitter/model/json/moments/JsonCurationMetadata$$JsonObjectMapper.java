// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCurationMetadata$$JsonObjectMapper extends JsonMapper<JsonCurationMetadata>
{
    public static JsonCurationMetadata _parse(final khe khe) throws IOException {
        final JsonCurationMetadata jsonCurationMetadata = new JsonCurationMetadata();
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
            parseField(jsonCurationMetadata, d, khe);
            khe.m0();
        }
        return jsonCurationMetadata;
    }
    
    public static void _serialize(final JsonCurationMetadata jsonCurationMetadata, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonCurationMetadata.b != null) {
            LoganSquare.typeConverterFor((Class)ehe.class).serialize((Object)jsonCurationMetadata.b, "has_owner_granted_location_permission", true, tfe);
        }
        tfe.e("is_owned_and_recently_suspended", jsonCurationMetadata.c);
        if (jsonCurationMetadata.a != null) {
            LoganSquare.typeConverterFor((Class)nph.class).serialize((Object)jsonCurationMetadata.a, "visibility_mode", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCurationMetadata jsonCurationMetadata, final String s, final khe khe) throws IOException {
        if ("has_owner_granted_location_permission".equals(s)) {
            jsonCurationMetadata.b = (ehe)LoganSquare.typeConverterFor((Class)ehe.class).parse(khe);
        }
        else if ("is_owned_and_recently_suspended".equals(s)) {
            jsonCurationMetadata.c = khe.k();
        }
        else if ("visibility_mode".equals(s)) {
            jsonCurationMetadata.a = (nph)LoganSquare.typeConverterFor((Class)nph.class).parse(khe);
        }
    }
    
    public JsonCurationMetadata parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCurationMetadata jsonCurationMetadata, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCurationMetadata, tfe, b);
    }
}
