// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceTopicItem$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceTopicItem>
{
    public static JsonAudioSpaceTopicItem _parse(final tge tge) throws IOException {
        final JsonAudioSpaceTopicItem jsonAudioSpaceTopicItem = new JsonAudioSpaceTopicItem();
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
            parseField(jsonAudioSpaceTopicItem, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceTopicItem;
    }
    
    public static void _serialize(final JsonAudioSpaceTopicItem jsonAudioSpaceTopicItem, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final String b2 = jsonAudioSpaceTopicItem.b;
        if (b2 == null) {
            czd.m("name");
            throw null;
        }
        afe.t0("name", b2);
        final String a = jsonAudioSpaceTopicItem.a;
        if (a != null) {
            afe.t0("topic_id", a);
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("topicId");
        throw null;
    }
    
    public static void parseField(final JsonAudioSpaceTopicItem jsonAudioSpaceTopicItem, String s, final tge tge) throws IOException {
        if ("name".equals(s)) {
            s = tge.T((String)null);
            Objects.requireNonNull(jsonAudioSpaceTopicItem);
            czd.f((Object)s, "<set-?>");
            jsonAudioSpaceTopicItem.b = s;
        }
        else if ("topic_id".equals(s)) {
            s = tge.T((String)null);
            Objects.requireNonNull(jsonAudioSpaceTopicItem);
            czd.f((Object)s, "<set-?>");
            jsonAudioSpaceTopicItem.a = s;
        }
    }
    
    public JsonAudioSpaceTopicItem parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceTopicItem jsonAudioSpaceTopicItem, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceTopicItem, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceTopicItem)o, afe, b);
    }
}
