// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.common;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.List;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B&\u0012\u001d\u0010\u000f\u001a\u0019\u0012\u0015\u0012\u00130\n¢\u0006\u000e\b\u000b\u0012\n\b\f\u0012\u0006\b\t0\rX\u00000\t¢\u0006\u0004\b\u001c\u0010\u001dB<\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0013\u0012\u001f\u0010\u000f\u001a\u001b\u0012\u0015\u0012\u00130\n¢\u0006\u000e\b\u000b\u0012\n\b\f\u0012\u0006\b\t0\rX\u0000\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J \u0010\u000e\u001a\u0019\u0012\u0015\u0012\u00130\n¢\u0006\u000e\b\u000b\u0012\n\b\f\u0012\u0006\b\t0\rX\u00000\tH\u00c6\u0003J*\u0010\u0010\u001a\u00020\u00002\u001f\b\u0002\u0010\u000f\u001a\u0019\u0012\u0015\u0012\u00130\n¢\u0006\u000e\b\u000b\u0012\n\b\f\u0012\u0006\b\t0\rX\u00000\tH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R.\u0010\u000f\u001a\u0019\u0012\u0015\u0012\u00130\n¢\u0006\u000e\b\u000b\u0012\n\b\f\u0012\u0006\b\t0\rX\u00000\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006$" }, d2 = { "Lcom/twitter/api/common/GraphQlErrorSheetArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "Lhbv;", "Lflp;", "with", "Libv;", "component1", "networkErrors", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "getNetworkErrors", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/util/List;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.twitter-api.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class GraphQlErrorSheetArgs implements ContentViewArgs
{
    public static final GraphQlErrorSheetArgs.GraphQlErrorSheetArgs$Companion Companion;
    public static final String FRAGMENT_TAG = "GraphQlErrorSheetFragment";
    private final List<hbv> networkErrors;
    
    static {
        Companion = new GraphQlErrorSheetArgs.GraphQlErrorSheetArgs$Companion();
    }
    
    public GraphQlErrorSheetArgs(final int n, final List networkErrors, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.networkErrors = networkErrors;
            return;
        }
        blz.a0(n, 1, GraphQlErrorSheetArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public GraphQlErrorSheetArgs(final List<? extends hbv> networkErrors) {
        czd.f((Object)networkErrors, "networkErrors");
        this.networkErrors = (List<hbv>)networkErrors;
    }
    
    public static GraphQlErrorSheetArgs copy$default(final GraphQlErrorSheetArgs graphQlErrorSheetArgs, List networkErrors, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            networkErrors = graphQlErrorSheetArgs.networkErrors;
        }
        return graphQlErrorSheetArgs.copy(networkErrors);
    }
    
    public static final void write$Self(final GraphQlErrorSheetArgs graphQlErrorSheetArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)graphQlErrorSheetArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.T(serialDescriptor, 0, (jlp)new rs0((KSerializer)ibv.b), (Object)graphQlErrorSheetArgs.networkErrors);
    }
    
    public final List<hbv> component1() {
        return this.networkErrors;
    }
    
    public final GraphQlErrorSheetArgs copy(final List<? extends hbv> list) {
        czd.f((Object)list, "networkErrors");
        return new GraphQlErrorSheetArgs(list);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof GraphQlErrorSheetArgs && czd.a((Object)this.networkErrors, (Object)((GraphQlErrorSheetArgs)o).networkErrors));
    }
    
    public final List<hbv> getNetworkErrors() {
        return this.networkErrors;
    }
    
    @Override
    public int hashCode() {
        return this.networkErrors.hashCode();
    }
    
    @Override
    public String toString() {
        return wc0.z("GraphQlErrorSheetArgs(networkErrors=", (List)this.networkErrors, ")");
    }
}
