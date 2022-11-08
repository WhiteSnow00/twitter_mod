// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUpdateUsers$$JsonObjectMapper extends JsonMapper<JsonUpdateUsers>
{
    public static JsonUpdateUsers _parse(final khe khe) throws IOException {
        final JsonUpdateUsers jsonUpdateUsers = new JsonUpdateUsers();
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
            parseField(jsonUpdateUsers, d, khe);
            khe.m0();
        }
        return jsonUpdateUsers;
    }
    
    public static void _serialize(final JsonUpdateUsers jsonUpdateUsers, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonUpdateUsers.c != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonUpdateUsers.c, tfe, true);
        }
        if (jsonUpdateUsers.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonUpdateUsers.b, "next_link", true, tfe);
        }
        final ArrayList a = jsonUpdateUsers.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "users", a);
            while (g.hasNext()) {
                final hfv hfv = g.next();
                if (hfv != null) {
                    LoganSquare.typeConverterFor((Class)hfv.class).serialize((Object)hfv, "lslocalusersElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUpdateUsers jsonUpdateUsers, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonUpdateUsers.c = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonUpdateUsers.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("users".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final hfv hfv = (hfv)LoganSquare.typeConverterFor((Class)hfv.class).parse(khe);
                    if (hfv != null) {
                        a.add(hfv);
                    }
                }
                jsonUpdateUsers.a = a;
            }
            else {
                jsonUpdateUsers.a = null;
            }
        }
    }
    
    public JsonUpdateUsers parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUpdateUsers jsonUpdateUsers, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUpdateUsers, tfe, b);
    }
}
