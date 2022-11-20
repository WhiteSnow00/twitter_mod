// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/json/JsonQuoteTweetPush;", "Lfih;", "Llvl;", "<init>", "()V", "subsystem.tfa.notifications.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject
public final class JsonQuoteTweetPush extends fih<lvl>
{
    @JsonField(name = { "author_name" })
    public String a;
    @JsonField(name = { "author_handle" })
    public String b;
    @JsonField(name = { "text" })
    public String c;
    @JsonField(name = { "author_avatar_url" })
    public String d;
    @JsonField(name = { "image_url" })
    public String e;
    @JsonField(name = { "created_at" })
    public long f;
    
    public final Object s() {
        return new lvl(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
