// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserFriendship extends tih<gcw>
{
    @JsonField
    public String a;
    @JsonField(name = { "screen_name" })
    public String b;
    @JsonField
    public Long c;
    @JsonField(name = { "id_str" })
    public String d;
    @JsonField
    public List<String> e;
    
    @Override
    public final Object s() {
        return new gcw(this.a, this.b, (long)this.c, this.d, (List)this.e);
    }
}
