// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule.util.inputtext;

import kotlinx.serialization.KSerializer;
import kotlin.Metadata;

@flp
@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0007" }, d2 = { "Lcom/twitter/business/moduleconfiguration/mobileappmodule/util/inputtext/MobileAppPlatformType;", "", "(Ljava/lang/String;I)V", "GOOGLE", "APPLE", "$serializer", "Companion", "feature.tfa.business.module-configuration.mobile-app-module_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum MobileAppPlatformType
{
    private static final MobileAppPlatformType[] $VALUES;
    private static final qwe<KSerializer<Object>> $cachedSerializer$delegate;
    
    APPLE;
    
    public static final Companion Companion;
    
    GOOGLE;
    
    private static final MobileAppPlatformType[] $values() {
        return new MobileAppPlatformType[] { MobileAppPlatformType.GOOGLE, MobileAppPlatformType.APPLE };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion();
        $cachedSerializer$delegate = pps.m(2, (nsb)MobileAppPlatformType$a.D0);
    }
    
    public static final qwe access$get$cachedSerializer$delegate$cp() {
        return MobileAppPlatformType.$cachedSerializer$delegate;
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/business/moduleconfiguration/mobileappmodule/util/inputtext/MobileAppPlatformType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/business/moduleconfiguration/mobileappmodule/util/inputtext/MobileAppPlatformType;", "serializer", "feature.tfa.business.module-configuration.mobile-app-module_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<MobileAppPlatformType> serializer() {
            return (KSerializer<MobileAppPlatformType>)MobileAppPlatformType.access$get$cachedSerializer$delegate$cp().getValue();
        }
    }
}
