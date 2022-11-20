// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safetycenter;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0019\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bB/\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\"" }, d2 = { "Lcom/twitter/safetycenter/SafetyCenterWebviewContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "component2", "title", "url", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lhlp;)V", "Companion", "$serializer", "feature.tfa.safety-center.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class SafetyCenterWebviewContentViewArgs implements ContentViewArgs
{
    public static final SafetyCenterWebviewContentViewArgs.SafetyCenterWebviewContentViewArgs$Companion Companion;
    private final String title;
    private final String url;
    
    static {
        Companion = new SafetyCenterWebviewContentViewArgs.SafetyCenterWebviewContentViewArgs$Companion();
    }
    
    public SafetyCenterWebviewContentViewArgs(final int n, final String title, final String url, final hlp hlp) {
        if (0x3 == (n & 0x3)) {
            this.title = title;
            this.url = url;
            return;
        }
        blz.a0(n, 3, SafetyCenterWebviewContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public SafetyCenterWebviewContentViewArgs(final String title, final String url) {
        czd.f((Object)url, "url");
        this.title = title;
        this.url = url;
    }
    
    public static SafetyCenterWebviewContentViewArgs copy$default(final SafetyCenterWebviewContentViewArgs safetyCenterWebviewContentViewArgs, String title, String url, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            title = safetyCenterWebviewContentViewArgs.title;
        }
        if ((n & 0x2) != 0x0) {
            url = safetyCenterWebviewContentViewArgs.url;
        }
        return safetyCenterWebviewContentViewArgs.copy(title, url);
    }
    
    public static final void write$Self(final SafetyCenterWebviewContentViewArgs safetyCenterWebviewContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)safetyCenterWebviewContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.y(serialDescriptor, 0, (jlp)gkr.a, (Object)safetyCenterWebviewContentViewArgs.title);
        xc6.S(serialDescriptor, 1, safetyCenterWebviewContentViewArgs.url);
    }
    
    public final String component1() {
        return this.title;
    }
    
    public final String component2() {
        return this.url;
    }
    
    public final SafetyCenterWebviewContentViewArgs copy(final String s, final String s2) {
        czd.f((Object)s2, "url");
        return new SafetyCenterWebviewContentViewArgs(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SafetyCenterWebviewContentViewArgs)) {
            return false;
        }
        final SafetyCenterWebviewContentViewArgs safetyCenterWebviewContentViewArgs = (SafetyCenterWebviewContentViewArgs)o;
        return czd.a((Object)this.title, (Object)safetyCenterWebviewContentViewArgs.title) && czd.a((Object)this.url, (Object)safetyCenterWebviewContentViewArgs.url);
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final String title = this.title;
        int hashCode;
        if (title == null) {
            hashCode = 0;
        }
        else {
            hashCode = title.hashCode();
        }
        return this.url.hashCode() + hashCode * 31;
    }
    
    @Override
    public String toString() {
        return zh8.o("SafetyCenterWebviewContentViewArgs(title=", this.title, ", url=", this.url, ")");
    }
}
