// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public final class JsonNotificationChannelsResponse extends fih<iqi>
{
    @JsonField
    public wpi a;
    @JsonField
    public List<upi> b;
    
    public final Object s() {
        return new iqi(this.a, (List)this.b);
    }
}
