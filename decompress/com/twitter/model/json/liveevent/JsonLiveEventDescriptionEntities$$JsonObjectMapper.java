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
    public static JsonLiveEventDescriptionEntities _parse(final tge tge) throws IOException {
        final JsonLiveEventDescriptionEntities jsonLiveEventDescriptionEntities = new JsonLiveEventDescriptionEntities();
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
            parseField(jsonLiveEventDescriptionEntities, d, tge);
            tge.l0();
        }
        return jsonLiveEventDescriptionEntities;
    }
    
    public static void _serialize(final JsonLiveEventDescriptionEntities jsonLiveEventDescriptionEntities, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("display_url", jsonLiveEventDescriptionEntities.a);
        afe.t0("expanded_url", jsonLiveEventDescriptionEntities.b);
        final List<Integer> c = jsonLiveEventDescriptionEntities.c;
        if (c != null) {
            final Iterator g = hee.g(afe, "indices", (List)c);
            while (g.hasNext()) {
                afe.p((int)g.next());
            }
            afe.f();
        }
        afe.t0("url", jsonLiveEventDescriptionEntities.d);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventDescriptionEntities jsonLiveEventDescriptionEntities, final String s, final tge tge) throws IOException {
        if ("display_url".equals(s)) {
            jsonLiveEventDescriptionEntities.a = tge.T((String)null);
        }
        else if ("expanded_url".equals(s)) {
            jsonLiveEventDescriptionEntities.b = tge.T((String)null);
        }
        else if ("indices".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    Integer value;
                    if (tge.e() == vie.V0) {
                        value = null;
                    }
                    else {
                        value = tge.y();
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
            jsonLiveEventDescriptionEntities.d = tge.T((String)null);
        }
    }
    
    public JsonLiveEventDescriptionEntities parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventDescriptionEntities jsonLiveEventDescriptionEntities, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveEventDescriptionEntities, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventDescriptionEntities)o, afe, b);
    }
}
