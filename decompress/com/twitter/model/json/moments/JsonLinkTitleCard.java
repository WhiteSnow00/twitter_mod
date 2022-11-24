// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLinkTitleCard extends tih<qef>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    
    @Override
    public final Object s() {
        final qef$a qef$a = new qef$a();
        qef$a.a = this.a;
        qef$a.b = this.b;
        qef$a.c = this.c;
        qef$a.d = this.d;
        return ((z4j)qef$a).j();
    }
}
