// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.pinnedreplies.core.ui;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@bmp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eB/\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%" }, d2 = { "Lcom/twitter/android/pinnedreplies/core/ui/PinnedReplyModalSheetArgs;", "Llw8;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "Ljm;", "component2", "tag", "actionType", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Ljm;", "getActionType", "()Ljm;", "<init>", "(Ljava/lang/String;Ljm;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljm;Ldmp;)V", "Companion", "$serializer", "subsystem.tfa.pinnedreplies.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class PinnedReplyModalSheetArgs implements lw8
{
    public static final int $stable = 0;
    public static final PinnedReplyModalSheetArgs.PinnedReplyModalSheetArgs$Companion Companion;
    private final jm actionType;
    private final String tag;
    
    static {
        Companion = new PinnedReplyModalSheetArgs.PinnedReplyModalSheetArgs$Companion();
    }
    
    public PinnedReplyModalSheetArgs(final int n, final String tag, final jm actionType, final dmp dmp) {
        if (0x3 == (n & 0x3)) {
            this.tag = tag;
            this.actionType = actionType;
            return;
        }
        shw.V0(n, 3, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public PinnedReplyModalSheetArgs(final String tag, final jm actionType) {
        e0e.f((Object)tag, "tag");
        e0e.f((Object)actionType, "actionType");
        this.tag = tag;
        this.actionType = actionType;
    }
    
    public static PinnedReplyModalSheetArgs copy$default(final PinnedReplyModalSheetArgs pinnedReplyModalSheetArgs, String tag, jm actionType, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            tag = pinnedReplyModalSheetArgs.getTag();
        }
        if ((n & 0x2) != 0x0) {
            actionType = pinnedReplyModalSheetArgs.actionType;
        }
        return pinnedReplyModalSheetArgs.copy(tag, actionType);
    }
    
    public static final void write$Self(final PinnedReplyModalSheetArgs pinnedReplyModalSheetArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)pinnedReplyModalSheetArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.S(serialDescriptor, 0, pinnedReplyModalSheetArgs.getTag());
        ee6.T(serialDescriptor, 1, (fmp)new t8a("com.twitter.android.pinnedreplies.core.ui.ActionType", (Enum[])jm.values()), (Object)pinnedReplyModalSheetArgs.actionType);
    }
    
    public final String component1() {
        return this.getTag();
    }
    
    public final jm component2() {
        return this.actionType;
    }
    
    public final PinnedReplyModalSheetArgs copy(final String s, final jm jm) {
        e0e.f((Object)s, "tag");
        e0e.f((Object)jm, "actionType");
        return new PinnedReplyModalSheetArgs(s, jm);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PinnedReplyModalSheetArgs)) {
            return false;
        }
        final PinnedReplyModalSheetArgs pinnedReplyModalSheetArgs = (PinnedReplyModalSheetArgs)o;
        return e0e.a((Object)this.getTag(), (Object)pinnedReplyModalSheetArgs.getTag()) && this.actionType == pinnedReplyModalSheetArgs.actionType;
    }
    
    public final jm getActionType() {
        return this.actionType;
    }
    
    public String getTag() {
        return this.tag;
    }
    
    @Override
    public int hashCode() {
        return this.actionType.hashCode() + this.getTag().hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final String tag = this.getTag();
        final jm actionType = this.actionType;
        final StringBuilder sb = new StringBuilder();
        sb.append("PinnedReplyModalSheetArgs(tag=");
        sb.append(tag);
        sb.append(", actionType=");
        sb.append(actionType);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/android/pinnedreplies/core/ui/PinnedReplyModalSheetArgs.$serializer", "Lezb;", "Lcom/twitter/android/pinnedreplies/core/ui/PinnedReplyModalSheetArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.pinnedreplies.core_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<PinnedReplyModalSheetArgs>
    {
        public static final int $stable;
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.android.pinnedreplies.core.ui.PinnedReplyModalSheetArgs", (ezb)(INSTANCE = new $serializer()), 2);
            descriptor2.k("tag", false);
            descriptor2.k("actionType", false);
            descriptor = (SerialDescriptor)descriptor2;
            $stable = 8;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)dlr.a, (KSerializer)new t8a("com.twitter.android.pinnedreplies.core.ui.ActionType", (Enum[])jm.values()) };
        }
        
        public PinnedReplyModalSheetArgs deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object x = null;
            String m = null;
            int i = 1;
            int n = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            throw new UnknownFieldException(o);
                        }
                        x = c.x(descriptor, 1, (DeserializationStrategy)new t8a("com.twitter.android.pinnedreplies.core.ui.ActionType", (Enum[])jm.values()), x);
                        n |= 0x2;
                    }
                    else {
                        m = c.m(descriptor, 0);
                        n |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new PinnedReplyModalSheetArgs(n, m, (jm)x, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final PinnedReplyModalSheetArgs pinnedReplyModalSheetArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)pinnedReplyModalSheetArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            PinnedReplyModalSheetArgs.write$Self(pinnedReplyModalSheetArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (PinnedReplyModalSheetArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
