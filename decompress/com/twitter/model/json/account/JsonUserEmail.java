// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUserEmail extends tih<nbw>
{
    @JsonField(name = { "email" })
    public String a;
    @JsonField(name = { "email_verified" })
    public boolean b;
    
    @Override
    public final Object s() {
        return new nbw(this.a);
    }
}
