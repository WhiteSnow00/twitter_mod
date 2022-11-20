// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.features.linkmodule.model;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b*\u0010+B9\b\u0017\u0012\u0006\u0010,\u001a\u00020\u0019\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u00c7\u0001J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J+\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003R$\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010\u0015\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00062" }, d2 = { "Lcom/twitter/business/features/linkmodule/model/LinkModuleDomainConfig;", "Lblh;", "", "hasCta", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "hasModuleId", "hasData", "hasMandatoryData", "clearAllData", "", "component1", "Ld93;", "component2", "component3", "currentModuleId", "cta", "url", "copy", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getCurrentModuleId", "()Ljava/lang/String;", "setCurrentModuleId", "(Ljava/lang/String;)V", "getUrl", "setUrl", "Ld93;", "getCta", "()Ld93;", "setCta", "(Ld93;)V", "<init>", "(Ljava/lang/String;Ld93;Ljava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ld93;Ljava/lang/String;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.features.link-module.model_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkModuleDomainConfig implements blh
{
    public static final LinkModuleDomainConfig.LinkModuleDomainConfig$Companion Companion;
    public static final y4j<LinkModuleDomainConfig> SERIALIZER;
    private d93 cta;
    private String currentModuleId;
    private String url;
    
    static {
        Companion = new LinkModuleDomainConfig.LinkModuleDomainConfig$Companion();
        SERIALIZER = new y4j<LinkModuleDomainConfig>() {
            public final Object d(final vlp vlp, final int n) {
                czd.f((Object)vlp, "input");
                final String g = vlp.G();
                d93 n2;
                if ((n2 = (d93)((y4j)d93.E0).a(vlp)) == null) {
                    n2 = d93.N0;
                }
                return new LinkModuleDomainConfig(g, n2, vlp.G());
            }
            
            public final void f(final wlp wlp, final Object o) {
                final LinkModuleDomainConfig linkModuleDomainConfig = (LinkModuleDomainConfig)o;
                czd.f((Object)wlp, "output");
                czd.f((Object)linkModuleDomainConfig, "data");
                wlp.E(linkModuleDomainConfig.getCurrentModuleId());
                wlp.A((Object)linkModuleDomainConfig.getCta(), (rlp)d93.E0);
                wlp.E(linkModuleDomainConfig.getUrl());
            }
        };
    }
    
    public LinkModuleDomainConfig() {
        this(null, null, null, 7, null);
    }
    
    public LinkModuleDomainConfig(final int n, final String currentModuleId, final d93 cta, final String url, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.currentModuleId = null;
            }
            else {
                this.currentModuleId = currentModuleId;
            }
            if ((n & 0x2) == 0x0) {
                this.cta = d93.N0;
            }
            else {
                this.cta = cta;
            }
            if ((n & 0x4) == 0x0) {
                this.url = null;
            }
            else {
                this.url = url;
            }
            return;
        }
        blz.a0(n, 0, LinkModuleDomainConfig$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public LinkModuleDomainConfig(final String currentModuleId, final d93 cta, final String url) {
        czd.f((Object)cta, "cta");
        this.currentModuleId = currentModuleId;
        this.cta = cta;
        this.url = url;
    }
    
    public LinkModuleDomainConfig(String s, d93 n0, String s2, final int n2, final rf8 rf8) {
        if ((n2 & 0x1) != 0x0) {
            s = null;
        }
        if ((n2 & 0x2) != 0x0) {
            n0 = d93.N0;
        }
        if ((n2 & 0x4) != 0x0) {
            s2 = null;
        }
        this(s, n0, s2);
    }
    
    public static LinkModuleDomainConfig copy$default(final LinkModuleDomainConfig linkModuleDomainConfig, String currentModuleId, d93 cta, String url, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            currentModuleId = linkModuleDomainConfig.currentModuleId;
        }
        if ((n & 0x2) != 0x0) {
            cta = linkModuleDomainConfig.cta;
        }
        if ((n & 0x4) != 0x0) {
            url = linkModuleDomainConfig.url;
        }
        return linkModuleDomainConfig.copy(currentModuleId, cta, url);
    }
    
    private final boolean hasCta() {
        return this.cta != d93.N0;
    }
    
    public static final void write$Self(final LinkModuleDomainConfig linkModuleDomainConfig, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)linkModuleDomainConfig, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (linkModuleDomainConfig.currentModuleId == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)gkr.a, (Object)linkModuleDomainConfig.currentModuleId);
        }
        boolean b2 = false;
        Label_0101: {
            if (!xc6.z(serialDescriptor)) {
                if (linkModuleDomainConfig.cta == d93.N0) {
                    b2 = false;
                    break Label_0101;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.T(serialDescriptor, 1, (jlp)new o7a("com.twitter.business.features.linkmodule.model.CallToAction", (Enum[])d93.values()), (Object)linkModuleDomainConfig.cta);
        }
        int n2 = 0;
        Label_0154: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (linkModuleDomainConfig.url == null) {
                    break Label_0154;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 2, (jlp)gkr.a, (Object)linkModuleDomainConfig.url);
        }
    }
    
    public final void clearAllData() {
        this.currentModuleId = null;
        this.cta = d93.N0;
        this.url = null;
    }
    
    public final String component1() {
        return this.currentModuleId;
    }
    
    public final d93 component2() {
        return this.cta;
    }
    
    public final String component3() {
        return this.url;
    }
    
    public final LinkModuleDomainConfig copy(final String s, final d93 d93, final String s2) {
        czd.f((Object)d93, "cta");
        return new LinkModuleDomainConfig(s, d93, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkModuleDomainConfig)) {
            return false;
        }
        final LinkModuleDomainConfig linkModuleDomainConfig = (LinkModuleDomainConfig)o;
        return czd.a((Object)this.currentModuleId, (Object)linkModuleDomainConfig.currentModuleId) && this.cta == linkModuleDomainConfig.cta && czd.a((Object)this.url, (Object)linkModuleDomainConfig.url);
    }
    
    public final d93 getCta() {
        return this.cta;
    }
    
    public final String getCurrentModuleId() {
        return this.currentModuleId;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    public final boolean hasData() {
        return this.hasCta() || this.url != null;
    }
    
    public final boolean hasMandatoryData() {
        return this.hasCta() && ikr.g((CharSequence)this.url);
    }
    
    public final boolean hasModuleId() {
        return this.currentModuleId != null;
    }
    
    @Override
    public int hashCode() {
        final String currentModuleId = this.currentModuleId;
        int hashCode = 0;
        int hashCode2;
        if (currentModuleId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = currentModuleId.hashCode();
        }
        final int hashCode3 = this.cta.hashCode();
        final String url = this.url;
        if (url != null) {
            hashCode = url.hashCode();
        }
        return (hashCode3 + hashCode2 * 31) * 31 + hashCode;
    }
    
    public final void setCta(final d93 cta) {
        czd.f((Object)cta, "<set-?>");
        this.cta = cta;
    }
    
    public final void setCurrentModuleId(final String currentModuleId) {
        this.currentModuleId = currentModuleId;
    }
    
    public final void setUrl(final String url) {
        this.url = url;
    }
    
    @Override
    public String toString() {
        final String currentModuleId = this.currentModuleId;
        final d93 cta = this.cta;
        final String url = this.url;
        final StringBuilder sb = new StringBuilder();
        sb.append("LinkModuleDomainConfig(currentModuleId=");
        sb.append(currentModuleId);
        sb.append(", cta=");
        sb.append(cta);
        sb.append(", url=");
        return ed.B(sb, url, ")");
    }
}
