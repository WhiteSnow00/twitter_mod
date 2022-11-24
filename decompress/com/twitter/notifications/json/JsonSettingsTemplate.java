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
public class JsonSettingsTemplate extends eih<irp>
{
    @JsonField
    public irp$d a;
    @JsonField
    public List<String> b;
    @JsonField
    public List<irp$b> c;
    
    public final z4j t() {
        final irp$a irp$a = new irp$a();
        irp$a.a = this.a;
        irp$a.b = this.b;
        irp$a.c = this.c;
        return (z4j)irp$a;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonNotificationSettingSection extends eih<irp$b>
    {
        @JsonField
        public String a;
        @JsonField
        public String b;
        @JsonField
        public List<irp$c> c;
        
        public final z4j t() {
            final irp$b$a irp$b$a = new irp$b$a();
            irp$b$a.a = this.a;
            irp$b$a.b = this.b;
            irp$b$a.c = this.c;
            return (z4j)irp$b$a;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonNotificationSettingSectionEntry extends eih<irp$c>
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
        
        public final z4j t() {
            final irp$c$a irp$c$a = new irp$c$a();
            irp$c$a.a = this.a;
            irp$c$a.b = this.b;
            irp$c$a.c = this.c;
            irp$c$a.d = this.d;
            irp$c$a.e = this.e;
            irp$c$a.f = this.f;
            irp$c$a.g = this.g;
            irp$c$a.h = this.h;
            irp$c$a.i = this.i;
            irp$c$a.j = this.j;
            irp$c$a.k = this.k;
            irp$c$a.l = this.l;
            irp$c$a.m = this.m;
            irp$c$a.n = this.n;
            irp$c$a.o = this.o;
            return (z4j)irp$c$a;
        }
    }
    
    @JsonObject
    public static class JsonSettingsTemplateDoc extends eih<irp$d>
    {
        @JsonField
        public String a;
        @JsonField
        public String b;
        @JsonField
        public String c;
        
        public final z4j t() {
            final irp$d$a irp$d$a = new irp$d$a();
            irp$d$a.a = this.a;
            irp$d$a.b = this.b;
            irp$d$a.c = this.c;
            return (z4j)irp$d$a;
        }
    }
}
