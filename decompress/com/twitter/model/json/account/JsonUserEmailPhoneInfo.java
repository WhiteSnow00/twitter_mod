// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUserEmailPhoneInfo extends tih<obw>
{
    @JsonField(name = { "emails" })
    public List<nbw> a;
    @JsonField(name = { "phone_numbers" })
    public List<jgw> b;
    
    @Override
    public final Object s() {
        return new obw((List)this.a, (List)this.b);
    }
}
