// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import com.twitter.util.user.UserIdentifier;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationUserContainer extends tih<a>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    
    public JsonNotificationUserContainer() {
        this.b = "";
    }
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final a t() {
        final a.a a = new a.a();
        a.a = UserIdentifier.fromId(this.a);
        a.b = yzl.Companion.a(this.b);
        return (a)a.e();
    }
}
