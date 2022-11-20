// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.account.changepassword;

import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bB'\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\"" }, d2 = { "Lcom/twitter/app/account/changepassword/ChangePasswordContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lcom/twitter/util/user/UserIdentifier;", "component1", "accountId", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/util/user/UserIdentifier;", "getAccountId", "()Lcom/twitter/util/user/UserIdentifier;", "getAccountId$annotations", "()V", "<init>", "(Lcom/twitter/util/user/UserIdentifier;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILcom/twitter/util/user/UserIdentifier;Lhlp;)V", "Companion", "$serializer", "feature.tfa.account.change-password.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class ChangePasswordContentViewArgs implements ContentViewArgs
{
    public static final ChangePasswordContentViewArgs.ChangePasswordContentViewArgs$Companion Companion;
    private final UserIdentifier accountId;
    
    static {
        Companion = new ChangePasswordContentViewArgs.ChangePasswordContentViewArgs$Companion();
    }
    
    public ChangePasswordContentViewArgs(final int n, @flp(with = jcw.class) final UserIdentifier accountId, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            this.accountId = accountId;
            return;
        }
        blz.a0(n, 1, ChangePasswordContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public ChangePasswordContentViewArgs(final UserIdentifier accountId) {
        czd.f((Object)accountId, "accountId");
        this.accountId = accountId;
    }
    
    public static ChangePasswordContentViewArgs copy$default(final ChangePasswordContentViewArgs changePasswordContentViewArgs, UserIdentifier accountId, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            accountId = changePasswordContentViewArgs.accountId;
        }
        return changePasswordContentViewArgs.copy(accountId);
    }
    
    @flp(with = jcw.class)
    public static void getAccountId$annotations() {
    }
    
    public static final void write$Self(final ChangePasswordContentViewArgs changePasswordContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)changePasswordContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        xc6.T(serialDescriptor, 0, (jlp)jcw.b, (Object)changePasswordContentViewArgs.accountId);
    }
    
    public final UserIdentifier component1() {
        return this.accountId;
    }
    
    public final ChangePasswordContentViewArgs copy(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "accountId");
        return new ChangePasswordContentViewArgs(userIdentifier);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ChangePasswordContentViewArgs && czd.a((Object)this.accountId, (Object)((ChangePasswordContentViewArgs)o).accountId));
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
}
