// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.timeline.wtf.JsonHeaderAvatar$$JsonObjectMapper;
import com.twitter.model.json.timeline.wtf.JsonHeaderAvatar;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHeaderContext$$JsonObjectMapper extends JsonMapper<JsonHeaderContext>
{
    public static JsonHeaderContext _parse(final qhe qhe) throws IOException {
        final JsonHeaderContext jsonHeaderContext = new JsonHeaderContext();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonHeaderContext, d, qhe);
            qhe.m0();
        }
        return jsonHeaderContext;
    }
    
    public static void _serialize(final JsonHeaderContext jsonHeaderContext, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonHeaderContext.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "avatars", a);
            while (e.hasNext()) {
                final JsonHeaderAvatar jsonHeaderAvatar = e.next();
                if (jsonHeaderAvatar != null) {
                    JsonHeaderAvatar$$JsonObjectMapper._serialize(jsonHeaderAvatar, yfe, true);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonHeaderContext jsonHeaderContext, final String s, final qhe qhe) throws IOException {
        if ("avatars".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonHeaderAvatar parse = JsonHeaderAvatar$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        a.add(parse);
                    }
                }
                jsonHeaderContext.a = a;
            }
            else {
                jsonHeaderContext.a = null;
            }
        }
    }
    
    public JsonHeaderContext parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonHeaderContext jsonHeaderContext, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonHeaderContext, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonHeaderContext)o, yfe, b);
    }
}
