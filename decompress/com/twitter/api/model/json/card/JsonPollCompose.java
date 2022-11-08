// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.card;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonPollCompose extends aih<opk>
{
    @JsonField(name = { "card_uri" })
    public String a;
    @JsonField(name = { "status" })
    public String b;
    @JsonField(name = { "error_type" })
    public String c;
    @JsonField(name = { "message" })
    public String d;
    
    @Override
    public final Object s() {
        return new opk(this.a);
    }
}
