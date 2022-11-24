// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.activity;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationIcon extends tih<psi>
{
    @JsonField(typeConverter = j4d.class)
    public int a;
    @JsonField(typeConverter = j4d.class)
    public int b;
    
    @Override
    public final Object s() {
        int n = this.a;
        if (n <= 0) {
            n = this.b;
        }
        return new psi(n);
    }
}
