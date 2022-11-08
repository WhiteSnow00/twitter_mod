// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.people;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonModuleShowMore extends lhh<ioh>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public String c;
    
    @Override
    public final h4j t() {
        final ioh$a ioh$a = new ioh$a();
        ioh$a.a = this.a;
        ioh$a.b = this.b;
        ioh$a.c = this.c;
        return (h4j)ioh$a;
    }
}
