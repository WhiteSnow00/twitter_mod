// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCropData extends eih<p77>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public int d;
    
    public final z4j t() {
        final p77$a p77$a = new p77$a();
        p77$a.a = this.a;
        p77$a.b = this.b;
        p77$a.c = this.c;
        p77$a.d = this.d;
        return (z4j)p77$a;
    }
}
