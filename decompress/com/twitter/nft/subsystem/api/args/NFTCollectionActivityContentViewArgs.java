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
@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B5\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b!\u0010\"BA\b\u0017\u0012\u0006\u0010#\u001a\u00020\u0015\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J7\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\rH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006)" }, d2 = { "Lcom/twitter/nft/subsystem/api/args/NFTCollectionActivityContentViewArgs;", "", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "component2", "component3", "", "component4", "address", "name", "slug", "shouldShowAvatarPicker", "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "getName", "getSlug", "Z", "getShouldShowAvatarPicker", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTCollectionActivityContentViewArgs implements ContentViewArgs
{
    public static final NFTCollectionActivityContentViewArgs.NFTCollectionActivityContentViewArgs$Companion Companion;
    private final String address;
    private final String name;
    private final boolean shouldShowAvatarPicker;
    private final String slug;
    
    static {
        Companion = new NFTCollectionActivityContentViewArgs.NFTCollectionActivityContentViewArgs$Companion();
    }
    
    public NFTCollectionActivityContentViewArgs() {
        this(null, null, null, false, 15, null);
    }
    
    public NFTCollectionActivityContentViewArgs(final int n, final String address, final String name, final String slug, final boolean shouldShowAvatarPicker, final dmp dmp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.address = null;
            }
            else {
                this.address = address;
            }
            if ((n & 0x2) == 0x0) {
                this.name = null;
            }
            else {
                this.name = name;
            }
            if ((n & 0x4) == 0x0) {
                this.slug = null;
            }
            else {
                this.slug = slug;
            }
            if ((n & 0x8) == 0x0) {
                this.shouldShowAvatarPicker = false;
            }
            else {
                this.shouldShowAvatarPicker = shouldShowAvatarPicker;
            }
            return;
        }
        shw.V0(n, 0, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public NFTCollectionActivityContentViewArgs(final String address, final String name, final String slug, final boolean shouldShowAvatarPicker) {
        this.address = address;
        this.name = name;
        this.slug = slug;
        this.shouldShowAvatarPicker = shouldShowAvatarPicker;
    }
    
    public NFTCollectionActivityContentViewArgs(String s, String s2, String s3, boolean b, final int n, final wg8 wg8) {
        if ((n & 0x1) != 0x0) {
            s = null;
        }
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        if ((n & 0x4) != 0x0) {
            s3 = null;
        }
        if ((n & 0x8) != 0x0) {
            b = false;
        }
        this(s, s2, s3, b);
    }
    
    public static NFTCollectionActivityContentViewArgs copy$default(final NFTCollectionActivityContentViewArgs nftCollectionActivityContentViewArgs, String address, String name, String slug, boolean shouldShowAvatarPicker, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            address = nftCollectionActivityContentViewArgs.address;
        }
        if ((n & 0x2) != 0x0) {
            name = nftCollectionActivityContentViewArgs.name;
        }
        if ((n & 0x4) != 0x0) {
            slug = nftCollectionActivityContentViewArgs.slug;
        }
        if ((n & 0x8) != 0x0) {
            shouldShowAvatarPicker = nftCollectionActivityContentViewArgs.getShouldShowAvatarPicker();
        }
        return nftCollectionActivityContentViewArgs.copy(address, name, slug, shouldShowAvatarPicker);
    }
    
    public static final void write$Self(final NFTCollectionActivityContentViewArgs nftCollectionActivityContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)nftCollectionActivityContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        final boolean z = ee6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (nftCollectionActivityContentViewArgs.address == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            ee6.y(serialDescriptor, 0, (fmp)dlr.a, (Object)nftCollectionActivityContentViewArgs.address);
        }
        boolean b2 = false;
        Label_0098: {
            if (!ee6.z(serialDescriptor)) {
                if (nftCollectionActivityContentViewArgs.name == null) {
                    b2 = false;
                    break Label_0098;
                }
            }
            b2 = true;
        }
        if (b2) {
            ee6.y(serialDescriptor, 1, (fmp)dlr.a, (Object)nftCollectionActivityContentViewArgs.name);
        }
        boolean b3 = false;
        Label_0144: {
            if (!ee6.z(serialDescriptor)) {
                if (nftCollectionActivityContentViewArgs.slug == null) {
                    b3 = false;
                    break Label_0144;
                }
            }
            b3 = true;
        }
        if (b3) {
            ee6.y(serialDescriptor, 2, (fmp)dlr.a, (Object)nftCollectionActivityContentViewArgs.slug);
        }
        int n2 = 0;
        Label_0188: {
            if (!ee6.z(serialDescriptor)) {
                n2 = n;
                if (!nftCollectionActivityContentViewArgs.getShouldShowAvatarPicker()) {
                    break Label_0188;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            ee6.R(serialDescriptor, 3, nftCollectionActivityContentViewArgs.getShouldShowAvatarPicker());
        }
    }
    
    public final String component1() {
        return this.address;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.slug;
    }
    
    public final boolean component4() {
        return this.getShouldShowAvatarPicker();
    }
    
    public final NFTCollectionActivityContentViewArgs copy(final String s, final String s2, final String s3, final boolean b) {
        return new NFTCollectionActivityContentViewArgs(s, s2, s3, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NFTCollectionActivityContentViewArgs)) {
            return false;
        }
        final NFTCollectionActivityContentViewArgs nftCollectionActivityContentViewArgs = (NFTCollectionActivityContentViewArgs)o;
        return e0e.a((Object)this.address, (Object)nftCollectionActivityContentViewArgs.address) && e0e.a((Object)this.name, (Object)nftCollectionActivityContentViewArgs.name) && e0e.a((Object)this.slug, (Object)nftCollectionActivityContentViewArgs.slug) && this.getShouldShowAvatarPicker() == nftCollectionActivityContentViewArgs.getShouldShowAvatarPicker();
    }
    
    public final String getAddress() {
        return this.address;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public boolean getShouldShowAvatarPicker() {
        return this.shouldShowAvatarPicker;
    }
    
    public final String getSlug() {
        return this.slug;
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
        final String name = this.name;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final String slug = this.slug;
        if (slug != null) {
            hashCode = slug.hashCode();
        }
        int shouldShowAvatarPicker;
        if ((shouldShowAvatarPicker = (this.getShouldShowAvatarPicker() ? 1 : 0)) != 0) {
            shouldShowAvatarPicker = 1;
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31 + shouldShowAvatarPicker;
    }
    
    @Override
    public String toString() {
        final String address = this.address;
        final String name = this.name;
        final String slug = this.slug;
        final boolean shouldShowAvatarPicker = this.getShouldShowAvatarPicker();
        final StringBuilder k = l58.k("NFTCollectionActivityContentViewArgs(address=", address, ", name=", name, ", slug=");
        k.append(slug);
        k.append(", shouldShowAvatarPicker=");
        k.append(shouldShowAvatarPicker);
        k.append(")");
        return k.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/nft/subsystem/api/args/NFTCollectionActivityContentViewArgs.$serializer", "Lezb;", "Lcom/twitter/nft/subsystem/api/args/NFTCollectionActivityContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<NFTCollectionActivityContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.nft.subsystem.api.args.NFTCollectionActivityContentViewArgs", (ezb)(INSTANCE = new $serializer()), 4);
            descriptor2.k("address", true);
            descriptor2.k("name", true);
            descriptor2.k("slug", true);
            descriptor2.k("shouldShowAvatarPicker", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final dlr a = dlr.a;
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a), (KSerializer)p72.a };
        }
        
        public NFTCollectionActivityContentViewArgs deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            Object n2 = null;
            Object n3 = null;
            int i = 1;
            int n4 = 0;
            boolean b = false;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                if (o != 3) {
                                    throw new UnknownFieldException(o);
                                }
                                b = c.B(descriptor, 3);
                                n4 |= 0x8;
                            }
                            else {
                                n3 = c.n(descriptor, 2, (DeserializationStrategy)dlr.a, n3);
                                n4 |= 0x4;
                            }
                        }
                        else {
                            n2 = c.n(descriptor, 1, (DeserializationStrategy)dlr.a, n2);
                            n4 |= 0x2;
                        }
                    }
                    else {
                        n = c.n(descriptor, 0, (DeserializationStrategy)dlr.a, n);
                        n4 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new NFTCollectionActivityContentViewArgs(n4, (String)n, (String)n2, (String)n3, b, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final NFTCollectionActivityContentViewArgs nftCollectionActivityContentViewArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)nftCollectionActivityContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            NFTCollectionActivityContentViewArgs.write$Self(nftCollectionActivityContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (NFTCollectionActivityContentViewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
