// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.delegate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDelegateGroup$$JsonObjectMapper extends JsonMapper<JsonDelegateGroup>
{
    public static JsonDelegateGroup _parse(final tge tge) throws IOException {
        final JsonDelegateGroup jsonDelegateGroup = new JsonDelegateGroup();
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
            parseField(jsonDelegateGroup, d, tge);
            tge.l0();
        }
        return jsonDelegateGroup;
    }
    
    public static void _serialize(final JsonDelegateGroup jsonDelegateGroup, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonDelegateGroup.a != null) {
            LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)jsonDelegateGroup.a, "handle_results", true, afe);
        }
        final List<nm8> b2 = jsonDelegateGroup.b;
        if (b2 != null) {
            final Iterator g = hee.g(afe, "members", (List)b2);
            while (g.hasNext()) {
                final nm8 nm8 = g.next();
                if (nm8 != null) {
                    LoganSquare.typeConverterFor((Class)nm8.class).serialize((Object)nm8, "lslocalmembersElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonDelegateGroup jsonDelegateGroup, final String s, final tge tge) throws IOException {
        if ("handle_results".equals(s)) {
            jsonDelegateGroup.a = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
        }
        else if ("members".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final nm8 nm8 = (nm8)LoganSquare.typeConverterFor((Class)nm8.class).parse(tge);
                    if (nm8 != null) {
                        b.add(nm8);
                    }
                }
                jsonDelegateGroup.b = b;
            }
            else {
                jsonDelegateGroup.b = null;
            }
        }
    }
    
    public JsonDelegateGroup parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonDelegateGroup jsonDelegateGroup, final afe afe, final boolean b) throws IOException {
        _serialize(jsonDelegateGroup, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonDelegateGroup)o, afe, b);
    }
}
