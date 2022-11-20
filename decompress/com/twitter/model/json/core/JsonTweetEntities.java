// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetEntities extends qhh<eku>
{
    @JsonField
    public List<h6w> a;
    @JsonField
    public List<dtg> b;
    @JsonField
    public List<i4h> c;
    @JsonField
    public List<qfc> d;
    @JsonField
    public List<om3> e;
    
    public final n4j t() {
        final eku$a eku$a = new eku$a();
        ((y6a$a)eku$a.a).v(y6a.e(gdd.g((List)this.a)));
        eku$a.b.v((y6a)pug.i(gdd.g((List)this.b)));
        ((y6a$a)eku$a.c).v(y6a.e(gdd.g((List)this.c)));
        ((y6a$a)eku$a.d).v(y6a.e(gdd.g((List)this.d)));
        ((y6a$a)eku$a.e).v(y6a.e(gdd.g((List)this.e)));
        return (n4j)eku$a;
    }
}
