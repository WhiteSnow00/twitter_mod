// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/twitter/subscriptions/features/json/JsonFeatureConfig;", "Lige;", "<init>", "()V", "subsystem.tfa.subscriptions.features.json_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonFeatureConfig extends ige
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField(name = { "is_labs_feature" })
    public boolean e;
    @JsonField
    public String[] f;
    @JsonField
    public String g;
    
    public JsonFeatureConfig() {
        this.f = new String[0];
    }
}
