// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRevueProfileInfo extends fih<jwm>
{
    @JsonField(name = { "revue_username" })
    public String a;
    @JsonField(name = { "profile_url" })
    public String b;
    @JsonField(name = { "profile_image_url" })
    public String c;
    
    public final Object s() {
        return new jwm(this.a, this.b, this.c);
    }
}
