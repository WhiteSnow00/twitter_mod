// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTwitterUserPhone extends fih<sfw>
{
    @JsonField
    public boolean a;
    
    public final Object s() {
        final sfw$a sfw$a = new sfw$a();
        sfw$a.a = this.a;
        return ((n4j)sfw$a).e();
    }
}
