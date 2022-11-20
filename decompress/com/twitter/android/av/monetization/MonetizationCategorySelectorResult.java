// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.av.monetization;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Set;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0018\u0010\u0019B+\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 " }, d2 = { "Lcom/twitter/android/av/monetization/MonetizationCategorySelectorResult;", "Lbn6;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "", "component1", "selectedCategories", "copy", "", "toString", "hashCode", "", "other", "", "equals", "Ljava/util/Set;", "getSelectedCategories", "()Ljava/util/Set;", "<init>", "(Ljava/util/Set;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/util/Set;Lhlp;)V", "Companion", "$serializer", "feature.tfa.media.monetization.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class MonetizationCategorySelectorResult implements bn6
{
    public static final Companion Companion;
    private final Set<Integer> selectedCategories;
    
    static {
        Companion = new Companion();
    }
    
    public MonetizationCategorySelectorResult(final int n, final Set selectedCategories, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.selectedCategories = selectedCategories;
            return;
        }
        blz.a0(n, 1, MonetizationCategorySelectorResult$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public MonetizationCategorySelectorResult(final Set<Integer> selectedCategories) {
        czd.f((Object)selectedCategories, "selectedCategories");
        this.selectedCategories = selectedCategories;
    }
    
    public static MonetizationCategorySelectorResult copy$default(final MonetizationCategorySelectorResult monetizationCategorySelectorResult, Set selectedCategories, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            selectedCategories = monetizationCategorySelectorResult.selectedCategories;
        }
        return monetizationCategorySelectorResult.copy(selectedCategories);
    }
    
    public static final void write$Self(final MonetizationCategorySelectorResult monetizationCategorySelectorResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)monetizationCategorySelectorResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.T(serialDescriptor, 0, (jlp)new vhf((KSerializer)ktd.a), (Object)monetizationCategorySelectorResult.selectedCategories);
    }
    
    public final Set<Integer> component1() {
        return this.selectedCategories;
    }
    
    public final MonetizationCategorySelectorResult copy(final Set<Integer> set) {
        czd.f((Object)set, "selectedCategories");
        return new MonetizationCategorySelectorResult(set);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof MonetizationCategorySelectorResult && czd.a((Object)this.selectedCategories, (Object)((MonetizationCategorySelectorResult)o).selectedCategories));
    }
    
    public final Set<Integer> getSelectedCategories() {
        return this.selectedCategories;
    }
    
    @Override
    public int hashCode() {
        return this.selectedCategories.hashCode();
    }
    
    @Override
    public String toString() {
        final Set<Integer> selectedCategories = this.selectedCategories;
        final StringBuilder sb = new StringBuilder();
        sb.append("MonetizationCategorySelectorResult(selectedCategories=");
        sb.append(selectedCategories);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/android/av/monetization/MonetizationCategorySelectorResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/android/av/monetization/MonetizationCategorySelectorResult;", "serializer", "feature.tfa.media.monetization.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<MonetizationCategorySelectorResult> serializer() {
            return (KSerializer<MonetizationCategorySelectorResult>)MonetizationCategorySelectorResult$$serializer.INSTANCE;
        }
    }
}
