// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.violations;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/twitter/android/verification/violations/VerificationPolicyViolationsActivity;", "Lvnd;", "<init>", "()V", "feature.tfa.verification.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class VerificationPolicyViolationsActivity extends vnd
{
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (((dob)this).P().H("verification.policy.violations.frag.tag") == null) {
            final a a = new a(((dob)this).P());
            a.e(0, (Fragment)new dsw(), "verification.policy.violations.frag.tag", 1);
            a.c();
        }
    }
}
