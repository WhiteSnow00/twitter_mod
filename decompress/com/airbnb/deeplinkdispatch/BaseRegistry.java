// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.deeplinkdispatch;

import java.util.Map;
import com.airbnb.deeplinkdispatch.base.Utils;
import java.util.List;
import com.airbnb.deeplinkdispatch.base.MatchIndex;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bJ*\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015H\u0007J&\u0010\u0016\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018" }, d2 = { "Lcom/airbnb/deeplinkdispatch/BaseRegistry;", "", "matchIndexArray", "", "pathSegmentReplacementKeys", "", "", "([B[Ljava/lang/String;)V", "matchIndex", "Lcom/airbnb/deeplinkdispatch/base/MatchIndex;", "pathSegmentReplacementKeysInRegistry", "", "getPathSegmentReplacementKeysInRegistry", "()Ljava/util/List;", "getAllEntries", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "idxMatch", "Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;", "deepLinkUri", "Lcom/airbnb/deeplinkdispatch/DeepLinkUri;", "pathSegmentReplacements", "", "supports", "", "deeplinkdispatch-base" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
public abstract class BaseRegistry
{
    private final MatchIndex matchIndex;
    private final List<byte[]> pathSegmentReplacementKeysInRegistry;
    
    public BaseRegistry(final byte[] array, final String[] array2) {
        czd.f((Object)array, "matchIndexArray");
        czd.f((Object)array2, "pathSegmentReplacementKeys");
        final Utils instance = Utils.INSTANCE;
        this.pathSegmentReplacementKeysInRegistry = Utils.toByteArraysList(array2);
        this.matchIndex = new MatchIndex(array);
    }
    
    public static DeepLinkMatchResult idxMatch$default(final BaseRegistry baseRegistry, final DeepLinkUri deepLinkUri, Map d0, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                d0 = k2a.D0;
            }
            return baseRegistry.idxMatch(deepLinkUri, (Map<byte[], byte[]>)d0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: idxMatch");
    }
    
    public static boolean supports$default(final BaseRegistry baseRegistry, final DeepLinkUri deepLinkUri, Map d0, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                d0 = k2a.D0;
            }
            return baseRegistry.supports(deepLinkUri, (Map<byte[], byte[]>)d0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: supports");
    }
    
    public final List<DeepLinkEntry> getAllEntries() {
        final MatchIndex matchIndex = this.matchIndex;
        final List allEntries = matchIndex.getAllEntries(0, matchIndex.length());
        czd.e((Object)allEntries, "matchIndex.getAllEntries(0, matchIndex.length())");
        return allEntries;
    }
    
    public final List<byte[]> getPathSegmentReplacementKeysInRegistry() {
        return this.pathSegmentReplacementKeysInRegistry;
    }
    
    public final DeepLinkMatchResult idxMatch(final DeepLinkUri deepLinkUri) {
        return idxMatch$default(this, deepLinkUri, null, 2, null);
    }
    
    public final DeepLinkMatchResult idxMatch(final DeepLinkUri deepLinkUri, final Map<byte[], byte[]> map) {
        czd.f((Object)map, "pathSegmentReplacements");
        if (deepLinkUri == null) {
            return null;
        }
        return this.matchIndex.matchUri(deepLinkUri, new SchemeHostAndPath(deepLinkUri).getMatchList(), (Map)k2a.D0, 0, 0, this.matchIndex.length(), (Map)map);
    }
    
    public final boolean supports(final DeepLinkUri deepLinkUri, final Map<byte[], byte[]> map) {
        czd.f((Object)map, "pathSegmentReplacements");
        return this.idxMatch(deepLinkUri, map) != null;
    }
}
