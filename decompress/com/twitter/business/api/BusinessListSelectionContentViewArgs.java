// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import java.util.List;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B;\u0012\b\b\u0001\u0010\u0014\u001a\u00020\t\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b/\u00100BO\b\u0017\u0012\u0006\u00101\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b/\u00104J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\tH\u00c6\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012H\u00c6\u0003JJ\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0014\u001a\u00020\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0012H\u00c6\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001J\u0013\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b-\u0010.¨\u00067" }, d2 = { "Lcom/twitter/business/api/BusinessListSelectionContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "", "Lcom/twitter/business/model/listselection/BusinessListSelectionData;", "component2", "Lx03;", "component3", "component4", "()Ljava/lang/Integer;", "", "component5", "screenTitle", "items", "dataType", "searchHint", "searchBarVisible", "copy", "(ILjava/util/List;Lx03;Ljava/lang/Integer;Z)Lcom/twitter/business/api/BusinessListSelectionContentViewArgs;", "", "toString", "hashCode", "", "other", "equals", "I", "getScreenTitle", "()I", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/Integer;", "getSearchHint", "Z", "getSearchBarVisible", "()Z", "Lx03;", "getDataType", "()Lx03;", "<init>", "(ILjava/util/List;Lx03;Ljava/lang/Integer;Z)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(IILjava/util/List;Lx03;Ljava/lang/Integer;ZLhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessListSelectionContentViewArgs implements ContentViewArgs
{
    public static final BusinessListSelectionContentViewArgs.BusinessListSelectionContentViewArgs$Companion Companion;
    private final x03 dataType;
    private final List<BusinessListSelectionData> items;
    private final int screenTitle;
    private final boolean searchBarVisible;
    private final Integer searchHint;
    
    static {
        Companion = new BusinessListSelectionContentViewArgs.BusinessListSelectionContentViewArgs$Companion();
    }
    
    public BusinessListSelectionContentViewArgs(final int n, final int screenTitle, final List items, final x03 dataType, final Integer searchHint, final boolean searchBarVisible, final hlp hlp) {
        if (0x17 == (n & 0x17)) {
            this.screenTitle = screenTitle;
            this.items = items;
            this.dataType = dataType;
            if ((n & 0x8) == 0x0) {
                this.searchHint = null;
            }
            else {
                this.searchHint = searchHint;
            }
            this.searchBarVisible = searchBarVisible;
            return;
        }
        blz.a0(n, 23, BusinessListSelectionContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessListSelectionContentViewArgs(final int screenTitle, final List<? extends BusinessListSelectionData> items, final x03 dataType, final Integer searchHint, final boolean searchBarVisible) {
        czd.f((Object)items, "items");
        czd.f((Object)dataType, "dataType");
        this.screenTitle = screenTitle;
        this.items = (List<BusinessListSelectionData>)items;
        this.dataType = dataType;
        this.searchHint = searchHint;
        this.searchBarVisible = searchBarVisible;
    }
    
    public BusinessListSelectionContentViewArgs(final int n, final List list, final x03 x03, Integer n2, final boolean b, final int n3, final rf8 rf8) {
        if ((n3 & 0x8) != 0x0) {
            n2 = null;
        }
        this(n, list, x03, n2, b);
    }
    
    public static BusinessListSelectionContentViewArgs copy$default(final BusinessListSelectionContentViewArgs businessListSelectionContentViewArgs, int screenTitle, List items, x03 dataType, Integer searchHint, boolean searchBarVisible, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            screenTitle = businessListSelectionContentViewArgs.screenTitle;
        }
        if ((n & 0x2) != 0x0) {
            items = businessListSelectionContentViewArgs.items;
        }
        if ((n & 0x4) != 0x0) {
            dataType = businessListSelectionContentViewArgs.dataType;
        }
        if ((n & 0x8) != 0x0) {
            searchHint = businessListSelectionContentViewArgs.searchHint;
        }
        if ((n & 0x10) != 0x0) {
            searchBarVisible = businessListSelectionContentViewArgs.searchBarVisible;
        }
        return businessListSelectionContentViewArgs.copy(screenTitle, items, dataType, searchHint, searchBarVisible);
    }
    
    public static final void write$Self(final BusinessListSelectionContentViewArgs businessListSelectionContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)businessListSelectionContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final int screenTitle = businessListSelectionContentViewArgs.screenTitle;
        boolean b = false;
        xc6.Q(serialDescriptor, 0, screenTitle);
        xc6.T(serialDescriptor, 1, (jlp)new rs0(BusinessListSelectionData.Companion.serializer()), (Object)businessListSelectionContentViewArgs.items);
        xc6.T(serialDescriptor, 2, (jlp)new o7a("com.twitter.business.model.listselection.BusinessListDataType", (Enum[])x03.values()), (Object)businessListSelectionContentViewArgs.dataType);
        Label_0107: {
            if (!xc6.z(serialDescriptor)) {
                if (businessListSelectionContentViewArgs.searchHint == null) {
                    break Label_0107;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 3, (jlp)ktd.a, (Object)businessListSelectionContentViewArgs.searchHint);
        }
        xc6.R(serialDescriptor, 4, businessListSelectionContentViewArgs.searchBarVisible);
    }
    
    public final int component1() {
        return this.screenTitle;
    }
    
    public final List<BusinessListSelectionData> component2() {
        return this.items;
    }
    
    public final x03 component3() {
        return this.dataType;
    }
    
    public final Integer component4() {
        return this.searchHint;
    }
    
    public final boolean component5() {
        return this.searchBarVisible;
    }
    
    public final BusinessListSelectionContentViewArgs copy(final int n, final List<? extends BusinessListSelectionData> list, final x03 x03, final Integer n2, final boolean b) {
        czd.f((Object)list, "items");
        czd.f((Object)x03, "dataType");
        return new BusinessListSelectionContentViewArgs(n, list, x03, n2, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BusinessListSelectionContentViewArgs)) {
            return false;
        }
        final BusinessListSelectionContentViewArgs businessListSelectionContentViewArgs = (BusinessListSelectionContentViewArgs)o;
        return this.screenTitle == businessListSelectionContentViewArgs.screenTitle && czd.a((Object)this.items, (Object)businessListSelectionContentViewArgs.items) && this.dataType == businessListSelectionContentViewArgs.dataType && czd.a((Object)this.searchHint, (Object)businessListSelectionContentViewArgs.searchHint) && this.searchBarVisible == businessListSelectionContentViewArgs.searchBarVisible;
    }
    
    public final x03 getDataType() {
        return this.dataType;
    }
    
    public final List<BusinessListSelectionData> getItems() {
        return this.items;
    }
    
    public final int getScreenTitle() {
        return this.screenTitle;
    }
    
    public final boolean getSearchBarVisible() {
        return this.searchBarVisible;
    }
    
    public final Integer getSearchHint() {
        return this.searchHint;
    }
    
    @Override
    public int hashCode() {
        final int d = sde.d((List)this.items, this.screenTitle * 31, 31);
        final int hashCode = this.dataType.hashCode();
        final Integer searchHint = this.searchHint;
        int hashCode2;
        if (searchHint == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = searchHint.hashCode();
        }
        int searchBarVisible;
        if ((searchBarVisible = (this.searchBarVisible ? 1 : 0)) != 0) {
            searchBarVisible = 1;
        }
        return ((hashCode + d) * 31 + hashCode2) * 31 + searchBarVisible;
    }
    
    @Override
    public String toString() {
        final int screenTitle = this.screenTitle;
        final List<BusinessListSelectionData> items = this.items;
        final x03 dataType = this.dataType;
        final Integer searchHint = this.searchHint;
        final boolean searchBarVisible = this.searchBarVisible;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessListSelectionContentViewArgs(screenTitle=");
        sb.append(screenTitle);
        sb.append(", items=");
        sb.append(items);
        sb.append(", dataType=");
        sb.append(dataType);
        sb.append(", searchHint=");
        sb.append(searchHint);
        sb.append(", searchBarVisible=");
        return wnj.D(sb, searchBarVisible, ")");
    }
}
