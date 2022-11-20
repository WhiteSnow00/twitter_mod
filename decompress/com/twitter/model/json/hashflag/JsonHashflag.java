// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.hashflag;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonHashflag extends qhh<sec>
{
    @JsonField(name = { "hashtag" })
    public String a;
    @JsonField(name = { "assetUrl", "asset_url" })
    public String b;
    @JsonField(name = { "startingTimestampMs", "starting_timestamp_ms" })
    public String c;
    @JsonField(name = { "endingTimestampMs", "ending_timestamp_ms" })
    public String d;
    @JsonField(name = { "animations" })
    public List<cb0> e;
    
    public final n4j t() {
        final sec$a sec$a = new sec$a();
        sec$a.c = this.a;
        sec$a.d = this.b;
        sec$a.a = Long.parseLong(this.c);
        sec$a.b = Long.parseLong(this.d);
        sec$a.e = this.e;
        return (n4j)sec$a;
    }
}
