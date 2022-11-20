// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLinkTitleCard extends fih<tdf>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    
    public final Object s() {
        final tdf$a tdf$a = new tdf$a();
        tdf$a.a = this.a;
        tdf$a.b = this.b;
        tdf$a.c = this.c;
        tdf$a.d = this.d;
        return ((n4j)tdf$a).j();
    }
}
