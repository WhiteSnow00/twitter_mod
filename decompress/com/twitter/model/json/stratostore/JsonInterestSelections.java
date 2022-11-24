// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonInterestSelections extends nge
{
    @JsonField
    public List<JsonInterestSelection> a;
    
    @JsonObject
    public static class FreeFormInterest extends nge
    {
        @JsonField
        public String a;
    }
    
    @JsonObject
    public static class JsonInterest extends nge
    {
        @JsonField
        public TaxonomyBasedInterest a;
        @JsonField
        public FreeFormInterest b;
    }
    
    @JsonObject
    public static class JsonInterestSelection extends nge
    {
        @JsonField
        public JsonInterest a;
        @JsonField
        public vmq b;
        @JsonField
        public String c;
        @JsonField
        public String d;
        @JsonField
        public String e;
        @JsonField
        public String f;
    }
    
    @JsonObject
    public static class TaxonomyBasedInterest extends nge
    {
        @JsonField
        public String a;
    }
}
