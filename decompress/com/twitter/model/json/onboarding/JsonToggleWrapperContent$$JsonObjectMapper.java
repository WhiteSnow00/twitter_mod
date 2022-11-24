// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonToggleWrapperContent$$JsonObjectMapper extends JsonMapper<JsonToggleWrapperContent>
{
    public static JsonToggleWrapperContent _parse(final qhe qhe) throws IOException {
        final JsonToggleWrapperContent jsonToggleWrapperContent = new JsonToggleWrapperContent();
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
            parseField(jsonToggleWrapperContent, d, qhe);
            qhe.m0();
        }
        return jsonToggleWrapperContent;
    }
    
    public static void _serialize(final JsonToggleWrapperContent jsonToggleWrapperContent, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        jsonToggleWrapperContent.t();
        yfe.i("action_text");
        JsonOcfRichText$$JsonObjectMapper._serialize(jsonToggleWrapperContent.t(), yfe, true);
        final List<rrp> b2 = jsonToggleWrapperContent.b;
        if (b2 != null) {
            final Iterator o = ffe.o(yfe, "components", b2);
            while (o.hasNext()) {
                final rrp rrp = o.next();
                if (rrp != null) {
                    LoganSquare.typeConverterFor((Class)rrp.class).serialize((Object)rrp, "lslocalcomponentsElement", false, yfe);
                }
            }
            yfe.f();
            if (b) {
                yfe.h();
            }
            return;
        }
        e0e.m("components");
        throw null;
    }
    
    public static void parseField(final JsonToggleWrapperContent jsonToggleWrapperContent, final String s, final qhe qhe) throws IOException {
        if ("action_text".equals(s)) {
            final JsonOcfRichText parse = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
            Objects.requireNonNull(jsonToggleWrapperContent);
            e0e.f((Object)parse, "<set-?>");
            jsonToggleWrapperContent.a = parse;
        }
        else if ("components".equals(s)) {
            if (qhe.e() != rje.P0) {
                Objects.requireNonNull(jsonToggleWrapperContent);
                e0e.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList b = new ArrayList();
            while (qhe.i0() != rje.Q0) {
                final rrp rrp = (rrp)LoganSquare.typeConverterFor((Class)rrp.class).parse(qhe);
                if (rrp != null) {
                    b.add(rrp);
                }
            }
            Objects.requireNonNull(jsonToggleWrapperContent);
            jsonToggleWrapperContent.b = b;
        }
    }
    
    public JsonToggleWrapperContent parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonToggleWrapperContent jsonToggleWrapperContent, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonToggleWrapperContent, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonToggleWrapperContent)o, yfe, b);
    }
}
