// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTypeaheadEvent extends nge
{
    @JsonField
    public List<JsonTypeaheadResponse.JsonToken> a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public boolean f;
    @JsonField
    public dmv g;
    @JsonField
    public String h;
    @JsonField
    public String i;
    @JsonField
    public Map<String, hpj> j;
    @JsonField
    public String k;
    @JsonField(name = { "sc_entity_id" })
    public long l;
}
