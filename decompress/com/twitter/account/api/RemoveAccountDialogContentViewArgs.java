// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.account.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\b\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u001eB-\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%" }, d2 = { "Lcom/twitter/account/api/RemoveAccountDialogContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "", "component2", "accountId", "accountName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "J", "getAccountId", "()J", "Ljava/lang/String;", "getAccountName", "()Ljava/lang/String;", "<init>", "(JLjava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(IJLjava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.account.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class RemoveAccountDialogContentViewArgs implements ContentViewArgs
{
    public static final RemoveAccountDialogContentViewArgs.RemoveAccountDialogContentViewArgs$Companion Companion;
    private final long accountId;
    private final String accountName;
    
    static {
        Companion = new RemoveAccountDialogContentViewArgs.RemoveAccountDialogContentViewArgs$Companion();
    }
    
    public RemoveAccountDialogContentViewArgs() {
        this(0L, null, 3, null);
    }
    
    public RemoveAccountDialogContentViewArgs(final long n) {
        this(n, null, 2, null);
    }
    
    public RemoveAccountDialogContentViewArgs(final long accountId, final String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }
    
    public static final void write$Self(final RemoveAccountDialogContentViewArgs removeAccountDialogContentViewArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)removeAccountDialogContentViewArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = sd6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0056: {
            if (!z) {
                if (removeAccountDialogContentViewArgs.accountId == -1L) {
                    b = false;
                    break Label_0056;
                }
            }
            b = true;
        }
        if (b) {
            sd6.i0(serialDescriptor, 0, removeAccountDialogContentViewArgs.accountId);
        }
        int n2 = 0;
        Label_0100: {
            if (!sd6.z(serialDescriptor)) {
                n2 = n;
                if (removeAccountDialogContentViewArgs.accountName == null) {
                    break Label_0100;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            sd6.x(serialDescriptor, 1, (skp)njr.a, (Object)removeAccountDialogContentViewArgs.accountName);
        }
    }
    
    public final long component1() {
        return this.accountId;
    }
    
    public final String component2() {
        return this.accountName;
    }
    
    public final RemoveAccountDialogContentViewArgs copy(final long n, final String s) {
        return new RemoveAccountDialogContentViewArgs(n, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveAccountDialogContentViewArgs)) {
            return false;
        }
        final RemoveAccountDialogContentViewArgs removeAccountDialogContentViewArgs = (RemoveAccountDialogContentViewArgs)o;
        return this.accountId == removeAccountDialogContentViewArgs.accountId && zzd.a((Object)this.accountName, (Object)removeAccountDialogContentViewArgs.accountName);
    }
    
    public final long getAccountId() {
        return this.accountId;
    }
    
    public final String getAccountName() {
        return this.accountName;
    }
    
    @Override
    public int hashCode() {
        final long accountId = this.accountId;
        final int n = (int)(accountId ^ accountId >>> 32);
        final String accountName = this.accountName;
        int hashCode;
        if (accountName == null) {
            hashCode = 0;
        }
        else {
            hashCode = accountName.hashCode();
        }
        return n * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder h = w48.h("RemoveAccountDialogContentViewArgs(accountId=", this.accountId, ", accountName=", this.accountName);
        h.append(")");
        return h.toString();
    }
}
