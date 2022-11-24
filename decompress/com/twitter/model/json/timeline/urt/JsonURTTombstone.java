// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Locale;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTTombstone extends tih<csv>
{
    @JsonField(typeConverter = JsonURTTombstone.JsonURTTombstone$a.class)
    public String a;
    @JsonField
    public hsv b;
    @JsonField(name = { "tweet", "tombstoneTweet" })
    public o7t c;
    
    public JsonURTTombstone() {
        this.a = "unknown";
    }
    
    @Override
    public final Object s() {
        final boolean equals = "unknown".equals(this.a);
        Object o = null;
        if (!equals) {
            if ("Inline".equals(this.a) && this.b == null) {
                r9a.d((Throwable)new IllegalStateException(String.format(Locale.ENGLISH, "A Tombstone with display type 'inline' must have a valid tombstoneInfo. DisplayType: %s", this.a)));
            }
            else if ("NonCompliant".equals(this.a) && this.b == null) {
                r9a.d((Throwable)new IllegalStateException(String.format(Locale.ENGLISH, "A Tombstone with display type 'NonCompliant' must have a valid tombstoneInfo. DisplayType: %s", this.a)));
            }
            else {
                o = new csv(this.a, this.b, this.c);
            }
        }
        else {
            r9a.d((Throwable)new IllegalStateException(String.format(Locale.ENGLISH, "A Tombstone must have a valid display type. DisplayType: %s", this.a)));
        }
        return o;
    }
}
