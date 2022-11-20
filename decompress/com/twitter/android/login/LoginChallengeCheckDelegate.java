// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.login;

import android.os.Handler;

@v81
public class LoginChallengeCheckDelegate
{
    public String a;
    public final LoginChallengeCheckDelegate.LoginChallengeCheckDelegate$b b;
    public dag c;
    public final Handler d;
    public a e;
    public int f;
    public float g;
    public int h;
    
    public LoginChallengeCheckDelegate() {
        this.b = new LoginChallengeCheckDelegate.LoginChallengeCheckDelegate$b(this);
        this.d = new Handler();
        final int f = asa.b().f("login_challenge_polling_interval", 0);
        this.f = f;
        if (f == 0) {
            this.f = 2;
        }
        this.f *= (int)1000L;
        final float e = asa.b().e("login_challenge_polling_backoff", 0.0f);
        this.g = e;
        if (e == 0.0f) {
            this.g = 1.2f;
        }
    }
    
    public final void a() {
        this.c = null;
        k6e.b().e(this.a);
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
        public final LoginChallengeCheckDelegate D0;
        
        public a(final LoginChallengeCheckDelegate d0) {
            this.D0 = d0;
        }
        
        @Override
        public final void run() {
            final dag c = this.D0.c;
            if (c != null && !c.g4().isFinishing()) {
                this.D0.a = k6e.b().d(this.D0.c.q1().a, this.D0.c.q1().b, (a64)this.D0.b);
            }
        }
    }
}
