// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/notifications/json/JsonCtaSuffix;", "Lfih;", "Li77;", "<init>", "()V", "subsystem.tfa.notifications.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject
public final class JsonCtaSuffix extends fih<i77>
{
    @JsonField(name = { "copy_compact" })
    public String a;
    @JsonField(name = { "color_compact" })
    public String b;
    @JsonField(name = { "copy_expanded" })
    public String c;
    @JsonField(name = { "color_expanded" })
    public String d;
    
    public final Object s() {
        return new i77(this.a, this.b, this.c, this.d);
    }
}
