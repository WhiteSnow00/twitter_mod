// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.api.args;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b \u0010!B1\b\u0017\u0012\u0006\u0010\"\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0003J(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fH\u00c6\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006(" }, d2 = { "Lcom/twitter/nft/subsystem/api/args/NFTDetailContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "Lqgv;", "component2", "profileImageColor", "twitterUser", "copy", "(Ljava/lang/Integer;Lqgv;)Lcom/twitter/nft/subsystem/api/args/NFTDetailContentViewArgs;", "", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/Integer;", "getProfileImageColor", "Lqgv;", "getTwitterUser", "()Lqgv;", "getTwitterUser$annotations", "()V", "<init>", "(Ljava/lang/Integer;Lqgv;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lqgv;Ldmp;)V", "Companion", "$serializer", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTDetailContentViewArgs implements ContentViewArgs
{
    public static final NFTDetailContentViewArgs.NFTDetailContentViewArgs$Companion Companion;
    private final Integer profileImageColor;
    private final qgv twitterUser;
    
    static {
        Companion = new NFTDetailContentViewArgs.NFTDetailContentViewArgs$Companion();
    }
    
    public NFTDetailContentViewArgs() {
        this(null, null, 3, null);
    }
    
    public NFTDetailContentViewArgs(final int n, final Integer profileImageColor, @bmp(with = xgv.class) final qgv twitterUser, final dmp dmp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.profileImageColor = null;
            }
            else {
                this.profileImageColor = profileImageColor;
            }
            if ((n & 0x2) == 0x0) {
                this.twitterUser = null;
            }
            else {
                this.twitterUser = twitterUser;
            }
            return;
        }
        shw.V0(n, 0, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public NFTDetailContentViewArgs(final Integer profileImageColor, final qgv twitterUser) {
        this.profileImageColor = profileImageColor;
        this.twitterUser = twitterUser;
    }
    
    public NFTDetailContentViewArgs(Integer n, qgv qgv, final int n2, final wg8 wg8) {
        if ((n2 & 0x1) != 0x0) {
            n = null;
        }
        if ((n2 & 0x2) != 0x0) {
            qgv = null;
        }
        this(n, qgv);
    }
    
    public static NFTDetailContentViewArgs copy$default(final NFTDetailContentViewArgs nftDetailContentViewArgs, Integer profileImageColor, qgv twitterUser, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            profileImageColor = nftDetailContentViewArgs.profileImageColor;
        }
        if ((n & 0x2) != 0x0) {
            twitterUser = nftDetailContentViewArgs.twitterUser;
        }
        return nftDetailContentViewArgs.copy(profileImageColor, twitterUser);
    }
    
    @bmp(with = xgv.class)
    public static void getTwitterUser$annotations() {
    }
    
    public static final void write$Self(final NFTDetailContentViewArgs nftDetailContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)nftDetailContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        final boolean z = ee6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (nftDetailContentViewArgs.profileImageColor == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            ee6.y(serialDescriptor, 0, (fmp)mud.a, (Object)nftDetailContentViewArgs.profileImageColor);
        }
        int n2 = 0;
        Label_0096: {
            if (!ee6.z(serialDescriptor)) {
                n2 = n;
                if (nftDetailContentViewArgs.twitterUser == null) {
                    break Label_0096;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            ee6.y(serialDescriptor, 1, (fmp)xgv.b, (Object)nftDetailContentViewArgs.twitterUser);
        }
    }
    
    public final Integer component1() {
        return this.profileImageColor;
    }
    
    public final qgv component2() {
        return this.twitterUser;
    }
    
    public final NFTDetailContentViewArgs copy(final Integer n, final qgv qgv) {
        return new NFTDetailContentViewArgs(n, qgv);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NFTDetailContentViewArgs)) {
            return false;
        }
        final NFTDetailContentViewArgs nftDetailContentViewArgs = (NFTDetailContentViewArgs)o;
        return e0e.a((Object)this.profileImageColor, (Object)nftDetailContentViewArgs.profileImageColor) && e0e.a((Object)this.twitterUser, (Object)nftDetailContentViewArgs.twitterUser);
    }
    
    public final Integer getProfileImageColor() {
        return this.profileImageColor;
    }
    
    public final qgv getTwitterUser() {
        return this.twitterUser;
    }
    
    @Override
    public int hashCode() {
        final Integer profileImageColor = this.profileImageColor;
        int hashCode = 0;
        int hashCode2;
        if (profileImageColor == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = profileImageColor.hashCode();
        }
        final qgv twitterUser = this.twitterUser;
        if (twitterUser != null) {
            hashCode = twitterUser.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final Integer profileImageColor = this.profileImageColor;
        final qgv twitterUser = this.twitterUser;
        final StringBuilder sb = new StringBuilder();
        sb.append("NFTDetailContentViewArgs(profileImageColor=");
        sb.append(profileImageColor);
        sb.append(", twitterUser=");
        sb.append(twitterUser);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/nft/subsystem/api/args/NFTDetailContentViewArgs.$serializer", "Lezb;", "Lcom/twitter/nft/subsystem/api/args/NFTDetailContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<NFTDetailContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.nft.subsystem.api.args.NFTDetailContentViewArgs", (ezb)(INSTANCE = new $serializer()), 2);
            descriptor2.k("profileImageColor", true);
            descriptor2.k("twitterUser", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.e((KSerializer)mud.a), BuiltinSerializersKt.e((KSerializer)xgv.b) };
        }
        
        public NFTDetailContentViewArgs deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            Object n2 = null;
            int i = 1;
            int n3 = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            throw new UnknownFieldException(o);
                        }
                        n = c.n(descriptor, 1, (DeserializationStrategy)xgv.b, n);
                        n3 |= 0x2;
                    }
                    else {
                        n2 = c.n(descriptor, 0, (DeserializationStrategy)mud.a, n2);
                        n3 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new NFTDetailContentViewArgs(n3, (Integer)n2, (qgv)n, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final NFTDetailContentViewArgs nftDetailContentViewArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)nftDetailContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            NFTDetailContentViewArgs.write$Self(nftDetailContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (NFTDetailContentViewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
