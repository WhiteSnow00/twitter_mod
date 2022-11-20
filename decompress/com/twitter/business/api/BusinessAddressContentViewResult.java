// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import com.twitter.business.model.address.BusinessAddressInfoData$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.model.address.BusinessAddressInfoData;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 " }, d2 = { "Lcom/twitter/business/api/BusinessAddressContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lcom/twitter/business/model/address/BusinessAddressInfoData;", "component1", "addressData", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/business/model/address/BusinessAddressInfoData;", "getAddressData", "()Lcom/twitter/business/model/address/BusinessAddressInfoData;", "<init>", "(Lcom/twitter/business/model/address/BusinessAddressInfoData;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILcom/twitter/business/model/address/BusinessAddressInfoData;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessAddressContentViewResult implements bn6
{
    public static final BusinessAddressContentViewResult.BusinessAddressContentViewResult$Companion Companion;
    private final BusinessAddressInfoData addressData;
    
    static {
        Companion = new BusinessAddressContentViewResult.BusinessAddressContentViewResult$Companion();
    }
    
    public BusinessAddressContentViewResult(final int n, final BusinessAddressInfoData addressData, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.addressData = addressData;
            return;
        }
        blz.a0(n, 1, BusinessAddressContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessAddressContentViewResult(final BusinessAddressInfoData addressData) {
        this.addressData = addressData;
    }
    
    public static BusinessAddressContentViewResult copy$default(final BusinessAddressContentViewResult businessAddressContentViewResult, BusinessAddressInfoData addressData, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            addressData = businessAddressContentViewResult.addressData;
        }
        return businessAddressContentViewResult.copy(addressData);
    }
    
    public static final void write$Self(final BusinessAddressContentViewResult businessAddressContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)businessAddressContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.y(serialDescriptor, 0, (jlp)BusinessAddressInfoData$$serializer.INSTANCE, (Object)businessAddressContentViewResult.addressData);
    }
    
    public final BusinessAddressInfoData component1() {
        return this.addressData;
    }
    
    public final BusinessAddressContentViewResult copy(final BusinessAddressInfoData businessAddressInfoData) {
        return new BusinessAddressContentViewResult(businessAddressInfoData);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof BusinessAddressContentViewResult && czd.a((Object)this.addressData, (Object)((BusinessAddressContentViewResult)o).addressData));
    }
    
    public final BusinessAddressInfoData getAddressData() {
        return this.addressData;
    }
    
    @Override
    public int hashCode() {
        final BusinessAddressInfoData addressData = this.addressData;
        int hashCode;
        if (addressData == null) {
            hashCode = 0;
        }
        else {
            hashCode = addressData.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final BusinessAddressInfoData addressData = this.addressData;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessAddressContentViewResult(addressData=");
        sb.append(addressData);
        sb.append(")");
        return sb.toString();
    }
}
