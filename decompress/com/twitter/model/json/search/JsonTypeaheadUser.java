// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTypeaheadUser extends nge
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public List<JsonTypeaheadResponse.JsonToken> c;
    @JsonField
    public long d;
    @JsonField
    public String e;
    @JsonField
    public String f;
    @JsonField(name = { "profile_image_url_https" })
    public String g;
    @JsonField
    public String h;
    @JsonField
    public boolean i;
    @JsonField(name = { "is_blue_verified", "ext_is_blue_verified" })
    public boolean j;
    @JsonField
    public boolean k;
    @JsonField
    public boolean l;
    @JsonField
    public boolean m;
    @JsonField
    public boolean n;
    @JsonField
    public SocialContext o;
    @JsonField
    public dmv p;
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class SocialContext extends nge
    {
        @JsonField
        public boolean a;
        @JsonField
        public boolean b;
    }
}
