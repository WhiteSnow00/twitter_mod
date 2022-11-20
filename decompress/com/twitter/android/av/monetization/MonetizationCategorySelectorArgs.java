// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.av.monetization;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Set;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b \u0010!B;\b\u0017\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\nH\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006(" }, d2 = { "Lcom/twitter/android/av/monetization/MonetizationCategorySelectorArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "", "component1", "component2", "component3", "selectedCategories", "maxAllowedCategories", "categoryType", "copy", "", "toString", "hashCode", "", "other", "", "equals", "Ljava/util/Set;", "getSelectedCategories", "()Ljava/util/Set;", "I", "getMaxAllowedCategories", "()I", "getCategoryType", "<init>", "(Ljava/util/Set;II)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/util/Set;IILhlp;)V", "Companion", "$serializer", "feature.tfa.media.monetization.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class MonetizationCategorySelectorArgs implements ContentViewArgs
{
    public static final Companion Companion;
    private final int categoryType;
    private final int maxAllowedCategories;
    private final Set<Integer> selectedCategories;
    
    static {
        Companion = new Companion();
    }
    
    public MonetizationCategorySelectorArgs(final int n, final Set selectedCategories, final int maxAllowedCategories, final int categoryType, final hlp hlp) {
        if (0x7 == (n & 0x7)) {
            this.selectedCategories = selectedCategories;
            this.maxAllowedCategories = maxAllowedCategories;
            this.categoryType = categoryType;
            return;
        }
        blz.a0(n, 7, MonetizationCategorySelectorArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public MonetizationCategorySelectorArgs(final Set<Integer> selectedCategories, final int maxAllowedCategories, final int categoryType) {
        czd.f((Object)selectedCategories, "selectedCategories");
        this.selectedCategories = selectedCategories;
        this.maxAllowedCategories = maxAllowedCategories;
        this.categoryType = categoryType;
    }
    
    public static MonetizationCategorySelectorArgs copy$default(final MonetizationCategorySelectorArgs monetizationCategorySelectorArgs, Set selectedCategories, int maxAllowedCategories, int categoryType, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            selectedCategories = monetizationCategorySelectorArgs.selectedCategories;
        }
        if ((n & 0x2) != 0x0) {
            maxAllowedCategories = monetizationCategorySelectorArgs.maxAllowedCategories;
        }
        if ((n & 0x4) != 0x0) {
            categoryType = monetizationCategorySelectorArgs.categoryType;
        }
        return monetizationCategorySelectorArgs.copy(selectedCategories, maxAllowedCategories, categoryType);
    }
    
    public static final void write$Self(final MonetizationCategorySelectorArgs monetizationCategorySelectorArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)monetizationCategorySelectorArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.T(serialDescriptor, 0, (jlp)new vhf((KSerializer)ktd.a), (Object)monetizationCategorySelectorArgs.selectedCategories);
        xc6.Q(serialDescriptor, 1, monetizationCategorySelectorArgs.maxAllowedCategories);
        xc6.Q(serialDescriptor, 2, monetizationCategorySelectorArgs.categoryType);
    }
    
    public final Set<Integer> component1() {
        return this.selectedCategories;
    }
    
    public final int component2() {
        return this.maxAllowedCategories;
    }
    
    public final int component3() {
        return this.categoryType;
    }
    
    public final MonetizationCategorySelectorArgs copy(final Set<Integer> set, final int n, final int n2) {
        czd.f((Object)set, "selectedCategories");
        return new MonetizationCategorySelectorArgs(set, n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonetizationCategorySelectorArgs)) {
            return false;
        }
        final MonetizationCategorySelectorArgs monetizationCategorySelectorArgs = (MonetizationCategorySelectorArgs)o;
        return czd.a((Object)this.selectedCategories, (Object)monetizationCategorySelectorArgs.selectedCategories) && this.maxAllowedCategories == monetizationCategorySelectorArgs.maxAllowedCategories && this.categoryType == monetizationCategorySelectorArgs.categoryType;
    }
    
    public final int getCategoryType() {
        return this.categoryType;
    }
    
    public final int getMaxAllowedCategories() {
        return this.maxAllowedCategories;
    }
    
    public final Set<Integer> getSelectedCategories() {
        return this.selectedCategories;
    }
    
    @Override
    public int hashCode() {
        return (this.selectedCategories.hashCode() * 31 + this.maxAllowedCategories) * 31 + this.categoryType;
    }
    
    @Override
    public String toString() {
        final Set<Integer> selectedCategories = this.selectedCategories;
        final int maxAllowedCategories = this.maxAllowedCategories;
        final int categoryType = this.categoryType;
        final StringBuilder sb = new StringBuilder();
        sb.append("MonetizationCategorySelectorArgs(selectedCategories=");
        sb.append(selectedCategories);
        sb.append(", maxAllowedCategories=");
        sb.append(maxAllowedCategories);
        sb.append(", categoryType=");
        return wc0.A(sb, categoryType, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/android/av/monetization/MonetizationCategorySelectorArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/android/av/monetization/MonetizationCategorySelectorArgs;", "serializer", "feature.tfa.media.monetization.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<MonetizationCategorySelectorArgs> serializer() {
            return (KSerializer<MonetizationCategorySelectorArgs>)MonetizationCategorySelectorArgs$$serializer.INSTANCE;
        }
    }
}
