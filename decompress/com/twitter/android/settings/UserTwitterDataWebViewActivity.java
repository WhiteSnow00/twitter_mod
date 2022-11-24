// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.settings;

import android.net.Uri;
import android.content.Intent;
import android.content.Context;

public class UserTwitterDataWebViewActivity extends vnd
{
    public static Intent d0(final Context context) {
        return new Intent(context, (Class)UserTwitterDataWebViewActivity.class).setData(Uri.parse(context.getString(2131959664)));
    }
}
