// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.features.linkmodule.api;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b \u0010!B5\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000bH\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006(" }, d2 = { "Lcom/twitter/business/features/linkmodule/api/LinkModuleConfigurationContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "Lcom/twitter/business/features/linkmodule/model/LinkModuleDomainConfig;", "component1", "", "component2", "component3", "linkModuleDomainConfig", "visibleOnCreation", "hasFeaturedSpotlight", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Lcom/twitter/business/features/linkmodule/model/LinkModuleDomainConfig;", "getLinkModuleDomainConfig", "()Lcom/twitter/business/features/linkmodule/model/LinkModuleDomainConfig;", "Z", "getVisibleOnCreation", "()Z", "getHasFeaturedSpotlight", "<init>", "(Lcom/twitter/business/features/linkmodule/model/LinkModuleDomainConfig;ZZ)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILcom/twitter/business/features/linkmodule/model/LinkModuleDomainConfig;ZZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.business.features.link-module.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkModuleConfigurationContentViewArgs implements ContentViewArgs
{
    public static final LinkModuleConfigurationContentViewArgs.LinkModuleConfigurationContentViewArgs$Companion Companion;
    private final boolean hasFeaturedSpotlight;
    private final LinkModuleDomainConfig linkModuleDomainConfig;
    private final boolean visibleOnCreation;
    
    static {
        Companion = new LinkModuleConfigurationContentViewArgs.LinkModuleConfigurationContentViewArgs$Companion();
    }
    
    public LinkModuleConfigurationContentViewArgs() {
        this(null, false, false, 7, null);
    }
    
    public LinkModuleConfigurationContentViewArgs(final int n, LinkModuleDomainConfig linkModuleDomainConfig, final boolean visibleOnCreation, final boolean hasFeaturedSpotlight, final dmp dmp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                linkModuleDomainConfig = new LinkModuleDomainConfig((String)null, (v93)null, (String)null, 7, (wg8)null);
            }
            this.linkModuleDomainConfig = linkModuleDomainConfig;
            if ((n & 0x2) == 0x0) {
                this.visibleOnCreation = true;
            }
            else {
                this.visibleOnCreation = visibleOnCreation;
            }
            if ((n & 0x4) == 0x0) {
                this.hasFeaturedSpotlight = false;
            }
            else {
                this.hasFeaturedSpotlight = hasFeaturedSpotlight;
            }
            return;
        }
        shw.V0(n, 0, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public LinkModuleConfigurationContentViewArgs(final LinkModuleDomainConfig linkModuleDomainConfig, final boolean visibleOnCreation, final boolean hasFeaturedSpotlight) {
        e0e.f((Object)linkModuleDomainConfig, "linkModuleDomainConfig");
        this.linkModuleDomainConfig = linkModuleDomainConfig;
        this.visibleOnCreation = visibleOnCreation;
        this.hasFeaturedSpotlight = hasFeaturedSpotlight;
    }
    
    public LinkModuleConfigurationContentViewArgs(LinkModuleDomainConfig linkModuleDomainConfig, boolean b, boolean b2, final int n, final wg8 wg8) {
        if ((n & 0x1) != 0x0) {
            linkModuleDomainConfig = new LinkModuleDomainConfig((String)null, (v93)null, (String)null, 7, (wg8)null);
        }
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        if ((n & 0x4) != 0x0) {
            b2 = false;
        }
        this(linkModuleDomainConfig, b, b2);
    }
    
    public static LinkModuleConfigurationContentViewArgs copy$default(final LinkModuleConfigurationContentViewArgs linkModuleConfigurationContentViewArgs, LinkModuleDomainConfig linkModuleDomainConfig, boolean visibleOnCreation, boolean hasFeaturedSpotlight, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            linkModuleDomainConfig = linkModuleConfigurationContentViewArgs.linkModuleDomainConfig;
        }
        if ((n & 0x2) != 0x0) {
            visibleOnCreation = linkModuleConfigurationContentViewArgs.visibleOnCreation;
        }
        if ((n & 0x4) != 0x0) {
            hasFeaturedSpotlight = linkModuleConfigurationContentViewArgs.hasFeaturedSpotlight;
        }
        return linkModuleConfigurationContentViewArgs.copy(linkModuleDomainConfig, visibleOnCreation, hasFeaturedSpotlight);
    }
    
    public static final void write$Self(final LinkModuleConfigurationContentViewArgs linkModuleConfigurationContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)linkModuleConfigurationContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        final boolean z = ee6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0068: {
            if (!z) {
                if (e0e.a((Object)linkModuleConfigurationContentViewArgs.linkModuleDomainConfig, (Object)new LinkModuleDomainConfig((String)null, (v93)null, (String)null, 7, (wg8)null))) {
                    b = false;
                    break Label_0068;
                }
            }
            b = true;
        }
        if (b) {
            ee6.T(serialDescriptor, 0, (fmp)LinkModuleDomainConfig.$serializer.INSTANCE, (Object)linkModuleConfigurationContentViewArgs.linkModuleDomainConfig);
        }
        boolean b2 = false;
        Label_0115: {
            if (!ee6.z(serialDescriptor)) {
                if (linkModuleConfigurationContentViewArgs.visibleOnCreation) {
                    b2 = false;
                    break Label_0115;
                }
            }
            b2 = true;
        }
        if (b2) {
            ee6.R(serialDescriptor, 1, linkModuleConfigurationContentViewArgs.visibleOnCreation);
        }
        int n2 = 0;
        Label_0156: {
            if (!ee6.z(serialDescriptor)) {
                n2 = n;
                if (!linkModuleConfigurationContentViewArgs.hasFeaturedSpotlight) {
                    break Label_0156;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            ee6.R(serialDescriptor, 2, linkModuleConfigurationContentViewArgs.hasFeaturedSpotlight);
        }
    }
    
    public final LinkModuleDomainConfig component1() {
        return this.linkModuleDomainConfig;
    }
    
    public final boolean component2() {
        return this.visibleOnCreation;
    }
    
    public final boolean component3() {
        return this.hasFeaturedSpotlight;
    }
    
    public final LinkModuleConfigurationContentViewArgs copy(final LinkModuleDomainConfig linkModuleDomainConfig, final boolean b, final boolean b2) {
        e0e.f((Object)linkModuleDomainConfig, "linkModuleDomainConfig");
        return new LinkModuleConfigurationContentViewArgs(linkModuleDomainConfig, b, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkModuleConfigurationContentViewArgs)) {
            return false;
        }
        final LinkModuleConfigurationContentViewArgs linkModuleConfigurationContentViewArgs = (LinkModuleConfigurationContentViewArgs)o;
        return e0e.a((Object)this.linkModuleDomainConfig, (Object)linkModuleConfigurationContentViewArgs.linkModuleDomainConfig) && this.visibleOnCreation == linkModuleConfigurationContentViewArgs.visibleOnCreation && this.hasFeaturedSpotlight == linkModuleConfigurationContentViewArgs.hasFeaturedSpotlight;
    }
    
    public final boolean getHasFeaturedSpotlight() {
        return this.hasFeaturedSpotlight;
    }
    
    public final LinkModuleDomainConfig getLinkModuleDomainConfig() {
        return this.linkModuleDomainConfig;
    }
    
    public final boolean getVisibleOnCreation() {
        return this.visibleOnCreation;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.linkModuleDomainConfig.hashCode();
        final int visibleOnCreation = this.visibleOnCreation ? 1 : 0;
        int n = 1;
        int n2 = visibleOnCreation;
        if (visibleOnCreation != 0) {
            n2 = 1;
        }
        final int hasFeaturedSpotlight = this.hasFeaturedSpotlight ? 1 : 0;
        if (hasFeaturedSpotlight == 0) {
            n = hasFeaturedSpotlight;
        }
        return (hashCode * 31 + n2) * 31 + n;
    }
    
    @Override
    public String toString() {
        final LinkModuleDomainConfig linkModuleDomainConfig = this.linkModuleDomainConfig;
        final boolean visibleOnCreation = this.visibleOnCreation;
        final boolean hasFeaturedSpotlight = this.hasFeaturedSpotlight;
        final StringBuilder sb = new StringBuilder();
        sb.append("LinkModuleConfigurationContentViewArgs(linkModuleDomainConfig=");
        sb.append(linkModuleDomainConfig);
        sb.append(", visibleOnCreation=");
        sb.append(visibleOnCreation);
        sb.append(", hasFeaturedSpotlight=");
        return xj0.B(sb, hasFeaturedSpotlight, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/business/features/linkmodule/api/LinkModuleConfigurationContentViewArgs.$serializer", "Lezb;", "Lcom/twitter/business/features/linkmodule/api/LinkModuleConfigurationContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.business.features.link-module.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<LinkModuleConfigurationContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.business.features.linkmodule.api.LinkModuleConfigurationContentViewArgs", (ezb)(INSTANCE = new $serializer()), 3);
            descriptor2.k("linkModuleDomainConfig", true);
            descriptor2.k("visibleOnCreation", true);
            descriptor2.k("hasFeaturedSpotlight", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final LinkModuleDomainConfig.$serializer instance = LinkModuleDomainConfig.$serializer.INSTANCE;
            final p72 a = p72.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)instance, (KSerializer)a, (KSerializer)a };
        }
        
        public LinkModuleConfigurationContentViewArgs deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object x = null;
            int i = 1;
            int n = 0;
            boolean b = false;
            boolean b2 = false;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                throw new UnknownFieldException(o);
                            }
                            b2 = c.B(descriptor, 2);
                            n |= 0x4;
                        }
                        else {
                            b = c.B(descriptor, 1);
                            n |= 0x2;
                        }
                    }
                    else {
                        x = c.x(descriptor, 0, (DeserializationStrategy)LinkModuleDomainConfig.$serializer.INSTANCE, x);
                        n |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new LinkModuleConfigurationContentViewArgs(n, (LinkModuleDomainConfig)x, b, b2, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final LinkModuleConfigurationContentViewArgs linkModuleConfigurationContentViewArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)linkModuleConfigurationContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            LinkModuleConfigurationContentViewArgs.write$Self(linkModuleConfigurationContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (LinkModuleConfigurationContentViewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
