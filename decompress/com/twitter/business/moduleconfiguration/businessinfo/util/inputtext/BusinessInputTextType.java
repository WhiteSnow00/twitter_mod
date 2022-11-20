// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.util.inputtext;

import kotlinx.serialization.KSerializer;
import kotlin.Metadata;

@flp
@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f" }, d2 = { "Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType;", "", "(Ljava/lang/String;I)V", "PHONE", "EMAIL", "WEBSITE", "ADDRESS", "POSTAL_CODE", "CITY", "ADMIN_AREA", "$serializer", "Companion", "feature.tfa.business.module-configuration.business-info_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum BusinessInputTextType
{
    private static final BusinessInputTextType[] $VALUES;
    private static final qwe<KSerializer<Object>> $cachedSerializer$delegate;
    
    ADDRESS, 
    ADMIN_AREA, 
    CITY;
    
    public static final Companion Companion;
    
    EMAIL, 
    PHONE, 
    POSTAL_CODE, 
    WEBSITE;
    
    private static final BusinessInputTextType[] $values() {
        return new BusinessInputTextType[] { BusinessInputTextType.PHONE, BusinessInputTextType.EMAIL, BusinessInputTextType.WEBSITE, BusinessInputTextType.ADDRESS, BusinessInputTextType.POSTAL_CODE, BusinessInputTextType.CITY, BusinessInputTextType.ADMIN_AREA };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion();
        $cachedSerializer$delegate = pps.m(2, (nsb)BusinessInputTextType$a.D0);
    }
    
    public static final qwe access$get$cachedSerializer$delegate$cp() {
        return BusinessInputTextType.$cachedSerializer$delegate;
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType;", "serializer", "feature.tfa.business.module-configuration.business-info_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<BusinessInputTextType> serializer() {
            return (KSerializer<BusinessInputTextType>)BusinessInputTextType.access$get$cachedSerializer$delegate$cp().getValue();
        }
    }
}
