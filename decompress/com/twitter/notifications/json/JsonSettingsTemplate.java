// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Map;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSettingsTemplate extends qhh<nqp>
{
    @JsonField
    public nqp$d a;
    @JsonField
    public List<String> b;
    @JsonField
    public List<nqp$b> c;
    
    public final n4j t() {
        final nqp$a nqp$a = new nqp$a();
        nqp$a.a = this.a;
        nqp$a.b = this.b;
        nqp$a.c = this.c;
        return (n4j)nqp$a;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonNotificationSettingSectionEntry extends qhh<nqp$c>
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
        public String f;
        @JsonField
        public String g;
        @JsonField
        public List<Map<String, String>> h;
        @JsonField
        public List<String> i;
        @JsonField
        public String j;
        @JsonField
        public String k;
        @JsonField
        public String l;
        @JsonField
        public List<String> m;
        @JsonField
        public List<String> n;
        @JsonField
        public boolean o;
        
        public final n4j t() {
            final nqp$c$a nqp$c$a = new nqp$c$a();
            nqp$c$a.a = this.a;
            nqp$c$a.b = this.b;
            nqp$c$a.c = this.c;
            nqp$c$a.d = this.d;
            nqp$c$a.e = this.e;
            nqp$c$a.f = this.f;
            nqp$c$a.g = this.g;
            nqp$c$a.h = this.h;
            nqp$c$a.i = this.i;
            nqp$c$a.j = this.j;
            nqp$c$a.k = this.k;
            nqp$c$a.l = this.l;
            nqp$c$a.m = this.m;
            nqp$c$a.n = this.n;
            nqp$c$a.o = this.o;
            return (n4j)nqp$c$a;
        }
    }
    
    @JsonObject
    public static class JsonSettingsTemplateDoc extends qhh<nqp$d>
    {
        @JsonField
        public String a;
        @JsonField
        public String b;
        @JsonField
        public String c;
        
        public final n4j t() {
            final nqp$d$a nqp$d$a = new nqp$d$a();
            nqp$d$a.a = this.a;
            nqp$d$a.b = this.b;
            nqp$d$a.c = this.c;
            return (n4j)nqp$d$a;
        }
    }
}
