// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.settings.country;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

@a91
public class CountryListContentViewProvider extends kcv implements a$a
{
    public c07 Z0;
    public final a a1;
    
    public CountryListContentViewProvider(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final p p23, final fda<fo> fda2, final duo duo, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        duo.b(this);
        final Fragment h = p23.H("countries_fragment");
        if (h != null) {
            this.a1 = (a)h;
        }
        else {
            final a a1 = new a();
            this.a1 = a1;
            final androidx.fragment.app.a a2 = new androidx.fragment.app.a(p23);
            a2.e(2131429268, (Fragment)a1, "countries_fragment", 1);
            a2.c();
        }
        this.a1.e2 = (a$a)this;
        f.i(fda2.v0(), (fa3)new h3((Object)this, 5));
        f.i(k9x.b(), (fa3)new jg1((Object)this, 5));
    }
}
