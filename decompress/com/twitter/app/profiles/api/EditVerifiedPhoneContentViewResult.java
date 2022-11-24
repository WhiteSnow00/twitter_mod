// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@bmp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f" }, d2 = { "Lcom/twitter/app/profiles/api/EditVerifiedPhoneContentViewResult;", "Lho6;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "optedIn", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "getOptedIn", "()Z", "<init>", "(Z)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(IZLdmp;)V", "Companion", "$serializer", "feature.tfa.profiles.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditVerifiedPhoneContentViewResult implements ho6
{
    public static final EditVerifiedPhoneContentViewResult.EditVerifiedPhoneContentViewResult$Companion Companion;
    private final boolean optedIn;
    
    static {
        Companion = new EditVerifiedPhoneContentViewResult.EditVerifiedPhoneContentViewResult$Companion();
    }
    
    public EditVerifiedPhoneContentViewResult(final int n, final boolean optedIn, final dmp dmp) {
        if (0x1 == (n & 0x1)) {
            this.optedIn = optedIn;
            return;
        }
        shw.V0(n, 1, EditVerifiedPhoneContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public EditVerifiedPhoneContentViewResult(final boolean optedIn) {
        this.optedIn = optedIn;
    }
    
    public static EditVerifiedPhoneContentViewResult copy$default(final EditVerifiedPhoneContentViewResult editVerifiedPhoneContentViewResult, boolean optedIn, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            optedIn = editVerifiedPhoneContentViewResult.optedIn;
        }
        return editVerifiedPhoneContentViewResult.copy(optedIn);
    }
    
    public static final void write$Self(final EditVerifiedPhoneContentViewResult editVerifiedPhoneContentViewResult, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)editVerifiedPhoneContentViewResult, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.R(serialDescriptor, 0, editVerifiedPhoneContentViewResult.optedIn);
    }
    
    public final boolean component1() {
        return this.optedIn;
    }
    
    public final EditVerifiedPhoneContentViewResult copy(final boolean b) {
        return new EditVerifiedPhoneContentViewResult(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof EditVerifiedPhoneContentViewResult && this.optedIn == ((EditVerifiedPhoneContentViewResult)o).optedIn);
    }
    
    public final boolean getOptedIn() {
        return this.optedIn;
    }
    
    @Override
    public int hashCode() {
        int optedIn;
        if ((optedIn = (this.optedIn ? 1 : 0)) != 0) {
            optedIn = 1;
        }
        return optedIn;
    }
    
    @Override
    public String toString() {
        return jba.o("EditVerifiedPhoneContentViewResult(optedIn=", this.optedIn, ")");
    }
}
