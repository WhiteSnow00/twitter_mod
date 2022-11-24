// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public final class JsonNotificationChannelsResponse extends tih<yqi>
{
    @JsonField
    public mqi a;
    @JsonField
    public List<kqi> b;
    
    @Override
    public final Object s() {
        return new yqi(this.a, this.b);
    }
}
