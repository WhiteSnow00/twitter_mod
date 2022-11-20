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
public class JsonFeatureSwitchesEmbeddedExperiment extends fih<mta>
{
    public static final SimpleDateFormat f;
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public List<mta$b> c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    
    static {
        f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ZZZZ", Locale.US);
    }
    
    public final Object s() {
        if (this.a == null) {
            i48.t("Invalid embedded experiment name");
        }
        else {
            try {
                final SimpleDateFormat f = JsonFeatureSwitchesEmbeddedExperiment.f;
                return new mta(this.a, this.b, gdd.g((List)this.c), f.parse(this.d), f.parse(this.e));
            }
            catch (final ParseException ex) {
                i48.t("Invalid embedded experiment timeframe");
            }
        }
        return null;
    }
    
    @JsonObject
    public static class JsonFeatureSwitchesBucket extends fih<mta$b>
    {
        @JsonField
        public String a;
        @JsonField
        public int b;
        
        public final Object s() {
            final String a = this.a;
            Object o;
            if (a == null) {
                i48.t("Invalid embedded bucket");
                o = null;
            }
            else {
                o = new mta$b(a, this.b);
            }
            return o;
        }
    }
}
