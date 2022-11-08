// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.account.changepassword;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bB'\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\"" }, d2 = { "Lcom/twitter/app/account/changepassword/ChangePasswordContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "Lcom/twitter/util/user/UserIdentifier;", "component1", "accountId", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/util/user/UserIdentifier;", "getAccountId", "()Lcom/twitter/util/user/UserIdentifier;", "getAccountId$annotations", "()V", "<init>", "(Lcom/twitter/util/user/UserIdentifier;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILcom/twitter/util/user/UserIdentifier;Lqkp;)V", "Companion", "$serializer", "feature.tfa.account.change-password.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class ChangePasswordContentViewArgs implements ContentViewArgs
{
    public static final ChangePasswordContentViewArgs.ChangePasswordContentViewArgs$Companion Companion;
    private final UserIdentifier accountId = accountId;
    
    static {
        Companion = new ChangePasswordContentViewArgs.ChangePasswordContentViewArgs$Companion();
    }
    
    public ChangePasswordContentViewArgs(final UserIdentifier accountId) {
        zzd.f((Object)accountId, "accountId");
        this.accountId = accountId;
    }
    
    public static final void write$Self(final ChangePasswordContentViewArgs changePasswordContentViewArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)changePasswordContentViewArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.T(serialDescriptor, 0, (skp)ybw.b, (Object)changePasswordContentViewArgs.accountId);
    }
    
    public final UserIdentifier component1() {
        return this.accountId;
    }
    
    public final ChangePasswordContentViewArgs copy(final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "accountId");
        return new ChangePasswordContentViewArgs(userIdentifier);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ChangePasswordContentViewArgs && zzd.a((Object)this.accountId, (Object)((ChangePasswordContentViewArgs)o).accountId));
    }
    
    public final UserIdentifier getAccountId() {
        return this.accountId;
    }
    
    @Override
    public int hashCode() {
        return this.accountId.hashCode();
    }
    
    @Override
    public String toString() {
        final UserIdentifier accountId = this.accountId;
        final StringBuilder sb = new StringBuilder();
        sb.append("ChangePasswordContentViewArgs(accountId=");
        sb.append(accountId);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/app/account/changepassword/ChangePasswordContentViewArgs.$serializer", "Ldzb;", "Lcom/twitter/app/account/changepassword/ChangePasswordContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "feature.tfa.account.change-password.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<ChangePasswordContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.app.account.changepassword.ChangePasswordContentViewArgs", (dzb)(INSTANCE = new $serializer()), 1);
            descriptor2.k("accountId", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)ybw.b };
        }
        
        public ChangePasswordContentViewArgs deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            int i = 1;
            Object x = null;
            int n = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        throw new UnknownFieldException(o);
                    }
                    x = c.x(descriptor, 0, (DeserializationStrategy)ybw.b, x);
                    n |= 0x1;
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new ChangePasswordContentViewArgs(n, (UserIdentifier)x, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final ChangePasswordContentViewArgs changePasswordContentViewArgs) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)changePasswordContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            ChangePasswordContentViewArgs.write$Self(changePasswordContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
}
