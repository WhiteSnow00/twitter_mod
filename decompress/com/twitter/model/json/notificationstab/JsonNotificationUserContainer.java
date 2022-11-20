// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import com.twitter.util.user.UserIdentifier;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationUserContainer extends fih<a>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    
    public JsonNotificationUserContainer() {
        this.b = "";
    }
    
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final a t() {
        final a$a a$a = new a$a();
        a$a.a = UserIdentifier.fromId(this.a);
        a$a.b = ozl.Companion.a(this.b);
        return (a)((n4j)a$a).e();
    }
}
