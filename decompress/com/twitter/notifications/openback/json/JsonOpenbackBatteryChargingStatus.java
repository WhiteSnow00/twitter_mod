// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "Lcom/twitter/notifications/openback/json/JsonOpenbackBatteryChargingStatus;", "Lfih;", "Lymj;", "<init>", "()V", "Companion", "a", "subsystem.tfa.notifications.openback.json" }, k = 1, mv = { 1, 7, 1 })
@JsonObject
public final class JsonOpenbackBatteryChargingStatus extends fih<ymj>
{
    public static final JsonOpenbackBatteryChargingStatus.JsonOpenbackBatteryChargingStatus$a Companion;
    @JsonField
    public boolean a;
    
    static {
        Companion = new JsonOpenbackBatteryChargingStatus.JsonOpenbackBatteryChargingStatus$a();
    }
    
    public final Object s() {
        return new ymj(this.a);
    }
}
