// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.api;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\r\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f" }, d2 = { "Lcom/twitter/app/profiles/api/EditPronounsContentViewResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "pronouns", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getPronouns", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Lhlp;)V", "Companion", "$serializer", "feature.tfa.profiles.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditPronounsContentViewResult implements bn6
{
    public static final Companion Companion;
    private final String pronouns;
    
    static {
        Companion = new Companion();
    }
    
    public EditPronounsContentViewResult(final int n, final String pronouns, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.pronouns = pronouns;
            return;
        }
        blz.a0(n, 1, EditPronounsContentViewResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public EditPronounsContentViewResult(final String pronouns) {
        czd.f((Object)pronouns, "pronouns");
        this.pronouns = pronouns;
    }
    
    public static EditPronounsContentViewResult copy$default(final EditPronounsContentViewResult editPronounsContentViewResult, String pronouns, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            pronouns = editPronounsContentViewResult.pronouns;
        }
        return editPronounsContentViewResult.copy(pronouns);
    }
    
    public static final void write$Self(final EditPronounsContentViewResult editPronounsContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)editPronounsContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.S(serialDescriptor, 0, editPronounsContentViewResult.pronouns);
    }
    
    public final String component1() {
        return this.pronouns;
    }
    
    public final EditPronounsContentViewResult copy(final String s) {
        czd.f((Object)s, "pronouns");
        return new EditPronounsContentViewResult(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof EditPronounsContentViewResult && czd.a((Object)this.pronouns, (Object)((EditPronounsContentViewResult)o).pronouns));
    }
    
    public final String getPronouns() {
        return this.pronouns;
    }
    
    @Override
    public int hashCode() {
        return this.pronouns.hashCode();
    }
    
    @Override
    public String toString() {
        return da8.j("EditPronounsContentViewResult(pronouns=", this.pronouns, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/profiles/api/EditPronounsContentViewResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/app/profiles/api/EditPronounsContentViewResult;", "serializer", "feature.tfa.profiles.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<EditPronounsContentViewResult> serializer() {
            return (KSerializer<EditPronounsContentViewResult>)EditPronounsContentViewResult$$serializer.INSTANCE;
        }
    }
}
