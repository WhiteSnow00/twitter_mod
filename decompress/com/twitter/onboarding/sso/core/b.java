// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.sso.core;

import java.util.Collection;
import java.util.HashSet;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class b extends ste implements qsb<GoogleSignInAccount, fzv>
{
    public final qsb<o5c, fzv> D0;
    public final qsb<Exception, fzv> E0;
    
    public b(final qsb<? super o5c, fzv> d0, final qsb<? super Exception, fzv> e0) {
        this.D0 = (qsb<o5c, fzv>)d0;
        this.E0 = (qsb<Exception, fzv>)e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)o;
        final String f0 = googleSignInAccount.F0;
        if (f0 != null) {
            this.D0.invoke((Object)new o5c(f0, googleSignInAccount.J0, mq4.m0((Iterable)new HashSet(googleSignInAccount.M0), (CharSequence)" ", (CharSequence)null, (CharSequence)null, (qsb)a.D0, 30)));
        }
        else {
            this.E0.invoke((Object)new GoogleSsoClientImpl$GoogleSsoException("ID Token is missing from GoogleSignInAccount", (Throwable)null, 2));
        }
        return fzv.a;
    }
}
