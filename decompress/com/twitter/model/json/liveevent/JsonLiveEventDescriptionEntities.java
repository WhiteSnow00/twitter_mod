// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/liveevent/JsonLiveEventDescriptionEntities;", "Lqhh;", "Latf;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonLiveEventDescriptionEntities extends qhh<atf>
{
    @JsonField(name = { "display_url" })
    public String a;
    @JsonField(name = { "expanded_url" })
    public String b;
    @JsonField(name = { "indices" })
    public List<Integer> c;
    @JsonField(name = { "url" })
    public String d;
    
    public final n4j t() {
        final atf$a atf$a = new atf$a();
        atf$a.a = this.a;
        atf$a.b = this.b;
        atf$a.d = this.c;
        atf$a.c = this.d;
        return (n4j)atf$a;
    }
}
