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
    public static JsonTaskResponse _parse(final khe khe) throws IOException {
        final JsonTaskResponse jsonTaskResponse = new JsonTaskResponse();
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
            parseField(jsonTaskResponse, d, khe);
            khe.m0();
        }
        return jsonTaskResponse;
    }
    
    public static void _serialize(final JsonTaskResponse jsonTaskResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("flow_token", jsonTaskResponse.b);
        tfe.u0("status", jsonTaskResponse.a);
        final ArrayList c = jsonTaskResponse.c;
        if (c != null) {
            final Iterator g = q1a.g(tfe, "subtasks", c);
            while (g.hasNext()) {
                final JsonSubtask jsonSubtask = g.next();
                if (jsonSubtask != null) {
                    JsonSubtask$$JsonObjectMapper._serialize(jsonSubtask, tfe, true);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTaskResponse jsonTaskResponse, final String s, final khe khe) throws IOException {
        if ("flow_token".equals(s)) {
            jsonTaskResponse.b = khe.T((String)null);
        }
        else if ("status".equals(s)) {
            jsonTaskResponse.a = khe.T((String)null);
        }
        else if ("subtasks".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonSubtask parse = JsonSubtask$$JsonObjectMapper._parse(khe);
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
    
    public JsonTaskResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTaskResponse jsonTaskResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTaskResponse, tfe, b);
    }
}
