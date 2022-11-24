// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTSportsEvent extends tih<krv>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public List<krv$b> e;
    @JsonField
    public Long f;
    @JsonField
    public String g;
    @JsonField
    public c9t h;
    
    @Override
    public final Object s() {
        final krv$a krv$a = new krv$a();
        krv$a.a = this.a;
        krv$a.f = this.b;
        krv$a.g = this.c;
        krv$a.b = this.d;
        krv$a.c = this.e;
        krv$a.d = this.f;
        final String g = this.g;
        String e = null;
        Label_0146: {
            if (g != null) {
                if (g.equalsIgnoreCase("Scheduled")) {
                    e = "UPCOMING";
                    break Label_0146;
                }
                if (g.equalsIgnoreCase("InProgress")) {
                    e = "LIVE";
                    break Label_0146;
                }
                if (g.equalsIgnoreCase("Completed")) {
                    e = "COMPLETED";
                    break Label_0146;
                }
                if (g.equalsIgnoreCase("Postponed")) {
                    e = "DELAYED";
                    break Label_0146;
                }
                if (g.equalsIgnoreCase("Cancelled")) {
                    e = "CANCELED";
                    break Label_0146;
                }
            }
            e = "UNDEFINED";
        }
        krv$a.e = e;
        krv$a.h = this.h;
        return ((z4j)krv$a).e();
    }
    
    @JsonObject
    public static class JsonSportsParticipant extends tih<krv$b>
    {
        @JsonField
        public String a;
        @JsonField
        public String b;
        @JsonField
        public String c;
        @JsonField
        public String d;
        @JsonField
        public String e;
        @JsonField
        public Long f;
        
        @Override
        public final Object s() {
            final krv$b$b krv$b$b = new krv$b$b();
            krv$b$b.a = this.a;
            krv$b$b.b = this.b;
            krv$b$b.c = this.c;
            krv$b$b.d = this.d;
            krv$b$b.e = this.e;
            krv$b$b.f = this.f;
            return ((z4j)krv$b$b).e();
        }
    }
}
