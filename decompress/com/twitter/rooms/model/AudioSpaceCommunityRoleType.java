// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.model;

import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Objects;
import kotlinx.serialization.KSerializer;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0005\u0015\u0014\u0016\u0017\u0018B\u0011\b\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0004\u0019\u001a\u001b\u001c¨\u0006\u001d" }, d2 = { "Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "intValue", "I", "getIntValue", "()I", "<init>", "(I)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(IILqkp;)V", "Companion", "Admin", "Member", "Moderator", "NonMember", "Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType$Admin;", "Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType$Member;", "Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType$Moderator;", "Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType$NonMember;", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public abstract class AudioSpaceCommunityRoleType
{
    private static final gxe<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int intValue = intValue;
    
    static {
        Companion = new Companion();
        $cachedSerializer$delegate = rp2.y0(2, (otb)AudioSpaceCommunityRoleType$a.C0);
    }
    
    private AudioSpaceCommunityRoleType(final int intValue) {
        this.intValue = intValue;
    }
    
    public static final /* synthetic */ gxe access$get$cachedSerializer$delegate$cp() {
        return AudioSpaceCommunityRoleType.$cachedSerializer$delegate;
    }
    
    public static final AudioSpaceCommunityRoleType fromInt(final Integer n) {
        Objects.requireNonNull(AudioSpaceCommunityRoleType.Companion);
        Object instance = AudioSpaceCommunityRoleType$NonMember.INSTANCE;
        final int intValue = ((AudioSpaceCommunityRoleType)instance).getIntValue();
        if (n != null) {
            if (n == intValue) {
                return (AudioSpaceCommunityRoleType)instance;
            }
        }
        final AudioSpaceCommunityRoleType$Member instance2 = AudioSpaceCommunityRoleType$Member.INSTANCE;
        final int intValue2 = ((AudioSpaceCommunityRoleType)instance2).getIntValue();
        Label_0065: {
            if (n == null) {
                break Label_0065;
            }
            if (n != intValue2) {
                break Label_0065;
            }
            final Object o = instance2;
            instance = o;
            return (AudioSpaceCommunityRoleType)instance;
        }
        final AudioSpaceCommunityRoleType$Moderator instance3 = AudioSpaceCommunityRoleType$Moderator.INSTANCE;
        final int intValue3 = ((AudioSpaceCommunityRoleType)instance3).getIntValue();
        if (n != null) {
            if (n == intValue3) {
                final Object o = instance3;
                return (AudioSpaceCommunityRoleType)o;
            }
        }
        final AudioSpaceCommunityRoleType$Admin instance4 = AudioSpaceCommunityRoleType$Admin.INSTANCE;
        final int intValue4 = ((AudioSpaceCommunityRoleType)instance4).getIntValue();
        if (n != null) {
            if (n == intValue4) {
                final Object o = instance4;
                return (AudioSpaceCommunityRoleType)o;
            }
        }
        return (AudioSpaceCommunityRoleType)instance;
    }
    
    public static final void write$Self(final AudioSpaceCommunityRoleType audioSpaceCommunityRoleType, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)audioSpaceCommunityRoleType, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.Q(serialDescriptor, 0, audioSpaceCommunityRoleType.intValue);
    }
    
    public final int getIntValue() {
        return this.intValue;
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final AudioSpaceCommunityRoleType a(final String s) {
            while (true) {
                for (final vs5 vs5 : vs5.values()) {
                    if (zzd.a((Object)s, (Object)vs5.C0)) {
                        final vs5 vs6 = vs5;
                        vs5 g0 = vs6;
                        if (vs6 == null) {
                            g0 = vs5.G0;
                        }
                        final int ordinal = g0.ordinal();
                        Object o;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        o = AudioSpaceCommunityRoleType$NonMember.INSTANCE;
                                    }
                                    else {
                                        o = AudioSpaceCommunityRoleType$NonMember.INSTANCE;
                                    }
                                }
                                else {
                                    o = AudioSpaceCommunityRoleType$Member.INSTANCE;
                                }
                            }
                            else {
                                o = AudioSpaceCommunityRoleType$Moderator.INSTANCE;
                            }
                        }
                        else {
                            o = AudioSpaceCommunityRoleType$Admin.INSTANCE;
                        }
                        return (AudioSpaceCommunityRoleType)o;
                    }
                }
                final vs5 vs6 = null;
                continue;
            }
        }
        
        public final KSerializer<AudioSpaceCommunityRoleType> serializer() {
            return (KSerializer<AudioSpaceCommunityRoleType>)AudioSpaceCommunityRoleType.access$get$cachedSerializer$delegate$cp().getValue();
        }
    }
}
