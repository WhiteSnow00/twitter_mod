// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveEventSocialContext extends qhh<mxf>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public final n4j t() {
        final mxf$a mxf$a = new mxf$a();
        mxf$a.a = this.a;
        mxf$a.b = this.b;
        return (n4j)mxf$a;
    }
}
