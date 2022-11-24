// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTypeaheadChannelUser extends nge
{
    @JsonField
    public long a;
    @JsonField(name = { "id_str" })
    public String b;
    @JsonField
    public String c;
    @JsonField(name = { "screen_name" })
    public String d;
    @JsonField(name = { "profile_image_url_https" })
    public String e;
    @JsonField(name = { "verified" })
    public boolean f;
    @JsonField(name = { "protected" })
    public boolean g;
}
