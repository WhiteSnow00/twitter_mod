// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.hours;

import kotlinx.serialization.KSerializer;
import com.twitter.business.model.hours.IntervalPosition$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.model.hours.IntervalPosition;
import com.twitter.profilemodules.model.business.Weekday;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\"\u0010#B7\b\u0017\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!¨\u0006*" }, d2 = { "Lcom/twitter/business/moduleconfiguration/businessinfo/hours/TimeSelectionContext;", "", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lcom/twitter/profilemodules/model/business/Weekday;", "component1", "", "component2", "Lcom/twitter/business/model/hours/IntervalPosition;", "component3", "day", "intervalIndex", "intervalPosition", "copy", "", "toString", "hashCode", "other", "", "equals", "Lcom/twitter/profilemodules/model/business/Weekday;", "getDay", "()Lcom/twitter/profilemodules/model/business/Weekday;", "I", "getIntervalIndex", "()I", "Lcom/twitter/business/model/hours/IntervalPosition;", "getIntervalPosition", "()Lcom/twitter/business/model/hours/IntervalPosition;", "<init>", "(Lcom/twitter/profilemodules/model/business/Weekday;ILcom/twitter/business/model/hours/IntervalPosition;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILcom/twitter/profilemodules/model/business/Weekday;ILcom/twitter/business/model/hours/IntervalPosition;Lhlp;)V", "Companion", "$serializer", "feature.tfa.business.module-configuration.business-info_release" }, k = 1, mv = { 1, 7, 1 })
public final class TimeSelectionContext
{
    public static final Companion Companion;
    public static final y4j<TimeSelectionContext> SERIALIZER;
    private final Weekday day;
    private final int intervalIndex;
    private final IntervalPosition intervalPosition;
    
    static {
        Companion = new Companion();
        SERIALIZER = (y4j)new TimeSelectionContext$a();
    }
    
    public TimeSelectionContext(final int n, final Weekday day, final int intervalIndex, final IntervalPosition intervalPosition, final hlp hlp) {
        if (0x7 == (n & 0x7)) {
            this.day = day;
            this.intervalIndex = intervalIndex;
            this.intervalPosition = intervalPosition;
            return;
        }
        blz.a0(n, 7, TimeSelectionContext$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public TimeSelectionContext(final Weekday day, final int intervalIndex, final IntervalPosition intervalPosition) {
        czd.f((Object)day, "day");
        czd.f((Object)intervalPosition, "intervalPosition");
        this.day = day;
        this.intervalIndex = intervalIndex;
        this.intervalPosition = intervalPosition;
    }
    
    public static TimeSelectionContext copy$default(final TimeSelectionContext timeSelectionContext, Weekday day, int intervalIndex, IntervalPosition intervalPosition, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            day = timeSelectionContext.day;
        }
        if ((n & 0x2) != 0x0) {
            intervalIndex = timeSelectionContext.intervalIndex;
        }
        if ((n & 0x4) != 0x0) {
            intervalPosition = timeSelectionContext.intervalPosition;
        }
        return timeSelectionContext.copy(day, intervalIndex, intervalPosition);
    }
    
    public static final void write$Self(final TimeSelectionContext timeSelectionContext, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)timeSelectionContext, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.T(serialDescriptor, 0, (jlp)Weekday.$serializer.INSTANCE, (Object)timeSelectionContext.day);
        xc6.Q(serialDescriptor, 1, timeSelectionContext.intervalIndex);
        xc6.T(serialDescriptor, 2, (jlp)IntervalPosition$$serializer.INSTANCE, (Object)timeSelectionContext.intervalPosition);
    }
    
    public final Weekday component1() {
        return this.day;
    }
    
    public final int component2() {
        return this.intervalIndex;
    }
    
    public final IntervalPosition component3() {
        return this.intervalPosition;
    }
    
    public final TimeSelectionContext copy(final Weekday weekday, final int n, final IntervalPosition intervalPosition) {
        czd.f((Object)weekday, "day");
        czd.f((Object)intervalPosition, "intervalPosition");
        return new TimeSelectionContext(weekday, n, intervalPosition);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeSelectionContext)) {
            return false;
        }
        final TimeSelectionContext timeSelectionContext = (TimeSelectionContext)o;
        return this.day == timeSelectionContext.day && this.intervalIndex == timeSelectionContext.intervalIndex && this.intervalPosition == timeSelectionContext.intervalPosition;
    }
    
    public final Weekday getDay() {
        return this.day;
    }
    
    public final int getIntervalIndex() {
        return this.intervalIndex;
    }
    
    public final IntervalPosition getIntervalPosition() {
        return this.intervalPosition;
    }
    
    @Override
    public int hashCode() {
        return this.intervalPosition.hashCode() + (this.day.hashCode() * 31 + this.intervalIndex) * 31;
    }
    
    @Override
    public String toString() {
        final Weekday day = this.day;
        final int intervalIndex = this.intervalIndex;
        final IntervalPosition intervalPosition = this.intervalPosition;
        final StringBuilder sb = new StringBuilder();
        sb.append("TimeSelectionContext(day=");
        sb.append(day);
        sb.append(", intervalIndex=");
        sb.append(intervalIndex);
        sb.append(", intervalPosition=");
        sb.append(intervalPosition);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/business/moduleconfiguration/businessinfo/hours/TimeSelectionContext$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/business/moduleconfiguration/businessinfo/hours/TimeSelectionContext;", "serializer", "Ly4j;", "SERIALIZER", "Ly4j;", "feature.tfa.business.module-configuration.business-info_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<TimeSelectionContext> serializer() {
            return (KSerializer<TimeSelectionContext>)TimeSelectionContext$$serializer.INSTANCE;
        }
    }
}
