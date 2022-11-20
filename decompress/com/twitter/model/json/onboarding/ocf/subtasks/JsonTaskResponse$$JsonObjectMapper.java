// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTaskResponse$$JsonObjectMapper extends JsonMapper<JsonTaskResponse>
{
    public static JsonTaskResponse _parse(final tge tge) throws IOException {
        final JsonTaskResponse jsonTaskResponse = new JsonTaskResponse();
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
            parseField(jsonTaskResponse, d, tge);
            tge.l0();
        }
        return jsonTaskResponse;
    }
    
    public static void _serialize(final JsonTaskResponse jsonTaskResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("flow_token", jsonTaskResponse.b);
        afe.t0("status", jsonTaskResponse.a);
        final ArrayList c = jsonTaskResponse.c;
        if (c != null) {
            final Iterator a = br.A(afe, "subtasks", c);
            while (a.hasNext()) {
                final JsonSubtask jsonSubtask = a.next();
                if (jsonSubtask != null) {
                    JsonSubtask$$JsonObjectMapper._serialize(jsonSubtask, afe, true);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTaskResponse jsonTaskResponse, final String s, final tge tge) throws IOException {
        if ("flow_token".equals(s)) {
            jsonTaskResponse.b = tge.T((String)null);
        }
        else if ("status".equals(s)) {
            jsonTaskResponse.a = tge.T((String)null);
        }
        else if ("subtasks".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonSubtask parse = JsonSubtask$$JsonObjectMapper._parse(tge);
                    if (parse != null) {
                        c.add(parse);
                    }
                }
                jsonTaskResponse.c = c;
            }
            else {
                jsonTaskResponse.c = null;
            }
        }
    }
    
    public JsonTaskResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTaskResponse jsonTaskResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTaskResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTaskResponse)o, afe, b);
    }
}
