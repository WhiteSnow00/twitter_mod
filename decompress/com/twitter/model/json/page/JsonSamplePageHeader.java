// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSamplePageHeader extends lhh<sqo>
{
    @JsonField
    public String a;
    @JsonField
    public qzo b;
    
    @Override
    public final h4j t() {
        final sqo$a sqo$a = new sqo$a();
        sqo$a.a = this.a;
        sqo$a.b = this.b;
        return (h4j)sqo$a;
    }
}
