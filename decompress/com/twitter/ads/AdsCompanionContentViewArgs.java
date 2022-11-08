// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.ads;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\r\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f" }, d2 = { "Lcom/twitter/ads/AdsCompanionContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "url", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Lqkp;)V", "Companion", "$serializer", "feature.tfa.ads.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class AdsCompanionContentViewArgs implements ContentViewArgs
{
    public static final AdsCompanionContentViewArgs.AdsCompanionContentViewArgs$Companion Companion;
    private final String url = url;
    
    static {
        Companion = new AdsCompanionContentViewArgs.AdsCompanionContentViewArgs$Companion();
    }
    
    public AdsCompanionContentViewArgs(final String url) {
        zzd.f((Object)url, "url");
        this.url = url;
    }
    
    public static final void write$Self(final AdsCompanionContentViewArgs adsCompanionContentViewArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)adsCompanionContentViewArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.S(serialDescriptor, 0, adsCompanionContentViewArgs.url);
    }
    
    public final String component1() {
        return this.url;
    }
    
    public final AdsCompanionContentViewArgs copy(final String s) {
        zzd.f((Object)s, "url");
        return new AdsCompanionContentViewArgs(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof AdsCompanionContentViewArgs && zzd.a((Object)this.url, (Object)((AdsCompanionContentViewArgs)o).url));
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        return this.url.hashCode();
    }
    
    @Override
    public String toString() {
        return zi.y("AdsCompanionContentViewArgs(url=", this.url, ")");
    }
}
