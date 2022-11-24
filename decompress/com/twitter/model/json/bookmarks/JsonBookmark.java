// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.bookmarks;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonBookmark extends tih<r42>
{
    @JsonField(name = { "response" })
    public r42$a a;
    
    @Override
    public final Object s() {
        return new r42();
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static final class JsonMetadata extends tih<r42$a>
    {
        @JsonField(name = { "errors" })
        public List<r42$a$a> a;
        
        @Override
        public final Object s() {
            return new r42$a((List)this.a);
        }
        
        @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        public static final class JsonError extends tih<r42$a$a>
        {
            @JsonField(name = { "reason" })
            public String a;
            
            @Override
            public final Object s() {
                return new r42$a$a();
            }
        }
    }
}
