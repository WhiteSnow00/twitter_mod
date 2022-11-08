// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.user;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonIncomingFriendship extends aih<ckd>
{
    @JsonField(name = { "id" })
    public long a;
    @JsonField(name = { "unread" })
    public boolean b;
    
    @Override
    public final Object s() {
        return new ckd(this.a, this.b);
    }
}
