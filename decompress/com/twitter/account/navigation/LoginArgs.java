// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.account.navigation;

import kotlinx.serialization.descriptors.SerialDescriptor;
import android.os.Parcelable;
import java.util.Objects;
import android.content.Intent;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B7\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b#\u0010$BI\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0017\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u0010\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0013\u0010\u001dR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006+" }, d2 = { "Lcom/twitter/account/navigation/LoginArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "", "component2", "component3", "component4", "component5", "isAddAccount", "username", "password", "isAuthorizeAccount", "accountAuthenticatorResponseKey", "copy", "toString", "", "hashCode", "", "other", "equals", "Z", "()Z", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "getPassword", "getAccountAuthenticatorResponseKey", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.account.api_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class LoginArgs implements ContentViewArgs
{
    public static final LoginArgs.LoginArgs$Companion Companion;
    private static final String EXTRA_INTENT = "login_args:extra_intent";
    private final String accountAuthenticatorResponseKey = accountAuthenticatorResponseKey;
    private final boolean isAddAccount = isAddAccount;
    private final boolean isAuthorizeAccount = isAuthorizeAccount;
    private final String password = password;
    private final String username = username;
    
    static {
        Companion = new LoginArgs.LoginArgs$Companion();
    }
    
    private LoginArgs(final boolean isAddAccount, final String username, final String password, final boolean isAuthorizeAccount, final String accountAuthenticatorResponseKey) {
        this.isAddAccount = isAddAccount;
        this.username = username;
        this.password = password;
        this.isAuthorizeAccount = isAuthorizeAccount;
        this.accountAuthenticatorResponseKey = accountAuthenticatorResponseKey;
    }
    
    public static final Intent attachExtraIntent(final Intent intent, final Intent intent2) {
        Objects.requireNonNull(LoginArgs.Companion);
        zzd.f((Object)intent, "<this>");
        intent.putExtra("login_args:extra_intent", (Parcelable)intent2);
        return intent;
    }
    
    public static final Intent extractExtraIntent(final Intent intent) {
        Objects.requireNonNull(LoginArgs.Companion);
        zzd.f((Object)intent, "<this>");
        return (Intent)intent.getParcelableExtra("login_args:extra_intent");
    }
    
    public static final boolean hasExtraIntent(final Intent intent) {
        Objects.requireNonNull(LoginArgs.Companion);
        zzd.f((Object)intent, "<this>");
        return intent.hasExtra("login_args:extra_intent");
    }
    
    public static final void write$Self(final LoginArgs loginArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)loginArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.R(serialDescriptor, 0, loginArgs.isAddAccount);
        final njr a = njr.a;
        sd6.x(serialDescriptor, 1, (skp)a, (Object)loginArgs.username);
        sd6.x(serialDescriptor, 2, (skp)a, (Object)loginArgs.password);
        sd6.R(serialDescriptor, 3, loginArgs.isAuthorizeAccount);
        sd6.x(serialDescriptor, 4, (skp)a, (Object)loginArgs.accountAuthenticatorResponseKey);
    }
    
    public final boolean component1() {
        return this.isAddAccount;
    }
    
    public final String component2() {
        return this.username;
    }
    
    public final String component3() {
        return this.password;
    }
    
    public final boolean component4() {
        return this.isAuthorizeAccount;
    }
    
    public final String component5() {
        return this.accountAuthenticatorResponseKey;
    }
    
    public final LoginArgs copy(final boolean b, final String s, final String s2, final boolean b2, final String s3) {
        return new LoginArgs(b, s, s2, b2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoginArgs)) {
            return false;
        }
        final LoginArgs loginArgs = (LoginArgs)o;
        return this.isAddAccount == loginArgs.isAddAccount && zzd.a((Object)this.username, (Object)loginArgs.username) && zzd.a((Object)this.password, (Object)loginArgs.password) && this.isAuthorizeAccount == loginArgs.isAuthorizeAccount && zzd.a((Object)this.accountAuthenticatorResponseKey, (Object)loginArgs.accountAuthenticatorResponseKey);
    }
    
    public final String getAccountAuthenticatorResponseKey() {
        return this.accountAuthenticatorResponseKey;
    }
    
    public final String getPassword() {
        return this.password;
    }
    
    public final String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int isAddAccount = this.isAddAccount ? 1 : 0;
        int n = 1;
        int n2 = isAddAccount;
        if (isAddAccount != 0) {
            n2 = 1;
        }
        final String username = this.username;
        int hashCode = 0;
        int hashCode2;
        if (username == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = username.hashCode();
        }
        final String password = this.password;
        int hashCode3;
        if (password == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = password.hashCode();
        }
        final int isAuthorizeAccount = this.isAuthorizeAccount ? 1 : 0;
        if (isAuthorizeAccount == 0) {
            n = isAuthorizeAccount;
        }
        final String accountAuthenticatorResponseKey = this.accountAuthenticatorResponseKey;
        if (accountAuthenticatorResponseKey != null) {
            hashCode = accountAuthenticatorResponseKey.hashCode();
        }
        return (((n2 * 31 + hashCode2) * 31 + hashCode3) * 31 + n) * 31 + hashCode;
    }
    
    public final boolean isAddAccount() {
        return this.isAddAccount;
    }
    
    public final boolean isAuthorizeAccount() {
        return this.isAuthorizeAccount;
    }
    
    @Override
    public String toString() {
        final boolean isAddAccount = this.isAddAccount;
        final String username = this.username;
        final String password = this.password;
        final boolean isAuthorizeAccount = this.isAuthorizeAccount;
        final String accountAuthenticatorResponseKey = this.accountAuthenticatorResponseKey;
        final StringBuilder s = b8b.s("LoginArgs(isAddAccount=", isAddAccount, ", username=", username, ", password=");
        mag.n(s, password, ", isAuthorizeAccount=", isAuthorizeAccount, ", accountAuthenticatorResponseKey=");
        return hi.I(s, accountAuthenticatorResponseKey, ")");
    }
}
