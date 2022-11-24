// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public final class JsonNotificationChannelGroup extends tih<mqi>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        return new mqi(this.a, this.b, this.c);
    }
}
