// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.text.ParseException;
import java.util.Locale;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.text.SimpleDateFormat;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFeatureSwitchesEmbeddedExperiment extends tih<tua>
{
    public static final SimpleDateFormat f;
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public List<tua$b> c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    
    static {
        f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ZZZZ", Locale.US);
    }
    
    @Override
    public final Object s() {
        if (this.a == null) {
            mqb.o("Invalid embedded experiment name");
        }
        else {
            try {
                final SimpleDateFormat f = JsonFeatureSwitchesEmbeddedExperiment.f;
                return new tua(this.a, this.b, ged.g((List)this.c), f.parse(this.d), f.parse(this.e));
            }
            catch (final ParseException ex) {
                mqb.o("Invalid embedded experiment timeframe");
            }
        }
        return null;
    }
    
    @JsonObject
    public static class JsonFeatureSwitchesBucket extends tih<tua$b>
    {
        @JsonField
        public String a;
        @JsonField
        public int b;
        
        @Override
        public final Object s() {
            final String a = this.a;
            Object o;
            if (a == null) {
                mqb.o("Invalid embedded bucket");
                o = null;
            }
            else {
                o = new tua$b(a, this.b);
            }
            return o;
        }
    }
}
