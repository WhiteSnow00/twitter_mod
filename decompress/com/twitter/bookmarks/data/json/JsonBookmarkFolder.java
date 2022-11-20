// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.bookmarks.data.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/bookmarks/data/json/JsonBookmarkFolder;", "Lfih;", "Lu42;", "<init>", "()V", "subsystem.tfa.bookmarks.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject
public final class JsonBookmarkFolder extends fih<u42>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public xh1 c;
    @JsonField(name = { "contains_requested_tweet" })
    public boolean d;
    
    public final Object s() {
        final String a = this.a;
        if (a == null) {
            czd.m("id");
            throw null;
        }
        final String b = this.b;
        if (b != null) {
            return new u42(a, b, this.d, this.t());
        }
        czd.m("name");
        throw null;
    }
    
    public final xh1 t() {
        final xh1 c = this.c;
        if (c != null) {
            return c;
        }
        czd.m("media");
        throw null;
    }
}
