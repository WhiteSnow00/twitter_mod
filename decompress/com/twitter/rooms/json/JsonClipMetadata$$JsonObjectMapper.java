// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClipMetadata$$JsonObjectMapper extends JsonMapper<JsonClipMetadata>
{
    public static JsonClipMetadata _parse(final tge tge) throws IOException {
        final JsonClipMetadata jsonClipMetadata = new JsonClipMetadata();
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
            parseField(jsonClipMetadata, d, tge);
            tge.l0();
        }
        return jsonClipMetadata;
    }
    
    public static void _serialize(final JsonClipMetadata jsonClipMetadata, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final String b2 = jsonClipMetadata.b;
        if (b2 == null) {
            czd.m("broadcastId");
            throw null;
        }
        afe.t0("broadcastId", b2);
        final String a = jsonClipMetadata.a;
        if (a == null) {
            czd.m("clipId");
            throw null;
        }
        afe.t0("clipId", a);
        afe.V("clippingUserId", jsonClipMetadata.c);
        final String d = jsonClipMetadata.d;
        if (d != null) {
            afe.t0("createdAt", d);
            afe.V("endTimecodeMillis", jsonClipMetadata.f);
            afe.V("startTimecodeMillis", jsonClipMetadata.e);
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("createdAt");
        throw null;
    }
    
    public static void parseField(final JsonClipMetadata jsonClipMetadata, String d, final tge tge) throws IOException {
        if ("broadcastId".equals(d)) {
            d = tge.T((String)null);
            Objects.requireNonNull(jsonClipMetadata);
            czd.f((Object)d, "<set-?>");
            jsonClipMetadata.b = d;
        }
        else if ("clipId".equals(d)) {
            d = tge.T((String)null);
            Objects.requireNonNull(jsonClipMetadata);
            czd.f((Object)d, "<set-?>");
            jsonClipMetadata.a = d;
        }
        else if ("clippingUserId".equals(d)) {
            jsonClipMetadata.c = tge.K();
        }
        else if ("createdAt".equals(d)) {
            d = tge.T((String)null);
            Objects.requireNonNull(jsonClipMetadata);
            czd.f((Object)d, "<set-?>");
            jsonClipMetadata.d = d;
        }
        else if ("endTimecodeMillis".equals(d)) {
            jsonClipMetadata.f = tge.K();
        }
        else if ("startTimecodeMillis".equals(d)) {
            jsonClipMetadata.e = tge.K();
        }
    }
    
    public JsonClipMetadata parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonClipMetadata jsonClipMetadata, final afe afe, final boolean b) throws IOException {
        _serialize(jsonClipMetadata, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonClipMetadata)o, afe, b);
    }
}
