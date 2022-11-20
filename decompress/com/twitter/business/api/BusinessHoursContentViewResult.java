// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import com.twitter.business.model.hours.BusinessHoursData$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.model.hours.BusinessHoursData;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 " }, d2 = { "Lcom/twitter/business/api/BusinessHoursContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lcom/twitter/business/model/hours/BusinessHoursData;", "component1", "result", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/business/model/hours/BusinessHoursData;", "getResult", "()Lcom/twitter/business/model/hours/BusinessHoursData;", "<init>", "(Lcom/twitter/business/model/hours/BusinessHoursData;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILcom/twitter/business/model/hours/BusinessHoursData;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessHoursContentViewResult implements bn6
{
    public static final BusinessHoursContentViewResult.BusinessHoursContentViewResult$Companion Companion;
    private final BusinessHoursData result;
    
    static {
        Companion = new BusinessHoursContentViewResult.BusinessHoursContentViewResult$Companion();
    }
    
    public BusinessHoursContentViewResult(final int n, final BusinessHoursData result, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.result = result;
            return;
        }
        blz.a0(n, 1, BusinessHoursContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessHoursContentViewResult(final BusinessHoursData result) {
        czd.f((Object)result, "result");
        this.result = result;
    }
    
    public static BusinessHoursContentViewResult copy$default(final BusinessHoursContentViewResult businessHoursContentViewResult, BusinessHoursData result, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            result = businessHoursContentViewResult.result;
        }
        return businessHoursContentViewResult.copy(result);
    }
    
    public static final void write$Self(final BusinessHoursContentViewResult businessHoursContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)businessHoursContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.T(serialDescriptor, 0, (jlp)BusinessHoursData$$serializer.INSTANCE, (Object)businessHoursContentViewResult.result);
    }
    
    public final BusinessHoursData component1() {
        return this.result;
    }
    
    public final BusinessHoursContentViewResult copy(final BusinessHoursData businessHoursData) {
        czd.f((Object)businessHoursData, "result");
        return new BusinessHoursContentViewResult(businessHoursData);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof BusinessHoursContentViewResult && czd.a((Object)this.result, (Object)((BusinessHoursContentViewResult)o).result));
    }
    
    public final BusinessHoursData getResult() {
        return this.result;
    }
    
    @Override
    public int hashCode() {
        return this.result.hashCode();
    }
    
    @Override
    public String toString() {
        final BusinessHoursData result = this.result;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessHoursContentViewResult(result=");
        sb.append(result);
        sb.append(")");
        return sb.toString();
    }
}
