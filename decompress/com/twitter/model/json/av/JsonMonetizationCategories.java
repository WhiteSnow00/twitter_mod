// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.av;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.FIELD_NAME)
public class JsonMonetizationCategories extends tih<gz>
{
    @JsonField
    public List<sqh> a;
    @JsonField
    public List<sqh> b;
    
    @Override
    public final Object s() {
        return new gz(this.a, this.b, 0);
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.FIELD_NAME)
    public static class JsonMonetizationCategory extends tih<sqh>
    {
        @JsonField
        public Integer a;
        @JsonField
        public String b;
        
        @Override
        public final Object s() {
            return new sqh((int)this.a, this.b);
        }
    }
}
