// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.login;

import android.os.Handler;

@a91
public class LoginChallengeCheckDelegate
{
    public String a;
    public final LoginChallengeCheckDelegate.LoginChallengeCheckDelegate$b b;
    public oag c;
    public final Handler d;
    public a e;
    public int f;
    public float g;
    public int h;
    
    public LoginChallengeCheckDelegate() {
        this.b = new LoginChallengeCheckDelegate.LoginChallengeCheckDelegate$b(this);
        this.d = new Handler();
        final int f = dta.b().f("login_challenge_polling_interval", 0);
        this.f = f;
        if (f == 0) {
            this.f = 2;
        }
        this.f *= (int)1000L;
        final float e = dta.b().e("login_challenge_polling_backoff", 0.0f);
        this.g = e;
        if (e == 0.0f) {
            this.g = 1.2f;
        }
    }
    
    public final void a() {
        this.c = null;
        zi.a().e(this.a);
    }
    
    public final void b() {
        final a e = this.e;
        if (e != null) {
            this.d.removeCallbacks((Runnable)e);
            this.e = null;
        }
    }
    
    public final class a implements Runnable
    {
        @Override
        public final void run() {
            final oag c = LoginChallengeCheckDelegate.this.c;
            if (c != null && !c.g4().isFinishing()) {
                LoginChallengeCheckDelegate.this.a = zi.a().d(LoginChallengeCheckDelegate.this.c.q1().a, LoginChallengeCheckDelegate.this.c.q1().b, (x64)LoginChallengeCheckDelegate.this.b);
            }
        }
    }
}
