// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSamplePageNavBar extends lhh<zqo>
{
    @JsonField
    public String a;
    @JsonField
    public qzo b;
    
    @Override
    public final h4j t() {
        final zqo$a zqo$a = new zqo$a();
        zqo$a.a = this.a;
        return (h4j)zqo$a;
    }
}
