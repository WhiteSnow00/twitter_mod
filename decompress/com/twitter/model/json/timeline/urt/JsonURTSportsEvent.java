// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTSportsEvent extends aih<dqv>
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
    public List<dqv$b> e;
    @JsonField
    public Long f;
    @JsonField
    public String g;
    @JsonField
    public q7t h;
    
    @Override
    public final Object s() {
        final dqv$a dqv$a = new dqv$a();
        dqv$a.a = this.a;
        dqv$a.f = this.b;
        dqv$a.g = this.c;
        dqv$a.b = this.d;
        dqv$a.c = this.e;
        dqv$a.d = this.f;
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
        dqv$a.e = e;
        dqv$a.h = this.h;
        return ((h4j)dqv$a).e();
    }
    
    @JsonObject
    public static class JsonSportsParticipant extends aih<dqv$b>
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
            final dqv$b$b dqv$b$b = new dqv$b$b();
            dqv$b$b.a = this.a;
            dqv$b$b.b = this.b;
            dqv$b$b.c = this.c;
            dqv$b$b.d = this.d;
            dqv$b$b.e = this.e;
            dqv$b$b.f = this.f;
            return ((h4j)dqv$b$b).e();
        }
    }
}
