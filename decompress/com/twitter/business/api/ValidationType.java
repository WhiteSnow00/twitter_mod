// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\t\b\u0004?\u0006\u0004\b\t\u0010\nB\u001b\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r?\u0006\u0004\b\t\u0010\u000fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u0082\u0001\u0004\u0015\u0016\u0017\u0018?\u0006\u0019" }, d2 = { "Lcom/twitter/business/api/ValidationType;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "<init>", "()V", "", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILqkp;)V", "Companion", "Email", "Phone", "Price", "Website", "Lcom/twitter/business/api/ValidationType$Email;", "Lcom/twitter/business/api/ValidationType$Phone;", "Lcom/twitter/business/api/ValidationType$Price;", "Lcom/twitter/business/api/ValidationType$Website;", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public abstract class ValidationType
{
    private static final gxe<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    
    static {
        Companion = new Companion();
        $cachedSerializer$delegate = rp2.y0(2, (otb)ValidationType$a.C0);
    }
    
    private ValidationType() {
    }
    
    public static final /* synthetic */ gxe access$get$cachedSerializer$delegate$cp() {
        return ValidationType.$cachedSerializer$delegate;
    }
    
    public static final void write$Self(final ValidationType validationType, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)validationType, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001?\u0006\u0005" }, d2 = { "Lcom/twitter/business/api/ValidationType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/business/api/ValidationType;", "serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<ValidationType> serializer() {
            return (KSerializer<ValidationType>)ValidationType.access$get$cachedSerializer$delegate$cp().getValue();
        }
    }
}
