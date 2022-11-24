// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTwitterUserPhone extends tih<igw>
{
    @JsonField
    public boolean a;
    
    @Override
    public final Object s() {
        final igw$a igw$a = new igw$a();
        igw$a.a = this.a;
        return ((z4j)igw$a).e();
    }
}
