// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.promoted;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDynamicAdPromotedMetadata$$JsonObjectMapper extends JsonMapper<JsonDynamicAdPromotedMetadata>
{
    public static JsonDynamicAdPromotedMetadata _parse(final khe khe) throws IOException {
        final JsonDynamicAdPromotedMetadata jsonDynamicAdPromotedMetadata = new JsonDynamicAdPromotedMetadata();
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
            parseField(jsonDynamicAdPromotedMetadata, d, khe);
            khe.m0();
        }
        return jsonDynamicAdPromotedMetadata;
    }
    
    public static void _serialize(final JsonDynamicAdPromotedMetadata jsonDynamicAdPromotedMetadata, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("disclosureType", jsonDynamicAdPromotedMetadata.b);
        tfe.u0("impressionId", jsonDynamicAdPromotedMetadata.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonDynamicAdPromotedMetadata jsonDynamicAdPromotedMetadata, final String s, final khe khe) throws IOException {
        if ("disclosureType".equals(s)) {
            jsonDynamicAdPromotedMetadata.b = khe.T((String)null);
        }
        else if ("impressionId".equals(s)) {
            jsonDynamicAdPromotedMetadata.a = khe.T((String)null);
        }
    }
    
    public JsonDynamicAdPromotedMetadata parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonDynamicAdPromotedMetadata jsonDynamicAdPromotedMetadata, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonDynamicAdPromotedMetadata, tfe, b);
    }
}
