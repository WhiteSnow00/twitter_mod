// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.util.user.UserIdentifier;

@JsonObject
public class JsonUserIdentifier extends tih<UserIdentifier>
{
    @JsonField
    public long a;
    
    @Override
    public final Object s() {
        final long a = this.a;
        UserIdentifier fromId;
        if (a > 0L) {
            fromId = UserIdentifier.fromId(a);
        }
        else {
            fromId = null;
        }
        return fromId;
    }
}
