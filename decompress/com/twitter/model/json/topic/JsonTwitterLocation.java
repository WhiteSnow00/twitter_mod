// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.topic;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTwitterLocation extends tih<xdv>
{
    @JsonField(name = { "name" })
    public String a;
    @JsonField(name = { "woeid" })
    public long b;
    @JsonField(name = { "countryCode" })
    public String c;
    @JsonField(name = { "country" })
    public String d;
    
    @Override
    public final Object s() {
        return new xdv(this.a, this.b, this.d, this.c);
    }
}
