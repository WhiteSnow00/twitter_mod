// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventDescriptionEntities$$JsonObjectMapper extends JsonMapper<JsonLiveEventDescriptionEntities>
{
    public static JsonLiveEventDescriptionEntities _parse(final khe khe) throws IOException {
        final JsonLiveEventDescriptionEntities jsonLiveEventDescriptionEntities = new JsonLiveEventDescriptionEntities();
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
            parseField(jsonLiveEventDescriptionEntities, d, khe);
            khe.m0();
        }
        return jsonLiveEventDescriptionEntities;
    }
    
    public static void _serialize(final JsonLiveEventDescriptionEntities jsonLiveEventDescriptionEntities, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("display_url", jsonLiveEventDescriptionEntities.a);
        tfe.u0("expanded_url", jsonLiveEventDescriptionEntities.b);
        final List c = jsonLiveEventDescriptionEntities.c;
        if (c != null) {
            final Iterator f = x30.F(tfe, "indices", c);
            while (f.hasNext()) {
                tfe.p((int)f.next());
            }
            tfe.f();
        }
        tfe.u0("url", jsonLiveEventDescriptionEntities.d);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventDescriptionEntities jsonLiveEventDescriptionEntities, final String s, final khe khe) throws IOException {
        if ("display_url".equals(s)) {
            jsonLiveEventDescriptionEntities.a = khe.T((String)null);
        }
        else if ("expanded_url".equals(s)) {
            jsonLiveEventDescriptionEntities.b = khe.T((String)null);
        }
        else if ("indices".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    Integer value;
                    if (khe.e() == lje.U0) {
                        value = null;
                    }
                    else {
                        value = khe.z();
                    }
                    if (value != null) {
                        c.add(value);
                    }
                }
                jsonLiveEventDescriptionEntities.c = c;
            }
            else {
                jsonLiveEventDescriptionEntities.c = null;
            }
        }
        else if ("url".equals(s)) {
            jsonLiveEventDescriptionEntities.d = khe.T((String)null);
        }
    }
    
    public JsonLiveEventDescriptionEntities parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventDescriptionEntities jsonLiveEventDescriptionEntities, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventDescriptionEntities, tfe, b);
    }
}
