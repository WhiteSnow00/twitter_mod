// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f" }, d2 = { "Lcom/twitter/business/api/ProfessionalSettingsContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "convertedToNonProfessional", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "getConvertedToNonProfessional", "()Z", "<init>", "(Z)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(IZLhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class ProfessionalSettingsContentViewResult implements bn6
{
    public static final ProfessionalSettingsContentViewResult.ProfessionalSettingsContentViewResult$Companion Companion;
    private final boolean convertedToNonProfessional;
    
    static {
        Companion = new ProfessionalSettingsContentViewResult.ProfessionalSettingsContentViewResult$Companion();
    }
    
    public ProfessionalSettingsContentViewResult(final int n, final boolean convertedToNonProfessional, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.convertedToNonProfessional = convertedToNonProfessional;
            return;
        }
        blz.a0(n, 1, ProfessionalSettingsContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public ProfessionalSettingsContentViewResult(final boolean convertedToNonProfessional) {
        this.convertedToNonProfessional = convertedToNonProfessional;
    }
    
    public static ProfessionalSettingsContentViewResult copy$default(final ProfessionalSettingsContentViewResult professionalSettingsContentViewResult, boolean convertedToNonProfessional, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            convertedToNonProfessional = professionalSettingsContentViewResult.convertedToNonProfessional;
        }
        return professionalSettingsContentViewResult.copy(convertedToNonProfessional);
    }
    
    public static final void write$Self(final ProfessionalSettingsContentViewResult professionalSettingsContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)professionalSettingsContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.R(serialDescriptor, 0, professionalSettingsContentViewResult.convertedToNonProfessional);
    }
    
    public final boolean component1() {
        return this.convertedToNonProfessional;
    }
    
    public final ProfessionalSettingsContentViewResult copy(final boolean b) {
        return new ProfessionalSettingsContentViewResult(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ProfessionalSettingsContentViewResult && this.convertedToNonProfessional == ((ProfessionalSettingsContentViewResult)o).convertedToNonProfessional);
    }
    
    public final boolean getConvertedToNonProfessional() {
        return this.convertedToNonProfessional;
    }
    
    @Override
    public int hashCode() {
        int convertedToNonProfessional;
        if ((convertedToNonProfessional = (this.convertedToNonProfessional ? 1 : 0)) != 0) {
            convertedToNonProfessional = 1;
        }
        return convertedToNonProfessional;
    }
    
    @Override
    public String toString() {
        return ib0.C("ProfessionalSettingsContentViewResult(convertedToNonProfessional=", this.convertedToNonProfessional, ")");
    }
}
