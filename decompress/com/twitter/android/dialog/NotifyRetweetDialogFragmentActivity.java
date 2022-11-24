// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.dialog;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment$InstantiationException;
import java.util.ArrayList;
import android.os.Parcelable;
import android.content.Intent;
import android.os.Bundle;

public class NotifyRetweetDialogFragmentActivity extends uw8 implements fkj
{
    public final void V() {
    }
    
    public final void b0(final hp6 hp6, final boolean b) {
    }
    
    public final void d0(Bundle bundle) {
        final long long1 = ((BaseBundle)bundle).getLong("sb_account_id");
        final Intent intent = (Intent)bundle.getParcelable("retweet_service_intent");
        final hp6 hp6 = (hp6)bundle.getParcelable("tweet");
        final int q2 = a0j.q2;
        bundle = new Bundle();
        ((BaseBundle)bundle).putInt("twitter:id", 0);
        bundle.putBoolean("undo", false);
        final int a = o5j.a;
        bundle.putParcelable("tweet", (Parcelable)hp6);
        ((BaseBundle)bundle).putLong("user_id", long1);
        bundle.putBoolean("add_main", true);
        final ArrayList list = new ArrayList(3);
        final ArrayList list2 = new ArrayList(3);
        list.add(((Context)this).getString(2131959222));
        list2.add(0);
        list.add(((Context)this).getString(2131957182));
        list2.add(1);
        bundle.putIntegerArrayList("actions", list2);
        bundle.putCharSequenceArray("items", (CharSequence[])list.toArray(new CharSequence[list.size()]));
        bundle.putParcelable("retweet_service_intent", (Parcelable)intent);
        if (((BaseBundle)bundle).containsKey("twitter:id")) {
            final a0j a0j = new a0j();
            ((Fragment)a0j).N1(bundle);
            ((bl1)a0j).e2(((dob)this).P(), (String)null);
            return;
        }
        throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
    }
    
    public final void l(final long n, final hp6 hp6) {
        final Bundle extras = ((Activity)this).getIntent().getExtras();
        if (extras != null) {
            m58.m().C2().b(extras);
            m58.m().C2().c(extras);
        }
        ((Activity)this).finish();
    }
    
    public final void l0(final hp6 hp6, final boolean b) {
        ((Activity)this).finish();
    }
    
    public final void w(final hp6 hp6, final boolean b) {
        ((Activity)this).finish();
    }
}
