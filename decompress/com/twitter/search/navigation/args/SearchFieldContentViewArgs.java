// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.search.navigation.args;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Map;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002/.Bw\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0015\u0012\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\"¢\u0006\u0004\b'\u0010(B{\b\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\"\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b'\u0010-J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010 \u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u00060" }, d2 = { "Lcom/twitter/search/navigation/args/SearchFieldContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "showTypeahead", "Z", "getShowTypeahead", "()Z", "showRecents", "getShowRecents", "", "profileId", "J", "getProfileId", "()J", "", "searchFilter", "Ljava/lang/String;", "getSearchFilter", "()Ljava/lang/String;", "searchHint", "getSearchHint", "querySource", "getQuerySource", "scribeSection", "getScribeSection", "configurationName", "getConfigurationName", "", "configurationOptions", "Ljava/util/Map;", "getConfigurationOptions", "()Ljava/util/Map;", "<init>", "(ZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lhlp;", "serializationConstructorMarker", "(IZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.search.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SearchFieldContentViewArgs implements ContentViewArgs
{
    public static final SearchFieldContentViewArgs.SearchFieldContentViewArgs$Companion Companion;
    private final String configurationName;
    private final Map<String, String> configurationOptions;
    private final long profileId;
    private final String querySource;
    private final String scribeSection;
    private final String searchFilter;
    private final String searchHint;
    private final boolean showRecents;
    private final boolean showTypeahead;
    
    static {
        Companion = new SearchFieldContentViewArgs.SearchFieldContentViewArgs$Companion();
    }
    
    public SearchFieldContentViewArgs() {
        this(false, false, 0L, null, null, null, null, null, null, 511, null);
    }
    
    public SearchFieldContentViewArgs(final int n, final boolean showTypeahead, final boolean showRecents, final long profileId, final String searchFilter, final String searchHint, final String querySource, final String scribeSection, final String configurationName, final Map configurationOptions, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.showTypeahead = true;
            }
            else {
                this.showTypeahead = showTypeahead;
            }
            if ((n & 0x2) == 0x0) {
                this.showRecents = true;
            }
            else {
                this.showRecents = showRecents;
            }
            if ((n & 0x4) == 0x0) {
                this.profileId = 0L;
            }
            else {
                this.profileId = profileId;
            }
            if ((n & 0x8) == 0x0) {
                this.searchFilter = null;
            }
            else {
                this.searchFilter = searchFilter;
            }
            if ((n & 0x10) == 0x0) {
                this.searchHint = null;
            }
            else {
                this.searchHint = searchHint;
            }
            if ((n & 0x20) == 0x0) {
                this.querySource = null;
            }
            else {
                this.querySource = querySource;
            }
            if ((n & 0x40) == 0x0) {
                this.scribeSection = null;
            }
            else {
                this.scribeSection = scribeSection;
            }
            if ((n & 0x80) == 0x0) {
                this.configurationName = null;
            }
            else {
                this.configurationName = configurationName;
            }
            if ((n & 0x100) == 0x0) {
                this.configurationOptions = (Map<String, String>)k2a.D0;
            }
            else {
                this.configurationOptions = configurationOptions;
            }
            return;
        }
        blz.a0(n, 0, SearchFieldContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public SearchFieldContentViewArgs(final boolean showTypeahead, final boolean showRecents, final long profileId, final String searchFilter, final String searchHint, final String querySource, final String scribeSection, final String configurationName, final Map<String, String> configurationOptions) {
        czd.f((Object)configurationOptions, "configurationOptions");
        this.showTypeahead = showTypeahead;
        this.showRecents = showRecents;
        this.profileId = profileId;
        this.searchFilter = searchFilter;
        this.searchHint = searchHint;
        this.querySource = querySource;
        this.scribeSection = scribeSection;
        this.configurationName = configurationName;
        this.configurationOptions = configurationOptions;
    }
    
    public SearchFieldContentViewArgs(boolean b, boolean b2, long n, String s, String s2, String s3, String s4, String s5, Map d0, final int n2, final rf8 rf8) {
        final boolean b3 = true;
        if ((n2 & 0x1) != 0x0) {
            b = true;
        }
        if ((n2 & 0x2) != 0x0) {
            b2 = b3;
        }
        if ((n2 & 0x4) != 0x0) {
            n = 0L;
        }
        final String s6 = null;
        if ((n2 & 0x8) != 0x0) {
            s = null;
        }
        if ((n2 & 0x10) != 0x0) {
            s2 = null;
        }
        if ((n2 & 0x20) != 0x0) {
            s3 = null;
        }
        if ((n2 & 0x40) != 0x0) {
            s4 = null;
        }
        if ((n2 & 0x80) != 0x0) {
            s5 = s6;
        }
        if ((n2 & 0x100) != 0x0) {
            d0 = k2a.D0;
        }
        this(b, b2, n, s, s2, s3, s4, s5, (Map<String, String>)d0);
    }
    
    public static final void write$Self(final SearchFieldContentViewArgs searchFieldContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)searchFieldContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0053: {
            if (!z) {
                if (searchFieldContentViewArgs.showTypeahead) {
                    b = false;
                    break Label_0053;
                }
            }
            b = true;
        }
        if (b) {
            xc6.R(serialDescriptor, 0, searchFieldContentViewArgs.showTypeahead);
        }
        boolean b2 = false;
        Label_0097: {
            if (!xc6.z(serialDescriptor)) {
                if (searchFieldContentViewArgs.showRecents) {
                    b2 = false;
                    break Label_0097;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.R(serialDescriptor, 1, searchFieldContentViewArgs.showRecents);
        }
        boolean b3 = false;
        Label_0142: {
            if (!xc6.z(serialDescriptor)) {
                if (searchFieldContentViewArgs.profileId == 0L) {
                    b3 = false;
                    break Label_0142;
                }
            }
            b3 = true;
        }
        if (b3) {
            xc6.i0(serialDescriptor, 2, searchFieldContentViewArgs.profileId);
        }
        boolean b4 = false;
        Label_0185: {
            if (!xc6.z(serialDescriptor)) {
                if (searchFieldContentViewArgs.searchFilter == null) {
                    b4 = false;
                    break Label_0185;
                }
            }
            b4 = true;
        }
        if (b4) {
            xc6.y(serialDescriptor, 3, (jlp)gkr.a, (Object)searchFieldContentViewArgs.searchFilter);
        }
        boolean b5 = false;
        Label_0231: {
            if (!xc6.z(serialDescriptor)) {
                if (searchFieldContentViewArgs.searchHint == null) {
                    b5 = false;
                    break Label_0231;
                }
            }
            b5 = true;
        }
        if (b5) {
            xc6.y(serialDescriptor, 4, (jlp)gkr.a, (Object)searchFieldContentViewArgs.searchHint);
        }
        boolean b6 = false;
        Label_0277: {
            if (!xc6.z(serialDescriptor)) {
                if (searchFieldContentViewArgs.querySource == null) {
                    b6 = false;
                    break Label_0277;
                }
            }
            b6 = true;
        }
        if (b6) {
            xc6.y(serialDescriptor, 5, (jlp)gkr.a, (Object)searchFieldContentViewArgs.querySource);
        }
        boolean b7 = false;
        Label_0323: {
            if (!xc6.z(serialDescriptor)) {
                if (searchFieldContentViewArgs.scribeSection == null) {
                    b7 = false;
                    break Label_0323;
                }
            }
            b7 = true;
        }
        if (b7) {
            xc6.y(serialDescriptor, 6, (jlp)gkr.a, (Object)searchFieldContentViewArgs.scribeSection);
        }
        boolean b8 = false;
        Label_0370: {
            if (!xc6.z(serialDescriptor)) {
                if (searchFieldContentViewArgs.configurationName == null) {
                    b8 = false;
                    break Label_0370;
                }
            }
            b8 = true;
        }
        if (b8) {
            xc6.y(serialDescriptor, 7, (jlp)gkr.a, (Object)searchFieldContentViewArgs.configurationName);
        }
        int n2 = 0;
        Label_0421: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (czd.a((Object)searchFieldContentViewArgs.configurationOptions, (Object)k2a.D0)) {
                    break Label_0421;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            final gkr a = gkr.a;
            xc6.T(serialDescriptor, 8, (jlp)new uhf((KSerializer)a, (KSerializer)a), (Object)searchFieldContentViewArgs.configurationOptions);
        }
    }
    
    public final String getConfigurationName() {
        return this.configurationName;
    }
    
    public final Map<String, String> getConfigurationOptions() {
        return this.configurationOptions;
    }
    
    public final long getProfileId() {
        return this.profileId;
    }
    
    public final String getQuerySource() {
        return this.querySource;
    }
    
    public final String getScribeSection() {
        return this.scribeSection;
    }
    
    public final String getSearchFilter() {
        return this.searchFilter;
    }
    
    public final String getSearchHint() {
        return this.searchHint;
    }
    
    public final boolean getShowRecents() {
        return this.showRecents;
    }
    
    public final boolean getShowTypeahead() {
        return this.showTypeahead;
    }
}
