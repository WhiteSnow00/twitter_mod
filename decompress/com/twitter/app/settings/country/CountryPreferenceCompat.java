// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.country;

import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.View;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import androidx.preference.Preference;

@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b" }, d2 = { "Lcom/twitter/app/settings/country/CountryPreferenceCompat;", "Landroidx/preference/Preference;", "Ldz6$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class CountryPreferenceCompat extends Preference implements a
{
    public cz6 o1;
    public List<? extends wy6> p1;
    public wy6 q1;
    
    public CountryPreferenceCompat(final Context context) {
        czd.f((Object)context, "context");
        this(context, null, 0, 6, null);
    }
    
    public CountryPreferenceCompat(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        this(context, set, 0, 4, null);
    }
    
    public CountryPreferenceCompat(final Context context, final AttributeSet set, int a) {
        czd.f((Object)context, "context");
        super(context, set, a);
        final gdd$b e0 = gdd.E0;
        a = c5j.a;
        czd.e((Object)e0, "empty()");
        this.p1 = (List<? extends wy6>)e0;
        super.h1 = 2131624251;
    }
    
    public CountryPreferenceCompat(final Context context, AttributeSet set, int n, final int n2, final rf8 rf8) {
        if ((n2 & 0x2) != 0x0) {
            set = null;
        }
        if ((n2 & 0x4) != 0x0) {
            n = 0;
        }
        this(context, set, n);
    }
    
    public final void C(final tvk tvk) {
        super.C(tvk);
        final View d0 = ((RecyclerView$c0)tvk).D0;
        if (d0 != null) {
            final TextView textView = (TextView)d0.findViewById(2131428510);
            textView.setText((CharSequence)super.D0.getString(2131957689));
            phf.a(super.D0, (View)textView, 2131959416);
        }
    }
    
    public final void b(final wy6 q1) {
        this.q1 = q1;
        String s = null;
        Label_0034: {
            if (q1 != null) {
                s = q1.E0;
                if (s != null) {
                    break Label_0034;
                }
            }
            s = super.D0.getResources().getString(2131957691);
        }
        this.R((CharSequence)s);
    }
    
    public final void e(final List<? extends wy6> p) {
        this.p1 = p;
    }
}
