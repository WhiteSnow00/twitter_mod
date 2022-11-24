// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.communities;

import java.util.Date;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class BaseJsonCommunity extends tih<qj1>
{
    @JsonField(name = { "rest_id", "id" })
    public String a;
    @JsonField
    public String b;
    @JsonField(name = { "apiCommunity" })
    public ze0 c;
    @JsonField(name = { "default_theme" })
    public String d;
    @JsonField(name = { "role" })
    public String e;
    @JsonField(name = { "access" })
    public String f;
    @JsonField(name = { "updated_at" })
    public Long g;
    
    @Override
    public final Object s() {
        final ze0 c = this.c;
        qj1 qj1;
        if (c != null) {
            final gx5 a = c.a;
            qj1 = new qj1(this.a, a.a.a, a.b, this.b, a.d.a, a.c.a);
        }
        else {
            qj1 = new qj1(this.a, this.f, new Date(this.g), this.b, this.e, this.d);
        }
        return qj1;
    }
}
