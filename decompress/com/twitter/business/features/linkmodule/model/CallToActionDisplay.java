// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.features.linkmodule.model;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001d\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001c\u0010\u001dB/\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006$" }, d2 = { "Lcom/twitter/business/features/linkmodule/model/CallToActionDisplay;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "Lk93;", "component1", "", "component2", "cta", "localizedCtaDisplay", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getLocalizedCtaDisplay", "()Ljava/lang/String;", "Lk93;", "getCta", "()Lk93;", "<init>", "(Lk93;Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILk93;Ljava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.business.features.link-module.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class CallToActionDisplay
{
    public static final Companion Companion;
    public static final s4j<CallToActionDisplay> SERIALIZER;
    private final k93 cta;
    private final String localizedCtaDisplay;
    
    static {
        Companion = new Companion();
        SERIALIZER = (s4j)new CallToActionDisplay$a();
    }
    
    public CallToActionDisplay() {
        this(null, null, 3, null);
    }
    
    public CallToActionDisplay(final k93 cta, final String localizedCtaDisplay) {
        zzd.f((Object)cta, "cta");
        this.cta = cta;
        this.localizedCtaDisplay = localizedCtaDisplay;
    }
    
    public static final void write$Self(final CallToActionDisplay callToActionDisplay, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)callToActionDisplay, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = sd6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0055: {
            if (!z) {
                if (callToActionDisplay.cta == k93.M0) {
                    b = false;
                    break Label_0055;
                }
            }
            b = true;
        }
        if (b) {
            sd6.T(serialDescriptor, 0, (skp)new f8a("com.twitter.business.features.linkmodule.model.CallToAction", (Enum[])k93.values()), (Object)callToActionDisplay.cta);
        }
        int n2 = 0;
        Label_0111: {
            if (!sd6.z(serialDescriptor)) {
                n2 = n;
                if (callToActionDisplay.localizedCtaDisplay == null) {
                    break Label_0111;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            sd6.x(serialDescriptor, 1, (skp)njr.a, (Object)callToActionDisplay.localizedCtaDisplay);
        }
    }
    
    public final k93 component1() {
        return this.cta;
    }
    
    public final String component2() {
        return this.localizedCtaDisplay;
    }
    
    public final CallToActionDisplay copy(final k93 k93, final String s) {
        zzd.f((Object)k93, "cta");
        return new CallToActionDisplay(k93, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CallToActionDisplay)) {
            return false;
        }
        final CallToActionDisplay callToActionDisplay = (CallToActionDisplay)o;
        return this.cta == callToActionDisplay.cta && zzd.a((Object)this.localizedCtaDisplay, (Object)callToActionDisplay.localizedCtaDisplay);
    }
    
    public final k93 getCta() {
        return this.cta;
    }
    
    public final String getLocalizedCtaDisplay() {
        return this.localizedCtaDisplay;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.cta.hashCode();
        final String localizedCtaDisplay = this.localizedCtaDisplay;
        int hashCode2;
        if (localizedCtaDisplay == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = localizedCtaDisplay.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final k93 cta = this.cta;
        final String localizedCtaDisplay = this.localizedCtaDisplay;
        final StringBuilder sb = new StringBuilder();
        sb.append("CallToActionDisplay(cta=");
        sb.append(cta);
        sb.append(", localizedCtaDisplay=");
        sb.append(localizedCtaDisplay);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/business/features/linkmodule/model/CallToActionDisplay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/business/features/linkmodule/model/CallToActionDisplay;", "serializer", "Ls4j;", "SERIALIZER", "Ls4j;", "subsystem.tfa.business.features.link-module.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<CallToActionDisplay> serializer() {
            return (KSerializer<CallToActionDisplay>)CallToActionDisplay$$serializer.INSTANCE;
        }
    }
}
