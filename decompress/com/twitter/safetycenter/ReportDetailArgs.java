// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safetycenter;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t?\u0006\u0004\b\u0018\u0010\u0019B#\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b?\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006?\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017?\u0006 " }, d2 = { "Lcom/twitter/safetycenter/ReportDetailArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "reportId", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "J", "getReportId", "()J", "<init>", "(J)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(IJLdmp;)V", "Companion", "$serializer", "feature.tfa.safety-center.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class ReportDetailArgs implements ContentViewArgs
{
    public static final ReportDetailArgs.ReportDetailArgs$Companion Companion;
    private final long reportId;
    
    static {
        Companion = new ReportDetailArgs.ReportDetailArgs$Companion();
    }
    
    public ReportDetailArgs(final int n, final long reportId, final dmp dmp) {
        if (0x1 == (n & 0x1)) {
            this.reportId = reportId;
            return;
        }
        shw.V0(n, 1, ReportDetailArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public ReportDetailArgs(final long reportId) {
        this.reportId = reportId;
    }
    
    public static ReportDetailArgs copy$default(final ReportDetailArgs reportDetailArgs, long reportId, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            reportId = reportDetailArgs.reportId;
        }
        return reportDetailArgs.copy(reportId);
    }
    
    public static final void write$Self(final ReportDetailArgs reportDetailArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)reportDetailArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.i0(serialDescriptor, 0, reportDetailArgs.reportId);
    }
    
    public final long component1() {
        return this.reportId;
    }
    
    public final ReportDetailArgs copy(final long n) {
        return new ReportDetailArgs(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ReportDetailArgs && this.reportId == ((ReportDetailArgs)o).reportId);
    }
    
    public final long getReportId() {
        return this.reportId;
    }
    
    @Override
    public int hashCode() {
        final long reportId = this.reportId;
        return (int)(reportId ^ reportId >>> 32);
    }
    
    @Override
    public String toString() {
        return k5b.m("ReportDetailArgs(reportId=", this.reportId, ")");
    }
}
