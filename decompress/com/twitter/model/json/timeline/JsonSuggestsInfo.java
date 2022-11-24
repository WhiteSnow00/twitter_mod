// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSuggestsInfo extends nge
{
    @JsonField(name = { "module" })
    public b1p a;
    @JsonField(name = { "tweets" })
    public Map<String, b1p> b;
    @JsonField(name = { "users" })
    public Map<String, b1p> c;
    @JsonField(name = { "moments" })
    public Map<String, b1p> d;
}
