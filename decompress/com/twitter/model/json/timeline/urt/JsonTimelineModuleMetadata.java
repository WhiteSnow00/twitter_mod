// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineModuleMetadata extends tih<v0t>
{
    @JsonField
    public q0t a;
    @JsonField
    public t0t b;
    @JsonField
    public gat c;
    
    @Override
    public final Object s() {
        return new v0t(this.a, this.b, this.c);
    }
    
    @JsonObject
    public static class JsonTimelineModuleConversationMetadata extends tih<q0t>
    {
        @JsonField(name = { "allTweetIds" })
        public List<String> a;
        @JsonField
        public boolean b;
        @JsonField(typeConverter = d.class)
        public o5t c;
        
        @Override
        public final Object s() {
            return new q0t((List)this.a, this.b, ix.w(this.c));
        }
    }
    
    @JsonObject
    public static class JsonTimelineModuleGridCarouselMetadata extends tih<t0t>
    {
        @JsonField
        public int a;
        
        @Override
        public final Object s() {
            return new t0t(this.a);
        }
    }
    
    @JsonObject
    public static class JsonTimelineVerticalModuleMetadata extends tih<gat>
    {
        @JsonField
        public boolean a;
        
        @Override
        public final Object s() {
            return new gat(this.a);
        }
    }
}
