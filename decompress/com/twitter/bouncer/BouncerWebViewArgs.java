// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.bouncer;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B#\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 B7\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006'" }, d2 = { "Lcom/twitter/bouncer/BouncerWebViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "", "component2", "component3", "bounceLocation", "skippable", "webviewTitle", "copy", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getBounceLocation", "()Ljava/lang/String;", "Z", "getSkippable", "()Z", "getWebviewTitle", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ldmp;)V", "Companion", "$serializer", "feature.tfa.bouncer.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BouncerWebViewArgs implements ContentViewArgs
{
    public static final BouncerWebViewArgs.BouncerWebViewArgs$Companion Companion;
    public static final BouncerWebViewArgs DEFAULT;
    private final String bounceLocation;
    private final boolean skippable;
    private final String webviewTitle;
    
    static {
        Companion = new BouncerWebViewArgs.BouncerWebViewArgs$Companion();
        DEFAULT = new BouncerWebViewArgs(null, false, null);
    }
    
    public BouncerWebViewArgs(final int n, final String bounceLocation, final boolean skippable, final String webviewTitle, final dmp dmp) {
        if (0x7 == (n & 0x7)) {
            this.bounceLocation = bounceLocation;
            this.skippable = skippable;
            this.webviewTitle = webviewTitle;
            return;
        }
        shw.V0(n, 7, BouncerWebViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BouncerWebViewArgs(final String bounceLocation, final boolean skippable, final String webviewTitle) {
        this.bounceLocation = bounceLocation;
        this.skippable = skippable;
        this.webviewTitle = webviewTitle;
    }
    
    public static BouncerWebViewArgs copy$default(final BouncerWebViewArgs bouncerWebViewArgs, String bounceLocation, boolean skippable, String webviewTitle, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            bounceLocation = bouncerWebViewArgs.bounceLocation;
        }
        if ((n & 0x2) != 0x0) {
            skippable = bouncerWebViewArgs.skippable;
        }
        if ((n & 0x4) != 0x0) {
            webviewTitle = bouncerWebViewArgs.webviewTitle;
        }
        return bouncerWebViewArgs.copy(bounceLocation, skippable, webviewTitle);
    }
    
    public static final void write$Self(final BouncerWebViewArgs bouncerWebViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)bouncerWebViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        final dlr a = dlr.a;
        ee6.y(serialDescriptor, 0, (fmp)a, (Object)bouncerWebViewArgs.bounceLocation);
        ee6.R(serialDescriptor, 1, bouncerWebViewArgs.skippable);
        ee6.y(serialDescriptor, 2, (fmp)a, (Object)bouncerWebViewArgs.webviewTitle);
    }
    
    public final String component1() {
        return this.bounceLocation;
    }
    
    public final boolean component2() {
        return this.skippable;
    }
    
    public final String component3() {
        return this.webviewTitle;
    }
    
    public final BouncerWebViewArgs copy(final String s, final boolean b, final String s2) {
        return new BouncerWebViewArgs(s, b, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BouncerWebViewArgs)) {
            return false;
        }
        final BouncerWebViewArgs bouncerWebViewArgs = (BouncerWebViewArgs)o;
        return e0e.a((Object)this.bounceLocation, (Object)bouncerWebViewArgs.bounceLocation) && this.skippable == bouncerWebViewArgs.skippable && e0e.a((Object)this.webviewTitle, (Object)bouncerWebViewArgs.webviewTitle);
    }
    
    public final String getBounceLocation() {
        return this.bounceLocation;
    }
    
    public final boolean getSkippable() {
        return this.skippable;
    }
    
    public final String getWebviewTitle() {
        return this.webviewTitle;
    }
    
    @Override
    public int hashCode() {
        final String bounceLocation = this.bounceLocation;
        int hashCode = 0;
        int hashCode2;
        if (bounceLocation == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = bounceLocation.hashCode();
        }
        int skippable;
        if ((skippable = (this.skippable ? 1 : 0)) != 0) {
            skippable = 1;
        }
        final String webviewTitle = this.webviewTitle;
        if (webviewTitle != null) {
            hashCode = webviewTitle.hashCode();
        }
        return (hashCode2 * 31 + skippable) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        return m51.y(fd.H("BouncerWebViewArgs(bounceLocation=", this.bounceLocation, ", skippable=", this.skippable, ", webviewTitle="), this.webviewTitle, ")");
    }
}
