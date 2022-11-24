// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;

public class StartActivity extends vnd
{
    public static final int q1 = 0;
    
    public final void onCreate(final Bundle bundle) {
        x2r.a((Activity)this).a.b((x2r$d)fpo.K0);
        final Intent intent = ((Activity)this).getIntent();
        if (intent != null && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction())) {
            ove.d().f(pbf.b.a);
        }
        super.onCreate(bundle);
        po.b().t();
        this.v0().h();
        if (((mve)((io1)this.n()).B((Class)mve.class)).Y2().a(new Intent())) {
            ove.d().f(pbf.c.a);
        }
        this.finish();
    }
}
