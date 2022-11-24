// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.birdwatch.navigation;

import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Objects;
import android.net.Uri;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B#\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b#\u0010$B9\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003R \u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\u0011\u0010\"¨\u0006+" }, d2 = { "Lcom/twitter/birdwatch/navigation/BirdwatchWebViewContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "Landroid/net/Uri;", "component1", "", "component2", "", "component3", "uri", "tweetId", "isOwnProfile", "copy", "toString", "", "hashCode", "", "other", "equals", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "getUri$annotations", "()V", "Ljava/lang/String;", "getTweetId", "()Ljava/lang/String;", "Z", "()Z", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Z)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILandroid/net/Uri;Ljava/lang/String;ZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.birdwatch.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BirdwatchWebViewContentViewArgs implements ContentViewArgs
{
    private static final String BASE_BIRDWATCH_URL = "https://twitter.com/i/birdwatch/";
    public static final BirdwatchWebViewContentViewArgs.BirdwatchWebViewContentViewArgs$Companion Companion;
    private final boolean isOwnProfile;
    private final String tweetId;
    private final Uri uri;
    
    static {
        Companion = new BirdwatchWebViewContentViewArgs.BirdwatchWebViewContentViewArgs$Companion();
    }
    
    public BirdwatchWebViewContentViewArgs(final int n, @bmp(with = l6w.class) final Uri uri, final String tweetId, final boolean isOwnProfile, final dmp dmp) {
        if (0x1 == (n & 0x1)) {
            this.uri = uri;
            if ((n & 0x2) == 0x0) {
                this.tweetId = "";
            }
            else {
                this.tweetId = tweetId;
            }
            if ((n & 0x4) == 0x0) {
                this.isOwnProfile = false;
            }
            else {
                this.isOwnProfile = isOwnProfile;
            }
            return;
        }
        shw.V0(n, 1, BirdwatchWebViewContentView.BirdwatchWebViewContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BirdwatchWebViewContentViewArgs(final Uri uri, final String tweetId, final boolean isOwnProfile) {
        e0e.f((Object)uri, "uri");
        e0e.f((Object)tweetId, "tweetId");
        this.uri = uri;
        this.tweetId = tweetId;
        this.isOwnProfile = isOwnProfile;
    }
    
    public BirdwatchWebViewContentViewArgs(final Uri uri, String s, boolean b, final int n, final wg8 wg8) {
        if ((n & 0x2) != 0x0) {
            s = "";
        }
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        this(uri, s, b);
    }
    
    public static BirdwatchWebViewContentViewArgs copy$default(final BirdwatchWebViewContentViewArgs birdwatchWebViewContentViewArgs, Uri uri, String tweetId, boolean isOwnProfile, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            uri = birdwatchWebViewContentViewArgs.uri;
        }
        if ((n & 0x2) != 0x0) {
            tweetId = birdwatchWebViewContentViewArgs.tweetId;
        }
        if ((n & 0x4) != 0x0) {
            isOwnProfile = birdwatchWebViewContentViewArgs.isOwnProfile;
        }
        return birdwatchWebViewContentViewArgs.copy(uri, tweetId, isOwnProfile);
    }
    
    public static final BirdwatchWebViewContentViewArgs createContributeArgs(final long n) {
        Objects.requireNonNull(BirdwatchWebViewContentViewArgs.Companion);
        final Uri build = Uri.parse("https://twitter.com/i/birdwatch/contribute").buildUpon().appendPath(String.valueOf(n)).build();
        e0e.e((Object)build, "uri");
        return new BirdwatchWebViewContentViewArgs(build, String.valueOf(n), false, 4, null);
    }
    
    public static final BirdwatchWebViewContentViewArgs createHistoryArgs(final String s) {
        final BirdwatchWebViewContentViewArgs.BirdwatchWebViewContentViewArgs$Companion companion = BirdwatchWebViewContentViewArgs.Companion;
        Objects.requireNonNull(companion);
        e0e.f((Object)s, "username");
        return companion.a(s, false);
    }
    
    public static final BirdwatchWebViewContentViewArgs createHistoryArgs(final String s, final boolean b) {
        return BirdwatchWebViewContentViewArgs.Companion.a(s, b);
    }
    
    public static final BirdwatchWebViewContentViewArgs createNoteArgs(final long n) {
        Objects.requireNonNull(BirdwatchWebViewContentViewArgs.Companion);
        final Uri build = Uri.parse("https://twitter.com/i/birdwatch/n").buildUpon().appendPath(String.valueOf(n)).build();
        e0e.e((Object)build, "uri");
        return new BirdwatchWebViewContentViewArgs(build, null, false, 6, null);
    }
    
    public static final BirdwatchWebViewContentViewArgs createNotesForTweetArgs(final long n) {
        Objects.requireNonNull(BirdwatchWebViewContentViewArgs.Companion);
        final Uri build = Uri.parse("https://twitter.com/i/birdwatch/t").buildUpon().appendPath(String.valueOf(n)).build();
        e0e.e((Object)build, "uri");
        return new BirdwatchWebViewContentViewArgs(build, null, false, 6, null);
    }
    
    @bmp(with = l6w.class)
    public static void getUri$annotations() {
    }
    
    public static final void write$Self(final BirdwatchWebViewContentViewArgs birdwatchWebViewContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)birdwatchWebViewContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        final l6w b = l6w.b;
        final Uri uri = birdwatchWebViewContentViewArgs.uri;
        final int n = 0;
        ee6.T(serialDescriptor, 0, (fmp)b, (Object)uri);
        boolean b2 = false;
        Label_0076: {
            if (!ee6.z(serialDescriptor)) {
                if (e0e.a((Object)birdwatchWebViewContentViewArgs.tweetId, (Object)"")) {
                    b2 = false;
                    break Label_0076;
                }
            }
            b2 = true;
        }
        if (b2) {
            ee6.S(serialDescriptor, 1, birdwatchWebViewContentViewArgs.tweetId);
        }
        int n2 = 0;
        Label_0117: {
            if (!ee6.z(serialDescriptor)) {
                n2 = n;
                if (!birdwatchWebViewContentViewArgs.isOwnProfile) {
                    break Label_0117;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            ee6.R(serialDescriptor, 2, birdwatchWebViewContentViewArgs.isOwnProfile);
        }
    }
    
    public final Uri component1() {
        return this.uri;
    }
    
    public final String component2() {
        return this.tweetId;
    }
    
    public final boolean component3() {
        return this.isOwnProfile;
    }
    
    public final BirdwatchWebViewContentViewArgs copy(final Uri uri, final String s, final boolean b) {
        e0e.f((Object)uri, "uri");
        e0e.f((Object)s, "tweetId");
        return new BirdwatchWebViewContentViewArgs(uri, s, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BirdwatchWebViewContentViewArgs)) {
            return false;
        }
        final BirdwatchWebViewContentViewArgs birdwatchWebViewContentViewArgs = (BirdwatchWebViewContentViewArgs)o;
        return e0e.a((Object)this.uri, (Object)birdwatchWebViewContentViewArgs.uri) && e0e.a((Object)this.tweetId, (Object)birdwatchWebViewContentViewArgs.tweetId) && this.isOwnProfile == birdwatchWebViewContentViewArgs.isOwnProfile;
    }
    
    public final String getTweetId() {
        return this.tweetId;
    }
    
    public final Uri getUri() {
        return this.uri;
    }
    
    @Override
    public int hashCode() {
        final int d = brg.d(this.tweetId, this.uri.hashCode() * 31, 31);
        int isOwnProfile;
        if ((isOwnProfile = (this.isOwnProfile ? 1 : 0)) != 0) {
            isOwnProfile = 1;
        }
        return d + isOwnProfile;
    }
    
    public final boolean isOwnProfile() {
        return this.isOwnProfile;
    }
    
    @Override
    public String toString() {
        final Uri uri = this.uri;
        final String tweetId = this.tweetId;
        final boolean isOwnProfile = this.isOwnProfile;
        final StringBuilder sb = new StringBuilder();
        sb.append("BirdwatchWebViewContentViewArgs(uri=");
        sb.append(uri);
        sb.append(", tweetId=");
        sb.append(tweetId);
        sb.append(", isOwnProfile=");
        return xj0.B(sb, isOwnProfile, ")");
    }
}
