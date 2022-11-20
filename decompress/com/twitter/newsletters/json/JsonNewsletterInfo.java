// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNewsletterInfo extends fih<qgi>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    public final Object s() {
        return new qgi(this.a, this.b, this.c);
    }
}
