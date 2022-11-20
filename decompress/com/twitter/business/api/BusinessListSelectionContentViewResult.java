// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 " }, d2 = { "Lcom/twitter/business/api/BusinessListSelectionContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lcom/twitter/business/model/listselection/BusinessListSelectionData;", "component1", "originalItem", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/business/model/listselection/BusinessListSelectionData;", "getOriginalItem", "()Lcom/twitter/business/model/listselection/BusinessListSelectionData;", "<init>", "(Lcom/twitter/business/model/listselection/BusinessListSelectionData;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILcom/twitter/business/model/listselection/BusinessListSelectionData;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessListSelectionContentViewResult implements bn6
{
    public static final BusinessListSelectionContentViewResult.BusinessListSelectionContentViewResult$Companion Companion;
    private final BusinessListSelectionData originalItem;
    
    static {
        Companion = new BusinessListSelectionContentViewResult.BusinessListSelectionContentViewResult$Companion();
    }
    
    public BusinessListSelectionContentViewResult(final int n, final BusinessListSelectionData originalItem, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.originalItem = originalItem;
            return;
        }
        blz.a0(n, 1, BusinessListSelectionContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessListSelectionContentViewResult(final BusinessListSelectionData originalItem) {
        czd.f((Object)originalItem, "originalItem");
        this.originalItem = originalItem;
    }
    
    public static BusinessListSelectionContentViewResult copy$default(final BusinessListSelectionContentViewResult businessListSelectionContentViewResult, BusinessListSelectionData originalItem, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            originalItem = businessListSelectionContentViewResult.originalItem;
        }
        return businessListSelectionContentViewResult.copy(originalItem);
    }
    
    public static final void write$Self(final BusinessListSelectionContentViewResult businessListSelectionContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)businessListSelectionContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.T(serialDescriptor, 0, (jlp)BusinessListSelectionData.Companion.serializer(), (Object)businessListSelectionContentViewResult.originalItem);
    }
    
    public final BusinessListSelectionData component1() {
        return this.originalItem;
    }
    
    public final BusinessListSelectionContentViewResult copy(final BusinessListSelectionData businessListSelectionData) {
        czd.f((Object)businessListSelectionData, "originalItem");
        return new BusinessListSelectionContentViewResult(businessListSelectionData);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof BusinessListSelectionContentViewResult && czd.a((Object)this.originalItem, (Object)((BusinessListSelectionContentViewResult)o).originalItem));
    }
    
    public final BusinessListSelectionData getOriginalItem() {
        return this.originalItem;
    }
    
    @Override
    public int hashCode() {
        return this.originalItem.hashCode();
    }
    
    @Override
    public String toString() {
        final BusinessListSelectionData originalItem = this.originalItem;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessListSelectionContentViewResult(originalItem=");
        sb.append(originalItem);
        sb.append(")");
        return sb.toString();
    }
}
