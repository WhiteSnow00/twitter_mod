// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTypeaheadChannel extends nge
{
    @JsonField
    public List<String> a;
    @JsonField(name = { "object_id" })
    public long b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField(name = { "primary_image" })
    public JsonTypeaheadPrimaryImage e;
    @JsonField(name = { "supporting_text" })
    public String f;
    @JsonField
    public JsonTypeaheadChannelUser g;
}
