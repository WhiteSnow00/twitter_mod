// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineModuleMetadata extends aih<mzs>
{
    @JsonField
    public hzs a;
    @JsonField
    public kzs b;
    @JsonField
    public u8t c;
    
    @Override
    public final Object s() {
        return new mzs(this.a, this.b, this.c);
    }
    
    @JsonObject
    public static class JsonTimelineModuleConversationMetadata extends aih<hzs>
    {
        @JsonField(name = { "allTweetIds" })
        public List<String> a;
        @JsonField
        public boolean b;
        @JsonField(typeConverter = d.class)
        public d4t c;
        
        @Override
        public final Object s() {
            return new hzs(this.a, this.b, poa.V(this.c));
        }
    }
    
    @JsonObject
    public static class JsonTimelineModuleGridCarouselMetadata extends aih<kzs>
    {
        @JsonField
        public int a;
        
        @Override
        public final Object s() {
            return new kzs(this.a);
        }
    }
    
    @JsonObject
    public static class JsonTimelineVerticalModuleMetadata extends aih<u8t>
    {
        @JsonField
        public boolean a;
        
        @Override
        public final Object s() {
            return new u8t(this.a);
        }
    }
}
