// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTopicPageNavBar extends lhh<mot>
{
    @JsonField
    public gxd a;
    @JsonField
    public qzo b;
    
    @Override
    public final h4j t() {
        final mot$a mot$a = new mot$a();
        mot$a.a = this.a;
        mot$a.b = this.b;
        return (h4j)mot$a;
    }
}
