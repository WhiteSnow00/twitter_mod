// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationBigPictureStyleImages extends eih<hqi>
{
    @JsonField
    public usi a;
    @JsonField
    public usi b;
    @JsonField
    public usi c;
    
    public final z4j t() {
        final hqi.a a = new hqi.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        return a;
    }
}
