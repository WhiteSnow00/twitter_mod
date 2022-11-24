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
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u001f\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB/\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\"" }, d2 = { "Lcom/twitter/nft/subsystem/api/args/NFTWalletConnectContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "component2", "address", "signature", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "getSignature", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ldmp;)V", "Companion", "$serializer", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTWalletConnectContentViewArgs implements ContentViewArgs
{
    public static final NFTWalletConnectContentViewArgs.NFTWalletConnectContentViewArgs$Companion Companion;
    private final String address;
    private final String signature;
    
    static {
        Companion = new NFTWalletConnectContentViewArgs.NFTWalletConnectContentViewArgs$Companion();
    }
    
    public NFTWalletConnectContentViewArgs() {
        this(null, null, 3, null);
    }
    
    public NFTWalletConnectContentViewArgs(final int n, final String address, final String signature, final dmp dmp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.address = null;
            }
            else {
                this.address = address;
            }
            if ((n & 0x2) == 0x0) {
                this.signature = null;
            }
            else {
                this.signature = signature;
            }
            return;
        }
        shw.V0(n, 0, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public NFTWalletConnectContentViewArgs(final String address, final String signature) {
        this.address = address;
        this.signature = signature;
    }
    
    public NFTWalletConnectContentViewArgs(String s, String s2, final int n, final wg8 wg8) {
        if ((n & 0x1) != 0x0) {
            s = null;
        }
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        this(s, s2);
    }
    
    public static NFTWalletConnectContentViewArgs copy$default(final NFTWalletConnectContentViewArgs nftWalletConnectContentViewArgs, String address, String signature, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            address = nftWalletConnectContentViewArgs.address;
        }
        if ((n & 0x2) != 0x0) {
            signature = nftWalletConnectContentViewArgs.signature;
        }
        return nftWalletConnectContentViewArgs.copy(address, signature);
    }
    
    public static final void write$Self(final NFTWalletConnectContentViewArgs nftWalletConnectContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)nftWalletConnectContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        final boolean z = ee6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (nftWalletConnectContentViewArgs.address == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            ee6.y(serialDescriptor, 0, (fmp)dlr.a, (Object)nftWalletConnectContentViewArgs.address);
        }
        int n2 = 0;
        Label_0096: {
            if (!ee6.z(serialDescriptor)) {
                n2 = n;
                if (nftWalletConnectContentViewArgs.signature == null) {
                    break Label_0096;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            ee6.y(serialDescriptor, 1, (fmp)dlr.a, (Object)nftWalletConnectContentViewArgs.signature);
        }
    }
    
    public final String component1() {
        return this.address;
    }
    
    public final String component2() {
        return this.signature;
    }
    
    public final NFTWalletConnectContentViewArgs copy(final String s, final String s2) {
        return new NFTWalletConnectContentViewArgs(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NFTWalletConnectContentViewArgs)) {
            return false;
        }
        final NFTWalletConnectContentViewArgs nftWalletConnectContentViewArgs = (NFTWalletConnectContentViewArgs)o;
        return e0e.a((Object)this.address, (Object)nftWalletConnectContentViewArgs.address) && e0e.a((Object)this.signature, (Object)nftWalletConnectContentViewArgs.signature);
    }
    
    public final String getAddress() {
        return this.address;
    }
    
    public final String getSignature() {
        return this.signature;
    }
    
    @Override
    public int hashCode() {
        final String address = this.address;
        int hashCode = 0;
        int hashCode2;
        if (address == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = address.hashCode();
        }
        final String signature = this.signature;
        if (signature != null) {
            hashCode = signature.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        return dvc.d("NFTWalletConnectContentViewArgs(address=", this.address, ", signature=", this.signature, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/nft/subsystem/api/args/NFTWalletConnectContentViewArgs.$serializer", "Lezb;", "Lcom/twitter/nft/subsystem/api/args/NFTWalletConnectContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<NFTWalletConnectContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.nft.subsystem.api.args.NFTWalletConnectContentViewArgs", (ezb)(INSTANCE = new $serializer()), 2);
            descriptor2.k("address", true);
            descriptor2.k("signature", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final dlr a = dlr.a;
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a) };
        }
        
        public NFTWalletConnectContentViewArgs deserialize(final Decoder decoder) {
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
                        n2 = c.n(descriptor, 1, (DeserializationStrategy)dlr.a, n2);
                        n3 |= 0x2;
                    }
                    else {
                        n = c.n(descriptor, 0, (DeserializationStrategy)dlr.a, n);
                        n3 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new NFTWalletConnectContentViewArgs(n3, (String)n, (String)n2, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final NFTWalletConnectContentViewArgs nftWalletConnectContentViewArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)nftWalletConnectContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            NFTWalletConnectContentViewArgs.write$Self(nftWalletConnectContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (NFTWalletConnectContentViewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
