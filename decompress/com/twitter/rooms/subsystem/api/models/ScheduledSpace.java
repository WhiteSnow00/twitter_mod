// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.subsystem.api.models;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Set;
import tv.periscope.model.NarrowcastSpaceType;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B=\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b.\u0010/BW\b\u0017\u0012\u0006\u00100\u001a\u00020\u001c\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00103J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0012H\u00c6\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u0012H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b\u0017\u0010*R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b\u0018\u0010*R\u0017\u0010\u0019\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b,\u0010-¨\u00066" }, d2 = { "Lcom/twitter/rooms/subsystem/api/models/ScheduledSpace;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "", "component2", "", "component3", "", "component4", "component5", "Ltv/periscope/model/NarrowcastSpaceType;", "component6", "description", "timeInMs", "topicIds", "isSpaceRecording", "isSpaceClippable", "narrowCastSpaceType", "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "J", "getTimeInMs", "()J", "Ljava/util/Set;", "getTopicIds", "()Ljava/util/Set;", "Z", "()Z", "Ltv/periscope/model/NarrowcastSpaceType;", "getNarrowCastSpaceType", "()Ltv/periscope/model/NarrowcastSpaceType;", "<init>", "(Ljava/lang/String;JLjava/util/Set;ZZLtv/periscope/model/NarrowcastSpaceType;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/util/Set;ZZLtv/periscope/model/NarrowcastSpaceType;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class ScheduledSpace
{
    public static final Companion Companion;
    private final String description = description;
    private final boolean isSpaceClippable = isSpaceClippable;
    private final boolean isSpaceRecording = isSpaceRecording;
    private final NarrowcastSpaceType narrowCastSpaceType = narrowCastSpaceType;
    private final long timeInMs = timeInMs;
    private final Set<String> topicIds = topicIds;
    
    static {
        Companion = new Companion();
    }
    
    public ScheduledSpace(final String description, final long timeInMs, final Set<String> topicIds, final boolean isSpaceRecording, final boolean isSpaceClippable, final NarrowcastSpaceType narrowCastSpaceType) {
        zzd.f((Object)description, "description");
        zzd.f((Object)topicIds, "topicIds");
        zzd.f((Object)narrowCastSpaceType, "narrowCastSpaceType");
        this.description = description;
        this.timeInMs = timeInMs;
        this.topicIds = topicIds;
        this.isSpaceRecording = isSpaceRecording;
        this.isSpaceClippable = isSpaceClippable;
        this.narrowCastSpaceType = narrowCastSpaceType;
    }
    
    public static final void write$Self(final ScheduledSpace scheduledSpace, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)scheduledSpace, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.S(serialDescriptor, 0, scheduledSpace.description);
        sd6.i0(serialDescriptor, 1, scheduledSpace.timeInMs);
        sd6.T(serialDescriptor, 2, (skp)new lif((KSerializer)njr.a), (Object)scheduledSpace.topicIds);
        sd6.R(serialDescriptor, 3, scheduledSpace.isSpaceRecording);
        sd6.R(serialDescriptor, 4, scheduledSpace.isSpaceClippable);
        sd6.T(serialDescriptor, 5, (skp)NarrowcastSpaceType.Companion.serializer(), (Object)scheduledSpace.narrowCastSpaceType);
    }
    
    public final String component1() {
        return this.description;
    }
    
    public final long component2() {
        return this.timeInMs;
    }
    
    public final Set<String> component3() {
        return this.topicIds;
    }
    
    public final boolean component4() {
        return this.isSpaceRecording;
    }
    
    public final boolean component5() {
        return this.isSpaceClippable;
    }
    
    public final NarrowcastSpaceType component6() {
        return this.narrowCastSpaceType;
    }
    
    public final ScheduledSpace copy(final String s, final long n, final Set<String> set, final boolean b, final boolean b2, final NarrowcastSpaceType narrowcastSpaceType) {
        zzd.f((Object)s, "description");
        zzd.f((Object)set, "topicIds");
        zzd.f((Object)narrowcastSpaceType, "narrowCastSpaceType");
        return new ScheduledSpace(s, n, set, b, b2, narrowcastSpaceType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledSpace)) {
            return false;
        }
        final ScheduledSpace scheduledSpace = (ScheduledSpace)o;
        return zzd.a((Object)this.description, (Object)scheduledSpace.description) && this.timeInMs == scheduledSpace.timeInMs && zzd.a((Object)this.topicIds, (Object)scheduledSpace.topicIds) && this.isSpaceRecording == scheduledSpace.isSpaceRecording && this.isSpaceClippable == scheduledSpace.isSpaceClippable && zzd.a((Object)this.narrowCastSpaceType, (Object)scheduledSpace.narrowCastSpaceType);
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final NarrowcastSpaceType getNarrowCastSpaceType() {
        return this.narrowCastSpaceType;
    }
    
    public final long getTimeInMs() {
        return this.timeInMs;
    }
    
    public final Set<String> getTopicIds() {
        return this.topicIds;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.description.hashCode();
        final long timeInMs = this.timeInMs;
        final int p = dia.p((Set)this.topicIds, (hashCode * 31 + (int)(timeInMs ^ timeInMs >>> 32)) * 31, 31);
        final int isSpaceRecording = this.isSpaceRecording ? 1 : 0;
        int n = 1;
        int n2 = isSpaceRecording;
        if (isSpaceRecording != 0) {
            n2 = 1;
        }
        final int isSpaceClippable = this.isSpaceClippable ? 1 : 0;
        if (isSpaceClippable == 0) {
            n = isSpaceClippable;
        }
        return this.narrowCastSpaceType.hashCode() + ((p + n2) * 31 + n) * 31;
    }
    
    public final boolean isSpaceClippable() {
        return this.isSpaceClippable;
    }
    
    public final boolean isSpaceRecording() {
        return this.isSpaceRecording;
    }
    
    @Override
    public String toString() {
        final String description = this.description;
        final long timeInMs = this.timeInMs;
        final Set<String> topicIds = this.topicIds;
        final boolean isSpaceRecording = this.isSpaceRecording;
        final boolean isSpaceClippable = this.isSpaceClippable;
        final NarrowcastSpaceType narrowCastSpaceType = this.narrowCastSpaceType;
        final StringBuilder i = hfe.i("ScheduledSpace(description=", description, ", timeInMs=", timeInMs);
        i.append(", topicIds=");
        i.append(topicIds);
        i.append(", isSpaceRecording=");
        i.append(isSpaceRecording);
        i.append(", isSpaceClippable=");
        i.append(isSpaceClippable);
        i.append(", narrowCastSpaceType=");
        i.append(narrowCastSpaceType);
        i.append(")");
        return i.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/subsystem/api/models/ScheduledSpace$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/subsystem/api/models/ScheduledSpace;", "serializer", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<ScheduledSpace> serializer() {
            return (KSerializer<ScheduledSpace>)ScheduledSpace$$serializer.INSTANCE;
        }
    }
}
