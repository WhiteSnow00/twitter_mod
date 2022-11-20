// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.model.phone;

import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.profilemodules.model.business.OpenCloseTimeNext;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b \u0010!B9\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u00c6\u0003J4\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fH\u00c6\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006(" }, d2 = { "Lcom/twitter/business/model/phone/PreviewOpenTimesData;", "Lblh;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "Lcom/twitter/profilemodules/model/business/OpenCloseTimeNext;", "component2", "component3", "isOpen", "opens", "closes", "copy", "(Ljava/lang/Boolean;Lcom/twitter/profilemodules/model/business/OpenCloseTimeNext;Lcom/twitter/profilemodules/model/business/OpenCloseTimeNext;)Lcom/twitter/business/model/phone/PreviewOpenTimesData;", "", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/Boolean;", "Lcom/twitter/profilemodules/model/business/OpenCloseTimeNext;", "getOpens", "()Lcom/twitter/profilemodules/model/business/OpenCloseTimeNext;", "getCloses", "<init>", "(Ljava/lang/Boolean;Lcom/twitter/profilemodules/model/business/OpenCloseTimeNext;Lcom/twitter/profilemodules/model/business/OpenCloseTimeNext;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/twitter/profilemodules/model/business/OpenCloseTimeNext;Lcom/twitter/profilemodules/model/business/OpenCloseTimeNext;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PreviewOpenTimesData implements blh
{
    public static final PreviewOpenTimesData.PreviewOpenTimesData$Companion Companion;
    public static final y4j<PreviewOpenTimesData> SERIALIZER;
    private final OpenCloseTimeNext closes;
    private final Boolean isOpen;
    private final OpenCloseTimeNext opens;
    
    static {
        Companion = new PreviewOpenTimesData.PreviewOpenTimesData$Companion();
        SERIALIZER = (y4j)new PreviewOpenTimesData$a();
    }
    
    public PreviewOpenTimesData(final int n, final Boolean isOpen, final OpenCloseTimeNext opens, final OpenCloseTimeNext closes, final hlp hlp) {
        if (0x7 == (n & 0x7)) {
            this.isOpen = isOpen;
            this.opens = opens;
            this.closes = closes;
            return;
        }
        blz.a0(n, 7, PreviewOpenTimesData$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public PreviewOpenTimesData(final Boolean isOpen, final OpenCloseTimeNext opens, final OpenCloseTimeNext closes) {
        this.isOpen = isOpen;
        this.opens = opens;
        this.closes = closes;
    }
    
    public static PreviewOpenTimesData copy$default(final PreviewOpenTimesData previewOpenTimesData, Boolean isOpen, OpenCloseTimeNext opens, OpenCloseTimeNext closes, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            isOpen = previewOpenTimesData.isOpen;
        }
        if ((n & 0x2) != 0x0) {
            opens = previewOpenTimesData.opens;
        }
        if ((n & 0x4) != 0x0) {
            closes = previewOpenTimesData.closes;
        }
        return previewOpenTimesData.copy(isOpen, opens, closes);
    }
    
    public static final void write$Self(final PreviewOpenTimesData previewOpenTimesData, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)previewOpenTimesData, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.y(serialDescriptor, 0, (jlp)d72.a, (Object)previewOpenTimesData.isOpen);
        final OpenCloseTimeNext.$serializer instance = OpenCloseTimeNext.$serializer.INSTANCE;
        xc6.y(serialDescriptor, 1, (jlp)instance, (Object)previewOpenTimesData.opens);
        xc6.y(serialDescriptor, 2, (jlp)instance, (Object)previewOpenTimesData.closes);
    }
    
    public final Boolean component1() {
        return this.isOpen;
    }
    
    public final OpenCloseTimeNext component2() {
        return this.opens;
    }
    
    public final OpenCloseTimeNext component3() {
        return this.closes;
    }
    
    public final PreviewOpenTimesData copy(final Boolean b, final OpenCloseTimeNext openCloseTimeNext, final OpenCloseTimeNext openCloseTimeNext2) {
        return new PreviewOpenTimesData(b, openCloseTimeNext, openCloseTimeNext2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreviewOpenTimesData)) {
            return false;
        }
        final PreviewOpenTimesData previewOpenTimesData = (PreviewOpenTimesData)o;
        return czd.a((Object)this.isOpen, (Object)previewOpenTimesData.isOpen) && czd.a((Object)this.opens, (Object)previewOpenTimesData.opens) && czd.a((Object)this.closes, (Object)previewOpenTimesData.closes);
    }
    
    public final OpenCloseTimeNext getCloses() {
        return this.closes;
    }
    
    public final OpenCloseTimeNext getOpens() {
        return this.opens;
    }
    
    @Override
    public int hashCode() {
        final Boolean isOpen = this.isOpen;
        int hashCode = 0;
        int hashCode2;
        if (isOpen == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = isOpen.hashCode();
        }
        final OpenCloseTimeNext opens = this.opens;
        int hashCode3;
        if (opens == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = opens.hashCode();
        }
        final OpenCloseTimeNext closes = this.closes;
        if (closes != null) {
            hashCode = closes.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final Boolean isOpen() {
        return this.isOpen;
    }
    
    @Override
    public String toString() {
        final Boolean isOpen = this.isOpen;
        final OpenCloseTimeNext opens = this.opens;
        final OpenCloseTimeNext closes = this.closes;
        final StringBuilder sb = new StringBuilder();
        sb.append("PreviewOpenTimesData(isOpen=");
        sb.append(isOpen);
        sb.append(", opens=");
        sb.append(opens);
        sb.append(", closes=");
        sb.append(closes);
        sb.append(")");
        return sb.toString();
    }
}
