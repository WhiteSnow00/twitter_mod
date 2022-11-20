// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceTopicCategory$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceTopicCategory>
{
    public static JsonAudioSpaceTopicCategory _parse(final tge tge) throws IOException {
        final JsonAudioSpaceTopicCategory jsonAudioSpaceTopicCategory = new JsonAudioSpaceTopicCategory();
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
            parseField(jsonAudioSpaceTopicCategory, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceTopicCategory;
    }
    
    public static void _serialize(final JsonAudioSpaceTopicCategory jsonAudioSpaceTopicCategory, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final String b2 = jsonAudioSpaceTopicCategory.b;
        if (b2 == null) {
            czd.m("icon");
            throw null;
        }
        afe.t0("icon", b2);
        afe.t0("name", jsonAudioSpaceTopicCategory.a);
        final String c = jsonAudioSpaceTopicCategory.c;
        if (c == null) {
            czd.m("semanticCoreEntityId");
            throw null;
        }
        afe.t0("semantic_core_entity_id", c);
        final List d = jsonAudioSpaceTopicCategory.d;
        if (d != null) {
            final Iterator g = hee.g(afe, "subtopics", d);
            while (g.hasNext()) {
                final h31 h31 = g.next();
                if (h31 != null) {
                    LoganSquare.typeConverterFor((Class)h31.class).serialize((Object)h31, "lslocalsubtopicsElement", false, afe);
                }
            }
            afe.f();
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("subtopics");
        throw null;
    }
    
    public static void parseField(final JsonAudioSpaceTopicCategory jsonAudioSpaceTopicCategory, String s, final tge tge) throws IOException {
        if ("icon".equals(s)) {
            s = tge.T((String)null);
            Objects.requireNonNull(jsonAudioSpaceTopicCategory);
            czd.f((Object)s, "<set-?>");
            jsonAudioSpaceTopicCategory.b = s;
        }
        else if ("name".equals(s)) {
            jsonAudioSpaceTopicCategory.a = tge.T((String)null);
        }
        else if ("semantic_core_entity_id".equals(s)) {
            s = tge.T((String)null);
            Objects.requireNonNull(jsonAudioSpaceTopicCategory);
            czd.f((Object)s, "<set-?>");
            jsonAudioSpaceTopicCategory.c = s;
        }
        else if ("subtopics".equals(s)) {
            if (tge.e() != vie.N0) {
                Objects.requireNonNull(jsonAudioSpaceTopicCategory);
                czd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList d = new ArrayList();
            while (tge.h0() != vie.O0) {
                final h31 h31 = (h31)LoganSquare.typeConverterFor((Class)h31.class).parse(tge);
                if (h31 != null) {
                    d.add(h31);
                }
            }
            Objects.requireNonNull(jsonAudioSpaceTopicCategory);
            jsonAudioSpaceTopicCategory.d = d;
        }
    }
    
    public JsonAudioSpaceTopicCategory parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceTopicCategory jsonAudioSpaceTopicCategory, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceTopicCategory, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceTopicCategory)o, afe, b);
    }
}
