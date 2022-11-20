// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonToggleWrapperContent$$JsonObjectMapper extends JsonMapper<JsonToggleWrapperContent>
{
    public static JsonToggleWrapperContent _parse(final tge tge) throws IOException {
        final JsonToggleWrapperContent jsonToggleWrapperContent = new JsonToggleWrapperContent();
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
            parseField(jsonToggleWrapperContent, d, tge);
            tge.l0();
        }
        return jsonToggleWrapperContent;
    }
    
    public static void _serialize(final JsonToggleWrapperContent jsonToggleWrapperContent, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        jsonToggleWrapperContent.t();
        afe.i("action_text");
        JsonOcfRichText$$JsonObjectMapper._serialize(jsonToggleWrapperContent.t(), afe, true);
        final List b2 = jsonToggleWrapperContent.b;
        if (b2 != null) {
            final Iterator g = hee.g(afe, "components", b2);
            while (g.hasNext()) {
                final wqp wqp = g.next();
                if (wqp != null) {
                    LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)wqp, "lslocalcomponentsElement", false, afe);
                }
            }
            afe.f();
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("components");
        throw null;
    }
    
    public static void parseField(final JsonToggleWrapperContent jsonToggleWrapperContent, final String s, final tge tge) throws IOException {
        if ("action_text".equals(s)) {
            final JsonOcfRichText parse = JsonOcfRichText$$JsonObjectMapper._parse(tge);
            Objects.requireNonNull(jsonToggleWrapperContent);
            czd.f((Object)parse, "<set-?>");
            jsonToggleWrapperContent.a = parse;
        }
        else if ("components".equals(s)) {
            if (tge.e() != vie.N0) {
                Objects.requireNonNull(jsonToggleWrapperContent);
                czd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList b = new ArrayList();
            while (tge.h0() != vie.O0) {
                final wqp wqp = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
                if (wqp != null) {
                    b.add(wqp);
                }
            }
            Objects.requireNonNull(jsonToggleWrapperContent);
            jsonToggleWrapperContent.b = b;
        }
    }
    
    public JsonToggleWrapperContent parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonToggleWrapperContent jsonToggleWrapperContent, final afe afe, final boolean b) throws IOException {
        _serialize(jsonToggleWrapperContent, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonToggleWrapperContent)o, afe, b);
    }
}
