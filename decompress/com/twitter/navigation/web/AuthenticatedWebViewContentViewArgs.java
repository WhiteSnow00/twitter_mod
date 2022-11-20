// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.navigation.web;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B-\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$BA\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0015\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\"\u0010\u001d¨\u0006+" }, d2 = { "Lcom/twitter/navigation/web/AuthenticatedWebViewContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "component2", "", "component3", "component4", "title", "url", "tweetId", "impressionId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getUrl", "J", "getTweetId", "()J", "getImpressionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.navigation.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AuthenticatedWebViewContentViewArgs implements ContentViewArgs
{
    public static final AuthenticatedWebViewContentViewArgs.AuthenticatedWebViewContentViewArgs$Companion Companion;
    private final String impressionId;
    private final String title;
    private final long tweetId;
    private final String url;
    
    static {
        Companion = new AuthenticatedWebViewContentViewArgs.AuthenticatedWebViewContentViewArgs$Companion();
    }
    
    public AuthenticatedWebViewContentViewArgs(final int n, final String title, final String url, final long tweetId, final String impressionId, final hlp hlp) {
        if (0x3 == (n & 0x3)) {
            this.title = title;
            this.url = url;
            if ((n & 0x4) == 0x0) {
                this.tweetId = 0L;
            }
            else {
                this.tweetId = tweetId;
            }
            if ((n & 0x8) == 0x0) {
                this.impressionId = null;
            }
            else {
                this.impressionId = impressionId;
            }
            return;
        }
        blz.a0(n, 3, AuthenticatedWebViewContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public AuthenticatedWebViewContentViewArgs(final String title, final String url, final long tweetId, final String impressionId) {
        czd.f((Object)title, "title");
        czd.f((Object)url, "url");
        this.title = title;
        this.url = url;
        this.tweetId = tweetId;
        this.impressionId = impressionId;
    }
    
    public AuthenticatedWebViewContentViewArgs(final String s, final String s2, long n, String s3, final int n2, final rf8 rf8) {
        if ((n2 & 0x4) != 0x0) {
            n = 0L;
        }
        if ((n2 & 0x8) != 0x0) {
            s3 = null;
        }
        this(s, s2, n, s3);
    }
    
    public static AuthenticatedWebViewContentViewArgs copy$default(final AuthenticatedWebViewContentViewArgs authenticatedWebViewContentViewArgs, String title, String url, long tweetId, String impressionId, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            title = authenticatedWebViewContentViewArgs.title;
        }
        if ((n & 0x2) != 0x0) {
            url = authenticatedWebViewContentViewArgs.url;
        }
        if ((n & 0x4) != 0x0) {
            tweetId = authenticatedWebViewContentViewArgs.tweetId;
        }
        if ((n & 0x8) != 0x0) {
            impressionId = authenticatedWebViewContentViewArgs.impressionId;
        }
        return authenticatedWebViewContentViewArgs.copy(title, url, tweetId, impressionId);
    }
    
    public static final void write$Self(final AuthenticatedWebViewContentViewArgs authenticatedWebViewContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)authenticatedWebViewContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final String title = authenticatedWebViewContentViewArgs.title;
        final int n = 0;
        xc6.S(serialDescriptor, 0, title);
        xc6.S(serialDescriptor, 1, authenticatedWebViewContentViewArgs.url);
        boolean b = false;
        Label_0078: {
            if (!xc6.z(serialDescriptor)) {
                if (authenticatedWebViewContentViewArgs.tweetId == 0L) {
                    b = false;
                    break Label_0078;
                }
            }
            b = true;
        }
        if (b) {
            xc6.i0(serialDescriptor, 2, authenticatedWebViewContentViewArgs.tweetId);
        }
        int n2 = 0;
        Label_0119: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (authenticatedWebViewContentViewArgs.impressionId == null) {
                    break Label_0119;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 3, (jlp)gkr.a, (Object)authenticatedWebViewContentViewArgs.impressionId);
        }
    }
    
    public final String component1() {
        return this.title;
    }
    
    public final String component2() {
        return this.url;
    }
    
    public final long component3() {
        return this.tweetId;
    }
    
    public final String component4() {
        return this.impressionId;
    }
    
    public final AuthenticatedWebViewContentViewArgs copy(final String s, final String s2, final long n, final String s3) {
        czd.f((Object)s, "title");
        czd.f((Object)s2, "url");
        return new AuthenticatedWebViewContentViewArgs(s, s2, n, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticatedWebViewContentViewArgs)) {
            return false;
        }
        final AuthenticatedWebViewContentViewArgs authenticatedWebViewContentViewArgs = (AuthenticatedWebViewContentViewArgs)o;
        return czd.a((Object)this.title, (Object)authenticatedWebViewContentViewArgs.title) && czd.a((Object)this.url, (Object)authenticatedWebViewContentViewArgs.url) && this.tweetId == authenticatedWebViewContentViewArgs.tweetId && czd.a((Object)this.impressionId, (Object)authenticatedWebViewContentViewArgs.impressionId);
    }
    
    public final String getImpressionId() {
        return this.impressionId;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final long getTweetId() {
        return this.tweetId;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final int f = hmg.f(this.url, this.title.hashCode() * 31, 31);
        final long tweetId = this.tweetId;
        final int n = (int)(tweetId ^ tweetId >>> 32);
        final String impressionId = this.impressionId;
        int hashCode;
        if (impressionId == null) {
            hashCode = 0;
        }
        else {
            hashCode = impressionId.hashCode();
        }
        return (f + n) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final String title = this.title;
        final String url = this.url;
        final long tweetId = this.tweetId;
        final String impressionId = this.impressionId;
        final StringBuilder q = tqf.q("AuthenticatedWebViewContentViewArgs(title=", title, ", url=", url, ", tweetId=");
        e1.B(q, tweetId, ", impressionId=", impressionId);
        q.append(")");
        return q.toString();
    }
}
