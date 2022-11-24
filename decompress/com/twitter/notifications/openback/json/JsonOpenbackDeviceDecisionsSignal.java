// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "Lcom/twitter/notifications/openback/json/JsonOpenbackDeviceDecisionsSignal;", "Ltih;", "Lqnj;", "<init>", "()V", "Companion", "a", "subsystem.tfa.notifications.openback.json" }, k = 1, mv = { 1, 7, 1 })
@JsonObject
public final class JsonOpenbackDeviceDecisionsSignal extends tih<qnj>
{
    public static final JsonOpenbackDeviceDecisionsSignal.JsonOpenbackDeviceDecisionsSignal$a Companion;
    @JsonField(typeConverter = lu8.class)
    public ku8 a;
    
    static {
        Companion = new JsonOpenbackDeviceDecisionsSignal.JsonOpenbackDeviceDecisionsSignal$a();
    }
    
    @Override
    public final Object s() {
        return new qnj(this.t());
    }
    
    public final ku8 t() {
        final ku8 a = this.a;
        if (a != null) {
            return a;
        }
        e0e.m("model");
        throw null;
    }
}
