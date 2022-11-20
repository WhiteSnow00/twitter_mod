// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.bookmarks.data.json;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBookmarkFolder$$JsonObjectMapper extends JsonMapper<JsonBookmarkFolder>
{
    public static JsonBookmarkFolder _parse(final tge tge) throws IOException {
        final JsonBookmarkFolder jsonBookmarkFolder = new JsonBookmarkFolder();
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
            parseField(jsonBookmarkFolder, d, tge);
            tge.l0();
        }
        return jsonBookmarkFolder;
    }
    
    public static void _serialize(final JsonBookmarkFolder jsonBookmarkFolder, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("contains_requested_tweet", jsonBookmarkFolder.d);
        final String a = jsonBookmarkFolder.a;
        if (a == null) {
            czd.m("id");
            throw null;
        }
        afe.t0("id", a);
        jsonBookmarkFolder.t();
        LoganSquare.typeConverterFor((Class)xh1.class).serialize((Object)jsonBookmarkFolder.t(), "media", true, afe);
        final String b2 = jsonBookmarkFolder.b;
        if (b2 != null) {
            afe.t0("name", b2);
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("name");
        throw null;
    }
    
    public static void parseField(final JsonBookmarkFolder jsonBookmarkFolder, String s, final tge tge) throws IOException {
        if ("contains_requested_tweet".equals(s)) {
            jsonBookmarkFolder.d = tge.k();
        }
        else if ("id".equals(s)) {
            s = tge.T((String)null);
            Objects.requireNonNull(jsonBookmarkFolder);
            czd.f((Object)s, "<set-?>");
            jsonBookmarkFolder.a = s;
        }
        else if ("media".equals(s)) {
            final xh1 c = (xh1)LoganSquare.typeConverterFor((Class)xh1.class).parse(tge);
            Objects.requireNonNull(jsonBookmarkFolder);
            czd.f((Object)c, "<set-?>");
            jsonBookmarkFolder.c = c;
        }
        else if ("name".equals(s)) {
            s = tge.T((String)null);
            Objects.requireNonNull(jsonBookmarkFolder);
            czd.f((Object)s, "<set-?>");
            jsonBookmarkFolder.b = s;
        }
    }
    
    public JsonBookmarkFolder parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBookmarkFolder jsonBookmarkFolder, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBookmarkFolder, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBookmarkFolder)o, afe, b);
    }
}
