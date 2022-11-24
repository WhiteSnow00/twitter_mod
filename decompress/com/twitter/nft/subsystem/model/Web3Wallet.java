// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.model;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@bmp
@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B!\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b \u0010!B9\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006(" }, d2 = { "Lcom/twitter/nft/subsystem/model/Web3Wallet;", "Lcom/twitter/nft/subsystem/model/VerifyWalletResponse;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "component2", "Lcom/twitter/nft/subsystem/model/Network;", "component3", "nickname", "address", "network", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", "getAddress", "Lcom/twitter/nft/subsystem/model/Network;", "getNetwork", "()Lcom/twitter/nft/subsystem/model/Network;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/twitter/nft/subsystem/model/Network;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/twitter/nft/subsystem/model/Network;Ldmp;)V", "Companion", "$serializer", "subsystem.tfa.nft.model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Web3Wallet extends VerifyWalletResponse
{
    public static final Web3Wallet.Web3Wallet$Companion Companion;
    private final String address;
    private final Network network;
    private final String nickname;
    
    static {
        Companion = new Web3Wallet.Web3Wallet$Companion();
    }
    
    public Web3Wallet(final int n, final String nickname, final String address, final Network network, final dmp dmp) {
        if (0x7 == (n & 0x7)) {
            super(n, (dmp)null);
            this.nickname = nickname;
            this.address = address;
            this.network = network;
            return;
        }
        shw.V0(n, 7, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public Web3Wallet(final String nickname, final String address, final Network network) {
        e0e.f((Object)address, "address");
        e0e.f((Object)network, "network");
        super((wg8)null);
        this.nickname = nickname;
        this.address = address;
        this.network = network;
    }
    
    public static Web3Wallet copy$default(final Web3Wallet web3Wallet, String nickname, String address, Network network, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            nickname = web3Wallet.nickname;
        }
        if ((n & 0x2) != 0x0) {
            address = web3Wallet.address;
        }
        if ((n & 0x4) != 0x0) {
            network = web3Wallet.network;
        }
        return web3Wallet.copy(nickname, address, network);
    }
    
    public static final void write$Self(final Web3Wallet web3Wallet, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)web3Wallet, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        VerifyWalletResponse.write$Self((VerifyWalletResponse)web3Wallet, ee6, serialDescriptor);
        ee6.y(serialDescriptor, 0, (fmp)dlr.a, (Object)web3Wallet.nickname);
        ee6.S(serialDescriptor, 1, web3Wallet.address);
        ee6.T(serialDescriptor, 2, (fmp)Network.$serializer.INSTANCE, (Object)web3Wallet.network);
    }
    
    public final String component1() {
        return this.nickname;
    }
    
    public final String component2() {
        return this.address;
    }
    
    public final Network component3() {
        return this.network;
    }
    
    public final Web3Wallet copy(final String s, final String s2, final Network network) {
        e0e.f((Object)s2, "address");
        e0e.f((Object)network, "network");
        return new Web3Wallet(s, s2, network);
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Web3Wallet)) {
            return false;
        }
        final Web3Wallet web3Wallet = (Web3Wallet)o;
        return e0e.a((Object)this.nickname, (Object)web3Wallet.nickname) && e0e.a((Object)this.address, (Object)web3Wallet.address) && this.network == web3Wallet.network;
    }
    
    public final String getAddress() {
        return this.address;
    }
    
    public final Network getNetwork() {
        return this.network;
    }
    
    public final String getNickname() {
        return this.nickname;
    }
    
    public int hashCode() {
        final String nickname = this.nickname;
        int hashCode;
        if (nickname == null) {
            hashCode = 0;
        }
        else {
            hashCode = nickname.hashCode();
        }
        return this.network.hashCode() + brg.d(this.address, hashCode * 31, 31);
    }
    
    public String toString() {
        final String nickname = this.nickname;
        final String address = this.address;
        final Network network = this.network;
        final StringBuilder k = l58.k("Web3Wallet(nickname=", nickname, ", address=", address, ", network=");
        k.append(network);
        k.append(")");
        return k.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/nft/subsystem/model/Web3Wallet.$serializer", "Lezb;", "Lcom/twitter/nft/subsystem/model/Web3Wallet;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.nft.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<Web3Wallet>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.nft.subsystem.model.Web3Wallet", (ezb)(INSTANCE = new $serializer()), 3);
            descriptor2.k("nickname", false);
            descriptor2.k("address", false);
            descriptor2.k("network", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final dlr a = dlr.a;
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.e((KSerializer)a), (KSerializer)a, (KSerializer)Network.$serializer.INSTANCE };
        }
        
        public Web3Wallet deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object x = null;
            Object n = null;
            String m = null;
            int n2 = 0;
            int i = 1;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                throw new UnknownFieldException(o);
                            }
                            x = c.x(descriptor, 2, (DeserializationStrategy)Network.$serializer.INSTANCE, x);
                            n2 |= 0x4;
                        }
                        else {
                            m = c.m(descriptor, 1);
                            n2 |= 0x2;
                        }
                    }
                    else {
                        n = c.n(descriptor, 0, (DeserializationStrategy)dlr.a, n);
                        n2 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new Web3Wallet(n2, (String)n, m, (Network)x, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final Web3Wallet web3Wallet) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)web3Wallet, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            Web3Wallet.write$Self(web3Wallet, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (Web3Wallet)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
