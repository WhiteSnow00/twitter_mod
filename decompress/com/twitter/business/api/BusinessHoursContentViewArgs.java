// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import com.twitter.business.model.hours.BusinessHoursData$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Objects;
import com.twitter.business.model.hours.BusinessHoursData;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 " }, d2 = { "Lcom/twitter/business/api/BusinessHoursContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lcom/twitter/business/model/hours/BusinessHoursData;", "component1", "businessHoursData", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/business/model/hours/BusinessHoursData;", "getBusinessHoursData", "()Lcom/twitter/business/model/hours/BusinessHoursData;", "<init>", "(Lcom/twitter/business/model/hours/BusinessHoursData;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILcom/twitter/business/model/hours/BusinessHoursData;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessHoursContentViewArgs implements ContentViewArgs
{
    public static final BusinessHoursContentViewArgs.BusinessHoursContentViewArgs$Companion Companion;
    private final BusinessHoursData businessHoursData;
    
    static {
        Companion = new BusinessHoursContentViewArgs.BusinessHoursContentViewArgs$Companion();
    }
    
    public BusinessHoursContentViewArgs() {
        this(null, 1, null);
    }
    
    public BusinessHoursContentViewArgs(final int n, final BusinessHoursData businessHoursData, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                Objects.requireNonNull(BusinessHoursData.Companion);
                this.businessHoursData = BusinessHoursData.access$getNO_HOURS$cp();
            }
            else {
                this.businessHoursData = businessHoursData;
            }
            return;
        }
        blz.a0(n, 0, BusinessHoursContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessHoursContentViewArgs(final BusinessHoursData businessHoursData) {
        czd.f((Object)businessHoursData, "businessHoursData");
        this.businessHoursData = businessHoursData;
    }
    
    public BusinessHoursContentViewArgs(BusinessHoursData access$getNO_HOURS$cp, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            Objects.requireNonNull(BusinessHoursData.Companion);
            access$getNO_HOURS$cp = BusinessHoursData.access$getNO_HOURS$cp();
        }
        this(access$getNO_HOURS$cp);
    }
    
    public static BusinessHoursContentViewArgs copy$default(final BusinessHoursContentViewArgs businessHoursContentViewArgs, BusinessHoursData businessHoursData, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            businessHoursData = businessHoursContentViewArgs.businessHoursData;
        }
        return businessHoursContentViewArgs.copy(businessHoursData);
    }
    
    public static final void write$Self(final BusinessHoursContentViewArgs businessHoursContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)businessHoursContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        boolean b = false;
        Label_0062: {
            if (!xc6.z(serialDescriptor)) {
                final BusinessHoursData businessHoursData = businessHoursContentViewArgs.businessHoursData;
                Objects.requireNonNull(BusinessHoursData.Companion);
                if (czd.a((Object)businessHoursData, (Object)BusinessHoursData.access$getNO_HOURS$cp())) {
                    b = false;
                    break Label_0062;
                }
            }
            b = true;
        }
        if (b) {
            xc6.T(serialDescriptor, 0, (jlp)BusinessHoursData$$serializer.INSTANCE, (Object)businessHoursContentViewArgs.businessHoursData);
        }
    }
    
    public final BusinessHoursData component1() {
        return this.businessHoursData;
    }
    
    public final BusinessHoursContentViewArgs copy(final BusinessHoursData businessHoursData) {
        czd.f((Object)businessHoursData, "businessHoursData");
        return new BusinessHoursContentViewArgs(businessHoursData);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof BusinessHoursContentViewArgs && czd.a((Object)this.businessHoursData, (Object)((BusinessHoursContentViewArgs)o).businessHoursData));
    }
    
    public final BusinessHoursData getBusinessHoursData() {
        return this.businessHoursData;
    }
    
    @Override
    public int hashCode() {
        return this.businessHoursData.hashCode();
    }
    
    @Override
    public String toString() {
        final BusinessHoursData businessHoursData = this.businessHoursData;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessHoursContentViewArgs(businessHoursData=");
        sb.append(businessHoursData);
        sb.append(")");
        return sb.toString();
    }
}
