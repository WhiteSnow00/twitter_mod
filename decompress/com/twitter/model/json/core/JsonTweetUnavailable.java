// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetUnavailable extends qhh<tuu>
{
    @JsonField
    public tuu$b a;
    @JsonField
    public String b;
    
    public JsonTweetUnavailable() {
        this.a = tuu$b.E0;
    }
    
    public final n4j t() {
        final tuu$a tuu$a = new tuu$a();
        tuu$a.D0 = this.a;
        return (n4j)tuu$a;
    }
}
