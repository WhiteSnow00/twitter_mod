// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "Lcom/twitter/notifications/openback/json/JsonOpenbackSignals;", "Ltih;", "Lynj;", "<init>", "()V", "Companion", "a", "subsystem.tfa.notifications.openback.json" }, k = 1, mv = { 1, 7, 1 })
@JsonObject
public final class JsonOpenbackSignals extends tih<ynj>
{
    public static final a Companion;
    @JsonField(name = { "unlock" })
    public znj a;
    @JsonField(name = { "deviceDecisions" })
    public qnj b;
    @JsonField(name = { "headphones" })
    public snj c;
    @JsonField(name = { "batteryChargingStatus" })
    public onj d;
    @JsonField(name = { "ringerVolume" })
    public xnj e;
    
    static {
        Companion = new a();
    }
    
    @Override
    public final Object s() {
        return new ynj(this.a, this.b, this.c, this.d, this.e);
    }
    
    public static final class a
    {
    }
}
