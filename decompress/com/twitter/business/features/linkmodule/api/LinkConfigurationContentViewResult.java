// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.features.linkmodule.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aB+\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\r\u0010\u0018¨\u0006!" }, d2 = { "Lcom/twitter/business/features/linkmodule/api/LinkConfigurationContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "component2", "modulesWereUpdated", "isFeatured", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "getModulesWereUpdated", "()Z", "<init>", "(ZZ)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(IZZLhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.features.link-module.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkConfigurationContentViewResult implements bn6
{
    public static final LinkConfigurationContentViewResult.LinkConfigurationContentViewResult$Companion Companion;
    private final boolean isFeatured;
    private final boolean modulesWereUpdated;
    
    static {
        Companion = new LinkConfigurationContentViewResult.LinkConfigurationContentViewResult$Companion();
    }
    
    public LinkConfigurationContentViewResult() {
        this(false, false, 3, null);
    }
    
    public LinkConfigurationContentViewResult(final int n, final boolean modulesWereUpdated, final boolean isFeatured, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.modulesWereUpdated = false;
            }
            else {
                this.modulesWereUpdated = modulesWereUpdated;
            }
            if ((n & 0x2) == 0x0) {
                this.isFeatured = false;
            }
            else {
                this.isFeatured = isFeatured;
            }
            return;
        }
        blz.a0(n, 0, LinkConfigurationContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public LinkConfigurationContentViewResult(final boolean modulesWereUpdated, final boolean isFeatured) {
        this.modulesWereUpdated = modulesWereUpdated;
        this.isFeatured = isFeatured;
    }
    
    public LinkConfigurationContentViewResult(boolean b, boolean b2, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        if ((n & 0x2) != 0x0) {
            b2 = false;
        }
        this(b, b2);
    }
    
    public static LinkConfigurationContentViewResult copy$default(final LinkConfigurationContentViewResult linkConfigurationContentViewResult, boolean modulesWereUpdated, boolean isFeatured, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            modulesWereUpdated = linkConfigurationContentViewResult.modulesWereUpdated;
        }
        if ((n & 0x2) != 0x0) {
            isFeatured = linkConfigurationContentViewResult.isFeatured;
        }
        return linkConfigurationContentViewResult.copy(modulesWereUpdated, isFeatured);
    }
    
    public static final void write$Self(final LinkConfigurationContentViewResult linkConfigurationContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)linkConfigurationContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (!linkConfigurationContentViewResult.modulesWereUpdated) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.R(serialDescriptor, 0, linkConfigurationContentViewResult.modulesWereUpdated);
        }
        int n2 = 0;
        Label_0093: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (!linkConfigurationContentViewResult.isFeatured) {
                    break Label_0093;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.R(serialDescriptor, 1, linkConfigurationContentViewResult.isFeatured);
        }
    }
    
    public final boolean component1() {
        return this.modulesWereUpdated;
    }
    
    public final boolean component2() {
        return this.isFeatured;
    }
    
    public final LinkConfigurationContentViewResult copy(final boolean b, final boolean b2) {
        return new LinkConfigurationContentViewResult(b, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkConfigurationContentViewResult)) {
            return false;
        }
        final LinkConfigurationContentViewResult linkConfigurationContentViewResult = (LinkConfigurationContentViewResult)o;
        return this.modulesWereUpdated == linkConfigurationContentViewResult.modulesWereUpdated && this.isFeatured == linkConfigurationContentViewResult.isFeatured;
    }
    
    public final boolean getModulesWereUpdated() {
        return this.modulesWereUpdated;
    }
    
    @Override
    public int hashCode() {
        final int modulesWereUpdated = this.modulesWereUpdated ? 1 : 0;
        int n = 1;
        int n2 = modulesWereUpdated;
        if (modulesWereUpdated != 0) {
            n2 = 1;
        }
        final int isFeatured = this.isFeatured ? 1 : 0;
        if (isFeatured == 0) {
            n = isFeatured;
        }
        return n2 * 31 + n;
    }
    
    public final boolean isFeatured() {
        return this.isFeatured;
    }
    
    @Override
    public String toString() {
        return da8.k("LinkConfigurationContentViewResult(modulesWereUpdated=", this.modulesWereUpdated, ", isFeatured=", this.isFeatured, ")");
    }
}
